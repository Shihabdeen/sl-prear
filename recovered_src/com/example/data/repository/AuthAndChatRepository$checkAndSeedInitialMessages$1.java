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
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository", f = "AuthAndChatRepository.kt", i = {1, 1, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {143, 153, 158, 177, 192}, m = "checkAndSeedInitialMessages", n = {"active", "defaultAdmin", "active", "group", "active", "group", "groupInitial", "entities", "count", "active", "group", "groupInitial", "welcomeEntity", "count"}, s = {"L$0", "L$1", "L$0", "L$2", "L$0", "L$2", "L$3", "L$4", "I$0", "L$0", "L$2", "L$3", "L$4", "I$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$checkAndSeedInitialMessages$1.dex */
public final class AuthAndChatRepository$checkAndSeedInitialMessages$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$checkAndSeedInitialMessages$1(AuthAndChatRepository authAndChatRepository, Continuation<? super AuthAndChatRepository$checkAndSeedInitialMessages$1> continuation) {
        super(continuation);
        this.this$0 = authAndChatRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.checkAndSeedInitialMessages((Continuation) this);
    }
}
