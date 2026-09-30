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
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository", f = "AuthAndChatRepository.kt", i = {}, l = {203}, m = "syncWithCloud-IoAF18A", n = {}, s = {})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$syncWithCloud$1.dex */
public final class AuthAndChatRepository$syncWithCloud$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$syncWithCloud$1(AuthAndChatRepository authAndChatRepository, Continuation<? super AuthAndChatRepository$syncWithCloud$1> continuation) {
        super(continuation);
        this.this$0 = authAndChatRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m19syncWithCloudIoAF18A = this.this$0.m19syncWithCloudIoAF18A((Continuation) this);
        return m19syncWithCloudIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m19syncWithCloudIoAF18A : Result.box-impl(m19syncWithCloudIoAF18A);
    }
}
