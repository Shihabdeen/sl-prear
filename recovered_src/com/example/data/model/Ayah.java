package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: QuranModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/example/data/model/Ayah;", "", "numberInSurah", "", "arabicText", "", "transliteration", "translation", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNumberInSurah", "()I", "getArabicText", "()Ljava/lang/String;", "getTransliteration", "getTranslation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/Ayah.dex */
public final /* data */ class Ayah {
    public static final int $stable = 0;

    @NotNull
    private final String arabicText;
    private final int numberInSurah;

    @NotNull
    private final String translation;

    @NotNull
    private final String transliteration;

    public static /* synthetic */ Ayah copy$default(Ayah ayah, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ayah.numberInSurah;
        }
        if ((i2 & 2) != 0) {
            str = ayah.arabicText;
        }
        if ((i2 & 4) != 0) {
            str2 = ayah.transliteration;
        }
        if ((i2 & 8) != 0) {
            str3 = ayah.translation;
        }
        return ayah.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumberInSurah() {
        return this.numberInSurah;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getArabicText() {
        return this.arabicText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTransliteration() {
        return this.transliteration;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTranslation() {
        return this.translation;
    }

    @NotNull
    public final Ayah copy(int numberInSurah, @NotNull String arabicText, @NotNull String transliteration, @NotNull String translation) {
        Intrinsics.checkNotNullParameter(arabicText, "arabicText");
        Intrinsics.checkNotNullParameter(transliteration, "transliteration");
        Intrinsics.checkNotNullParameter(translation, "translation");
        return new Ayah(numberInSurah, arabicText, transliteration, translation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ayah)) {
            return false;
        }
        Ayah ayah = (Ayah) other;
        return this.numberInSurah == ayah.numberInSurah && Intrinsics.areEqual(this.arabicText, ayah.arabicText) && Intrinsics.areEqual(this.transliteration, ayah.transliteration) && Intrinsics.areEqual(this.translation, ayah.translation);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.numberInSurah) * 31) + this.arabicText.hashCode()) * 31) + this.transliteration.hashCode()) * 31) + this.translation.hashCode();
    }

    @NotNull
    public String toString() {
        return "Ayah(numberInSurah=" + this.numberInSurah + ", arabicText=" + this.arabicText + ", transliteration=" + this.transliteration + ", translation=" + this.translation + ")";
    }

    public Ayah(int numberInSurah, @NotNull String arabicText, @NotNull String transliteration, @NotNull String translation) {
        Intrinsics.checkNotNullParameter(arabicText, "arabicText");
        Intrinsics.checkNotNullParameter(transliteration, "transliteration");
        Intrinsics.checkNotNullParameter(translation, "translation");
        this.numberInSurah = numberInSurah;
        this.arabicText = arabicText;
        this.transliteration = transliteration;
        this.translation = translation;
    }

    public final int getNumberInSurah() {
        return this.numberInSurah;
    }

    @NotNull
    public final String getArabicText() {
        return this.arabicText;
    }

    @NotNull
    public final String getTransliteration() {
        return this.transliteration;
    }

    @NotNull
    public final String getTranslation() {
        return this.translation;
    }
}
