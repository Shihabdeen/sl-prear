package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: QuranModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/example/data/model/AudioPlayerState;", "", "currentSurah", "Lcom/example/data/model/Surah;", "isPlaying", "", "isLoading", "currentPositionMs", "", "durationMs", "playbackSpeed", "", "isLooping", "errorMessage", "", "<init>", "(Lcom/example/data/model/Surah;ZZIIFZLjava/lang/String;)V", "getCurrentSurah", "()Lcom/example/data/model/Surah;", "()Z", "getCurrentPositionMs", "()I", "getDurationMs", "getPlaybackSpeed", "()F", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/AudioPlayerState.dex */
public final /* data */ class AudioPlayerState {
    public static final int $stable = 0;
    private final int currentPositionMs;

    @Nullable
    private final Surah currentSurah;
    private final int durationMs;

    @Nullable
    private final String errorMessage;
    private final boolean isLoading;
    private final boolean isLooping;
    private final boolean isPlaying;
    private final float playbackSpeed;

    public AudioPlayerState() {
        this(null, false, false, 0, 0, 0.0f, false, null, 255, null);
    }

    public static /* synthetic */ AudioPlayerState copy$default(AudioPlayerState audioPlayerState, Surah surah, boolean z, boolean z2, int i, int i2, float f, boolean z3, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            surah = audioPlayerState.currentSurah;
        }
        if ((i3 & 2) != 0) {
            z = audioPlayerState.isPlaying;
        }
        if ((i3 & 4) != 0) {
            z2 = audioPlayerState.isLoading;
        }
        if ((i3 & 8) != 0) {
            i = audioPlayerState.currentPositionMs;
        }
        if ((i3 & 16) != 0) {
            i2 = audioPlayerState.durationMs;
        }
        if ((i3 & 32) != 0) {
            f = audioPlayerState.playbackSpeed;
        }
        if ((i3 & 64) != 0) {
            z3 = audioPlayerState.isLooping;
        }
        if ((i3 & 128) != 0) {
            str = audioPlayerState.errorMessage;
        }
        boolean z4 = z3;
        String str2 = str;
        int i4 = i2;
        float f2 = f;
        return audioPlayerState.copy(surah, z, z2, i, i4, f2, z4, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Surah getCurrentSurah() {
        return this.currentSurah;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCurrentPositionMs() {
        return this.currentPositionMs;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component6, reason: from getter */
    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLooping() {
        return this.isLooping;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final AudioPlayerState copy(@Nullable Surah currentSurah, boolean isPlaying, boolean isLoading, int currentPositionMs, int durationMs, float playbackSpeed, boolean isLooping, @Nullable String errorMessage) {
        return new AudioPlayerState(currentSurah, isPlaying, isLoading, currentPositionMs, durationMs, playbackSpeed, isLooping, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioPlayerState)) {
            return false;
        }
        AudioPlayerState audioPlayerState = (AudioPlayerState) other;
        return Intrinsics.areEqual(this.currentSurah, audioPlayerState.currentSurah) && this.isPlaying == audioPlayerState.isPlaying && this.isLoading == audioPlayerState.isLoading && this.currentPositionMs == audioPlayerState.currentPositionMs && this.durationMs == audioPlayerState.durationMs && Float.compare(this.playbackSpeed, audioPlayerState.playbackSpeed) == 0 && this.isLooping == audioPlayerState.isLooping && Intrinsics.areEqual(this.errorMessage, audioPlayerState.errorMessage);
    }

    public int hashCode() {
        return ((((((((((((((this.currentSurah == null ? 0 : this.currentSurah.hashCode()) * 31) + Boolean.hashCode(this.isPlaying)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Integer.hashCode(this.currentPositionMs)) * 31) + Integer.hashCode(this.durationMs)) * 31) + Float.hashCode(this.playbackSpeed)) * 31) + Boolean.hashCode(this.isLooping)) * 31) + (this.errorMessage != null ? this.errorMessage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AudioPlayerState(currentSurah=" + this.currentSurah + ", isPlaying=" + this.isPlaying + ", isLoading=" + this.isLoading + ", currentPositionMs=" + this.currentPositionMs + ", durationMs=" + this.durationMs + ", playbackSpeed=" + this.playbackSpeed + ", isLooping=" + this.isLooping + ", errorMessage=" + this.errorMessage + ")";
    }

    public AudioPlayerState(@Nullable Surah currentSurah, boolean isPlaying, boolean isLoading, int currentPositionMs, int durationMs, float playbackSpeed, boolean isLooping, @Nullable String errorMessage) {
        this.currentSurah = currentSurah;
        this.isPlaying = isPlaying;
        this.isLoading = isLoading;
        this.currentPositionMs = currentPositionMs;
        this.durationMs = durationMs;
        this.playbackSpeed = playbackSpeed;
        this.isLooping = isLooping;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ AudioPlayerState(Surah surah, boolean z, boolean z2, int i, int i2, float f, boolean z3, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : surah, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : str);
    }

    @Nullable
    public final Surah getCurrentSurah() {
        return this.currentSurah;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final int getCurrentPositionMs() {
        return this.currentPositionMs;
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final boolean isLooping() {
        return this.isLooping;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
