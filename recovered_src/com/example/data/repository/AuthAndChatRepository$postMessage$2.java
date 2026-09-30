package com.example.data.repository;

import com.example.BuildConfig;
import com.example.data.local.ChatMessageEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthAndChatRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository$postMessage$2", f = "AuthAndChatRepository.kt", i = {1, BuildConfig.VERSION_CODE, 3}, l = {394, 396, 397, 399}, m = "invokeSuspend", n = {"res", "res", "res"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$postMessage$2.dex */
public final class AuthAndChatRepository$postMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatMessageEntity $entity;
    Object L$0;
    int label;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$postMessage$2(AuthAndChatRepository authAndChatRepository, ChatMessageEntity chatMessageEntity, Continuation<? super AuthAndChatRepository$postMessage$2> continuation) {
        super(2, continuation);
        this.this$0 = authAndChatRepository;
        this.$entity = chatMessageEntity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthAndChatRepository$postMessage$2(this.this$0, this.$entity, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            switch(r1) {
                case 0: goto L3b;
                case 1: goto L30;
                case 2: goto L2a;
                case 3: goto L1e;
                case 4: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r6.L$0
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r7
            kotlin.Result r1 = (kotlin.Result) r1
            r1.unbox-impl()
            goto L99
        L1e:
            java.lang.Object r1 = r6.L$0
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r7
            kotlin.Result r2 = (kotlin.Result) r2
            r2.unbox-impl()
            goto L82
        L2a:
            java.lang.Object r1 = r6.L$0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6b
        L30:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r7
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.unbox-impl()
            goto L4f
        L3b:
            kotlin.ResultKt.throwOnFailure(r7)
            com.example.data.repository.AuthAndChatRepository r1 = r6.this$0
            com.example.data.local.ChatMessageEntity r2 = r6.$entity
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 1
            r6.label = r4
            java.lang.Object r1 = com.example.data.repository.AuthAndChatRepository.m12access$uploadMessageToCloudgIAlus(r1, r2, r3)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            boolean r2 = kotlin.Result.isFailure-impl(r1)
            if (r2 == 0) goto L83
            r2 = r6
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r6.L$0 = r3
            r3 = 2
            r6.label = r3
            r3 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r3, r2)
            if (r2 != r0) goto L6b
            return r0
        L6b:
            com.example.data.repository.AuthAndChatRepository r2 = r6.this$0
            com.example.data.local.ChatMessageEntity r3 = r6.$entity
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r6.L$0 = r5
            r5 = 3
            r6.label = r5
            java.lang.Object r2 = com.example.data.repository.AuthAndChatRepository.m12access$uploadMessageToCloudgIAlus(r2, r3, r4)
            if (r2 != r0) goto L82
            return r0
        L82:
        L83:
            com.example.data.repository.AuthAndChatRepository r2 = r6.this$0
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r6.L$0 = r4
            r4 = 4
            r6.label = r4
            java.lang.Object r2 = r2.m19syncWithCloudIoAF18A(r3)
            if (r2 != r0) goto L98
            return r0
        L98:
            r0 = r1
        L99:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.AuthAndChatRepository$postMessage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
