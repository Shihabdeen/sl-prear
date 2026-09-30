package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ChatKt;
import androidx.compose.material.icons.filled.ExploreKt;
import androidx.compose.material.icons.filled.NotificationsActiveKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material.icons.filled.VolumeUpKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
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
import androidx.compose.ui.graphics.Color;
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

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreen.kt\ncom/example/ui/screens/ComposableSingletons$HomeScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,1124:1\n148#2:1125\n148#2:1126\n148#2:1127\n148#2:1128\n148#2:1129\n148#2:1130\n148#2:1131\n148#2:1169\n148#2:1174\n148#2:1175\n148#2:1244\n148#2:1245\n148#2:1291\n148#2:1333\n148#2:1338\n148#2:1375\n148#2:1380\n148#2:1381\n148#2:1418\n148#2:1419\n148#2:1456\n148#2:1457\n148#2:1462\n148#2:1463\n148#2:1464\n71#3:1132\n67#3,7:1133\n74#3:1168\n78#3:1173\n71#3:1296\n67#3,7:1297\n74#3:1332\n78#3:1337\n78#4,6:1140\n85#4,4:1155\n89#4,2:1165\n93#4:1172\n78#4,6:1179\n85#4,4:1194\n89#4,2:1204\n78#4,6:1215\n85#4,4:1230\n89#4,2:1240\n78#4,6:1254\n85#4,4:1269\n89#4,2:1279\n93#4:1285\n93#4:1289\n93#4:1294\n78#4,6:1304\n85#4,4:1319\n89#4,2:1329\n93#4:1336\n78#4,6:1346\n85#4,4:1361\n89#4,2:1371\n93#4:1378\n78#4,6:1385\n85#4,4:1400\n89#4,2:1410\n93#4:1416\n78#4,6:1427\n85#4,4:1442\n89#4,2:1452\n93#4:1460\n368#5,9:1146\n377#5:1167\n378#5,2:1170\n368#5,9:1185\n377#5:1206\n368#5,9:1221\n377#5:1242\n368#5,9:1260\n377#5:1281\n378#5,2:1283\n378#5,2:1287\n378#5,2:1292\n368#5,9:1310\n377#5:1331\n378#5,2:1334\n368#5,9:1352\n377#5:1373\n378#5,2:1376\n368#5,9:1391\n377#5:1412\n378#5,2:1414\n368#5,9:1433\n377#5:1454\n378#5,2:1458\n4032#6,6:1159\n4032#6,6:1198\n4032#6,6:1234\n4032#6,6:1273\n4032#6,6:1323\n4032#6,6:1365\n4032#6,6:1404\n4032#6,6:1446\n98#7,3:1176\n101#7:1207\n98#7:1208\n95#7,6:1209\n101#7:1243\n105#7:1290\n105#7:1295\n98#7:1339\n95#7,6:1340\n101#7:1374\n105#7:1379\n98#7,3:1382\n101#7:1413\n105#7:1417\n98#7:1420\n95#7,6:1421\n101#7:1455\n105#7:1461\n85#8:1246\n81#8,7:1247\n88#8:1282\n92#8:1286\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\ncom/example/ui/screens/ComposableSingletons$HomeScreenKt\n*L\n323#1:1125\n471#1:1126\n473#1:1127\n490#1:1128\n492#1:1129\n509#1:1130\n511#1:1131\n549#1:1169\n578#1:1174\n531#1:1175\n542#1:1244\n553#1:1245\n570#1:1291\n605#1:1333\n642#1:1338\n646#1:1375\n636#1:1380\n733#1:1381\n843#1:1418\n979#1:1419\n986#1:1456\n988#1:1457\n1099#1:1462\n1114#1:1463\n1116#1:1464\n544#1:1132\n544#1:1133,7\n544#1:1168\n544#1:1173\n600#1:1296\n600#1:1297,7\n600#1:1332\n600#1:1337\n544#1:1140,6\n544#1:1155,4\n544#1:1165,2\n544#1:1172\n528#1:1179,6\n528#1:1194,4\n528#1:1204,2\n535#1:1215,6\n535#1:1230,4\n535#1:1240,2\n554#1:1254,6\n554#1:1269,4\n554#1:1279,2\n554#1:1285\n535#1:1289\n528#1:1294\n600#1:1304,6\n600#1:1319,4\n600#1:1329,2\n600#1:1336\n639#1:1346,6\n639#1:1361,4\n639#1:1371,2\n639#1:1378\n730#1:1385,6\n730#1:1400,4\n730#1:1410,2\n730#1:1416\n978#1:1427,6\n978#1:1442,4\n978#1:1452,2\n978#1:1460\n544#1:1146,9\n544#1:1167\n544#1:1170,2\n528#1:1185,9\n528#1:1206\n535#1:1221,9\n535#1:1242\n554#1:1260,9\n554#1:1281\n554#1:1283,2\n535#1:1287,2\n528#1:1292,2\n600#1:1310,9\n600#1:1331\n600#1:1334,2\n639#1:1352,9\n639#1:1373\n639#1:1376,2\n730#1:1391,9\n730#1:1412\n730#1:1414,2\n978#1:1433,9\n978#1:1454\n978#1:1458,2\n544#1:1159,6\n528#1:1198,6\n535#1:1234,6\n554#1:1273,6\n600#1:1323,6\n639#1:1365,6\n730#1:1404,6\n978#1:1446,6\n528#1:1176,3\n528#1:1207\n535#1:1208\n535#1:1209,6\n535#1:1243\n535#1:1290\n528#1:1295\n639#1:1339\n639#1:1340,6\n639#1:1374\n639#1:1379\n730#1:1382,3\n730#1:1413\n730#1:1417\n978#1:1420\n978#1:1421,6\n978#1:1455\n978#1:1461\n554#1:1246\n554#1:1247,7\n554#1:1282\n554#1:1286\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ComposableSingletons$HomeScreenKt.dex */
public final class ComposableSingletons$HomeScreenKt {

