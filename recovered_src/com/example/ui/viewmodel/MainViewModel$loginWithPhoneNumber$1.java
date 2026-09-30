package com.example.ui.viewmodel;

import com.example.BuildConfig;
import com.example.data.model.UserRole;
import com.example.data.repository.AuthAndChatRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$loginWithPhoneNumber$1", f = "MainViewModel.kt", i = {0, 0, 0}, l = {472}, m = "invokeSuspend", n = {"defaultName", "defaultMosque", "defaultDesignation"}, s = {"L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/example/ui/viewmodel/MainViewModel$loginWithPhoneNumber$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,758:1\n1#2:759\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$loginWithPhoneNumber$1.dex */
public final class MainViewModel$loginWithPhoneNumber$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $adminDesignation;
    final /* synthetic */ String $fullName;
    final /* synthetic */ String $mosqueAffiliation;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ UserRole $role;
    final /* synthetic */ String $trimmed;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$loginWithPhoneNumber$1(String str, UserRole userRole, String str2, String str3, MainViewModel mainViewModel, String str4, Function0<Unit> function0, Continuation<? super MainViewModel$loginWithPhoneNumber$1> continuation) {
        super(2, continuation);
        this.$trimmed = str;
        this.$role = userRole;
        this.$mosqueAffiliation = str2;
        this.$adminDesignation = str3;
        this.this$0 = mainViewModel;
        this.$fullName = str4;
        this.$onSuccess = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$loginWithPhoneNumber$1(this.$trimmed, this.$role, this.$mosqueAffiliation, this.$adminDesignation, this.this$0, this.$fullName, this.$onSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        String defaultName;
        String str;
        String defaultDesignation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (StringsKt.equals(this.$trimmed, "shihab2415", true)) {
                    defaultName = "Shihab (Admin)";
                } else if (this.$role == UserRole.ADMIN) {
                    defaultName = "Mosque Administrator";
                } else {
                    defaultName = "Community Member";
                }
                if (StringsKt.equals(this.$trimmed, "shihab2415", true)) {
                    str = "Bogawantalawa Town Jummah Mosque (Hatton & Bogawantalawa)";
                } else {
                    String str2 = this.$mosqueAffiliation;
                    String str3 = "Bogawantalawa & Hatton Mosque";
                    if (str2 != null) {
                        String str4 = str2;
                        if (!StringsKt.isBlank(str4)) {
                            str3 = str4;
                        }
                        str = str3;
                    } else {
                        str = "Bogawantalawa & Hatton Mosque";
                    }
                }
                String defaultMosque = str;
                if (StringsKt.equals(this.$trimmed, "shihab2415", true)) {
                    defaultDesignation = "Verified Mosque Administrator";
                } else {
                    String str5 = this.$adminDesignation;
                    defaultDesignation = str5 == null ? "Mosque Administrator" : str5;
                }
                AuthAndChatRepository authChatRepository = this.this$0.getAuthChatRepository();
                String str6 = this.$trimmed;
                String str7 = this.$fullName;
                if (StringsKt.isBlank(str7)) {
                    str7 = defaultName;
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable(defaultName);
                this.L$1 = SpillingKt.nullOutSpilledVariable(defaultMosque);
                this.L$2 = SpillingKt.nullOutSpilledVariable(defaultDesignation);
                this.label = 1;
                if (authChatRepository.loginWithPhone(str6, str7, this.$role, defaultDesignation, defaultMosque, (Continuation) this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.showFeedback(this.$role == UserRole.ADMIN ? "Logged in as Verified Mosque Admin" : "Logged in as Community Member");
        this.$onSuccess.invoke();
        return Unit.INSTANCE;
    }
}
