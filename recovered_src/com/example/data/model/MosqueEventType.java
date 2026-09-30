package com.example.data.model;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: MosqueModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/example/data/model/MosqueEventType;", "", "label", "", "badgeColorHex", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;J)V", "getLabel", "()Ljava/lang/String;", "getBadgeColorHex", "()J", "JUMMAH", "BAYAN", "JANAZA", "COMMUNITY", "YOUTH", "RAMADAN", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/MosqueEventType.dex */
public enum MosqueEventType {
    JUMMAH("Jummah Khutbah", 4279066178L),
    BAYAN("Bayan & Tafseer", 4278355143L),
    JANAZA("Janaza Notice", 4292617766L),
    COMMUNITY("Community & Charity", 4292441862L),
    YOUTH("Youth & Hadith", 4286331629L),
    RAMADAN("Special Program", 4278556265L);

    private final long badgeColorHex;

    @NotNull
    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    @NotNull
    public static EnumEntries<MosqueEventType> getEntries() {
        return $ENTRIES;
    }

    MosqueEventType(String label, long badgeColorHex) {
        this.label = label;
        this.badgeColorHex = badgeColorHex;
    }

    public final long getBadgeColorHex() {
        return this.badgeColorHex;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }
}
