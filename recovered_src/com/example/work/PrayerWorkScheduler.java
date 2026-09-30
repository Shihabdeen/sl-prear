package com.example.work;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.example.BuildConfig;
import com.example.data.model.District;
import com.example.data.model.PrayerModelKt;
import com.example.data.model.PrayerType;
import com.example.data.model.SinglePrayerTime;
import com.example.util.PrayerCalculator;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrayerWorkScheduler.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u001e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/example/work/PrayerWorkScheduler;", "", "<init>", "()V", "TAG", "", "WORK_FAJR", "WORK_DHUHR", "WORK_ASR", "WORK_MAGHRIB", "WORK_ISHA", "WORK_PERIODIC_MAINTENANCE", "FiveDailyPrayers", "", "Lcom/example/data/model/PrayerType;", "getUniqueWorkName", "prayerType", "getLocalMosqueName", "districtId", "districtName", "scheduleDailyPrayerNotifications", "", "context", "Landroid/content/Context;", "district", "Lcom/example/data/model/District;", "scheduleSinglePrayerNextDay", "prayerTypeName", "triggerImmediateTestWork", "cancelAllPrayerWork", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrayerWorkScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerWorkScheduler.kt\ncom/example/work/PrayerWorkScheduler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n+ 4 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequestKt\n*L\n1#1,260:1\n1#2:261\n105#3:262\n105#3:269\n105#3:270\n398#4,6:263\n*S KotlinDebug\n*F\n+ 1 PrayerWorkScheduler.kt\ncom/example/work/PrayerWorkScheduler\n*L\n115#1:262\n193#1:269\n234#1:270\n129#1:263,6\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/work/PrayerWorkScheduler.dex */
public final class PrayerWorkScheduler {

    @NotNull
    private static final String TAG = "PrayerWorkScheduler";

    @NotNull
    public static final String WORK_ASR = "prayer_work_ASR";

    @NotNull
    public static final String WORK_DHUHR = "prayer_work_DHUHR";

    @NotNull
    public static final String WORK_FAJR = "prayer_work_FAJR";

    @NotNull
    public static final String WORK_ISHA = "prayer_work_ISHA";

    @NotNull
    public static final String WORK_MAGHRIB = "prayer_work_MAGHRIB";

    @NotNull
    public static final String WORK_PERIODIC_MAINTENANCE = "prayer_periodic_maintenance";

    @NotNull
    public static final PrayerWorkScheduler INSTANCE = new PrayerWorkScheduler();

    @NotNull
    private static final List<PrayerType> FiveDailyPrayers = CollectionsKt.listOf(new PrayerType[]{PrayerType.FAJR, PrayerType.DHUHR, PrayerType.ASR, PrayerType.MAGHRIB, PrayerType.ISHA});
    public static final int $stable = 8;

