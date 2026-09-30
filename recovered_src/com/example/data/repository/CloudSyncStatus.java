package com.example.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AuthAndChatRepository.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/example/data/repository/CloudSyncStatus;", "", "isSyncing", "", "lastSyncedTime", "", "newSyncedCount", "", "errorMessage", "", "<init>", "(ZJILjava/lang/String;)V", "()Z", "getLastSyncedTime", "()J", "getNewSyncedCount", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/CloudSyncStatus.dex */
public final /* data */ class CloudSyncStatus {
    public static final int $stable = 0;

    @Nullable
    private final String errorMessage;
    private final boolean isSyncing;
    private final long lastSyncedTime;
    private final int newSyncedCount;

    public CloudSyncStatus() {
        this(false, 0L, 0, null, 15, null);
    }

    public static /* synthetic */ CloudSyncStatus copy$default(CloudSyncStatus cloudSyncStatus, boolean z, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = cloudSyncStatus.isSyncing;
        }
        if ((i2 & 2) != 0) {
            j = cloudSyncStatus.lastSyncedTime;
        }
        if ((i2 & 4) != 0) {
            i = cloudSyncStatus.newSyncedCount;
        }
        if ((i2 & 8) != 0) {
            str = cloudSyncStatus.errorMessage;
        }
        return cloudSyncStatus.copy(z, j, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSyncing() {
        return this.isSyncing;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLastSyncedTime() {
        return this.lastSyncedTime;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNewSyncedCount() {
        return this.newSyncedCount;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final CloudSyncStatus copy(boolean isSyncing, long lastSyncedTime, int newSyncedCount, @Nullable String errorMessage) {
        return new CloudSyncStatus(isSyncing, lastSyncedTime, newSyncedCount, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudSyncStatus)) {
            return false;
        }
        CloudSyncStatus cloudSyncStatus = (CloudSyncStatus) other;
        return this.isSyncing == cloudSyncStatus.isSyncing && this.lastSyncedTime == cloudSyncStatus.lastSyncedTime && this.newSyncedCount == cloudSyncStatus.newSyncedCount && Intrinsics.areEqual(this.errorMessage, cloudSyncStatus.errorMessage);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isSyncing) * 31) + Long.hashCode(this.lastSyncedTime)) * 31) + Integer.hashCode(this.newSyncedCount)) * 31) + (this.errorMessage == null ? 0 : this.errorMessage.hashCode());
    }

    @NotNull
    public String toString() {
        return "CloudSyncStatus(isSyncing=" + this.isSyncing + ", lastSyncedTime=" + this.lastSyncedTime + ", newSyncedCount=" + this.newSyncedCount + ", errorMessage=" + this.errorMessage + ")";
    }

    public CloudSyncStatus(boolean isSyncing, long lastSyncedTime, int newSyncedCount, @Nullable String errorMessage) {
        this.isSyncing = isSyncing;
        this.lastSyncedTime = lastSyncedTime;
        this.newSyncedCount = newSyncedCount;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ CloudSyncStatus(boolean z, long j, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str);
    }

    public final boolean isSyncing() {
        return this.isSyncing;
    }

    public final long getLastSyncedTime() {
        return this.lastSyncedTime;
    }

    public final int getNewSyncedCount() {
        return this.newSyncedCount;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
