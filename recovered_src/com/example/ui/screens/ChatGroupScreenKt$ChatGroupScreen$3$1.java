package com.example.ui.screens;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import com.example.BuildConfig;
import com.example.data.model.ChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGroupScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$3$1", f = "ChatGroupScreen.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ChatGroupScreenKt$ChatGroupScreen$3$1.dex */
public final class ChatGroupScreenKt$ChatGroupScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ State<List<ChatMessage>> $messages$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatGroupScreenKt$ChatGroupScreen$3$1(LazyListState lazyListState, State<? extends List<ChatMessage>> state, Continuation<? super ChatGroupScreenKt$ChatGroupScreen$3$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$messages$delegate = state;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatGroupScreenKt$ChatGroupScreen$3$1(this.$listState, this.$messages$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        List ChatGroupScreen$lambda$2;
        List ChatGroupScreen$lambda$22;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ChatGroupScreen$lambda$2 = ChatGroupScreenKt.ChatGroupScreen$lambda$2(this.$messages$delegate);
                if (!ChatGroupScreen$lambda$2.isEmpty()) {
                    LazyListState lazyListState = this.$listState;
                    ChatGroupScreen$lambda$22 = ChatGroupScreenKt.ChatGroupScreen$lambda$2(this.$messages$delegate);
                    this.label = 1;
                    if (LazyListState.animateScrollToItem$default(lazyListState, ChatGroupScreen$lambda$22.size() - 1, 0, (Continuation) this, 2, (Object) null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
