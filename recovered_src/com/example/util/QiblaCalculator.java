package com.example.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: QiblaCalculator.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/example/util/QiblaCalculator;", "", "<init>", "()V", "KAABA_LATITUDE", "", "KAABA_LONGITUDE", "calculateQiblaBearing", "latitude", "longitude", "calculateDistanceToKaabaKm", "getCardinalDirection", "", "degrees", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/QiblaCalculator.dex */
public final class QiblaCalculator {
    public static final int $stable = 0;

    @NotNull
    public static final QiblaCalculator INSTANCE = new QiblaCalculator();
    public static final double KAABA_LATITUDE = 21.422487d;
    public static final double KAABA_LONGITUDE = 39.826206d;

    private QiblaCalculator() {
    }

    public final double calculateQiblaBearing(double latitude, double longitude) {
        double phi1 = Math.toRadians(latitude);
        double phi2 = Math.toRadians(21.422487d);
        double deltaLambda = Math.toRadians(39.826206d - longitude);
        double y = Math.sin(deltaLambda) * Math.cos(phi2);
        double x = (Math.cos(phi1) * Math.sin(phi2)) - ((Math.sin(phi1) * Math.cos(phi2)) * Math.cos(deltaLambda));
        double bearing = Math.toDegrees(Math.atan2(y, x));
        return (bearing + 360.0d) % 360.0d;
    }

    public final double calculateDistanceToKaabaKm(double latitude, double longitude) {
        double dLat = Math.toRadians(21.422487d - latitude);
        double dLon = Math.toRadians(39.826206d - longitude);
        double lat1 = Math.toRadians(latitude);
        double lat2 = Math.toRadians(21.422487d);
        double a = (Math.sin(dLat / 2.0d) * Math.sin(dLat / 2.0d)) + (Math.sin(dLon / 2.0d) * Math.sin(dLon / 2.0d) * Math.cos(lat1) * Math.cos(lat2));
        double c = Math.atan2(Math.sqrt(a), Math.sqrt(1.0d - a)) * 2.0d;
        return 6371.0d * c;
    }

    @NotNull
    public final String getCardinalDirection(double degrees) {
        String[] directions = {"N", "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S", "SSW", "SW", "WSW", "W", "WNW", "NW", "NNW"};
        int index = ((int) (((((degrees % 360.0d) + 360.0d) % 360.0d) / 22.5d) + 0.5d)) % 16;
        return directions[index];
    }
}
