package com.example.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompassSensorManager.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0012\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\fH\u0002J\u0006\u0010)\u001a\u00020\"J\u001a\u0010*\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020-H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/example/util/CompassSensorManager;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sensorManager", "Landroid/hardware/SensorManager;", "vibrator", "Landroid/os/Vibrator;", "_azimuthFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "azimuthFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getAzimuthFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "_isSensorAvailable", "", "isSensorAvailable", "rotationMatrix", "", "orientationValues", "lastSmoothedAzimuth", "lastVibratedAngle", "rotationSensor", "Landroid/hardware/Sensor;", "accelerometer", "magnetometer", "lastAccelerometer", "lastMagnetometer", "lastAccelerometerSet", "lastMagnetometerSet", "start", "", "stop", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "updateSmoothedAzimuth", "targetDeg", "triggerQiblaHaptic", "onAccuracyChanged", "sensor", "accuracy", "", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/CompassSensorManager.dex */
public final class CompassSensorManager implements SensorEventListener {
    public static final int $stable = 8;

    @NotNull
    private final MutableStateFlow<Float> _azimuthFlow;

    @NotNull
    private final MutableStateFlow<Boolean> _isSensorAvailable;

    @Nullable
    private Sensor accelerometer;

    @NotNull
    private final StateFlow<Float> azimuthFlow;

    @NotNull
    private final Context context;

    @NotNull
    private final StateFlow<Boolean> isSensorAvailable;

    @NotNull
    private float[] lastAccelerometer;
    private boolean lastAccelerometerSet;

    @NotNull
    private float[] lastMagnetometer;
    private boolean lastMagnetometerSet;
    private float lastSmoothedAzimuth;
    private float lastVibratedAngle;

    @Nullable
    private Sensor magnetometer;

    @NotNull
    private float[] orientationValues;

    @NotNull
    private float[] rotationMatrix;

    @Nullable
    private Sensor rotationSensor;

    @NotNull
    private final SensorManager sensorManager;

    @Nullable
    private final Vibrator vibrator;

    public CompassSensorManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = this.context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.sensorManager = (SensorManager) systemService;
        int i = Build.VERSION.SDK_INT;
        Context context2 = this.context;
        Vibrator vibrator = null;
        if (i >= 31) {
            Object systemService2 = context2.getSystemService("vibrator_manager");
            VibratorManager vibratorManager = systemService2 instanceof VibratorManager ? (VibratorManager) systemService2 : null;
            if (vibratorManager != null) {
                vibrator = vibratorManager.getDefaultVibrator();
            }
        } else {
            Object systemService3 = context2.getSystemService("vibrator");
            if (systemService3 instanceof Vibrator) {
                vibrator = (Vibrator) systemService3;
            }
        }
        this.vibrator = vibrator;
        this._azimuthFlow = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this.azimuthFlow = FlowKt.asStateFlow(this._azimuthFlow);
        this._isSensorAvailable = StateFlowKt.MutableStateFlow(true);
        this.isSensorAvailable = FlowKt.asStateFlow(this._isSensorAvailable);
        this.rotationMatrix = new float[9];
        this.orientationValues = new float[3];
        this.lastVibratedAngle = -999.0f;
        this.rotationSensor = this.sensorManager.getDefaultSensor(11);
        this.lastAccelerometer = new float[3];
        this.lastMagnetometer = new float[3];
        if (this.rotationSensor != null) {
            return;
        }
        this.accelerometer = this.sensorManager.getDefaultSensor(1);
        this.magnetometer = this.sensorManager.getDefaultSensor(2);
        if (this.accelerometer != null && this.magnetometer != null) {
            return;
        }
        this._isSensorAvailable.setValue(false);
    }

    @NotNull
    public final StateFlow<Float> getAzimuthFlow() {
        return this.azimuthFlow;
    }

    @NotNull
    public final StateFlow<Boolean> isSensorAvailable() {
        return this.isSensorAvailable;
    }

    public final void start() {
        if (this.rotationSensor != null) {
            this.sensorManager.registerListener(this, this.rotationSensor, 2);
            return;
        }
        Sensor sensor = this.accelerometer;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 2);
        }
        Sensor sensor2 = this.magnetometer;
        if (sensor2 != null) {
            this.sensorManager.registerListener(this, sensor2, 2);
        }
    }

    public final void stop() {
        this.sensorManager.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@Nullable SensorEvent event) {
        if (event == null) {
            return;
        }
        if (event.sensor.getType() == 11) {
            SensorManager.getRotationMatrixFromVector(this.rotationMatrix, event.values);
            SensorManager.getOrientation(this.rotationMatrix, this.orientationValues);
            float azimuthRad = this.orientationValues[0];
            double azimuthDeg = (Math.toDegrees(azimuthRad) + 360.0d) % 360.0d;
            updateSmoothedAzimuth((float) azimuthDeg);
        } else if (event.sensor.getType() == 1) {
            System.arraycopy(event.values, 0, this.lastAccelerometer, 0, event.values.length);
            this.lastAccelerometerSet = true;
        } else if (event.sensor.getType() == 2) {
            System.arraycopy(event.values, 0, this.lastMagnetometer, 0, event.values.length);
            this.lastMagnetometerSet = true;
        }
        if (this.lastAccelerometerSet && this.lastMagnetometerSet && SensorManager.getRotationMatrix(this.rotationMatrix, null, this.lastAccelerometer, this.lastMagnetometer)) {
            SensorManager.getOrientation(this.rotationMatrix, this.orientationValues);
            float azimuthRad2 = this.orientationValues[0];
            double azimuthDeg2 = (Math.toDegrees(azimuthRad2) + 360.0d) % 360.0d;
            updateSmoothedAzimuth((float) azimuthDeg2);
        }
    }

    private final void updateSmoothedAzimuth(float targetDeg) {
        float diff = targetDeg - this.lastSmoothedAzimuth;
        while (diff < -180.0f) {
            diff += 360.0f;
        }
        while (diff > 180.0f) {
            diff -= 360.0f;
        }
        this.lastSmoothedAzimuth = ((this.lastSmoothedAzimuth + (0.15f * diff)) + 360.0f) % 360.0f;
        this._azimuthFlow.setValue(Float.valueOf(this.lastSmoothedAzimuth));
    }

    public final void triggerQiblaHaptic() {
        try {
            if (Math.abs(this.lastSmoothedAzimuth - this.lastVibratedAngle) > 8.0f) {
                this.lastVibratedAngle = this.lastSmoothedAzimuth;
                int i = Build.VERSION.SDK_INT;
                Vibrator vibrator = this.vibrator;
                if (i >= 26) {
                    if (vibrator != null) {
                        vibrator.vibrate(VibrationEffect.createOneShot(45L, -1));
                    }
                } else if (vibrator != null) {
                    vibrator.vibrate(45L);
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
    }
}
