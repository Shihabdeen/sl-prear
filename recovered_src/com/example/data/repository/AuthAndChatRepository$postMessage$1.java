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
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository", f = "AuthAndChatRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {390}, m = "postMessage-hUnOzRk", n = {"groupId", "user", "text", "tag", "senderName", "senderPhone", "senderDesignation", "senderMosque", "entity", "isPinned"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$postMessage$1.dex */
public final class AuthAndChatRepository$postMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$postMessage$1(AuthAndChatRepository authAndChatRepository, Continuation<? super AuthAndChatRepository$postMessage$1> continuation) {
        super(continuation);
        this.this$0 = authAndChatRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m18postMessagehUnOzRk = this.this$0.m18postMessagehUnOzRk(null, null, null, null, false, (Continuation) this);
        return m18postMessagehUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m18postMessagehUnOzRk : Result.box-impl(m18postMessagehUnOzRk);
    }
}
