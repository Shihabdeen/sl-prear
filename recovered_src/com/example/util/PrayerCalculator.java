package com.example.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import com.example.data.model.District;
import com.example.data.model.PrayerType;
import com.example.data.model.SinglePrayerTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrayerCalculator.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J \u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J \u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/example/util/PrayerCalculator;", "", "<init>", "()V", "FAJR_ANGLE", "", "ISHA_ANGLE", "TIMEZONE_OFFSET_HOURS", "calculatePrayerTimes", "", "Lcom/example/data/model/SinglePrayerTime;", "district", "Lcom/example/data/model/District;", "calendar", "Ljava/util/Calendar;", "toSinglePrayerTime", "type", "Lcom/example/data/model/PrayerType;", "decimalHours", "computeRawTimes", "Lcom/example/util/PrayerCalculator$RawTimes;", "year", "", "month", "day", "latitude", "longitude", "timeZone", "sunAngleTime", "declination", "angle", "julianDate", "fixAngle", "fixHour", "hour", "degToRad", "deg", "radToDeg", "rad", "RawTimes", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/PrayerCalculator.dex */
public final class PrayerCalculator {
    public static final int $stable = 0;
    private static final double FAJR_ANGLE = 18.0d;

    @NotNull
    public static final PrayerCalculator INSTANCE = new PrayerCalculator();
    private static final double ISHA_ANGLE = 18.0d;
    private static final double TIMEZONE_OFFSET_HOURS = 5.5d;

    private PrayerCalculator() {
    }

    /* compiled from: PrayerCalculator.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/example/util/PrayerCalculator$RawTimes;", "", "fajrHours", "", "sunriseHours", "dhuhrHours", "asrHours", "maghribHours", "ishaHours", "<init>", "(DDDDDD)V", "getFajrHours", "()D", "getSunriseHours", "getDhuhrHours", "getAsrHours", "getMaghribHours", "getIshaHours", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/PrayerCalculator$RawTimes.dex */
    public static final /* data */ class RawTimes {
        public static final int $stable = 0;
        private final double asrHours;
        private final double dhuhrHours;
        private final double fajrHours;
        private final double ishaHours;
        private final double maghribHours;
        private final double sunriseHours;

        public static /* synthetic */ RawTimes copy$default(RawTimes rawTimes, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
            if ((i & 1) != 0) {
                d = rawTimes.fajrHours;
            }
            return rawTimes.copy(d, (i & 2) != 0 ? rawTimes.sunriseHours : d2, (i & 4) != 0 ? rawTimes.dhuhrHours : d3, (i & 8) != 0 ? rawTimes.asrHours : d4, (i & 16) != 0 ? rawTimes.maghribHours : d5, (i & 32) != 0 ? rawTimes.ishaHours : d6);
        }

        /* renamed from: component1, reason: from getter */
        public final double getFajrHours() {
            return this.fajrHours;
        }

        /* renamed from: component2, reason: from getter */
        public final double getSunriseHours() {
            return this.sunriseHours;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDhuhrHours() {
            return this.dhuhrHours;
        }

        /* renamed from: component4, reason: from getter */
        public final double getAsrHours() {
            return this.asrHours;
        }

        /* renamed from: component5, reason: from getter */
        public final double getMaghribHours() {
            return this.maghribHours;
        }

        /* renamed from: component6, reason: from getter */
        public final double getIshaHours() {
            return this.ishaHours;
        }

        @NotNull
        public final RawTimes copy(double fajrHours, double sunriseHours, double dhuhrHours, double asrHours, double maghribHours, double ishaHours) {
            return new RawTimes(fajrHours, sunriseHours, dhuhrHours, asrHours, maghribHours, ishaHours);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RawTimes)) {
                return false;
            }
            RawTimes rawTimes = (RawTimes) other;
            return Double.compare(this.fajrHours, rawTimes.fajrHours) == 0 && Double.compare(this.sunriseHours, rawTimes.sunriseHours) == 0 && Double.compare(this.dhuhrHours, rawTimes.dhuhrHours) == 0 && Double.compare(this.asrHours, rawTimes.asrHours) == 0 && Double.compare(this.maghribHours, rawTimes.maghribHours) == 0 && Double.compare(this.ishaHours, rawTimes.ishaHours) == 0;
        }

