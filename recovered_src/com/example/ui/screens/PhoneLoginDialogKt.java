package com.example.ui.screens;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BadgeKt;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material.icons.filled.VisibilityOffKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.DialogProperties;
import com.example.BuildConfig;
import com.example.data.model.UserRole;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.MainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhoneLoginDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002"}, d2 = {"PhoneLoginDialog", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onDismiss", "Lkotlin/Function0;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "phoneNumber", "", "fullName", "selectedRole", "Lcom/example/data/model/UserRole;", "adminPin", "passwordVisible", "", "adminDesignation", "mosqueName", "errorMessage"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPhoneLoginDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneLoginDialog.kt\ncom/example/ui/screens/PhoneLoginDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,395:1\n1225#2,6:396\n1225#2,6:402\n1225#2,6:408\n1225#2,6:414\n1225#2,6:420\n1225#2,6:426\n1225#2,6:432\n1225#2,6:438\n1225#2,6:469\n1225#2,6:731\n1225#2,6:817\n1225#2,6:824\n1225#2,6:831\n1225#2,6:922\n1225#2,6:965\n1225#2,6:974\n1225#2,6:987\n1225#2,6:994\n81#3:444\n107#3,2:445\n81#3:447\n107#3,2:448\n81#3:450\n107#3,2:451\n81#3:453\n107#3,2:454\n81#3:456\n107#3,2:457\n81#3:459\n107#3,2:460\n81#3:462\n107#3,2:463\n81#3:465\n107#3,2:466\n148#4:468\n148#4:475\n148#4:549\n148#4:550\n148#4:555\n148#4:560\n148#4:634\n148#4:635\n148#4:640\n148#4:647\n148#4:684\n148#4:685\n148#4:690\n148#4:737\n148#4:810\n148#4:811\n148#4:816\n148#4:823\n148#4:830\n148#4:841\n148#4:878\n148#4:879\n148#4:884\n148#4:920\n158#4:921\n148#4:928\n148#4:964\n148#4:971\n148#4:972\n148#4:973\n148#4:980\n148#4:981\n148#4:986\n148#4:993\n148#4:1000\n148#4:1001\n148#4:1002\n85#5:476\n82#5,6:477\n88#5:511\n92#5:559\n85#5:561\n82#5,6:562\n88#5:596\n92#5:644\n85#5:738\n83#5,5:739\n88#5:772\n92#5:840\n85#5:885\n83#5,5:886\n88#5:919\n92#5:1006\n78#6,6:483\n85#6,4:498\n89#6,2:508\n78#6,6:520\n85#6,4:535\n89#6,2:545\n93#6:553\n93#6:558\n78#6,6:568\n85#6,4:583\n89#6,2:593\n78#6,6:605\n85#6,4:620\n89#6,2:630\n93#6:638\n93#6:643\n78#6,6:655\n85#6,4:670\n89#6,2:680\n93#6:688\n78#6,6:698\n85#6,4:713\n89#6,2:723\n93#6:729\n78#6,6:744\n85#6,4:759\n89#6,2:769\n78#6,6:781\n85#6,4:796\n89#6,2:806\n93#6:814\n93#6:839\n78#6,6:849\n85#6,4:864\n89#6,2:874\n93#6:882\n78#6,6:891\n85#6,4:906\n89#6,2:916\n78#6,6:935\n85#6,4:950\n89#6,2:960\n93#6:984\n93#6:1005\n368#7,9:489\n377#7:510\n368#7,9:526\n377#7:547\n378#7,2:551\n378#7,2:556\n368#7,9:574\n377#7:595\n368#7,9:611\n377#7:632\n378#7,2:636\n378#7,2:641\n368#7,9:661\n377#7:682\n378#7,2:686\n368#7,9:704\n377#7:725\n378#7,2:727\n368#7,9:750\n377#7:771\n368#7,9:787\n377#7:808\n378#7,2:812\n378#7,2:837\n368#7,9:855\n377#7:876\n378#7,2:880\n368#7,9:897\n377#7:918\n368#7,9:941\n377#7:962\n378#7,2:982\n378#7,2:1003\n4032#8,6:502\n4032#8,6:539\n4032#8,6:587\n4032#8,6:624\n4032#8,6:674\n4032#8,6:717\n4032#8,6:763\n4032#8,6:800\n4032#8,6:868\n4032#8,6:910\n4032#8,6:954\n98#9:512\n94#9,7:513\n101#9:548\n105#9:554\n98#9:597\n94#9,7:598\n101#9:633\n105#9:639\n98#9:648\n95#9,6:649\n101#9:683\n105#9:689\n98#9:691\n95#9,6:692\n101#9:726\n105#9:730\n98#9:773\n94#9,7:774\n101#9:809\n105#9:815\n98#9:842\n95#9,6:843\n101#9:877\n105#9:883\n98#9:929\n96#9,5:930\n101#9:963\n105#9:985\n1088#10,2:645\n*S KotlinDebug\n*F\n+ 1 PhoneLoginDialog.kt\ncom/example/ui/screens/PhoneLoginDialogKt\n*L\n69#1:396,6\n70#1:402,6\n71#1:408,6\n72#1:414,6\n73#1:420,6\n74#1:426,6\n75#1:432,6\n76#1:438,6\n368#1:469,6\n303#1:731,6\n298#1:817,6\n321#1:824,6\n331#1:831,6\n124#1:922,6\n167#1:965,6\n199#1:974,6\n230#1:987,6\n263#1:994,6\n69#1:444\n69#1:445,2\n70#1:447\n70#1:448,2\n71#1:450\n71#1:451,2\n72#1:453\n72#1:454,2\n73#1:456\n73#1:457,2\n74#1:459\n74#1:460,2\n75#1:462\n75#1:463,2\n76#1:465\n76#1:466,2\n381#1:468\n178#1:475\n184#1:549\n186#1:550\n189#1:555\n210#1:560\n216#1:634\n218#1:635\n221#1:640\n237#1:647\n239#1:684\n240#1:685\n246#1:690\n284#1:737\n286#1:810\n287#1:811\n316#1:816\n326#1:823\n336#1:830\n351#1:841\n354#1:878\n355#1:879\n115#1:884\n119#1:920\n121#1:921\n160#1:928\n166#1:964\n169#1:971\n171#1:972\n198#1:973\n201#1:980\n203#1:981\n257#1:986\n273#1:993\n280#1:1000\n282#1:1001\n345#1:1002\n178#1:476\n178#1:477,6\n178#1:511\n178#1:559\n210#1:561\n210#1:562,6\n210#1:596\n210#1:644\n284#1:738\n284#1:739,5\n284#1:772\n284#1:840\n111#1:885\n111#1:886,5\n111#1:919\n111#1:1006\n178#1:483,6\n178#1:498,4\n178#1:508,2\n179#1:520,6\n179#1:535,4\n179#1:545,2\n179#1:553\n178#1:558\n210#1:568,6\n210#1:583,4\n210#1:593,2\n211#1:605,6\n211#1:620,4\n211#1:630,2\n211#1:638\n210#1:643\n235#1:655,6\n235#1:670,4\n235#1:680,2\n235#1:688\n244#1:698,6\n244#1:713,4\n244#1:723,2\n244#1:729\n284#1:744,6\n284#1:759,4\n284#1:769,2\n285#1:781,6\n285#1:796,4\n285#1:806,2\n285#1:814\n284#1:839\n348#1:849,6\n348#1:864,4\n348#1:874,2\n348#1:882\n111#1:891,6\n111#1:906,4\n111#1:916,2\n158#1:935,6\n158#1:950,4\n158#1:960,2\n158#1:984\n111#1:1005\n178#1:489,9\n178#1:510\n179#1:526,9\n179#1:547\n179#1:551,2\n178#1:556,2\n210#1:574,9\n210#1:595\n211#1:611,9\n211#1:632\n211#1:636,2\n210#1:641,2\n235#1:661,9\n235#1:682\n235#1:686,2\n244#1:704,9\n244#1:725\n244#1:727,2\n284#1:750,9\n284#1:771\n285#1:787,9\n285#1:808\n285#1:812,2\n284#1:837,2\n348#1:855,9\n348#1:876\n348#1:880,2\n111#1:897,9\n111#1:918\n158#1:941,9\n158#1:962\n158#1:982,2\n111#1:1003,2\n178#1:502,6\n179#1:539,6\n210#1:587,6\n211#1:624,6\n235#1:674,6\n244#1:717,6\n284#1:763,6\n285#1:800,6\n348#1:868,6\n111#1:910,6\n158#1:954,6\n179#1:512\n179#1:513,7\n179#1:548\n179#1:554\n211#1:597\n211#1:598,7\n211#1:633\n211#1:639\n235#1:648\n235#1:649,6\n235#1:683\n235#1:689\n244#1:691\n244#1:692,6\n244#1:726\n244#1:730\n285#1:773\n285#1:774,7\n285#1:809\n285#1:815\n348#1:842\n348#1:843,6\n348#1:877\n348#1:883\n158#1:929\n158#1:930,5\n158#1:963\n158#1:985\n234#1:645,2\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/PhoneLoginDialogKt.dex */
public final class PhoneLoginDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$73(MainViewModel mainViewModel, Function0 function0, int i, Composer composer, int i2) {
        PhoneLoginDialog(mainViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PhoneLoginDialog(@NotNull final MainViewModel viewModel, @NotNull final Function0<Unit> function0, @Nullable Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        MutableState selectedRole$delegate;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Composer $composer2;
        final Function0<Unit> function02 = function0;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(function02, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(487163185);
        ComposerKt.sourceInformation($composer3, "C(PhoneLoginDialog)P(1)68@3014L31,69@3064L31,70@3118L44,71@3181L31,72@3238L34,73@3299L31,74@3351L31,75@3405L42,365@16055L733,387@16810L78,109@4515L11518,77@3451L13441:PhoneLoginDialog.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(487163185, $dirty2, -1, "com.example.ui.screens.PhoneLoginDialog (PhoneLoginDialog.kt:67)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 12389104, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                obj = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState phoneNumber$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 12390704, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                obj2 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState fullName$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 12392445, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                obj3 = SnapshotStateKt.mutableStateOf$default(UserRole.MEMBER, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            MutableState selectedRole$delegate2 = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 12394448, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                selectedRole$delegate = selectedRole$delegate2;
                obj4 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj4);
            } else {
                selectedRole$delegate = selectedRole$delegate2;
                obj4 = rememberedValue4;
            }
            final MutableState adminPin$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 12396275, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue5 = $composer3.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                obj5 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState passwordVisible$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 12398224, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue6 = $composer3.rememberedValue();
            if (rememberedValue6 == Composer.Companion.getEmpty()) {
                obj6 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableState adminDesignation$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 12399888, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue7 = $composer3.rememberedValue();
            if (rememberedValue7 == Composer.Companion.getEmpty()) {
                obj7 = SnapshotStateKt.mutableStateOf$default("", (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState mosqueName$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 12401627, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue8 = $composer3.rememberedValue();
            if (rememberedValue8 == Composer.Companion.getEmpty()) {
                obj8 = SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableState errorMessage$delegate = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final MutableState fullName$delegate2 = selectedRole$delegate;
            final MutableState phoneNumber$delegate2 = selectedRole$delegate;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.AlertDialog-Oix01E0(function0, ComposableLambdaKt.rememberComposableLambda(1629890025, true, new Function2() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda18
                public final Object invoke(Object obj9, Object obj10) {
                    return PhoneLoginDialogKt.PhoneLoginDialog$lambda$28(MainViewModel.this, function0, errorMessage$delegate, phoneNumber$delegate, fullName$delegate, fullName$delegate2, adminPin$delegate, adminDesignation$delegate, mosqueName$delegate, (Composer) obj9, ((Integer) obj10).intValue());
                }
            }, $composer3, 54), TestTagKt.testTag(Modifier.Companion, "phone_login_dialog"), ComposableLambdaKt.rememberComposableLambda(537254823, true, new Function2() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda19
                public final Object invoke(Object obj9, Object obj10) {
                    return PhoneLoginDialogKt.PhoneLoginDialog$lambda$29(function0, (Composer) obj9, ((Integer) obj10).intValue());
                }
            }, $composer3, 54), (Function2) null, ComposableSingletons$PhoneLoginDialogKt.INSTANCE.m62getLambda$555380379$app(), ComposableLambdaKt.rememberComposableLambda(1045785668, true, new Function2() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda20
                public final Object invoke(Object obj9, Object obj10) {
                    return PhoneLoginDialogKt.PhoneLoginDialog$lambda$72(MainViewModel.this, function0, errorMessage$delegate, phoneNumber$delegate2, phoneNumber$delegate, fullName$delegate, adminPin$delegate, passwordVisible$delegate, adminDesignation$delegate, mosqueName$delegate, (Composer) obj9, ((Integer) obj10).intValue());
                }
            }, $composer3, 54), (Shape) null, 0L, 0L, 0L, 0L, 0.0f, (DialogProperties) null, $composer2, (($dirty2 >> 3) & 14) | 1772976, 0, 16272);
            function02 = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda21
                public final Object invoke(Object obj9, Object obj10) {
                    return PhoneLoginDialogKt.PhoneLoginDialog$lambda$73(MainViewModel.this, function02, $changed, (Composer) obj9, ((Integer) obj10).intValue());
                }
            });
        }
    }

    private static final String PhoneLoginDialog$lambda$1(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String PhoneLoginDialog$lambda$4(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final UserRole PhoneLoginDialog$lambda$7(MutableState<UserRole> mutableState) {
        return (UserRole) ((State) mutableState).getValue();
    }

    private static final String PhoneLoginDialog$lambda$10(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean PhoneLoginDialog$lambda$13(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void PhoneLoginDialog$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String PhoneLoginDialog$lambda$16(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String PhoneLoginDialog$lambda$19(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String PhoneLoginDialog$lambda$22(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PhoneLoginDialog$lambda$72(final com.example.ui.viewmodel.MainViewModel r68, final kotlin.jvm.functions.Function0 r69, final androidx.compose.runtime.MutableState r70, final androidx.compose.runtime.MutableState r71, final androidx.compose.runtime.MutableState r72, final androidx.compose.runtime.MutableState r73, final androidx.compose.runtime.MutableState r74, final androidx.compose.runtime.MutableState r75, final androidx.compose.runtime.MutableState r76, final androidx.compose.runtime.MutableState r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.PhoneLoginDialogKt.PhoneLoginDialog$lambda$72(com.example.ui.viewmodel.MainViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$33$lambda$32(MainViewModel $viewModel, final Function0 $onDismiss, final MutableState $errorMessage$delegate) {
        $viewModel.loginWithPhoneNumber("+94721160032", "Shihab (Mosque Admin)", UserRole.ADMIN, "shihab2415", "Verified Mosque Administrator", "Bogawantalawa Town Jummah Mosque (Hatton & Bogawantalawa)", new Function0() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda2
            public final Object invoke() {
                return PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$33$lambda$32$lambda$30($onDismiss);
            }
        }, new Function1() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$33$lambda$32$lambda$31($errorMessage$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$33$lambda$32$lambda$30(Function0 $onDismiss) {
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$33$lambda$32$lambda$31(MutableState $errorMessage$delegate, String err) {
        Intrinsics.checkNotNullParameter(err, "err");
        $errorMessage$delegate.setValue(err);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$44$lambda$35$lambda$34(MutableState $selectedRole$delegate) {
        $selectedRole$delegate.setValue(UserRole.MEMBER);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$44$lambda$38(androidx.compose.runtime.MutableState r83, androidx.compose.foundation.layout.ColumnScope r84, androidx.compose.runtime.Composer r85, int r86) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$44$lambda$38(androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$44$lambda$40$lambda$39(MutableState $selectedRole$delegate) {
        $selectedRole$delegate.setValue(UserRole.ADMIN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$44$lambda$43(androidx.compose.runtime.MutableState r83, androidx.compose.foundation.layout.ColumnScope r84, androidx.compose.runtime.Composer r85, int r86) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$44$lambda$43(androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$46$lambda$45(MutableState $phoneNumber$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $phoneNumber$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$47(MutableState $selectedRole$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C230@10172L90:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1879761844, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous>.<anonymous>.<anonymous> (PhoneLoginDialog.kt:230)");
            }
            TextKt.Text--4IGK_g(PhoneLoginDialog$lambda$7($selectedRole$delegate) == UserRole.ADMIN ? "Admin ID or Mobile Number" : "Mobile Number", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
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
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$48(MutableState $selectedRole$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C231@10292L87:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-942926859, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous>.<anonymous>.<anonymous> (PhoneLoginDialog.kt:231)");
            }
            TextKt.Text--4IGK_g(PhoneLoginDialog$lambda$7($selectedRole$delegate) == UserRole.ADMIN ? "Enter Admin ID or Phone" : "07X XXX XXXX", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
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
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$52(MutableState $phoneNumber$delegate, Composer $composer, int $changed) {
        boolean z;
        int i;
        int i2;
        int i3;
        ComposerKt.sourceInformation($composer, "C:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(529351734, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous>.<anonymous>.<anonymous> (PhoneLoginDialog.kt:233)");
            }
            CharSequence PhoneLoginDialog$lambda$1 = PhoneLoginDialog$lambda$1($phoneNumber$delegate);
            int i4 = 0;
            while (true) {
                if (i4 >= PhoneLoginDialog$lambda$1.length()) {
                    z = false;
                    break;
                }
                if (Character.isLetter(PhoneLoginDialog$lambda$1.charAt(i4))) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (z) {
                $composer.startReplaceGroup(-1202335953);
                ComposerKt.sourceInformation($composer, "234@10476L447");
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                Modifier modifier = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, Dp.constructor-impl(10), 0.0f, Dp.constructor-impl(4), 0.0f, 10, (Object) null);
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor = ComposeUiNode.Companion.getConstructor();
                int i5 = ((((390 << 3) & 112) << 6) & 896) | 6;
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
                if (composer.getInserting()) {
                    i2 = i5;
                    i3 = currentCompositeKeyHash;
                } else {
                    i2 = i5;
                    i3 = currentCompositeKeyHash;
                    if (Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i3))) {
                        Updater.set-impl(composer, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                        int i6 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScope rowScope = RowScopeInstance.INSTANCE;
                        int i7 = ((390 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -243353011, "C238@10650L105,239@10772L39,240@10828L79:PhoneLoginDialog.kt#2thlc2");
                        IconKt.Icon-ww6aTOc(BadgeKt.getBadge(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), ColorKt.getIslamicGold(), $composer, 3504, 0);
                        SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
                        TextKt.Text--4IGK_g("ID", (Modifier) null, ColorKt.getIslamicGold(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 200070, 0, 131026);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endReplaceGroup();
                    }
                }
                composer.updateRememberedValue(Integer.valueOf(i3));
                composer.apply(Integer.valueOf(i3), setCompositeKeyHash);
                Updater.set-impl(composer, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                int i62 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                int i72 = ((390 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -243353011, "C238@10650L105,239@10772L39,240@10828L79:PhoneLoginDialog.kt#2thlc2");
                IconKt.Icon-ww6aTOc(BadgeKt.getBadge(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), ColorKt.getIslamicGold(), $composer, 3504, 0);
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
                TextKt.Text--4IGK_g("ID", (Modifier) null, ColorKt.getIslamicGold(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 200070, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1201862800);
                ComposerKt.sourceInformation($composer, "243@10959L254");
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, Dp.constructor-impl(10), 0.0f, Dp.constructor-impl(4), 0.0f, 10, (Object) null);
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier2);
                Function0 constructor2 = ComposeUiNode.Companion.getConstructor();
                int i8 = ((((390 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    $composer.createNode(constructor2);
                } else {
                    $composer.useNode();
                }
                Composer composer2 = Updater.constructor-impl($composer);
                Updater.set-impl(composer2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer2.getInserting()) {
                    i = currentCompositeKeyHash2;
                } else {
                    i = currentCompositeKeyHash2;
                    if (Intrinsics.areEqual(composer2.rememberedValue(), Integer.valueOf(i))) {
                        Updater.set-impl(composer2, materializeModifier2, ComposeUiNode.Companion.getSetModifier());
                        int i9 = (i8 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScope rowScope3 = RowScopeInstance.INSTANCE;
                        int i10 = ((390 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 284295557, "C247@11133L64:PhoneLoginDialog.kt#2thlc2");
                        TextKt.Text--4IGK_g("🇱🇰 +94", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endReplaceGroup();
                    }
                }
                composer2.updateRememberedValue(Integer.valueOf(i));
                composer2.apply(Integer.valueOf(i), setCompositeKeyHash2);
                Updater.set-impl(composer2, materializeModifier2, ComposeUiNode.Companion.getSetModifier());
                int i92 = (i8 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScope rowScope32 = RowScopeInstance.INSTANCE;
                int i102 = ((390 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 284295557, "C247@11133L64:PhoneLoginDialog.kt#2thlc2");
                TextKt.Text--4IGK_g("🇱🇰 +94", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199686, 0, 131030);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$54$lambda$53(MutableState $fullName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $fullName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$55(MutableState $selectedRole$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C264@11697L71:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355449634, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous>.<anonymous>.<anonymous> (PhoneLoginDialog.kt:264)");
            }
            TextKt.Text--4IGK_g(PhoneLoginDialog$lambda$7($selectedRole$delegate) == UserRole.ADMIN ? "Admin Name" : "Your Name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01df  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$68(final androidx.compose.runtime.MutableState r86, final androidx.compose.runtime.MutableState r87, final androidx.compose.runtime.MutableState r88, final androidx.compose.runtime.MutableState r89, androidx.compose.runtime.Composer r90, int r91) {
        /*
            Method dump skipped, instructions count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$68(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$58$lambda$57(MutableState $adminPin$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $adminPin$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$62(final MutableState $passwordVisible$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C302@13504L38,302@13544L286,302@13483L347:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-711852667, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneLoginDialog.kt:302)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1190611573, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda22
                    public final Object invoke() {
                        return PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$62$lambda$60$lambda$59($passwordVisible$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) obj, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableLambdaKt.rememberComposableLambda(-841023096, true, new Function2() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda23
                public final Object invoke(Object obj2, Object obj3) {
                    return PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$62$lambda$61($passwordVisible$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$62$lambda$60$lambda$59(MutableState $passwordVisible$delegate) {
        PhoneLoginDialog$lambda$14($passwordVisible$delegate, !PhoneLoginDialog$lambda$13($passwordVisible$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$62$lambda$61(MutableState $passwordVisible$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C303@13566L244:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841023096, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneLoginDialog.kt:303)");
            }
            IconKt.Icon-ww6aTOc(PhoneLoginDialog$lambda$13($passwordVisible$delegate) ? VisibilityOffKt.getVisibilityOff(Icons.INSTANCE.getDefault()) : VisibilityKt.getVisibility(Icons.INSTANCE.getDefault()), PhoneLoginDialog$lambda$13($passwordVisible$delegate) ? "Hide password" : "Show password", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$64$lambda$63(MutableState $adminDesignation$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $adminDesignation$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$68$lambda$67$lambda$66$lambda$65(MutableState $mosqueName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $mosqueName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fa  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PhoneLoginDialog$lambda$72$lambda$71$lambda$70(androidx.compose.runtime.MutableState r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.PhoneLoginDialogKt.PhoneLoginDialog$lambda$72$lambda$71$lambda$70(androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PhoneLoginDialog$lambda$28(final MainViewModel $viewModel, final Function0 $onDismiss, final MutableState $errorMessage$delegate, final MutableState $phoneNumber$delegate, final MutableState $fullName$delegate, final MutableState $selectedRole$delegate, final MutableState $adminPin$delegate, final MutableState $adminDesignation$delegate, final MutableState $mosqueName$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C381@16623L11,381@16579L64,367@16089L413,366@16063L719:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1629890025, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous> (PhoneLoginDialog.kt:366)");
            }
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12));
            ButtonColors buttonColors = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14);
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "submit_phone_login");
            ComposerKt.sourceInformationMarkerStart($composer, -1338747514, "CC(remember):PhoneLoginDialog.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($viewModel) | $composer.changed($onDismiss);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda17
                    public final Object invoke() {
                        return PhoneLoginDialogKt.PhoneLoginDialog$lambda$28$lambda$27$lambda$26(MainViewModel.this, $errorMessage$delegate, $phoneNumber$delegate, $fullName$delegate, $selectedRole$delegate, $adminPin$delegate, $adminDesignation$delegate, $mosqueName$delegate, $onDismiss);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) obj, testTag, false, shape, buttonColors, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$PhoneLoginDialogKt.INSTANCE.getLambda$1926310905$app(), $composer, 805306416, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$28$lambda$27$lambda$26(MainViewModel $viewModel, final MutableState $errorMessage$delegate, MutableState $phoneNumber$delegate, MutableState $fullName$delegate, MutableState $selectedRole$delegate, MutableState $adminPin$delegate, MutableState $adminDesignation$delegate, MutableState $mosqueName$delegate, final Function0 $onDismiss) {
        $errorMessage$delegate.setValue(null);
        $viewModel.loginWithPhoneNumber(PhoneLoginDialog$lambda$1($phoneNumber$delegate), PhoneLoginDialog$lambda$4($fullName$delegate), PhoneLoginDialog$lambda$7($selectedRole$delegate), PhoneLoginDialog$lambda$10($adminPin$delegate), PhoneLoginDialog$lambda$16($adminDesignation$delegate), PhoneLoginDialog$lambda$19($mosqueName$delegate), new Function0() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda0
            public final Object invoke() {
                return PhoneLoginDialogKt.PhoneLoginDialog$lambda$28$lambda$27$lambda$26$lambda$24($onDismiss);
            }
        }, new Function1() { // from class: com.example.ui.screens.PhoneLoginDialogKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return PhoneLoginDialogKt.PhoneLoginDialog$lambda$28$lambda$27$lambda$26$lambda$25($errorMessage$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$28$lambda$27$lambda$26$lambda$24(Function0 $onDismiss) {
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PhoneLoginDialog$lambda$28$lambda$27$lambda$26$lambda$25(MutableState $errorMessage$delegate, String err) {
        Intrinsics.checkNotNullParameter(err, "err");
        $errorMessage$delegate.setValue(err);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PhoneLoginDialog$lambda$29(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C388@16818L64:PhoneLoginDialog.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(537254823, $changed, -1, "com.example.ui.screens.PhoneLoginDialog.<anonymous> (PhoneLoginDialog.kt:388)");
            }
            ButtonKt.TextButton($onDismiss, (Modifier) null, false, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$PhoneLoginDialogKt.INSTANCE.getLambda$78235530$app(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
