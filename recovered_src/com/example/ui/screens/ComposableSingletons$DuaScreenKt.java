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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.ClearKt;
import androidx.compose.material.icons.filled.ContentCopyKt;
import androidx.compose.material.icons.filled.MenuBookKt;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.ShareKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
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

/* compiled from: DuaScreen.kt */
@Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDuaScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DuaScreen.kt\ncom/example/ui/screens/ComposableSingletons$DuaScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,805:1\n148#2:806\n148#2:807\n148#2:913\n148#2:914\n148#2:919\n148#2:928\n148#2:929\n148#2:967\n148#2:972\n148#2:973\n148#2:974\n148#2:975\n148#2:1012\n148#2:1013\n148#2:1018\n148#2:1019\n148#2:1020\n148#2:1021\n71#3:808\n68#3,6:809\n74#3:843\n78#3:927\n71#3:930\n67#3,7:931\n74#3:966\n78#3:971\n78#4,6:815\n85#4,4:830\n89#4,2:840\n78#4,6:852\n85#4,4:867\n89#4,2:877\n78#4,6:884\n85#4,4:899\n89#4,2:909\n93#4:917\n93#4:922\n93#4:926\n78#4,6:938\n85#4,4:953\n89#4,2:963\n93#4:970\n78#4,6:983\n85#4,4:998\n89#4,2:1008\n93#4:1016\n368#5,9:821\n377#5:842\n368#5,9:858\n377#5:879\n368#5,9:890\n377#5:911\n378#5,2:915\n378#5,2:920\n378#5,2:924\n368#5,9:944\n377#5:965\n378#5,2:968\n368#5,9:989\n377#5:1010\n378#5,2:1014\n4032#6,6:834\n4032#6,6:871\n4032#6,6:903\n4032#6,6:957\n4032#6,6:1002\n85#7:844\n81#7,7:845\n88#7:880\n92#7:923\n85#7:976\n82#7,6:977\n88#7:1011\n92#7:1017\n98#8,3:881\n101#8:912\n105#8:918\n*S KotlinDebug\n*F\n+ 1 DuaScreen.kt\ncom/example/ui/screens/ComposableSingletons$DuaScreenKt\n*L\n157#1:806\n139#1:807\n148#1:913\n150#1:914\n169#1:919\n123#1:928\n126#1:929\n219#1:967\n242#1:972\n245#1:973\n403#1:974\n446#1:975\n453#1:1012\n455#1:1013\n440#1:1018\n570#1:1019\n582#1:1020\n777#1:1021\n128#1:808\n128#1:809,6\n128#1:843\n128#1:927\n214#1:930\n214#1:931,7\n214#1:966\n214#1:971\n128#1:815,6\n128#1:830,4\n128#1:840,2\n141#1:852,6\n141#1:867,4\n141#1:877,2\n142#1:884,6\n142#1:899,4\n142#1:909,2\n142#1:917\n141#1:922\n128#1:926\n214#1:938,6\n214#1:953,4\n214#1:963,2\n214#1:970\n443#1:983,6\n443#1:998,4\n443#1:1008,2\n443#1:1016\n128#1:821,9\n128#1:842\n141#1:858,9\n141#1:879\n142#1:890,9\n142#1:911\n142#1:915,2\n141#1:920,2\n128#1:924,2\n214#1:944,9\n214#1:965\n214#1:968,2\n443#1:989,9\n443#1:1010\n443#1:1014,2\n128#1:834,6\n141#1:871,6\n142#1:903,6\n214#1:957,6\n443#1:1002,6\n141#1:844\n141#1:845,7\n141#1:880\n141#1:923\n443#1:976\n443#1:977,6\n443#1:1011\n443#1:1017\n142#1:881,3\n142#1:912\n142#1:918\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ComposableSingletons$DuaScreenKt.dex */
public final class ComposableSingletons$DuaScreenKt {

