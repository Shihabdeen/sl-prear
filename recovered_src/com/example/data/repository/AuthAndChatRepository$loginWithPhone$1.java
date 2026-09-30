package com.example.data.repository;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthAndChatRepository.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository", f = "AuthAndChatRepository.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {80, 90}, m = "loginWithPhone", n = {"phone", "fullName", "role", "adminDesignation", "mosqueAffiliation", "phone", "fullName", "role", "adminDesignation", "mosqueAffiliation", "formattedPhone", "entity"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$loginWithPhone$1.dex */
public final class AuthAndChatRepository$loginWithPhone$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$loginWithPhone$1(AuthAndChatRepository authAndChatRepository, Continuation<? super AuthAndChatRepository$loginWithPhone$1> continuation) {
        super(continuation);
        this.this$0 = authAndChatRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loginWithPhone(null, null, null, null, null, (Continuation) this);
    }
}
