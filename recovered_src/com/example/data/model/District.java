package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrayerModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/example/data/model/District;", "", "id", "", "name", "province", "latitude", "", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getId", "()Ljava/lang/String;", "getName", "getProvince", "getLatitude", "()D", "getLongitude", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/District.dex */
public final /* data */ class District {
    public static final int $stable = 0;

    @NotNull
    private final String id;
    private final double latitude;
    private final double longitude;

    @NotNull
    private final String name;

    @NotNull
    private final String province;

    public static /* synthetic */ District copy$default(District district, String str, String str2, String str3, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = district.id;
        }
        if ((i & 2) != 0) {
            str2 = district.name;
        }
        if ((i & 4) != 0) {
            str3 = district.province;
        }
        if ((i & 8) != 0) {
            d = district.latitude;
        }
        if ((i & 16) != 0) {
            d2 = district.longitude;
        }
        double d3 = d2;
        String str4 = str3;
        return district.copy(str, str2, str4, d, d3);
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
    public final String getProvince() {
        return this.province;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final District copy(@NotNull String id, @NotNull String name, @NotNull String province, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(province, "province");
        return new District(id, name, province, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof District)) {
            return false;
        }
        District district = (District) other;
        return Intrinsics.areEqual(this.id, district.id) && Intrinsics.areEqual(this.name, district.name) && Intrinsics.areEqual(this.province, district.province) && Double.compare(this.latitude, district.latitude) == 0 && Double.compare(this.longitude, district.longitude) == 0;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.province.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude);
    }

    @NotNull
    public String toString() {
        return "District(id=" + this.id + ", name=" + this.name + ", province=" + this.province + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    public District(@NotNull String id, @NotNull String name, @NotNull String province, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(province, "province");
        this.id = id;
        this.name = name;
        this.province = province;
        this.latitude = latitude;
        this.longitude = longitude;
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
    public final String getProvince() {
        return this.province;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }
}
