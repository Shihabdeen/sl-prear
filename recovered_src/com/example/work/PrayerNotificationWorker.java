package com.example.work;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrayerNotificationWorker.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/example/work/PrayerNotificationWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/work/PrayerNotificationWorker.dex */
public final class PrayerNotificationWorker extends CoroutineWorker {

    @NotNull
    public static final String KEY_DISTRICT_ID = "key_district_id";

    @NotNull
    public static final String KEY_DISTRICT_NAME = "key_district_name";

    @NotNull
    public static final String KEY_MOSQUE_NAME = "key_mosque_name";

    @NotNull
    public static final String KEY_PRAYER_ARABIC = "key_prayer_arabic";

    @NotNull
    public static final String KEY_PRAYER_DISPLAY_NAME = "key_prayer_display_name";

    @NotNull
    public static final String KEY_PRAYER_TIME = "key_prayer_time";

    @NotNull
    public static final String KEY_PRAYER_TYPE = "key_prayer_type";

    @NotNull
    public static final String TAG = "PrayerNotificationWorker";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrayerNotificationWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    /* compiled from: PrayerNotificationWorker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/example/work/PrayerNotificationWorker$Companion;", "", "<init>", "()V", "TAG", "", "KEY_PRAYER_TYPE", "KEY_PRAYER_DISPLAY_NAME", "KEY_PRAYER_ARABIC", "KEY_PRAYER_TIME", "KEY_DISTRICT_ID", "KEY_DISTRICT_NAME", "KEY_MOSQUE_NAME", "getNotificationIdForPrayer", "", "prayerType", "getSpiritualReminder", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/work/PrayerNotificationWorker$Companion.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int getNotificationIdForPrayer(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "prayerType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r0 = r3.toUpperCase(r0)
                java.lang.String r1 = "toUpperCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r1 = r0.hashCode()
                switch(r1) {
                    case 65120: goto L48;
                    case 2150211: goto L3c;
                    case 2256803: goto L30;
                    case 65028379: goto L24;
                    case 1546997590: goto L18;
                    default: goto L17;
                }
            L17:
                goto L54
            L18:
                java.lang.String r1 = "MAGHRIB"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L21
                goto L17
            L21:
                r0 = 1004(0x3ec, float:1.407E-42)
                goto L56
            L24:
                java.lang.String r1 = "DHUHR"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2d
                goto L17
            L2d:
                r0 = 1002(0x3ea, float:1.404E-42)
                goto L56
            L30:
                java.lang.String r1 = "ISHA"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L39
                goto L17
            L39:
                r0 = 1005(0x3ed, float:1.408E-42)
                goto L56
            L3c:
                java.lang.String r1 = "FAJR"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L45
                goto L17
            L45:
                r0 = 1001(0x3e9, float:1.403E-42)
                goto L56
            L48:
                java.lang.String r1 = "ASR"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L51
                goto L17
            L51:
                r0 = 1003(0x3eb, float:1.406E-42)
                goto L56
            L54:
                r0 = 1000(0x3e8, float:1.401E-42)
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.work.PrayerNotificationWorker.Companion.getNotificationIdForPrayer(java.lang.String):int");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[ORIG_RETURN, RETURN] */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String getSpiritualReminder(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "prayerType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r0 = r3.toUpperCase(r0)
                java.lang.String r1 = "toUpperCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r1 = r0.hashCode()
                switch(r1) {
                    case 65120: goto L48;
                    case 2150211: goto L3c;
                    case 2256803: goto L30;
                    case 65028379: goto L24;
                    case 1546997590: goto L18;
                    default: goto L17;
                }
            L17:
                goto L54
            L18:
                java.lang.String r1 = "MAGHRIB"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L21
                goto L17
            L21:
                java.lang.String r0 = "The sun has set across the tea estates and valleys. Hasten to Maghrib prayer and evening dhikr."
                goto L56
            L24:
                java.lang.String r1 = "DHUHR"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2d
                goto L17
            L2d:
                java.lang.String r0 = "The midday sun has declined. Step away from work and affairs to offer Dhuhr in congregation."
                goto L56
            L30:
                java.lang.String r1 = "ISHA"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L39
                goto L17
            L39:
                java.lang.String r0 = "Conclude your day in tranquility. Offering Isha in congregation earns the reward of standing half the night in prayer."
                goto L56
            L3c:
                java.lang.String r1 = "FAJR"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L45
                goto L17
            L45:
                java.lang.String r0 = "الصلاة خير من النوم • 'Prayer is better than sleep.' Whoever prays Fajr in congregation is under the protection of Allah."
                goto L56
            L48:
                java.lang.String r1 = "ASR"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L51
                goto L17
            L51:
                java.lang.String r0 = "حَافِظُوا عَلَى الصَّلَوَاتِ وَالصَّلَاةِ الْوُسْطَىٰ • Guard strictly the middle prayer (Asr). Great reward awaits those steadfast."
                goto L56
            L54:
                java.lang.String r0 = "Hayya 'alas-Salah! Come to prayer, come to success."
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.work.PrayerNotificationWorker.Companion.getSpiritualReminder(java.lang.String):java.lang.String");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:1|2|3|(1:5)|6|(1:8)|9|10|(1:12)(1:57)|13|14|(1:16)(1:56)|17|(1:19)|20|(1:22)|23|(1:25)(1:55)|26|27|28|29|30|(3:31|32|33)|(2:34|35)|36|37|38|39|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015c, code lost:
    
        android.util.Log.w(com.example.work.PrayerNotificationWorker.TAG, "Failed to reschedule next day prayer: " + r0.getMessage());
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r23) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.work.PrayerNotificationWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
