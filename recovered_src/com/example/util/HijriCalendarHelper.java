package com.example.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HijriCalendarHelper.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/util/HijriCalendarHelper;", "", "<init>", "()V", "hijriMonths", "", "", "hijriMonthsArabic", "getHijriDate", "Lcom/example/util/HijriCalendarHelper$HijriDate;", "calendar", "Ljava/util/Calendar;", "HijriDate", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/HijriCalendarHelper.dex */
public final class HijriCalendarHelper {

    @NotNull
    public static final HijriCalendarHelper INSTANCE = new HijriCalendarHelper();

    @NotNull
    private static final List<String> hijriMonths = CollectionsKt.listOf(new String[]{"Muharram", "Safar", "Rabi' al-Awwal", "Rabi' al-Thani", "Jumada al-Awwal", "Jumada al-Thani", "Rajab", "Sha'ban", "Ramadan", "Shawwal", "Dhu al-Qi'dah", "Dhu al-Hijjah"});

    @NotNull
    private static final List<String> hijriMonthsArabic = CollectionsKt.listOf(new String[]{"مُحَرَّم", "صَفَر", "رَبِيع الأَوَّل", "رَبِيع الآخِر", "جُمَادَى الأُولَى", "جُمَادَى الآخِرَة", "رَجَب", "شَعْبَان", "رَمَضَان", "شَوَّال", "ذُو القَعْدَة", "ذُو الحِجَّة"});
    public static final int $stable = 8;

    private HijriCalendarHelper() {
    }

    /* compiled from: HijriCalendarHelper.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/example/util/HijriCalendarHelper$HijriDate;", "", "day", "", "monthIndex", "monthName", "", "monthArabic", "year", "<init>", "(IILjava/lang/String;Ljava/lang/String;I)V", "getDay", "()I", "getMonthIndex", "getMonthName", "()Ljava/lang/String;", "getMonthArabic", "getYear", "toFormattedString", "toArabicString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/HijriCalendarHelper$HijriDate.dex */
    public static final /* data */ class HijriDate {
        public static final int $stable = 0;
        private final int day;

        @NotNull
        private final String monthArabic;
        private final int monthIndex;

        @NotNull
        private final String monthName;
        private final int year;

        public static /* synthetic */ HijriDate copy$default(HijriDate hijriDate, int i, int i2, String str, String str2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = hijriDate.day;
            }
            if ((i4 & 2) != 0) {
                i2 = hijriDate.monthIndex;
            }
            if ((i4 & 4) != 0) {
                str = hijriDate.monthName;
            }
            if ((i4 & 8) != 0) {
                str2 = hijriDate.monthArabic;
            }
            if ((i4 & 16) != 0) {
                i3 = hijriDate.year;
            }
            int i5 = i3;
            String str3 = str;
            return hijriDate.copy(i, i2, str3, str2, i5);
        }

        /* renamed from: component1 */
        public final int getDay() {
            return this.day;
        }

        /* renamed from: component2 */
        public final int getMonthIndex() {
            return this.monthIndex;
        }

        @NotNull
        /* renamed from: component3 */
        public final String getMonthName() {
            return this.monthName;
        }

        @NotNull
        /* renamed from: component4 */
        public final String getMonthArabic() {
            return this.monthArabic;
        }

        /* renamed from: component5 */
        public final int getYear() {
            return this.year;
        }

        @NotNull
        public final HijriDate copy(int i, int i2, @NotNull String str, @NotNull String str2, int i3) {
            Intrinsics.checkNotNullParameter(str, "monthName");
            Intrinsics.checkNotNullParameter(str2, "monthArabic");
            return new HijriDate(i, i2, str, str2, i3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HijriDate)) {
                return false;
            }
            HijriDate hijriDate = (HijriDate) obj;
            return this.day == hijriDate.day && this.monthIndex == hijriDate.monthIndex && Intrinsics.areEqual(this.monthName, hijriDate.monthName) && Intrinsics.areEqual(this.monthArabic, hijriDate.monthArabic) && this.year == hijriDate.year;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.day) * 31) + Integer.hashCode(this.monthIndex)) * 31) + this.monthName.hashCode()) * 31) + this.monthArabic.hashCode()) * 31) + Integer.hashCode(this.year);
        }

        @NotNull
        public String toString() {
            return "HijriDate(day=" + this.day + ", monthIndex=" + this.monthIndex + ", monthName=" + this.monthName + ", monthArabic=" + this.monthArabic + ", year=" + this.year + ")";
        }

        public HijriDate(int day, int monthIndex, @NotNull String monthName, @NotNull String monthArabic, int year) {
            Intrinsics.checkNotNullParameter(monthName, "monthName");
            Intrinsics.checkNotNullParameter(monthArabic, "monthArabic");
            this.day = day;
            this.monthIndex = monthIndex;
            this.monthName = monthName;
            this.monthArabic = monthArabic;
            this.year = year;
        }

        public final int getDay() {
            return this.day;
        }

        public final int getMonthIndex() {
            return this.monthIndex;
        }

        @NotNull
        public final String getMonthName() {
            return this.monthName;
        }

        @NotNull
        public final String getMonthArabic() {
            return this.monthArabic;
        }

        public final int getYear() {
            return this.year;
        }

        @NotNull
        public final String toFormattedString() {
            return this.day + " " + this.monthName + " " + this.year + " AH";
        }

        @NotNull
        public final String toArabicString() {
            return this.day + " " + this.monthArabic + " " + this.year + " هـ";
        }
    }

    public static /* synthetic */ HijriDate getHijriDate$default(HijriCalendarHelper hijriCalendarHelper, Calendar calendar, int i, Object obj) {
        if ((i & 1) != 0) {
            calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        }
        return hijriCalendarHelper.getHijriDate(calendar);
    }

    @NotNull
    public final HijriDate getHijriDate(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        int day = calendar.get(5);
        int month = calendar.get(2) + 1;
        int year = calendar.get(1);
        int m = month;
        int y = year;
        if (m < 3) {
            y--;
            m += 12;
        }
        double a = Math.floor(y / 100.0d);
        double b = (2.0d - a) + Math.floor(a / 4.0d);
        double jd = (((Math.floor((y + 4716) * 365.25d) + Math.floor((m + 1) * 30.6001d)) + day) + b) - 1524.0d;
        double z = jd - 1948439.5d;
        double cyc = Math.floor(z / 10631.0d);
        double rem = z - (10631.0d * cyc);
        double j = Math.floor((rem - 0.5d) / 354.366d);
        int hYear = (int) ((30.0d * cyc) + j + 1.0d);
        double r = rem - Math.floor((354.366d * j) + 0.5d);
        int hMonth = RangesKt.coerceIn((int) Math.floor((r + 28.5d) / 29.5d), 1, 12);
        int hDay = RangesKt.coerceIn((int) ((r - Math.floor((hMonth - 1) * 29.5d)) + 1.0d), 1, 30);
        int monthIdx = RangesKt.coerceIn(hMonth - 1, 0, 11);
        return new HijriDate(hDay, monthIdx, hijriMonths.get(monthIdx), hijriMonthsArabic.get(monthIdx), hYear);
    }
}
