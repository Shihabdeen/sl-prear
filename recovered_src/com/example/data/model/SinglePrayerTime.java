package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrayerModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016¨\u0006#"}, d2 = {"Lcom/example/data/model/SinglePrayerTime;", "", "type", "Lcom/example/data/model/PrayerType;", "hour", "", "minute", "formattedTime", "", "isCompleted", "", "isNext", "isCurrent", "<init>", "(Lcom/example/data/model/PrayerType;IILjava/lang/String;ZZZ)V", "getType", "()Lcom/example/data/model/PrayerType;", "getHour", "()I", "getMinute", "getFormattedTime", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/SinglePrayerTime.dex */
public final /* data */ class SinglePrayerTime {
    public static final int $stable = 0;

    @NotNull
    private final String formattedTime;
    private final int hour;
    private final boolean isCompleted;
    private final boolean isCurrent;
    private final boolean isNext;
    private final int minute;

    @NotNull
    private final PrayerType type;

    public static /* synthetic */ SinglePrayerTime copy$default(SinglePrayerTime singlePrayerTime, PrayerType prayerType, int i, int i2, String str, boolean z, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            prayerType = singlePrayerTime.type;
        }
        if ((i3 & 2) != 0) {
            i = singlePrayerTime.hour;
        }
        if ((i3 & 4) != 0) {
            i2 = singlePrayerTime.minute;
        }
        if ((i3 & 8) != 0) {
            str = singlePrayerTime.formattedTime;
        }
        if ((i3 & 16) != 0) {
            z = singlePrayerTime.isCompleted;
        }
        if ((i3 & 32) != 0) {
            z2 = singlePrayerTime.isNext;
        }
        if ((i3 & 64) != 0) {
            z3 = singlePrayerTime.isCurrent;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        int i4 = i2;
        return singlePrayerTime.copy(prayerType, i, i4, str, z6, z4, z5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PrayerType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFormattedTime() {
        return this.formattedTime;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsNext() {
        return this.isNext;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    @NotNull
    public final SinglePrayerTime copy(@NotNull PrayerType type, int hour, int minute, @NotNull String formattedTime, boolean isCompleted, boolean isNext, boolean isCurrent) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(formattedTime, "formattedTime");
        return new SinglePrayerTime(type, hour, minute, formattedTime, isCompleted, isNext, isCurrent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SinglePrayerTime)) {
            return false;
        }
        SinglePrayerTime singlePrayerTime = (SinglePrayerTime) other;
        return this.type == singlePrayerTime.type && this.hour == singlePrayerTime.hour && this.minute == singlePrayerTime.minute && Intrinsics.areEqual(this.formattedTime, singlePrayerTime.formattedTime) && this.isCompleted == singlePrayerTime.isCompleted && this.isNext == singlePrayerTime.isNext && this.isCurrent == singlePrayerTime.isCurrent;
    }

    public int hashCode() {
        return (((((((((((this.type.hashCode() * 31) + Integer.hashCode(this.hour)) * 31) + Integer.hashCode(this.minute)) * 31) + this.formattedTime.hashCode()) * 31) + Boolean.hashCode(this.isCompleted)) * 31) + Boolean.hashCode(this.isNext)) * 31) + Boolean.hashCode(this.isCurrent);
    }

    @NotNull
    public String toString() {
        return "SinglePrayerTime(type=" + this.type + ", hour=" + this.hour + ", minute=" + this.minute + ", formattedTime=" + this.formattedTime + ", isCompleted=" + this.isCompleted + ", isNext=" + this.isNext + ", isCurrent=" + this.isCurrent + ")";
    }

    public SinglePrayerTime(@NotNull PrayerType type, int hour, int minute, @NotNull String formattedTime, boolean isCompleted, boolean isNext, boolean isCurrent) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(formattedTime, "formattedTime");
        this.type = type;
        this.hour = hour;
        this.minute = minute;
        this.formattedTime = formattedTime;
        this.isCompleted = isCompleted;
        this.isNext = isNext;
        this.isCurrent = isCurrent;
    }

    public /* synthetic */ SinglePrayerTime(PrayerType prayerType, int i, int i2, String str, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(prayerType, i, i2, str, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3);
    }

    @NotNull
    public final PrayerType getType() {
        return this.type;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    @NotNull
    public final String getFormattedTime() {
        return this.formattedTime;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isNext() {
        return this.isNext;
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }
}
