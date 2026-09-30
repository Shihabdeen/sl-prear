package com.example.data.repository;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthAndChatRepository.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository", f = "AuthAndChatRepository.kt", i = {0, 0}, l = {419}, m = "deleteMessage-0E7RQCE", n = {"user", "id"}, s = {"L$0", "J$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$deleteMessage$1.dex */
public final class AuthAndChatRepository$deleteMessage$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$deleteMessage$1(AuthAndChatRepository authAndChatRepository, Continuation<? super AuthAndChatRepository$deleteMessage$1> continuation) {
        super(continuation);
        this.this$0 = authAndChatRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m16deleteMessage0E7RQCE = this.this$0.m16deleteMessage0E7RQCE(0L, null, (Continuation) this);
        return m16deleteMessage0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m16deleteMessage0E7RQCE : Result.box-impl(m16deleteMessage0E7RQCE);
    }
}
