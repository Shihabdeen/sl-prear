package com.example.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material.icons.filled.SecurityKt;
import androidx.compose.material.icons.filled.StopKt;
import androidx.compose.material.icons.filled.VolumeUpKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlertsAndSettingsScreen.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlertsAndSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertsAndSettingsScreen.kt\ncom/example/ui/screens/ComposableSingletons$AlertsAndSettingsScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,841:1\n148#2:842\n148#2:920\n148#2:925\n148#2:926\n148#2:927\n148#2:928\n148#2:929\n148#2:930\n148#2:931\n148#2:932\n148#2:933\n148#2:934\n85#3:843\n82#3,6:844\n88#3:878\n92#3:882\n78#4,6:850\n85#4,4:865\n89#4,2:875\n93#4:881\n78#4,6:891\n85#4,4:906\n89#4,2:916\n93#4:923\n368#5,9:856\n377#5:877\n378#5,2:879\n368#5,9:897\n377#5:918\n378#5,2:921\n4032#6,6:869\n4032#6,6:910\n71#7:883\n67#7,7:884\n74#7:919\n78#7:924\n*S KotlinDebug\n*F\n+ 1 AlertsAndSettingsScreen.kt\ncom/example/ui/screens/ComposableSingletons$AlertsAndSettingsScreenKt\n*L\n95#1:842\n326#1:920\n356#1:925\n513#1:926\n543#1:927\n544#1:928\n555#1:929\n556#1:930\n568#1:931\n569#1:932\n676#1:933\n677#1:934\n95#1:843\n95#1:844,6\n95#1:878\n95#1:882\n95#1:850,6\n95#1:865,4\n95#1:875,2\n95#1:881\n321#1:891,6\n321#1:906,4\n321#1:916,2\n321#1:923\n95#1:856,9\n95#1:877\n95#1:879,2\n321#1:897,9\n321#1:918\n321#1:921,2\n95#1:869,6\n321#1:910,6\n321#1:883\n321#1:884,7\n321#1:919\n321#1:924\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ComposableSingletons$AlertsAndSettingsScreenKt.dex */
public final class ComposableSingletons$AlertsAndSettingsScreenKt {

    @NotNull
    public static final ComposableSingletons$AlertsAndSettingsScreenKt INSTANCE = new ComposableSingletons$AlertsAndSettingsScreenKt();

