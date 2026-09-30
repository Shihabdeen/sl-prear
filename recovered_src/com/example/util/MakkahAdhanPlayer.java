package com.example.util;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import com.example.R;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MakkahAdhanPlayer.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00122\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010 J\u0006\u0010!\u001a\u00020\u001aJ\u0018\u0010\"\u001a\u00020\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006#"}, d2 = {"Lcom/example/util/MakkahAdhanPlayer;", "", "<init>", "()V", "TAG", "", "MAKKAH_ADHAN_URLS", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "audioTrack", "Landroid/media/AudioTrack;", "synthJob", "Lkotlinx/coroutines/Job;", "handler", "Landroid/os/Handler;", "_isPlaying", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isPlaying", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_currentPrayerName", "currentPrayerName", "getCurrentPrayerName", "playMakkahAdhan", "", "context", "Landroid/content/Context;", "prayerName", "isAlarmStream", "onCompletion", "Lkotlin/Function0;", "stopAdhan", "playProceduralMakkahAzan", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/MakkahAdhanPlayer.dex */
public final class MakkahAdhanPlayer {

    @NotNull
    private static final String TAG = "MakkahAdhanPlayer";

    @Nullable
    private static AudioTrack audioTrack;

    @Nullable
    private static MediaPlayer mediaPlayer;

    @Nullable
    private static Job synthJob;

    @NotNull
    public static final MakkahAdhanPlayer INSTANCE = new MakkahAdhanPlayer();

    @NotNull
    private static final List<String> MAKKAH_ADHAN_URLS = CollectionsKt.listOf(new String[]{"https://cdn.islamic.network/adhan/makkah.mp3", "https://media.sd.ma/assabile/adhan_3435345/001.mp3", "https://everyayah.com/data/adhan/makkah.mp3"});

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private static final MutableStateFlow<Boolean> _isPlaying = StateFlowKt.MutableStateFlow(false);

    @NotNull
    private static final StateFlow<Boolean> isPlaying = FlowKt.asStateFlow(_isPlaying);

    @NotNull
    private static final MutableStateFlow<String> _currentPrayerName = StateFlowKt.MutableStateFlow("Prayer");

    @NotNull
    private static final StateFlow<String> currentPrayerName = FlowKt.asStateFlow(_currentPrayerName);
    public static final int $stable = 8;

    private MakkahAdhanPlayer() {
    }

    @NotNull
    public final StateFlow<Boolean> isPlaying() {
        return isPlaying;
    }

    @NotNull
    public final StateFlow<String> getCurrentPrayerName() {
        return currentPrayerName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playMakkahAdhan$default(MakkahAdhanPlayer makkahAdhanPlayer, Context context, String str, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "Fajr";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        makkahAdhanPlayer.playMakkahAdhan(context, str, z, function0);
    }

    public final void playMakkahAdhan(@NotNull Context context, @NotNull String prayerName, boolean isAlarmStream, @Nullable final Function0<Unit> onCompletion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prayerName, "prayerName");
        stopAdhan();
        _currentPrayerName.setValue(prayerName);
        _isPlaying.setValue(true);
        AudioAttributes audioAttributes = new AudioAttributes.Builder().setContentType(1).setUsage(isAlarmStream ? 4 : 1).build();
        try {
            AssetFileDescriptor afd = context.getResources().openRawResourceFd(R.raw.makkah_adhan);
            if (afd != null) {
                MediaPlayer mp = new MediaPlayer();
                mp.setAudioAttributes(audioAttributes);
                mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                afd.close();
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.example.util.MakkahAdhanPlayer$$ExternalSyntheticLambda0
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer2) {
                        MakkahAdhanPlayer.playMakkahAdhan$lambda$3$lambda$0(mediaPlayer2);
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.example.util.MakkahAdhanPlayer$$ExternalSyntheticLambda1
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        MakkahAdhanPlayer.playMakkahAdhan$lambda$3$lambda$1(onCompletion, mediaPlayer2);
                    }
                });
                mp.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.example.util.MakkahAdhanPlayer$$ExternalSyntheticLambda2
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                        return MakkahAdhanPlayer.playMakkahAdhan$lambda$3$lambda$2(onCompletion, mediaPlayer2, i, i2);
                    }
                });
                mp.prepareAsync();
                mediaPlayer = mp;
                return;
            }
        } catch (Exception e) {
            Log.w(TAG, "Could not open local raw adhan: " + e.getMessage());
        }
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new MakkahAdhanPlayer$playMakkahAdhan$1(onCompletion, audioAttributes, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void playMakkahAdhan$lambda$3$lambda$0(MediaPlayer player) {
        if (((Boolean) _isPlaying.getValue()).booleanValue()) {
            player.start();
            Log.i(TAG, "Makkah Azan local audio playback started successfully");
        } else {
            player.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void playMakkahAdhan$lambda$3$lambda$1(Function0 $onCompletion, MediaPlayer it) {
        INSTANCE.stopAdhan();
        if ($onCompletion != null) {
            $onCompletion.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean playMakkahAdhan$lambda$3$lambda$2(Function0 $onCompletion, MediaPlayer player, int what, int extra) {
        Log.w(TAG, "Local MediaPlayer error: what=" + what + ", extra=" + extra);
        try {
            player.reset();
            player.release();
        } catch (Exception e) {
        }
        mediaPlayer = null;
        INSTANCE.playProceduralMakkahAzan($onCompletion);
        return true;
    }

    public final void stopAdhan() {
        try {
            try {
                Job job = synthJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                synthJob = null;
                AudioTrack audioTrack2 = audioTrack;
                if (audioTrack2 != null) {
                    try {
                        if (audioTrack2.getPlayState() == 3) {
                            audioTrack2.stop();
                        }
                    } catch (Exception e) {
                    }
                    audioTrack2.release();
                }
                audioTrack = null;
                MediaPlayer mediaPlayer2 = mediaPlayer;
                if (mediaPlayer2 != null) {
                    try {
                        if (mediaPlayer2.isPlaying()) {
                            mediaPlayer2.stop();
                        }
                    } catch (Exception e2) {
                    }
                    try {
                        mediaPlayer2.reset();
                        mediaPlayer2.release();
                    } catch (Exception e3) {
                    }
                }
                mediaPlayer = null;
            } catch (Exception e4) {
                Log.w(TAG, "Error stopping Adhan: " + e4.getMessage());
            }
        } finally {
            _isPlaying.setValue(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playProceduralMakkahAzan(Function0<Unit> onCompletion) {
        synthJob = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new MakkahAdhanPlayer$playProceduralMakkahAzan$1(onCompletion, null), 3, (Object) null);
    }
}
