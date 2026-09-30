package com.example.data.model;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrayerModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/example/data/model/PrayerType;", "", "displayName", "", "arabicName", "isFard", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getDisplayName", "()Ljava/lang/String;", "getArabicName", "()Z", "FAJR", "SUNRISE", "DHUHR", "ASR", "MAGHRIB", "ISHA", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/PrayerType.dex */
public enum PrayerType {
    FAJR("Fajr", "الفجر", false, 4, null),
    SUNRISE("Sunrise", "الشروق", false),
    DHUHR("Dhuhr", "الظهر", false, 4, null),
    ASR("Asr", "العصر", false, 4, null),
    MAGHRIB("Maghrib", "المغرب", false, 4, null),
    ISHA("Isha", "العشاء", false, 4, null);


    @NotNull
    private final String arabicName;

    @NotNull
    private final String displayName;
    private final boolean isFard;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    @NotNull
    public static EnumEntries<PrayerType> getEntries() {
        return $ENTRIES;
    }

    PrayerType(String displayName, String arabicName, boolean isFard) {
        this.displayName = displayName;
        this.arabicName = arabicName;
        this.isFard = isFard;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ PrayerType(java.lang.String r9, java.lang.String r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 4
            if (r12 == 0) goto L7
            r11 = 1
            r5 = r11
            goto L8
        L7:
            r5 = r11
        L8:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.model.PrayerType.<init>(java.lang.String, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getArabicName() {
        return this.arabicName;
    }

    /* renamed from: isFard, reason: from getter */
    public final boolean getIsFard() {
        return this.isFard;
    }
}
