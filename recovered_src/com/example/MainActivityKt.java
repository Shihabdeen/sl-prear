package com.example;

import android.content.Context;
import android.os.Build;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DarkModeKt;
import androidx.compose.material.icons.filled.LightModeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarItemColors;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.data.model.UserProfile;
import com.example.data.model.UserRole;
import com.example.ui.screens.PhoneLoginDialogKt;
import com.example.ui.theme.ColorKt;
import com.example.ui.theme.ThemeMode;
import com.example.ui.viewmodel.AppTab;
import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"MainScreenContainer", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;I)V", "app", "selectedTab", "Lcom/example/ui/viewmodel/AppTab;", "themeMode", "Lcom/example/ui/theme/ThemeMode;", "feedbackMessage", "", "currentUser", "Lcom/example/data/model/UserProfile;", "showTopLoginDialog", ""}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/example/MainActivityKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,366:1\n77#2:367\n1225#3,6:368\n1225#3,6:374\n1225#3,6:380\n1225#3,6:386\n1225#3,6:444\n1225#3,6:451\n1225#3,6:457\n1225#3,6:463\n1225#3,6:469\n1225#3,6:475\n1225#3,6:481\n1225#3,6:487\n1225#3,6:535\n81#4:392\n81#4:393\n81#4:394\n81#4:395\n81#4:396\n107#4,2:397\n148#5:399\n148#5:436\n148#5:437\n148#5:442\n148#5:443\n148#5:450\n148#5:493\n148#5:494\n148#5:495\n148#5:496\n148#5:497\n148#5:498\n148#5:541\n98#6:400\n95#6,6:401\n101#6:435\n105#6:441\n78#7,6:407\n85#7,4:422\n89#7,2:432\n93#7:440\n78#7,6:506\n85#7,4:521\n89#7,2:531\n93#7:544\n368#8,9:413\n377#8:434\n378#8,2:438\n368#8,9:512\n377#8:533\n378#8,2:542\n4032#9,6:426\n4032#9,6:525\n71#10:499\n68#10,6:500\n74#10:534\n78#10:545\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/example/MainActivityKt\n*L\n113#1:367\n119#1:368,6\n125#1:374,6\n131#1:380,6\n362#1:386,6\n177#1:444,6\n204#1:451,6\n233#1:457,6\n246#1:463,6\n259#1:469,6\n272#1:475,6\n285#1:481,6\n298#1:487,6\n319#1:535,6\n114#1:392\n115#1:393\n116#1:394\n117#1:395\n119#1:396\n119#1:397,2\n181#1:399\n188#1:436\n190#1:437\n170#1:442\n173#1:443\n200#1:450\n229#1:493\n351#1:494\n340#1:495\n342#1:496\n343#1:497\n344#1:498\n336#1:541\n180#1:400\n180#1:401,6\n180#1:435\n180#1:441\n180#1:407,6\n180#1:422,4\n180#1:432,2\n180#1:440\n311#1:506,6\n311#1:521,4\n311#1:531,2\n311#1:544\n180#1:413,9\n180#1:434\n180#1:438,2\n311#1:512,9\n311#1:533\n311#1:542,2\n180#1:426,6\n311#1:525,6\n311#1:499\n311#1:500,6\n311#1:534\n311#1:545\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/MainActivityKt.dex */
public final class MainActivityKt {