        public int hashCode() {
            return (((((((((Double.hashCode(this.fajrHours) * 31) + Double.hashCode(this.sunriseHours)) * 31) + Double.hashCode(this.dhuhrHours)) * 31) + Double.hashCode(this.asrHours)) * 31) + Double.hashCode(this.maghribHours)) * 31) + Double.hashCode(this.ishaHours);
        }

        @NotNull
        public String toString() {
            return "RawTimes(fajrHours=" + this.fajrHours + ", sunriseHours=" + this.sunriseHours + ", dhuhrHours=" + this.dhuhrHours + ", asrHours=" + this.asrHours + ", maghribHours=" + this.maghribHours + ", ishaHours=" + this.ishaHours + ")";
        }

        public RawTimes(double fajrHours, double sunriseHours, double dhuhrHours, double asrHours, double maghribHours, double ishaHours) {
            this.fajrHours = fajrHours;
            this.sunriseHours = sunriseHours;
            this.dhuhrHours = dhuhrHours;
            this.asrHours = asrHours;
            this.maghribHours = maghribHours;
            this.ishaHours = ishaHours;
        }

        public final double getFajrHours() {
            return this.fajrHours;
        }

        public final double getSunriseHours() {
            return this.sunriseHours;
        }

        public final double getDhuhrHours() {
            return this.dhuhrHours;
        }

        public final double getAsrHours() {
            return this.asrHours;
        }

        public final double getMaghribHours() {
            return this.maghribHours;
        }

