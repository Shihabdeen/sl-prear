package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006!"}, d2 = {"Lcom/example/data/model/UserProfile;", "", "phoneNumber", "", "fullName", "role", "Lcom/example/data/model/UserRole;", "adminDesignation", "mosqueAffiliation", "isLoggedIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/data/model/UserRole;Ljava/lang/String;Ljava/lang/String;Z)V", "getPhoneNumber", "()Ljava/lang/String;", "getFullName", "getRole", "()Lcom/example/data/model/UserRole;", "getAdminDesignation", "getMosqueAffiliation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/UserProfile.dex */
public final /* data */ class UserProfile {
    public static final int $stable = 0;

    @Nullable
    private final String adminDesignation;

    @NotNull
    private final String fullName;
    private final boolean isLoggedIn;

    @Nullable
    private final String mosqueAffiliation;

    @NotNull
    private final String phoneNumber;

    @NotNull
    private final UserRole role;

    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, String str2, UserRole userRole, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfile.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = userProfile.fullName;
        }
        if ((i & 4) != 0) {
            userRole = userProfile.role;
        }
        if ((i & 8) != 0) {
            str3 = userProfile.adminDesignation;
        }
        if ((i & 16) != 0) {
            str4 = userProfile.mosqueAffiliation;
        }
        if ((i & 32) != 0) {
            z = userProfile.isLoggedIn;
        }
        String str5 = str4;
        boolean z2 = z;
        return userProfile.copy(str, str2, userRole, str3, str5, z2);
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
    public final UserRole getRole() {
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
    public final UserProfile copy(@NotNull String phoneNumber, @NotNull String fullName, @NotNull UserRole role, @Nullable String adminDesignation, @Nullable String mosqueAffiliation, boolean isLoggedIn) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        return new UserProfile(phoneNumber, fullName, role, adminDesignation, mosqueAffiliation, isLoggedIn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return Intrinsics.areEqual(this.phoneNumber, userProfile.phoneNumber) && Intrinsics.areEqual(this.fullName, userProfile.fullName) && this.role == userProfile.role && Intrinsics.areEqual(this.adminDesignation, userProfile.adminDesignation) && Intrinsics.areEqual(this.mosqueAffiliation, userProfile.mosqueAffiliation) && this.isLoggedIn == userProfile.isLoggedIn;
    }

    public int hashCode() {
        return (((((((((this.phoneNumber.hashCode() * 31) + this.fullName.hashCode()) * 31) + this.role.hashCode()) * 31) + (this.adminDesignation == null ? 0 : this.adminDesignation.hashCode())) * 31) + (this.mosqueAffiliation != null ? this.mosqueAffiliation.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoggedIn);
    }

    @NotNull
    public String toString() {
        return "UserProfile(phoneNumber=" + this.phoneNumber + ", fullName=" + this.fullName + ", role=" + this.role + ", adminDesignation=" + this.adminDesignation + ", mosqueAffiliation=" + this.mosqueAffiliation + ", isLoggedIn=" + this.isLoggedIn + ")";
    }

    public UserProfile(@NotNull String phoneNumber, @NotNull String fullName, @NotNull UserRole role, @Nullable String adminDesignation, @Nullable String mosqueAffiliation, boolean isLoggedIn) {
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

    public /* synthetic */ UserProfile(String str, String str2, UserRole userRole, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, userRole, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? true : z);
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
    public final UserRole getRole() {
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
