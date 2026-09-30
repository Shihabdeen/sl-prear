package com.example.util;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import com.example.data.model.AudioPlayerState;
import com.example.data.model.Surah;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AudioRecitationManager.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0014\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u0017J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0006\u0010#\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006$"}, d2 = {"Lcom/example/util/AudioRecitationManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "handler", "Landroid/os/Handler;", "isUpdatingProgress", "", "_playerState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/data/model/AudioPlayerState;", "playerState", "Lkotlinx/coroutines/flow/StateFlow;", "getPlayerState", "()Lkotlinx/coroutines/flow/StateFlow;", "progressRunnable", "com/example/util/AudioRecitationManager$progressRunnable$1", "Lcom/example/util/AudioRecitationManager$progressRunnable$1;", "playSurah", "", "surah", "Lcom/example/data/model/Surah;", "pause", "resume", "seekTo", "positionMs", "", "toggleLoop", "stop", "startProgressUpdates", "stopProgressUpdates", "release", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/AudioRecitationManager.dex */
public final class AudioRecitationManager {
    public static final int $stable = 8;

    @NotNull
    private final MutableStateFlow<AudioPlayerState> _playerState;

    @NotNull
    private final Context context;

    @NotNull
    private final Handler handler;
    private boolean isUpdatingProgress;

    @Nullable
    private MediaPlayer mediaPlayer;

    @NotNull
    private final StateFlow<AudioPlayerState> playerState;

