package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import com.example.data.model.ChatGroup;
import com.example.data.model.ChatMessage;
import com.example.data.model.UserProfile;
import com.example.data.model.UserRole;
import com.example.data.repository.CloudSyncStatus;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.MainViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChatGroupScreen.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a9\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"ChatGroupScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdminChatMessageCard", "message", "Lcom/example/data/model/ChatMessage;", "canDelete", "", "onDelete", "Lkotlin/Function0;", "onReact", "(Lcom/example/data/model/ChatMessage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "currentUser", "Lcom/example/data/model/UserProfile;", "selectedGroup", "Lcom/example/data/model/ChatGroup;", "messages", "", "syncStatus", "Lcom/example/data/repository/CloudSyncStatus;", "showLoginDialog", "messageInputText", "", "selectedTag", "isPinnedAnnouncement"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatGroupScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatGroupScreen.kt\ncom/example/ui/screens/ChatGroupScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 14 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,772:1\n1225#2,6:773\n1225#2,6:779\n1225#2,6:785\n1225#2,6:791\n1225#2,6:797\n1225#2,6:803\n1225#2,6:809\n1225#2,6:925\n1225#2,6:1093\n1225#2,6:1102\n1225#2,6:1206\n1225#2,6:1218\n1225#2,6:1225\n1225#2,6:1418\n1225#2,6:1424\n1225#2,6:1601\n1225#2,6:1607\n1225#2,6:1696\n1225#2,6:1745\n1225#2,6:1752\n1225#2,6:2127\n1225#2,6:2134\n85#3:815\n82#3,6:816\n88#3:850\n85#3:852\n82#3,6:853\n88#3:887\n85#3:969\n82#3,6:970\n88#3:1004\n92#3:1051\n92#3:1119\n85#3:1157\n81#3,7:1158\n88#3:1193\n92#3:1199\n92#3:1217\n85#3:1517\n81#3,7:1518\n88#3:1553\n92#3:1557\n85#3:1623\n82#3,6:1624\n88#3:1658\n92#3:1766\n85#3:1855\n82#3,6:1856\n88#3:1890\n85#3:1961\n81#3,7:1962\n88#3:1997\n92#3:2044\n92#3:2154\n78#4,6:822\n85#4,4:837\n89#4,2:847\n78#4,6:859\n85#4,4:874\n89#4,2:884\n78#4,6:895\n85#4,4:910\n89#4,2:920\n93#4:934\n78#4,6:940\n85#4,4:955\n89#4,2:965\n78#4,6:976\n85#4,4:991\n89#4,2:1001\n78#4,6:1013\n85#4,4:1028\n89#4,2:1038\n93#4:1046\n93#4:1050\n78#4,6:1060\n85#4,4:1075\n89#4,2:1085\n93#4:1110\n93#4:1114\n93#4:1118\n78#4,6:1128\n85#4,4:1143\n89#4,2:1153\n78#4,6:1165\n85#4,4:1180\n89#4,2:1190\n93#4:1198\n93#4:1202\n93#4:1216\n78#4,6:1265\n85#4,4:1280\n89#4,2:1290\n93#4:1298\n78#4,6:1308\n85#4,4:1323\n89#4,2:1333\n93#4:1341\n78#4,6:1347\n85#4,4:1362\n89#4,2:1372\n78#4,6:1383\n85#4,4:1398\n89#4,2:1408\n93#4:1416\n93#4:1432\n78#4,6:1450\n85#4,4:1465\n89#4,2:1475\n78#4,6:1486\n85#4,4:1501\n89#4,2:1511\n78#4,6:1525\n85#4,4:1540\n89#4,2:1550\n93#4:1556\n93#4:1560\n78#4,6:1571\n85#4,4:1586\n89#4,2:1596\n93#4:1616\n93#4:1620\n78#4,6:1630\n85#4,4:1645\n89#4,2:1655\n78#4,6:1666\n85#4,4:1681\n89#4,2:1691\n93#4:1705\n78#4,6:1715\n85#4,4:1730\n89#4,2:1740\n93#4:1761\n93#4:1765\n78#4,6:1777\n85#4,4:1792\n89#4,2:1802\n93#4:1809\n78#4,6:1820\n85#4,4:1835\n89#4,2:1845\n93#4:1852\n78#4,6:1862\n85#4,4:1877\n89#4,2:1887\n78#4,6:1894\n85#4,4:1909\n89#4,2:1919\n78#4,6:1930\n85#4,4:1945\n89#4,2:1955\n78#4,6:1969\n85#4,4:1984\n89#4,2:1994\n78#4,6:2006\n85#4,4:2021\n89#4,2:2031\n93#4:2039\n93#4:2043\n93#4:2047\n93#4:2053\n78#4,6:2060\n85#4,4:2075\n89#4,2:2085\n78#4,6:2097\n85#4,4:2112\n89#4,2:2122\n93#4:2145\n93#4:2149\n93#4:2153\n368#5,9:828\n377#5:849\n368#5,9:865\n377#5:886\n368#5,9:901\n377#5:922\n378#5,2:932\n368#5,9:946\n377#5:967\n368#5,9:982\n377#5:1003\n368#5,9:1019\n377#5:1040\n378#5,2:1044\n378#5,2:1048\n368#5,9:1066\n377#5:1087\n378#5,2:1108\n378#5,2:1112\n378#5,2:1116\n368#5,9:1134\n377#5:1155\n368#5,9:1171\n377#5:1192\n378#5,2:1196\n378#5,2:1200\n378#5,2:1214\n368#5,9:1271\n377#5:1292\n378#5,2:1296\n368#5,9:1314\n377#5:1335\n378#5,2:1339\n368#5,9:1353\n377#5:1374\n368#5,9:1389\n377#5:1410\n378#5,2:1414\n378#5,2:1430\n368#5,9:1456\n377#5:1477\n368#5,9:1492\n377#5:1513\n368#5,9:1531\n377#5:1552\n378#5,2:1554\n378#5,2:1558\n368#5,9:1577\n377#5:1598\n378#5,2:1614\n378#5,2:1618\n368#5,9:1636\n377#5:1657\n368#5,9:1672\n377#5:1693\n378#5,2:1703\n368#5,9:1721\n377#5:1742\n378#5,2:1759\n378#5,2:1763\n368#5,9:1783\n377#5:1804\n378#5,2:1807\n368#5,9:1826\n377#5:1847\n378#5,2:1850\n368#5,9:1868\n377#5:1889\n368#5,9:1900\n377#5:1921\n368#5,9:1936\n377#5:1957\n368#5,9:1975\n377#5:1996\n368#5,9:2012\n377#5:2033\n378#5,2:2037\n378#5,2:2041\n378#5,2:2045\n378#5,2:2051\n368#5,9:2066\n377#5:2087\n368#5,9:2103\n377#5:2124\n378#5,2:2143\n378#5,2:2147\n378#5,2:2151\n4032#6,6:841\n4032#6,6:878\n4032#6,6:914\n4032#6,6:959\n4032#6,6:995\n4032#6,6:1032\n4032#6,6:1079\n4032#6,6:1147\n4032#6,6:1184\n4032#6,6:1284\n4032#6,6:1327\n4032#6,6:1366\n4032#6,6:1402\n4032#6,6:1469\n4032#6,6:1505\n4032#6,6:1544\n4032#6,6:1590\n4032#6,6:1649\n4032#6,6:1685\n4032#6,6:1734\n4032#6,6:1796\n4032#6,6:1839\n4032#6,6:1881\n4032#6,6:1913\n4032#6,6:1949\n4032#6,6:1988\n4032#6,6:2025\n4032#6,6:2079\n4032#6,6:2116\n148#7:851\n148#7:888\n148#7:936\n148#7:1042\n148#7:1043\n148#7:1089\n148#7:1090\n148#7:1091\n148#7:1092\n148#7:1099\n148#7:1100\n148#7:1101\n148#7:1120\n148#7:1121\n148#7:1194\n148#7:1195\n148#7:1204\n148#7:1205\n148#7:1212\n148#7:1213\n148#7:1231\n158#7:1232\n148#7:1233\n148#7:1234\n148#7:1235\n148#7:1257\n148#7:1294\n148#7:1295\n148#7:1300\n148#7:1337\n148#7:1338\n148#7:1343\n148#7:1412\n148#7:1413\n148#7:1446\n148#7:1515\n148#7:1516\n148#7:1562\n148#7:1600\n148#7:1613\n148#7:1622\n148#7:1659\n148#7:1707\n148#7:1744\n148#7:1751\n148#7:1758\n148#7:1767\n148#7:1768\n148#7:1806\n148#7:1811\n148#7:1812\n148#7:1849\n148#7:1854\n148#7:1959\n148#7:1960\n148#7:2035\n148#7:2036\n148#7:2049\n148#7:2050\n148#7:2055\n148#7:2056\n148#7:2126\n148#7:2133\n148#7:2140\n148#7:2141\n148#7:2142\n98#8:889\n96#8,5:890\n101#8:923\n105#8:935\n98#8,3:937\n101#8:968\n98#8:1005\n94#8,7:1006\n101#8:1041\n105#8:1047\n98#8:1052\n94#8,7:1053\n101#8:1088\n105#8:1111\n105#8:1115\n98#8:1258\n95#8,6:1259\n101#8:1293\n105#8:1299\n98#8:1301\n95#8,6:1302\n101#8:1336\n105#8:1342\n98#8,3:1344\n101#8:1375\n98#8:1376\n95#8,6:1377\n101#8:1411\n105#8:1417\n105#8:1433\n98#8,3:1447\n101#8:1478\n98#8:1479\n95#8,6:1480\n101#8:1514\n105#8:1561\n98#8:1563\n94#8,7:1564\n101#8:1599\n105#8:1617\n105#8:1621\n98#8:1660\n96#8,5:1661\n101#8:1694\n105#8:1706\n98#8:1708\n95#8,6:1709\n101#8:1743\n105#8:1762\n98#8:1813\n95#8,6:1814\n101#8:1848\n105#8:1853\n98#8,3:1891\n101#8:1922\n98#8:1923\n95#8,6:1924\n101#8:1958\n98#8:1998\n94#8,7:1999\n101#8:2034\n105#8:2040\n105#8:2048\n105#8:2054\n98#8,3:2057\n101#8:2088\n98#8:2089\n94#8,7:2090\n101#8:2125\n105#8:2146\n105#8:2150\n1869#9:924\n1870#9:931\n1869#9:1695\n1870#9:1702\n71#10:1122\n69#10,5:1123\n74#10:1156\n78#10:1203\n71#10:1769\n67#10,7:1770\n74#10:1805\n78#10:1810\n77#11:1224\n81#12:1236\n81#12:1237\n81#12:1238\n81#12:1239\n81#12:1240\n107#12,2:1241\n81#12:1243\n107#12,2:1244\n81#12:1246\n107#12,2:1247\n81#12:1249\n107#12,2:1250\n64#13,5:1252\n143#14,12:1434\n*S KotlinDebug\n*F\n+ 1 ChatGroupScreen.kt\ncom/example/ui/screens/ChatGroupScreenKt\n*L\n95#1:773,6\n96#1:779,6\n97#1:785,6\n98#1:791,6\n103#1:797,6\n110#1:803,6\n118#1:809,6\n147#1:925,6\n226#1:1093,6\n260#1:1102,6\n378#1:1206,6\n558#1:1218,6\n571#1:1225,6\n324#1:1418,6\n331#1:1424,6\n522#1:1601,6\n542#1:1607,6\n415#1:1696,6\n433#1:1745,6\n445#1:1752,6\n696#1:2127,6\n718#1:2134,6\n126#1:815\n126#1:816,6\n126#1:850\n132#1:852\n132#1:853,6\n132#1:887\n168#1:969\n168#1:970,6\n168#1:1004\n168#1:1051\n132#1:1119\n349#1:1157\n349#1:1158,7\n349#1:1193\n349#1:1199\n126#1:1217\n505#1:1517\n505#1:1518,7\n505#1:1553\n505#1:1557\n399#1:1623\n399#1:1624,6\n399#1:1658\n399#1:1766\n590#1:1855\n590#1:1856,6\n590#1:1890\n619#1:1961\n619#1:1962,7\n619#1:1997\n619#1:2044\n590#1:2154\n126#1:822,6\n126#1:837,4\n126#1:847,2\n132#1:859,6\n132#1:874,4\n132#1:884,2\n138#1:895,6\n138#1:910,4\n138#1:920,2\n138#1:934\n163#1:940,6\n163#1:955,4\n163#1:965,2\n168#1:976,6\n168#1:991,4\n168#1:1001,2\n175#1:1013,6\n175#1:1028,4\n175#1:1038,2\n175#1:1046\n168#1:1050\n191#1:1060,6\n191#1:1075,4\n191#1:1085,2\n191#1:1110\n163#1:1114\n132#1:1118\n342#1:1128,6\n342#1:1143,4\n342#1:1153,2\n349#1:1165,6\n349#1:1180,4\n349#1:1190,2\n349#1:1198\n342#1:1202\n126#1:1216\n229#1:1265,6\n229#1:1280,4\n229#1:1290,2\n229#1:1298\n263#1:1308,6\n263#1:1323,4\n263#1:1333,2\n263#1:1341\n292#1:1347,6\n292#1:1362,4\n292#1:1372,2\n299#1:1383,6\n299#1:1398,4\n299#1:1408,2\n299#1:1416\n292#1:1432\n479#1:1450,6\n479#1:1465,4\n479#1:1475,2\n486#1:1486,6\n486#1:1501,4\n486#1:1511,2\n505#1:1525,6\n505#1:1540,4\n505#1:1550,2\n505#1:1556\n486#1:1560\n520#1:1571,6\n520#1:1586,4\n520#1:1596,2\n520#1:1616\n479#1:1620\n399#1:1630,6\n399#1:1645,4\n399#1:1655,2\n406#1:1666,6\n406#1:1681,4\n406#1:1691,2\n406#1:1705\n427#1:1715,6\n427#1:1730,4\n427#1:1740,2\n427#1:1761\n399#1:1765\n607#1:1777,6\n607#1:1792,4\n607#1:1802,2\n607#1:1809\n699#1:1820,6\n699#1:1835,4\n699#1:1845,2\n699#1:1852\n590#1:1862,6\n590#1:1877,4\n590#1:1887,2\n592#1:1894,6\n592#1:1909,4\n592#1:1919,2\n598#1:1930,6\n598#1:1945,4\n598#1:1955,2\n619#1:1969,6\n619#1:1984,4\n619#1:1994,2\n620#1:2006,6\n620#1:2021,4\n620#1:2031,2\n620#1:2039\n619#1:2043\n598#1:2047\n592#1:2053\n679#1:2060,6\n679#1:2075,4\n679#1:2085,2\n690#1:2097,6\n690#1:2112,4\n690#1:2122,2\n690#1:2145\n679#1:2149\n590#1:2153\n126#1:828,9\n126#1:849\n132#1:865,9\n132#1:886\n138#1:901,9\n138#1:922\n138#1:932,2\n163#1:946,9\n163#1:967\n168#1:982,9\n168#1:1003\n175#1:1019,9\n175#1:1040\n175#1:1044,2\n168#1:1048,2\n191#1:1066,9\n191#1:1087\n191#1:1108,2\n163#1:1112,2\n132#1:1116,2\n342#1:1134,9\n342#1:1155\n349#1:1171,9\n349#1:1192\n349#1:1196,2\n342#1:1200,2\n126#1:1214,2\n229#1:1271,9\n229#1:1292\n229#1:1296,2\n263#1:1314,9\n263#1:1335\n263#1:1339,2\n292#1:1353,9\n292#1:1374\n299#1:1389,9\n299#1:1410\n299#1:1414,2\n292#1:1430,2\n479#1:1456,9\n479#1:1477\n486#1:1492,9\n486#1:1513\n505#1:1531,9\n505#1:1552\n505#1:1554,2\n486#1:1558,2\n520#1:1577,9\n520#1:1598\n520#1:1614,2\n479#1:1618,2\n399#1:1636,9\n399#1:1657\n406#1:1672,9\n406#1:1693\n406#1:1703,2\n427#1:1721,9\n427#1:1742\n427#1:1759,2\n399#1:1763,2\n607#1:1783,9\n607#1:1804\n607#1:1807,2\n699#1:1826,9\n699#1:1847\n699#1:1850,2\n590#1:1868,9\n590#1:1889\n592#1:1900,9\n592#1:1921\n598#1:1936,9\n598#1:1957\n619#1:1975,9\n619#1:1996\n620#1:2012,9\n620#1:2033\n620#1:2037,2\n619#1:2041,2\n598#1:2045,2\n592#1:2051,2\n679#1:2066,9\n679#1:2087\n690#1:2103,9\n690#1:2124\n690#1:2143,2\n679#1:2147,2\n590#1:2151,2\n126#1:841,6\n132#1:878,6\n138#1:914,6\n163#1:959,6\n168#1:995,6\n175#1:1032,6\n191#1:1079,6\n342#1:1147,6\n349#1:1184,6\n229#1:1284,6\n263#1:1327,6\n292#1:1366,6\n299#1:1402,6\n479#1:1469,6\n486#1:1505,6\n505#1:1544,6\n520#1:1590,6\n399#1:1649,6\n406#1:1685,6\n427#1:1734,6\n607#1:1796,6\n699#1:1839,6\n590#1:1881,6\n592#1:1913,6\n598#1:1949,6\n619#1:1988,6\n620#1:2025,6\n679#1:2079,6\n690#1:2116,6\n136#1:851\n142#1:888\n160#1:936\n180#1:1042\n182#1:1043\n194#1:1089\n196#1:1090\n219#1:1091\n223#1:1092\n249#1:1099\n253#1:1100\n256#1:1101\n290#1:1120\n346#1:1121\n354#1:1194\n361#1:1195\n376#1:1204\n377#1:1205\n394#1:1212\n395#1:1213\n578#1:1231\n580#1:1232\n580#1:1233\n582#1:1234\n588#1:1235\n230#1:1257\n237#1:1294\n239#1:1295\n264#1:1300\n271#1:1337\n273#1:1338\n295#1:1343\n307#1:1412\n309#1:1413\n482#1:1446\n493#1:1515\n504#1:1516\n520#1:1562\n534#1:1600\n543#1:1613\n402#1:1622\n410#1:1659\n425#1:1707\n439#1:1744\n442#1:1751\n455#1:1758\n474#1:1767\n475#1:1768\n612#1:1806\n660#1:1811\n700#1:1812\n704#1:1849\n590#1:1854\n605#1:1959\n617#1:1960\n628#1:2035\n633#1:2036\n650#1:2049\n652#1:2050\n666#1:2055\n676#1:2056\n693#1:2126\n714#1:2133\n740#1:2140\n752#1:2141\n756#1:2142\n138#1:889\n138#1:890,5\n138#1:923\n138#1:935\n163#1:937,3\n163#1:968\n175#1:1005\n175#1:1006,7\n175#1:1041\n175#1:1047\n191#1:1052\n191#1:1053,7\n191#1:1088\n191#1:1111\n163#1:1115\n229#1:1258\n229#1:1259,6\n229#1:1293\n229#1:1299\n263#1:1301\n263#1:1302,6\n263#1:1336\n263#1:1342\n292#1:1344,3\n292#1:1375\n299#1:1376\n299#1:1377,6\n299#1:1411\n299#1:1417\n292#1:1433\n479#1:1447,3\n479#1:1478\n486#1:1479\n486#1:1480,6\n486#1:1514\n486#1:1561\n520#1:1563\n520#1:1564,7\n520#1:1599\n520#1:1617\n479#1:1621\n406#1:1660\n406#1:1661,5\n406#1:1694\n406#1:1706\n427#1:1708\n427#1:1709,6\n427#1:1743\n427#1:1762\n699#1:1813\n699#1:1814,6\n699#1:1848\n699#1:1853\n592#1:1891,3\n592#1:1922\n598#1:1923\n598#1:1924,6\n598#1:1958\n620#1:1998\n620#1:1999,7\n620#1:2034\n620#1:2040\n598#1:2048\n592#1:2054\n679#1:2057,3\n679#1:2088\n690#1:2089\n690#1:2090,7\n690#1:2125\n690#1:2146\n679#1:2150\n144#1:924\n144#1:931\n412#1:1695\n412#1:1702\n342#1:1122\n342#1:1123,5\n342#1:1156\n342#1:1203\n607#1:1769\n607#1:1770,7\n607#1:1805\n607#1:1810\n570#1:1224\n89#1:1236\n90#1:1237\n91#1:1238\n92#1:1239\n95#1:1240\n95#1:1241,2\n96#1:1243\n96#1:1244,2\n97#1:1246\n97#1:1247,2\n98#1:1249\n98#1:1250,2\n105#1:1252,5\n379#1:1434,12\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/ChatGroupScreenKt.dex */
public final class ChatGroupScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AdminChatMessageCard$lambda$103(ChatMessage chatMessage, boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AdminChatMessageCard(chatMessage, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$82(MainViewModel mainViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChatGroupScreen(mainViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0763 A[EDGE_INSN: B:107:0x0763->B:108:0x0763 BREAK  A[LOOP:0: B:95:0x065e->B:103:0x071d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0cc9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0ead  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0ef1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0f3e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1070  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x121d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1229  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x1260  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x14c6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x1513  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x1504  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1276  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x122f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x13aa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x100c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0eff  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0e37 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0d18 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0b05 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0999 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x086c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0666  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ChatGroupScreen(@org.jetbrains.annotations.NotNull final com.example.ui.viewmodel.MainViewModel r175, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r176, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r177, final int r178, final int r179) {
        /*
            Method dump skipped, instructions count: 5422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.ChatGroupScreen(com.example.ui.viewmodel.MainViewModel, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final UserProfile ChatGroupScreen$lambda$0(State<UserProfile> state) {
        return (UserProfile) state.getValue();
    }

    private static final ChatGroup ChatGroupScreen$lambda$1(State<ChatGroup> state) {
        return (ChatGroup) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ChatMessage> ChatGroupScreen$lambda$2(State<? extends List<ChatMessage>> state) {
        return (List) state.getValue();
    }

    private static final CloudSyncStatus ChatGroupScreen$lambda$3(State<CloudSyncStatus> state) {
        return (CloudSyncStatus) state.getValue();
    }

    private static final boolean ChatGroupScreen$lambda$5(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void ChatGroupScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatGroupScreen$lambda$8(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final String ChatGroupScreen$lambda$11(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    private static final boolean ChatGroupScreen$lambda$14(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final DisposableEffectResult ChatGroupScreen$lambda$18$lambda$17(final MainViewModel $viewModel, DisposableEffectScope $this$DisposableEffect) {
        Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect");
        $viewModel.startLiveChatPolling();
        return new DisposableEffectResult() { // from class: com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$lambda$18$lambda$17$$inlined$onDispose$1
            public void dispose() {
                MainViewModel.this.stopLiveChatPolling();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$38$lambda$25$lambda$24$lambda$22$lambda$21(MainViewModel $viewModel, ChatGroup $group) {
        $viewModel.selectChatGroup($group);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit ChatGroupScreen$lambda$79$lambda$38$lambda$25$lambda$24$lambda$23(ChatGroup $group, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C148@5717L52:ChatGroupScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-863657425, $changed, -1, "com.example.ui.screens.ChatGroupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatGroupScreen.kt:148)");
            }
            TextKt.Text--4IGK_g($group.getIconEmoji() + " " + StringsKt.take($group.getName(), 22) + "...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$38$lambda$37$lambda$36$lambda$29$lambda$28(MainViewModel $viewModel) {
        $viewModel.triggerChatSync();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ChatGroupScreen$lambda$79$lambda$38$lambda$37$lambda$36$lambda$31(androidx.compose.runtime.State r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$38$lambda$37$lambda$36$lambda$31(androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$38$lambda$37$lambda$36$lambda$33$lambda$32(MutableState $showLoginDialog$delegate) {
        ChatGroupScreen$lambda$6($showLoginDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ChatGroupScreen$lambda$79$lambda$38$lambda$37$lambda$36$lambda$35(boolean r51, androidx.compose.runtime.State r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$38$lambda$37$lambda$36$lambda$35(boolean, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ChatGroupScreen$lambda$79$lambda$45(final com.example.ui.viewmodel.MainViewModel r76, boolean r77, androidx.compose.runtime.State r78, final androidx.compose.runtime.MutableState r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$45(com.example.ui.viewmodel.MainViewModel, boolean, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$45$lambda$44$lambda$41$lambda$40(MainViewModel $viewModel) {
        $viewModel.logout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$45$lambda$44$lambda$43$lambda$42(MutableState $showLoginDialog$delegate) {
        ChatGroupScreen$lambda$6($showLoginDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$53$lambda$52(State $messages$delegate, final boolean $isAdmin, final MainViewModel $viewModel, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        final List ChatGroupScreen$lambda$2 = ChatGroupScreen$lambda$2($messages$delegate);
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.ChatGroupScreenKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$53$lambda$52$lambda$48((ChatMessage) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$lambda$79$lambda$53$lambda$52$$inlined$items$default$1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m22invoke((ChatMessage) p1);
            }

            @Nullable
            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m22invoke(ChatMessage chatMessage) {
                return null;
            }
        };
        $this$LazyColumn.items(ChatGroupScreen$lambda$2.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$lambda$79$lambda$53$lambda$52$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @NotNull
            public final Object invoke(int index) {
                return function1.invoke(ChatGroupScreen$lambda$2.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$lambda$79$lambda$53$lambda$52$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @Nullable
            public final Object invoke(int index) {
                return function12.invoke(ChatGroupScreen$lambda$2.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$lambda$79$lambda$53$lambda$52$$inlined$items$default$4
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
                Object obj2;
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
                final ChatMessage chatMessage = (ChatMessage) ChatGroupScreen$lambda$2.get(it);
                $composer.startReplaceGroup(-406089244);
                ComposerKt.sourceInformation($composer, "C*382@14662L35,383@14721L36,379@14557L212:ChatGroupScreen.kt#2thlc2");
                boolean z = $isAdmin;
                ComposerKt.sourceInformationMarkerStart($composer, 125450862, "CC(remember):ChatGroupScreen.kt#9igjgp");
                boolean changedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(chatMessage)) || (i & 48) == 32);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    final MainViewModel mainViewModel = $viewModel;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$4$4$1$2$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m23invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m23invoke() {
                            MainViewModel.this.deleteMessage(chatMessage.getId());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                Function0 function0 = (Function0) obj;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 125452751, "CC(remember):ChatGroupScreen.kt#9igjgp");
                boolean changedInstance2 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(chatMessage)) || (i & 48) == 32);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    final MainViewModel mainViewModel2 = $viewModel;
                    obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.ChatGroupScreenKt$ChatGroupScreen$4$4$1$2$2$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m24invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24invoke() {
                            MainViewModel.this.reactToMessage(chatMessage.getId());
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ChatGroupScreenKt.AdminChatMessageCard(chatMessage, z, function0, (Function0) obj2, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object ChatGroupScreen$lambda$79$lambda$53$lambda$52$lambda$48(ChatMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03c2 A[EDGE_INSN: B:49:0x03c2->B:50:0x03c2 BREAK  A[LOOP:0: B:37:0x02f4->B:45:0x034a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ChatGroupScreen$lambda$79$lambda$78(boolean r102, final androidx.compose.runtime.MutableState r103, final com.example.ui.viewmodel.MainViewModel r104, final androidx.compose.runtime.MutableState r105, final androidx.compose.runtime.MutableState r106, final androidx.compose.runtime.MutableState r107, androidx.compose.runtime.Composer r108, int r109) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$78(boolean, androidx.compose.runtime.MutableState, com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$58$lambda$57$lambda$55$lambda$54(String $tag, MutableState $selectedTag$delegate) {
        $selectedTag$delegate.setValue($tag);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$58$lambda$57$lambda$56(String $tag, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C415@15784L27:ChatGroupScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1450553260, $changed, -1, "com.example.ui.screens.ChatGroupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatGroupScreen.kt:415)");
            }
            TextKt.Text--4IGK_g($tag, (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 3072, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$65$lambda$60$lambda$59(MutableState $messageInputText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $messageInputText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$65$lambda$64$lambda$63(final MainViewModel $viewModel, final MutableState $messageInputText$delegate, MutableState $selectedTag$delegate, MutableState $isPinnedAnnouncement$delegate) {
        $viewModel.sendAdminChatMessage(ChatGroupScreen$lambda$8($messageInputText$delegate), ChatGroupScreen$lambda$11($selectedTag$delegate), ChatGroupScreen$lambda$14($isPinnedAnnouncement$delegate), new Function0() { // from class: com.example.ui.screens.ChatGroupScreenKt$$ExternalSyntheticLambda12
            public final Object invoke() {
                return ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$65$lambda$64$lambda$63$lambda$61($messageInputText$delegate);
            }
        }, new Function1() { // from class: com.example.ui.screens.ChatGroupScreenKt$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(MainViewModel.this, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$65$lambda$64$lambda$63$lambda$61(MutableState $messageInputText$delegate) {
        $messageInputText$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$66$lambda$65$lambda$64$lambda$63$lambda$62(MainViewModel $viewModel, String err) {
        Intrinsics.checkNotNullParameter(err, "err");
        $viewModel.showFeedback(err);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ChatGroupScreen$lambda$79$lambda$78$lambda$77(final com.example.ui.viewmodel.MainViewModel r104, final androidx.compose.runtime.MutableState r105, androidx.compose.runtime.Composer r106, int r107) {
        /*
            Method dump skipped, instructions count: 1803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$78$lambda$77(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$77$lambda$76$lambda$75$lambda$72$lambda$71(final MainViewModel $viewModel) {
        $viewModel.loginWithPhoneNumber("+94721160032", "Shihab (Mosque Admin)", UserRole.ADMIN, "shihab2415", "Verified Mosque Administrator", "Bogawantalawa Town Jummah Mosque (Hatton & Bogawantalawa)", new Function0() { // from class: com.example.ui.screens.ChatGroupScreenKt$$ExternalSyntheticLambda31
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, new Function1() { // from class: com.example.ui.screens.ChatGroupScreenKt$$ExternalSyntheticLambda32
            public final Object invoke(Object obj) {
                return ChatGroupScreenKt.ChatGroupScreen$lambda$79$lambda$78$lambda$77$lambda$76$lambda$75$lambda$72$lambda$71$lambda$70(MainViewModel.this, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$77$lambda$76$lambda$75$lambda$72$lambda$71$lambda$70(MainViewModel $viewModel, String err) {
        Intrinsics.checkNotNullParameter(err, "err");
        $viewModel.showFeedback(err);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$79$lambda$78$lambda$77$lambda$76$lambda$75$lambda$74$lambda$73(MutableState $showLoginDialog$delegate) {
        ChatGroupScreen$lambda$6($showLoginDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ChatGroupScreen$lambda$81$lambda$80(MutableState $showLoginDialog$delegate) {
        ChatGroupScreen$lambda$6($showLoginDialog$delegate, false);
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void AdminChatMessageCard(@NotNull final ChatMessage message, final boolean canDelete, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @Nullable Composer $composer, final int $changed) {
        final boolean z;
        Context context;
        Object format;
        float f;
        long j;
        long j2;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(function0, "onDelete");
        Intrinsics.checkNotNullParameter(function02, "onReact");
        Composer $composer3 = $composer.startRestartGroup(-1820340576);
        ComposerKt.sourceInformation($composer3, "C(AdminChatMessageCard)P(1)569@21149L7,570@21179L108,584@21672L164,587@21867L38,588@21910L6650,574@21291L7269:ChatGroupScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            z = canDelete;
            $dirty |= $composer3.changed(z) ? 32 : 16;
        } else {
            z = canDelete;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820340576, $dirty, -1, "com.example.ui.screens.AdminChatMessageCard (ChatGroupScreen.kt:568)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context2 = (Context) consume;
            long timestamp = message.getTimestamp();
            ComposerKt.sourceInformationMarkerStart($composer3, -1295597780, "CC(remember):ChatGroupScreen.kt#9igjgp");
            boolean changed = $composer3.changed(timestamp);
            Object rememberedValue = $composer3.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                context = context2;
                format = new SimpleDateFormat("hh:mm a", Locale.US).format(new Date(message.getTimestamp()));
                $composer3.updateRememberedValue(format);
            } else {
                context = context2;
                format = rememberedValue;
            }
            final String timeFormatted = (String) format;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18)));
            if (message.isPinned()) {
                f = Dp.constructor-impl((float) 1.5d);
            } else {
                f = Dp.constructor-impl(1);
            }
            if (message.isPinned()) {
                $composer3.startReplaceGroup(-1295587893);
                $composer3.endReplaceGroup();
                j = ColorKt.getIslamicGold();
            } else {
                $composer3.startReplaceGroup(-1295586514);
                ComposerKt.sourceInformation($composer3, "580@21522L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOutlineVariant-0d7_KjU();
                $composer3.endReplaceGroup();
            }
            Modifier testTag = TestTagKt.testTag(BorderKt.border-xT4_qwU(clip, f, j, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(18))), "chat_message_" + message.getId());
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            if (message.isPinned()) {
                $composer3.startReplaceGroup(-1295578893);
                ComposerKt.sourceInformation($composer3, "585@21743L11");
                j2 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            } else {
                $composer3.startReplaceGroup(-1295577273);
                ComposerKt.sourceInformation($composer3, "585@21811L11");
                j2 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU();
            }
            $composer3.endReplaceGroup();
            final Context context3 = context;
            CardKt.Card(testTag, (Shape) null, cardDefaults.cardColors-ro_MJ88(j2, 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-767718162, true, new Function3() { // from class: com.example.ui.screens.ChatGroupScreenKt$$ExternalSyntheticLambda8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatGroupScreenKt.AdminChatMessageCard$lambda$102(ChatMessage.this, timeFormatted, function02, context3, z, function0, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 196608, 18);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.ChatGroupScreenKt$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2) {
                    return ChatGroupScreenKt.AdminChatMessageCard$lambda$103(ChatMessage.this, canDelete, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0c03 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0646 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0525 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x09bc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AdminChatMessageCard$lambda$102(final com.example.data.model.ChatMessage r162, final java.lang.String r163, final kotlin.jvm.functions.Function0 r164, final android.content.Context r165, boolean r166, kotlin.jvm.functions.Function0 r167, androidx.compose.foundation.layout.ColumnScope r168, androidx.compose.runtime.Composer r169, int r170) {
        /*
            Method dump skipped, instructions count: 3539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.AdminChatMessageCard$lambda$102(com.example.data.model.ChatMessage, java.lang.String, kotlin.jvm.functions.Function0, android.content.Context, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AdminChatMessageCard$lambda$102$lambda$101$lambda$90$lambda$88$lambda$85(boolean r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.AdminChatMessageCard$lambda$102$lambda$101$lambda$90$lambda$88$lambda$85(boolean, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AdminChatMessageCard$lambda$102$lambda$101$lambda$90$lambda$89(ChatMessage $message, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C655@24529L10,653@24453L301:ChatGroupScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(88672862, $changed, -1, "com.example.ui.screens.AdminChatMessageCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatGroupScreen.kt:653)");
            }
            String tag = $message.getTag();
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            TextKt.Text--4IGK_g(tag, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(6), Dp.constructor-impl(2)), ColorKt.getIslamicGold(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 200112, 0, 65488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AdminChatMessageCard$lambda$102$lambda$101$lambda$100$lambda$99$lambda$92$lambda$91(Function0 $onReact) {
        $onReact.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01dc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AdminChatMessageCard$lambda$102$lambda$101$lambda$100$lambda$99$lambda$94(com.example.data.model.ChatMessage r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ChatGroupScreenKt.AdminChatMessageCard$lambda$102$lambda$101$lambda$100$lambda$99$lambda$94(com.example.data.model.ChatMessage, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AdminChatMessageCard$lambda$102$lambda$101$lambda$100$lambda$99$lambda$98$lambda$97(Context $context, ChatMessage $message, String $timeFormatted) {
        StringBuilder sb = new StringBuilder();
        String senderMosque = $message.getSenderMosque();
        if (senderMosque == null) {
            senderMosque = "Official Mosque Announcement";
        }
        sb.append("📢 *" + senderMosque + "*\n");
        String tag = $message.getTag();
        if (!(tag == null || StringsKt.isBlank(tag))) {
            sb.append("📌 [" + $message.getTag() + "]\n");
        }
        sb.append("\n" + $message.getText() + "\n\n");
        sb.append("👤 Posted by: " + $message.getSenderName());
        String senderDesignation = $message.getSenderDesignation();
        if (!(senderDesignation == null || StringsKt.isBlank(senderDesignation))) {
            sb.append(" (" + $message.getSenderDesignation() + ")");
        }
        sb.append("\n🕒 " + $timeFormatted);
        sb.append("\n📲 Sri Lanka Muslim Community & Prayer Tracker");
        String shareText = sb.toString();
        Intent sendIntent = new Intent();
        sendIntent.setAction("android.intent.action.SEND");
        sendIntent.putExtra("android.intent.extra.TEXT", shareText);
        sendIntent.setType("text/plain");
        $context.startActivity(Intent.createChooser(sendIntent, "Share Announcement to Other Apps"));
        return Unit.INSTANCE;
    }
}
