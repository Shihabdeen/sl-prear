package com.example.data.local;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.BuildConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Entities.kt */
@StabilityInferred(parameters = 1)
@Entity(tableName = "mosque_reminders")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/example/data/local/MosqueReminderEntity;", "", "eventId", "", "isReminderActive", "", "reminderTime", "<init>", "(JZJ)V", "getEventId", "()J", "()Z", "getReminderTime", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/MosqueReminderEntity.dex */
public final /* data */ class MosqueReminderEntity {
    public static final int $stable = 0;

    @PrimaryKey
    private final long eventId;
    private final boolean isReminderActive;
    private final long reminderTime;

    public static /* synthetic */ MosqueReminderEntity copy$default(MosqueReminderEntity mosqueReminderEntity, long j, boolean z, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mosqueReminderEntity.eventId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            z = mosqueReminderEntity.isReminderActive;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            j2 = mosqueReminderEntity.reminderTime;
        }
        return mosqueReminderEntity.copy(j3, z2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsReminderActive() {
        return this.isReminderActive;
    }

    /* renamed from: component3, reason: from getter */
    public final long getReminderTime() {
        return this.reminderTime;
    }

    @NotNull
    public final MosqueReminderEntity copy(long eventId, boolean isReminderActive, long reminderTime) {
        return new MosqueReminderEntity(eventId, isReminderActive, reminderTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MosqueReminderEntity)) {
            return false;
        }
        MosqueReminderEntity mosqueReminderEntity = (MosqueReminderEntity) other;
        return this.eventId == mosqueReminderEntity.eventId && this.isReminderActive == mosqueReminderEntity.isReminderActive && this.reminderTime == mosqueReminderEntity.reminderTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.eventId) * 31) + Boolean.hashCode(this.isReminderActive)) * 31) + Long.hashCode(this.reminderTime);
    }

    @NotNull
    public String toString() {
        return "MosqueReminderEntity(eventId=" + this.eventId + ", isReminderActive=" + this.isReminderActive + ", reminderTime=" + this.reminderTime + ")";
    }

    public MosqueReminderEntity(long eventId, boolean isReminderActive, long reminderTime) {
        this.eventId = eventId;
        this.isReminderActive = isReminderActive;
        this.reminderTime = reminderTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MosqueReminderEntity(long r7, boolean r9, long r10, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 4
            if (r12 == 0) goto La
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r10
            goto Lb
        La:
            r4 = r10
        Lb:
            r0 = r6
            r1 = r7
            r3 = r9
            r0.<init>(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.local.MosqueReminderEntity.<init>(long, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getEventId() {
        return this.eventId;
    }

    public final boolean isReminderActive() {
        return this.isReminderActive;
    }

    public final long getReminderTime() {
        return this.reminderTime;
    }
}
