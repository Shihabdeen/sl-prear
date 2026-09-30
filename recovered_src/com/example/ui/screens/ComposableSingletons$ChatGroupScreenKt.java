package com.example.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.SendKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ChatGroupScreen.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatGroupScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatGroupScreen.kt\ncom/example/ui/screens/ComposableSingletons$ChatGroupScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,772:1\n148#2:773\n148#2:810\n148#2:811\n148#2:816\n148#2:854\n148#2:859\n148#2:860\n98#3:774\n95#3,6:775\n101#3:809\n105#3:815\n78#4,6:781\n85#4,4:796\n89#4,2:806\n93#4:814\n78#4,6:825\n85#4,4:840\n89#4,2:850\n93#4:857\n368#5,9:787\n377#5:808\n378#5,2:812\n368#5,9:831\n377#5:852\n378#5,2:855\n4032#6,6:800\n4032#6,6:844\n71#7:817\n67#7,7:818\n74#7:853\n78#7:858\n*S KotlinDebug\n*F\n+ 1 ChatGroupScreen.kt\ncom/example/ui/screens/ComposableSingletons$ChatGroupScreenKt\n*L\n200#1:773\n205#1:810\n209#1:811\n464#1:816\n500#1:854\n747#1:859\n763#1:860\n199#1:774\n199#1:775,6\n199#1:809\n199#1:815\n199#1:781,6\n199#1:796,4\n199#1:806,2\n199#1:814\n495#1:825,6\n495#1:840,4\n495#1:850,2\n495#1:857\n199#1:787,9\n199#1:808\n199#1:812,2\n495#1:831,9\n495#1:852\n495#1:855,2\n199#1:800,6\n495#1:844,6\n495#1:817\n495#1:818,7\n495#1:853\n495#1:858\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ComposableSingletons$ChatGroupScreenKt.dex */
public final class ComposableSingletons$ChatGroupScreenKt {

    @NotNull
    public static final ComposableSingletons$ChatGroupScreenKt INSTANCE = new ComposableSingletons$ChatGroupScreenKt();

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1707847868 = ComposableLambdaKt.composableLambdaInstance(1707847868, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatGroupScreenKt.lambda_1707847868$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1839791347, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f20lambda$1839791347 = ComposableLambdaKt.composableLambdaInstance(-1839791347, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatGroupScreenKt.lambda__1839791347$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1184924778, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f18lambda$1184924778 = ComposableLambdaKt.composableLambdaInstance(-1184924778, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatGroupScreenKt.lambda__1184924778$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$250135775 = ComposableLambdaKt.composableLambdaInstance(250135775, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatGroupScreenKt.lambda_250135775$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1984598787 = ComposableLambdaKt.composableLambdaInstance(1984598787, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatGroupScreenKt.lambda_1984598787$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1046794122, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f17lambda$1046794122 = ComposableLambdaKt.composableLambdaInstance(-1046794122, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatGroupScreenKt.lambda__1046794122$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1600427306 = ComposableLambdaKt.composableLambdaInstance(1600427306, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatGroupScreenKt.lambda_1600427306$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1809323160, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f19lambda$1809323160 = ComposableLambdaKt.composableLambdaInstance(-1809323160, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatGroupScreenKt.lambda__1809323160$lambda$9((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-754549092, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f21lambda$754549092 = ComposableLambdaKt.composableLambdaInstance(-754549092, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatGroupScreenKt.lambda__754549092$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$401281569 = ComposableLambdaKt.composableLambdaInstance(401281569, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatGroupScreenKt.lambda_401281569$lambda$11((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    /* renamed from: getLambda$-1046794122$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m34getLambda$1046794122$app() {
        return f17lambda$1046794122;
    }

    @NotNull
    /* renamed from: getLambda$-1184924778$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m35getLambda$1184924778$app() {
        return f18lambda$1184924778;
    }

    @NotNull
    /* renamed from: getLambda$-1809323160$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m36getLambda$1809323160$app() {
        return f19lambda$1809323160;
    }

    @NotNull
    /* renamed from: getLambda$-1839791347$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m37getLambda$1839791347$app() {
        return f20lambda$1839791347;
    }

    @NotNull
    /* renamed from: getLambda$-754549092$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m38getLambda$754549092$app() {
        return f21lambda$754549092;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1600427306$app() {
        return lambda$1600427306;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1707847868$app() {
        return lambda$1707847868;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1984598787$app() {
        return lambda$1984598787;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$250135775$app() {
        return lambda$250135775;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$401281569$app() {
        return lambda$401281569;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_1707847868$lambda$1(androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda_1707847868$lambda$1(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1839791347$lambda$2(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C326@12871L11,326@12816L73:ChatGroupScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1839791347, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$-1839791347.<anonymous> (ChatGroupScreen.kt:326)");
            }
            TextKt.Text--4IGK_g("Logout", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 3078, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1184924778$lambda$3(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C333@13080L72:ChatGroupScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1184924778, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$-1184924778.<anonymous> (ChatGroupScreen.kt:333)");
            }
            TextKt.Text--4IGK_g("Login with Phone", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_250135775$lambda$4(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C433@16391L51:ChatGroupScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(250135775, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$250135775.<anonymous> (ChatGroupScreen.kt:433)");
            }
            TextKt.Text--4IGK_g("Broadcast official announcement as Admin...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_1984598787$lambda$5(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C462@17485L11,459@17334L237:ChatGroupScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1984598787, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$1984598787.<anonymous> (ChatGroupScreen.kt:459)");
            }
            IconKt.Icon-ww6aTOc(SendKt.getSend(Icons.INSTANCE.getDefault()), "Send Announcement", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1046794122$lambda$7(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda__1046794122$lambda$7(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_1600427306$lambda$8(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C537@20449L89:ChatGroupScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600427306, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$1600427306.<anonymous> (ChatGroupScreen.kt:537)");
            }
            TextKt.Text--4IGK_g("⚡ Admin Mode", (Modifier) null, Color.Companion.getBlack-0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 200070, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1809323160$lambda$9(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C544@20724L31:ChatGroupScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1809323160, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$-1809323160.<anonymous> (ChatGroupScreen.kt:544)");
            }
            TextKt.Text--4IGK_g("Login", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__754549092$lambda$10(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C745@27873L11,742@27712L241:ChatGroupScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-754549092, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$-754549092.<anonymous> (ChatGroupScreen.kt:742)");
            }
            IconKt.Icon-ww6aTOc(ShareKt.getShare(Icons.INSTANCE.getDefault()), "Share Announcement to Other Apps", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_401281569$lambda$11(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C761@28405L11,758@28250L256:ChatGroupScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(401281569, $changed, -1, "com.example.ui.screens.ComposableSingletons$ChatGroupScreenKt.lambda$401281569.<anonymous> (ChatGroupScreen.kt:758)");
            }
            IconKt.Icon-ww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "Delete Announcement", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError-0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
