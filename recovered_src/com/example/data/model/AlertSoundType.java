package com.example.data.model;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrayerModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/example/data/model/AlertSoundType;", "", "displayName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "ADHAN_MAKKAH", "TAKBEER", "CHIME", "VIBRATE", "SILENT", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/AlertSoundType.dex */
public enum AlertSoundType {
    ADHAN_MAKKAH("Adhan (Makkah)"),
    TAKBEER("Takbeer"),
    CHIME("Gentle Chime"),
    VIBRATE("Vibrate Only"),
    SILENT("Off / Silent");


    @NotNull
    private final String displayName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    @NotNull
    public static EnumEntries<AlertSoundType> getEntries() {
        return $ENTRIES;
    }

    AlertSoundType(String displayName) {
        this.displayName = displayName;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }
}
