package com.example.util;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.example.BuildConfig;
import com.example.MainActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationHelper.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005JN\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J.\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/example/util/NotificationHelper;", "", "<init>", "()V", "PRAYER_CHANNEL_ID", "", "MOSQUE_CHANNEL_ID", "createNotificationChannels", "", "context", "Landroid/content/Context;", "sendPrayerAlertNotification", "prayerName", "timeFormatted", "districtName", "sendPrayerTimeNotification", "prayerArabic", "mosqueName", "hijriDateFormatted", "spiritualReminder", "notificationId", "", "sendMosqueEventNotification", "title", "time", "address", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/NotificationHelper.dex */
public final class NotificationHelper {
    public static final int $stable = 0;

    @NotNull
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    @NotNull
    public static final String MOSQUE_CHANNEL_ID = "sl_mosque_events_channel";

    @NotNull
    public static final String PRAYER_CHANNEL_ID = "sl_prayer_adhan_channel";

    private NotificationHelper() {
    }

    public final void createNotificationChannels(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            NotificationChannel prayerChannel = new NotificationChannel(PRAYER_CHANNEL_ID, "Sri Lanka Prayer Times & Adhan", 4);
            prayerChannel.setDescription("Alerts for Fajr, Dhuhr, Asr, Maghrib, and Isha prayer times in Sri Lanka");
            prayerChannel.enableVibration(true);
            prayerChannel.enableLights(true);
            NotificationChannel mosqueChannel = new NotificationChannel(MOSQUE_CHANNEL_ID, "Local Mosque Community Events", 3);
            mosqueChannel.setDescription("Reminders for Jummah Khutbah, Bayans, Taraweeh, and local mosque programs");
            mosqueChannel.enableVibration(true);
            notificationManager.createNotificationChannel(prayerChannel);
            notificationManager.createNotificationChannel(mosqueChannel);
        }
    }

    public final void sendPrayerAlertNotification(@NotNull Context context, @NotNull String prayerName, @NotNull String timeFormatted, @NotNull String districtName) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prayerName, "prayerName");
        Intrinsics.checkNotNullParameter(timeFormatted, "timeFormatted");
        Intrinsics.checkNotNullParameter(districtName, "districtName");
        if (StringsKt.contains(districtName, "Hatton", true) || StringsKt.contains(districtName, "Bogawantalawa", true)) {
            str = "Bogawantalawa Town Jummah Mosque / Hatton Mosque";
        } else {
            str = districtName + " Grand Mosque";
        }
        sendPrayerTimeNotification(context, prayerName, "", timeFormatted, districtName, str, HijriCalendarHelper.getHijriDate$default(HijriCalendarHelper.INSTANCE, null, 1, null).toFormattedString(), "Hayya 'alas-Salah! Success is in prayer.", 201);
    }

    public final void sendPrayerTimeNotification(@NotNull Context context, @NotNull String prayerName, @NotNull String prayerArabic, @NotNull String timeFormatted, @NotNull String districtName, @NotNull String mosqueName, @NotNull String hijriDateFormatted, @NotNull String spiritualReminder, int notificationId) {
        String titleDisplay;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prayerName, "prayerName");
        Intrinsics.checkNotNullParameter(prayerArabic, "prayerArabic");
        Intrinsics.checkNotNullParameter(timeFormatted, "timeFormatted");
        Intrinsics.checkNotNullParameter(districtName, "districtName");
        Intrinsics.checkNotNullParameter(mosqueName, "mosqueName");
        Intrinsics.checkNotNullParameter(hijriDateFormatted, "hijriDateFormatted");
        Intrinsics.checkNotNullParameter(spiritualReminder, "spiritualReminder");
        createNotificationChannels(context);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("EXTRA_PRAYER_NAME", prayerName);
        intent.putExtra("EXTRA_FROM_NOTIFICATION", true);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, notificationId, intent, 201326592);
        if (!StringsKt.isBlank(prayerArabic)) {
            titleDisplay = "🕌 " + prayerName + " (" + prayerArabic + ") • " + timeFormatted;
        } else {
            titleDisplay = "🕌 " + prayerName + " Prayer • " + timeFormatted;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("⏰ Adhan Time: " + timeFormatted + "\n");
        sb.append("📅 Hijri Date: " + hijriDateFormatted + "\n");
        sb.append("📍 Local Mosque: " + mosqueName + "\n");
        sb.append("✨ " + spiritualReminder);
        String bigTextContent = sb.toString();
        Intent stopIntent = new Intent(context, (Class<?>) StopAdhanReceiver.class);
        stopIntent.setAction("com.example.ACTION_STOP_ADHAN");
        PendingIntent stopPendingIntent = PendingIntent.getBroadcast(context, notificationId + 500, stopIntent, 201326592);
        Notification notification = new NotificationCompat.Builder(context, PRAYER_CHANNEL_ID).setSmallIcon(R.drawable.ic_lock_idle_alarm).setContentTitle(titleDisplay).setContentText("Time for " + prayerName + " prayer at " + mosqueName + " (" + timeFormatted + ")").setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(titleDisplay).bigText(bigTextContent).setSummaryText(hijriDateFormatted)).setPriority(1).setCategory("alarm").setContentIntent(pendingIntent).setAutoCancel(true).addAction(R.drawable.ic_lock_silent_mode_off, "Stop Azan 🔇", stopPendingIntent).addAction(R.drawable.ic_menu_compass, "Open App 🕌", pendingIntent).build();
        Intrinsics.checkNotNullExpressionValue(notification, "build(...)");
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.notify(notificationId, notification);
    }

    public final void sendMosqueEventNotification(@NotNull Context context, @NotNull String mosqueName, @NotNull String title, @NotNull String time, @NotNull String address) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mosqueName, "mosqueName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(address, "address");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 102, intent, 201326592);
        Notification notification = new NotificationCompat.Builder(context, MOSQUE_CHANNEL_ID).setSmallIcon(R.drawable.ic_popup_reminder).setContentTitle("📢 " + mosqueName + " Reminder").setContentText(title + " — " + time + " (" + address + ")").setStyle(new NotificationCompat.BigTextStyle().bigText(title + "\nTime: " + time + "\nLocation: " + address + "\n" + mosqueName)).setPriority(0).setContentIntent(pendingIntent).setAutoCancel(true).build();
        Intrinsics.checkNotNullExpressionValue(notification, "build(...)");
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        int notifId = ((int) (System.currentTimeMillis() % 10000)) + 300;
        notificationManager.notify(notifId, notification);
    }
}
