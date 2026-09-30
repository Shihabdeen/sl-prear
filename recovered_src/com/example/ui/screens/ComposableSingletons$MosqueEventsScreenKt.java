package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MosqueEventsScreen.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMosqueEventsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosqueEventsScreen.kt\ncom/example/ui/screens/ComposableSingletons$MosqueEventsScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,454:1\n148#2:455\n148#2:492\n148#2:534\n148#2:535\n148#2:540\n148#2:541\n148#2:578\n85#3:456\n82#3,6:457\n88#3:491\n92#3:496\n85#3:497\n81#3,7:498\n88#3:533\n92#3:539\n78#4,6:463\n85#4,4:478\n89#4,2:488\n93#4:495\n78#4,6:505\n85#4,4:520\n89#4,2:530\n93#4:538\n78#4,6:549\n85#4,4:564\n89#4,2:574\n93#4:581\n368#5,9:469\n377#5:490\n378#5,2:493\n368#5,9:511\n377#5:532\n378#5,2:536\n368#5,9:555\n377#5:576\n378#5,2:579\n4032#6,6:482\n4032#6,6:524\n4032#6,6:568\n98#7:542\n95#7,6:543\n101#7:577\n105#7:582\n*S KotlinDebug\n*F\n+ 1 MosqueEventsScreen.kt\ncom/example/ui/screens/ComposableSingletons$MosqueEventsScreenKt\n*L\n91#1:455\n98#1:492\n157#1:534\n159#1:535\n146#1:540\n190#1:541\n194#1:578\n91#1:456\n91#1:457,6\n91#1:491\n91#1:496\n149#1:497\n149#1:498,7\n149#1:533\n149#1:539\n91#1:463,6\n91#1:478,4\n91#1:488,2\n91#1:495\n149#1:505,6\n149#1:520,4\n149#1:530,2\n149#1:538\n189#1:549,6\n189#1:564,4\n189#1:574,2\n189#1:581\n91#1:469,9\n91#1:490\n91#1:493,2\n149#1:511,9\n149#1:532\n149#1:536,2\n189#1:555,9\n189#1:576\n189#1:579,2\n91#1:482,6\n149#1:524,6\n189#1:568,6\n189#1:542\n189#1:543,6\n189#1:577\n189#1:582\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ComposableSingletons$MosqueEventsScreenKt.dex */
public final class ComposableSingletons$MosqueEventsScreenKt {

