package com.example.ui.viewmodel;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$setAllPrayersToMakkahAzan$1", f = "MainViewModel.kt", i = {0}, l = {358}, m = "invokeSuspend", n = {"p"}, s = {"L$1"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$setAllPrayersToMakkahAzan$1.dex */
public final class MainViewModel$setAllPrayersToMakkahAzan$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$setAllPrayersToMakkahAzan$1(MainViewModel mainViewModel, Continuation<? super MainViewModel$setAllPrayersToMakkahAzan$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainViewModel$setAllPrayersToMakkahAzan$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0059 -> B:7:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 1
            switch(r1) {
                case 0: goto L24;
                case 1: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            int r1 = r12.I$1
            int r3 = r12.I$0
            java.lang.Object r4 = r12.L$1
            com.example.data.model.PrayerType r4 = (com.example.data.model.PrayerType) r4
            java.lang.Object r5 = r12.L$0
            com.example.data.model.PrayerType[] r5 = (com.example.data.model.PrayerType[]) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r6 = r5
            r5 = r12
            goto L5d
        L24:
            kotlin.ResultKt.throwOnFailure(r13)
            com.example.data.model.PrayerType[] r1 = com.example.data.model.PrayerType.values()
            int r3 = r1.length
            r4 = 0
            r5 = r1
            r1 = r3
            r3 = r4
            r4 = r12
        L31:
            if (r3 >= r1) goto L62
            r6 = r5[r3]
            com.example.ui.viewmodel.MainViewModel r7 = r4.this$0
            com.example.data.repository.PrayerRepository r7 = r7.getPrayerRepository()
            java.lang.String r8 = r6.name()
            r9 = r4
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r4.L$0 = r5
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r4.L$1 = r10
            r4.I$0 = r3
            r4.I$1 = r1
            r4.label = r2
            java.lang.String r10 = "ADHAN_MAKKAH"
            java.lang.Object r7 = r7.saveAlertPreference(r8, r10, r9)
            if (r7 != r0) goto L59
            return r0
        L59:
            r11 = r5
            r5 = r4
            r4 = r6
            r6 = r11
        L5d:
            int r3 = r3 + r2
            r4 = r5
            r5 = r6
            goto L31
        L62:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.viewmodel.MainViewModel$setAllPrayersToMakkahAzan$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
