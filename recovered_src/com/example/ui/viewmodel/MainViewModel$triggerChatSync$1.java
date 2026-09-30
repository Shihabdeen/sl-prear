package com.example.ui.viewmodel;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$triggerChatSync$1", f = "MainViewModel.kt", i = {}, l = {573}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$triggerChatSync$1.dex */
public final class MainViewModel$triggerChatSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$triggerChatSync$1(MainViewModel mainViewModel, Continuation<? super MainViewModel$triggerChatSync$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$triggerChatSync$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.this$0.showFeedback("Syncing community announcements...");
                this.label = 1;
                Object m19syncWithCloudIoAF18A = this.this$0.getAuthChatRepository().m19syncWithCloudIoAF18A((Continuation) this);
                if (m19syncWithCloudIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result = m19syncWithCloudIoAF18A;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                result = ((Result) $result).unbox-impl();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Result.isSuccess-impl(result)) {
            Object boxInt = Boxing.boxInt(0);
            if (!Result.isFailure-impl(result)) {
                boxInt = result;
            }
            int newCount = ((Number) boxInt).intValue();
            MainViewModel mainViewModel = this.this$0;
            if (newCount > 0) {
                mainViewModel.showFeedback("Synced " + newCount + " new community announcement(s)!");
            } else {
                mainViewModel.showFeedback("Community chat is up to date 🟢");
            }
        } else {
            this.this$0.showFeedback("Sync completed (offline/cached mode)");
        }
        return Unit.INSTANCE;
    }
}
