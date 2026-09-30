package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import com.example.BuildConfig;
import com.example.data.model.MosqueEvent;
import com.example.data.model.MosqueEventType;
import com.example.ui.viewmodel.MainViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MosqueEventsScreen.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001aS\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b26\u0010\u000f\u001a2\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"MosqueEventsScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MosqueEventCard", "event", "Lcom/example/data/model/MosqueEvent;", "onToggleReminder", "Lkotlin/Function0;", "(Lcom/example/data/model/MosqueEvent;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AddMosqueEventDialog", "onDismiss", "onSubmit", "Lkotlin/Function7;", "", "Lcom/example/data/model/MosqueEventType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "app", "events", "", "selectedFilter", "showAddDialog", "", "mosqueName", "title", "speaker", "time", "address", "description", "selectedType"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMosqueEventsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosqueEventsScreen.kt\ncom/example/ui/screens/MosqueEventsScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 12 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 13 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 14 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n1225#2,6:455\n1225#2,6:502\n1225#2,6:508\n1225#2,6:519\n1225#2,6:525\n1225#2,6:533\n1225#2,6:539\n1225#2,6:545\n1225#2,6:551\n1225#2,6:557\n1225#2,6:563\n1225#2,6:569\n1225#2,6:616\n1225#2,6:627\n1225#2,6:759\n1225#2,6:934\n1225#2,6:976\n1225#2,6:982\n1225#2,6:988\n1225#2,6:994\n1225#2,6:1000\n1225#2,6:1006\n774#3:461\n865#3,2:462\n1788#3,4:623\n71#4:464\n68#4,6:465\n74#4:499\n78#4:518\n78#5,6:471\n85#5,4:486\n89#5,2:496\n93#5:517\n78#5,6:587\n85#5,4:602\n89#5,2:612\n93#5:636\n78#5,6:659\n85#5,4:674\n89#5,2:684\n78#5,6:691\n85#5,4:706\n89#5,2:716\n78#5,6:729\n85#5,4:744\n89#5,2:754\n93#5:767\n93#5:771\n78#5,6:783\n85#5,4:798\n89#5,2:808\n93#5:816\n78#5,6:827\n85#5,4:842\n89#5,2:852\n93#5:860\n78#5,6:871\n85#5,4:886\n89#5,2:896\n93#5:904\n93#5:910\n78#5,6:947\n85#5,4:962\n89#5,2:972\n93#5:1014\n368#6,9:477\n377#6:498\n378#6,2:515\n368#6,9:593\n377#6:614\n378#6,2:634\n368#6,9:665\n377#6:686\n368#6,9:697\n377#6:718\n368#6,9:735\n377#6:756\n378#6,2:765\n378#6,2:769\n368#6,9:789\n377#6:810\n378#6,2:814\n368#6,9:833\n377#6:854\n378#6,2:858\n368#6,9:877\n377#6:898\n378#6,2:902\n378#6,2:908\n368#6,9:953\n377#6:974\n378#6,2:1012\n4032#7,6:490\n4032#7,6:606\n4032#7,6:678\n4032#7,6:710\n4032#7,6:748\n4032#7,6:802\n4032#7,6:846\n4032#7,6:890\n4032#7,6:966\n148#8:500\n148#8:501\n148#8:514\n148#8:531\n148#8:532\n148#8:580\n148#8:650\n148#8:651\n148#8:720\n148#8:758\n148#8:773\n148#8:774\n148#8:812\n148#8:813\n148#8:818\n148#8:856\n148#8:857\n148#8:862\n148#8:900\n148#8:901\n148#8:906\n148#8:907\n148#8:940\n81#9:575\n81#9:576\n81#9:577\n107#9,2:578\n81#9:912\n107#9,2:913\n81#9:915\n107#9,2:916\n81#9:918\n107#9,2:919\n81#9:921\n107#9,2:922\n81#9:924\n107#9,2:925\n81#9:927\n107#9,2:928\n81#9:930\n107#9,2:931\n98#10:581\n96#10,5:582\n101#10:615\n105#10:637\n98#10,3:688\n101#10:719\n98#10:721\n94#10,7:722\n101#10:757\n105#10:768\n105#10:772\n98#10:775\n94#10,7:776\n101#10:811\n105#10:817\n98#10:819\n94#10,7:820\n101#10:855\n105#10:861\n98#10:863\n94#10,7:864\n101#10:899\n105#10:905\n13472#11:622\n13473#11:633\n143#12,12:638\n85#13:652\n82#13,6:653\n88#13:687\n92#13:911\n85#13:941\n83#13,5:942\n88#13:975\n92#13:1015\n1#14:933\n*S KotlinDebug\n*F\n+ 1 MosqueEventsScreen.kt\ncom/example/ui/screens/MosqueEventsScreenKt\n*L\n73#1:455,6\n88#1:502,6\n181#1:508,6\n203#1:519,6\n204#1:525,6\n368#1:533,6\n369#1:539,6\n370#1:545,6\n371#1:551,6\n372#1:557,6\n373#1:563,6\n374#1:569,6\n117#1:616,6\n129#1:627,6\n265#1:759,6\n430#1:934,6\n386#1:976,6\n393#1:982,6\n400#1:988,6\n407#1:994,6\n414#1:1000,6\n421#1:1006,6\n78#1:461\n78#1:462,2\n126#1:623,4\n81#1:464\n81#1:465,6\n81#1:499\n81#1:518\n81#1:471,6\n81#1:486,4\n81#1:496,2\n81#1:517\n109#1:587,6\n109#1:602,4\n109#1:612,2\n109#1:636\n235#1:659,6\n235#1:674,4\n235#1:684,2\n237#1:691,6\n237#1:706,4\n237#1:716,2\n255#1:729,6\n255#1:744,4\n255#1:754,2\n255#1:767\n237#1:771\n288#1:783,6\n288#1:798,4\n288#1:808,2\n288#1:816\n307#1:827,6\n307#1:842,4\n307#1:852,2\n307#1:860\n325#1:871,6\n325#1:886,4\n325#1:896,2\n325#1:904\n235#1:910\n380#1:947,6\n380#1:962,4\n380#1:972,2\n380#1:1014\n81#1:477,9\n81#1:498\n81#1:515,2\n109#1:593,9\n109#1:614\n109#1:634,2\n235#1:665,9\n235#1:686\n237#1:697,9\n237#1:718\n255#1:735,9\n255#1:756\n255#1:765,2\n237#1:769,2\n288#1:789,9\n288#1:810\n288#1:814,2\n307#1:833,9\n307#1:854\n307#1:858,2\n325#1:877,9\n325#1:898\n325#1:902,2\n235#1:908,2\n380#1:953,9\n380#1:974\n380#1:1012,2\n81#1:490,6\n109#1:606,6\n235#1:678,6\n237#1:710,6\n255#1:748,6\n288#1:802,6\n307#1:846,6\n325#1:890,6\n380#1:966,6\n86#1:500\n87#1:501\n184#1:514\n230#1:531\n233#1:532\n113#1:580\n251#1:650\n235#1:651\n243#1:720\n262#1:758\n275#1:773\n285#1:774\n293#1:812\n295#1:813\n304#1:818\n312#1:856\n314#1:857\n324#1:862\n330#1:900\n332#1:901\n341#1:906\n351#1:907\n382#1:940\n71#1:575\n72#1:576\n73#1:577\n73#1:578,2\n368#1:912\n368#1:913,2\n369#1:915\n369#1:916,2\n370#1:918\n370#1:919,2\n371#1:921\n371#1:922,2\n372#1:924\n372#1:925,2\n373#1:927\n373#1:928,2\n374#1:930\n374#1:931,2\n109#1:581\n109#1:582,5\n109#1:615\n109#1:637\n237#1:688,3\n237#1:719\n255#1:721\n255#1:722,7\n255#1:757\n255#1:768\n237#1:772\n288#1:775\n288#1:776,7\n288#1:811\n288#1:817\n307#1:819\n307#1:820,7\n307#1:855\n307#1:861\n325#1:863\n325#1:864,7\n325#1:899\n325#1:905\n125#1:622\n125#1:633\n171#1:638,12\n235#1:652\n235#1:653,6\n235#1:687\n235#1:911\n380#1:941\n380#1:942,5\n380#1:975\n380#1:1015\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/MosqueEventsScreenKt.dex */
public final class MosqueEventsScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$82(Function0 function0, Function7 function7, int i, Composer composer, int i2) {
        AddMosqueEventDialog(function0, function7, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventCard$lambda$39(MosqueEvent mosqueEvent, Function0 function0, int i, Composer composer, int i2) {
        MosqueEventCard(mosqueEvent, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventsScreen$lambda$28(MainViewModel mainViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MosqueEventsScreen(mainViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f4  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MosqueEventsScreen(@org.jetbrains.annotations.NotNull final com.example.ui.viewmodel.MainViewModel r52, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r53, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.MosqueEventsScreenKt.MosqueEventsScreen(com.example.ui.viewmodel.MainViewModel, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List<MosqueEvent> MosqueEventsScreen$lambda$0(State<? extends List<MosqueEvent>> state) {
        return (List) state.getValue();
    }

    private static final MosqueEventType MosqueEventsScreen$lambda$1(State<? extends MosqueEventType> state) {
        return (MosqueEventType) state.getValue();
    }

    private static final boolean MosqueEventsScreen$lambda$3(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void MosqueEventsScreen$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventsScreen$lambda$23$lambda$20$lambda$19(final List $filteredEvents, final MainViewModel $viewModel, final State $selectedFilter$delegate, final State $events$delegate, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$MosqueEventsScreenKt.INSTANCE.getLambda$470598088$app(), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-976764047, true, new Function3() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda12
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MosqueEventsScreenKt.MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$15(MainViewModel.this, $selectedFilter$delegate, $events$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        if ($filteredEvents.isEmpty()) {
            LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$MosqueEventsScreenKt.INSTANCE.getLambda$982058445$app(), 3, (Object) null);
        }
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return MosqueEventsScreenKt.MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$16((MosqueEvent) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.screens.MosqueEventsScreenKt$MosqueEventsScreen$lambda$23$lambda$20$lambda$19$$inlined$items$default$1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m82invoke((MosqueEvent) p1);
            }

            @Nullable
            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m82invoke(MosqueEvent mosqueEvent) {
                return null;
            }
        };
        $this$LazyColumn.items($filteredEvents.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.MosqueEventsScreenKt$MosqueEventsScreen$lambda$23$lambda$20$lambda$19$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @NotNull
            public final Object invoke(int index) {
                return function1.invoke($filteredEvents.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.MosqueEventsScreenKt$MosqueEventsScreen$lambda$23$lambda$20$lambda$19$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @Nullable
            public final Object invoke(int index) {
                return function12.invoke($filteredEvents.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.MosqueEventsScreenKt$MosqueEventsScreen$lambda$23$lambda$20$lambda$19$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4) {
                invoke((LazyItemScope) p1, ((Number) p2).intValue(), (Composer) p3, ((Number) p4).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope $this$items, int it, @Nullable Composer $composer, int $changed) {
                Object obj;
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final MosqueEvent mosqueEvent = (MosqueEvent) $filteredEvents.get(it);
                $composer.startReplaceGroup(1597654053);
                ComposerKt.sourceInformation($composer, "C*173@6710L41,171@6639L122:MosqueEventsScreen.kt#2thlc2");
                ComposerKt.sourceInformationMarkerStart($composer, -1472481235, "CC(remember):MosqueEventsScreen.kt#9igjgp");
                boolean changedInstance = ((((i & 112) ^ 48) > 32 && $composer.changed(mosqueEvent)) || (i & 48) == 32) | $composer.changedInstance($viewModel);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    final MainViewModel mainViewModel = $viewModel;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.MosqueEventsScreenKt$MosqueEventsScreen$1$1$1$3$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m83invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m83invoke() {
                            MainViewModel.this.toggleMosqueReminder(mosqueEvent);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                MosqueEventsScreenKt.MosqueEventCard(mosqueEvent, (Function0) obj, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$15(com.example.ui.viewmodel.MainViewModel r67, androidx.compose.runtime.State r68, final androidx.compose.runtime.State r69, androidx.compose.foundation.lazy.LazyItemScope r70, androidx.compose.runtime.Composer r71, int r72) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.MosqueEventsScreenKt.MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$15(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$15$lambda$14$lambda$7$lambda$6(MainViewModel $viewModel) {
        $viewModel.setMosqueFilter(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$15$lambda$14$lambda$8(State $events$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C117@4682L28:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-113346822, $changed, -1, "com.example.ui.screens.MosqueEventsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MosqueEventsScreen.kt:117)");
            }
            TextKt.Text--4IGK_g("All (" + MosqueEventsScreen$lambda$0($events$delegate).size() + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$15$lambda$14$lambda$13$lambda$11$lambda$10(MainViewModel $viewModel, MosqueEventType $type, State $selectedFilter$delegate) {
        $viewModel.setMosqueFilter(MosqueEventsScreen$lambda$1($selectedFilter$delegate) == $type ? null : $type);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$15$lambda$14$lambda$13$lambda$12(MosqueEventType $type, int $count, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C129@5255L30:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-223619411, $changed, -1, "com.example.ui.screens.MosqueEventsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MosqueEventsScreen.kt:129)");
            }
            TextKt.Text--4IGK_g($type.getLabel() + " (" + $count + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object MosqueEventsScreen$lambda$23$lambda$20$lambda$19$lambda$16(MosqueEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventsScreen$lambda$23$lambda$22$lambda$21(MutableState $showAddDialog$delegate) {
        MosqueEventsScreen$lambda$4($showAddDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventsScreen$lambda$25$lambda$24(MutableState $showAddDialog$delegate) {
        MosqueEventsScreen$lambda$4($showAddDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventsScreen$lambda$27$lambda$26(MainViewModel $viewModel, MutableState $showAddDialog$delegate, String mosque, String title, String speaker, String time, String address, String desc, MosqueEventType type) {
        Intrinsics.checkNotNullParameter(mosque, "mosque");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(speaker, "speaker");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(type, "type");
        $viewModel.addCommunityMosqueEvent(mosque, title, speaker, time, address, desc, type);
        MosqueEventsScreen$lambda$4($showAddDialog$delegate, false);
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MosqueEventCard(@NotNull final MosqueEvent event, @NotNull final Function0<Unit> function0, @Nullable Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(function0, "onToggleReminder");
        Composer $composer2 = $composer.startRestartGroup(569973637);
        ComposerKt.sourceInformation($composer2, "C(MosqueEventCard)231@8326L11,231@8284L62,232@8377L38,233@8420L4231,226@8125L4526:MosqueEventsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(event) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(569973637, $dirty, -1, "com.example.ui.screens.MosqueEventCard (MosqueEventsScreen.kt:223)");
            }
            final long badgeColor = ColorKt.Color(event.getEventType().getBadgeColorHex());
            Modifier testTag = TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "event_card_" + event.getId());
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14);
            CardElevation cardElevation = CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62);
            $composer2 = $composer2;
            CardKt.Card(testTag, (Shape) null, cardColors, cardElevation, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-633434925, true, new Function3() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda24
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MosqueEventsScreenKt.MosqueEventCard$lambda$38(MosqueEvent.this, badgeColor, function0, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda25
                public final Object invoke(Object obj, Object obj2) {
                    return MosqueEventsScreenKt.MosqueEventCard$lambda$39(MosqueEvent.this, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x088b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0c66  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0b8e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MosqueEventCard$lambda$38(final com.example.data.model.MosqueEvent r115, final long r116, final kotlin.jvm.functions.Function0 r118, androidx.compose.foundation.layout.ColumnScope r119, androidx.compose.runtime.Composer r120, int r121) {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.MosqueEventsScreenKt.MosqueEventCard$lambda$38(com.example.data.model.MosqueEvent, long, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MosqueEventCard$lambda$38$lambda$37$lambda$33$lambda$29(MosqueEvent $event, long $badgeColor, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C247@8914L10,245@8832L267:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-609577282, $changed, -1, "com.example.ui.screens.MosqueEventCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MosqueEventsScreen.kt:245)");
            }
            TextKt.Text--4IGK_g($event.getEventType().getLabel(), PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10), Dp.constructor-impl(4)), $badgeColor, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MosqueEventCard$lambda$38$lambda$37$lambda$33$lambda$32$lambda$31$lambda$30(Function0 $onToggleReminder, boolean it) {
        $onToggleReminder.invoke();
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void AddMosqueEventDialog(@NotNull final Function0<Unit> function0, @NotNull final Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super MosqueEventType, Unit> function7, @Nullable Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Intrinsics.checkNotNullParameter(function7, "onSubmit");
        Composer $composer3 = $composer.startRestartGroup(1624530013);
        ComposerKt.sourceInformation($composer3, "C(AddMosqueEventDialog)367@12828L31,368@12875L31,369@12924L31,370@12970L31,371@13019L31,372@13072L31,373@13126L50,427@14890L491,446@15403L78,378@13318L1550,375@13180L2305:MosqueEventsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function7) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1624530013, $dirty2, -1, "com.example.ui.screens.AddMosqueEventDialog (MosqueEventsScreen.kt:366)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 2100219612, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                obj = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState mosqueName$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2100221116, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                obj2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState title$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2100222684, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                obj3 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState speaker$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2100224156, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                obj4 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState time$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2100225724, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            Object rememberedValue5 = $composer3.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                obj5 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState address$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2100227420, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            Object rememberedValue6 = $composer3.rememberedValue();
            if (rememberedValue6 == Composer.Companion.getEmpty()) {
                obj6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableState description$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2100229167, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            Object rememberedValue7 = $composer3.rememberedValue();
            if (rememberedValue7 == Composer.Companion.getEmpty()) {
                obj7 = SnapshotStateKt.mutableStateOf$default(MosqueEventType.BAYAN, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState selectedType$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(function0, ComposableLambdaKt.rememberComposableLambda(273395477, true, new Function2() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda14
                public final Object invoke(Object obj8, Object obj9) {
                    return MosqueEventsScreenKt.AddMosqueEventDialog$lambda$66(function7, mosqueName$delegate, title$delegate, speaker$delegate, time$delegate, address$delegate, description$delegate, selectedType$delegate, (Composer) obj8, ((Integer) obj9).intValue());
                }
            }, $composer3, 54), (Modifier) null, ComposableLambdaKt.rememberComposableLambda(-1777013421, true, new Function2() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda15
                public final Object invoke(Object obj8, Object obj9) {
                    return MosqueEventsScreenKt.AddMosqueEventDialog$lambda$67(function0, (Composer) obj8, ((Integer) obj9).intValue());
                }
            }, $composer3, 54), (Function2) null, ComposableSingletons$MosqueEventsScreenKt.INSTANCE.getLambda$467544977$app(), ComposableLambdaKt.rememberComposableLambda(1589824176, true, new Function2() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda16
                public final Object invoke(Object obj8, Object obj9) {
                    return MosqueEventsScreenKt.AddMosqueEventDialog$lambda$81(mosqueName$delegate, title$delegate, speaker$delegate, time$delegate, address$delegate, description$delegate, (Composer) obj8, ((Integer) obj9).intValue());
                }
            }, $composer3, 54), (Shape) null, 0L, 0L, 0L, 0L, 0.0f, (DialogProperties) null, $composer2, ($dirty2 & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda17
                public final Object invoke(Object obj8, Object obj9) {
                    return MosqueEventsScreenKt.AddMosqueEventDialog$lambda$82(function0, function7, $changed, (Composer) obj8, ((Integer) obj9).intValue());
                }
            });
        }
    }

    private static final String AddMosqueEventDialog$lambda$41(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String AddMosqueEventDialog$lambda$44(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String AddMosqueEventDialog$lambda$47(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String AddMosqueEventDialog$lambda$50(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String AddMosqueEventDialog$lambda$53(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String AddMosqueEventDialog$lambda$56(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final MosqueEventType AddMosqueEventDialog$lambda$59(MutableState<MosqueEventType> mutableState) {
        return (MosqueEventType) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AddMosqueEventDialog$lambda$81(final androidx.compose.runtime.MutableState r57, final androidx.compose.runtime.MutableState r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, final androidx.compose.runtime.MutableState r61, final androidx.compose.runtime.MutableState r62, androidx.compose.runtime.Composer r63, int r64) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.MosqueEventsScreenKt.AddMosqueEventDialog$lambda$81(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$81$lambda$80$lambda$69$lambda$68(MutableState $mosqueName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $mosqueName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$81$lambda$80$lambda$71$lambda$70(MutableState $title$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $title$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$81$lambda$80$lambda$73$lambda$72(MutableState $speaker$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $speaker$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$81$lambda$80$lambda$75$lambda$74(MutableState $time$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $time$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$81$lambda$80$lambda$77$lambda$76(MutableState $address$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $address$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$81$lambda$80$lambda$79$lambda$78(MutableState $description$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $description$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AddMosqueEventDialog$lambda$66(final Function7 $onSubmit, final MutableState $mosqueName$delegate, final MutableState $title$delegate, final MutableState $speaker$delegate, final MutableState $time$delegate, final MutableState $address$delegate, final MutableState $description$delegate, final MutableState $selectedType$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C429@14928L368,428@14898L477:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(273395477, $changed, -1, "com.example.ui.screens.AddMosqueEventDialog.<anonymous> (MosqueEventsScreen.kt:428)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 740049925, "CC(remember):MosqueEventsScreen.kt#9igjgp");
            boolean changed = $composer.changed($onSubmit);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.MosqueEventsScreenKt$$ExternalSyntheticLambda11
                    public final Object invoke() {
                        return MosqueEventsScreenKt.AddMosqueEventDialog$lambda$66$lambda$65$lambda$64($onSubmit, $mosqueName$delegate, $title$delegate, $speaker$delegate, $time$delegate, $address$delegate, $description$delegate, $selectedType$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) obj, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$MosqueEventsScreenKt.INSTANCE.getLambda$1537486392$app(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddMosqueEventDialog$lambda$66$lambda$65$lambda$64(Function7 $onSubmit, MutableState $mosqueName$delegate, MutableState $title$delegate, MutableState $speaker$delegate, MutableState $time$delegate, MutableState $address$delegate, MutableState $description$delegate, MutableState $selectedType$delegate) {
        if (!StringsKt.isBlank(AddMosqueEventDialog$lambda$41($mosqueName$delegate)) && !StringsKt.isBlank(AddMosqueEventDialog$lambda$44($title$delegate))) {
            String AddMosqueEventDialog$lambda$41 = AddMosqueEventDialog$lambda$41($mosqueName$delegate);
            String AddMosqueEventDialog$lambda$44 = AddMosqueEventDialog$lambda$44($title$delegate);
            String AddMosqueEventDialog$lambda$47 = AddMosqueEventDialog$lambda$47($speaker$delegate);
            String AddMosqueEventDialog$lambda$50 = AddMosqueEventDialog$lambda$50($time$delegate);
            if (StringsKt.isBlank(AddMosqueEventDialog$lambda$50)) {
                AddMosqueEventDialog$lambda$50 = "Upcoming";
            }
            String str = AddMosqueEventDialog$lambda$50;
            String AddMosqueEventDialog$lambda$53 = AddMosqueEventDialog$lambda$53($address$delegate);
            if (StringsKt.isBlank(AddMosqueEventDialog$lambda$53)) {
                AddMosqueEventDialog$lambda$53 = "Sri Lanka";
            }
            String str2 = AddMosqueEventDialog$lambda$53;
            String AddMosqueEventDialog$lambda$56 = AddMosqueEventDialog$lambda$56($description$delegate);
            if (StringsKt.isBlank(AddMosqueEventDialog$lambda$56)) {
                AddMosqueEventDialog$lambda$56 = "Community program";
            }
            $onSubmit.invoke(AddMosqueEventDialog$lambda$41, AddMosqueEventDialog$lambda$44, AddMosqueEventDialog$lambda$47, str, str2, AddMosqueEventDialog$lambda$56, AddMosqueEventDialog$lambda$59($selectedType$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AddMosqueEventDialog$lambda$67(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C447@15411L64:MosqueEventsScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1777013421, $changed, -1, "com.example.ui.screens.AddMosqueEventDialog.<anonymous> (MosqueEventsScreen.kt:447)");
            }
            ButtonKt.TextButton($onDismiss, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$MosqueEventsScreenKt.INSTANCE.m57getLambda$512922506$app(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
