package com.example.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import com.example.data.local.AppDatabase;
import com.example.data.local.ChatMessageDao;
import com.example.data.local.UserDao;
import com.example.data.model.ChatGroup;
import com.example.data.model.ChatMessage;
import com.example.data.model.ChatModelKt;
import com.example.data.model.UserProfile;
import com.example.data.model.UserRole;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AuthAndChatRepository.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010'J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0)0\u00182\u0006\u0010-\u001a\u00020\u001fJ\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0)0\u0018J\u000e\u0010/\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010'J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0086@¢\u0006\u0004\b3\u0010'J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d012\u0006\u00105\u001a\u000206H\u0082@¢\u0006\u0004\b7\u00108JF\u00109\u001a\b\u0012\u0004\u0012\u00020\u001d012\u0006\u0010-\u001a\u00020\u001f2\b\u0010:\u001a\u0004\u0018\u00010\u00192\u0006\u0010;\u001a\u00020\u001f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010=\u001a\u00020>H\u0086@¢\u0006\u0004\b?\u0010@JD\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001d012\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u001f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010=\u001a\u00020>H\u0086@¢\u0006\u0004\bB\u0010@J(\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001d012\u0006\u0010D\u001a\u00020E2\b\u0010:\u001a\u0004\u0018\u00010\u0019H\u0086@¢\u0006\u0004\bF\u0010GJ\u0016\u0010H\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020EH\u0086@¢\u0006\u0002\u0010IJ\u0010\u0010J\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006M"}, d2 = {"Lcom/example/data/repository/AuthAndChatRepository;", "", "db", "Lcom/example/data/local/AppDatabase;", "<init>", "(Lcom/example/data/local/AppDatabase;)V", "userDao", "Lcom/example/data/local/UserDao;", "chatDao", "Lcom/example/data/local/ChatMessageDao;", "_syncStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/data/repository/CloudSyncStatus;", "syncStatusFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getSyncStatusFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "syncMutex", "Lkotlinx/coroutines/sync/Mutex;", "httpClient", "Lokhttp3/OkHttpClient;", "activeUserFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/data/model/UserProfile;", "getActiveUserFlow", "()Lkotlinx/coroutines/flow/Flow;", "loginWithPhone", "", "phone", "", "fullName", "role", "Lcom/example/data/model/UserRole;", "adminDesignation", "mosqueAffiliation", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/data/model/UserRole;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatGroups", "", "Lcom/example/data/model/ChatGroup;", "getMessagesFlow", "Lcom/example/data/model/ChatMessage;", "groupId", "getAllAdminMessagesFlow", "checkAndSeedInitialMessages", "syncWithCloud", "Lkotlin/Result;", "", "syncWithCloud-IoAF18A", "uploadMessageToCloud", "entity", "Lcom/example/data/local/ChatMessageEntity;", "uploadMessageToCloud-gIAlu-s", "(Lcom/example/data/local/ChatMessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postMessage", "user", "text", "tag", "isPinned", "", "postMessage-hUnOzRk", "(Ljava/lang/String;Lcom/example/data/model/UserProfile;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAdminMessage", "postAdminMessage-hUnOzRk", "deleteMessage", "id", "", "deleteMessage-0E7RQCE", "(JLcom/example/data/model/UserProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addReaction", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatSriLankaPhone", "raw", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthAndChatRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,441:1\n49#2:442\n51#2:446\n49#2:447\n51#2:451\n49#2:452\n51#2:456\n46#3:443\n51#3:445\n46#3:448\n51#3:450\n46#3:453\n51#3:455\n105#4:444\n105#4:449\n105#4:454\n774#5:457\n865#5,2:458\n1563#5:460\n1634#5,3:461\n1#6:464\n1088#7,2:465\n434#7:467\n507#7,5:468\n*S KotlinDebug\n*F\n+ 1 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository\n*L\n60#1:442\n60#1:446\n100#1:447\n100#1:451\n121#1:452\n121#1:456\n60#1:443\n60#1:445\n100#1:448\n100#1:450\n121#1:453\n121#1:455\n60#1:444\n100#1:449\n121#1:454\n160#1:457\n160#1:458,2\n162#1:460\n162#1:461,3\n429#1:465,2\n432#1:467\n432#1:468,5\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository.dex */
public final class AuthAndChatRepository {

