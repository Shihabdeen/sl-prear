package com.example.ui.viewmodel;

import android.content.Context;
import com.example.BuildConfig;
import com.example.data.model.MosqueEvent;
import com.example.util.NotificationHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$toggleMosqueReminder$1", f = "MainViewModel.kt", i = {}, l = {366}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$toggleMosqueReminder$1.dex */
public final class MainViewModel$toggleMosqueReminder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MosqueEvent $event;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$toggleMosqueReminder$1(MainViewModel mainViewModel, MosqueEvent mosqueEvent, Continuation<? super MainViewModel$toggleMosqueReminder$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
        this.$event = mosqueEvent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$toggleMosqueReminder$1(this.this$0, this.$event, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object obj;
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                obj = this.this$0.getMosqueRepository().toggleReminder(this.$event, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                obj = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean isSet = ((Boolean) obj).booleanValue();
        if (isSet) {
            NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
            context = this.this$0.context;
            Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
            notificationHelper.sendMosqueEventNotification(context, this.$event.getMosqueName(), this.$event.getTitle(), this.$event.getTimeFormatted(), this.$event.getAddress());
            this.this$0.showFeedback("Reminder set & alert created for " + this.$event.getTitle());
        } else {
            this.this$0.showFeedback("Reminder removed for " + this.$event.getTitle());
        }
        return Unit.INSTANCE;
    }
}