    @NotNull
    public static final ComposableSingletons$DuaScreenKt INSTANCE = new ComposableSingletons$DuaScreenKt();

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1280182543 = ComposableLambdaKt.composableLambdaInstance(1280182543, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda_1280182543$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$1994120618 = ComposableLambdaKt.composableLambdaInstance(1994120618, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DuaScreenKt.lambda_1994120618$lambda$4((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1389401180 = ComposableLambdaKt.composableLambdaInstance(1389401180, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DuaScreenKt.lambda_1389401180$lambda$5((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1677666726, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f26lambda$1677666726 = ComposableLambdaKt.composableLambdaInstance(-1677666726, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda8
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda__1677666726$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1013098084, reason: not valid java name */
    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> f22lambda$1013098084 = ComposableLambdaKt.composableLambdaInstance(-1013098084, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda9
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DuaScreenKt.lambda__1013098084$lambda$8((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-699125419, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f27lambda$699125419 = ComposableLambdaKt.composableLambdaInstance(-699125419, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda10
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda__699125419$lambda$9((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1556378390 = ComposableLambdaKt.composableLambdaInstance(1556378390, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda11
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda_1556378390$lambda$10((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1450809137, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f25lambda$1450809137 = ComposableLambdaKt.composableLambdaInstance(-1450809137, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda12
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda__1450809137$lambda$11((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$729386587 = ComposableLambdaKt.composableLambdaInstance(729386587, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda13
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda_729386587$lambda$12((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1058930641, reason: not valid java name */
    @NotNull
    private static Function3<ColumnScope, Composer, Integer, Unit> f23lambda$1058930641 = ComposableLambdaKt.composableLambdaInstance(-1058930641, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda14
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DuaScreenKt.lambda__1058930641$lambda$14((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1508868193 = ComposableLambdaKt.composableLambdaInstance(1508868193, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DuaScreenKt.lambda_1508868193$lambda$15((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1304149538, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f24lambda$1304149538 = ComposableLambdaKt.composableLambdaInstance(-1304149538, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda__1304149538$lambda$16((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$2071039805 = ComposableLambdaKt.composableLambdaInstance(2071039805, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda_2071039805$lambda$17((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1905069118 = ComposableLambdaKt.composableLambdaInstance(1905069118, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DuaScreenKt.lambda_1905069118$lambda$18((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    @NotNull
    private static Function3<RowScope, Composer, Integer, Unit> lambda$463581750 = ComposableLambdaKt.composableLambdaInstance(463581750, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$DuaScreenKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DuaScreenKt.lambda_463581750$lambda$19((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    @NotNull
    /* renamed from: getLambda$-1013098084$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m39getLambda$1013098084$app() {
        return f22lambda$1013098084;
    }

    @NotNull
    /* renamed from: getLambda$-1058930641$app, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m40getLambda$1058930641$app() {
        return f23lambda$1058930641;
    }

    @NotNull
    /* renamed from: getLambda$-1304149538$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m41getLambda$1304149538$app() {
        return f24lambda$1304149538;
    }

    @NotNull
    /* renamed from: getLambda$-1450809137$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m42getLambda$1450809137$app() {
        return f25lambda$1450809137;
    }

    @NotNull
    /* renamed from: getLambda$-1677666726$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m43getLambda$1677666726$app() {
        return f26lambda$1677666726;
    }

    @NotNull
    /* renamed from: getLambda$-699125419$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m44getLambda$699125419$app() {
        return f27lambda$699125419;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1280182543$app() {
        return lambda$1280182543;
    }

    @NotNull
    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1389401180$app() {
        return lambda$1389401180;
    }

    @NotNull
    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1508868193$app() {
        return lambda$1508868193;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1556378390$app() {
        return lambda$1556378390;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1905069118$app() {
        return lambda$1905069118;
    }

    @NotNull
    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$1994120618$app() {
        return lambda$1994120618;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$2071039805$app() {
        return lambda$2071039805;
    }

    @NotNull
    public final Function3<RowScope, Composer, Integer, Unit> getLambda$463581750$app() {
        return lambda$463581750;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$729386587$app() {
        return lambda$729386587;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_1389401180$lambda$5(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C124@5404L11,124@5362L71,125@5468L38,119@5190L2279:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1389401180, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$1389401180.<anonymous> (DuaScreen.kt:119)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "dua_hero_header"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, lambda$1994120618, $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_1994120618$lambda$4(androidx.compose.foundation.layout.ColumnScope r107, androidx.compose.runtime.Composer r108, int r109) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda_1994120618$lambda$4(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_1280182543$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C153@6473L10,151@6375L308:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1280182543, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$1280182543.<anonymous> (DuaScreen.kt:151)");
            }
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g("அறிவிக்கப்பட்ட துஆக்கள்", PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10), Dp.constructor-impl(4)), ColorKt.getIslamicGold(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 197046, 0, 65496);
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
    public static final kotlin.Unit lambda__1677666726$lambda$7(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda__1677666726$lambda$7(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1013098084$lambda$8(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C242@9605L11,238@9414L226,244@9655L39,245@9745L10,245@9709L59:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1013098084, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$-1013098084.<anonymous> (DuaScreen.kt:238)");
            }
            IconKt.Icon-ww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), "Reset", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g("Reset", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__699125419$lambda$9(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C354@13895L50:DuaScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-699125419, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$-699125419.<anonymous> (DuaScreen.kt:354)");
            }
            TextKt.Text--4IGK_g("Search by name, Tamil (காலை, உளூ, கவலை)...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 6, 0, 131070);
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
    public static final Unit lambda_1556378390$lambda$10(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C359@14123L11,356@13987L169:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1556378390, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$1556378390.<anonymous> (DuaScreen.kt:356)");
            }
            IconKt.Icon-ww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "Search", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1450809137$lambda$11(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C365@14331L69:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1450809137, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$-1450809137.<anonymous> (DuaScreen.kt:365)");
            }
            IconKt.Icon-ww6aTOc(ClearKt.getClear(Icons.INSTANCE.getDefault()), "Clear", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_729386587$lambda$12(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C399@15534L179:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(729386587, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$729386587.<anonymous> (DuaScreen.kt:399)");
            }
            IconKt.Icon-ww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), 0L, $composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_1508868193$lambda$15(LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C440@16833L11,440@16791L69,436@16655L1169:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508868193, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$1508868193.<anonymous> (DuaScreen.kt:436)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(24), 1, (Object) null), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, f23lambda$1058930641, $composer, 196614, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda__1058930641$lambda$14(ColumnScope $this$Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C442@16883L931:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058930641, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$-1058930641.<anonymous> (DuaScreen.kt:442)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(24));
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
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
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1975918095, "C451@17207L11,448@17073L216,454@17302L41,457@17436L10,455@17356L160,462@17658L10,463@17716L11,460@17529L273:DuaScreen.kt#2thlc2");
            IconKt.Icon-ww6aTOc(MenuBookKt.getMenuBook(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(48)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12)), $composer, 6);
            TextKt.Text--4IGK_g("No Duas Found", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            TextKt.Text--4IGK_g("துஆக்கள் எதுவும் கிடைக்கவில்லை. வேறு சொற்களைக் கொண்டு தேடவும்.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getCenter-e0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65018);
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
    public static final Unit lambda__1304149538$lambda$16(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C568@21523L11,565@21380L232:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304149538, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$-1304149538.<anonymous> (DuaScreen.kt:565)");
            }
            IconKt.Icon-ww6aTOc(ContentCopyKt.getContentCopy(Icons.INSTANCE.getDefault()), "Copy Dua", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_2071039805$lambda$17(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C580@21910L11,577@21772L227:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2071039805, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$2071039805.<anonymous> (DuaScreen.kt:577)");
            }
            IconKt.Icon-ww6aTOc(ShareKt.getShare(Icons.INSTANCE.getDefault()), "Share Dua", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_1905069118$lambda$18(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C777@28581L11,773@28382L245:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1905069118, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$1905069118.<anonymous> (DuaScreen.kt:773)");
            }
            IconKt.Icon-ww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), "Reset", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit lambda_463581750$lambda$19(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C794@29286L10,792@29205L164:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(463581750, $changed, -1, "com.example.ui.screens.ComposableSingletons$DuaScreenKt.lambda$463581750.<anonymous> (DuaScreen.kt:792)");
            }
            TextKt.Text--4IGK_g("+1 ஓதினேன்", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
