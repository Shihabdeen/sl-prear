package com.example.data.local;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Entities.kt */
@StabilityInferred(parameters = 1)
@Entity(indices = {@Index({"groupId"})}, tableName = "chat_messages")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\u0087\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0011HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/example/data/local/ChatMessageEntity;", "", "id", "", "groupId", "", "senderPhone", "senderName", "senderRole", "senderDesignation", "senderMosque", "text", "timestamp", "tag", "isPinned", "", "reactionsCount", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZI)V", "getId", "()J", "getGroupId", "()Ljava/lang/String;", "getSenderPhone", "getSenderName", "getSenderRole", "getSenderDesignation", "getSenderMosque", "getText", "getTimestamp", "getTag", "()Z", "getReactionsCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/ChatMessageEntity.dex */
public final /* data */ class ChatMessageEntity {
    public static final int $stable = 0;

    @NotNull
    private final String groupId;

    @PrimaryKey(autoGenerate = true)
    private final long id;
    private final boolean isPinned;
    private final int reactionsCount;

    @Nullable
    private final String senderDesignation;

    @Nullable
    private final String senderMosque;

    @NotNull
    private final String senderName;

    @NotNull
    private final String senderPhone;

    @NotNull
    private final String senderRole;

    @Nullable
    private final String tag;

    @NotNull
    private final String text;
    private final long timestamp;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    /* renamed from: component12, reason: from getter */
    public final int getReactionsCount() {
        return this.reactionsCount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSenderPhone() {
        return this.senderPhone;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSenderRole() {
        return this.senderRole;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getSenderDesignation() {
        return this.senderDesignation;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSenderMosque() {
        return this.senderMosque;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final ChatMessageEntity copy(long id, @NotNull String groupId, @NotNull String senderPhone, @NotNull String senderName, @NotNull String senderRole, @Nullable String senderDesignation, @Nullable String senderMosque, @NotNull String text, long timestamp, @Nullable String tag, boolean isPinned, int reactionsCount) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(senderPhone, "senderPhone");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderRole, "senderRole");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ChatMessageEntity(id, groupId, senderPhone, senderName, senderRole, senderDesignation, senderMosque, text, timestamp, tag, isPinned, reactionsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessageEntity)) {
            return false;
        }
        ChatMessageEntity chatMessageEntity = (ChatMessageEntity) other;
        return this.id == chatMessageEntity.id && Intrinsics.areEqual(this.groupId, chatMessageEntity.groupId) && Intrinsics.areEqual(this.senderPhone, chatMessageEntity.senderPhone) && Intrinsics.areEqual(this.senderName, chatMessageEntity.senderName) && Intrinsics.areEqual(this.senderRole, chatMessageEntity.senderRole) && Intrinsics.areEqual(this.senderDesignation, chatMessageEntity.senderDesignation) && Intrinsics.areEqual(this.senderMosque, chatMessageEntity.senderMosque) && Intrinsics.areEqual(this.text, chatMessageEntity.text) && this.timestamp == chatMessageEntity.timestamp && Intrinsics.areEqual(this.tag, chatMessageEntity.tag) && this.isPinned == chatMessageEntity.isPinned && this.reactionsCount == chatMessageEntity.reactionsCount;
    }

    public int hashCode() {
        return (((((((((((((((((((((Long.hashCode(this.id) * 31) + this.groupId.hashCode()) * 31) + this.senderPhone.hashCode()) * 31) + this.senderName.hashCode()) * 31) + this.senderRole.hashCode()) * 31) + (this.senderDesignation == null ? 0 : this.senderDesignation.hashCode())) * 31) + (this.senderMosque == null ? 0 : this.senderMosque.hashCode())) * 31) + this.text.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + (this.tag != null ? this.tag.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPinned)) * 31) + Integer.hashCode(this.reactionsCount);
    }

    @NotNull
    public String toString() {
        return "ChatMessageEntity(id=" + this.id + ", groupId=" + this.groupId + ", senderPhone=" + this.senderPhone + ", senderName=" + this.senderName + ", senderRole=" + this.senderRole + ", senderDesignation=" + this.senderDesignation + ", senderMosque=" + this.senderMosque + ", text=" + this.text + ", timestamp=" + this.timestamp + ", tag=" + this.tag + ", isPinned=" + this.isPinned + ", reactionsCount=" + this.reactionsCount + ")";
    }

    public ChatMessageEntity(long id, @NotNull String groupId, @NotNull String senderPhone, @NotNull String senderName, @NotNull String senderRole, @Nullable String senderDesignation, @Nullable String senderMosque, @NotNull String text, long timestamp, @Nullable String tag, boolean isPinned, int reactionsCount) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(senderPhone, "senderPhone");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderRole, "senderRole");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = id;
        this.groupId = groupId;
        this.senderPhone = senderPhone;
        this.senderName = senderName;
        this.senderRole = senderRole;
        this.senderDesignation = senderDesignation;
        this.senderMosque = senderMosque;
        this.text = text;
        this.timestamp = timestamp;
        this.tag = tag;
        this.isPinned = isPinned;
        this.reactionsCount = reactionsCount;
    }

    public /* synthetic */ ChatMessageEntity(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j2, String str8, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, str, str2, str3, str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, str7, (i2 & 256) != 0 ? System.currentTimeMillis() : j2, (i2 & 512) != 0 ? null : str8, (i2 & 1024) != 0 ? false : z, (i2 & 2048) != 0 ? 0 : i);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getSenderPhone() {
        return this.senderPhone;
    }

    @NotNull
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final String getSenderRole() {
        return this.senderRole;
    }

    @Nullable
    public final String getSenderDesignation() {
        return this.senderDesignation;
    }

    @Nullable
    public final String getSenderMosque() {
        return this.senderMosque;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final int getReactionsCount() {
        return this.reactionsCount;
    }
}
