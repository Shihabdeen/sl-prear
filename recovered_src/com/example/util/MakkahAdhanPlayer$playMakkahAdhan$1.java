package com.example.util;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.util.Log;
import com.example.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MakkahAdhanPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.util.MakkahAdhanPlayer$playMakkahAdhan$1", f = "MakkahAdhanPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/MakkahAdhanPlayer$playMakkahAdhan$1.dex */
public final class MakkahAdhanPlayer$playMakkahAdhan$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AudioAttributes $audioAttributes;
    final /* synthetic */ Function0<Unit> $onCompletion;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakkahAdhanPlayer$playMakkahAdhan$1(Function0<Unit> function0, AudioAttributes audioAttributes, Continuation<? super MakkahAdhanPlayer$playMakkahAdhan$1> continuation) {
        super(2, continuation);
        this.$onCompletion = function0;
        this.$audioAttributes = audioAttributes;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MakkahAdhanPlayer$playMakkahAdhan$1(this.$onCompletion, this.$audioAttributes, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                boolean streamSuccess = false;
                List streamUrls = CollectionsKt.listOf("https://raw.githubusercontent.com/Kiwifu/adhan-mp3/main/Ali_Ibn_Ahmad_Mala_6_-_Al_Haram_Al_Maki_(%D8%B9%D9%84%D9%8A_%D8%A8%D9%86_%D8%A3%D8%AD%D9%85%D8%AF_%D9%85%D9%84%D8%A7_-_%D8%A7%D9%84%D8%AD%D8%B1%D9%85_%D8%A7%D9%84%D9%85%D9%83%D9%8A).mp3");
                Iterator it = streamUrls.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String url = (String) it.next();
                        try {
                            Log.i("MakkahAdhanPlayer", "Attempting to stream Makkah Azan from: " + url);
                            MediaPlayer mp = new MediaPlayer();
                            AudioAttributes audioAttributes = this.$audioAttributes;
                            final Function0<Unit> function0 = this.$onCompletion;
                            mp.setAudioAttributes(audioAttributes);
                            mp.setDataSource(url);
                            mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.example.util.MakkahAdhanPlayer$playMakkahAdhan$1$$ExternalSyntheticLambda0
                                @Override // android.media.MediaPlayer.OnPreparedListener
                                public final void onPrepared(MediaPlayer mediaPlayer) {
                                    MakkahAdhanPlayer$playMakkahAdhan$1.invokeSuspend$lambda$3$lambda$0(mediaPlayer);
                                }
                            });
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.example.util.MakkahAdhanPlayer$playMakkahAdhan$1$$ExternalSyntheticLambda1
                                @Override // android.media.MediaPlayer.OnCompletionListener
                                public final void onCompletion(MediaPlayer mediaPlayer) {
                                    MakkahAdhanPlayer$playMakkahAdhan$1.invokeSuspend$lambda$3$lambda$1(function0, mediaPlayer);
                                }
                            });
                            mp.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.example.util.MakkahAdhanPlayer$playMakkahAdhan$1$$ExternalSyntheticLambda2
                                @Override // android.media.MediaPlayer.OnErrorListener
                                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                                    return MakkahAdhanPlayer$playMakkahAdhan$1.invokeSuspend$lambda$3$lambda$2(function0, mediaPlayer, i, i2);
                                }
                            });
                            mp.prepareAsync();
                            MakkahAdhanPlayer makkahAdhanPlayer = MakkahAdhanPlayer.INSTANCE;
                            MakkahAdhanPlayer.mediaPlayer = mp;
                            streamSuccess = true;
                        } catch (Exception e) {
                            Log.w("MakkahAdhanPlayer", "Failed streaming Makkah Azan from " + url + ": " + e.getMessage());
                        }
                    }
                }
                if (!streamSuccess) {
                    Log.i("MakkahAdhanPlayer", "Streaming unavailable; activating procedural Makkah Azan synthesizer fallback");
                    MakkahAdhanPlayer.INSTANCE.playProceduralMakkahAzan(this.$onCompletion);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void invokeSuspend$lambda$3$lambda$0(MediaPlayer player) {
        MutableStateFlow mutableStateFlow;
        mutableStateFlow = MakkahAdhanPlayer._isPlaying;
        if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
            player.start();
            Log.i("MakkahAdhanPlayer", "Makkah Azan audio stream started successfully");
        } else {
            player.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void invokeSuspend$lambda$3$lambda$1(Function0 $onCompletion, MediaPlayer it) {
        MakkahAdhanPlayer.INSTANCE.stopAdhan();
        if ($onCompletion != null) {
            $onCompletion.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean invokeSuspend$lambda$3$lambda$2(Function0 $onCompletion, MediaPlayer player, int what, int extra) {
        Log.w("MakkahAdhanPlayer", "MediaPlayer error: what=" + what + ", extra=" + extra);
        try {
            player.reset();
            player.release();
        } catch (Exception e) {
        }
        MakkahAdhanPlayer makkahAdhanPlayer = MakkahAdhanPlayer.INSTANCE;
        MakkahAdhanPlayer.mediaPlayer = null;
        MakkahAdhanPlayer.INSTANCE.playProceduralMakkahAzan($onCompletion);
        return true;
    }
}
