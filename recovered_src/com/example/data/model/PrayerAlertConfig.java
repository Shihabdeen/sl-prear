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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/example/data/model/PrayerAlertConfig;", "", "prayerType", "Lcom/example/data/model/PrayerType;", "isEnabled", "", "soundType", "Lcom/example/data/model/AlertSoundType;", "preReminderMinutes", "", "<init>", "(Lcom/example/data/model/PrayerType;ZLcom/example/data/model/AlertSoundType;I)V", "getPrayerType", "()Lcom/example/data/model/PrayerType;", "()Z", "getSoundType", "()Lcom/example/data/model/AlertSoundType;", "getPreReminderMinutes", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/PrayerAlertConfig.dex */
public final /* data */ class PrayerAlertConfig {
    public static final int $stable = 0;
    private final boolean isEnabled;

    @NotNull
    private final PrayerType prayerType;
    private final int preReminderMinutes;

    @NotNull
    private final AlertSoundType soundType;

    public static /* synthetic */ PrayerAlertConfig copy$default(PrayerAlertConfig prayerAlertConfig, PrayerType prayerType, boolean z, AlertSoundType alertSoundType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            prayerType = prayerAlertConfig.prayerType;
        }
        if ((i2 & 2) != 0) {
            z = prayerAlertConfig.isEnabled;
        }
        if ((i2 & 4) != 0) {
            alertSoundType = prayerAlertConfig.soundType;
        }
        if ((i2 & 8) != 0) {
            i = prayerAlertConfig.preReminderMinutes;
        }
        return prayerAlertConfig.copy(prayerType, z, alertSoundType, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PrayerType getPrayerType() {
        return this.prayerType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AlertSoundType getSoundType() {
        return this.soundType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPreReminderMinutes() {
        return this.preReminderMinutes;
    }

    @NotNull
    public final PrayerAlertConfig copy(@NotNull PrayerType prayerType, boolean isEnabled, @NotNull AlertSoundType soundType, int preReminderMinutes) {
        Intrinsics.checkNotNullParameter(prayerType, "prayerType");
        Intrinsics.checkNotNullParameter(soundType, "soundType");
        return new PrayerAlertConfig(prayerType, isEnabled, soundType, preReminderMinutes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrayerAlertConfig)) {
            return false;
        }
        PrayerAlertConfig prayerAlertConfig = (PrayerAlertConfig) other;
        return this.prayerType == prayerAlertConfig.prayerType && this.isEnabled == prayerAlertConfig.isEnabled && this.soundType == prayerAlertConfig.soundType && this.preReminderMinutes == prayerAlertConfig.preReminderMinutes;
    }

    public int hashCode() {
        return (((((this.prayerType.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.soundType.hashCode()) * 31) + Integer.hashCode(this.preReminderMinutes);
    }

    @NotNull
    public String toString() {
        return "PrayerAlertConfig(prayerType=" + this.prayerType + ", isEnabled=" + this.isEnabled + ", soundType=" + this.soundType + ", preReminderMinutes=" + this.preReminderMinutes + ")";
    }

    public PrayerAlertConfig(@NotNull PrayerType prayerType, boolean isEnabled, @NotNull AlertSoundType soundType, int preReminderMinutes) {
        Intrinsics.checkNotNullParameter(prayerType, "prayerType");
        Intrinsics.checkNotNullParameter(soundType, "soundType");
        this.prayerType = prayerType;
        this.isEnabled = isEnabled;
        this.soundType = soundType;
        this.preReminderMinutes = preReminderMinutes;
    }

    public /* synthetic */ PrayerAlertConfig(PrayerType prayerType, boolean z, AlertSoundType alertSoundType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(prayerType, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? AlertSoundType.ADHAN_MAKKAH : alertSoundType, (i2 & 8) != 0 ? 10 : i);
    }

    @NotNull
    public final PrayerType getPrayerType() {
        return this.prayerType;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public final AlertSoundType getSoundType() {
        return this.soundType;
    }

    public final int getPreReminderMinutes() {
        return this.preReminderMinutes;
    }
}
