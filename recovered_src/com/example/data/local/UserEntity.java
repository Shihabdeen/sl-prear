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
@Entity(tableName = "users")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/example/data/local/UserEntity;", "", "phoneNumber", "", "fullName", "role", "adminDesignation", "mosqueAffiliation", "isLoggedIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getPhoneNumber", "()Ljava/lang/String;", "getFullName", "getRole", "getAdminDesignation", "getMosqueAffiliation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/UserEntity.dex */
public final /* data */ class UserEntity {
    public static final int $stable = 0;

    @Nullable
    private final String adminDesignation;

    @NotNull
    private final String fullName;
    private final boolean isLoggedIn;

    @Nullable
    private final String mosqueAffiliation;

    @PrimaryKey
    @NotNull
    private final String phoneNumber;

    @NotNull
    private final String role;

    public static /* synthetic */ UserEntity copy$default(UserEntity userEntity, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userEntity.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = userEntity.fullName;
        }
        if ((i & 4) != 0) {
            str3 = userEntity.role;
        }
        if ((i & 8) != 0) {
            str4 = userEntity.adminDesignation;
        }
        if ((i & 16) != 0) {
            str5 = userEntity.mosqueAffiliation;
        }
        if ((i & 32) != 0) {
            z = userEntity.isLoggedIn;
        }
        String str6 = str5;
        boolean z2 = z;
        return userEntity.copy(str, str2, str3, str4, str6, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAdminDesignation() {
        return this.adminDesignation;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMosqueAffiliation() {
        return this.mosqueAffiliation;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    @NotNull
    public final UserEntity copy(@NotNull String phoneNumber, @NotNull String fullName, @NotNull String role, @Nullable String adminDesignation, @Nullable String mosqueAffiliation, boolean isLoggedIn) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        return new UserEntity(phoneNumber, fullName, role, adminDesignation, mosqueAffiliation, isLoggedIn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) other;
        return Intrinsics.areEqual(this.phoneNumber, userEntity.phoneNumber) && Intrinsics.areEqual(this.fullName, userEntity.fullName) && Intrinsics.areEqual(this.role, userEntity.role) && Intrinsics.areEqual(this.adminDesignation, userEntity.adminDesignation) && Intrinsics.areEqual(this.mosqueAffiliation, userEntity.mosqueAffiliation) && this.isLoggedIn == userEntity.isLoggedIn;
    }

    public int hashCode() {
        return (((((((((this.phoneNumber.hashCode() * 31) + this.fullName.hashCode()) * 31) + this.role.hashCode()) * 31) + (this.adminDesignation == null ? 0 : this.adminDesignation.hashCode())) * 31) + (this.mosqueAffiliation != null ? this.mosqueAffiliation.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoggedIn);
    }

    @NotNull
    public String toString() {
        return "UserEntity(phoneNumber=" + this.phoneNumber + ", fullName=" + this.fullName + ", role=" + this.role + ", adminDesignation=" + this.adminDesignation + ", mosqueAffiliation=" + this.mosqueAffiliation + ", isLoggedIn=" + this.isLoggedIn + ")";
    }

    public UserEntity(@NotNull String phoneNumber, @NotNull String fullName, @NotNull String role, @Nullable String adminDesignation, @Nullable String mosqueAffiliation, boolean isLoggedIn) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.role = role;
        this.adminDesignation = adminDesignation;
        this.mosqueAffiliation = mosqueAffiliation;
        this.isLoggedIn = isLoggedIn;
    }

    public /* synthetic */ UserEntity(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? true : z);
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getFullName() {
        return this.fullName;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    @Nullable
    public final String getAdminDesignation() {
        return this.adminDesignation;
    }

    @Nullable
    public final String getMosqueAffiliation() {
        return this.mosqueAffiliation;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }
}
