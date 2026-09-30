package com.example.ui.screens;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.BuildConfig;
import com.example.data.model.District;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.MainViewModel;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* compiled from: QiblaScreen.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"QiblaScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "selectedDistrict", "Lcom/example/data/model/District;", "deviceAzimuth", "", "qiblaBearing", "", "distanceKm", "isFacingQibla", "", "animatedAzimuth", "ringBorderColor", "Landroidx/compose/ui/graphics/Color;"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQiblaScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaScreen.kt\ncom/example/ui/screens/QiblaScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,394:1\n148#2:395\n148#2:396\n148#2:446\n148#2:451\n148#2:488\n148#2:489\n148#2:535\n148#2:536\n148#2:537\n148#2:538\n148#2:539\n148#2:540\n148#2:541\n148#2:542\n148#2:543\n148#2:544\n148#2:545\n148#2:587\n148#2:588\n148#2:624\n148#2:631\n148#2:667\n148#2:704\n148#2:705\n148#2:706\n148#2:707\n148#2:722\n148#2:723\n148#2:728\n148#2:765\n148#2:770\n148#2:807\n148#2:812\n148#2:848\n148#2:849\n1225#3,6:397\n1225#3,6:625\n1225#3,6:708\n81#4:403\n81#4:404\n81#4:405\n81#4:406\n81#4:407\n81#4:408\n81#4:409\n85#5:410\n82#5,6:411\n88#5:445\n92#5:450\n85#5:490\n81#5,7:491\n88#5:526\n92#5:530\n85#5:546\n81#5,7:547\n88#5:582\n92#5:586\n85#5:668\n82#5,6:669\n88#5:703\n92#5:717\n85#5:729\n82#5,6:730\n88#5:764\n92#5:769\n85#5:771\n82#5,6:772\n88#5:806\n92#5:811\n78#6,6:417\n85#6,4:432\n89#6,2:442\n93#6:449\n78#6,6:459\n85#6,4:474\n89#6,2:484\n78#6,6:498\n85#6,4:513\n89#6,2:523\n93#6:529\n93#6:533\n78#6,6:554\n85#6,4:569\n89#6,2:579\n93#6:585\n78#6,6:595\n85#6,4:610\n89#6,2:620\n78#6,6:638\n85#6,4:653\n89#6,2:663\n78#6,6:675\n85#6,4:690\n89#6,2:700\n93#6:716\n93#6:720\n93#6:726\n78#6,6:736\n85#6,4:751\n89#6,2:761\n93#6:768\n78#6,6:778\n85#6,4:793\n89#6,2:803\n93#6:810\n78#6,6:819\n85#6,4:834\n89#6,2:844\n93#6:852\n368#7,9:423\n377#7:444\n378#7,2:447\n368#7,9:465\n377#7:486\n368#7,9:504\n377#7:525\n378#7,2:527\n378#7,2:531\n368#7,9:560\n377#7:581\n378#7,2:583\n368#7,9:601\n377#7:622\n368#7,9:644\n377#7:665\n368#7,9:681\n377#7:702\n378#7,2:714\n378#7,2:718\n378#7,2:724\n368#7,9:742\n377#7:763\n378#7,2:766\n368#7,9:784\n377#7:805\n378#7,2:808\n368#7,9:825\n377#7:846\n378#7,2:850\n4032#8,6:436\n4032#8,6:478\n4032#8,6:517\n4032#8,6:573\n4032#8,6:614\n4032#8,6:657\n4032#8,6:694\n4032#8,6:755\n4032#8,6:797\n4032#8,6:838\n98#9:452\n95#9,6:453\n101#9:487\n105#9:534\n98#9:813\n96#9,5:814\n101#9:847\n105#9:853\n71#10:589\n69#10,5:590\n74#10:623\n71#10:632\n69#10,5:633\n74#10:666\n78#10:721\n78#10:727\n*S KotlinDebug\n*F\n+ 1 QiblaScreen.kt\ncom/example/ui/screens/QiblaScreenKt\n*L\n94#1:395\n96#1:396\n110#1:446\n136#1:451\n143#1:488\n146#1:489\n124#1:535\n126#1:536\n128#1:537\n131#1:538\n183#1:539\n190#1:540\n191#1:541\n209#1:542\n210#1:543\n211#1:544\n256#1:545\n169#1:587\n171#1:588\n179#1:624\n220#1:631\n226#1:667\n230#1:704\n232#1:705\n233#1:706\n252#1:707\n272#1:722\n273#1:723\n308#1:728\n316#1:765\n337#1:770\n345#1:807\n300#1:812\n305#1:848\n334#1:849\n97#1:397,6\n181#1:625,6\n252#1:708,6\n63#1:403\n64#1:404\n65#1:405\n66#1:406\n67#1:407\n70#1:408\n81#1:409\n100#1:410\n100#1:411,6\n100#1:445\n100#1:450\n148#1:490\n148#1:491,7\n148#1:526\n148#1:530\n275#1:546\n275#1:547,7\n275#1:582\n275#1:586\n224#1:668\n224#1:669,6\n224#1:703\n224#1:717\n307#1:729\n307#1:730,6\n307#1:764\n307#1:769\n336#1:771\n336#1:772,6\n336#1:806\n336#1:811\n100#1:417,6\n100#1:432,4\n100#1:442,2\n100#1:449\n133#1:459,6\n133#1:474,4\n133#1:484,2\n148#1:498,6\n148#1:513,4\n148#1:523,2\n148#1:529\n133#1:533\n275#1:554,6\n275#1:569,4\n275#1:579,2\n275#1:585\n167#1:595,6\n167#1:610,4\n167#1:620,2\n218#1:638,6\n218#1:653,4\n218#1:663,2\n224#1:675,6\n224#1:690,4\n224#1:700,2\n224#1:716\n218#1:720\n167#1:726\n307#1:736,6\n307#1:751,4\n307#1:761,2\n307#1:768\n336#1:778,6\n336#1:793,4\n336#1:803,2\n336#1:810\n298#1:819,6\n298#1:834,4\n298#1:844,2\n298#1:852\n100#1:423,9\n100#1:444\n100#1:447,2\n133#1:465,9\n133#1:486\n148#1:504,9\n148#1:525\n148#1:527,2\n133#1:531,2\n275#1:560,9\n275#1:581\n275#1:583,2\n167#1:601,9\n167#1:622\n218#1:644,9\n218#1:665\n224#1:681,9\n224#1:702\n224#1:714,2\n218#1:718,2\n167#1:724,2\n307#1:742,9\n307#1:763\n307#1:766,2\n336#1:784,9\n336#1:805\n336#1:808,2\n298#1:825,9\n298#1:846\n298#1:850,2\n100#1:436,6\n133#1:478,6\n148#1:517,6\n275#1:573,6\n167#1:614,6\n218#1:657,6\n224#1:694,6\n307#1:755,6\n336#1:797,6\n298#1:838,6\n133#1:452\n133#1:453,6\n133#1:487\n133#1:534\n298#1:813\n298#1:814,5\n298#1:847\n298#1:853\n167#1:589\n167#1:590,5\n167#1:623\n218#1:632\n218#1:633,5\n218#1:666\n218#1:721\n167#1:727\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/QiblaScreenKt.dex */
public final class QiblaScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QiblaScreen$lambda$33(MainViewModel mainViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QiblaScreen(mainViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0248  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void QiblaScreen(@org.jetbrains.annotations.NotNull final com.example.ui.viewmodel.MainViewModel r40, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QiblaScreenKt.QiblaScreen(com.example.ui.viewmodel.MainViewModel, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final District QiblaScreen$lambda$0(State<District> state) {
        return (District) state.getValue();
    }

    private static final float QiblaScreen$lambda$1(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final double QiblaScreen$lambda$2(State<Double> state) {
        return ((Number) state.getValue()).doubleValue();
    }

    private static final double QiblaScreen$lambda$3(State<Double> state) {
        return ((Number) state.getValue()).doubleValue();
    }

    private static final boolean QiblaScreen$lambda$4(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final float QiblaScreen$lambda$5(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final long QiblaScreen$lambda$6(State<Color> state) {
        return ((Color) state.getValue()).unbox-impl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QiblaScreen$lambda$32$lambda$31(final State $selectedDistrict$delegate, final long $surfaceVariant, final State $isFacingQibla$delegate, final String $cardinalDirection, final State $qiblaBearing$delegate, final State $ringBorderColor$delegate, final long $primaryColor, final long $onSurfaceColor, final float $relativeQiblaAngle, final State $animatedAzimuth$delegate, final State $distanceKm$delegate, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1274589762, true, new Function3() { // from class: com.example.ui.screens.QiblaScreenKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$8($selectedDistrict$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1058727193, true, new Function3() { // from class: com.example.ui.screens.QiblaScreenKt$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$12($surfaceVariant, $isFacingQibla$delegate, $cardinalDirection, $qiblaBearing$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(627172742, true, new Function3() { // from class: com.example.ui.screens.QiblaScreenKt$$ExternalSyntheticLambda5
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$24($ringBorderColor$delegate, $primaryColor, $onSurfaceColor, $relativeQiblaAngle, $animatedAzimuth$delegate, $isFacingQibla$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1981894619, true, new Function3() { // from class: com.example.ui.screens.QiblaScreenKt$$ExternalSyntheticLambda6
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$30($cardinalDirection, $qiblaBearing$delegate, $distanceKm$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$QiblaScreenKt.INSTANCE.m66getLambda$295994684$app(), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit QiblaScreen$lambda$32$lambda$31$lambda$8(State $selectedDistrict$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C99@4000L603:QiblaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1274589762, $changed, -1, "com.example.ui.screens.QiblaScreen.<anonymous>.<anonymous>.<anonymous> (QiblaScreen.kt:99)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart($composer, -1288789847, "C105@4203L10,107@4301L11,103@4129L206,109@4344L40,112@4502L10,113@4557L11,110@4393L202:QiblaScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Qibla Direction", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnBackground-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65498);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g("Calibrated for " + QiblaScreen$lambda$0($selectedDistrict$delegate).getName() + ", Sri Lanka", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
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
    public static final Unit QiblaScreen$lambda$32$lambda$31$lambda$12(long $surfaceVariant, final State $isFacingQibla$delegate, final String $cardinalDirection, final State $qiblaBearing$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        long j;
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C131@5133L1162,120@4668L1627:QiblaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1058727193, $changed, -1, "com.example.ui.screens.QiblaScreen.<anonymous>.<anonymous>.<anonymous> (QiblaScreen.kt:120)");
            }
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16)));
            float f = QiblaScreen$lambda$4($isFacingQibla$delegate) ? Dp.constructor-impl(2) : Dp.constructor-impl(1);
            if (QiblaScreen$lambda$4($isFacingQibla$delegate)) {
                $composer.startReplaceGroup(470423955);
                $composer.endReplaceGroup();
                j = ColorKt.getIslamicGreen();
            } else {
                $composer.startReplaceGroup(470425365);
                ComposerKt.sourceInformation($composer, "126@4919L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU();
                $composer.endReplaceGroup();
            }
            SurfaceKt.Surface-T9BRK9s(BorderKt.border-xT4_qwU(clip, f, j, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16))), (Shape) null, QiblaScreen$lambda$4($isFacingQibla$delegate) ? Color.copy-wmQWz5c$default(ColorKt.getIslamicGreen(), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : $surfaceVariant, 0L, Dp.constructor-impl(2), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(716984108, true, new Function2() { // from class: com.example.ui.screens.QiblaScreenKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$12$lambda$11($isFacingQibla$delegate, $cardinalDirection, $qiblaBearing$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12607488, 106);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit QiblaScreen$lambda$32$lambda$31$lambda$12$lambda$11(androidx.compose.runtime.State r72, java.lang.String r73, androidx.compose.runtime.State r74, androidx.compose.runtime.Composer r75, int r76) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$12$lambda$11(androidx.compose.runtime.State, java.lang.String, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit QiblaScreen$lambda$32$lambda$31$lambda$24(androidx.compose.runtime.State r82, final long r83, final long r85, float r87, final androidx.compose.runtime.State r88, final androidx.compose.runtime.State r89, androidx.compose.foundation.lazy.LazyItemScope r90, androidx.compose.runtime.Composer r91, int r92) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$24(androidx.compose.runtime.State, long, long, float, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QiblaScreen$lambda$32$lambda$31$lambda$24$lambda$23$lambda$15$lambda$14(long $primaryColor, long $onSurfaceColor, DrawScope $this$Canvas) {
        long center;
        Intrinsics.checkNotNullParameter($this$Canvas, "$this$Canvas");
        long center2 = OffsetKt.Offset(Size.getWidth-impl($this$Canvas.getSize-NH-jbRc()) / 2.0f, Size.getHeight-impl($this$Canvas.getSize-NH-jbRc()) / 2.0f);
        float radius = (Size.getWidth-impl($this$Canvas.getSize-NH-jbRc()) / 2.0f) - $this$Canvas.toPx-0680j_4(Dp.constructor-impl(16));
        boolean z = false;
        IntProgression step = RangesKt.step(RangesKt.until(0, 360), 15);
        int deg = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && deg <= last) || (step2 < 0 && last <= deg)) {
            int deg2 = deg;
            while (true) {
                double rad = Math.toRadians(deg2);
                boolean isMajor = deg2 % 90 == 0 ? true : z;
                boolean isMedium = deg2 % 45 != 0 ? z : true;
                float tickLength = $this$Canvas.toPx-0680j_4(isMajor ? Dp.constructor-impl(14) : isMedium ? Dp.constructor-impl(10) : Dp.constructor-impl(6));
                float strokeWidth = $this$Canvas.toPx-0680j_4(isMajor ? Dp.constructor-impl(3) : isMedium ? Dp.constructor-impl(2) : Dp.constructor-impl(1));
                long color = isMajor ? $primaryColor : Color.copy-wmQWz5c$default($onSurfaceColor, 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                float startX = Offset.getX-impl(center2) + ((radius - tickLength) * ((float) Math.sin(rad)));
                float startY = Offset.getY-impl(center2) - ((radius - tickLength) * ((float) Math.cos(rad)));
                float endX = Offset.getX-impl(center2) + (((float) Math.sin(rad)) * radius);
                float endY = Offset.getY-impl(center2) - (((float) Math.cos(rad)) * radius);
                int i = last;
                long Offset = OffsetKt.Offset(startX, startY);
                int deg3 = deg2;
                boolean z2 = z;
                long color2 = color;
                long color3 = OffsetKt.Offset(endX, endY);
                center = center2;
                DrawScope.drawLine-NGM6Ib0$default($this$Canvas, color2, Offset, color3, strokeWidth, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
                if (deg3 == i) {
                    break;
                }
                deg2 = deg3 + step2;
                last = i;
                z = z2;
                center2 = center;
            }
        } else {
            center = center2;
        }
        Path needlePath = AndroidPath_androidKt.Path();
        needlePath.moveTo(Offset.getX-impl(center), (Offset.getY-impl(center) - radius) + $this$Canvas.toPx-0680j_4(Dp.constructor-impl(20)));
        needlePath.lineTo(Offset.getX-impl(center) - $this$Canvas.toPx-0680j_4(Dp.constructor-impl(8)), Offset.getY-impl(center));
        needlePath.lineTo(Offset.getX-impl(center) + $this$Canvas.toPx-0680j_4(Dp.constructor-impl(8)), Offset.getY-impl(center));
        needlePath.close();
        DrawScope.drawPath-LG529CI$default($this$Canvas, needlePath, androidx.compose.ui.graphics.ColorKt.Color(4292617766L), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QiblaScreen$lambda$32$lambda$31$lambda$24$lambda$23$lambda$20$lambda$19$lambda$18$lambda$17(DrawScope $this$Canvas) {
        Intrinsics.checkNotNullParameter($this$Canvas, "$this$Canvas");
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(Size.getWidth-impl($this$Canvas.getSize-NH-jbRc()) / 2.0f, 0.0f);
        Path.lineTo(Size.getWidth-impl($this$Canvas.getSize-NH-jbRc()), Size.getHeight-impl($this$Canvas.getSize-NH-jbRc()));
        Path.lineTo(Size.getWidth-impl($this$Canvas.getSize-NH-jbRc()) / 2.0f, Size.getHeight-impl($this$Canvas.getSize-NH-jbRc()) - $this$Canvas.toPx-0680j_4(Dp.constructor-impl(6)));
        Path.lineTo(0.0f, Size.getHeight-impl($this$Canvas.getSize-NH-jbRc()));
        Path.close();
        DrawScope.drawPath-GBMwjPU$default($this$Canvas, Path, Brush.Companion.verticalGradient-8A-3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.box-impl(ColorKt.getIslamicGold()), Color.box-impl(ColorKt.getIslamicGreen())}), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0171  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit QiblaScreen$lambda$32$lambda$31$lambda$24$lambda$23$lambda$22(androidx.compose.runtime.State r51, androidx.compose.runtime.State r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$24$lambda$23$lambda$22(androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit QiblaScreen$lambda$32$lambda$31$lambda$30(final String $cardinalDirection, final State $qiblaBearing$delegate, final State $distanceKm$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C297@11065L2338:QiblaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981894619, $changed, -1, "com.example.ui.screens.QiblaScreen.<anonymous>.<anonymous>.<anonymous> (QiblaScreen.kt:297)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal horizontal = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
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
            int i3 = ((54 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 220434855, "C303@11314L11,303@11272L69,305@11397L884,301@11192L1089,332@12413L11,332@12371L69,334@12496L899,330@12291L1104:QiblaScreen.kt#2thlc2");
            CardKt.Card(RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1112967823, true, new Function3() { // from class: com.example.ui.screens.QiblaScreenKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$30$lambda$29$lambda$26($cardinalDirection, $qiblaBearing$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 24);
            CardKt.Card(RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(516929400, true, new Function3() { // from class: com.example.ui.screens.QiblaScreenKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return QiblaScreenKt.QiblaScreen$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28($distanceKm$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 24);
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
    public static final Unit QiblaScreen$lambda$32$lambda$31$lambda$30$lambda$29$lambda$26(String $cardinalDirection, State $qiblaBearing$delegate, ColumnScope $this$Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C306@11409L862:QiblaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1112967823, $changed, -1, "com.example.ui.screens.QiblaScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QiblaScreen.kt:306)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, -1463098071, "C312@11632L10,313@11691L11,310@11554L179,315@11746L40,318@11909L10,320@12013L11,316@11799L247,324@12140L10,325@12198L11,322@12059L200:QiblaScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Qibla Angle", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g(((int) QiblaScreen$lambda$2($qiblaBearing$delegate)) + "° " + $cardinalDirection, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196608, 0, 65498);
            TextKt.Text--4IGK_g("West-Northwest", (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
    public static final Unit QiblaScreen$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28(State $distanceKm$delegate, ColumnScope $this$Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C335@12508L877:QiblaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(516929400, $changed, -1, "com.example.ui.screens.QiblaScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QiblaScreen.kt:335)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, -107126799, "C341@12738L10,342@12797L11,339@12653L186,344@12852L40,347@13018L10,349@13122L11,345@12905L252,353@13254L10,354@13312L11,351@13170L203:QiblaScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Distance to Makkah", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf((int) QiblaScreen$lambda$3($distanceKm$delegate))}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.Text--4IGK_g(format + " km", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196608, 0, 65498);
            TextKt.Text--4IGK_g("Great Circle Line", (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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
}