    @NotNull
    private static final String REGISTRY_URL = "https://api.restful-api.dev/objects/ff808181a09d98f701a0d23934bc04f0";

    @NotNull
    private static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36";

    @NotNull
    private final MutableStateFlow<CloudSyncStatus> _syncStatus;

    @NotNull
    private final Flow<UserProfile> activeUserFlow;

    @NotNull
    private final ChatMessageDao chatDao;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final AppDatabase db;

    @NotNull
    private final OkHttpClient httpClient;

    @NotNull
    private final Mutex syncMutex;

    @NotNull
    private final StateFlow<CloudSyncStatus> syncStatusFlow;

    @NotNull
    private final UserDao userDao;
    public static final int $stable = 8;

    public AuthAndChatRepository(@NotNull AppDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
        this.userDao = this.db.userDao();
        this.chatDao = this.db.chatMessageDao();
        this._syncStatus = StateFlowKt.MutableStateFlow(new CloudSyncStatus(false, 0L, 0, null, 15, null));
        this.syncStatusFlow = FlowKt.asStateFlow(this._syncStatus);
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.syncMutex = MutexKt.Mutex$default(false, 1, (Object) null);
        this.httpClient = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).readTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).build();
        final Flow activeUser = this.userDao.getActiveUser();
        this.activeUserFlow = new Flow<UserProfile>() { // from class: com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository\n*L\n1#1,49:1\n50#2:50\n61#3,10:51\n*E\n"})
            /* renamed from: com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$special$$inlined$map$1$2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
                @DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1$2", f = "AuthAndChatRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$special$$inlined$map$1$2$1.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, (Continuation) this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
                    /*
                        r21 = this;
                        r0 = r21
                        r1 = r23
                        boolean r2 = r1 instanceof com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r2 == 0) goto L18
                        r2 = r1
                        com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1$2$1 r2 = (com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r2
                        int r3 = r2.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r3 & r4
                        if (r3 == 0) goto L18
                        int r3 = r2.label
                        int r3 = r3 - r4
                        r2.label = r3
                        goto L1d
                    L18:
                        com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1$2$1 r2 = new com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1$2$1
                        r2.<init>(r1)
                    L1d:
                        java.lang.Object r3 = r2.result
                        java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r5 = r2.label
                        switch(r5) {
                            case 0: goto L42;
                            case 1: goto L30;
                            default: goto L28;
                        }
                    L28:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L30:
                        int r4 = r2.I$0
                        java.lang.Object r5 = r2.L$3
                        kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                        java.lang.Object r6 = r2.L$2
                        java.lang.Object r7 = r2.L$1
                        com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1$2$1 r7 = (com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                        java.lang.Object r8 = r2.L$0
                        kotlin.ResultKt.throwOnFailure(r3)
                        goto Lad
                    L42:
                        kotlin.ResultKt.throwOnFailure(r3)
                        kotlinx.coroutines.flow.FlowCollector r5 = r0.$this_unsafeFlow
                        r7 = r2
                        r6 = r22
                        r8 = 0
                        r9 = r2
                        kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                        r10 = r6
                        com.example.data.local.UserEntity r10 = (com.example.data.local.UserEntity) r10
                        r11 = 0
                        if (r10 == 0) goto L84
                        r12 = r10
                        r13 = 0
                        com.example.data.model.UserProfile r14 = new com.example.data.model.UserProfile
                        java.lang.String r15 = r12.getPhoneNumber()
                        java.lang.String r16 = r12.getFullName()
                        java.lang.String r0 = r12.getRole()
                        java.lang.String r1 = "ADMIN"
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                        if (r0 == 0) goto L6f
                        com.example.data.model.UserRole r0 = com.example.data.model.UserRole.ADMIN
                        goto L71
                    L6f:
                        com.example.data.model.UserRole r0 = com.example.data.model.UserRole.MEMBER
                    L71:
                        r17 = r0
                        java.lang.String r18 = r12.getAdminDesignation()
                        java.lang.String r19 = r12.getMosqueAffiliation()
                        boolean r20 = r12.isLoggedIn()
                        r14.<init>(r15, r16, r17, r18, r19, r20)
                        goto L85
                    L84:
                        r14 = 0
                    L85:
                        java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
                        r2.L$0 = r0
                        java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r2.L$1 = r0
                        java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
                        r2.L$2 = r0
                        java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                        r2.L$3 = r0
                        r2.I$0 = r8
                        r0 = 1
                        r2.label = r0
                        java.lang.Object r0 = r5.emit(r14, r2)
                        if (r0 != r4) goto Laa
                        return r4
                    Laa:
                        r4 = r8
                        r8 = r22
                    Lad:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public Object collect(FlowCollector collector, Continuation $completion) {
                Object collect = activeUser.collect(new AnonymousClass2(collector), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public final StateFlow<CloudSyncStatus> getSyncStatusFlow() {
        return this.syncStatusFlow;
    }

    @NotNull
    public final Flow<UserProfile> getActiveUserFlow() {
        return this.activeUserFlow;
    }

    public static /* synthetic */ Object loginWithPhone$default(AuthAndChatRepository authAndChatRepository, String str, String str2, UserRole userRole, String str3, String str4, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return authAndChatRepository.loginWithPhone(str, str2, userRole, str3, str4, continuation);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0025. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loginWithPhone(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull com.example.data.model.UserRole r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository.loginWithPhone(java.lang.String, java.lang.String, com.example.data.model.UserRole, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object logout(@NotNull Continuation<? super Unit> continuation) {
        Object logoutAll = this.userDao.logoutAll(continuation);
        return logoutAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? logoutAll : Unit.INSTANCE;
    }

    @NotNull
    public final List<ChatGroup> getChatGroups() {
        return ChatModelKt.getDefaultChatGroups();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Flow<List<ChatMessage>> getMessagesFlow(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        final Flow messagesForGroup = this.chatDao.getMessagesForGroup(groupId);
        return new Flow<List<? extends ChatMessage>>() { // from class: com.example.data.repository.AuthAndChatRepository$getMessagesFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n101#3:51\n102#3,14:55\n116#3:70\n1563#4:52\n1634#4,2:53\n1636#4:69\n*S KotlinDebug\n*F\n+ 1 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository\n*L\n101#1:52\n101#1:53,2\n101#1:69\n*E\n"})
            /* renamed from: com.example.data.repository.AuthAndChatRepository$getMessagesFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$getMessagesFlow$$inlined$map$1$2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
                @DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository$getMessagesFlow$$inlined$map$1$2", f = "AuthAndChatRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.data.repository.AuthAndChatRepository$getMessagesFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$getMessagesFlow$$inlined$map$1$2$1.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, (Continuation) this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r37, kotlin.coroutines.Continuation r38) {
                    /*
                        Method dump skipped, instructions count: 258
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository$getMessagesFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public Object collect(FlowCollector collector, Continuation $completion) {
                Object collect = messagesForGroup.collect(new AnonymousClass2(collector), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Flow<List<ChatMessage>> getAllAdminMessagesFlow() {
        final Flow allAdminMessages = this.chatDao.getAllAdminMessages();
        return new Flow<List<? extends ChatMessage>>() { // from class: com.example.data.repository.AuthAndChatRepository$getAllAdminMessagesFlow$$inlined$map$1
            public Object collect(FlowCollector collector, Continuation $completion) {
                Object collect = allAdminMessages.collect(new AnonymousClass2(collector), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n122#3:51\n123#3,14:55\n137#3:70\n1563#4:52\n1634#4,2:53\n1636#4:69\n*S KotlinDebug\n*F\n+ 1 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository\n*L\n122#1:52\n122#1:53,2\n122#1:69\n*E\n"})
            /* renamed from: com.example.data.repository.AuthAndChatRepository$getAllAdminMessagesFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$getAllAdminMessagesFlow$$inlined$map$1$2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
                @DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository$getAllAdminMessagesFlow$$inlined$map$1$2", f = "AuthAndChatRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.data.repository.AuthAndChatRepository$getAllAdminMessagesFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$getAllAdminMessagesFlow$$inlined$map$1$2$1.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, (Continuation) this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r37, kotlin.coroutines.Continuation r38) {
                    /*
                        Method dump skipped, instructions count: 258
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository$getAllAdminMessagesFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        };
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0025. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x029c -> B:12:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x02a9 -> B:13:0x00ed). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkAndSeedInitialMessages(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r38) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository.checkAndSeedInitialMessages(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: syncWithCloud-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m19syncWithCloudIoAF18A(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Integer>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.example.data.repository.AuthAndChatRepository$syncWithCloud$1
            if (r0 == 0) goto L14
            r0 = r7
            com.example.data.repository.AuthAndChatRepository$syncWithCloud$1 r0 = (com.example.data.repository.AuthAndChatRepository$syncWithCloud$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.AuthAndChatRepository$syncWithCloud$1 r0 = new com.example.data.repository.AuthAndChatRepository$syncWithCloud$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L4c
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.example.data.repository.AuthAndChatRepository$syncWithCloud$2 r4 = new com.example.data.repository.AuthAndChatRepository$syncWithCloud$2
            r5 = 0
            r4.<init>(r6, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L4c
            return r2
        L4c:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.unbox-impl()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository.m19syncWithCloudIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: uploadMessageToCloud-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15uploadMessageToCloudgIAlus(com.example.data.local.ChatMessageEntity r7, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$1
            if (r0 == 0) goto L14
            r0 = r8
            com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$1 r0 = (com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$1 r0 = new com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            com.example.data.local.ChatMessageEntity r7 = (com.example.data.local.ChatMessageEntity) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L57
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$2 r4 = new com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$2
            r5 = 0
            r4.<init>(r6, r7, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L57
            return r2
        L57:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.unbox-impl()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository.m15uploadMessageToCloudgIAlus(com.example.data.local.ChatMessageEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: postMessage-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ Object m14postMessagehUnOzRk$default(AuthAndChatRepository authAndChatRepository, String str, UserProfile userProfile, String str2, String str3, boolean z, Continuation continuation, int i, Object obj) {
        String str4;
        boolean z2;
        if ((i & 8) == 0) {
            str4 = str3;
        } else {
            str4 = null;
        }
        if ((i & 16) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        return authAndChatRepository.m18postMessagehUnOzRk(str, userProfile, str2, str4, z2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: postMessage-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m18postMessagehUnOzRk(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.Nullable com.example.data.model.UserProfile r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.Nullable java.lang.String r27, boolean r28, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r29) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository.m18postMessagehUnOzRk(java.lang.String, com.example.data.model.UserProfile, java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: postAdminMessage-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ Object m13postAdminMessagehUnOzRk$default(AuthAndChatRepository authAndChatRepository, String str, UserProfile userProfile, String str2, String str3, boolean z, Continuation continuation, int i, Object obj) {
        String str4;
        boolean z2;
        if ((i & 8) == 0) {
            str4 = str3;
        } else {
            str4 = null;
        }
        if ((i & 16) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        return authAndChatRepository.m17postAdminMessagehUnOzRk(str, userProfile, str2, str4, z2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: postAdminMessage-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m17postAdminMessagehUnOzRk(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull com.example.data.model.UserProfile r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable java.lang.String r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof com.example.data.repository.AuthAndChatRepository$postAdminMessage$1
            if (r0 == 0) goto L14
            r0 = r15
            com.example.data.repository.AuthAndChatRepository$postAdminMessage$1 r0 = (com.example.data.repository.AuthAndChatRepository$postAdminMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.AuthAndChatRepository$postAdminMessage$1 r0 = new com.example.data.repository.AuthAndChatRepository$postAdminMessage$1
            r0.<init>(r9, r15)
        L19:
            r7 = r0
            java.lang.Object r0 = r7.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            switch(r1) {
                case 0: goto L50;
                case 1: goto L2f;
                default: goto L25;
            }
        L25:
            r2 = r10
            r3 = r11
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            boolean r14 = r7.Z$0
            java.lang.Object r1 = r7.L$3
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r7.L$2
            r12 = r1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r7.L$1
            r11 = r1
            com.example.data.model.UserProfile r11 = (com.example.data.model.UserProfile) r11
            java.lang.Object r1 = r7.L$0
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r0)
            r1 = r0
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.unbox-impl()
            goto L83
        L50:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r7.L$0 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r7.L$1 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r7.L$2 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r7.L$3 = r1
            r7.Z$0 = r14
            r1 = 1
            r7.label = r1
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r10 = r1.m18postMessagehUnOzRk(r2, r3, r4, r5, r6, r7)
            if (r10 != r8) goto L7d
            return r8
        L7d:
            r1 = r10
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r6
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository.m17postAdminMessagehUnOzRk(java.lang.String, com.example.data.model.UserProfile, java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: deleteMessage-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16deleteMessage0E7RQCE(long r6, @org.jetbrains.annotations.Nullable com.example.data.model.UserProfile r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.example.data.repository.AuthAndChatRepository$deleteMessage$1
            if (r0 == 0) goto L14
            r0 = r9
            com.example.data.repository.AuthAndChatRepository$deleteMessage$1 r0 = (com.example.data.repository.AuthAndChatRepository$deleteMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.AuthAndChatRepository$deleteMessage$1 r0 = new com.example.data.repository.AuthAndChatRepository$deleteMessage$1
            r0.<init>(r5, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L37;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            long r6 = r0.J$0
            java.lang.Object r2 = r0.L$0
            r8 = r2
            com.example.data.model.UserProfile r8 = (com.example.data.model.UserProfile) r8
            kotlin.ResultKt.throwOnFailure(r1)
            goto L6e
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r8 == 0) goto L41
            com.example.data.model.UserRole r3 = r8.getRole()
            goto L42
        L41:
            r3 = 0
        L42:
            com.example.data.model.UserRole r4 = com.example.data.model.UserRole.ADMIN
            if (r3 == r4) goto L5a
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Only Admins can delete announcements."
            r2.<init>(r3)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.constructor-impl(r2)
            return r2
        L5a:
            com.example.data.local.ChatMessageDao r3 = r5.chatDao
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$0 = r4
            r0.J$0 = r6
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.deleteMessage(r6, r0)
            if (r3 != r2) goto L6e
            return r2
        L6e:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = kotlin.Result.constructor-impl(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository.m16deleteMessage0E7RQCE(long, com.example.data.model.UserProfile, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object addReaction(long id, @NotNull Continuation<? super Unit> continuation) {
        Object incrementReaction = this.chatDao.incrementReaction(id, continuation);
        return incrementReaction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? incrementReaction : Unit.INSTANCE;
    }

    private final String formatSriLankaPhone(String raw) {
        CharSequence charSequence;
        String trimmed = StringsKt.trim(raw).toString();
        String str = trimmed;
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (Character.isLetter(str.charAt(i))) {
                    charSequence = 1;
                    break;
                }
                i++;
            } else {
                charSequence = null;
                break;
            }
        }
        if (charSequence != null) {
            return trimmed;
        }
        String str2 = trimmed;
        Appendable sb = new StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (((Character.isDigit(charAt) || charAt == '+') ? (char) 1 : (char) 0) != 0) {
                sb.append(charAt);
            }
        }
        String sb2 = ((StringBuilder) sb).toString();
        if (StringsKt.startsWith$default(sb2, "+94", false, 2, (Object) null)) {
            return sb2;
        }
        if (StringsKt.startsWith$default(sb2, "94", false, 2, (Object) null)) {
            return "+" + sb2;
        }
        if (StringsKt.startsWith$default(sb2, "0", false, 2, (Object) null)) {
            String substring = sb2.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return "+94" + substring;
        }
        return "+94" + sb2;
    }
}
