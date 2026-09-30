package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrivacyPolicyDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"PrivacyPolicyDialog", "", "onDismiss", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyPolicyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyPolicyDialog.kt\ncom/example/ui/screens/PrivacyPolicyDialogKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,253:1\n148#2:254\n148#2:360\n148#2:361\n148#2:411\n148#2:412\n148#2:449\n148#2:450\n148#2:451\n148#2:452\n148#2:453\n148#2:454\n148#2:455\n148#2:456\n148#2:457\n148#2:458\n148#2:459\n148#2:464\n148#2:465\n148#2:470\n148#2:471\n148#2:472\n85#3:255\n82#3,6:256\n88#3:290\n85#3:362\n81#3,7:363\n88#3:398\n92#3:402\n85#3:413\n82#3,6:414\n88#3:448\n92#3:463\n92#3:469\n78#4,6:262\n85#4,4:277\n89#4,2:287\n78#4,6:294\n85#4,4:309\n89#4,2:319\n78#4,6:331\n85#4,4:346\n89#4,2:356\n78#4,6:370\n85#4,4:385\n89#4,2:395\n93#4:401\n93#4:405\n93#4:409\n78#4,6:420\n85#4,4:435\n89#4,2:445\n93#4:462\n93#4:468\n368#5,9:268\n377#5:289\n368#5,9:300\n377#5:321\n368#5,9:337\n377#5:358\n368#5,9:376\n377#5:397\n378#5,2:399\n378#5,2:403\n378#5,2:407\n368#5,9:426\n377#5:447\n378#5,2:460\n378#5,2:466\n4032#6,6:281\n4032#6,6:313\n4032#6,6:350\n4032#6,6:389\n4032#6,6:439\n98#7,3:291\n101#7:322\n98#7:323\n94#7,7:324\n101#7:359\n105#7:406\n105#7:410\n*S KotlinDebug\n*F\n+ 1 PrivacyPolicyDialog.kt\ncom/example/ui/screens/PrivacyPolicyDialogKt\n*L\n64#1:254\n76#1:360\n87#1:361\n111#1:411\n113#1:412\n123#1:449\n147#1:450\n155#1:451\n164#1:452\n172#1:453\n183#1:454\n191#1:455\n202#1:456\n210#1:457\n218#1:458\n226#1:459\n238#1:464\n245#1:465\n55#1:470\n56#1:471\n59#1:472\n61#1:255\n61#1:256,6\n61#1:290\n88#1:362\n88#1:363,7\n88#1:398\n88#1:402\n116#1:413\n116#1:414,6\n116#1:448\n116#1:463\n61#1:469\n61#1:262,6\n61#1:277,4\n61#1:287,2\n67#1:294,6\n67#1:309,4\n67#1:319,2\n72#1:331,6\n72#1:346,4\n72#1:356,2\n88#1:370,6\n88#1:385,4\n88#1:395,2\n88#1:401\n72#1:405\n67#1:409\n116#1:420,6\n116#1:435,4\n116#1:445,2\n116#1:462\n61#1:468\n61#1:268,9\n61#1:289\n67#1:300,9\n67#1:321\n72#1:337,9\n72#1:358\n88#1:376,9\n88#1:397\n88#1:399,2\n72#1:403,2\n67#1:407,2\n116#1:426,9\n116#1:447\n116#1:460,2\n61#1:466,2\n61#1:281,6\n67#1:313,6\n72#1:350,6\n88#1:389,6\n116#1:439,6\n67#1:291,3\n67#1:322\n72#1:323\n72#1:324,7\n72#1:359\n72#1:406\n67#1:410\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/PrivacyPolicyDialogKt.dex */
public final class PrivacyPolicyDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrivacyPolicyDialog$lambda$7(Function0 function0, int i, Composer composer, int i2) {
        PrivacyPolicyDialog(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PrivacyPolicyDialog(@NotNull final Function0<Unit> function0, @Nullable Composer $composer, final int $changed) {
        final Function0 onDismiss;
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(1230149852);
        ComposerKt.sourceInformation($composer2, "C(PrivacyPolicyDialog)50@2062L8185,47@1949L8298:PrivacyPolicyDialog.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 4 : 2;
        }
        if (($dirty & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            onDismiss = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1230149852, $dirty, -1, "com.example.ui.screens.PrivacyPolicyDialog (PrivacyPolicyDialog.kt:46)");
            }
            onDismiss = function0;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-875672717, true, new Function2() { // from class: com.example.ui.screens.PrivacyPolicyDialogKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacyPolicyDialogKt.PrivacyPolicyDialog$lambda$6(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.PrivacyPolicyDialogKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return PrivacyPolicyDialogKt.PrivacyPolicyDialog$lambda$7(onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PrivacyPolicyDialog$lambda$6(final Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C57@2315L11,57@2273L62,58@2368L38,59@2413L7830,51@2068L8175:PrivacyPolicyDialog.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-875672717, $changed, -1, "com.example.ui.screens.PrivacyPolicyDialog.<anonymous> (PrivacyPolicyDialog.kt:51)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.heightIn-VpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion, 0.94f), 0.0f, Dp.constructor-impl(680), 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24))), "privacy_policy_dialog"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(8), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1788298267, true, new Function3() { // from class: com.example.ui.screens.PrivacyPolicyDialogKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PrivacyPolicyDialogKt.PrivacyPolicyDialog$lambda$6$lambda$5($onDismiss, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PrivacyPolicyDialog$lambda$6$lambda$5(kotlin.jvm.functions.Function0 r125, androidx.compose.foundation.layout.ColumnScope r126, androidx.compose.runtime.Composer r127, int r128) {
        /*
            Method dump skipped, instructions count: 2818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.PrivacyPolicyDialogKt.PrivacyPolicyDialog$lambda$6$lambda$5(kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
