package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrayerModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000fHÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/example/data/model/DayPrayerSchedule;", "", "district", "Lcom/example/data/model/District;", "gregorianDate", "", "hijriDate", "prayers", "", "Lcom/example/data/model/SinglePrayerTime;", "nextPrayer", "remainingTimeFormatted", "progressPercent", "", "completedPrayersCount", "", "<init>", "(Lcom/example/data/model/District;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/data/model/SinglePrayerTime;Ljava/lang/String;FI)V", "getDistrict", "()Lcom/example/data/model/District;", "getGregorianDate", "()Ljava/lang/String;", "getHijriDate", "getPrayers", "()Ljava/util/List;", "getNextPrayer", "()Lcom/example/data/model/SinglePrayerTime;", "getRemainingTimeFormatted", "getProgressPercent", "()F", "getCompletedPrayersCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/DayPrayerSchedule.dex */
public final /* data */ class DayPrayerSchedule {
    public static final int $stable = 8;
    private final int completedPrayersCount;

    @NotNull
    private final District district;

    @NotNull
    private final String gregorianDate;

    @NotNull
    private final String hijriDate;

    @Nullable
    private final SinglePrayerTime nextPrayer;

    @NotNull
    private final List<SinglePrayerTime> prayers;
    private final float progressPercent;

    @NotNull
    private final String remainingTimeFormatted;

    public static /* synthetic */ DayPrayerSchedule copy$default(DayPrayerSchedule dayPrayerSchedule, District district, String str, String str2, List list, SinglePrayerTime singlePrayerTime, String str3, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            district = dayPrayerSchedule.district;
        }
        if ((i2 & 2) != 0) {
            str = dayPrayerSchedule.gregorianDate;
        }
        if ((i2 & 4) != 0) {
            str2 = dayPrayerSchedule.hijriDate;
        }
        if ((i2 & 8) != 0) {
            list = dayPrayerSchedule.prayers;
        }
        if ((i2 & 16) != 0) {
            singlePrayerTime = dayPrayerSchedule.nextPrayer;
        }
        if ((i2 & 32) != 0) {
            str3 = dayPrayerSchedule.remainingTimeFormatted;
        }
        if ((i2 & 64) != 0) {
            f = dayPrayerSchedule.progressPercent;
        }
        if ((i2 & 128) != 0) {
            i = dayPrayerSchedule.completedPrayersCount;
        }
        float f2 = f;
        int i3 = i;
        SinglePrayerTime singlePrayerTime2 = singlePrayerTime;
        String str4 = str3;
        return dayPrayerSchedule.copy(district, str, str2, list, singlePrayerTime2, str4, f2, i3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final District getDistrict() {
        return this.district;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGregorianDate() {
        return this.gregorianDate;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHijriDate() {
        return this.hijriDate;
    }

    @NotNull
    public final List<SinglePrayerTime> component4() {
        return this.prayers;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final SinglePrayerTime getNextPrayer() {
        return this.nextPrayer;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRemainingTimeFormatted() {
        return this.remainingTimeFormatted;
    }

    /* renamed from: component7, reason: from getter */
    public final float getProgressPercent() {
        return this.progressPercent;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCompletedPrayersCount() {
        return this.completedPrayersCount;
    }

    @NotNull
    public final DayPrayerSchedule copy(@NotNull District district, @NotNull String gregorianDate, @NotNull String hijriDate, @NotNull List<SinglePrayerTime> prayers, @Nullable SinglePrayerTime nextPrayer, @NotNull String remainingTimeFormatted, float progressPercent, int completedPrayersCount) {
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(gregorianDate, "gregorianDate");
        Intrinsics.checkNotNullParameter(hijriDate, "hijriDate");
        Intrinsics.checkNotNullParameter(prayers, "prayers");
        Intrinsics.checkNotNullParameter(remainingTimeFormatted, "remainingTimeFormatted");
        return new DayPrayerSchedule(district, gregorianDate, hijriDate, prayers, nextPrayer, remainingTimeFormatted, progressPercent, completedPrayersCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayPrayerSchedule)) {
            return false;
        }
        DayPrayerSchedule dayPrayerSchedule = (DayPrayerSchedule) other;
        return Intrinsics.areEqual(this.district, dayPrayerSchedule.district) && Intrinsics.areEqual(this.gregorianDate, dayPrayerSchedule.gregorianDate) && Intrinsics.areEqual(this.hijriDate, dayPrayerSchedule.hijriDate) && Intrinsics.areEqual(this.prayers, dayPrayerSchedule.prayers) && Intrinsics.areEqual(this.nextPrayer, dayPrayerSchedule.nextPrayer) && Intrinsics.areEqual(this.remainingTimeFormatted, dayPrayerSchedule.remainingTimeFormatted) && Float.compare(this.progressPercent, dayPrayerSchedule.progressPercent) == 0 && this.completedPrayersCount == dayPrayerSchedule.completedPrayersCount;
    }

    public int hashCode() {
        return (((((((((((((this.district.hashCode() * 31) + this.gregorianDate.hashCode()) * 31) + this.hijriDate.hashCode()) * 31) + this.prayers.hashCode()) * 31) + (this.nextPrayer == null ? 0 : this.nextPrayer.hashCode())) * 31) + this.remainingTimeFormatted.hashCode()) * 31) + Float.hashCode(this.progressPercent)) * 31) + Integer.hashCode(this.completedPrayersCount);
    }

    @NotNull
    public String toString() {
        return "DayPrayerSchedule(district=" + this.district + ", gregorianDate=" + this.gregorianDate + ", hijriDate=" + this.hijriDate + ", prayers=" + this.prayers + ", nextPrayer=" + this.nextPrayer + ", remainingTimeFormatted=" + this.remainingTimeFormatted + ", progressPercent=" + this.progressPercent + ", completedPrayersCount=" + this.completedPrayersCount + ")";
    }

    public DayPrayerSchedule(@NotNull District district, @NotNull String gregorianDate, @NotNull String hijriDate, @NotNull List<SinglePrayerTime> list, @Nullable SinglePrayerTime nextPrayer, @NotNull String remainingTimeFormatted, float progressPercent, int completedPrayersCount) {
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(gregorianDate, "gregorianDate");
        Intrinsics.checkNotNullParameter(hijriDate, "hijriDate");
        Intrinsics.checkNotNullParameter(list, "prayers");
        Intrinsics.checkNotNullParameter(remainingTimeFormatted, "remainingTimeFormatted");
        this.district = district;
        this.gregorianDate = gregorianDate;
        this.hijriDate = hijriDate;
        this.prayers = list;
        this.nextPrayer = nextPrayer;
        this.remainingTimeFormatted = remainingTimeFormatted;
        this.progressPercent = progressPercent;
        this.completedPrayersCount = completedPrayersCount;
    }

    @NotNull
    public final District getDistrict() {
        return this.district;
    }

    @NotNull
    public final String getGregorianDate() {
        return this.gregorianDate;
    }

    @NotNull
    public final String getHijriDate() {
        return this.hijriDate;
    }

    @NotNull
    public final List<SinglePrayerTime> getPrayers() {
        return this.prayers;
    }

    @Nullable
    public final SinglePrayerTime getNextPrayer() {
        return this.nextPrayer;
    }

    @NotNull
    public final String getRemainingTimeFormatted() {
        return this.remainingTimeFormatted;
    }

    public final float getProgressPercent() {
        return this.progressPercent;
    }

    public final int getCompletedPrayersCount() {
        return this.completedPrayersCount;
    }
}
