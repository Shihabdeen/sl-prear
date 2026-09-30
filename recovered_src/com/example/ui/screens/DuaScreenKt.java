package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.FavoriteBorderKt;
import androidx.compose.material.icons.filled.FavoriteKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
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
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import com.example.data.model.DuaCategory;
import com.example.data.model.DuaItem;
import com.example.ui.viewmodel.MainViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DuaScreen.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001am\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\u0016\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002"}, d2 = {"DuaScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DuaCardItem", "dua", "Lcom/example/data/model/DuaItem;", "count", "", "onIncrementCount", "Lkotlin/Function0;", "onResetCount", "onToggleFavorite", "onCopy", "onShare", "(Lcom/example/data/model/DuaItem;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "filteredDuas", "", "selectedCategory", "Lcom/example/data/model/DuaCategory;", "searchQuery", "", "duaCounters", "", "selectedTasbihIndex", "quickTasbihCount", "isExpanded", ""}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDuaScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DuaScreen.kt\ncom/example/ui/screens/DuaScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 14 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 15 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,805:1\n77#2:806\n77#2:807\n77#2:808\n1225#3,6:809\n1225#3,6:815\n1225#3,6:823\n1225#3,6:829\n1225#3,6:1042\n1225#3,6:1093\n1225#3,6:1180\n1225#3,6:1196\n1225#3,6:1238\n1225#3,6:1283\n1225#3,6:1798\n148#4:821\n148#4:822\n148#4:835\n148#4:836\n148#4:847\n148#4:930\n148#4:1036\n148#4:1037\n148#4:1052\n148#4:1053\n148#4:1091\n148#4:1092\n148#4:1104\n148#4:1177\n148#4:1178\n148#4:1179\n148#4:1194\n148#4:1195\n148#4:1244\n148#4:1245\n148#4:1246\n148#4:1349\n148#4:1350\n148#4:1351\n148#4:1388\n148#4:1434\n148#4:1504\n148#4:1505\n148#4:1547\n148#4:1548\n148#4:1549\n148#4:1550\n148#4:1551\n148#4:1560\n148#4:1629\n148#4:1675\n148#4:1676\n148#4:1677\n148#4:1678\n148#4:1679\n148#4:1680\n148#4:1681\n148#4:1718\n148#4:1723\n148#4:1724\n148#4:1725\n148#4:1808\n148#4:1809\n148#4:1810\n81#5:837\n81#5:838\n81#5:839\n81#5:840\n81#5:1346\n107#5,2:1347\n78#6:841\n111#6,2:842\n78#6:844\n111#6,2:845\n71#7:848\n67#7,7:849\n74#7:884\n78#7:929\n71#7:1393\n67#7,7:1394\n74#7:1429\n78#7:1433\n78#8,6:856\n85#8,4:871\n89#8,2:881\n78#8,6:893\n85#8,4:908\n89#8,2:918\n93#8:924\n93#8:928\n78#8,6:938\n85#8,4:953\n89#8,2:963\n78#8,6:970\n85#8,4:985\n89#8,2:995\n78#8,6:1007\n85#8,4:1022\n89#8,2:1032\n93#8:1040\n93#8:1050\n78#8,6:1060\n85#8,4:1075\n89#8,2:1085\n93#8:1102\n78#8,6:1108\n85#8,4:1123\n89#8,2:1133\n78#8,6:1144\n85#8,4:1159\n89#8,2:1169\n93#8:1175\n93#8:1188\n93#8:1192\n78#8,6:1209\n85#8,4:1224\n89#8,2:1234\n78#8,6:1253\n85#8,4:1268\n89#8,2:1278\n93#8:1292\n93#8:1296\n78#8,6:1301\n85#8,4:1316\n89#8,2:1326\n93#8:1332\n78#8,6:1359\n85#8,4:1374\n89#8,2:1384\n93#8:1391\n78#8,6:1401\n85#8,4:1416\n89#8,2:1426\n93#8:1432\n78#8,6:1438\n85#8,4:1453\n89#8,2:1463\n78#8,6:1475\n85#8,4:1490\n89#8,2:1500\n93#8:1508\n78#8,6:1518\n85#8,4:1533\n89#8,2:1543\n93#8:1554\n93#8:1558\n78#8,6:1568\n85#8,4:1583\n89#8,2:1593\n78#8,6:1600\n85#8,4:1615\n89#8,2:1625\n78#8,6:1638\n85#8,4:1653\n89#8,2:1663\n93#8:1669\n93#8:1673\n78#8,6:1689\n85#8,4:1704\n89#8,2:1714\n93#8:1721\n78#8,6:1729\n85#8,4:1744\n89#8,2:1754\n78#8,6:1765\n85#8,4:1780\n89#8,2:1790\n93#8:1796\n93#8:1806\n93#8:1813\n368#9,9:862\n377#9:883\n368#9,9:899\n377#9:920\n378#9,2:922\n378#9,2:926\n368#9,9:944\n377#9:965\n368#9,9:976\n377#9:997\n368#9,9:1013\n377#9:1034\n378#9,2:1038\n378#9,2:1048\n368#9,9:1066\n377#9:1087\n378#9,2:1100\n368#9,9:1114\n377#9:1135\n368#9,9:1150\n377#9:1171\n378#9,2:1173\n378#9,2:1186\n378#9,2:1190\n368#9,9:1215\n377#9:1236\n368#9,9:1259\n377#9:1280\n378#9,2:1290\n378#9,2:1294\n368#9,9:1307\n377#9:1328\n378#9,2:1330\n368#9,9:1365\n377#9:1386\n378#9,2:1389\n368#9,9:1407\n377#9:1428\n378#9,2:1430\n368#9,9:1444\n377#9:1465\n368#9,9:1481\n377#9:1502\n378#9,2:1506\n368#9,9:1524\n377#9:1545\n378#9,2:1552\n378#9,2:1556\n368#9,9:1574\n377#9:1595\n368#9,9:1606\n377#9:1627\n368#9,9:1644\n377#9:1665\n378#9,2:1667\n378#9,2:1671\n368#9,9:1695\n377#9:1716\n378#9,2:1719\n368#9,9:1735\n377#9:1756\n368#9,9:1771\n377#9:1792\n378#9,2:1794\n378#9,2:1804\n378#9,2:1811\n4032#10,6:875\n4032#10,6:912\n4032#10,6:957\n4032#10,6:989\n4032#10,6:1026\n4032#10,6:1079\n4032#10,6:1127\n4032#10,6:1163\n4032#10,6:1228\n4032#10,6:1272\n4032#10,6:1320\n4032#10,6:1378\n4032#10,6:1420\n4032#10,6:1457\n4032#10,6:1494\n4032#10,6:1537\n4032#10,6:1587\n4032#10,6:1619\n4032#10,6:1657\n4032#10,6:1708\n4032#10,6:1748\n4032#10,6:1784\n85#11:885\n81#11,7:886\n88#11:921\n92#11:925\n85#11:931\n82#11,6:932\n88#11:966\n85#11:1137\n82#11,6:1138\n88#11:1172\n92#11:1176\n92#11:1193\n85#11:1202\n82#11,6:1203\n88#11:1237\n92#11:1297\n85#11:1352\n82#11,6:1353\n88#11:1387\n92#11:1392\n85#11:1561\n82#11,6:1562\n88#11:1596\n85#11:1682\n82#11,6:1683\n88#11:1717\n92#11:1722\n85#11:1758\n82#11,6:1759\n88#11:1793\n92#11:1797\n92#11:1814\n98#12,3:967\n101#12:998\n98#12:999\n94#12,7:1000\n101#12:1035\n105#12:1041\n105#12:1051\n98#12:1054\n96#12,5:1055\n101#12:1088\n105#12:1103\n98#12,3:1105\n101#12:1136\n105#12:1189\n98#12:1247\n96#12,5:1248\n101#12:1281\n105#12:1293\n98#12,3:1298\n101#12:1329\n105#12:1333\n98#12,3:1435\n101#12:1466\n98#12:1467\n94#12,7:1468\n101#12:1503\n105#12:1509\n98#12:1510\n94#12,7:1511\n101#12:1546\n105#12:1555\n105#12:1559\n98#12,3:1597\n101#12:1628\n98#12:1630\n94#12,7:1631\n101#12:1666\n105#12:1670\n105#12:1674\n98#12,3:1726\n101#12:1757\n105#12:1807\n1878#13,2:1089\n1880#13:1099\n13472#14:1282\n13473#14:1289\n143#15,12:1334\n*S KotlinDebug\n*F\n+ 1 DuaScreen.kt\ncom/example/ui/screens/DuaScreenKt\n*L\n92#1:806\n93#1:807\n94#1:808\n108#1:809,6\n109#1:815,6\n117#1:823,6\n516#1:829,6\n233#1:1042,6\n269#1:1093,6\n316#1:1180,6\n365#1:1196,6\n351#1:1238,6\n391#1:1283,6\n717#1:1798,6\n115#1:821\n116#1:822\n521#1:835\n524#1:836\n280#1:847\n201#1:930\n212#1:1036\n223#1:1037\n250#1:1052\n257#1:1053\n262#1:1091\n265#1:1092\n286#1:1104\n308#1:1177\n313#1:1178\n315#1:1179\n193#1:1194\n196#1:1195\n371#1:1244\n378#1:1245\n385#1:1246\n546#1:1349\n624#1:1350\n637#1:1351\n644#1:1388\n740#1:1434\n748#1:1504\n759#1:1505\n772#1:1547\n781#1:1548\n789#1:1549\n790#1:1550\n791#1:1551\n529#1:1560\n538#1:1629\n588#1:1675\n604#1:1676\n610#1:1677\n613#1:1678\n628#1:1679\n634#1:1680\n654#1:1681\n664#1:1718\n675#1:1723\n682#1:1724\n691#1:1725\n727#1:1808\n733#1:1809\n735#1:1810\n96#1:837\n97#1:838\n98#1:839\n99#1:840\n516#1:1346\n516#1:1347,2\n108#1:841\n108#1:842,2\n109#1:844\n109#1:845,2\n325#1:848\n325#1:849,7\n325#1:884\n325#1:929\n750#1:1393\n750#1:1394,7\n750#1:1429\n750#1:1433\n325#1:856,6\n325#1:871,4\n325#1:881,2\n326#1:893,6\n326#1:908,4\n326#1:918,2\n326#1:924\n325#1:928\n198#1:938,6\n198#1:953,4\n198#1:963,2\n203#1:970,6\n203#1:985,4\n203#1:995,2\n208#1:1007,6\n208#1:1022,4\n208#1:1032,2\n208#1:1040\n203#1:1050\n253#1:1060,6\n253#1:1075,4\n253#1:1085,2\n253#1:1102\n289#1:1108,6\n289#1:1123,4\n289#1:1133,2\n294#1:1144,6\n294#1:1159,4\n294#1:1169,2\n294#1:1175\n289#1:1188\n198#1:1192\n348#1:1209,6\n348#1:1224,4\n348#1:1234,2\n381#1:1253,6\n381#1:1268,4\n381#1:1278,2\n381#1:1292\n348#1:1296\n420#1:1301,6\n420#1:1316,4\n420#1:1326,2\n420#1:1332\n637#1:1359,6\n637#1:1374,4\n637#1:1384,2\n637#1:1391\n750#1:1401,6\n750#1:1416,4\n750#1:1426,2\n750#1:1432\n737#1:1438,6\n737#1:1453,4\n737#1:1463,2\n744#1:1475,6\n744#1:1490,4\n744#1:1500,2\n744#1:1508\n768#1:1518,6\n768#1:1533,4\n768#1:1543,2\n768#1:1554\n737#1:1558\n526#1:1568,6\n526#1:1583,4\n526#1:1593,2\n532#1:1600,6\n532#1:1615,4\n532#1:1625,2\n550#1:1638,6\n550#1:1653,4\n550#1:1663,2\n550#1:1669\n532#1:1673\n657#1:1689,6\n657#1:1704,4\n657#1:1714,2\n657#1:1721\n694#1:1729,6\n694#1:1744,4\n694#1:1754,2\n699#1:1765,6\n699#1:1780,4\n699#1:1790,2\n699#1:1796\n694#1:1806\n526#1:1813\n325#1:862,9\n325#1:883\n326#1:899,9\n326#1:920\n326#1:922,2\n325#1:926,2\n198#1:944,9\n198#1:965\n203#1:976,9\n203#1:997\n208#1:1013,9\n208#1:1034\n208#1:1038,2\n203#1:1048,2\n253#1:1066,9\n253#1:1087\n253#1:1100,2\n289#1:1114,9\n289#1:1135\n294#1:1150,9\n294#1:1171\n294#1:1173,2\n289#1:1186,2\n198#1:1190,2\n348#1:1215,9\n348#1:1236\n381#1:1259,9\n381#1:1280\n381#1:1290,2\n348#1:1294,2\n420#1:1307,9\n420#1:1328\n420#1:1330,2\n637#1:1365,9\n637#1:1386\n637#1:1389,2\n750#1:1407,9\n750#1:1428\n750#1:1430,2\n737#1:1444,9\n737#1:1465\n744#1:1481,9\n744#1:1502\n744#1:1506,2\n768#1:1524,9\n768#1:1545\n768#1:1552,2\n737#1:1556,2\n526#1:1574,9\n526#1:1595\n532#1:1606,9\n532#1:1627\n550#1:1644,9\n550#1:1665\n550#1:1667,2\n532#1:1671,2\n657#1:1695,9\n657#1:1716\n657#1:1719,2\n694#1:1735,9\n694#1:1756\n699#1:1771,9\n699#1:1792\n699#1:1794,2\n694#1:1804,2\n526#1:1811,2\n325#1:875,6\n326#1:912,6\n198#1:957,6\n203#1:989,6\n208#1:1026,6\n253#1:1079,6\n289#1:1127,6\n294#1:1163,6\n348#1:1228,6\n381#1:1272,6\n420#1:1320,6\n637#1:1378,6\n750#1:1420,6\n737#1:1457,6\n744#1:1494,6\n768#1:1537,6\n526#1:1587,6\n532#1:1619,6\n550#1:1657,6\n657#1:1708,6\n694#1:1748,6\n699#1:1784,6\n326#1:885\n326#1:886,7\n326#1:921\n326#1:925\n198#1:931\n198#1:932,6\n198#1:966\n294#1:1137\n294#1:1138,6\n294#1:1172\n294#1:1176\n198#1:1193\n348#1:1202\n348#1:1203,6\n348#1:1237\n348#1:1297\n637#1:1352\n637#1:1353,6\n637#1:1387\n637#1:1392\n526#1:1561\n526#1:1562,6\n526#1:1596\n657#1:1682\n657#1:1683,6\n657#1:1717\n657#1:1722\n699#1:1758\n699#1:1759,6\n699#1:1793\n699#1:1797\n526#1:1814\n203#1:967,3\n203#1:998\n208#1:999\n208#1:1000,7\n208#1:1035\n208#1:1041\n203#1:1051\n253#1:1054\n253#1:1055,5\n253#1:1088\n253#1:1103\n289#1:1105,3\n289#1:1136\n289#1:1189\n381#1:1247\n381#1:1248,5\n381#1:1281\n381#1:1293\n420#1:1298,3\n420#1:1329\n420#1:1333\n737#1:1435,3\n737#1:1466\n744#1:1467\n744#1:1468,7\n744#1:1503\n744#1:1509\n768#1:1510\n768#1:1511,7\n768#1:1546\n768#1:1555\n737#1:1559\n532#1:1597,3\n532#1:1628\n550#1:1630\n550#1:1631,7\n550#1:1666\n550#1:1670\n532#1:1674\n694#1:1726,3\n694#1:1757\n694#1:1807\n259#1:1089,2\n259#1:1099\n387#1:1282\n387#1:1289\n471#1:1334,12\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/DuaScreenKt.dex */
public final class DuaScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaCardItem$lambda$77(DuaItem duaItem, int i, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        DuaCardItem(duaItem, i, function0, function02, function03, function04, function05, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$52(MainViewModel mainViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DuaScreen(mainViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DuaScreen(@NotNull final MainViewModel viewModel, @Nullable Modifier modifier, @Nullable Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Object obj;
        Object obj2;
        Object obj3;
        Modifier modifier3;
        PaddingValues paddingValues;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer3 = $composer.startRestartGroup(-1078512528);
        ComposerKt.sourceInformation($composer3, "C(DuaScreen)P(1)91@4093L7,92@4136L7,93@4191L7,95@4245L16,96@4310L16,97@4373L16,98@4433L16,107@4805L33,108@4865L33,116@5144L14228,110@4902L14470:DuaScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            Modifier modifier4 = i2 != 0 ? (Modifier) Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078512528, $dirty2, -1, "com.example.ui.screens.DuaScreen (DuaScreen.kt:90)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) consume;
            CompositionLocal localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = $composer3.consume(localHapticFeedback);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final HapticFeedback haptic = (HapticFeedback) consume2;
            CompositionLocal localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = $composer3.consume(localClipboardManager);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ClipboardManager clipboardManager = (ClipboardManager) consume3;
            final State filteredDuas$delegate = SnapshotStateKt.collectAsState(viewModel.getFilteredDuas(), (CoroutineContext) null, $composer3, 0, 1);
            final State selectedCategory$delegate = SnapshotStateKt.collectAsState(viewModel.getDuaCategory(), (CoroutineContext) null, $composer3, 0, 1);
            final State searchQuery$delegate = SnapshotStateKt.collectAsState(viewModel.getDuaSearchQuery(), (CoroutineContext) null, $composer3, 0, 1);
            final State duaCounters$delegate = SnapshotStateKt.collectAsState(viewModel.getDuaCounters(), (CoroutineContext) null, $composer3, 0, 1);
            final List tasbihItems = CollectionsKt.listOf(new Pair[]{TuplesKt.to("سُبْحَانَ اللَّهِ", "SubhanAllah (தூய்மையானவன்)"), TuplesKt.to("الْحَمْدُ لِلَّهِ", "Alhamdulillah (புகழனைத்தும் அல்லாஹ்வுக்கே)"), TuplesKt.to("اللَّهُ أَكْبَرُ", "Allahu Akbar (அல்லாஹ் மிகப் பெரியவன்)"), TuplesKt.to("أَسْتَغْفِرُ اللَّهَ", "Astaghfirullah (மன்னிப்புக் கோருகிறேன்)")});
            ComposerKt.sourceInformationMarkerStart($composer3, -1363393135, "CC(remember):DuaScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                obj = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableIntState selectedTasbihIndex$delegate = (MutableIntState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1363391215, "CC(remember):DuaScreen.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                obj2 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableIntState quickTasbihCount$delegate = (MutableIntState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, (Object) null), "dua_screen_list");
            Modifier modifier5 = modifier4;
            PaddingValues paddingValues2 = PaddingKt.PaddingValues-a9UjIt4(Dp.constructor-impl(16), Dp.constructor-impl(8), Dp.constructor-impl(16), Dp.constructor-impl(96));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16));
            ComposerKt.sourceInformationMarkerStart($composer3, -1363368092, "CC(remember):DuaScreen.kt#9igjgp");
            boolean changedInstance = $composer3.changedInstance(haptic) | $composer3.changed(searchQuery$delegate) | $composer3.changedInstance(viewModel) | $composer3.changed(selectedCategory$delegate) | $composer3.changed(filteredDuas$delegate) | $composer3.changed(duaCounters$delegate) | $composer3.changedInstance(clipboardManager) | $composer3.changedInstance(context);
            Object rememberedValue3 = $composer3.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.Companion.getEmpty()) {
                modifier3 = modifier5;
                paddingValues = paddingValues2;
                obj3 = new Function1() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj4) {
                        return DuaScreenKt.DuaScreen$lambda$51$lambda$50(haptic, quickTasbihCount$delegate, tasbihItems, selectedTasbihIndex$delegate, viewModel, searchQuery$delegate, selectedCategory$delegate, filteredDuas$delegate, clipboardManager, context, duaCounters$delegate, (LazyListScope) obj4);
                    }
                };
                $composer3.updateRememberedValue(obj3);
            } else {
                modifier3 = modifier5;
                paddingValues = paddingValues2;
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            LazyDslKt.LazyColumn(testTag, (LazyListState) null, paddingValues, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) obj3, $composer2, 24576, 234);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda10
                public final Object invoke(Object obj4, Object obj5) {
                    return DuaScreenKt.DuaScreen$lambda$52(MainViewModel.this, modifier2, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final List<DuaItem> DuaScreen$lambda$0(State<? extends List<DuaItem>> state) {
        return (List) state.getValue();
    }

    private static final DuaCategory DuaScreen$lambda$1(State<? extends DuaCategory> state) {
        return (DuaCategory) state.getValue();
    }

    private static final String DuaScreen$lambda$2(State<String> state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> DuaScreen$lambda$3(State<? extends Map<String, Integer>> state) {
        return (Map) state.getValue();
    }

    private static final int DuaScreen$lambda$5(MutableIntState $selectedTasbihIndex$delegate) {
        return ((IntState) $selectedTasbihIndex$delegate).getIntValue();
    }

    private static final int DuaScreen$lambda$8(MutableIntState $quickTasbihCount$delegate) {
        return ((IntState) $quickTasbihCount$delegate).getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$51$lambda$50(final HapticFeedback $haptic, final MutableIntState $quickTasbihCount$delegate, final List $tasbihItems, final MutableIntState $selectedTasbihIndex$delegate, final MainViewModel $viewModel, final State $searchQuery$delegate, final State $selectedCategory$delegate, final State $filteredDuas$delegate, final ClipboardManager $clipboardManager, final Context $context, final State $duaCounters$delegate, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$DuaScreenKt.INSTANCE.getLambda$1389401180$app(), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(871194117, true, new Function3() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda22
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$28($haptic, $quickTasbihCount$delegate, $tasbihItems, $selectedTasbihIndex$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(209604644, true, new Function3() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda23
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$40(MainViewModel.this, $searchQuery$delegate, $selectedCategory$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-451984829, true, new Function3() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda24
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$42($filteredDuas$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        if (DuaScreen$lambda$0($filteredDuas$delegate).isEmpty()) {
            LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$DuaScreenKt.INSTANCE.getLambda$1508868193$app(), 3, (Object) null);
        } else {
            final List DuaScreen$lambda$0 = DuaScreen$lambda$0($filteredDuas$delegate);
            final Function1 function1 = new Function1() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda25
                public final Object invoke(Object obj) {
                    return DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$43((DuaItem) obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$lambda$51$lambda$50$$inlined$items$default$1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return m70invoke((DuaItem) p1);
                }

                @Nullable
                /* renamed from: invoke, reason: collision with other method in class */
                public final Void m70invoke(DuaItem duaItem) {
                    return null;
                }
            };
            $this$LazyColumn.items(DuaScreen$lambda$0.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$lambda$51$lambda$50$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke(((Number) p1).intValue());
                }

                @NotNull
                public final Object invoke(int index) {
                    return function1.invoke(DuaScreen$lambda$0.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$lambda$51$lambda$50$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke(((Number) p1).intValue());
                }

                @Nullable
                public final Object invoke(int index) {
                    return function12.invoke(DuaScreen$lambda$0.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$lambda$51$lambda$50$$inlined$items$default$4
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
                    Map DuaScreen$lambda$3;
                    Object obj;
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Function0 function0;
                    Object obj5;
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
                    final DuaItem duaItem = (DuaItem) DuaScreen$lambda$0.get(it);
                    $composer.startReplaceGroup(244221696);
                    ComposerKt.sourceInformation($composer, "C*475@18039L139,479@18205L130,483@18366L39,484@18426L373,489@18821L523,472@17951L1403:DuaScreen.kt#2thlc2");
                    DuaScreen$lambda$3 = DuaScreenKt.DuaScreen$lambda$3($duaCounters$delegate);
                    Integer num = (Integer) DuaScreen$lambda$3.get(duaItem.getId());
                    int intValue = num != null ? num.intValue() : 0;
                    ComposerKt.sourceInformationMarkerStart($composer, -130666266, "CC(remember):DuaScreen.kt#9igjgp");
                    boolean changedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(duaItem)) || (i & 48) == 32) | $composer.changedInstance($haptic);
                    Object rememberedValue = $composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        final MainViewModel mainViewModel = $viewModel;
                        final HapticFeedback hapticFeedback = $haptic;
                        obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$1$1$5$1$1
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m71invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m71invoke() {
                                MainViewModel.this.incrementDuaCounter(duaItem.getId());
                                hapticFeedback.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
                            }
                        };
                        $composer.updateRememberedValue(obj);
                    } else {
                        obj = rememberedValue;
                    }
                    Function0 function02 = (Function0) obj;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -130660963, "CC(remember):DuaScreen.kt#9igjgp");
                    boolean changedInstance2 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(duaItem)) || (i & 48) == 32) | $composer.changedInstance($haptic);
                    Object rememberedValue2 = $composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        final MainViewModel mainViewModel2 = $viewModel;
                        final HapticFeedback hapticFeedback2 = $haptic;
                        obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$1$1$5$2$1
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m72invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m72invoke() {
                                MainViewModel.this.resetDuaCounter(duaItem.getId());
                                hapticFeedback2.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getLongPress-5zf0vsI());
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                    } else {
                        obj2 = rememberedValue2;
                    }
                    Function0 function03 = (Function0) obj2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -130655902, "CC(remember):DuaScreen.kt#9igjgp");
                    boolean changedInstance3 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(duaItem)) || (i & 48) == 32);
                    Object rememberedValue3 = $composer.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        final MainViewModel mainViewModel3 = $viewModel;
                        obj3 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$1$1$5$3$1
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m73invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m73invoke() {
                                MainViewModel.this.toggleDuaFavorite(duaItem.getId());
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                    } else {
                        obj3 = rememberedValue3;
                    }
                    Function0 function04 = (Function0) obj3;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -130653648, "CC(remember):DuaScreen.kt#9igjgp");
                    boolean changedInstance4 = ((((i & 112) ^ 48) > 32 && $composer.changed(duaItem)) || (i & 48) == 32) | $composer.changedInstance($clipboardManager) | $composer.changedInstance($viewModel);
                    Object rememberedValue4 = $composer.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        final ClipboardManager clipboardManager = $clipboardManager;
                        final MainViewModel mainViewModel4 = $viewModel;
                        obj4 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$1$1$5$4$1
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m74invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m74invoke() {
                                String textToCopy = DuaItem.this.getTitleEn() + " - " + DuaItem.this.getTitleTa() + "\n\n" + DuaItem.this.getArabic() + "\n\nஉச்சரிப்பு:\n" + DuaItem.this.getTamilTransliteration() + "\n\nபொருள்:\n" + DuaItem.this.getTranslationTa() + "\n\nஆதாரம்: " + DuaItem.this.getSource() + "\n(via SL Prayer)";
                                clipboardManager.setText(new AnnotatedString(textToCopy, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                                mainViewModel4.showFeedback("Dua copied to clipboard! (பிரார்த்தனை நகலெடுக்கப்பட்டது)");
                            }
                        };
                        $composer.updateRememberedValue(obj4);
                    } else {
                        obj4 = rememberedValue4;
                    }
                    Function0 function05 = (Function0) obj4;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -130640858, "CC(remember):DuaScreen.kt#9igjgp");
                    boolean changedInstance5 = ((((i & 112) ^ 48) > 32 && $composer.changed(duaItem)) || (i & 48) == 32) | $composer.changedInstance($context);
                    Object rememberedValue5 = $composer.rememberedValue();
                    if (changedInstance5 || rememberedValue5 == Composer.Companion.getEmpty()) {
                        function0 = function05;
                        final Context context = $context;
                        obj5 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.DuaScreenKt$DuaScreen$1$1$5$5$1
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m75invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m75invoke() {
                                String shareText = DuaItem.this.getTitleEn() + " - " + DuaItem.this.getTitleTa() + "\n\n" + DuaItem.this.getArabic() + "\n\nஉச்சரிப்பு:\n" + DuaItem.this.getTamilTransliteration() + "\n\nபொருள்:\n" + DuaItem.this.getTranslationTa() + "\n\nஆதாரம்: " + DuaItem.this.getSource() + "\n(Shared from SL Prayer App)";
                                Intent intent = new Intent("android.intent.action.SEND");
                                DuaItem duaItem2 = DuaItem.this;
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.SUBJECT", duaItem2.getTitleEn());
                                intent.putExtra("android.intent.extra.TEXT", shareText);
                                context.startActivity(Intent.createChooser(intent, "Share Dua via"));
                            }
                        };
                        $composer.updateRememberedValue(obj5);
                    } else {
                        function0 = function05;
                        obj5 = rememberedValue5;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    DuaScreenKt.DuaCardItem(duaItem, intValue, function02, function03, function04, function0, (Function0) obj5, null, $composer, (i >> 3) & 14, 128);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$28(final HapticFeedback $haptic, final MutableIntState $quickTasbihCount$delegate, final List $tasbihItems, final MutableIntState $selectedTasbihIndex$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C194@7753L11,194@7711L69,195@7815L38,196@7862L5679,189@7537L6004:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(871194117, $changed, -1, "com.example.ui.screens.DuaScreen.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:189)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18))), "quick_tasbih_card"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-2108978221, true, new Function3() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27($haptic, $quickTasbihCount$delegate, $tasbihItems, $selectedTasbihIndex$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08ac  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27(final androidx.compose.ui.hapticfeedback.HapticFeedback r113, final androidx.compose.runtime.MutableIntState r114, java.util.List r115, final androidx.compose.runtime.MutableIntState r116, androidx.compose.foundation.layout.ColumnScope r117, androidx.compose.runtime.Composer r118, int r119) {
        /*
            Method dump skipped, instructions count: 3060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27(androidx.compose.ui.hapticfeedback.HapticFeedback, androidx.compose.runtime.MutableIntState, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27$lambda$26$lambda$13$lambda$12$lambda$11(HapticFeedback $haptic, MutableIntState $quickTasbihCount$delegate) {
        $quickTasbihCount$delegate.setIntValue(0);
        $haptic.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getLongPress-5zf0vsI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27$lambda$26$lambda$18$lambda$17$lambda$15$lambda$14(int $index, MutableIntState $selectedTasbihIndex$delegate, MutableIntState $quickTasbihCount$delegate) {
        $selectedTasbihIndex$delegate.setIntValue($index);
        $quickTasbihCount$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27$lambda$26$lambda$18$lambda$17$lambda$16(boolean $isSelected, String $arabic, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C276@10973L10,274@10894L410:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1727470646, $changed, -1, "com.example.ui.screens.DuaScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:274)");
            }
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium();
            FontWeight.Companion companion = FontWeight.Companion;
            FontWeight bold = $isSelected ? companion.getBold() : companion.getNormal();
            if ($isSelected) {
                $composer.startReplaceGroup(2053061587);
                ComposerKt.sourceInformation($composer, "278@11140L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary-0d7_KjU();
            } else {
                $composer.startReplaceGroup(2053062899);
                ComposerKt.sourceInformation($composer, "278@11181L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface-0d7_KjU();
            }
            $composer.endReplaceGroup();
            TextKt.Text--4IGK_g($arabic, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12), Dp.constructor-impl(6)), j, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelMedium, $composer, 48, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27$lambda$26$lambda$25$lambda$21$lambda$20(HapticFeedback $haptic, MutableIntState $quickTasbihCount$delegate) {
        $quickTasbihCount$delegate.setIntValue(DuaScreen$lambda$8($quickTasbihCount$delegate) + 1);
        $haptic.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
        if (DuaScreen$lambda$8($quickTasbihCount$delegate) == 33 || DuaScreen$lambda$8($quickTasbihCount$delegate) == 100) {
            $haptic.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getLongPress-5zf0vsI());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(androidx.compose.runtime.MutableIntState r71, androidx.compose.runtime.Composer r72, int r73) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(androidx.compose.runtime.MutableIntState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0352  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DuaScreen$lambda$51$lambda$50$lambda$40(final com.example.ui.viewmodel.MainViewModel r133, final androidx.compose.runtime.State r134, androidx.compose.runtime.State r135, androidx.compose.foundation.lazy.LazyItemScope r136, androidx.compose.runtime.Composer r137, int r138) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$40(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$40$lambda$39$lambda$30$lambda$29(MainViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.setDuaSearchQuery(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$40$lambda$39$lambda$33(final MainViewModel $viewModel, State $searchQuery$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-483085097, $changed, -1, "com.example.ui.screens.DuaScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:363)");
            }
            if (DuaScreen$lambda$2($searchQuery$delegate).length() > 0) {
                $composer.startReplaceGroup(847333740);
                ComposerKt.sourceInformation($composer, "364@14276L35,364@14255L161");
                ComposerKt.sourceInformationMarkerStart($composer, -388307622, "CC(remember):DuaScreen.kt#9igjgp");
                boolean changedInstance = $composer.changedInstance($viewModel);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda8
                        public final Object invoke() {
                            return DuaScreenKt.DuaScreen$lambda$51$lambda$50$lambda$40$lambda$39$lambda$33$lambda$32$lambda$31(MainViewModel.this);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) obj, (Modifier) null, false, (IconButtonColors) null, (MutableInteractionSource) null, ComposableSingletons$DuaScreenKt.INSTANCE.m42getLambda$1450809137$app(), $composer, 196608, 30);
            } else {
                $composer.startReplaceGroup(833201739);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$40$lambda$39$lambda$33$lambda$32$lambda$31(MainViewModel $viewModel) {
        $viewModel.setDuaSearchQuery("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$40$lambda$39$lambda$38$lambda$37$lambda$35$lambda$34(MainViewModel $viewModel, DuaCategory $cat) {
        $viewModel.setDuaCategory($cat);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36(DuaCategory $cat, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C394@15395L10,392@15277L157:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1218100576, $changed, -1, "com.example.ui.screens.DuaScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:392)");
            }
            TextKt.Text--4IGK_g($cat.getDisplayNameTa() + " (" + $cat.getDisplayNameEn() + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaScreen$lambda$51$lambda$50$lambda$42(State $filteredDuas$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C419@16170L402:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-451984829, $changed, -1, "com.example.ui.screens.DuaScreen.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:419)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, fillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart($composer, -1578810386, "C426@16440L10,428@16535L11,424@16350L214:DuaScreen.kt#2thlc2");
            TextKt.Text--4IGK_g(DuaScreen$lambda$0($filteredDuas$delegate).size() + " Duas Found", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 196608, 0, 65498);
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
    public static final Object DuaScreen$lambda$51$lambda$50$lambda$43(DuaItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DuaCardItem(@NotNull final DuaItem dua, final int count, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03, @NotNull final Function0<Unit> function04, @NotNull final Function0<Unit> function05, @Nullable Modifier modifier, @Nullable Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier modifier3;
        Object obj;
        Composer $composer2;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(dua, "dua");
        Intrinsics.checkNotNullParameter(function0, "onIncrementCount");
        Intrinsics.checkNotNullParameter(function02, "onResetCount");
        Intrinsics.checkNotNullParameter(function03, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(function04, "onCopy");
        Intrinsics.checkNotNullParameter(function05, "onShare");
        Composer $composer3 = $composer.startRestartGroup(-1011905694);
        ComposerKt.sourceInformation($composer3, "C(DuaCardItem)P(1!1,4,5,7,3,6)515@19628L34,522@19863L11,522@19821L62,523@19914L38,524@19957L9466,517@19666L9757:DuaScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(dua) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(count) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function04) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function05) ? 1048576 : 524288;
        }
        int i2 = i & 128;
        if (i2 != 0) {
            $dirty |= 12582912;
            modifier2 = modifier;
        } else if ((12582912 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 8388608 : 4194304;
        } else {
            modifier2 = modifier;
        }
        if ((4793491 & $dirty) == 4793490 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            modifier4 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1011905694, $dirty, -1, "com.example.ui.screens.DuaCardItem (DuaScreen.kt:514)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1778754940, "CC(remember):DuaScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                obj = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState isExpanded$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier5 = modifier3;
            $composer2 = $composer3;
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18))), "dua_card_" + dua.getId()), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1896682064, true, new Function3() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return DuaScreenKt.DuaCardItem$lambda$76(DuaItem.this, function03, function04, function05, isExpanded$delegate, count, function02, function0, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.DuaScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj2, Object obj3) {
                    return DuaScreenKt.DuaCardItem$lambda$77(DuaItem.this, count, function0, function02, function03, function04, function05, modifier4, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean DuaCardItem$lambda$54(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void DuaCardItem$lambda$55(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0710 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0390 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0b88  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0d30  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0c37  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x09a3 A[ADDED_TO_REGION] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DuaCardItem$lambda$76(final com.example.data.model.DuaItem r106, kotlin.jvm.functions.Function0 r107, kotlin.jvm.functions.Function0 r108, kotlin.jvm.functions.Function0 r109, final androidx.compose.runtime.MutableState r110, final int r111, final kotlin.jvm.functions.Function0 r112, final kotlin.jvm.functions.Function0 r113, androidx.compose.foundation.layout.ColumnScope r114, androidx.compose.runtime.Composer r115, int r116) {
        /*
            Method dump skipped, instructions count: 3382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DuaScreenKt.DuaCardItem$lambda$76(com.example.data.model.DuaItem, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaCardItem$lambda$76$lambda$75$lambda$59$lambda$56(DuaItem $dua, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C542@20517L10,544@20616L11,540@20430L294:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1004379675, $changed, -1, "com.example.ui.screens.DuaCardItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:540)");
            }
            String displayNameTa = $dua.getCategory().getDisplayNameTa();
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(displayNameTa, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(8), Dp.constructor-impl(4)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 196656, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaCardItem$lambda$76$lambda$75$lambda$59$lambda$58$lambda$57(DuaItem $dua, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C554@20951L271:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2060751243, $changed, -1, "com.example.ui.screens.DuaCardItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:554)");
            }
            ImageVector favorite = $dua.isFavorite() ? FavoriteKt.getFavorite(Icons.INSTANCE.getDefault()) : FavoriteBorderKt.getFavoriteBorder(Icons.INSTANCE.getDefault());
            if ($dua.isFavorite()) {
                $composer.startReplaceGroup(-402014024);
                $composer.endReplaceGroup();
                j = Color.Companion.getRed-0d7_KjU();
            } else {
                $composer.startReplaceGroup(-402012891);
                ComposerKt.sourceInformation($composer, "557@21180L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                $composer.endReplaceGroup();
            }
            IconKt.Icon-ww6aTOc(favorite, "Favorite", (Modifier) null, j, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaCardItem$lambda$76$lambda$75$lambda$60(DuaItem $dua, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C622@23145L11,616@22941L279:DuaScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1900490561, $changed, -1, "com.example.ui.screens.DuaCardItem.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:616)");
            }
            TextKt.Text--4IGK_g($dua.getArabic(), PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.box-impl(TextAlign.Companion.getRight-e0LSkKk()), TextUnitKt.getSp(38), 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199728, 6, 129488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01eb  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DuaCardItem$lambda$76$lambda$75$lambda$62(com.example.data.model.DuaItem r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DuaScreenKt.DuaCardItem$lambda$76$lambda$75$lambda$62(com.example.data.model.DuaItem, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DuaCardItem$lambda$76$lambda$75$lambda$68$lambda$66$lambda$65(MutableState $isExpanded$delegate) {
        DuaCardItem$lambda$55($isExpanded$delegate, !DuaCardItem$lambda$54($isExpanded$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit DuaCardItem$lambda$76$lambda$75$lambda$68$lambda$67(MutableState $isExpanded$delegate, RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C721@26403L10,719@26305L131:DuaScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1693837602, $changed, -1, "com.example.ui.screens.DuaCardItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DuaScreen.kt:719)");
            }
            TextKt.Text--4IGK_g(DuaCardItem$lambda$54($isExpanded$delegate) ? "Less" : "English", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e0  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DuaCardItem$lambda$76$lambda$75$lambda$74(int r85, final com.example.data.model.DuaItem r86, kotlin.jvm.functions.Function0 r87, kotlin.jvm.functions.Function0 r88, androidx.compose.runtime.Composer r89, int r90) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DuaScreenKt.DuaCardItem$lambda$76$lambda$75$lambda$74(int, com.example.data.model.DuaItem, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DuaCardItem$lambda$76$lambda$75$lambda$74$lambda$73$lambda$71$lambda$70(com.example.data.model.DuaItem r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.DuaScreenKt.DuaCardItem$lambda$76$lambda$75$lambda$74$lambda$73$lambda$71$lambda$70(com.example.data.model.DuaItem, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