        public final double getIshaHours() {
            return this.ishaHours;
        }
    }

    public static /* synthetic */ List calculatePrayerTimes$default(PrayerCalculator prayerCalculator, District district, Calendar calendar, int i, Object obj) {
        if ((i & 2) != 0) {
            calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        }
        return prayerCalculator.calculatePrayerTimes(district, calendar);
    }

    @NotNull
    public final List<SinglePrayerTime> calculatePrayerTimes(@NotNull District district, @NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        int year = calendar.get(1);
        int month = calendar.get(2) + 1;
        int day = calendar.get(5);
        RawTimes times = computeRawTimes(year, month, day, district.getLatitude(), district.getLongitude(), TIMEZONE_OFFSET_HOURS);
        return CollectionsKt.listOf(new SinglePrayerTime[]{toSinglePrayerTime(PrayerType.FAJR, times.getFajrHours()), toSinglePrayerTime(PrayerType.SUNRISE, times.getSunriseHours()), toSinglePrayerTime(PrayerType.DHUHR, times.getDhuhrHours()), toSinglePrayerTime(PrayerType.ASR, times.getAsrHours()), toSinglePrayerTime(PrayerType.MAGHRIB, times.getMaghribHours()), toSinglePrayerTime(PrayerType.ISHA, times.getIshaHours())});
    }

    private final SinglePrayerTime toSinglePrayerTime(PrayerType type, double decimalHours) {
        int hourInt;
        int minuteInt;
        double hours = decimalHours % 24.0d;
        if (hours < 0.0d) {
            hours += 24.0d;
        }
        int hourInt2 = (int) hours;
        int minuteInt2 = (int) Math.round((hours - hourInt2) * 60.0d);
        if (minuteInt2 < 60) {
            hourInt = hourInt2;
            minuteInt = minuteInt2;
        } else {
            hourInt = (hourInt2 + 1) % 24;
            minuteInt = 0;
        }
        int displayHour = 12;
        String period = hourInt >= 12 ? "PM" : "AM";
        if (hourInt != 0) {
            displayHour = hourInt > 12 ? hourInt - 12 : hourInt;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String formatted = String.format(Locale.US, "%02d:%02d %s", Arrays.copyOf(new Object[]{Integer.valueOf(displayHour), Integer.valueOf(minuteInt), period}, 3));
        Intrinsics.checkNotNullExpressionValue(formatted, "format(...)");
        return new SinglePrayerTime(type, hourInt, minuteInt, formatted, false, false, false, 112, null);
    }

    private final RawTimes computeRawTimes(int year, int month, int day, double latitude, double longitude, double timeZone) {
        double julianDate = julianDate(year, month, day) - (longitude / 360.0d);
        double d = julianDate - 2451545.0d;
        double g = fixAngle((0.98560028d * d) + 357.529d);
        double q = fixAngle((0.98564736d * d) + 280.459d);
        double l = fixAngle((Math.sin(degToRad(g)) * 1.915d) + q + (Math.sin(degToRad(2.0d * g)) * 0.02d));
        double e = 23.439d - (3.6E-7d * d);
        double declination = radToDeg(Math.asin(Math.sin(degToRad(e)) * Math.sin(degToRad(l))));
        double ra = fixHour(radToDeg(Math.atan2(Math.sin(degToRad(l)) * Math.cos(degToRad(e)), Math.cos(degToRad(l)))) / 15.0d);
        double eqOfTime = (q / 15.0d) - ra;
        if (eqOfTime > 12.0d) {
            eqOfTime -= 24.0d;
        }
        if (eqOfTime < -12.0d) {
            eqOfTime += 24.0d;
        }
        double noon = fixHour(((timeZone + 12.0d) - (longitude / 15.0d)) - eqOfTime);
        double sunriseDiff = sunAngleTime(latitude, declination, 0.833d + 90.0d);
        double sunrise = fixHour(noon - sunriseDiff);
        double sunset = fixHour(noon + sunriseDiff);
        double fajrDiff = sunAngleTime(latitude, declination, 108.0d);
        double fajr = fixHour(noon - fajrDiff);
        double ishaDiff = sunAngleTime(latitude, declination, 108.0d);
        double isha = fixHour(noon + ishaDiff);
        double asrAltitude = radToDeg(Math.atan(1.0d / (1.0d + Math.tan(degToRad(Math.abs(latitude - declination))))));
        double asrDiff = sunAngleTime(latitude, declination, 90.0d - asrAltitude);
        double asr = fixHour(noon + asrDiff);
        return new RawTimes(fajr, sunrise, noon, asr, sunset, isha);
    }

    private final double sunAngleTime(double latitude, double declination, double angle) {
        double cosHourAngle = (Math.cos(degToRad(angle)) - (Math.sin(degToRad(latitude)) * Math.sin(degToRad(declination)))) / (Math.cos(degToRad(latitude)) * Math.cos(degToRad(declination)));
        if (cosHourAngle > 1.0d || cosHourAngle < -1.0d) {
            return 0.0d;
        }
        return radToDeg(Math.acos(cosHourAngle)) / 15.0d;
    }

    private final double julianDate(int year, int month, int day) {
        int y = year;
        int m = month;
        if (m <= 2) {
            y--;
            m += 12;
        }
        double a = Math.floor(y / 100.0d);
        double b = (2.0d - a) + Math.floor(a / 4.0d);
        return (((Math.floor((y + 4716) * 365.25d) + Math.floor((m + 1) * 30.6001d)) + day) + b) - 1524.5d;
    }

    private final double fixAngle(double angle) {
        double a = angle - (Math.floor(angle / 360.0d) * 360.0d);
        if (a < 0.0d) {
            return a + 360.0d;
        }
        return a;
    }

    private final double fixHour(double hour) {
        double h = hour - (Math.floor(hour / 24.0d) * 24.0d);
        if (h < 0.0d) {
            return h + 24.0d;
        }
        return h;
    }

    private final double degToRad(double deg) {
        return (3.141592653589793d * deg) / 180.0d;
    }

    private final double radToDeg(double rad) {
        return (180.0d * rad) / 3.141592653589793d;
    }
}