    @NotNull
    public static final ComposableSingletons$MosqueEventsScreenKt INSTANCE = new ComposableSingletons$MosqueEventsScreenKt();

    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$470598088 = ComposableLambdaKt.composableLambdaInstance(470598088, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_470598088$lambda$1((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1157752722 = ComposableLambdaKt.composableLambdaInstance(1157752722, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_1157752722$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$982058445 = ComposableLambdaKt.composableLambdaInstance(982058445, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_982058445$lambda$4((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$604480666 = ComposableLambdaKt.composableLambdaInstance(604480666, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_604480666$lambda$6((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1537486392 = ComposableLambdaKt.composableLambdaInstance(1537486392, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_1537486392$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-512922506, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f40lambda$512922506 = ComposableLambdaKt.composableLambdaInstance(-512922506, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda__512922506$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$467544977 = ComposableLambdaKt.composableLambdaInstance(467544977, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_467544977$lambda$9((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-117955040, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f38lambda$117955040 = ComposableLambdaKt.composableLambdaInstance(-117955040, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda__117955040$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-526617847, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f41lambda$526617847 = ComposableLambdaKt.composableLambdaInstance(-526617847, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda__526617847$lambda$11((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1184660520 = ComposableLambdaKt.composableLambdaInstance(1184660520, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_1184660520$lambda$12((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1399028409, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f39lambda$1399028409 = ComposableLambdaKt.composableLambdaInstance(-1399028409, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda__1399028409$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$312249958 = ComposableLambdaKt.composableLambdaInstance(312249958, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_312249958$lambda$14((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$2023528325 = ComposableLambdaKt.composableLambdaInstance(2023528325, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MosqueEventsScreenKt.lambda_2023528325$lambda$15((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    /* renamed from: getLambda$-117955040$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m55getLambda$117955040$app() {
        return f38lambda$117955040;
    }

    @NotNull
    /* renamed from: getLambda$-1399028409$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m56getLambda$1399028409$app() {
        return f39lambda$1399028409;
    }

    @NotNull
    /* renamed from: getLambda$-512922506$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m57getLambda$512922506$app() {
        return f40lambda$512922506;
    }

    @NotNull
    /* renamed from: getLambda$-526617847$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m58getLambda$526617847$app() {
        return f41lambda$526617847;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1157752722$app() {
        return lambda$1157752722;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1184660520$app() {
        return lambda$1184660520;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1537486392$app() {
        return lambda$1537486392;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$2023528325$app() {
        return lambda$2023528325;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$312249958$app() {
        return lambda$312249958;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$467544977$app() {
        return lambda$467544977;
    }

    @NotNull
    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$470598088$app() {
        return lambda$470598088;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$604480666$app() {
        return lambda$604480666;
    }

    @NotNull
    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$982058445$app() {
        return lambda$982058445;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_470598088$lambda$1(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C90@3719L566:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470598088, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$470598088.<anonymous> (MosqueEventsScreen.kt:90)");
            }
            Modifier modifier = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, Dp.constructor-impl(4), 0.0f, 0.0f, 13, (Object) null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composer = Updater.constructor-impl($composer);
            Updater.set-impl(composer, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer, materializeModifier, ComposeUiNode.Companion.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1638334783, "C93@3864L10,95@3966L11,91@3779L223,97@4013L40,100@4178L10,101@4235L11,98@4064L211:MosqueEventsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Local Mosque Community", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65498);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g("Jummah, Bayans, Taraweeh & notices across Sri Lanka", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_982058445$lambda$4(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C142@5643L891:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982058445, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$982058445.<anonymous> (MosqueEventsScreen.kt:142)");
            }
            SurfaceKt.Surface-T9BRK9s(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(32), 1, (Object) null), (Shape) null, Color.Companion.getTransparent-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, lambda$1157752722, $composer, 12583302, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_1157752722$lambda$3(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda_1157752722$lambda$3(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01be  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_604480666$lambda$6(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda_604480666$lambda$6(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_467544977$lambda$9(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C377@13241L62:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467544977, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$467544977.<anonymous> (MosqueEventsScreen.kt:377)");
            }
            TextKt.Text--4IGK_g("Post Mosque Announcement", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 196614, 0, 131038);
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
    public static final Unit lambda__117955040$lambda$10(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C386@13570L19:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-117955040, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$-117955040.<anonymous> (MosqueEventsScreen.kt:386)");
            }
            TextKt.Text--4IGK_g("Mosque Name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
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
    public static final Unit lambda__526617847$lambda$11(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C393@13791L28:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526617847, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$-526617847.<anonymous> (MosqueEventsScreen.kt:393)");
            }
            TextKt.Text--4IGK_g("Event / Notice Title", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
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
    public static final Unit lambda_1184660520$lambda$12(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C400@14025L34:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184660520, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$1184660520.<anonymous> (MosqueEventsScreen.kt:400)");
            }
            TextKt.Text--4IGK_g("Scholar / Khatib / Speaker", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
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
    public static final Unit lambda__1399028409$lambda$13(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C407@14259L42:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1399028409, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$-1399028409.<anonymous> (MosqueEventsScreen.kt:407)");
            }
            TextKt.Text--4IGK_g("Date & Time (e.g. Friday 12:30 PM)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
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
    public static final Unit lambda_312249958$lambda$14(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C414@14507L24:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(312249958, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$312249958.<anonymous> (MosqueEventsScreen.kt:414)");
            }
            TextKt.Text--4IGK_g("Location Address", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
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
    public static final Unit lambda_2023528325$lambda$15(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C421@14745L27:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023528325, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$2023528325.<anonymous> (MosqueEventsScreen.kt:421)");
            }
            TextKt.Text--4IGK_g("Description & Notes", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
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
    public static final Unit lambda_1537486392$lambda$7(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C443@15315L52:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537486392, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$1537486392.<anonymous> (MosqueEventsScreen.kt:443)");
            }
            TextKt.Text--4IGK_g("Publish Notice", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__512922506$lambda$8(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C448@15453L14:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-512922506, $changed, -1, "com.example.ui.screens.ComposableSingletons$MosqueEventsScreenKt.lambda$-512922506.<anonymous> (MosqueEventsScreen.kt:448)");
            }
            TextKt.Text--4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
