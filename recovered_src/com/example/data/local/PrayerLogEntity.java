package com.example.data.local;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Entities.kt */
@StabilityInferred(parameters = 1)
@Entity(indices = {@Index(unique = true, value = {"dateKey", "prayerName"})}, tableName = "prayer_logs")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/example/data/local/PrayerLogEntity;", "", "id", "", "dateKey", "", "prayerName", "isCompleted", "", "completedAt", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZJ)V", "getId", "()J", "getDateKey", "()Ljava/lang/String;", "getPrayerName", "()Z", "getCompletedAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/PrayerLogEntity.dex */
public final /* data */ class PrayerLogEntity {
    public static final int $stable = 0;
    private final long completedAt;

    @NotNull
    private final String dateKey;

    @PrimaryKey(autoGenerate = true)
    private final long id;
    private final boolean isCompleted;

    @NotNull
    private final String prayerName;

    public static /* synthetic */ PrayerLogEntity copy$default(PrayerLogEntity prayerLogEntity, long j, String str, String str2, boolean z, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = prayerLogEntity.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = prayerLogEntity.dateKey;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = prayerLogEntity.prayerName;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = prayerLogEntity.isCompleted;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            j2 = prayerLogEntity.completedAt;
        }
        return prayerLogEntity.copy(j3, str3, str4, z2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDateKey() {
        return this.dateKey;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPrayerName() {
        return this.prayerName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCompletedAt() {
        return this.completedAt;
    }

    @NotNull
    public final PrayerLogEntity copy(long id, @NotNull String dateKey, @NotNull String prayerName, boolean isCompleted, long completedAt) {
        Intrinsics.checkNotNullParameter(dateKey, "dateKey");
        Intrinsics.checkNotNullParameter(prayerName, "prayerName");
        return new PrayerLogEntity(id, dateKey, prayerName, isCompleted, completedAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrayerLogEntity)) {
            return false;
        }
        PrayerLogEntity prayerLogEntity = (PrayerLogEntity) other;
        return this.id == prayerLogEntity.id && Intrinsics.areEqual(this.dateKey, prayerLogEntity.dateKey) && Intrinsics.areEqual(this.prayerName, prayerLogEntity.prayerName) && this.isCompleted == prayerLogEntity.isCompleted && this.completedAt == prayerLogEntity.completedAt;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.dateKey.hashCode()) * 31) + this.prayerName.hashCode()) * 31) + Boolean.hashCode(this.isCompleted)) * 31) + Long.hashCode(this.completedAt);
    }

    @NotNull
    public String toString() {
        return "PrayerLogEntity(id=" + this.id + ", dateKey=" + this.dateKey + ", prayerName=" + this.prayerName + ", isCompleted=" + this.isCompleted + ", completedAt=" + this.completedAt + ")";
    }

    public PrayerLogEntity(long id, @NotNull String dateKey, @NotNull String prayerName, boolean isCompleted, long completedAt) {
        Intrinsics.checkNotNullParameter(dateKey, "dateKey");
        Intrinsics.checkNotNullParameter(prayerName, "prayerName");
        this.id = id;
        this.dateKey = dateKey;
        this.prayerName = prayerName;
        this.isCompleted = isCompleted;
        this.completedAt = completedAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PrayerLogEntity(long r9, java.lang.String r11, java.lang.String r12, boolean r13, long r14, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L8
            r9 = 0
            r1 = r9
            goto L9
        L8:
            r1 = r9
        L9:
            r9 = r16 & 16
            if (r9 == 0) goto L13
            long r9 = java.lang.System.currentTimeMillis()
            r6 = r9
            goto L14
        L13:
            r6 = r14
        L14:
            r0 = r8
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.local.PrayerLogEntity.<init>(long, java.lang.String, java.lang.String, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getDateKey() {
        return this.dateKey;
    }

    @NotNull
    public final String getPrayerName() {
        return this.prayerName;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final long getCompletedAt() {
        return this.completedAt;
    }
}
