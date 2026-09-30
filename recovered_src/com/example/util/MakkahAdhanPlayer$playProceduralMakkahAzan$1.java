package com.example.util;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MakkahAdhanPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.util.MakkahAdhanPlayer$playProceduralMakkahAzan$1", f = "MakkahAdhanPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMakkahAdhanPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MakkahAdhanPlayer.kt\ncom/example/util/MakkahAdhanPlayer$playProceduralMakkahAzan$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1869#2,2:313\n1#3:315\n*S KotlinDebug\n*F\n+ 1 MakkahAdhanPlayer.kt\ncom/example/util/MakkahAdhanPlayer$playProceduralMakkahAzan$1\n*L\n228#1:313,2\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/MakkahAdhanPlayer$playProceduralMakkahAzan$1.dex */
public final class MakkahAdhanPlayer$playProceduralMakkahAzan$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onCompletion;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakkahAdhanPlayer$playProceduralMakkahAzan$1(Function0<Unit> function0, Continuation<? super MakkahAdhanPlayer$playProceduralMakkahAzan$1> continuation) {
        super(2, continuation);
        this.$onCompletion = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MakkahAdhanPlayer$playProceduralMakkahAzan$1(this.$onCompletion, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x041d, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x041f, code lost:
    
        r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0425, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03fd, code lost:
    
        if (r0 == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.util.MakkahAdhanPlayer$playProceduralMakkahAzan$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
