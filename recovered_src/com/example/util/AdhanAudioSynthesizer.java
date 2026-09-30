package com.example.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdhanAudioSynthesizer.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/example/util/AdhanAudioSynthesizer;", "", "<init>", "()V", "isPlaying", "", "playAdhanChimePreview", "", "onComplete", "Lkotlin/Function0;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/util/AdhanAudioSynthesizer.dex */
public final class AdhanAudioSynthesizer {
    private static boolean isPlaying;

    @NotNull
    public static final AdhanAudioSynthesizer INSTANCE = new AdhanAudioSynthesizer();
    public static final int $stable = 8;

    private AdhanAudioSynthesizer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playAdhanChimePreview$default(AdhanAudioSynthesizer adhanAudioSynthesizer, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        adhanAudioSynthesizer.playAdhanChimePreview(function0);
    }

    public final void playAdhanChimePreview(@Nullable Function0<Unit> onComplete) {
        if (isPlaying) {
            return;
        }
        isPlaying = true;
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new AdhanAudioSynthesizer$playAdhanChimePreview$1(onComplete, null), 3, (Object) null);
    }
}
