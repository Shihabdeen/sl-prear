package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: QiblaScreen.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQiblaScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaScreen.kt\ncom/example/ui/screens/ComposableSingletons$QiblaScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,394:1\n71#2:395\n67#2,7:396\n74#2:431\n78#2:436\n78#3,6:403\n85#3,4:418\n89#3,2:428\n93#3:435\n78#3,6:445\n85#3,4:460\n89#3,2:470\n93#3:479\n368#4,9:409\n377#4:430\n378#4,2:433\n368#4,9:451\n377#4:472\n378#4,2:477\n4032#5,6:422\n4032#5,6:464\n148#6:432\n148#6:437\n148#6:474\n148#6:475\n148#6:476\n148#6:481\n98#7:438\n95#7,6:439\n101#7:473\n105#7:480\n*S KotlinDebug\n*F\n+ 1 QiblaScreen.kt\ncom/example/ui/screens/ComposableSingletons$QiblaScreenKt\n*L\n235#1:395\n235#1:396,7\n235#1:431\n235#1:436\n235#1:403,6\n235#1:418,4\n235#1:428,2\n235#1:435\n370#1:445,6\n370#1:460,4\n370#1:470,2\n370#1:479\n235#1:409,9\n235#1:430\n235#1:433,2\n370#1:451,9\n370#1:472\n370#1:477,2\n235#1:422,6\n370#1:464,6\n240#1:432\n371#1:437\n379#1:474\n380#1:475\n382#1:476\n367#1:481\n370#1:438\n370#1:439,6\n370#1:473\n370#1:480\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ComposableSingletons$QiblaScreenKt.dex */
public final class ComposableSingletons$QiblaScreenKt {

    @NotNull
    public static final ComposableSingletons$QiblaScreenKt INSTANCE = new ComposableSingletons$QiblaScreenKt();

    /* renamed from: lambda$-1284329463, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f48lambda$1284329463 = ComposableLambdaKt.composableLambdaInstance(-1284329463, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$QiblaScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$QiblaScreenKt.lambda__1284329463$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1479716617 = ComposableLambdaKt.composableLambdaInstance(1479716617, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$QiblaScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$QiblaScreenKt.lambda_1479716617$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-295994684, reason: not valid java name */
    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> f49lambda$295994684 = ComposableLambdaKt.composableLambdaInstance(-295994684, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$QiblaScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$QiblaScreenKt.lambda__295994684$lambda$4((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    /* renamed from: getLambda$-1284329463$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m65getLambda$1284329463$app() {
        return f48lambda$1284329463;
    }

    @NotNull
    /* renamed from: getLambda$-295994684$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m66getLambda$295994684$app() {
        return f49lambda$295994684;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1479716617$app() {
        return lambda$1479716617;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1284329463$lambda$1(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$QiblaScreenKt.lambda__1284329463$lambda$1(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__295994684$lambda$4(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C367@13595L11,363@13458L1025:QiblaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-295994684, $changed, -1, "com.example.ui.screens.ComposableSingletons$QiblaScreenKt.lambda$-295994684.<anonymous> (QiblaScreen.kt:363)");
            }
            SurfaceKt.Surface-T9BRK9s(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12))), (Shape) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0.0f, 0.0f, (BorderStroke) null, lambda$1479716617, $composer, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0205  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_1479716617$lambda$3(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$QiblaScreenKt.lambda_1479716617$lambda$3(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