    @NotNull
    private final AudioRecitationManager$progressRunnable$1 progressRunnable;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.example.util.AudioRecitationManager$progressRunnable$1] */
    public AudioRecitationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.handler = new Handler(Looper.getMainLooper());
        this._playerState = StateFlowKt.MutableStateFlow(new AudioPlayerState(null, false, false, 0, 0, 0.0f, false, null, 255, null));
        this.playerState = FlowKt.asStateFlow(this._playerState);
        this.progressRunnable = new Runnable() { // from class: com.example.util.AudioRecitationManager$progressRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                int durationMs;
                Handler handler;
                mediaPlayer = AudioRecitationManager.this.mediaPlayer;
                if (mediaPlayer != null) {
                    AudioRecitationManager audioRecitationManager = AudioRecitationManager.this;
                    try {
                        if (mediaPlayer.isPlaying()) {
                            int currentPosition = mediaPlayer.getCurrentPosition();
                            int duration = mediaPlayer.getDuration();
                            mutableStateFlow = audioRecitationManager._playerState;
                            mutableStateFlow2 = audioRecitationManager._playerState;
                            AudioPlayerState audioPlayerState = (AudioPlayerState) mutableStateFlow2.getValue();
                            if (duration > 0) {
                                durationMs = duration;
                            } else {
                                mutableStateFlow3 = audioRecitationManager._playerState;
                                durationMs = ((AudioPlayerState) mutableStateFlow3.getValue()).getDurationMs();
                            }
                            mutableStateFlow.setValue(AudioPlayerState.copy$default(audioPlayerState, null, true, false, currentPosition, durationMs, 0.0f, false, null, 225, null));
                            handler = audioRecitationManager.handler;
                            handler.postDelayed(this, 500L);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        Integer.valueOf(Log.e("AudioRecitation", "Progress update error", e));
                    }
                }
            }
        };
    }

    @NotNull
    public final StateFlow<AudioPlayerState> getPlayerState() {
        return this.playerState;
    }

    public final void playSurah(@NotNull Surah surah) {
        Intrinsics.checkNotNullParameter(surah, "surah");
        Surah currentSurah = ((AudioPlayerState) this._playerState.getValue()).getCurrentSurah();
        boolean z = false;
        if (currentSurah != null && currentSurah.getNumber() == surah.getNumber()) {
            z = true;
        }
        if (z && this.mediaPlayer != null) {
            resume();
            return;
        }
        stop();
        this._playerState.setValue(new AudioPlayerState(surah, false, true, 0, 0, 0.0f, false, null, 96, null));
        try {
            MediaPlayer player = new MediaPlayer();
            player.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build());
            player.setDataSource(surah.getAudioUrl());
            player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.example.util.AudioRecitationManager$$ExternalSyntheticLambda0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    AudioRecitationManager.playSurah$lambda$3$lambda$0(AudioRecitationManager.this, mediaPlayer);
                }
            });
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.example.util.AudioRecitationManager$$ExternalSyntheticLambda1
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    AudioRecitationManager.playSurah$lambda$3$lambda$1(AudioRecitationManager.this, mediaPlayer);
                }
            });
            player.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.example.util.AudioRecitationManager$$ExternalSyntheticLambda2
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    return AudioRecitationManager.playSurah$lambda$3$lambda$2(AudioRecitationManager.this, mediaPlayer, i, i2);
                }
            });
            this.mediaPlayer = player;
            player.prepareAsync();
        } catch (Exception e) {
            Log.e("AudioRecitation", "Failed to start player", e);
            this._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this._playerState.getValue(), null, false, false, 0, 0, 0.0f, false, "Could not initialize recitation audio: " + e.getLocalizedMessage(), 121, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void playSurah$lambda$3$lambda$0(AudioRecitationManager this$0, MediaPlayer mp) {
        this$0._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this$0._playerState.getValue(), null, true, false, 0, mp.getDuration(), 0.0f, false, null, 233, null));
        mp.start();
        this$0.startProgressUpdates();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void playSurah$lambda$3$lambda$1(AudioRecitationManager this$0, MediaPlayer it) {
        if (((AudioPlayerState) this$0._playerState.getValue()).isLooping()) {
            it.seekTo(0);
            it.start();
        } else {
            this$0._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this$0._playerState.getValue(), null, false, false, 0, 0, 0.0f, false, null, 245, null));
            this$0.stopProgressUpdates();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean playSurah$lambda$3$lambda$2(AudioRecitationManager this$0, MediaPlayer mp, int what, int extra) {
        Log.w("AudioRecitation", "MediaPlayer error: what=" + what + " extra=" + extra);
        this$0._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this$0._playerState.getValue(), null, false, false, 0, 0, 0.0f, false, "Audio recitation stream unavailable. Please check connection.", 121, null));
        this$0.stopProgressUpdates();
        try {
            mp.reset();
            mp.release();
        } catch (Exception e) {
        }
        this$0.mediaPlayer = null;
        return true;
    }

    public final void pause() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            this._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this._playerState.getValue(), null, false, false, 0, 0, 0.0f, false, null, 253, null));
            stopProgressUpdates();
        }
    }

    public final void resume() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
            this._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this._playerState.getValue(), null, true, false, 0, 0, 0.0f, false, null, 253, null));
            startProgressUpdates();
        }
    }

    public final void seekTo(int positionMs) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(positionMs);
                this._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this._playerState.getValue(), null, false, false, positionMs, 0, 0.0f, false, null, 247, null));
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.e("AudioRecitation", "Seek error", e));
            }
        }
    }

    public final void toggleLoop() {
        boolean newLoop = !((AudioPlayerState) this._playerState.getValue()).isLooping();
        this._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this._playerState.getValue(), null, false, false, 0, 0, 0.0f, newLoop, null, 191, null));
    }

    public final void stop() {
        stopProgressUpdates();
        try {
            try {
                MediaPlayer mediaPlayer = this.mediaPlayer;
                if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer.reset();
                    mediaPlayer.release();
                }
            } catch (Exception e) {
                Log.w("AudioRecitation", "Error releasing player: " + e.getMessage());
            }
        } finally {
            this.mediaPlayer = null;
            this._playerState.setValue(AudioPlayerState.copy$default((AudioPlayerState) this._playerState.getValue(), null, false, false, 0, 0, 0.0f, false, null, 249, null));
        }
    }

    private final void startProgressUpdates() {
        if (!this.isUpdatingProgress) {
            this.isUpdatingProgress = true;
            this.handler.post(this.progressRunnable);
        }
    }

    private final void stopProgressUpdates() {
        this.isUpdatingProgress = false;
        this.handler.removeCallbacks(this.progressRunnable);
    }

    public final void release() {
        stop();
    }
}
