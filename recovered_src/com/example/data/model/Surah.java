package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: QuranModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006&"}, d2 = {"Lcom/example/data/model/Surah;", "", "number", "", "nameArabic", "", "nameEnglish", "englishMeaning", "versesCount", "revelationType", "audioUrl", "isBookmarked", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getNumber", "()I", "getNameArabic", "()Ljava/lang/String;", "getNameEnglish", "getEnglishMeaning", "getVersesCount", "getRevelationType", "getAudioUrl", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/Surah.dex */
public final /* data */ class Surah {
    public static final int $stable = 0;

    @NotNull
    private final String audioUrl;

    @NotNull
    private final String englishMeaning;
    private final boolean isBookmarked;

    @NotNull
    private final String nameArabic;

    @NotNull
    private final String nameEnglish;
    private final int number;

    @NotNull
    private final String revelationType;
    private final int versesCount;

    public static /* synthetic */ Surah copy$default(Surah surah, int i, String str, String str2, String str3, int i2, String str4, String str5, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = surah.number;
        }
        if ((i3 & 2) != 0) {
            str = surah.nameArabic;
        }
        if ((i3 & 4) != 0) {
            str2 = surah.nameEnglish;
        }
        if ((i3 & 8) != 0) {
            str3 = surah.englishMeaning;
        }
        if ((i3 & 16) != 0) {
            i2 = surah.versesCount;
        }
        if ((i3 & 32) != 0) {
            str4 = surah.revelationType;
        }
        if ((i3 & 64) != 0) {
            str5 = surah.audioUrl;
        }
        if ((i3 & 128) != 0) {
            z = surah.isBookmarked;
        }
        String str6 = str5;
        boolean z2 = z;
        int i4 = i2;
        String str7 = str4;
        return surah.copy(i, str, str2, str3, i4, str7, str6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNameArabic() {
        return this.nameArabic;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNameEnglish() {
        return this.nameEnglish;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getEnglishMeaning() {
        return this.englishMeaning;
    }

    /* renamed from: component5, reason: from getter */
    public final int getVersesCount() {
        return this.versesCount;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRevelationType() {
        return this.revelationType;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsBookmarked() {
        return this.isBookmarked;
    }

    @NotNull
    public final Surah copy(int number, @NotNull String nameArabic, @NotNull String nameEnglish, @NotNull String englishMeaning, int versesCount, @NotNull String revelationType, @NotNull String audioUrl, boolean isBookmarked) {
        Intrinsics.checkNotNullParameter(nameArabic, "nameArabic");
        Intrinsics.checkNotNullParameter(nameEnglish, "nameEnglish");
        Intrinsics.checkNotNullParameter(englishMeaning, "englishMeaning");
        Intrinsics.checkNotNullParameter(revelationType, "revelationType");
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        return new Surah(number, nameArabic, nameEnglish, englishMeaning, versesCount, revelationType, audioUrl, isBookmarked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Surah)) {
            return false;
        }
        Surah surah = (Surah) other;
        return this.number == surah.number && Intrinsics.areEqual(this.nameArabic, surah.nameArabic) && Intrinsics.areEqual(this.nameEnglish, surah.nameEnglish) && Intrinsics.areEqual(this.englishMeaning, surah.englishMeaning) && this.versesCount == surah.versesCount && Intrinsics.areEqual(this.revelationType, surah.revelationType) && Intrinsics.areEqual(this.audioUrl, surah.audioUrl) && this.isBookmarked == surah.isBookmarked;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.number) * 31) + this.nameArabic.hashCode()) * 31) + this.nameEnglish.hashCode()) * 31) + this.englishMeaning.hashCode()) * 31) + Integer.hashCode(this.versesCount)) * 31) + this.revelationType.hashCode()) * 31) + this.audioUrl.hashCode()) * 31) + Boolean.hashCode(this.isBookmarked);
    }

    @NotNull
    public String toString() {
        return "Surah(number=" + this.number + ", nameArabic=" + this.nameArabic + ", nameEnglish=" + this.nameEnglish + ", englishMeaning=" + this.englishMeaning + ", versesCount=" + this.versesCount + ", revelationType=" + this.revelationType + ", audioUrl=" + this.audioUrl + ", isBookmarked=" + this.isBookmarked + ")";
    }

    public Surah(int number, @NotNull String nameArabic, @NotNull String nameEnglish, @NotNull String englishMeaning, int versesCount, @NotNull String revelationType, @NotNull String audioUrl, boolean isBookmarked) {
        Intrinsics.checkNotNullParameter(nameArabic, "nameArabic");
        Intrinsics.checkNotNullParameter(nameEnglish, "nameEnglish");
        Intrinsics.checkNotNullParameter(englishMeaning, "englishMeaning");
        Intrinsics.checkNotNullParameter(revelationType, "revelationType");
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        this.number = number;
        this.nameArabic = nameArabic;
        this.nameEnglish = nameEnglish;
        this.englishMeaning = englishMeaning;
        this.versesCount = versesCount;
        this.revelationType = revelationType;
        this.audioUrl = audioUrl;
        this.isBookmarked = isBookmarked;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Surah(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L9
            r0 = 0
            r9 = r0
            goto Lb
        L9:
            r9 = r18
        Lb:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.model.Surah.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getNumber() {
        return this.number;
    }

    @NotNull
    public final String getNameArabic() {
        return this.nameArabic;
    }

    @NotNull
    public final String getNameEnglish() {
        return this.nameEnglish;
    }

    @NotNull
    public final String getEnglishMeaning() {
        return this.englishMeaning;
    }

    public final int getVersesCount() {
        return this.versesCount;
    }

    @NotNull
    public final String getRevelationType() {
        return this.revelationType;
    }

    @NotNull
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final boolean isBookmarked() {
        return this.isBookmarked;
    }
}
