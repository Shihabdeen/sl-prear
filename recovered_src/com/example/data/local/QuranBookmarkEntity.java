package com.example.data.local;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Entities.kt */
@StabilityInferred(parameters = 1)
@Entity(tableName = "quran_bookmarks")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/data/local/QuranBookmarkEntity;", "", "surahNumber", "", "surahName", "", "bookmarkedAt", "", "<init>", "(ILjava/lang/String;J)V", "getSurahNumber", "()I", "getSurahName", "()Ljava/lang/String;", "getBookmarkedAt", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/QuranBookmarkEntity.dex */
public final /* data */ class QuranBookmarkEntity {
    public static final int $stable = 0;
    private final long bookmarkedAt;

    @NotNull
    private final String surahName;

    @PrimaryKey
    private final int surahNumber;

    public static /* synthetic */ QuranBookmarkEntity copy$default(QuranBookmarkEntity quranBookmarkEntity, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = quranBookmarkEntity.surahNumber;
        }
        if ((i2 & 2) != 0) {
            str = quranBookmarkEntity.surahName;
        }
        if ((i2 & 4) != 0) {
            j = quranBookmarkEntity.bookmarkedAt;
        }
        return quranBookmarkEntity.copy(i, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSurahNumber() {
        return this.surahNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSurahName() {
        return this.surahName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBookmarkedAt() {
        return this.bookmarkedAt;
    }

    @NotNull
    public final QuranBookmarkEntity copy(int surahNumber, @NotNull String surahName, long bookmarkedAt) {
        Intrinsics.checkNotNullParameter(surahName, "surahName");
        return new QuranBookmarkEntity(surahNumber, surahName, bookmarkedAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuranBookmarkEntity)) {
            return false;
        }
        QuranBookmarkEntity quranBookmarkEntity = (QuranBookmarkEntity) other;
        return this.surahNumber == quranBookmarkEntity.surahNumber && Intrinsics.areEqual(this.surahName, quranBookmarkEntity.surahName) && this.bookmarkedAt == quranBookmarkEntity.bookmarkedAt;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.surahNumber) * 31) + this.surahName.hashCode()) * 31) + Long.hashCode(this.bookmarkedAt);
    }

    @NotNull
    public String toString() {
        return "QuranBookmarkEntity(surahNumber=" + this.surahNumber + ", surahName=" + this.surahName + ", bookmarkedAt=" + this.bookmarkedAt + ")";
    }

    public QuranBookmarkEntity(int surahNumber, @NotNull String surahName, long bookmarkedAt) {
        Intrinsics.checkNotNullParameter(surahName, "surahName");
        this.surahNumber = surahNumber;
        this.surahName = surahName;
        this.bookmarkedAt = bookmarkedAt;
    }

    public /* synthetic */ QuranBookmarkEntity(int i, String str, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final int getSurahNumber() {
        return this.surahNumber;
    }

    @NotNull
    public final String getSurahName() {
        return this.surahName;
    }

    public final long getBookmarkedAt() {
        return this.bookmarkedAt;
    }
}
