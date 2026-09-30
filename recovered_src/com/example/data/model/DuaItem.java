package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DuaModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\u008b\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00103\u001a\u00020\u00122\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u000eHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010$¨\u00067"}, d2 = {"Lcom/example/data/model/DuaItem;", "", "id", "", "titleEn", "titleTa", "arabic", "transliteration", "tamilTransliteration", "translationEn", "translationTa", "category", "Lcom/example/data/model/DuaCategory;", "recommendedCount", "", "source", "benefit", "isFavorite", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/model/DuaCategory;ILjava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTitleEn", "getTitleTa", "getArabic", "getTransliteration", "getTamilTransliteration", "getTranslationEn", "getTranslationTa", "getCategory", "()Lcom/example/data/model/DuaCategory;", "getRecommendedCount", "()I", "getSource", "getBenefit", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/DuaItem.dex */
public final /* data */ class DuaItem {
    public static final int $stable = 0;

    @NotNull
    private final String arabic;

    @NotNull
    private final String benefit;

    @NotNull
    private final DuaCategory category;

    @NotNull
    private final String id;
    private final boolean isFavorite;
    private final int recommendedCount;

    @NotNull
    private final String source;

    @NotNull
    private final String tamilTransliteration;

    @NotNull
    private final String titleEn;

    @NotNull
    private final String titleTa;

    @NotNull
    private final String translationEn;

    @NotNull
    private final String translationTa;

    @NotNull
    private final String transliteration;

    public static /* synthetic */ DuaItem copy$default(DuaItem duaItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DuaCategory duaCategory, int i, String str9, String str10, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = duaItem.id;
        }
        return duaItem.copy(str, (i2 & 2) != 0 ? duaItem.titleEn : str2, (i2 & 4) != 0 ? duaItem.titleTa : str3, (i2 & 8) != 0 ? duaItem.arabic : str4, (i2 & 16) != 0 ? duaItem.transliteration : str5, (i2 & 32) != 0 ? duaItem.tamilTransliteration : str6, (i2 & 64) != 0 ? duaItem.translationEn : str7, (i2 & 128) != 0 ? duaItem.translationTa : str8, (i2 & 256) != 0 ? duaItem.category : duaCategory, (i2 & 512) != 0 ? duaItem.recommendedCount : i, (i2 & 1024) != 0 ? duaItem.source : str9, (i2 & 2048) != 0 ? duaItem.benefit : str10, (i2 & 4096) != 0 ? duaItem.isFavorite : z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getRecommendedCount() {
        return this.recommendedCount;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getBenefit() {
        return this.benefit;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitleEn() {
        return this.titleEn;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitleTa() {
        return this.titleTa;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getArabic() {
        return this.arabic;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTransliteration() {
        return this.transliteration;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTamilTransliteration() {
        return this.tamilTransliteration;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTranslationEn() {
        return this.translationEn;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTranslationTa() {
        return this.translationTa;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final DuaCategory getCategory() {
        return this.category;
    }

    @NotNull
    public final DuaItem copy(@NotNull String id, @NotNull String titleEn, @NotNull String titleTa, @NotNull String arabic, @NotNull String transliteration, @NotNull String tamilTransliteration, @NotNull String translationEn, @NotNull String translationTa, @NotNull DuaCategory category, int recommendedCount, @NotNull String source, @NotNull String benefit, boolean isFavorite) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(titleEn, "titleEn");
        Intrinsics.checkNotNullParameter(titleTa, "titleTa");
        Intrinsics.checkNotNullParameter(arabic, "arabic");
        Intrinsics.checkNotNullParameter(transliteration, "transliteration");
        Intrinsics.checkNotNullParameter(tamilTransliteration, "tamilTransliteration");
        Intrinsics.checkNotNullParameter(translationEn, "translationEn");
        Intrinsics.checkNotNullParameter(translationTa, "translationTa");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        return new DuaItem(id, titleEn, titleTa, arabic, transliteration, tamilTransliteration, translationEn, translationTa, category, recommendedCount, source, benefit, isFavorite);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DuaItem)) {
            return false;
        }
        DuaItem duaItem = (DuaItem) other;
        return Intrinsics.areEqual(this.id, duaItem.id) && Intrinsics.areEqual(this.titleEn, duaItem.titleEn) && Intrinsics.areEqual(this.titleTa, duaItem.titleTa) && Intrinsics.areEqual(this.arabic, duaItem.arabic) && Intrinsics.areEqual(this.transliteration, duaItem.transliteration) && Intrinsics.areEqual(this.tamilTransliteration, duaItem.tamilTransliteration) && Intrinsics.areEqual(this.translationEn, duaItem.translationEn) && Intrinsics.areEqual(this.translationTa, duaItem.translationTa) && this.category == duaItem.category && this.recommendedCount == duaItem.recommendedCount && Intrinsics.areEqual(this.source, duaItem.source) && Intrinsics.areEqual(this.benefit, duaItem.benefit) && this.isFavorite == duaItem.isFavorite;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.id.hashCode() * 31) + this.titleEn.hashCode()) * 31) + this.titleTa.hashCode()) * 31) + this.arabic.hashCode()) * 31) + this.transliteration.hashCode()) * 31) + this.tamilTransliteration.hashCode()) * 31) + this.translationEn.hashCode()) * 31) + this.translationTa.hashCode()) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.recommendedCount)) * 31) + this.source.hashCode()) * 31) + this.benefit.hashCode()) * 31) + Boolean.hashCode(this.isFavorite);
    }

    @NotNull
    public String toString() {
        return "DuaItem(id=" + this.id + ", titleEn=" + this.titleEn + ", titleTa=" + this.titleTa + ", arabic=" + this.arabic + ", transliteration=" + this.transliteration + ", tamilTransliteration=" + this.tamilTransliteration + ", translationEn=" + this.translationEn + ", translationTa=" + this.translationTa + ", category=" + this.category + ", recommendedCount=" + this.recommendedCount + ", source=" + this.source + ", benefit=" + this.benefit + ", isFavorite=" + this.isFavorite + ")";
    }

    public DuaItem(@NotNull String id, @NotNull String titleEn, @NotNull String titleTa, @NotNull String arabic, @NotNull String transliteration, @NotNull String tamilTransliteration, @NotNull String translationEn, @NotNull String translationTa, @NotNull DuaCategory category, int recommendedCount, @NotNull String source, @NotNull String benefit, boolean isFavorite) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(titleEn, "titleEn");
        Intrinsics.checkNotNullParameter(titleTa, "titleTa");
        Intrinsics.checkNotNullParameter(arabic, "arabic");
        Intrinsics.checkNotNullParameter(transliteration, "transliteration");
        Intrinsics.checkNotNullParameter(tamilTransliteration, "tamilTransliteration");
        Intrinsics.checkNotNullParameter(translationEn, "translationEn");
        Intrinsics.checkNotNullParameter(translationTa, "translationTa");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(benefit, "benefit");
        this.id = id;
        this.titleEn = titleEn;
        this.titleTa = titleTa;
        this.arabic = arabic;
        this.transliteration = transliteration;
        this.tamilTransliteration = tamilTransliteration;
        this.translationEn = translationEn;
        this.translationTa = translationTa;
        this.category = category;
        this.recommendedCount = recommendedCount;
        this.source = source;
        this.benefit = benefit;
        this.isFavorite = isFavorite;
    }

    public /* synthetic */ DuaItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, DuaCategory duaCategory, int i, String str9, String str10, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, duaCategory, (i2 & 512) != 0 ? 1 : i, str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? false : z);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitleEn() {
        return this.titleEn;
    }

    @NotNull
    public final String getTitleTa() {
        return this.titleTa;
    }

    @NotNull
    public final String getArabic() {
        return this.arabic;
    }

    @NotNull
    public final String getTransliteration() {
        return this.transliteration;
    }

    @NotNull
    public final String getTamilTransliteration() {
        return this.tamilTransliteration;
    }

    @NotNull
    public final String getTranslationEn() {
        return this.translationEn;
    }

    @NotNull
    public final String getTranslationTa() {
        return this.translationTa;
    }

    @NotNull
    public final DuaCategory getCategory() {
        return this.category;
    }

    public final int getRecommendedCount() {
        return this.recommendedCount;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getBenefit() {
        return this.benefit;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }
}