    /* compiled from: PrayerWorkScheduler.kt */
    @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/work/PrayerWorkScheduler$WhenMappings.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrayerType.values().length];
            try {
                iArr[PrayerType.FAJR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[PrayerType.DHUHR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[PrayerType.ASR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[PrayerType.MAGHRIB.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[PrayerType.ISHA.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[PrayerType.SUNRISE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PrayerWorkScheduler() {
    }

    @NotNull
    public final String getUniqueWorkName(@NotNull PrayerType prayerType) {
        Intrinsics.checkNotNullParameter(prayerType, "prayerType");
        switch (WhenMappings.$EnumSwitchMapping$0[prayerType.ordinal()]) {
            case 1:
                return WORK_FAJR;
            case BuildConfig.VERSION_CODE /* 2 */:
                return WORK_DHUHR;
            case 3:
                return WORK_ASR;
            case 4:
                return WORK_MAGHRIB;
            case 5:
                return WORK_ISHA;
            case 6:
                return "prayer_work_SUNRISE";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final String getLocalMosqueName(@NotNull String districtId, @NotNull String districtName) {
        Intrinsics.checkNotNullParameter(districtId, "districtId");
        Intrinsics.checkNotNullParameter(districtName, "districtName");
        if (Intrinsics.areEqual(districtId, "hatton_bogawantalawa") || StringsKt.contains(districtName, "Hatton", true) || StringsKt.contains(districtName, "Bogawantalawa", true)) {
            return "Bogawantalawa Town Jummah Mosque / Hatton Grand Mosque";
        }
        return districtName + " Grand Mosque";
    }

    public static /* synthetic */ void scheduleDailyPrayerNotifications$default(PrayerWorkScheduler prayerWorkScheduler, Context context, District district, int i, Object obj) {
        if ((i & 2) != 0) {
            district = PrayerModelKt.getSriLankaDistricts().get(0);
        }
        prayerWorkScheduler.scheduleDailyPrayerNotifications(context, district);
    }

    public final void scheduleDailyPrayerNotifications(@NotNull Context context, @NotNull District district) {
        Object obj;
        Object obj2;
        PrayerWorkScheduler prayerWorkScheduler = this;
        District district2 = district;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(district2, "district");
        try {
            WorkManager workManager = WorkManager.Companion.getInstance(context);
            Calendar now = Calendar.getInstance();
            long nowMillis = now.getTimeInMillis();
            String mosqueName = prayerWorkScheduler.getLocalMosqueName(district2.getId(), district2.getName());
            PrayerCalculator prayerCalculator = PrayerCalculator.INSTANCE;
            Intrinsics.checkNotNull(now);
            List todayPrayerTimes = prayerCalculator.calculatePrayerTimes(district2, now);
            Log.i(TAG, "Scheduling 5 daily prayer notifications for " + district2.getName() + " (" + mosqueName + ")");
            Iterator<PrayerType> it = FiveDailyPrayers.iterator();
            while (it.hasNext()) {
                PrayerType prayerType = it.next();
                Iterator<T> it2 = todayPrayerTimes.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((SinglePrayerTime) obj).getType() == prayerType) {
                            break;
                        }
                    }
                }
                SinglePrayerTime prayerInfo = (SinglePrayerTime) obj;
                if (prayerInfo != null) {
                    Calendar targetCalendar = Calendar.getInstance();
                    Calendar now2 = now;
                    targetCalendar.set(11, prayerInfo.getHour());
                    targetCalendar.set(12, prayerInfo.getMinute());
                    targetCalendar.set(13, 0);
                    targetCalendar.set(14, 0);
                    if (targetCalendar.getTimeInMillis() <= nowMillis + 60000) {
                        targetCalendar.add(6, 1);
                        PrayerCalculator prayerCalculator2 = PrayerCalculator.INSTANCE;
                        Intrinsics.checkNotNull(targetCalendar);
                        List tomorrowTimes = prayerCalculator2.calculatePrayerTimes(district2, targetCalendar);
                        Iterator<T> it3 = tomorrowTimes.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next = it3.next();
                            if (((SinglePrayerTime) next).getType() == prayerType) {
                                obj2 = next;
                                break;
                            }
                        }
                        SinglePrayerTime tomorrowPrayer = (SinglePrayerTime) obj2;
                        if (tomorrowPrayer != null) {
                            targetCalendar.set(11, tomorrowPrayer.getHour());
                            targetCalendar.set(12, tomorrowPrayer.getMinute());
                        }
                    }
                    long delayMillis = RangesKt.coerceAtLeast(targetCalendar.getTimeInMillis() - nowMillis, 1000L);
                    long delayMinutes = TimeUnit.MILLISECONDS.toMinutes(delayMillis);
                    List todayPrayerTimes2 = todayPrayerTimes;
                    Data inputData = new Data.Builder().putString(PrayerNotificationWorker.KEY_PRAYER_TYPE, prayerType.name()).putString(PrayerNotificationWorker.KEY_PRAYER_DISPLAY_NAME, prayerType.getDisplayName()).putString(PrayerNotificationWorker.KEY_PRAYER_ARABIC, prayerType.getArabicName()).putString(PrayerNotificationWorker.KEY_PRAYER_TIME, prayerInfo.getFormattedTime()).putString(PrayerNotificationWorker.KEY_DISTRICT_ID, district.getId()).putString(PrayerNotificationWorker.KEY_DISTRICT_NAME, district.getName()).putString(PrayerNotificationWorker.KEY_MOSQUE_NAME, mosqueName).build();
                    String mosqueName2 = mosqueName;
                    OneTimeWorkRequest workRequest = new OneTimeWorkRequest.Builder(PrayerNotificationWorker.class).setInitialDelay(delayMillis, TimeUnit.MILLISECONDS).setInputData(inputData).addTag("PRAYER_WORK").addTag(prayerType.name()).build();
                    String uniqueName = prayerWorkScheduler.getUniqueWorkName(prayerType);
                    workManager.enqueueUniqueWork(uniqueName, ExistingWorkPolicy.REPLACE, workRequest);
                    Log.d(TAG, "Enqueued " + uniqueName + " in " + delayMinutes + " min (" + prayerInfo.getFormattedTime() + ")");
                    prayerWorkScheduler = this;
                    district2 = district;
                    nowMillis = nowMillis;
                    todayPrayerTimes = todayPrayerTimes2;
                    it = it;
                    now = now2;
                    mosqueName = mosqueName2;
                }
            }
            PeriodicWorkRequest periodicMaintenanceRequest = new PeriodicWorkRequest.Builder(DailyPrayerMaintenanceWorker.class, 24L, TimeUnit.HOURS, 1L, TimeUnit.HOURS).addTag("PRAYER_MAINTENANCE").build();
            workManager.enqueueUniquePeriodicWork(WORK_PERIODIC_MAINTENANCE, ExistingPeriodicWorkPolicy.KEEP, periodicMaintenanceRequest);
        } catch (Exception e) {
            Log.e(TAG, "Error scheduling daily prayer notifications", e);
        }
    }

    public final void scheduleSinglePrayerNextDay(@NotNull Context context, @NotNull String prayerTypeName, @NotNull String districtId) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prayerTypeName, "prayerTypeName");
        Intrinsics.checkNotNullParameter(districtId, "districtId");
        try {
            String upperCase = prayerTypeName.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            PrayerType prayerType = PrayerType.valueOf(upperCase);
            try {
                Iterator<T> it = PrayerModelKt.getSriLankaDistricts().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((District) obj).getId(), districtId)) {
                            break;
                        }
                    }
                }
                District district = (District) obj;
                if (district == null) {
                    district = PrayerModelKt.getSriLankaDistricts().get(0);
                }
                WorkManager workManager = WorkManager.Companion.getInstance(context);
                Calendar tomorrow = Calendar.getInstance();
                tomorrow.add(6, 1);
                PrayerCalculator prayerCalculator = PrayerCalculator.INSTANCE;
                Intrinsics.checkNotNull(tomorrow);
                List tomorrowTimes = prayerCalculator.calculatePrayerTimes(district, tomorrow);
                Iterator<T> it2 = tomorrowTimes.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next = it2.next();
                    if (((SinglePrayerTime) next).getType() == prayerType) {
                        obj2 = next;
                        break;
                    }
                }
                SinglePrayerTime prayerInfo = (SinglePrayerTime) obj2;
                if (prayerInfo == null) {
                    return;
                }
                Calendar targetCalendar = Calendar.getInstance();
                targetCalendar.add(6, 1);
                targetCalendar.set(11, prayerInfo.getHour());
                targetCalendar.set(12, prayerInfo.getMinute());
                targetCalendar.set(13, 0);
                targetCalendar.set(14, 0);
                long nowMillis = System.currentTimeMillis();
                District district2 = district;
                long delayMillis = RangesKt.coerceAtLeast(targetCalendar.getTimeInMillis() - nowMillis, 1000L);
                String mosqueName = getLocalMosqueName(district2.getId(), district2.getName());
                Data inputData = new Data.Builder().putString(PrayerNotificationWorker.KEY_PRAYER_TYPE, prayerType.name()).putString(PrayerNotificationWorker.KEY_PRAYER_DISPLAY_NAME, prayerType.getDisplayName()).putString(PrayerNotificationWorker.KEY_PRAYER_ARABIC, prayerType.getArabicName()).putString(PrayerNotificationWorker.KEY_PRAYER_TIME, prayerInfo.getFormattedTime()).putString(PrayerNotificationWorker.KEY_DISTRICT_ID, district2.getId()).putString(PrayerNotificationWorker.KEY_DISTRICT_NAME, district2.getName()).putString(PrayerNotificationWorker.KEY_MOSQUE_NAME, mosqueName).build();
                OneTimeWorkRequest workRequest = new OneTimeWorkRequest.Builder(PrayerNotificationWorker.class).setInitialDelay(delayMillis, TimeUnit.MILLISECONDS).setInputData(inputData).addTag("PRAYER_WORK").addTag(prayerType.name()).build();
                String uniqueName = getUniqueWorkName(prayerType);
                workManager.enqueueUniqueWork(uniqueName, ExistingWorkPolicy.REPLACE, workRequest);
                Log.i(TAG, "Rescheduled " + uniqueName + " for tomorrow at " + prayerInfo.getFormattedTime());
            } catch (Exception e) {
                Log.e(TAG, "Failed to reschedule single prayer for next day", e);
            }
        } catch (Exception e2) {
        }
    }

    public final void triggerImmediateTestWork(@NotNull Context context, @NotNull PrayerType prayerType, @NotNull District district) {
        Object obj;
        String timeFormatted;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prayerType, "prayerType");
        Intrinsics.checkNotNullParameter(district, "district");
        try {
            WorkManager workManager = WorkManager.Companion.getInstance(context);
            String mosqueName = getLocalMosqueName(district.getId(), district.getName());
            PrayerCalculator prayerCalculator = PrayerCalculator.INSTANCE;
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
            List todayTimes = prayerCalculator.calculatePrayerTimes(district, calendar);
            Iterator<T> it = todayTimes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((SinglePrayerTime) obj).getType() == prayerType) {
                        break;
                    }
                }
            }
            SinglePrayerTime prayerInfo = (SinglePrayerTime) obj;
            if (prayerInfo == null || (timeFormatted = prayerInfo.getFormattedTime()) == null) {
                timeFormatted = "Now";
            }
            Data inputData = new Data.Builder().putString(PrayerNotificationWorker.KEY_PRAYER_TYPE, prayerType.name()).putString(PrayerNotificationWorker.KEY_PRAYER_DISPLAY_NAME, prayerType.getDisplayName()).putString(PrayerNotificationWorker.KEY_PRAYER_ARABIC, prayerType.getArabicName()).putString(PrayerNotificationWorker.KEY_PRAYER_TIME, timeFormatted).putString(PrayerNotificationWorker.KEY_DISTRICT_ID, district.getId()).putString(PrayerNotificationWorker.KEY_DISTRICT_NAME, district.getName()).putString(PrayerNotificationWorker.KEY_MOSQUE_NAME, mosqueName).build();
            workManager.enqueue((OneTimeWorkRequest) new OneTimeWorkRequest.Builder(PrayerNotificationWorker.class).setInitialDelay(500L, TimeUnit.MILLISECONDS).setInputData(inputData).addTag("TEST_PRAYER_WORK").build());
            Log.i(TAG, "Enqueued immediate test work for " + prayerType.getDisplayName());
        } catch (Exception e) {
            Log.e(TAG, "Error triggering immediate test work", e);
        }
    }

    public final void cancelAllPrayerWork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            WorkManager workManager = WorkManager.Companion.getInstance(context);
            for (PrayerType prayerType : FiveDailyPrayers) {
                workManager.cancelUniqueWork(getUniqueWorkName(prayerType));
            }
            workManager.cancelUniqueWork(WORK_PERIODIC_MAINTENANCE);
            Log.i(TAG, "Cancelled all scheduled prayer work in WorkManager");
        } catch (Exception e) {
            Log.e(TAG, "Error cancelling prayer work", e);
        }
    }
}
