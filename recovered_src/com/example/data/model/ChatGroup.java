package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChatModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006 "}, d2 = {"Lcom/example/data/model/ChatGroup;", "", "id", "", "name", "description", "iconEmoji", "memberCount", "", "isOnlyAdminPosting", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getIconEmoji", "getMemberCount", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/ChatGroup.dex */
public final /* data */ class ChatGroup {
    public static final int $stable = 0;

    @NotNull
    private final String description;

    @NotNull
    private final String iconEmoji;

    @NotNull
    private final String id;
    private final boolean isOnlyAdminPosting;
    private final int memberCount;

    @NotNull
    private final String name;

    public static /* synthetic */ ChatGroup copy$default(ChatGroup chatGroup, String str, String str2, String str3, String str4, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatGroup.id;
        }
        if ((i2 & 2) != 0) {
            str2 = chatGroup.name;
        }
        if ((i2 & 4) != 0) {
            str3 = chatGroup.description;
        }
        if ((i2 & 8) != 0) {
            str4 = chatGroup.iconEmoji;
        }
        if ((i2 & 16) != 0) {
            i = chatGroup.memberCount;
        }
        if ((i2 & 32) != 0) {
            z = chatGroup.isOnlyAdminPosting;
        }
        int i3 = i;
        boolean z2 = z;
        return chatGroup.copy(str, str2, str3, str4, i3, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIconEmoji() {
        return this.iconEmoji;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsOnlyAdminPosting() {
        return this.isOnlyAdminPosting;
    }

    @NotNull
    public final ChatGroup copy(@NotNull String id, @NotNull String name, @NotNull String description, @NotNull String iconEmoji, int memberCount, boolean isOnlyAdminPosting) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconEmoji, "iconEmoji");
        return new ChatGroup(id, name, description, iconEmoji, memberCount, isOnlyAdminPosting);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatGroup)) {
            return false;
        }
        ChatGroup chatGroup = (ChatGroup) other;
        return Intrinsics.areEqual(this.id, chatGroup.id) && Intrinsics.areEqual(this.name, chatGroup.name) && Intrinsics.areEqual(this.description, chatGroup.description) && Intrinsics.areEqual(this.iconEmoji, chatGroup.iconEmoji) && this.memberCount == chatGroup.memberCount && this.isOnlyAdminPosting == chatGroup.isOnlyAdminPosting;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconEmoji.hashCode()) * 31) + Integer.hashCode(this.memberCount)) * 31) + Boolean.hashCode(this.isOnlyAdminPosting);
    }

    @NotNull
    public String toString() {
        return "ChatGroup(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", iconEmoji=" + this.iconEmoji + ", memberCount=" + this.memberCount + ", isOnlyAdminPosting=" + this.isOnlyAdminPosting + ")";
    }

    public ChatGroup(@NotNull String id, @NotNull String name, @NotNull String description, @NotNull String iconEmoji, int memberCount, boolean isOnlyAdminPosting) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconEmoji, "iconEmoji");
        this.id = id;
        this.name = name;
        this.description = description;
        this.iconEmoji = iconEmoji;
        this.memberCount = memberCount;
        this.isOnlyAdminPosting = isOnlyAdminPosting;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ChatGroup(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 32
            if (r14 == 0) goto L7
            r13 = 1
            r6 = r13
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.model.ChatGroup.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getIconEmoji() {
        return this.iconEmoji;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final boolean isOnlyAdminPosting() {
        return this.isOnlyAdminPosting;
    }
}
