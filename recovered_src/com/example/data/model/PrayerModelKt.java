package com.example.data.model;

import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrayerModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"SriLankaDistricts", "", "Lcom/example/data/model/District;", "getSriLankaDistricts", "()Ljava/util/List;", "app"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/PrayerModelKt.dex */
public final class PrayerModelKt {

    @NotNull
    private static final List<District> SriLankaDistricts = CollectionsKt.listOf(new District[]{new District("hatton_bogawantalawa", "Hatton & Bogawantalawa", "Central", 6.8441d, 80.6294d), new District("colombo", "Colombo", "Western", 6.9271d, 79.8612d), new District("kandy", "Kandy", "Central", 7.2906d, 80.6337d), new District("galle", "Galle", "Southern", 6.0535d, 80.221d), new District("batticaloa", "Batticaloa", "Eastern", 7.731d, 81.6747d), new District("trincomalee", "Trincomalee", "Eastern", 8.5874d, 81.2152d), new District("jaffna", "Jaffna", "Northern", 9.6615d, 80.0255d), new District("gampaha", "Gampaha / Negombo", "Western", 7.084d, 80.0098d), new District("kalutara", "Kalutara / Beruwala", "Western", 6.5854d, 79.9607d), new District("ampara", "Ampara / Kalmunai", "Eastern", 7.2882d, 81.672d), new District("puttalam", "Puttalam", "North Western", 8.0362d, 79.8283d), new District("kurunegala", "Kurunegala", "North Western", 7.4863d, 80.3623d), new District("ratnapura", "Ratnapura", "Sabaragamuwa", 6.7056d, 80.3847d), new District("matale", "Matale", "Central", 7.4675d, 80.6234d), new District("nuwara_eliya", "Nuwara Eliya", "Central", 6.9497d, 80.7891d), new District("badulla", "Badulla", "Uva", 6.9934d, 81.055d), new District("anuradhapura", "Anuradhapura", "North Central", 8.3114d, 80.4037d), new District("matara", "Matara / Weligama", "Southern", 5.9549d, 80.555d), new District("hambantota", "Hambantota", "Southern", 6.1429d, 81.1212d), new District("kegalle", "Kegalle / Mawanella", "Sabaragamuwa", 7.2513d, 80.3464d), new District("polonnaruwa", "Polonnaruwa", "North Central", 7.9403d, 81.0188d), new District("mannar", "Mannar", "Northern", 8.981d, 79.9044d), new District("vavuniya", "Vavuniya", "Northern", 8.7514d, 80.4971d), new District("monaragala", "Monaragala", "Uva", 6.8728d, 81.3507d), new District("kilinochchi", "Kilinochchi", "Northern", 9.3803d, 80.377d), new District("mullaitivu", "Mullaitivu", "Northern", 9.2671d, 80.8143d)});

    @NotNull
    public static final List<District> getSriLankaDistricts() {
        return SriLankaDistricts;
    }
}
