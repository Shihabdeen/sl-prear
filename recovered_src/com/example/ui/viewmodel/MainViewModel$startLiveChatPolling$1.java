package com.example.ui.viewmodel;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$startLiveChatPolling$1", f = "MainViewModel.kt", i = {0, 1}, l = {256, 257}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$startLiveChatPolling$1.dex */
public final class MainViewModel$startLiveChatPolling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$startLiveChatPolling$1(MainViewModel mainViewModel, Continuation<? super MainViewModel$startLiveChatPolling$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> mainViewModel$startLiveChatPolling$1 = new MainViewModel$startLiveChatPolling$1(this.this$0, continuation);
        mainViewModel$startLiveChatPolling$1.L$0 = obj;
        return mainViewModel$startLiveChatPolling$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:7:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            switch(r2) {
                case 0: goto L25;
                case 1: goto L1a;
                case 2: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L15:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r6
            goto L56
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r7
            kotlin.Result r2 = (kotlin.Result) r2
            r2.unbox-impl()
            r2 = r6
            goto L44
        L25:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r6
        L29:
            boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
            if (r3 == 0) goto L57
            com.example.ui.viewmodel.MainViewModel r3 = r2.this$0
            com.example.data.repository.AuthAndChatRepository r3 = r3.getAuthChatRepository()
            r4 = r2
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r2.L$0 = r0
            r5 = 1
            r2.label = r5
            java.lang.Object r3 = r3.m19syncWithCloudIoAF18A(r4)
            if (r3 != r1) goto L44
            return r1
        L44:
            r3 = r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r2.L$0 = r0
            r4 = 2
            r2.label = r4
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r4, r3)
            if (r3 != r1) goto L56
            return r1
        L56:
            goto L29
        L57:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.viewmodel.MainViewModel$startLiveChatPolling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