    /* renamed from: lambda$-1811040458, reason: not valid java name */
    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> f11lambda$1811040458 = ComposableLambdaKt.composableLambdaInstance(-1811040458, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__1811040458$lambda$1((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1083824773, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f8lambda$1083824773 = ComposableLambdaKt.composableLambdaInstance(-1083824773, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__1083824773$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$255394047 = ComposableLambdaKt.composableLambdaInstance(255394047, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda_255394047$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1241803634 = ComposableLambdaKt.composableLambdaInstance(1241803634, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda_1241803634$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-19498474, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f13lambda$19498474 = ComposableLambdaKt.composableLambdaInstance(-19498474, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__19498474$lambda$6((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1542857976, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f10lambda$1542857976 = ComposableLambdaKt.composableLambdaInstance(-1542857976, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__1542857976$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-787866934, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f16lambda$787866934 = ComposableLambdaKt.composableLambdaInstance(-787866934, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__787866934$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1969524614, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f14lambda$1969524614 = ComposableLambdaKt.composableLambdaInstance(-1969524614, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__1969524614$lambda$9((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$476676654 = ComposableLambdaKt.composableLambdaInstance(476676654, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda_476676654$lambda$10((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$446447941 = ComposableLambdaKt.composableLambdaInstance(446447941, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda_446447941$lambda$11((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1203193751, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f9lambda$1203193751 = ComposableLambdaKt.composableLambdaInstance(-1203193751, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__1203193751$lambda$12((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-223051230, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f15lambda$223051230 = ComposableLambdaKt.composableLambdaInstance(-223051230, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__223051230$lambda$13((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1874112549, reason: not valid java name */
    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> f12lambda$1874112549 = ComposableLambdaKt.composableLambdaInstance(-1874112549, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda__1874112549$lambda$14((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$982247105 = ComposableLambdaKt.composableLambdaInstance(982247105, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AlertsAndSettingsScreenKt.lambda_982247105$lambda$15((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    /* renamed from: getLambda$-1083824773$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m25getLambda$1083824773$app() {
        return f8lambda$1083824773;
    }

    @NotNull
    /* renamed from: getLambda$-1203193751$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m26getLambda$1203193751$app() {
        return f9lambda$1203193751;
    }

    @NotNull
    /* renamed from: getLambda$-1542857976$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m27getLambda$1542857976$app() {
        return f10lambda$1542857976;
    }

    @NotNull
    /* renamed from: getLambda$-1811040458$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m28getLambda$1811040458$app() {
        return f11lambda$1811040458;
    }

    @NotNull
    /* renamed from: getLambda$-1874112549$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m29getLambda$1874112549$app() {
        return f12lambda$1874112549;
    }

    @NotNull
    /* renamed from: getLambda$-19498474$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m30getLambda$19498474$app() {
        return f13lambda$19498474;
    }

    @NotNull
    /* renamed from: getLambda$-1969524614$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m31getLambda$1969524614$app() {
        return f14lambda$1969524614;
    }

    @NotNull
    /* renamed from: getLambda$-223051230$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m32getLambda$223051230$app() {
        return f15lambda$223051230;
    }

    @NotNull
    /* renamed from: getLambda$-787866934$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m33getLambda$787866934$app() {
        return f16lambda$787866934;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1241803634$app() {
        return lambda$1241803634;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$255394047$app() {
        return lambda$255394047;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$446447941$app() {
        return lambda$446447941;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$476676654$app() {
        return lambda$476676654;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$982247105$app() {
        return lambda$982247105;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1811040458$lambda$1(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C94@4135L497:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1811040458, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-1811040458.<anonymous> (AlertsAndSettingsScreen.kt:94)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 1367809524, "C97@4269L10,99@4367L11,95@4193L208,103@4531L10,104@4586L11,101@4410L214:AlertsAndSettingsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Settings & Alerts", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("Phone login, Admin controls, Adhan sounds & Sri Lanka settings", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 6, 0, 65530);
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
    public static final Unit lambda__1083824773$lambda$2(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C195@8494L11,195@8457L55:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1083824773, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-1083824773.<anonymous> (AlertsAndSettingsScreen.kt:195)");
            }
            TextKt.Text--4IGK_g("Logout", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_255394047$lambda$3(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C236@10194L44:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(255394047, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$255394047.<anonymous> (AlertsAndSettingsScreen.kt:236)");
            }
            TextKt.Text--4IGK_g("Log In", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 196614, 0, 131038);
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
    public static final kotlin.Unit lambda_1241803634$lambda$5(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda_1241803634$lambda$5(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__19498474$lambda$6(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C352@14325L10,350@14246L281:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-19498474, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-19498474.<anonymous> (AlertsAndSettingsScreen.kt:350)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g("● ACTIVE", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8), Dp.constructor-impl(4)), ColorKt.getIslamicGreen(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 197046, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1542857976$lambda$7(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C429@17580L72:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1542857976, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-1542857976.<anonymous> (AlertsAndSettingsScreen.kt:429)");
            }
            TextKt.Text--4IGK_g("Reschedule 5", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__787866934$lambda$8(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C440@18066L73:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787866934, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-787866934.<anonymous> (AlertsAndSettingsScreen.kt:440)");
            }
            TextKt.Text--4IGK_g("Test Worker Alert", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1969524614$lambda$9(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C509@20862L10,511@20978L11,507@20777L319:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1969524614, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-1969524614.<anonymous> (AlertsAndSettingsScreen.kt:507)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g("🔊 PLAYING", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8), Dp.constructor-impl(4)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 196662, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_476676654$lambda$10(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C542@22181L84,543@22282L39,544@22338L47:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476676654, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$476676654.<anonymous> (AlertsAndSettingsScreen.kt:542)");
            }
            IconKt.Icon-ww6aTOc(StopKt.getStop(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            TextKt.Text--4IGK_g("Stop Azan", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_446447941$lambda$11(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C554@22711L89,555@22817L39,556@22873L54:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(446447941, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$446447941.<anonymous> (AlertsAndSettingsScreen.kt:554)");
            }
            IconKt.Icon-ww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            TextKt.Text--4IGK_g("Play Makkah Azan", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1203193751$lambda$12(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C567@23228L88,568@23331L39,569@23385L18:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1203193751, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-1203193751.<anonymous> (AlertsAndSettingsScreen.kt:567)");
            }
            IconKt.Icon-ww6aTOc(VolumeUpKt.getVolumeUp(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            TextKt.Text--4IGK_g("Test Alarm", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__223051230$lambda$13(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C582@23759L103:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-223051230, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-223051230.<anonymous> (AlertsAndSettingsScreen.kt:582)");
            }
            TextKt.Text--4IGK_g("Set All 5 Prayers to Makkah Azan (أذان مكة)", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1874112549$lambda$14(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C592@24027L10,594@24119L11,590@23948L203:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1874112549, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$-1874112549.<anonymous> (AlertsAndSettingsScreen.kt:590)");
            }
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium();
            TextKt.Text--4IGK_g("Individual Prayer Alerts", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, titleMedium, $composer, 196614, 0, 65498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_982247105$lambda$15(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C675@27445L88,676@27546L39,677@27598L53:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982247105, $changed, -1, "com.example.ui.screens.ComposableSingletons$AlertsAndSettingsScreenKt.lambda$982247105.<anonymous> (AlertsAndSettingsScreen.kt:675)");
            }
            IconKt.Icon-ww6aTOc(SecurityKt.getSecurity(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), $composer, 6);
            TextKt.Text--4IGK_g("View Full Privacy Policy (தனியுரிமைக் கொள்கை)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
