package com.example.work;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DailyPrayerMaintenanceWorker.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.work.DailyPrayerMaintenanceWorker", f = "DailyPrayerMaintenanceWorker.kt", i = {0}, l = {23}, m = "doWork", n = {"db"}, s = {"L$0"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/work/DailyPrayerMaintenanceWorker$doWork$1.dex */
public final class DailyPrayerMaintenanceWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DailyPrayerMaintenanceWorker this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyPrayerMaintenanceWorker$doWork$1(DailyPrayerMaintenanceWorker dailyPrayerMaintenanceWorker, Continuation<? super DailyPrayerMaintenanceWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = dailyPrayerMaintenanceWorker;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork((Continuation) this);
    }
}
