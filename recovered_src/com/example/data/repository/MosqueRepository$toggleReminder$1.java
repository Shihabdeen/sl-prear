package com.example.data.repository;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MosqueRepository.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.repository.MosqueRepository", f = "MosqueRepository.kt", i = {0, 0, 1, 1}, l = {30, 38}, m = "toggleReminder", n = {"event", "newStatus", "event", "newStatus"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/MosqueRepository$toggleReminder$1.dex */
public final class MosqueRepository$toggleReminder$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MosqueRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosqueRepository$toggleReminder$1(MosqueRepository mosqueRepository, Continuation<? super MosqueRepository$toggleReminder$1> continuation) {
        super(continuation);
        this.this$0 = mosqueRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toggleReminder(null, (Continuation) this);
    }
}
