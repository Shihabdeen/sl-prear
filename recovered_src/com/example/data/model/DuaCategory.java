package com.example.data.model;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DuaModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/example/data/model/DuaCategory;", "", "displayNameEn", "", "displayNameTa", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDisplayNameEn", "()Ljava/lang/String;", "getDisplayNameTa", "ALL", "MORNING_EVENING", "SALAH", "DAILY", "PROTECTION", "FORGIVENESS", "QURANIC", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/DuaCategory.dex */
public enum DuaCategory {
    ALL("All Duas", "அனைத்து துஆக்கள்"),
    MORNING_EVENING("Morning & Evening", "காலை & மாலை"),
    SALAH("Salah & Prayer", "தொழுகை & தஸ்பீஹ்"),
    DAILY("Daily Life", "தினசரி வழக்கம்"),
    PROTECTION("Protection & Relief", "பாதுகாப்பு & நிவாரணம்"),
    FORGIVENESS("Istighfar & Mercy", "பாவமன்னிப்பு & தவ்பா"),
    QURANIC("Quranic Duas", "குர்ஆன் துஆக்கள்");


    @NotNull
    private final String displayNameEn;

    @NotNull
    private final String displayNameTa;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    @NotNull
    public static EnumEntries<DuaCategory> getEntries() {
        return $ENTRIES;
    }

    DuaCategory(String displayNameEn, String displayNameTa) {
        this.displayNameEn = displayNameEn;
        this.displayNameTa = displayNameTa;
    }

    @NotNull
    public final String getDisplayNameEn() {
        return this.displayNameEn;
    }

    @NotNull
    public final String getDisplayNameTa() {
        return this.displayNameTa;
    }
}
