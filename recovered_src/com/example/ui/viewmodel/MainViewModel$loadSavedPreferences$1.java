package com.example.ui.viewmodel;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$loadSavedPreferences$1", f = "MainViewModel.kt", i = {1, 1, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE}, l = {211, 217, 226}, m = "invokeSuspend", n = {"savedDistrictId", "district", "savedDistrictId", "district", "savedTheme", "alertsMap", "p"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$5"})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/example/ui/viewmodel/MainViewModel$loadSavedPreferences$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,758:1\n1#2:759\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$loadSavedPreferences$1.dex */
public final class MainViewModel$loadSavedPreferences$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$loadSavedPreferences$1(MainViewModel mainViewModel, Continuation<? super MainViewModel$loadSavedPreferences$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$loadSavedPreferences$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:15|7|8|9|10|(2:16|17)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0158, code lost:
    
        r0 = com.example.data.model.AlertSoundType.ADHAN_MAKKAH;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0148 -> B:7:0x014f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.viewmodel.MainViewModel$loadSavedPreferences$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
