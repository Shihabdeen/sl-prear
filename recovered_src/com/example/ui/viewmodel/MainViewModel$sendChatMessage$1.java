package com.example.ui.viewmodel;

import com.example.BuildConfig;
import com.example.data.model.ChatGroup;
import com.example.data.model.UserProfile;
import com.example.data.repository.AuthAndChatRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$sendChatMessage$1", f = "MainViewModel.kt", i = {}, l = {526}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$sendChatMessage$1.dex */
public final class MainViewModel$sendChatMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserProfile $activeUser;
    final /* synthetic */ boolean $isPinned;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ String $tag;
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainViewModel$sendChatMessage$1(MainViewModel mainViewModel, UserProfile userProfile, String str, String str2, boolean z, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super MainViewModel$sendChatMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
        this.$activeUser = userProfile;
        this.$text = str;
        this.$tag = str2;
        this.$isPinned = z;
        this.$onSuccess = function0;
        this.$onError = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$sendChatMessage$1(this.this$0, this.$activeUser, this.$text, this.$tag, this.$isPinned, this.$onSuccess, this.$onError, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        Object result;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                AuthAndChatRepository authChatRepository = this.this$0.getAuthChatRepository();
                mutableStateFlow = this.this$0._selectedChatGroup;
                this.label = 1;
                Object m18postMessagehUnOzRk = authChatRepository.m18postMessagehUnOzRk(((ChatGroup) mutableStateFlow.getValue()).getId(), this.$activeUser, this.$text, this.$tag, this.$isPinned, (Continuation) this);
                if (m18postMessagehUnOzRk == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result = m18postMessagehUnOzRk;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                result = ((Result) $result).unbox-impl();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (Result.isSuccess-impl(result)) {
            this.this$0.showFeedback("Announcement broadcast live to all mosques!");
            this.$onSuccess.invoke();
        } else {
            Function1<String, Unit> function1 = this.$onError;
            Throwable th = Result.exceptionOrNull-impl(result);
            if (th == null || (str = th.getMessage()) == null) {
                str = "Failed to post message";
            }
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }
}
