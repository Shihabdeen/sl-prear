package com.example.ui.screens;

import com.example.BuildConfig;
import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGroupScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$2$1", f = "ChatGroupScreen.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ChatGroupScreenKt$ChatGroupScreen$2$1.dex */
public final class ChatGroupScreenKt$ChatGroupScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MainViewModel $viewModel;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGroupScreenKt$ChatGroupScreen$2$1(MainViewModel mainViewModel, Continuation<? super ChatGroupScreenKt$ChatGroupScreen$2$1> continuation) {
        super(2, continuation);
        this.$viewModel = mainViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatGroupScreenKt$ChatGroupScreen$2$1(this.$viewModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        ChatGroupScreenKt$ChatGroupScreen$2$1 chatGroupScreenKt$ChatGroupScreen$2$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                chatGroupScreenKt$ChatGroupScreen$2$1 = this;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                chatGroupScreenKt$ChatGroupScreen$2$1 = this;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            chatGroupScreenKt$ChatGroupScreen$2$1.$viewModel.pollChatSyncSilent();
            chatGroupScreenKt$ChatGroupScreen$2$1.label = 1;
        } while (DelayKt.delay(2000L, (Continuation) chatGroupScreenKt$ChatGroupScreen$2$1) != coroutine_suspended);
        return coroutine_suspended;
    }
}
