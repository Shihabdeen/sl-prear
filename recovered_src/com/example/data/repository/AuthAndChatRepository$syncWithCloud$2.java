package com.example.data.repository;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthAndChatRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository$syncWithCloud$2", f = "AuthAndChatRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {241, 256}, m = "invokeSuspend", n = {"regReq", "regResp", "regBody", "regJson", "dataObj", "messagesArray", "msgJson", "groupId", "senderPhone", "text", "newCount", "i", "timestamp", "regReq", "regResp", "regBody", "regJson", "dataObj", "messagesArray", "msgJson", "groupId", "senderPhone", "text", "existing", "entity", "newCount", "i", "timestamp"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$1", "J$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$syncWithCloud$2.dex */
public final class AuthAndChatRepository$syncWithCloud$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Integer>>, Object> {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$syncWithCloud$2(AuthAndChatRepository authAndChatRepository, Continuation<? super AuthAndChatRepository$syncWithCloud$2> continuation) {
        super(2, continuation);
        this.this$0 = authAndChatRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthAndChatRepository$syncWithCloud$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Integer>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x03f5, code lost:
    
        r26 = r0;
        r31 = r2;
        r3 = r48;
        r4 = r27;
        r6 = r28;
        r7 = r29;
        r8 = r8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02aa A[Catch: all -> 0x03cf, Exception -> 0x03d5, TRY_LEAVE, TryCatch #12 {Exception -> 0x03d5, all -> 0x03cf, blocks: (B:47:0x02a6, B:49:0x02aa), top: B:46:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0393 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0394 -> B:10:0x03a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x03be -> B:11:0x03f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository$syncWithCloud$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
