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
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository", f = "AuthAndChatRepository.kt", i = {0}, l = {280}, m = "uploadMessageToCloud-gIAlu-s", n = {"entity"}, s = {"L$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$uploadMessageToCloud$1.dex */
public final class AuthAndChatRepository$uploadMessageToCloud$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$uploadMessageToCloud$1(AuthAndChatRepository authAndChatRepository, Continuation<? super AuthAndChatRepository$uploadMessageToCloud$1> continuation) {
        super(continuation);
        this.this$0 = authAndChatRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m15uploadMessageToCloudgIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m15uploadMessageToCloudgIAlus = this.this$0.m15uploadMessageToCloudgIAlus(null, (Continuation) this);
        return m15uploadMessageToCloudgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m15uploadMessageToCloudgIAlus : Result.box-impl(m15uploadMessageToCloudgIAlus);
    }
}
