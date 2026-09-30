package com.example.work;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: DailyPrayerMaintenanceWorker.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/example/work/DailyPrayerMaintenanceWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyPrayerMaintenanceWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyPrayerMaintenanceWorker.kt\ncom/example/work/DailyPrayerMaintenanceWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/work/DailyPrayerMaintenanceWorker.dex */
public final class DailyPrayerMaintenanceWorker extends CoroutineWorker {

    @NotNull
    public static final String TAG = "DailyPrayerMaintenance";
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyPrayerMaintenanceWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:15:0x0069, B:18:0x006f, B:19:0x007a, B:21:0x0080, B:25:0x0094, B:27:0x0098, B:28:0x00a4, B:35:0x0040), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:15:0x0069, B:18:0x006f, B:19:0x007a, B:21:0x0080, B:25:0x0094, B:27:0x0098, B:28:0x00a4, B:35:0x0040), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.example.work.DailyPrayerMaintenanceWorker$doWork$1
            if (r0 == 0) goto L14
            r0 = r12
            com.example.work.DailyPrayerMaintenanceWorker$doWork$1 r0 = (com.example.work.DailyPrayerMaintenanceWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.work.DailyPrayerMaintenanceWorker$doWork$1 r0 = new com.example.work.DailyPrayerMaintenanceWorker$doWork$1
            r0.<init>(r11, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            java.lang.String r4 = "getApplicationContext(...)"
            java.lang.String r5 = "DailyPrayerMaintenance"
            switch(r3) {
                case 0: goto L3c;
                case 1: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L30:
            java.lang.Object r2 = r0.L$0
            com.example.data.local.AppDatabase r2 = (com.example.data.local.AppDatabase) r2
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L39
            r6 = r1
            goto L69
        L39:
            r2 = move-exception
            goto Lba
        L3c:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r3 = "Running daily prayer maintenance worker to refresh all 5 prayer schedules"
            android.util.Log.i(r5, r3)     // Catch: java.lang.Exception -> L39
            com.example.data.local.AppDatabase$Companion r3 = com.example.data.local.AppDatabase.INSTANCE     // Catch: java.lang.Exception -> L39
            android.content.Context r6 = r11.getApplicationContext()     // Catch: java.lang.Exception -> L39
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)     // Catch: java.lang.Exception -> L39
            com.example.data.local.AppDatabase r3 = r3.getDatabase(r6)     // Catch: java.lang.Exception -> L39
            com.example.data.local.UserPreferenceDao r6 = r3.userPreferenceDao()     // Catch: java.lang.Exception -> L39
            java.lang.String r7 = "selected_district_id"
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> L39
            r0.L$0 = r8     // Catch: java.lang.Exception -> L39
            r8 = 1
            r0.label = r8     // Catch: java.lang.Exception -> L39
            java.lang.Object r6 = r6.getPreferenceValue(r7, r0)     // Catch: java.lang.Exception -> L39
            if (r6 != r2) goto L68
            return r2
        L68:
            r2 = r3
        L69:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L39
            if (r6 != 0) goto L6f
            java.lang.String r6 = "hatton_bogawantalawa"
        L6f:
            java.util.List r3 = com.example.data.model.PrayerModelKt.getSriLankaDistricts()     // Catch: java.lang.Exception -> L39
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Exception -> L39
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L39
        L7a:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Exception -> L39
            if (r7 == 0) goto L93
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Exception -> L39
            r8 = r7
            com.example.data.model.District r8 = (com.example.data.model.District) r8     // Catch: java.lang.Exception -> L39
            r9 = 0
            java.lang.String r10 = r8.getId()     // Catch: java.lang.Exception -> L39
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r6)     // Catch: java.lang.Exception -> L39
            if (r10 == 0) goto L7a
            goto L94
        L93:
            r7 = 0
        L94:
            com.example.data.model.District r7 = (com.example.data.model.District) r7     // Catch: java.lang.Exception -> L39
            if (r7 != 0) goto La4
            java.util.List r3 = com.example.data.model.PrayerModelKt.getSriLankaDistricts()     // Catch: java.lang.Exception -> L39
            r7 = 0
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Exception -> L39
            r7 = r3
            com.example.data.model.District r7 = (com.example.data.model.District) r7     // Catch: java.lang.Exception -> L39
        La4:
            com.example.work.PrayerWorkScheduler r3 = com.example.work.PrayerWorkScheduler.INSTANCE     // Catch: java.lang.Exception -> L39
            android.content.Context r8 = r11.getApplicationContext()     // Catch: java.lang.Exception -> L39
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)     // Catch: java.lang.Exception -> L39
            r3.scheduleDailyPrayerNotifications(r8, r7)     // Catch: java.lang.Exception -> L39
            androidx.work.ListenableWorker$Result r3 = androidx.work.ListenableWorker.Result.success()     // Catch: java.lang.Exception -> L39
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Exception -> L39
            goto Lca
        Lba:
            java.lang.String r3 = "Failed to run DailyPrayerMaintenanceWorker"
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            android.util.Log.e(r5, r3, r4)
            androidx.work.ListenableWorker$Result r3 = androidx.work.ListenableWorker.Result.retry()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
        Lca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.work.DailyPrayerMaintenanceWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
