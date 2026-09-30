package com.example.ui.screens;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BookmarkBorderKt;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.PauseKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material.icons.filled.RepeatKt;
import androidx.compose.material.icons.filled.RepeatOnKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import com.example.data.model.AudioPlayerState;
import com.example.data.model.Ayah;
import com.example.data.model.Surah;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.MainViewModel;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: QuranScreen.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aO\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0011\u001a[\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¨\u0006\u001f²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002"}, d2 = {"QuranScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SurahCardItem", "surah", "Lcom/example/data/model/Surah;", "isCurrentPlaying", "", "isLoadingAudio", "onPlayAudio", "Lkotlin/Function0;", "onOpenReader", "onToggleBookmark", "(Lcom/example/data/model/Surah;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MiniAudioPlayerBar", "playerState", "Lcom/example/data/model/AudioPlayerState;", "onPlayPause", "onSeek", "Lkotlin/Function1;", "", "onToggleLoop", "onClose", "(Lcom/example/data/model/Surah;Lcom/example/data/model/AudioPlayerState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "formatMs", "", "ms", "app", "allSurahs", "", "searchQuery", "readingSurah"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQuranScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuranScreen.kt\ncom/example/ui/screens/QuranScreenKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,583:1\n774#2:584\n865#2,2:585\n71#3:587\n68#3,6:588\n74#3:622\n78#3:724\n71#3:935\n67#3,7:936\n74#3:971\n78#3:975\n78#4,6:594\n85#4,4:609\n89#4,2:619\n78#4,6:630\n85#4,4:645\n89#4,2:655\n78#4,6:667\n85#4,4:682\n89#4,2:692\n93#4:706\n93#4:718\n93#4:723\n78#4,6:808\n85#4,4:823\n89#4,2:833\n78#4,6:840\n85#4,4:855\n89#4,2:865\n78#4,6:877\n85#4,4:892\n89#4,2:902\n93#4:908\n93#4:918\n93#4:933\n78#4,6:943\n85#4,4:958\n89#4,2:968\n93#4:974\n78#4,6:985\n85#4,4:1000\n89#4,2:1010\n78#4,6:1021\n85#4,4:1036\n89#4,2:1046\n78#4,6:1061\n85#4,4:1076\n89#4,2:1086\n78#4,6:1098\n85#4,4:1113\n89#4,2:1123\n93#4:1131\n93#4:1135\n93#4:1139\n78#4,6:1150\n85#4,4:1165\n89#4,2:1175\n93#4:1184\n93#4:1188\n78#4,6:1202\n85#4,4:1217\n89#4,2:1227\n78#4,6:1234\n85#4,4:1249\n89#4,2:1259\n78#4,6:1270\n85#4,4:1285\n89#4,2:1295\n93#4:1301\n78#4,6:1311\n85#4,4:1326\n89#4,2:1336\n93#4:1345\n93#4:1349\n78#4,6:1363\n85#4,4:1378\n89#4,2:1388\n93#4:1394\n93#4:1398\n368#5,9:600\n377#5:621\n368#5,9:636\n377#5:657\n368#5,9:673\n377#5:694\n378#5,2:704\n378#5,2:716\n378#5,2:721\n368#5,9:814\n377#5:835\n368#5,9:846\n377#5:867\n368#5,9:883\n377#5:904\n378#5,2:906\n378#5,2:916\n378#5,2:931\n368#5,9:949\n377#5:970\n378#5,2:972\n368#5,9:991\n377#5:1012\n368#5,9:1027\n377#5:1048\n368#5,9:1067\n377#5:1088\n368#5,9:1104\n377#5:1125\n378#5,2:1129\n378#5,2:1133\n378#5,2:1137\n368#5,9:1156\n377#5:1177\n378#5,2:1182\n378#5,2:1186\n368#5,9:1208\n377#5:1229\n368#5,9:1240\n377#5:1261\n368#5,9:1276\n377#5:1297\n378#5,2:1299\n368#5,9:1317\n377#5:1338\n378#5,2:1343\n378#5,2:1347\n368#5,9:1369\n377#5:1390\n378#5,2:1392\n378#5,2:1396\n4032#6,6:613\n4032#6,6:649\n4032#6,6:686\n4032#6,6:827\n4032#6,6:859\n4032#6,6:896\n4032#6,6:962\n4032#6,6:1004\n4032#6,6:1040\n4032#6,6:1080\n4032#6,6:1117\n4032#6,6:1169\n4032#6,6:1221\n4032#6,6:1253\n4032#6,6:1289\n4032#6,6:1330\n4032#6,6:1382\n85#7:623\n82#7,6:624\n88#7:658\n85#7:660\n82#7,6:661\n88#7:695\n92#7:707\n92#7:719\n85#7:801\n82#7,6:802\n88#7:836\n85#7:869\n81#7,7:870\n88#7:905\n92#7:909\n92#7:934\n85#7:1053\n81#7,7:1054\n88#7:1089\n92#7:1136\n85#7:1195\n82#7,6:1196\n88#7:1230\n85#7:1263\n82#7,6:1264\n88#7:1298\n92#7:1302\n92#7:1399\n148#8:659\n148#8:696\n148#8:703\n148#8:708\n148#8:709\n148#8:720\n148#8:731\n158#8:738\n148#8:739\n148#8:740\n148#8:741\n148#8:800\n148#8:920\n148#8:921\n148#8:922\n148#8:923\n148#8:930\n148#8:976\n148#8:977\n148#8:978\n148#8:979\n148#8:980\n148#8:981\n148#8:1050\n148#8:1051\n148#8:1052\n148#8:1127\n148#8:1128\n148#8:1141\n148#8:1179\n148#8:1180\n148#8:1181\n148#8:1190\n148#8:1191\n148#8:1192\n148#8:1193\n148#8:1194\n148#8:1340\n148#8:1341\n148#8:1342\n1225#9,6:697\n1225#9,6:710\n1225#9,6:725\n1225#9,6:732\n1225#9,6:746\n1225#9,6:764\n1225#9,6:770\n1225#9,6:776\n1225#9,6:782\n1225#9,6:910\n1225#9,6:924\n1225#9,6:1351\n81#10:742\n81#10:743\n81#10:744\n81#10:745\n143#11,12:752\n143#11,12:788\n98#12,3:837\n101#12:868\n105#12:919\n98#12,3:982\n101#12:1013\n98#12:1014\n95#12,6:1015\n101#12:1049\n98#12:1090\n94#12,7:1091\n101#12:1126\n105#12:1132\n105#12:1140\n98#12:1142\n94#12,7:1143\n101#12:1178\n105#12:1185\n105#12:1189\n98#12,3:1231\n101#12:1262\n98#12:1303\n94#12,7:1304\n101#12:1339\n105#12:1346\n105#12:1350\n98#12:1357\n96#12,5:1358\n101#12:1391\n105#12:1395\n*S KotlinDebug\n*F\n+ 1 QuranScreen.kt\ncom/example/ui/screens/QuranScreenKt\n*L\n76#1:584\n76#1:585,2\n83#1:587\n83#1:588,6\n83#1:622\n83#1:724\n353#1:935\n353#1:936,7\n353#1:971\n353#1:975\n83#1:594,6\n83#1:609,4\n83#1:619,2\n84#1:630,6\n84#1:645,4\n84#1:655,2\n86#1:667,6\n86#1:682,4\n86#1:692,2\n86#1:706\n84#1:718\n83#1:723\n182#1:808,6\n182#1:823,4\n182#1:833,2\n188#1:840,6\n188#1:855,4\n188#1:865,2\n193#1:877,6\n193#1:892,4\n193#1:902,2\n193#1:908\n188#1:918\n182#1:933\n353#1:943,6\n353#1:958,4\n353#1:968,2\n353#1:974\n336#1:985,6\n336#1:1000,4\n336#1:1010,2\n344#1:1021,6\n344#1:1036,4\n344#1:1046,2\n365#1:1061,6\n365#1:1076,4\n365#1:1086,2\n366#1:1098,6\n366#1:1113,4\n366#1:1123,2\n366#1:1131\n365#1:1135\n344#1:1139\n407#1:1150,6\n407#1:1165,4\n407#1:1175,2\n407#1:1184\n336#1:1188\n476#1:1202,6\n476#1:1217,4\n476#1:1227,2\n477#1:1234,6\n477#1:1249,4\n477#1:1259,2\n482#1:1270,6\n482#1:1285,4\n482#1:1295,2\n482#1:1301\n496#1:1311,6\n496#1:1326,4\n496#1:1336,2\n496#1:1345\n477#1:1349\n557#1:1363,6\n557#1:1378,4\n557#1:1388,2\n557#1:1394\n476#1:1398\n83#1:600,9\n83#1:621\n84#1:636,9\n84#1:657\n86#1:673,9\n86#1:694\n86#1:704,2\n84#1:716,2\n83#1:721,2\n182#1:814,9\n182#1:835\n188#1:846,9\n188#1:867\n193#1:883,9\n193#1:904\n193#1:906,2\n188#1:916,2\n182#1:931,2\n353#1:949,9\n353#1:970\n353#1:972,2\n336#1:991,9\n336#1:1012\n344#1:1027,9\n344#1:1048\n365#1:1067,9\n365#1:1088\n366#1:1104,9\n366#1:1125\n366#1:1129,2\n365#1:1133,2\n344#1:1137,2\n407#1:1156,9\n407#1:1177\n407#1:1182,2\n336#1:1186,2\n476#1:1208,9\n476#1:1229\n477#1:1240,9\n477#1:1261\n482#1:1276,9\n482#1:1297\n482#1:1299,2\n496#1:1317,9\n496#1:1338\n496#1:1343,2\n477#1:1347,2\n557#1:1369,9\n557#1:1390\n557#1:1392,2\n476#1:1396,2\n83#1:613,6\n84#1:649,6\n86#1:686,6\n182#1:827,6\n188#1:859,6\n193#1:896,6\n353#1:962,6\n336#1:1004,6\n344#1:1040,6\n365#1:1080,6\n366#1:1117,6\n407#1:1169,6\n476#1:1221,6\n477#1:1253,6\n482#1:1289,6\n496#1:1330,6\n557#1:1382,6\n84#1:623\n84#1:624,6\n84#1:658\n86#1:660\n86#1:661,6\n86#1:695\n86#1:707\n84#1:719\n182#1:801\n182#1:802,6\n182#1:836\n193#1:869\n193#1:870,7\n193#1:905\n193#1:909\n182#1:934\n365#1:1053\n365#1:1054,7\n365#1:1089\n365#1:1136\n476#1:1195\n476#1:1196,6\n476#1:1230\n482#1:1263\n482#1:1264,6\n482#1:1298\n482#1:1302\n476#1:1399\n86#1:659\n99#1:696\n119#1:703\n129#1:708\n130#1:709\n158#1:720\n328#1:731\n334#1:738\n470#1:739\n473#1:740\n474#1:741\n185#1:800\n218#1:920\n224#1:921\n236#1:922\n244#1:923\n310#1:930\n384#1:976\n416#1:977\n440#1:978\n441#1:979\n449#1:980\n339#1:981\n349#1:1050\n351#1:1051\n363#1:1052\n373#1:1127\n375#1:1128\n403#1:1141\n410#1:1179\n422#1:1180\n435#1:1181\n505#1:1190\n515#1:1191\n516#1:1192\n524#1:1193\n476#1:1194\n499#1:1340\n511#1:1341\n531#1:1342\n103#1:697,6\n131#1:710,6\n179#1:725,6\n329#1:732,6\n113#1:746,6\n164#1:764,6\n167#1:770,6\n168#1:776,6\n169#1:782,6\n208#1:910,6\n245#1:924,6\n547#1:1351,6\n71#1:742\n72#1:743\n73#1:744\n74#1:745\n132#1:752,12\n246#1:788,12\n188#1:837,3\n188#1:868\n188#1:919\n336#1:982,3\n336#1:1013\n344#1:1014\n344#1:1015,6\n344#1:1049\n366#1:1090\n366#1:1091,7\n366#1:1126\n366#1:1132\n344#1:1140\n407#1:1142\n407#1:1143,7\n407#1:1178\n407#1:1185\n336#1:1189\n477#1:1231,3\n477#1:1262\n496#1:1303\n496#1:1304,7\n496#1:1339\n496#1:1346\n477#1:1350\n557#1:1357\n557#1:1358,5\n557#1:1391\n557#1:1395\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/QuranScreenKt.dex */
public final class QuranScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MiniAudioPlayerBar$lambda$68(Surah surah, AudioPlayerState audioPlayerState, Function0 function0, Function1 function1, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        MiniAudioPlayerBar(surah, audioPlayerState, function0, function1, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$43(MainViewModel mainViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuranScreen(mainViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SurahCardItem$lambda$57(Surah surah, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        SurahCardItem(surah, z, z2, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0464 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06da  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void QuranScreen(@org.jetbrains.annotations.NotNull final com.example.ui.viewmodel.MainViewModel r112, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r113, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r114, final int r115, final int r116) {
        /*
            Method dump skipped, instructions count: 2089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QuranScreenKt.QuranScreen(com.example.ui.viewmodel.MainViewModel, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List<Surah> QuranScreen$lambda$0(State<? extends List<Surah>> state) {
        return (List) state.getValue();
    }

    private static final String QuranScreen$lambda$1(State<String> state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioPlayerState QuranScreen$lambda$2(State<AudioPlayerState> state) {
        return (AudioPlayerState) state.getValue();
    }

    private static final Surah QuranScreen$lambda$3(State<Surah> state) {
        return (Surah) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$29$lambda$18$lambda$10$lambda$6$lambda$5(MainViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.setQuranSearch(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit QuranScreen$lambda$29$lambda$18$lambda$10$lambda$9(final MainViewModel $viewModel, State $searchQuery$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C:QuranScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(280737873, $changed, -1, "com.example.ui.screens.QuranScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuranScreen.kt:111)");
            }
            if (QuranScreen$lambda$1($searchQuery$delegate).length() > 0) {
                $composer.startReplaceGroup(1160698492);
                ComposerKt.sourceInformation($composer, "112@4829L32,112@4808L151");
                ComposerKt.sourceInformationMarkerStart($composer, -793841071, "CC(remember):QuranScreen.kt#9igjgp");
                boolean changedInstance = $composer.changedInstance($viewModel);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda10
                        public final Object invoke() {
                            return QuranScreenKt.QuranScreen$lambda$29$lambda$18$lambda$10$lambda$9$lambda$8$lambda$7(MainViewModel.this);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$QuranScreenKt.INSTANCE.m68getLambda$2098757047$app(), $composer, 196608, 30);
            } else {
                $composer.startReplaceGroup(1155938225);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$29$lambda$18$lambda$10$lambda$9$lambda$8$lambda$7(MainViewModel $viewModel) {
        $viewModel.setQuranSearch("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16(final List $filteredSurahs, final State $playerState$delegate, final MainViewModel $viewModel, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return QuranScreenKt.QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16$lambda$11((Surah) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16$$inlined$items$default$1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m84invoke((Surah) p1);
            }

            @Nullable
            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m84invoke(Surah surah) {
                return null;
            }
        };
        $this$LazyColumn.items($filteredSurahs.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @NotNull
            public final Object invoke(int index) {
                return function1.invoke($filteredSurahs.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @Nullable
            public final Object invoke(int index) {
                return function12.invoke($filteredSurahs.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4) {
                invoke((LazyItemScope) p1, ((Number) p2).intValue(), (Composer) p3, ((Number) p4).intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x01d9  */
            /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyItemScope r24, int r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, int r27) {
                /*
                    Method dump skipped, instructions count: 477
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16$$inlined$items$default$4.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object QuranScreen$lambda$29$lambda$18$lambda$17$lambda$16$lambda$11(Surah it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit QuranScreen$lambda$29$lambda$28(final State $playerState$delegate, final MainViewModel $viewModel, AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Function1 function1;
        Object obj3;
        Object obj4;
        Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C:QuranScreen.kt#2thlc2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1798956092, $changed, -1, "com.example.ui.screens.QuranScreen.<anonymous>.<anonymous> (QuranScreen.kt:159)");
        }
        Surah currentSurah = QuranScreen$lambda$2($playerState$delegate).getCurrentSurah();
        if (currentSurah == null) {
            $composer.startReplaceGroup(99065056);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(99065057);
            ComposerKt.sourceInformation($composer, "*163@6611L114,166@6746L44,167@6817L36,168@6875L30,160@6499L416");
            AudioPlayerState QuranScreen$lambda$2 = QuranScreen$lambda$2($playerState$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1622028548, "CC(remember):QuranScreen.kt#9igjgp");
            boolean changed = $composer.changed($playerState$delegate) | $composer.changedInstance($viewModel);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda22
                    public final Object invoke() {
                        return QuranScreenKt.QuranScreen$lambda$29$lambda$28$lambda$27$lambda$20$lambda$19(MainViewModel.this, $playerState$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            Function0 function0 = (Function0) obj;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1622024298, "CC(remember):QuranScreen.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($viewModel);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                obj2 = new Function1() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda23
                    public final Object invoke(Object obj5) {
                        return QuranScreenKt.QuranScreen$lambda$29$lambda$28$lambda$27$lambda$22$lambda$21(MainViewModel.this, ((Integer) obj5).intValue());
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            Function1 function12 = (Function1) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1622022034, "CC(remember):QuranScreen.kt#9igjgp");
            boolean changedInstance2 = $composer.changedInstance($viewModel);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                function1 = function12;
                obj3 = new Function0() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda24
                    public final Object invoke() {
                        return QuranScreenKt.QuranScreen$lambda$29$lambda$28$lambda$27$lambda$24$lambda$23(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                function1 = function12;
                obj3 = rememberedValue3;
            }
            Function0 function02 = (Function0) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1622020184, "CC(remember):QuranScreen.kt#9igjgp");
            boolean changedInstance3 = $composer.changedInstance($viewModel);
            Object rememberedValue4 = $composer.rememberedValue();
            if (changedInstance3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                obj4 = new Function0() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda25
                    public final Object invoke() {
                        return QuranScreenKt.QuranScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(MainViewModel.this);
                    }
                };
                $composer.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MiniAudioPlayerBar(currentSurah, QuranScreen$lambda$2, function0, function1, function02, (Function0) obj4, $composer, 0);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$29$lambda$28$lambda$27$lambda$20$lambda$19(MainViewModel $viewModel, State $playerState$delegate) {
        if (QuranScreen$lambda$2($playerState$delegate).isPlaying()) {
            $viewModel.pauseRecitation();
        } else {
            $viewModel.resumeRecitation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$29$lambda$28$lambda$27$lambda$22$lambda$21(MainViewModel $viewModel, int posMs) {
        $viewModel.seekRecitation(posMs);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$29$lambda$28$lambda$27$lambda$24$lambda$23(MainViewModel $viewModel) {
        $viewModel.toggleRecitationLoop();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(MainViewModel $viewModel) {
        $viewModel.stopRecitation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$42$lambda$31$lambda$30(MainViewModel $viewModel) {
        $viewModel.openSurahReader(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0205  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit QuranScreen$lambda$42$lambda$41(final com.example.data.model.Surah r99, final java.util.List r100, final com.example.ui.viewmodel.MainViewModel r101, final androidx.compose.runtime.State r102, androidx.compose.foundation.layout.ColumnScope r103, androidx.compose.runtime.Composer r104, int r105) {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QuranScreenKt.QuranScreen$lambda$42$lambda$41(com.example.data.model.Surah, java.util.List, com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$42$lambda$41$lambda$40$lambda$36$lambda$34$lambda$33(MainViewModel $viewModel, Surah $surah) {
        $viewModel.playSurahRecitation($surah);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit QuranScreen$lambda$42$lambda$41$lambda$40$lambda$36$lambda$35(Surah $surah, State $playerState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C212@8499L11,209@8247L285:QuranScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1690841662, $changed, -1, "com.example.ui.screens.QuranScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuranScreen.kt:209)");
            }
            Surah currentSurah = QuranScreen$lambda$2($playerState$delegate).getCurrentSurah();
            boolean z = false;
            if (currentSurah != null && currentSurah.getNumber() == $surah.getNumber()) {
                z = true;
            }
            IconKt.Icon-ww6aTOc((z && QuranScreen$lambda$2($playerState$delegate).isPlaying()) ? PauseKt.getPause(Icons.INSTANCE.getDefault()) : PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), "Play Recitation", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuranScreen$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38(final List $ayahs, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38$$inlined$items$default$1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m85invoke((Ayah) p1);
            }

            @Nullable
            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m85invoke(Ayah ayah) {
                return null;
            }
        };
        $this$LazyColumn.items($ayahs.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @Nullable
            public final Object invoke(int index) {
                return function1.invoke($ayahs.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38$$inlined$items$default$4
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
                final Ayah ayah = (Ayah) $ayahs.get(it);
                $composer.startReplaceGroup(1942257102);
                ComposerKt.sourceInformation($composer, "C*249@9631L11,251@9702L2104,246@9487L2319:QuranScreen.kt#2thlc2");
                SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, Dp.constructor-impl(1), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-558933877, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.ui.screens.QuranScreenKt$QuranScreen$2$2$1$2$1$1$1
                    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2) {
                        invoke((Composer) p1, ((Number) p2).intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x01c9  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x01d5  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0422  */
                    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x01db  */
                    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.Composable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void invoke(androidx.compose.runtime.Composer r86, int r87) {
                        /*
                            Method dump skipped, instructions count: 1062
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QuranScreenKt$QuranScreen$2$2$1$2$1$1$1.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }, $composer, 54), $composer, 12607494, 104);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SurahCardItem(@NotNull final Surah surah, final boolean isCurrentPlaying, final boolean isLoadingAudio, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @Nullable Composer $composer, final int $changed) {
        Object obj;
        long j;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(surah, "surah");
        Intrinsics.checkNotNullParameter(function0, "onPlayAudio");
        Intrinsics.checkNotNullParameter(function02, "onOpenReader");
        Intrinsics.checkNotNullParameter(function03, "onToggleBookmark");
        Composer $composer3 = $composer.startRestartGroup(-1372774134);
        ComposerKt.sourceInformation($composer3, "C(SurahCardItem)P(5!2,3)328@12203L18,330@12294L163,333@12488L40,334@12533L3998,324@12095L4436:QuranScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(surah) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isCurrentPlaying) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(isLoadingAudio) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? 131072 : 65536;
        }
        if ((74899 & $dirty) == 74898 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1372774134, $dirty, -1, "com.example.ui.screens.SurahCardItem (QuranScreen.kt:323)");
            }
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16)));
            ComposerKt.sourceInformationMarkerStart($composer3, -680973188, "CC(remember):QuranScreen.kt#9igjgp");
            boolean z = (57344 & $dirty) == 16384;
            Object rememberedValue = $composer3.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda7
                    public final Object invoke() {
                        return QuranScreenKt.SurahCardItem$lambda$45$lambda$44(function02);
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier testTag = TestTagKt.testTag(ClickableKt.clickable-XHw0xAI$default(clip, false, (String) null, (Role) null, (Function0) obj, 7, (Object) null), "surah_card_" + surah.getNumber());
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            if (isCurrentPlaying) {
                $composer3.startReplaceGroup(-680967076);
                ComposerKt.sourceInformation($composer3, "331@12365L11");
                j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            } else {
                $composer3.startReplaceGroup(-680965487);
                ComposerKt.sourceInformation($composer3, "331@12432L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU();
            }
            $composer3.endReplaceGroup();
            CardKt.Card(testTag, (Shape) null, cardDefaults.cardColors-ro_MJ88(j, 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl((float) 1.5d), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1193749628, true, new Function3() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda8
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return QuranScreenKt.SurahCardItem$lambda$56(Surah.this, function03, function02, function0, isLoadingAudio, isCurrentPlaying, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 196608, 18);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj2, Object obj3) {
                    return QuranScreenKt.SurahCardItem$lambda$57(Surah.this, isCurrentPlaying, isLoadingAudio, function0, function02, function03, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SurahCardItem$lambda$45$lambda$44(Function0 $onOpenReader) {
        $onOpenReader.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SurahCardItem$lambda$56(final com.example.data.model.Surah r135, kotlin.jvm.functions.Function0 r136, kotlin.jvm.functions.Function0 r137, kotlin.jvm.functions.Function0 r138, final boolean r139, final boolean r140, androidx.compose.foundation.layout.ColumnScope r141, androidx.compose.runtime.Composer r142, int r143) {
        /*
            Method dump skipped, instructions count: 2240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QuranScreenKt.SurahCardItem$lambda$56(com.example.data.model.Surah, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SurahCardItem$lambda$56$lambda$55$lambda$51$lambda$47(com.example.data.model.Surah r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QuranScreenKt.SurahCardItem$lambda$56$lambda$55$lambda$51$lambda$47(com.example.data.model.Surah, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit SurahCardItem$lambda$56$lambda$55$lambda$51$lambda$50$lambda$49$lambda$48(Surah $surah, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C379@14084L10,382@14224L11,377@13983L366:QuranScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007005625, $changed, -1, "com.example.ui.screens.SurahCardItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuranScreen.kt:377)");
            }
            String upperCase = $surah.getRevelationType().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(upperCase, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(4), Dp.constructor-impl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 199728, 0, 65488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit SurahCardItem$lambda$56$lambda$55$lambda$54$lambda$52(Surah $surah, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C411@15094L318:QuranScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1761316696, $changed, -1, "com.example.ui.screens.SurahCardItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuranScreen.kt:411)");
            }
            ImageVector bookmark = $surah.isBookmarked() ? BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()) : BookmarkBorderKt.getBookmarkBorder(Icons.INSTANCE.getDefault());
            if ($surah.isBookmarked()) {
                $composer.startReplaceGroup(408237091);
                $composer.endReplaceGroup();
                j = ColorKt.getIslamicGold();
            } else {
                $composer.startReplaceGroup(408238472);
                ComposerKt.sourceInformation($composer, "414@15327L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                $composer.endReplaceGroup();
            }
            IconKt.Icon-ww6aTOc(bookmark, "Bookmark", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), j, $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit SurahCardItem$lambda$56$lambda$55$lambda$54$lambda$53(boolean $isLoadingAudio, boolean $isCurrentPlaying, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:QuranScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2027419024, $changed, -1, "com.example.ui.screens.SurahCardItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuranScreen.kt:437)");
            }
            if ($isLoadingAudio) {
                $composer.startReplaceGroup(-1284901625);
                ComposerKt.sourceInformation($composer, "441@16127L11,438@15983L177");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), Dp.constructor-impl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1284690515);
                ComposerKt.sourceInformation($composer, "447@16411L11,444@16192L299");
                Icons.Filled filled = Icons.INSTANCE.getDefault();
                IconKt.Icon-ww6aTOc($isCurrentPlaying ? PauseKt.getPause(filled) : PlayArrowKt.getPlayArrow(filled), $isCurrentPlaying ? "Pause" : "Play", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 384, 0);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MiniAudioPlayerBar(@NotNull final Surah surah, @NotNull final AudioPlayerState playerState, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Integer, Unit> function1, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @Nullable Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(surah, "surah");
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        Intrinsics.checkNotNullParameter(function0, "onPlayPause");
        Intrinsics.checkNotNullParameter(function1, "onSeek");
        Intrinsics.checkNotNullParameter(function02, "onToggleLoop");
        Intrinsics.checkNotNullParameter(function03, "onClose");
        Composer $composer3 = $composer.startRestartGroup(-1675399366);
        ComposerKt.sourceInformation($composer3, "C(MiniAudioPlayerBar)P(5,4,1,2,3)471@16885L11,474@16973L3690,466@16728L3935:QuranScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(surah) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(playerState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? 131072 : 65536;
        }
        if ((74899 & $dirty) == 74898 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1675399366, $dirty, -1, "com.example.ui.screens.MiniAudioPlayerBar (QuranScreen.kt:465)");
            }
            $composer2 = $composer3;
            SurfaceKt.Surface-T9BRK9s(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "mini_audio_player"), (Shape) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, Dp.constructor-impl(6), Dp.constructor-impl(6), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(715683413, true, new Function2() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda26
                public final Object invoke(Object obj, Object obj2) {
                    return QuranScreenKt.MiniAudioPlayerBar$lambda$67(AudioPlayerState.this, function1, surah, function02, function0, function03, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer2, 12804096, 74);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.QuranScreenKt$$ExternalSyntheticLambda27
                public final Object invoke(Object obj, Object obj2) {
                    return QuranScreenKt.MiniAudioPlayerBar$lambda$68(Surah.this, playerState, function0, function1, function02, function03, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MiniAudioPlayerBar$lambda$67(final com.example.data.model.AudioPlayerState r105, final kotlin.jvm.functions.Function1 r106, com.example.data.model.Surah r107, kotlin.jvm.functions.Function0 r108, kotlin.jvm.functions.Function0 r109, kotlin.jvm.functions.Function0 r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 2255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.QuranScreenKt.MiniAudioPlayerBar$lambda$67(com.example.data.model.AudioPlayerState, kotlin.jvm.functions.Function1, com.example.data.model.Surah, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MiniAudioPlayerBar$lambda$67$lambda$66$lambda$62$lambda$61$lambda$59(AudioPlayerState $playerState, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C500@17975L331:QuranScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521964570, $changed, -1, "com.example.ui.screens.MiniAudioPlayerBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuranScreen.kt:500)");
            }
            ImageVector repeatOn = $playerState.isLooping() ? RepeatOnKt.getRepeatOn(Icons.INSTANCE.getDefault()) : RepeatKt.getRepeat(Icons.INSTANCE.getDefault());
            if ($playerState.isLooping()) {
                $composer.startReplaceGroup(-903214715);
                $composer.endReplaceGroup();
                j = ColorKt.getIslamicGold();
            } else {
                $composer.startReplaceGroup(-903213332);
                ComposerKt.sourceInformation($composer, "503@18215L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU();
                $composer.endReplaceGroup();
            }
            IconKt.Icon-ww6aTOc(repeatOn, "Toggle Loop", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), j, $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit MiniAudioPlayerBar$lambda$67$lambda$66$lambda$62$lambda$61$lambda$60(AudioPlayerState $playerState, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:QuranScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-298854269, $changed, -1, "com.example.ui.screens.MiniAudioPlayerBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuranScreen.kt:512)");
            }
            if ($playerState.isLoading()) {
                $composer.startReplaceGroup(299724509);
                ComposerKt.sourceInformation($composer, "516@18640L11,513@18490L196");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), Dp.constructor-impl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(299958807);
                ComposerKt.sourceInformation($composer, "522@18957L11,519@18722L330");
                IconKt.Icon-ww6aTOc($playerState.isPlaying() ? PauseKt.getPause(Icons.INSTANCE.getDefault()) : PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), $playerState.isPlaying() ? "Pause" : "Play", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(26)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), $composer, 384, 0);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MiniAudioPlayerBar$lambda$67$lambda$66$lambda$64$lambda$63(Function1 $onSeek, float it) {
        $onSeek.invoke(Integer.valueOf((int) it));
        return Unit.INSTANCE;
    }

    private static final String formatMs(int ms) {
        int totalSec = ms / 1000;
        int minutes = totalSec / 60;
        int seconds = totalSec % 60;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes), Integer.valueOf(seconds)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