    /* compiled from: MainActivity.kt */
    @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/MainActivityKt$WhenMappings.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ThemeMode.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppTab.values().length];
            try {
                iArr2[AppTab.PRAYER.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[AppTab.QIBLA.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[AppTab.DUA.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr2[AppTab.CHAT.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr2[AppTab.MOSQUES.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr2[AppTab.QURAN.ordinal()] = 6;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[AppTab.SETTINGS.ordinal()] = 7;
            } catch (NoSuchFieldError e10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$42(MainViewModel mainViewModel, int i, Composer composer, int i2) {
        MainScreenContainer(mainViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MainScreenContainer(@NotNull final MainViewModel viewModel, @Nullable Composer $composer, final int $changed) {
        int $dirty;
        Object obj;
        Object obj2;
        Object obj3;
        MainActivityKt$MainScreenContainer$1$1 mainActivityKt$MainScreenContainer$1$1;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer2 = $composer.startRestartGroup(-752588604);
        ComposerKt.sourceInformation($composer2, "C(MainScreenContainer)112@4751L7,113@4802L16,114@4858L16,115@4930L16,116@4990L16,118@5036L34,143@5855L11,144@5881L3332,225@9231L3751,309@12987L1678,141@5767L8898:MainActivity.kt#to5c3");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($dirty2 & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-752588604, $dirty2, -1, "com.example.MainScreenContainer (MainActivity.kt:111)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context = (Context) consume;
            final State selectedTab$delegate = SnapshotStateKt.collectAsState(viewModel.getSelectedTab(), (CoroutineContext) null, $composer2, 0, 1);
            final State themeMode$delegate = SnapshotStateKt.collectAsState(viewModel.getThemeMode(), (CoroutineContext) null, $composer2, 0, 1);
            final State feedbackMessage$delegate = SnapshotStateKt.collectAsState(viewModel.getUserFeedbackMessage(), (CoroutineContext) null, $composer2, 0, 1);
            final State currentUser$delegate = SnapshotStateKt.collectAsState(viewModel.getCurrentUser(), (CoroutineContext) null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -1683128378, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                $dirty = $dirty2;
                obj = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer2.updateRememberedValue(obj);
            } else {
                $dirty = $dirty2;
                obj = rememberedValue;
            }
            final MutableState showTopLoginDialog$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (Build.VERSION.SDK_INT >= 33) {
                $composer2.startReplaceGroup(-637192116);
                ComposerKt.sourceInformation($composer2, "124@5334L114,122@5232L216,130@5500L259,130@5479L280");
                ActivityResultContract requestPermission = new ActivityResultContracts.RequestPermission();
                ComposerKt.sourceInformationMarkerStart($composer2, -1683118762, "CC(remember):MainActivity.kt#9igjgp");
                boolean changedInstance = $composer2.changedInstance(viewModel);
                Object rememberedValue2 = $composer2.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                    obj3 = new Function1() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda6
                        public final Object invoke(Object obj4) {
                            return MainActivityKt.MainScreenContainer$lambda$8$lambda$7(MainViewModel.this, ((Boolean) obj4).booleanValue());
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                } else {
                    obj3 = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ManagedActivityResultLauncher permissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) obj3, $composer2, 0);
                Unit unit = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer2, -1683113305, "CC(remember):MainActivity.kt#9igjgp");
                boolean changedInstance2 = $composer2.changedInstance(context) | $composer2.changedInstance(permissionLauncher);
                Object rememberedValue3 = $composer2.rememberedValue();
                if (!changedInstance2 && rememberedValue3 != Composer.Companion.getEmpty()) {
                    mainActivityKt$MainScreenContainer$1$1 = rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    EffectsKt.LaunchedEffect(unit, (Function2) mainActivityKt$MainScreenContainer$1$1, $composer2, 6);
                    $composer2.endReplaceGroup();
                }
                mainActivityKt$MainScreenContainer$1$1 = new MainActivityKt$MainScreenContainer$1$1(context, permissionLauncher, null);
                $composer2.updateRememberedValue(mainActivityKt$MainScreenContainer$1$1);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                EffectsKt.LaunchedEffect(unit, (Function2) mainActivityKt$MainScreenContainer$1$1, $composer2, 6);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-642369922);
                $composer2.endReplaceGroup();
            }
            ScaffoldKt.Scaffold-TvnljyQ(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), ComposableLambdaKt.rememberComposableLambda(-1845938552, true, new Function2() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj4, Object obj5) {
                    return MainActivityKt.MainScreenContainer$lambda$18(themeMode$delegate, viewModel, currentUser$delegate, showTopLoginDialog$delegate, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1170245943, true, new Function2() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda8
                public final Object invoke(Object obj4, Object obj5) {
                    return MainActivityKt.MainScreenContainer$lambda$32(MainViewModel.this, selectedTab$delegate, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), (Function2) null, (Function2) null, 0, 0L, 0L, WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, $composer2, 6), ComposableLambdaKt.rememberComposableLambda(342273555, true, new Function3() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return MainActivityKt.MainScreenContainer$lambda$39(MainViewModel.this, selectedTab$delegate, feedbackMessage$delegate, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306806, 248);
            if (MainScreenContainer$lambda$5(showTopLoginDialog$delegate)) {
                $composer2.startReplaceGroup(-627790033);
                ComposerKt.sourceInformation($composer2, "361@14764L30,359@14699L101");
                ComposerKt.sourceInformationMarkerStart($composer2, -1682817086, "CC(remember):MainActivity.kt#9igjgp");
                Object rememberedValue4 = $composer2.rememberedValue();
                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                    obj2 = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda10
                        public final Object invoke() {
                            return MainActivityKt.MainScreenContainer$lambda$41$lambda$40(showTopLoginDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                PhoneLoginDialogKt.PhoneLoginDialog(viewModel, (Function0) obj2, $composer2, ($dirty & 14) | 48);
            } else {
                $composer2.startReplaceGroup(-642369922);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda11
                public final Object invoke(Object obj4, Object obj5) {
                    return MainActivityKt.MainScreenContainer$lambda$42(MainViewModel.this, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final AppTab MainScreenContainer$lambda$0(State<? extends AppTab> state) {
        return (AppTab) state.getValue();
    }

    private static final ThemeMode MainScreenContainer$lambda$1(State<? extends ThemeMode> state) {
        return (ThemeMode) state.getValue();
    }

    private static final String MainScreenContainer$lambda$2(State<String> state) {
        return (String) state.getValue();
    }

    private static final UserProfile MainScreenContainer$lambda$3(State<UserProfile> state) {
        return (UserProfile) state.getValue();
    }

    private static final boolean MainScreenContainer$lambda$5(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void MainScreenContainer$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$8$lambda$7(MainViewModel $viewModel, boolean isGranted) {
        if (isGranted) {
            $viewModel.showFeedback("Prayer notifications enabled");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MainScreenContainer$lambda$18(final State $themeMode$delegate, final MainViewModel $viewModel, final State $currentUser$delegate, final MutableState $showTopLoginDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C166@6669L2390,221@9167L11,220@9096L103,145@5889L3318:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1845938552, $changed, -1, "com.example.MainScreenContainer.<anonymous> (MainActivity.kt:145)");
            }
            AppBarKt.CenterAlignedTopAppBar-GHTll3U(ComposableSingletons$MainActivityKt.INSTANCE.m0getLambda$1103825619$app(), (Modifier) null, (Function2) null, ComposableLambdaKt.rememberComposableLambda(-771318120, true, new Function3() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainActivityKt.MainScreenContainer$lambda$18$lambda$17($themeMode$delegate, $viewModel, $currentUser$delegate, $showTopLoginDialog$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, (WindowInsets) null, TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors-zjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground-0d7_KjU(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), (TopAppBarScrollBehavior) null, $composer, 3078, 182);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MainScreenContainer$lambda$18$lambda$17(final State $themeMode$delegate, final MainViewModel $viewModel, final State $currentUser$delegate, final MutableState $showTopLoginDialog$delegate, RowScope $this$CenterAlignedTopAppBar, Composer $composer, int $changed) {
        long j;
        long j2;
        Shape shape;
        long j3;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter($this$CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation($composer, "C176@7190L29,178@7272L1024,168@6727L1569,199@8308L39,203@8425L279,212@8780L269,202@8391L658:MainActivity.kt#to5c3");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-771318120, $changed, -1, "com.example.MainScreenContainer.<anonymous>.<anonymous> (MainActivity.kt:168)");
            }
            Shape shape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12));
            UserProfile MainScreenContainer$lambda$3 = MainScreenContainer$lambda$3($currentUser$delegate);
            if ((MainScreenContainer$lambda$3 != null ? MainScreenContainer$lambda$3.getRole() : null) == UserRole.ADMIN) {
                $composer.startReplaceGroup(1792634890);
                $composer.endReplaceGroup();
                j = Color.copy-wmQWz5c$default(ColorKt.getIslamicGold(), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            } else {
                $composer.startReplaceGroup(1792636486);
                ComposerKt.sourceInformation($composer, "170@6894L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU();
                $composer.endReplaceGroup();
            }
            float f = Dp.constructor-impl(1);
            UserProfile MainScreenContainer$lambda$32 = MainScreenContainer$lambda$3($currentUser$delegate);
            if ((MainScreenContainer$lambda$32 != null ? MainScreenContainer$lambda$32.getRole() : null) == UserRole.ADMIN) {
                $composer.startReplaceGroup(1792641411);
                $composer.endReplaceGroup();
                j2 = ColorKt.getIslamicGold();
            } else {
                $composer.startReplaceGroup(1792642790);
                ComposerKt.sourceInformation($composer, "173@7091L11");
                j2 = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU();
                $composer.endReplaceGroup();
            }
            BorderStroke borderStroke = BorderStrokeKt.BorderStroke-cXLIe8U(f, j2);
            Modifier modifier = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart($composer, 1792645589, "CC(remember):MainActivity.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                shape = shape2;
                j3 = j;
                obj = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda1
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$18$lambda$17$lambda$11$lambda$10($showTopLoginDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                shape = shape2;
                j3 = j;
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SurfaceKt.Surface-T9BRK9s(TestTagKt.testTag(ClickableKt.clickable-XHw0xAI$default(modifier, false, (String) null, (Role) null, (Function0) obj, 7, (Object) null), "top_auth_pill"), shape, j3, 0L, 0.0f, 0.0f, borderStroke, ComposableLambdaKt.rememberComposableLambda(1922104541, true, new Function2() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj3, Object obj4) {
                    return MainActivityKt.MainScreenContainer$lambda$18$lambda$17$lambda$13($currentUser$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 12582912, 56);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, 1792685359, "CC(remember):MainActivity.kt#9igjgp");
            boolean changed = $composer.changed($themeMode$delegate) | $composer.changedInstance($viewModel);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda3
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$18$lambda$17$lambda$15$lambda$14(MainViewModel.this, $themeMode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) obj2, TestTagKt.testTag(Modifier.Companion, "quick_theme_toggle"), false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-880501541, true, new Function2() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj3, Object obj4) {
                    return MainActivityKt.MainScreenContainer$lambda$18$lambda$17$lambda$16($themeMode$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$18$lambda$17$lambda$11$lambda$10(MutableState $showTopLoginDialog$delegate) {
        MainScreenContainer$lambda$6($showTopLoginDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MainScreenContainer$lambda$18$lambda$17$lambda$13(androidx.compose.runtime.State r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.MainActivityKt.MainScreenContainer$lambda$18$lambda$17$lambda$13(androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$18$lambda$17$lambda$15$lambda$14(MainViewModel $viewModel, State $themeMode$delegate) {
        ThemeMode nextMode;
        switch (WhenMappings.$EnumSwitchMapping$0[MainScreenContainer$lambda$1($themeMode$delegate).ordinal()]) {
            case 1:
                nextMode = ThemeMode.DARK;
                break;
            case BuildConfig.VERSION_CODE /* 2 */:
                nextMode = ThemeMode.SYSTEM;
                break;
            case 3:
                nextMode = ThemeMode.LIGHT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        $viewModel.setThemeMode(nextMode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MainScreenContainer$lambda$18$lambda$17$lambda$16(State $themeMode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C216@9004L11,213@8794L243:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-880501541, $changed, -1, "com.example.MainScreenContainer.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:213)");
            }
            IconKt.Icon-ww6aTOc(MainScreenContainer$lambda$1($themeMode$delegate) == ThemeMode.DARK ? LightModeKt.getLightMode(Icons.INSTANCE.getDefault()) : DarkModeKt.getDarkMode(Icons.INSTANCE.getDefault()), "Toggle Dark Mode", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MainScreenContainer$lambda$32(final MainViewModel $viewModel, final State $selectedTab$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C227@9293L11,229@9352L3624,226@9239L3737:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170245943, $changed, -1, "com.example.MainScreenContainer.<anonymous> (MainActivity.kt:226)");
            }
            NavigationBarKt.NavigationBar-HsRjFd4((Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, Dp.constructor-impl(4), (WindowInsets) null, ComposableLambdaKt.rememberComposableLambda(-935733648, true, new Function3() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda20
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MainActivityKt.MainScreenContainer$lambda$32$lambda$31(MainViewModel.this, $selectedTab$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 199680, 21);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MainScreenContainer$lambda$32$lambda$31(final MainViewModel $viewModel, State $selectedTab$delegate, RowScope $this$NavigationBar, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Intrinsics.checkNotNullParameter($this$NavigationBar, "$this$NavigationBar");
        ComposerKt.sourceInformation($composer, "C237@9769L11,238@9845L11,239@9912L11,236@9718L225,232@9452L38,230@9362L591,250@10366L11,251@10442L11,252@10509L11,249@10315L225,245@10052L37,243@9963L587,263@10959L11,264@11035L11,265@11102L11,262@10908L225,258@10647L35,256@10560L583,276@11552L11,277@11628L11,278@11695L11,275@11501L225,271@11242L37,269@11153L583,289@12147L11,290@12223L11,291@12290L11,288@12096L225,284@11834L36,282@11746L585,302@12784L11,303@12860L11,304@12927L11,301@12733L225,297@12466L40,295@12341L627:MainActivity.kt#to5c3");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed($this$NavigationBar) ? 4 : 2;
        }
        if (($dirty & 19) == 18 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-935733648, $dirty, -1, "com.example.MainScreenContainer.<anonymous>.<anonymous> (MainActivity.kt:230)");
            }
            boolean z = true;
            boolean z2 = MainScreenContainer$lambda$0($selectedTab$delegate) == AppTab.PRAYER;
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "nav_prayer");
            int $dirty2 = $dirty;
            NavigationBarItemColors navigationBarItemColors = NavigationBarItemDefaults.INSTANCE.colors-69fazGs(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, 0L, $composer, NavigationBarItemDefaults.$stable << 21, 120);
            ComposerKt.sourceInformationMarkerStart($composer, -1591867626, "CC(remember):MainActivity.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($viewModel);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda14
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$32$lambda$31$lambda$20$lambda$19(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationBarKt.NavigationBarItem($this$NavigationBar, z2, (Function0) obj, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$959863253$app(), testTag, false, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1798731058$app(), false, navigationBarItemColors, (MutableInteractionSource) null, $composer, ($dirty2 & 14) | 1600512, 336);
            boolean z3 = MainScreenContainer$lambda$0($selectedTab$delegate) == AppTab.QIBLA;
            Modifier testTag2 = TestTagKt.testTag(Modifier.Companion, "nav_qibla");
            NavigationBarItemColors navigationBarItemColors2 = NavigationBarItemDefaults.INSTANCE.colors-69fazGs(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, 0L, $composer, NavigationBarItemDefaults.$stable << 21, 120);
            ComposerKt.sourceInformationMarkerStart($composer, -1591848427, "CC(remember):MainActivity.kt#9igjgp");
            boolean changedInstance2 = $composer.changedInstance($viewModel);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda15
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$32$lambda$31$lambda$22$lambda$21(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationBarKt.NavigationBarItem($this$NavigationBar, z3, (Function0) obj2, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$495286348$app(), testTag2, false, ComposableSingletons$MainActivityKt.INSTANCE.m7getLambda$806604695$app(), false, navigationBarItemColors2, (MutableInteractionSource) null, $composer, ($dirty2 & 14) | 1600512, 336);
            boolean z4 = MainScreenContainer$lambda$0($selectedTab$delegate) == AppTab.DUA;
            Modifier testTag3 = TestTagKt.testTag(Modifier.Companion, "nav_duas");
            NavigationBarItemColors navigationBarItemColors3 = NavigationBarItemDefaults.INSTANCE.colors-69fazGs(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, 0L, $composer, NavigationBarItemDefaults.$stable << 21, 120);
            ComposerKt.sourceInformationMarkerStart($composer, -1591829389, "CC(remember):MainActivity.kt#9igjgp");
            boolean changedInstance3 = $composer.changedInstance($viewModel);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda16
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$32$lambda$31$lambda$24$lambda$23(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationBarKt.NavigationBarItem($this$NavigationBar, z4, (Function0) obj3, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$87262733$app(), testTag3, false, ComposableSingletons$MainActivityKt.INSTANCE.m2getLambda$1214628310$app(), false, navigationBarItemColors3, (MutableInteractionSource) null, $composer, ($dirty2 & 14) | 1600512, 336);
            boolean z5 = MainScreenContainer$lambda$0($selectedTab$delegate) == AppTab.QURAN;
            Modifier testTag4 = TestTagKt.testTag(Modifier.Companion, "nav_quran");
            NavigationBarItemColors navigationBarItemColors4 = NavigationBarItemDefaults.INSTANCE.colors-69fazGs(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, 0L, $composer, NavigationBarItemDefaults.$stable << 21, 120);
            ComposerKt.sourceInformationMarkerStart($composer, -1591810347, "CC(remember):MainActivity.kt#9igjgp");
            boolean changedInstance4 = $composer.changedInstance($viewModel);
            Object rememberedValue4 = $composer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                obj4 = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda17
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$32$lambda$31$lambda$26$lambda$25(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationBarKt.NavigationBarItem($this$NavigationBar, z5, (Function0) obj4, ComposableSingletons$MainActivityKt.INSTANCE.m5getLambda$320760882$app(), testTag4, false, ComposableSingletons$MainActivityKt.INSTANCE.m3getLambda$1622651925$app(), false, navigationBarItemColors4, (MutableInteractionSource) null, $composer, ($dirty2 & 14) | 1600512, 336);
            boolean z6 = MainScreenContainer$lambda$0($selectedTab$delegate) == AppTab.CHAT;
            Modifier testTag5 = TestTagKt.testTag(Modifier.Companion, "nav_chat");
            NavigationBarItemColors navigationBarItemColors5 = NavigationBarItemDefaults.INSTANCE.colors-69fazGs(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, 0L, $composer, NavigationBarItemDefaults.$stable << 21, 120);
            ComposerKt.sourceInformationMarkerStart($composer, -1591791404, "CC(remember):MainActivity.kt#9igjgp");
            boolean changedInstance5 = $composer.changedInstance($viewModel);
            Object rememberedValue5 = $composer.rememberedValue();
            if (changedInstance5 || rememberedValue5 == Composer.Companion.getEmpty()) {
                obj5 = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda18
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$32$lambda$31$lambda$28$lambda$27(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationBarKt.NavigationBarItem($this$NavigationBar, z6, (Function0) obj5, ComposableSingletons$MainActivityKt.INSTANCE.m6getLambda$728784497$app(), testTag5, false, ComposableSingletons$MainActivityKt.INSTANCE.m4getLambda$2030675540$app(), false, navigationBarItemColors5, (MutableInteractionSource) null, $composer, ($dirty2 & 14) | 1600512, 336);
            if (MainScreenContainer$lambda$0($selectedTab$delegate) != AppTab.SETTINGS && MainScreenContainer$lambda$0($selectedTab$delegate) != AppTab.MOSQUES) {
                z = false;
            }
            Modifier testTag6 = TestTagKt.testTag(Modifier.Companion, "nav_alerts");
            NavigationBarItemColors navigationBarItemColors6 = NavigationBarItemDefaults.INSTANCE.colors-69fazGs(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, 0L, $composer, NavigationBarItemDefaults.$stable << 21, 120);
            ComposerKt.sourceInformationMarkerStart($composer, -1591771176, "CC(remember):MainActivity.kt#9igjgp");
            boolean changedInstance6 = $composer.changedInstance($viewModel);
            Object rememberedValue6 = $composer.rememberedValue();
            if (changedInstance6 || rememberedValue6 == Composer.Companion.getEmpty()) {
                obj6 = new Function0() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda19
                    public final Object invoke() {
                        return MainActivityKt.MainScreenContainer$lambda$32$lambda$31$lambda$30$lambda$29(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            NavigationBarKt.NavigationBarItem($this$NavigationBar, z, (Function0) obj6, ComposableSingletons$MainActivityKt.INSTANCE.m1getLambda$1136808112$app(), testTag6, false, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1856268141$app(), false, navigationBarItemColors6, (MutableInteractionSource) null, $composer, ($dirty2 & 14) | 1600512, 336);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$32$lambda$31$lambda$20$lambda$19(MainViewModel $viewModel) {
        $viewModel.selectTab(AppTab.PRAYER);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$32$lambda$31$lambda$22$lambda$21(MainViewModel $viewModel) {
        $viewModel.selectTab(AppTab.QIBLA);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$32$lambda$31$lambda$24$lambda$23(MainViewModel $viewModel) {
        $viewModel.selectTab(AppTab.DUA);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$32$lambda$31$lambda$26$lambda$25(MainViewModel $viewModel) {
        $viewModel.selectTab(AppTab.QURAN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$32$lambda$31$lambda$28$lambda$27(MainViewModel $viewModel) {
        $viewModel.selectTab(AppTab.CHAT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$32$lambda$31$lambda$30$lambda$29(MainViewModel $viewModel) {
        $viewModel.selectTab(AppTab.SETTINGS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0222  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MainScreenContainer$lambda$39(final com.example.ui.viewmodel.MainViewModel r40, androidx.compose.runtime.State r41, final androidx.compose.runtime.State r42, androidx.compose.foundation.layout.PaddingValues r43, androidx.compose.runtime.Composer r44, int r45) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.MainActivityKt.MainScreenContainer$lambda$39(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$39$lambda$38$lambda$34$lambda$33(MainViewModel $viewModel, AppTab it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.selectTab(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MainScreenContainer$lambda$39$lambda$38$lambda$37(State $feedbackMessage$delegate, AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C:MainActivity.kt#to5c3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956069109, $changed, -1, "com.example.MainScreenContainer.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:337)");
        }
        final String MainScreenContainer$lambda$2 = MainScreenContainer$lambda$2($feedbackMessage$delegate);
        if (MainScreenContainer$lambda$2 == null) {
            $composer.startReplaceGroup(-861398478);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(-861398477);
            ComposerKt.sourceInformation($composer, "*340@14094L11,343@14275L11,344@14315L322,338@14004L633");
            SurfaceKt.Surface-T9BRK9s((Modifier) null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, Dp.constructor-impl(6), Dp.constructor-impl(6), BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU()), ComposableLambdaKt.rememberComposableLambda(1880038478, true, new Function2() { // from class: com.example.MainActivityKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivityKt.MainScreenContainer$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(MainScreenContainer$lambda$2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12804096, 9);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MainScreenContainer$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(String $msg, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C347@14397L10,349@14502L11,345@14329L296:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1880038478, $changed, -1, "com.example.MainScreenContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:345)");
            }
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium();
            TextKt.Text--4IGK_g($msg, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(16), Dp.constructor-impl(10)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, bodyMedium, $composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainScreenContainer$lambda$41$lambda$40(MutableState $showTopLoginDialog$delegate) {
        MainScreenContainer$lambda$6($showTopLoginDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