    @NotNull
    public static final ComposableSingletons$HomeScreenKt INSTANCE = new ComposableSingletons$HomeScreenKt();

    /* renamed from: lambda$-2040679718, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f36lambda$2040679718 = ComposableLambdaKt.composableLambdaInstance(-2040679718, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__2040679718$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1821080585, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f34lambda$1821080585 = ComposableLambdaKt.composableLambdaInstance(-1821080585, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1821080585$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1340750354, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f30lambda$1340750354 = ComposableLambdaKt.composableLambdaInstance(-1340750354, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__1340750354$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1909082156 = ComposableLambdaKt.composableLambdaInstance(1909082156, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_1909082156$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$293698581 = ComposableLambdaKt.composableLambdaInstance(293698581, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_293698581$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1754285036 = ComposableLambdaKt.composableLambdaInstance(1754285036, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda_1754285036$lambda$6((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$70411408 = ComposableLambdaKt.composableLambdaInstance(70411408, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda_70411408$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1697390545, reason: not valid java name */
    @NotNull
    private static Function3<ColumnScope, Composer, Integer, Unit> f32lambda$1697390545 = ComposableLambdaKt.composableLambdaInstance(-1697390545, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__1697390545$lambda$11((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-672354307, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f37lambda$672354307 = ComposableLambdaKt.composableLambdaInstance(-672354307, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda15
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__672354307$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-105282793, reason: not valid java name */
    @NotNull
    private static Function3<ColumnScope, Composer, Integer, Unit> f28lambda$105282793 = ComposableLambdaKt.composableLambdaInstance(-105282793, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda16
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__105282793$lambda$15((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$2046936009 = ComposableLambdaKt.composableLambdaInstance(2046936009, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_2046936009$lambda$16((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1291157145 = ComposableLambdaKt.composableLambdaInstance(1291157145, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_1291157145$lambda$17((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1348654530, reason: not valid java name */
    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> f31lambda$1348654530 = ComposableLambdaKt.composableLambdaInstance(-1348654530, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__1348654530$lambda$19((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1756723806, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f33lambda$1756723806 = ComposableLambdaKt.composableLambdaInstance(-1756723806, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1756723806$lambda$20((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1215300709, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f29lambda$1215300709 = ComposableLambdaKt.composableLambdaInstance(-1215300709, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1215300709$lambda$22((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1948616062, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f35lambda$1948616062 = ComposableLambdaKt.composableLambdaInstance(-1948616062, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1948616062$lambda$23((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$214706711 = ComposableLambdaKt.composableLambdaInstance(214706711, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_214706711$lambda$24((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    /* renamed from: getLambda$-105282793$app, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m45getLambda$105282793$app() {
        return f28lambda$105282793;
    }

    @NotNull
    /* renamed from: getLambda$-1215300709$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m46getLambda$1215300709$app() {
        return f29lambda$1215300709;
    }

    @NotNull
    /* renamed from: getLambda$-1340750354$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m47getLambda$1340750354$app() {
        return f30lambda$1340750354;
    }

    @NotNull
    /* renamed from: getLambda$-1348654530$app, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m48getLambda$1348654530$app() {
        return f31lambda$1348654530;
    }

    @NotNull
    /* renamed from: getLambda$-1697390545$app, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m49getLambda$1697390545$app() {
        return f32lambda$1697390545;
    }

    @NotNull
    /* renamed from: getLambda$-1756723806$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m50getLambda$1756723806$app() {
        return f33lambda$1756723806;
    }

    @NotNull
    /* renamed from: getLambda$-1821080585$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m51getLambda$1821080585$app() {
        return f34lambda$1821080585;
    }

    @NotNull
    /* renamed from: getLambda$-1948616062$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m52getLambda$1948616062$app() {
        return f35lambda$1948616062;
    }

    @NotNull
    /* renamed from: getLambda$-2040679718$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m53getLambda$2040679718$app() {
        return f36lambda$2040679718;
    }

    @NotNull
    /* renamed from: getLambda$-672354307$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m54getLambda$672354307$app() {
        return f37lambda$672354307;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1291157145$app() {
        return lambda$1291157145;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1754285036$app() {
        return lambda$1754285036;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1909082156$app() {
        return lambda$1909082156;
    }

    @NotNull
    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$2046936009$app() {
        return lambda$2046936009;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$214706711$app() {
        return lambda$214706711;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$293698581$app() {
        return lambda$293698581;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$70411408$app() {
        return lambda$70411408;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__2040679718$lambda$0(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C167@7306L63:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040679718, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-2040679718.<anonymous> (HomeScreen.kt:167)");
            }
            TextKt.Text--4IGK_g("Stop 🔇", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1821080585$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C319@12692L10,317@12606L296:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1821080585, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1821080585.<anonymous> (HomeScreen.kt:317)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g("NEXT PRAYER", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10), Dp.constructor-impl(4)), ColorKt.getIslamicGold(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 197046, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1340750354$lambda$2(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C467@17991L149,472@18151L39,473@18244L10,473@18201L66:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1340750354, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1340750354.<anonymous> (HomeScreen.kt:467)");
            }
            IconKt.Icon-ww6aTOc(ExploreKt.getExplore(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            TextKt.Text--4IGK_g("Qibla", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_1909082156$lambda$3(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C486@18673L150,491@18834L39,492@18932L10,492@18884L71:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1909082156, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$1909082156.<anonymous> (HomeScreen.kt:486)");
            }
            IconKt.Icon-ww6aTOc(VolumeUpKt.getVolumeUp(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            TextKt.Text--4IGK_g("Test Adhan", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_293698581$lambda$4(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C505@19327L161,510@19499L39,511@19593L10,511@19549L67:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(293698581, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$293698581.<anonymous> (HomeScreen.kt:505)");
            }
            IconKt.Icon-ww6aTOc(NotificationsActiveKt.getNotificationsActive(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            TextKt.Text--4IGK_g("Events", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1697390545$lambda$11(androidx.compose.foundation.layout.ColumnScope r93, androidx.compose.runtime.Composer r94, int r95) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__1697390545$lambda$11(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_1754285036$lambda$6(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda_1754285036$lambda$6(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_70411408$lambda$7(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C574@21790L10,576@21894L11,572@21719L288:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70411408, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$70411408.<anonymous> (HomeScreen.kt:572)");
            }
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium();
            TextKt.Text--4IGK_g("Open", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12), Dp.constructor-impl(6)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, $composer, 196662, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__672354307$lambda$13(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__672354307$lambda$13(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_2046936009$lambda$16(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C636@23822L11,636@23780L88,633@23651L798:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2046936009, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$2046936009.<anonymous> (HomeScreen.kt:633)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, f28lambda$105282793, $composer, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__105282793$lambda$15(ColumnScope $this$Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C638@23891L548:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-105282793, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-105282793.<anonymous> (HomeScreen.kt:638)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(14));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            Updater.set-impl(composer, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer, materializeModifier, ComposeUiNode.Companion.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -997605649, "C644@24074L35,645@24122L40,648@24327L10,649@24385L11,646@24175L252:HomeScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("📢", (Modifier) null, 0L, TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 3078, 0, 131062);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(10)), $composer, 6);
            TextKt.Text--4IGK_g("No recent announcements posted yet. Mosque admins can post updates from the Chat tab.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
    public static final Unit lambda_1291157145$lambda$17(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C721@26971L65:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1291157145, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$1291157145.<anonymous> (HomeScreen.kt:721)");
            }
            TextKt.Text--4IGK_g("Open Chat", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1348654530$lambda$19(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C729@27129L621:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348654530, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1348654530.<anonymous> (HomeScreen.kt:729)");
            }
            Modifier modifier = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(8), 0.0f, 0.0f, 13, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Updater.set-impl(composer, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.set-impl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composer.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composer.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.set-impl(composer, materializeModifier, ComposeUiNode.Companion.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScope rowScope = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1304606082, "C738@27433L10,740@27529L11,736@27351L212,745@27650L10,746@27704L11,743@27573L169:HomeScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Today's Prayer Schedule", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65498);
            TextKt.Text--4IGK_g("Shafi'i • UTC+5:30", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
    public static final Unit lambda__1756723806$lambda$20(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C839@30936L10,841@31047L11,837@30853L316:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1756723806, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1756723806.<anonymous> (HomeScreen.kt:837)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g("UPCOMING", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(6), Dp.constructor-impl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 196662, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ed  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1215300709$lambda$22(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__1215300709$lambda$22(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1948616062$lambda$23(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1097@39962L11,1094@39814L228:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1948616062, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1948616062.<anonymous> (HomeScreen.kt:1094)");
            }
            IconKt.Icon-ww6aTOc(ShareKt.getShare(Icons.INSTANCE.getDefault()), "Share to Other Apps", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_214706711$lambda$24(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C1110@40367L154,1115@40534L39,1116@40586L67:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(214706711, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$214706711.<anonymous> (HomeScreen.kt:1110)");
            }
            IconKt.Icon-ww6aTOc(ChatKt.getChat(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(13)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g("Chat", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
