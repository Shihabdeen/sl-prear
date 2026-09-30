package com.example.ui.screens;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VolumeUpKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuItemColors;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import com.example.data.model.AlertSoundType;
import com.example.data.model.District;
import com.example.data.model.PrayerType;
import com.example.data.model.UserProfile;
import com.example.data.model.UserRole;
import com.example.ui.theme.ColorKt;
import com.example.ui.theme.ThemeMode;
import com.example.ui.viewmodel.MainViewModel;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AlertsAndSettingsScreen.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a=\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\u0016\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"AlertsAndSettingsScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/viewmodel/MainViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ThemeOptionChip", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrayerAlertSettingItem", "prayer", "Lcom/example/data/model/PrayerType;", "selectedSound", "Lcom/example/data/model/AlertSoundType;", "onSoundSelected", "Lkotlin/Function1;", "onTestSound", "(Lcom/example/data/model/PrayerType;Lcom/example/data/model/AlertSoundType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "themeMode", "Lcom/example/ui/theme/ThemeMode;", "prayerAlerts", "", "selectedDistrict", "Lcom/example/data/model/District;", "currentUser", "Lcom/example/data/model/UserProfile;", "isMakkahAdhanPlaying", "makkahAdhanPrayerName", "showLoginDialog", "showPrivacyPolicyDialog", "isMenuOpen"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlertsAndSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertsAndSettingsScreen.kt\ncom/example/ui/screens/AlertsAndSettingsScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 12 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,841:1\n1225#2,6:842\n1225#2,6:848\n1225#2,6:856\n1225#2,6:862\n1225#2,6:868\n1225#2,6:875\n1225#2,6:883\n1225#2,6:1140\n1225#2,6:1268\n1225#2,6:1361\n1225#2,6:1367\n1225#2,6:1373\n1225#2,6:1757\n1225#2,6:1764\n1225#2,6:2019\n1225#2,6:2026\n1225#2,6:2033\n1225#2,6:2045\n1225#2,6:2140\n1225#2,6:2245\n1225#2,6:2401\n1225#2,6:2408\n148#3:854\n148#3:855\n148#3:874\n148#3:881\n148#3:882\n148#3:889\n148#3:890\n148#3:940\n148#3:945\n148#3:1050\n148#3:1051\n148#3:1126\n148#3:1127\n148#3:1255\n148#3:1256\n148#3:1261\n148#3:1266\n148#3:1267\n148#3:1282\n158#3:1283\n148#3:1284\n148#3:1285\n148#3:1286\n148#3:1287\n148#3:1324\n148#3:1325\n148#3:1387\n148#3:1388\n148#3:1389\n148#3:1463\n148#3:1468\n148#3:1506\n148#3:1511\n148#3:1549\n148#3:1558\n148#3:1663\n148#3:1664\n148#3:1665\n148#3:1711\n148#3:1716\n148#3:1717\n148#3:1718\n148#3:1719\n148#3:1720\n148#3:1756\n148#3:1763\n148#3:1778\n148#3:1779\n148#3:1817\n148#3:1822\n148#3:1927\n148#3:1928\n148#3:1929\n148#3:1975\n148#3:1980\n148#3:1981\n148#3:1982\n148#3:2018\n148#3:2025\n148#3:2032\n148#3:2043\n148#3:2044\n148#3:2055\n148#3:2056\n148#3:2057\n148#3:2094\n148#3:2099\n148#3:2100\n148#3:2101\n148#3:2138\n148#3:2139\n148#3:2146\n148#3:2151\n148#3:2152\n148#3:2165\n148#3:2198\n148#3:2199\n148#3:2239\n148#3:2252\n148#3:2358\n148#3:2363\n148#3:2407\n81#4:891\n81#4:892\n81#4:893\n81#4:894\n81#4:895\n81#4:896\n81#4:897\n107#4,2:898\n81#4:900\n107#4,2:901\n81#4:2204\n107#4,2:2205\n71#5:903\n67#5,7:904\n74#5:939\n78#5:944\n71#5:1780\n67#5,7:1781\n74#5:1816\n78#5:1821\n71#5:2364\n67#5,7:2365\n74#5:2400\n78#5:2417\n78#6,6:911\n85#6,4:926\n89#6,2:936\n93#6:943\n78#6,6:953\n85#6,4:968\n89#6,2:978\n78#6,6:985\n85#6,4:1000\n89#6,2:1010\n78#6,6:1021\n85#6,4:1036\n89#6,2:1046\n78#6,6:1060\n85#6,4:1075\n89#6,2:1085\n78#6,6:1097\n85#6,4:1112\n89#6,2:1122\n93#6:1130\n93#6:1134\n93#6:1138\n93#6:1148\n78#6,6:1153\n85#6,4:1168\n89#6,2:1178\n78#6,6:1189\n85#6,4:1204\n89#6,2:1214\n78#6,6:1226\n85#6,4:1241\n89#6,2:1251\n93#6:1259\n93#6:1264\n93#6:1276\n93#6:1280\n78#6,6:1295\n85#6,4:1310\n89#6,2:1320\n78#6,6:1332\n85#6,4:1347\n89#6,2:1357\n93#6:1381\n93#6:1385\n78#6,6:1397\n85#6,4:1412\n89#6,2:1422\n78#6,6:1434\n85#6,4:1449\n89#6,2:1459\n93#6:1466\n78#6,6:1477\n85#6,4:1492\n89#6,2:1502\n93#6:1509\n78#6,6:1520\n85#6,4:1535\n89#6,2:1545\n93#6:1552\n93#6:1556\n78#6,6:1566\n85#6,4:1581\n89#6,2:1591\n78#6,6:1598\n85#6,4:1613\n89#6,2:1623\n78#6,6:1634\n85#6,4:1649\n89#6,2:1659\n78#6,6:1674\n85#6,4:1689\n89#6,2:1699\n93#6:1705\n93#6:1709\n93#6:1714\n78#6,6:1727\n85#6,4:1742\n89#6,2:1752\n93#6:1772\n93#6:1776\n78#6,6:1788\n85#6,4:1803\n89#6,2:1813\n93#6:1820\n78#6,6:1830\n85#6,4:1845\n89#6,2:1855\n78#6,6:1862\n85#6,4:1877\n89#6,2:1887\n78#6,6:1898\n85#6,4:1913\n89#6,2:1923\n78#6,6:1938\n85#6,4:1953\n89#6,2:1963\n93#6:1969\n93#6:1973\n93#6:1978\n78#6,6:1989\n85#6,4:2004\n89#6,2:2014\n93#6:2041\n93#6:2053\n78#6,6:2065\n85#6,4:2080\n89#6,2:2090\n93#6:2097\n78#6,6:2109\n85#6,4:2124\n89#6,2:2134\n93#6:2149\n78#6,6:2169\n85#6,4:2184\n89#6,2:2194\n93#6:2202\n78#6,6:2210\n85#6,4:2225\n89#6,2:2235\n93#6:2242\n78#6,6:2256\n85#6,4:2271\n89#6,2:2281\n78#6,6:2292\n85#6,4:2307\n89#6,2:2317\n78#6,6:2329\n85#6,4:2344\n89#6,2:2354\n93#6:2361\n78#6,6:2372\n85#6,4:2387\n89#6,2:2397\n93#6:2416\n93#6:2420\n93#6:2424\n368#7,9:917\n377#7:938\n378#7,2:941\n368#7,9:959\n377#7:980\n368#7,9:991\n377#7:1012\n368#7,9:1027\n377#7:1048\n368#7,9:1066\n377#7:1087\n368#7,9:1103\n377#7:1124\n378#7,2:1128\n378#7,2:1132\n378#7,2:1136\n378#7,2:1146\n368#7,9:1159\n377#7:1180\n368#7,9:1195\n377#7:1216\n368#7,9:1232\n377#7:1253\n378#7,2:1257\n378#7,2:1262\n378#7,2:1274\n378#7,2:1278\n368#7,9:1301\n377#7:1322\n368#7,9:1338\n377#7:1359\n378#7,2:1379\n378#7,2:1383\n368#7,9:1403\n377#7:1424\n368#7,9:1440\n377#7:1461\n378#7,2:1464\n368#7,9:1483\n377#7:1504\n378#7,2:1507\n368#7,9:1526\n377#7:1547\n378#7,2:1550\n378#7,2:1554\n368#7,9:1572\n377#7:1593\n368#7,9:1604\n377#7:1625\n368#7,9:1640\n377#7:1661\n368#7,9:1680\n377#7:1701\n378#7,2:1703\n378#7,2:1707\n378#7,2:1712\n368#7,9:1733\n377#7:1754\n378#7,2:1770\n378#7,2:1774\n368#7,9:1794\n377#7:1815\n378#7,2:1818\n368#7,9:1836\n377#7:1857\n368#7,9:1868\n377#7:1889\n368#7,9:1904\n377#7:1925\n368#7,9:1944\n377#7:1965\n378#7,2:1967\n378#7,2:1971\n378#7,2:1976\n368#7,9:1995\n377#7:2016\n378#7,2:2039\n378#7,2:2051\n368#7,9:2071\n377#7:2092\n378#7,2:2095\n368#7,9:2115\n377#7:2136\n378#7,2:2147\n368#7,9:2175\n377#7:2196\n378#7,2:2200\n368#7,9:2216\n377#7:2237\n378#7,2:2240\n368#7,9:2262\n377#7:2283\n368#7,9:2298\n377#7:2319\n368#7,9:2335\n377#7:2356\n378#7,2:2359\n368#7,9:2378\n377#7:2399\n378#7,2:2414\n378#7,2:2418\n378#7,2:2422\n4032#8,6:930\n4032#8,6:972\n4032#8,6:1004\n4032#8,6:1040\n4032#8,6:1079\n4032#8,6:1116\n4032#8,6:1172\n4032#8,6:1208\n4032#8,6:1245\n4032#8,6:1314\n4032#8,6:1351\n4032#8,6:1416\n4032#8,6:1453\n4032#8,6:1496\n4032#8,6:1539\n4032#8,6:1585\n4032#8,6:1617\n4032#8,6:1653\n4032#8,6:1693\n4032#8,6:1746\n4032#8,6:1807\n4032#8,6:1849\n4032#8,6:1881\n4032#8,6:1917\n4032#8,6:1957\n4032#8,6:2008\n4032#8,6:2084\n4032#8,6:2128\n4032#8,6:2188\n4032#8,6:2229\n4032#8,6:2275\n4032#8,6:2311\n4032#8,6:2348\n4032#8,6:2391\n85#9:946\n82#9,6:947\n88#9:981\n85#9:1052\n81#9,7:1053\n88#9:1088\n92#9:1135\n85#9:1182\n82#9,6:1183\n88#9:1217\n92#9:1265\n92#9:1281\n85#9:1288\n82#9,6:1289\n88#9:1323\n92#9:1386\n85#9:1390\n82#9,6:1391\n88#9:1425\n92#9:1557\n85#9:1559\n82#9,6:1560\n88#9:1594\n85#9:1666\n81#9,7:1667\n88#9:1702\n92#9:1706\n92#9:1777\n85#9:1823\n82#9,6:1824\n88#9:1858\n85#9:1930\n81#9,7:1931\n88#9:1966\n92#9:1970\n92#9:2054\n85#9:2058\n82#9,6:2059\n88#9:2093\n92#9:2098\n85#9:2102\n82#9,6:2103\n88#9:2137\n92#9:2150\n85#9,3:2166\n88#9:2197\n92#9:2203\n85#9:2285\n82#9,6:2286\n88#9:2320\n92#9:2421\n98#10,3:982\n101#10:1013\n98#10:1014\n95#10,6:1015\n101#10:1049\n98#10:1089\n94#10,7:1090\n101#10:1125\n105#10:1131\n105#10:1139\n105#10:1149\n98#10,3:1150\n101#10:1181\n98#10:1218\n94#10,7:1219\n101#10:1254\n105#10:1260\n105#10:1277\n98#10:1326\n96#10,5:1327\n101#10:1360\n105#10:1382\n98#10:1426\n94#10,7:1427\n101#10:1462\n105#10:1467\n98#10:1469\n94#10,7:1470\n101#10:1505\n105#10:1510\n98#10:1512\n94#10,7:1513\n101#10:1548\n105#10:1553\n98#10,3:1595\n101#10:1626\n98#10:1627\n95#10,6:1628\n101#10:1662\n105#10:1710\n105#10:1715\n98#10:1721\n96#10,5:1722\n101#10:1755\n105#10:1773\n98#10,3:1859\n101#10:1890\n98#10:1891\n95#10,6:1892\n101#10:1926\n105#10:1974\n105#10:1979\n98#10:1983\n96#10,5:1984\n101#10:2017\n105#10:2042\n98#10,3:2207\n101#10:2238\n105#10:2243\n98#10,3:2253\n101#10:2284\n98#10:2321\n94#10,7:2322\n101#10:2357\n105#10:2362\n105#10:2425\n215#11,12:2153\n13472#12:2244\n13473#12:2251\n*S KotlinDebug\n*F\n+ 1 AlertsAndSettingsScreen.kt\ncom/example/ui/screens/AlertsAndSettingsScreenKt\n*L\n83#1:842,6\n84#1:848,6\n92#1:856,6\n688#1:862,6\n694#1:868,6\n713#1:875,6\n746#1:883,6\n193#1:1140,6\n233#1:1268,6\n272#1:1361,6\n280#1:1367,6\n288#1:1373,6\n424#1:1757,6\n434#1:1764,6\n536#1:2019,6\n549#1:2026,6\n562#1:2033,6\n577#1:2045,6\n669#1:2140,6\n820#1:2245,6\n789#1:2401,6\n795#1:2408,6\n90#1:854\n91#1:855\n712#1:874\n715#1:881\n717#1:882\n751#1:889\n754#1:890\n149#1:940\n127#1:945\n142#1:1050\n154#1:1051\n165#1:1126\n170#1:1127\n212#1:1255\n214#1:1256\n222#1:1261\n230#1:1266\n234#1:1267\n115#1:1282\n117#1:1283\n117#1:1284\n119#1:1285\n125#1:1286\n255#1:1287\n262#1:1324\n266#1:1325\n250#1:1387\n253#1:1388\n378#1:1389\n381#1:1463\n389#1:1468\n392#1:1506\n404#1:1511\n407#1:1549\n306#1:1558\n317#1:1663\n319#1:1664\n330#1:1665\n348#1:1711\n361#1:1716\n370#1:1717\n374#1:1718\n417#1:1719\n421#1:1720\n425#1:1756\n435#1:1763\n301#1:1778\n304#1:1779\n482#1:1817\n461#1:1822\n472#1:1927\n475#1:1928\n486#1:1929\n505#1:1975\n519#1:1980\n528#1:1981\n532#1:1982\n538#1:2018\n550#1:2025\n563#1:2032\n574#1:2043\n578#1:2044\n453#1:2055\n459#1:2056\n618#1:2057\n625#1:2094\n614#1:2099\n616#1:2100\n651#1:2101\n658#1:2138\n666#1:2139\n673#1:2146\n646#1:2151\n649#1:2152\n723#1:2165\n727#1:2198\n728#1:2199\n815#1:2239\n759#1:2252\n771#1:2358\n779#1:2363\n790#1:2407\n76#1:891\n77#1:892\n78#1:893\n79#1:894\n80#1:895\n81#1:896\n83#1:897\n83#1:898,2\n84#1:900\n84#1:901,2\n746#1:2204\n746#1:2205,2\n144#1:903\n144#1:904,7\n144#1:939\n144#1:944\n477#1:1780\n477#1:1781,7\n477#1:1816\n477#1:1821\n782#1:2364\n782#1:2365,7\n782#1:2400\n782#1:2417\n144#1:911,6\n144#1:926,4\n144#1:936,2\n144#1:943\n127#1:953,6\n127#1:968,4\n127#1:978,2\n130#1:985,6\n130#1:1000,4\n130#1:1010,2\n135#1:1021,6\n135#1:1036,4\n135#1:1046,2\n156#1:1060,6\n156#1:1075,4\n156#1:1085,2\n157#1:1097,6\n157#1:1112,4\n157#1:1122,2\n157#1:1130\n156#1:1134\n135#1:1138\n130#1:1148\n201#1:1153,6\n201#1:1168,4\n201#1:1178,2\n206#1:1189,6\n206#1:1204,4\n206#1:1214,2\n207#1:1226,6\n207#1:1241,4\n207#1:1251,2\n207#1:1259\n206#1:1264\n201#1:1276\n127#1:1280\n255#1:1295,6\n255#1:1310,4\n255#1:1320,2\n264#1:1332,6\n264#1:1347,4\n264#1:1357,2\n264#1:1381\n255#1:1385\n378#1:1397,6\n378#1:1412,4\n378#1:1422,2\n379#1:1434,6\n379#1:1449,4\n379#1:1459,2\n379#1:1466\n390#1:1477,6\n390#1:1492,4\n390#1:1502,2\n390#1:1509\n405#1:1520,6\n405#1:1535,4\n405#1:1545,2\n405#1:1552\n378#1:1556\n306#1:1566,6\n306#1:1581,4\n306#1:1591,2\n307#1:1598,6\n307#1:1613,4\n307#1:1623,2\n312#1:1634,6\n312#1:1649,4\n312#1:1659,2\n331#1:1674,6\n331#1:1689,4\n331#1:1699,2\n331#1:1705\n312#1:1709\n307#1:1714\n419#1:1727,6\n419#1:1742,4\n419#1:1752,2\n419#1:1772\n306#1:1776\n477#1:1788,6\n477#1:1803,4\n477#1:1813,2\n477#1:1820\n461#1:1830,6\n461#1:1845,4\n461#1:1855,2\n462#1:1862,6\n462#1:1877,4\n462#1:1887,2\n467#1:1898,6\n467#1:1913,4\n467#1:1923,2\n487#1:1938,6\n487#1:1953,4\n487#1:1963,2\n487#1:1969\n467#1:1973\n462#1:1978\n530#1:1989,6\n530#1:2004,4\n530#1:2014,2\n530#1:2041\n461#1:2053\n618#1:2065,6\n618#1:2080,4\n618#1:2090,2\n618#1:2097\n651#1:2109,6\n651#1:2124,4\n651#1:2134,2\n651#1:2149\n722#1:2169,6\n722#1:2184,4\n722#1:2194,2\n722#1:2202\n800#1:2210,6\n800#1:2225,4\n800#1:2235,2\n800#1:2242\n756#1:2256,6\n756#1:2271,4\n756#1:2281,2\n763#1:2292,6\n763#1:2307,4\n763#1:2317,2\n764#1:2329,6\n764#1:2344,4\n764#1:2354,2\n764#1:2361\n782#1:2372,6\n782#1:2387,4\n782#1:2397,2\n782#1:2416\n763#1:2420\n756#1:2424\n144#1:917,9\n144#1:938\n144#1:941,2\n127#1:959,9\n127#1:980\n130#1:991,9\n130#1:1012\n135#1:1027,9\n135#1:1048\n156#1:1066,9\n156#1:1087\n157#1:1103,9\n157#1:1124\n157#1:1128,2\n156#1:1132,2\n135#1:1136,2\n130#1:1146,2\n201#1:1159,9\n201#1:1180\n206#1:1195,9\n206#1:1216\n207#1:1232,9\n207#1:1253\n207#1:1257,2\n206#1:1262,2\n201#1:1274,2\n127#1:1278,2\n255#1:1301,9\n255#1:1322\n264#1:1338,9\n264#1:1359\n264#1:1379,2\n255#1:1383,2\n378#1:1403,9\n378#1:1424\n379#1:1440,9\n379#1:1461\n379#1:1464,2\n390#1:1483,9\n390#1:1504\n390#1:1507,2\n405#1:1526,9\n405#1:1547\n405#1:1550,2\n378#1:1554,2\n306#1:1572,9\n306#1:1593\n307#1:1604,9\n307#1:1625\n312#1:1640,9\n312#1:1661\n331#1:1680,9\n331#1:1701\n331#1:1703,2\n312#1:1707,2\n307#1:1712,2\n419#1:1733,9\n419#1:1754\n419#1:1770,2\n306#1:1774,2\n477#1:1794,9\n477#1:1815\n477#1:1818,2\n461#1:1836,9\n461#1:1857\n462#1:1868,9\n462#1:1889\n467#1:1904,9\n467#1:1925\n487#1:1944,9\n487#1:1965\n487#1:1967,2\n467#1:1971,2\n462#1:1976,2\n530#1:1995,9\n530#1:2016\n530#1:2039,2\n461#1:2051,2\n618#1:2071,9\n618#1:2092\n618#1:2095,2\n651#1:2115,9\n651#1:2136\n651#1:2147,2\n722#1:2175,9\n722#1:2196\n722#1:2200,2\n800#1:2216,9\n800#1:2237\n800#1:2240,2\n756#1:2262,9\n756#1:2283\n763#1:2298,9\n763#1:2319\n764#1:2335,9\n764#1:2356\n764#1:2359,2\n782#1:2378,9\n782#1:2399\n782#1:2414,2\n763#1:2418,2\n756#1:2422,2\n144#1:930,6\n127#1:972,6\n130#1:1004,6\n135#1:1040,6\n156#1:1079,6\n157#1:1116,6\n201#1:1172,6\n206#1:1208,6\n207#1:1245,6\n255#1:1314,6\n264#1:1351,6\n378#1:1416,6\n379#1:1453,6\n390#1:1496,6\n405#1:1539,6\n306#1:1585,6\n307#1:1617,6\n312#1:1653,6\n331#1:1693,6\n419#1:1746,6\n477#1:1807,6\n461#1:1849,6\n462#1:1881,6\n467#1:1917,6\n487#1:1957,6\n530#1:2008,6\n618#1:2084,6\n651#1:2128,6\n722#1:2188,6\n800#1:2229,6\n756#1:2275,6\n763#1:2311,6\n764#1:2348,6\n782#1:2391,6\n127#1:946\n127#1:947,6\n127#1:981\n156#1:1052\n156#1:1053,7\n156#1:1088\n156#1:1135\n206#1:1182\n206#1:1183,6\n206#1:1217\n206#1:1265\n127#1:1281\n255#1:1288\n255#1:1289,6\n255#1:1323\n255#1:1386\n378#1:1390\n378#1:1391,6\n378#1:1425\n378#1:1557\n306#1:1559\n306#1:1560,6\n306#1:1594\n331#1:1666\n331#1:1667,7\n331#1:1702\n331#1:1706\n306#1:1777\n461#1:1823\n461#1:1824,6\n461#1:1858\n487#1:1930\n487#1:1931,7\n487#1:1966\n487#1:1970\n461#1:2054\n618#1:2058\n618#1:2059,6\n618#1:2093\n618#1:2098\n651#1:2102\n651#1:2103,6\n651#1:2137\n651#1:2150\n722#1:2166,3\n722#1:2197\n722#1:2203\n763#1:2285\n763#1:2286,6\n763#1:2320\n763#1:2421\n130#1:982,3\n130#1:1013\n135#1:1014\n135#1:1015,6\n135#1:1049\n157#1:1089\n157#1:1090,7\n157#1:1125\n157#1:1131\n135#1:1139\n130#1:1149\n201#1:1150,3\n201#1:1181\n207#1:1218\n207#1:1219,7\n207#1:1254\n207#1:1260\n201#1:1277\n264#1:1326\n264#1:1327,5\n264#1:1360\n264#1:1382\n379#1:1426\n379#1:1427,7\n379#1:1462\n379#1:1467\n390#1:1469\n390#1:1470,7\n390#1:1505\n390#1:1510\n405#1:1512\n405#1:1513,7\n405#1:1548\n405#1:1553\n307#1:1595,3\n307#1:1626\n312#1:1627\n312#1:1628,6\n312#1:1662\n312#1:1710\n307#1:1715\n419#1:1721\n419#1:1722,5\n419#1:1755\n419#1:1773\n462#1:1859,3\n462#1:1890\n467#1:1891\n467#1:1892,6\n467#1:1926\n467#1:1974\n462#1:1979\n530#1:1983\n530#1:1984,5\n530#1:2017\n530#1:2042\n800#1:2207,3\n800#1:2238\n800#1:2243\n756#1:2253,3\n756#1:2284\n764#1:2321\n764#1:2322,7\n764#1:2357\n764#1:2362\n756#1:2425\n599#1:2153,12\n797#1:2244\n797#1:2251\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/AlertsAndSettingsScreenKt.dex */
public final class AlertsAndSettingsScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$88(MainViewModel mainViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AlertsAndSettingsScreen(mainViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerAlertSettingItem$lambda$113(PrayerType prayerType, AlertSoundType alertSoundType, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        PrayerAlertSettingItem(prayerType, alertSoundType, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeOptionChip$lambda$93(String str, ImageVector imageVector, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ThemeOptionChip(str, imageVector, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void AlertsAndSettingsScreen(@NotNull final MainViewModel viewModel, @Nullable Modifier modifier, @Nullable Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        MutableState showLoginDialog$delegate;
        Object obj;
        final MutableState showLoginDialog$delegate2;
        final State currentUser$delegate;
        final MutableState showPrivacyPolicyDialog$delegate;
        Composer $composer2;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer $composer3 = $composer.startRestartGroup(1963077962);
        ComposerKt.sourceInformation($composer3, "C(AlertsAndSettingsScreen)P(1)75@3361L16,76@3423L16,77@3493L16,78@3553L16,79@3631L16,80@3711L16,82@3754L34,83@3822L34,91@4102L23589,85@3860L23831:AlertsAndSettingsScreen.kt#2thlc2");
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
            Modifier modifier3 = i2 != 0 ? (Modifier) Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1963077962, $dirty2, -1, "com.example.ui.screens.AlertsAndSettingsScreen (AlertsAndSettingsScreen.kt:74)");
            }
            final State themeMode$delegate = SnapshotStateKt.collectAsState(viewModel.getThemeMode(), (CoroutineContext) null, $composer3, 0, 1);
            final State prayerAlerts$delegate = SnapshotStateKt.collectAsState(viewModel.getPrayerAlerts(), (CoroutineContext) null, $composer3, 0, 1);
            final State selectedDistrict$delegate = SnapshotStateKt.collectAsState(viewModel.getSelectedDistrict(), (CoroutineContext) null, $composer3, 0, 1);
            State currentUser$delegate2 = SnapshotStateKt.collectAsState(viewModel.getCurrentUser(), (CoroutineContext) null, $composer3, 0, 1);
            final State isMakkahAdhanPlaying$delegate = SnapshotStateKt.collectAsState(viewModel.isMakkahAdhanPlaying(), (CoroutineContext) null, $composer3, 0, 1);
            SnapshotStateKt.collectAsState(viewModel.getMakkahAdhanPrayerName(), (CoroutineContext) null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, 1027295756, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(rememberedValue);
            }
            MutableState showLoginDialog$delegate3 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1027297932, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                showLoginDialog$delegate = showLoginDialog$delegate3;
                rememberedValue2 = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(rememberedValue2);
            } else {
                showLoginDialog$delegate = showLoginDialog$delegate3;
            }
            MutableState showPrivacyPolicyDialog$delegate2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, (Object) null), "settings_screen");
            Modifier modifier4 = modifier3;
            PaddingValues paddingValues = PaddingKt.PaddingValues-a9UjIt4(Dp.constructor-impl(16), Dp.constructor-impl(8), Dp.constructor-impl(16), Dp.constructor-impl(96));
            Arrangement.Vertical vertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl(16));
            ComposerKt.sourceInformationMarkerStart($composer3, 1027330447, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
            boolean changed = $composer3.changed(currentUser$delegate2) | $composer3.changedInstance(viewModel) | $composer3.changed(themeMode$delegate) | $composer3.changed(selectedDistrict$delegate) | $composer3.changed(isMakkahAdhanPlaying$delegate) | $composer3.changed(prayerAlerts$delegate);
            Object rememberedValue3 = $composer3.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                showLoginDialog$delegate2 = showLoginDialog$delegate;
                currentUser$delegate = currentUser$delegate2;
                showPrivacyPolicyDialog$delegate = showPrivacyPolicyDialog$delegate2;
                obj = new Function1() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj4) {
                        return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82(currentUser$delegate, viewModel, showLoginDialog$delegate2, themeMode$delegate, selectedDistrict$delegate, isMakkahAdhanPlaying$delegate, prayerAlerts$delegate, showPrivacyPolicyDialog$delegate, (LazyListScope) obj4);
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue3;
                currentUser$delegate = currentUser$delegate2;
                showLoginDialog$delegate2 = showLoginDialog$delegate;
                showPrivacyPolicyDialog$delegate = showPrivacyPolicyDialog$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LazyDslKt.LazyColumn(testTag, (LazyListState) null, paddingValues, false, vertical, (Alignment.Horizontal) null, (FlingBehavior) null, false, (Function1) obj, $composer3, 24576, 234);
            $composer2 = $composer3;
            if (AlertsAndSettingsScreen$lambda$7(showLoginDialog$delegate2)) {
                $composer2.startReplaceGroup(1805169964);
                ComposerKt.sourceInformation($composer2, "687@27787L27,685@27722L98");
                ComposerKt.sourceInformationMarkerStart($composer2, 1028064805, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
                Object rememberedValue4 = $composer2.rememberedValue();
                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                    obj3 = new Function0() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda10
                        public final Object invoke() {
                            return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$85$lambda$84(showLoginDialog$delegate2);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                } else {
                    obj3 = rememberedValue4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                PhoneLoginDialogKt.PhoneLoginDialog(viewModel, (Function0) obj3, $composer2, ($dirty2 & 14) | 48);
            } else {
                $composer2.startReplaceGroup(1777671352);
            }
            $composer2.endReplaceGroup();
            if (AlertsAndSettingsScreen$lambda$10(showPrivacyPolicyDialog$delegate)) {
                $composer2.startReplaceGroup(1805309278);
                ComposerKt.sourceInformation($composer2, "693@27902L35,692@27863L80");
                ComposerKt.sourceInformationMarkerStart($composer2, 1028068493, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
                Object rememberedValue5 = $composer2.rememberedValue();
                if (rememberedValue5 == Composer.Companion.getEmpty()) {
                    obj2 = new Function0() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda11
                        public final Object invoke() {
                            return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$87$lambda$86(showPrivacyPolicyDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                PrivacyPolicyDialogKt.PrivacyPolicyDialog((Function0) obj2, $composer2, 6);
            } else {
                $composer2.startReplaceGroup(1777671352);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda12
                public final Object invoke(Object obj4, Object obj5) {
                    return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$88(MainViewModel.this, modifier2, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final ThemeMode AlertsAndSettingsScreen$lambda$0(State<? extends ThemeMode> state) {
        return (ThemeMode) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, AlertSoundType> AlertsAndSettingsScreen$lambda$1(State<? extends Map<String, ? extends AlertSoundType>> state) {
        return (Map) state.getValue();
    }

    private static final District AlertsAndSettingsScreen$lambda$2(State<District> state) {
        return (District) state.getValue();
    }

    private static final UserProfile AlertsAndSettingsScreen$lambda$3(State<UserProfile> state) {
        return (UserProfile) state.getValue();
    }

    private static final boolean AlertsAndSettingsScreen$lambda$4(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final String AlertsAndSettingsScreen$lambda$5(State<String> state) {
        return (String) state.getValue();
    }

    private static final boolean AlertsAndSettingsScreen$lambda$7(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void AlertsAndSettingsScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean AlertsAndSettingsScreen$lambda$10(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void AlertsAndSettingsScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82(final State $currentUser$delegate, final MainViewModel $viewModel, final MutableState $showLoginDialog$delegate, final State $themeMode$delegate, final State $selectedDistrict$delegate, final State $isMakkahAdhanPlaying$delegate, final State $prayerAlerts$delegate, final MutableState $showPrivacyPolicyDialog$delegate, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$AlertsAndSettingsScreenKt.INSTANCE.m28getLambda$1811040458$app(), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-212805281, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda17
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27($currentUser$delegate, $viewModel, $showLoginDialog$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-628132098, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda18
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37(MainViewModel.this, $themeMode$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1043458915, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda19
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53($selectedDistrict$delegate, $viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1458785732, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda20
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70($isMakkahAdhanPlaying$delegate, $viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$AlertsAndSettingsScreenKt.INSTANCE.m29getLambda$1874112549$app(), 3, (Object) null);
        final Object[] values = PrayerType.values();
        final Function1 function1 = new Function1() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$AlertsAndSettingsScreen$lambda$83$lambda$82$$inlined$items$default$1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m20invoke((PrayerType) p1);
            }

            @Nullable
            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m20invoke(PrayerType prayerType) {
                return null;
            }
        };
        $this$LazyColumn.items(values.length, (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$AlertsAndSettingsScreen$lambda$83$lambda$82$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @Nullable
            public final Object invoke(int index) {
                return function1.invoke(values[index]);
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$AlertsAndSettingsScreen$lambda$83$lambda$82$$inlined$items$default$4
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
                Map AlertsAndSettingsScreen$lambda$1;
                Object obj;
                Object obj2;
                ComposerKt.sourceInformation($composer, "C224@10590L22:LazyDsl.kt#428nma");
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
                    ComposerKt.traceEventStart(-1043393750, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:224)");
                }
                int i = $dirty & 14;
                final PrayerType prayerType = (PrayerType) values[it];
                $composer.startReplaceGroup(-6773356);
                ComposerKt.sourceInformation($composer, "C*603@24403L57,604@24484L48,600@24290L250:AlertsAndSettingsScreen.kt#2thlc2");
                AlertsAndSettingsScreen$lambda$1 = AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$1($prayerAlerts$delegate);
                AlertSoundType alertSoundType = (AlertSoundType) AlertsAndSettingsScreen$lambda$1.get(prayerType.name());
                if (alertSoundType == null) {
                    alertSoundType = AlertSoundType.ADHAN_MAKKAH;
                }
                ComposerKt.sourceInformationMarkerStart($composer, -1662780516, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
                boolean changedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(prayerType.ordinal())) || (i & 48) == 32);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    final MainViewModel mainViewModel = $viewModel;
                    obj = (Function1) new Function1<AlertSoundType, Unit>() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$AlertsAndSettingsScreen$1$1$5$1$1
                        public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                            invoke((AlertSoundType) p1);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AlertSoundType sound) {
                            Intrinsics.checkNotNullParameter(sound, "sound");
                            MainViewModel.this.setPrayerAlertSound(prayerType, sound);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                Function1 function12 = (Function1) obj;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1662777933, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
                boolean changedInstance2 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(prayerType.ordinal())) || (i & 48) == 32);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    final MainViewModel mainViewModel2 = $viewModel;
                    obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$AlertsAndSettingsScreen$1$1$5$2$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m21invoke() {
                            MainViewModel.this.testAdhanAlert(prayerType.getDisplayName());
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AlertsAndSettingsScreenKt.PrayerAlertSettingItem(prayerType, alertSoundType, function12, (Function0) obj2, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(2005527930, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda21
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$76($selectedDistrict$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(1590201113, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda22
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$81($showPrivacyPolicyDialog$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27(final State $currentUser$delegate, final MainViewModel $viewModel, final MutableState $showLoginDialog$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        float f;
        long j;
        long j2;
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C121@5145L190,124@5370L38,125@5417L4881,111@4697L5601:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-212805281, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:111)");
            }
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20)));
            UserProfile AlertsAndSettingsScreen$lambda$3 = AlertsAndSettingsScreen$lambda$3($currentUser$delegate);
            if ((AlertsAndSettingsScreen$lambda$3 != null ? AlertsAndSettingsScreen$lambda$3.getRole() : null) == UserRole.ADMIN) {
                f = Dp.constructor-impl((float) 1.5d);
            } else {
                f = Dp.constructor-impl(1);
            }
            UserProfile AlertsAndSettingsScreen$lambda$32 = AlertsAndSettingsScreen$lambda$3($currentUser$delegate);
            if ((AlertsAndSettingsScreen$lambda$32 != null ? AlertsAndSettingsScreen$lambda$32.getRole() : null) == UserRole.ADMIN) {
                $composer.startReplaceGroup(1652563818);
                $composer.endReplaceGroup();
                j = ColorKt.getIslamicGold();
            } else {
                $composer.startReplaceGroup(1652565197);
                ComposerKt.sourceInformation($composer, "117@4990L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU();
                $composer.endReplaceGroup();
            }
            Modifier testTag = TestTagKt.testTag(BorderKt.border-xT4_qwU(clip, f, j, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "phone_auth_card");
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            UserProfile AlertsAndSettingsScreen$lambda$33 = AlertsAndSettingsScreen$lambda$3($currentUser$delegate);
            if ((AlertsAndSettingsScreen$lambda$33 != null ? AlertsAndSettingsScreen$lambda$33.getRole() : null) == UserRole.ADMIN) {
                $composer.startReplaceGroup(1652573713);
                ComposerKt.sourceInformation($composer, "122@5239L11");
                j2 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            } else {
                $composer.startReplaceGroup(1652575302);
                ComposerKt.sourceInformation($composer, "122@5306L11");
                j2 = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU();
            }
            $composer.endReplaceGroup();
            CardKt.Card(testTag, (Shape) null, cardDefaults.cardColors-ro_MJ88(j2, 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1914922541, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda35
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27$lambda$26($currentUser$delegate, $viewModel, $showLoginDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0df1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0c36 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x074e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27$lambda$26(androidx.compose.runtime.State r155, final com.example.ui.viewmodel.MainViewModel r156, final androidx.compose.runtime.MutableState r157, androidx.compose.foundation.layout.ColumnScope r158, androidx.compose.runtime.Composer r159, int r160) {
        /*
            Method dump skipped, instructions count: 3675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27$lambda$26(androidx.compose.runtime.State, com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27$lambda$26$lambda$25$lambda$19$lambda$16$lambda$13(com.example.data.model.UserProfile r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27$lambda$26$lambda$25$lambda$19$lambda$16$lambda$13(com.example.data.model.UserProfile, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27$lambda$26$lambda$25$lambda$19$lambda$18$lambda$17(MainViewModel $viewModel) {
        $viewModel.logout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(MutableState $showLoginDialog$delegate) {
        AlertsAndSettingsScreen$lambda$8($showLoginDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37(final MainViewModel $viewModel, final State $themeMode$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C251@10580L11,251@10538L62,252@10635L38,253@10682L1385,246@10361L1706:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-628132098, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:246)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "theme_selection_card"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1499595724, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda13
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37$lambda$36(MainViewModel.this, $themeMode$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0247  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37$lambda$36(final com.example.ui.viewmodel.MainViewModel r65, androidx.compose.runtime.State r66, androidx.compose.foundation.layout.ColumnScope r67, androidx.compose.runtime.Composer r68, int r69) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37$lambda$36(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37$lambda$36$lambda$35$lambda$34$lambda$29$lambda$28(MainViewModel $viewModel) {
        $viewModel.setThemeMode(ThemeMode.SYSTEM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37$lambda$36$lambda$35$lambda$34$lambda$31$lambda$30(MainViewModel $viewModel) {
        $viewModel.setThemeMode(ThemeMode.LIGHT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$37$lambda$36$lambda$35$lambda$34$lambda$33$lambda$32(MainViewModel $viewModel) {
        $viewModel.setThemeMode(ThemeMode.DARK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53(final State $selectedDistrict$delegate, final MainViewModel $viewModel, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C302@12358L11,302@12316L62,303@12413L38,304@12460L5723,297@12135L6048:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043458915, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:297)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "workmanager_service_card"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1084268907, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53$lambda$52($selectedDistrict$delegate, $viewModel, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53$lambda$52(final androidx.compose.runtime.State r125, final com.example.ui.viewmodel.MainViewModel r126, androidx.compose.foundation.layout.ColumnScope r127, androidx.compose.runtime.Composer r128, int r129) {
        /*
            Method dump skipped, instructions count: 2479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53$lambda$52(androidx.compose.runtime.State, com.example.ui.viewmodel.MainViewModel, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53$lambda$52$lambda$51$lambda$45(com.example.ui.viewmodel.MainViewModel r104, androidx.compose.runtime.State r105, androidx.compose.runtime.Composer r106, int r107) {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53$lambda$52$lambda$51$lambda$45(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53$lambda$52$lambda$51$lambda$50$lambda$47$lambda$46(MainViewModel $viewModel) {
        $viewModel.reschedulePrayerNotifications();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$53$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48(MainViewModel $viewModel) {
        $viewModel.triggerWorkManagerTestAdhan(PrayerType.FAJR);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70(final State $isMakkahAdhanPlaying$delegate, final MainViewModel $viewModel, LazyItemScope $this$item, Composer $composer, int $changed) {
        long j;
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C454@18424L176,458@18635L38,459@18682L5210,449@18245L5647:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1458785732, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:449)");
            }
            Modifier testTag = TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "makkah_azan_alarm_card");
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            if (AlertsAndSettingsScreen$lambda$4($isMakkahAdhanPlaying$delegate)) {
                $composer.startReplaceGroup(-1733741043);
                ComposerKt.sourceInformation($composer, "455@18503L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getTertiaryContainer-0d7_KjU();
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1733739156);
                ComposerKt.sourceInformation($composer, "456@18562L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                $composer.endReplaceGroup();
            }
            CardKt.Card(testTag, (Shape) null, cardDefaults.cardColors-ro_MJ88(j, 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(668942090, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda39
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69(MainViewModel.this, $isMakkahAdhanPlaying$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0929  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69(final com.example.ui.viewmodel.MainViewModel r125, final androidx.compose.runtime.State r126, androidx.compose.foundation.layout.ColumnScope r127, androidx.compose.runtime.Composer r128, int r129) {
        /*
            Method dump skipped, instructions count: 2829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69$lambda$68$lambda$58$lambda$57$lambda$55(androidx.compose.runtime.State r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69$lambda$68$lambda$58$lambda$57$lambda$55(androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69$lambda$68$lambda$65$lambda$60$lambda$59(MainViewModel $viewModel) {
        $viewModel.stopMakkahAzan();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69$lambda$68$lambda$65$lambda$62$lambda$61(MainViewModel $viewModel) {
        $viewModel.playMakkahAzan("Fajr");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69$lambda$68$lambda$65$lambda$64$lambda$63(MainViewModel $viewModel) {
        $viewModel.testAdhanAlert("Fajr");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66(MainViewModel $viewModel) {
        $viewModel.setAllPrayersToMakkahAzan();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$76(final State $selectedDistrict$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C614@24781L11,614@24739L69,615@24843L38,616@24890L1032,610@24605L1317:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005527930, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:610)");
            }
            CardKt.Card(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-161711544, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda28
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$76$lambda$75($selectedDistrict$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$76$lambda$75(State $selectedDistrict$delegate, ColumnScope $this$Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C617@24900L1014:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-161711544, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:617)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1955593956, "C620@25054L10,622@25153L11,618@24955L238,624@25204L40,632@25776L10,633@25832L11,625@25255L649:AlertsAndSettingsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Sri Lanka Astronomical Prayer Method", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 196614, 0, 65498);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(6)), $composer, 6);
            TextKt.Text--4IGK_g("• Standard: All Ceylon Jam'iyyathul Ulama (ACJU) & Muslim World League\n• Fajr: 18.0° Dawn Sun Angle\n• Isha: 18.0° Twilight Sun Angle\n• Asr: Standard Shafi'i Juristic Method (Shadow ratio 1)\n• Timezone: UTC+5:30 (Sri Lanka Standard Time)\n• Active District: " + AlertsAndSettingsScreen$lambda$2($selectedDistrict$delegate).getName() + " (" + AlertsAndSettingsScreen$lambda$2($selectedDistrict$delegate).getLatitude() + "° N, " + AlertsAndSettingsScreen$lambda$2($selectedDistrict$delegate).getLongitude() + "° E)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 6, 64506);
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
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$81(final MutableState $showPrivacyPolicyDialog$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C647@26205L11,647@26163L69,648@26267L38,649@26314L1367,642@25987L1694:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590201113, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:642)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20))), "privacy_policy_card"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-577038361, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda38
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$81$lambda$80($showPrivacyPolicyDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$81$lambda$80(final MutableState $showPrivacyPolicyDialog$delegate, ColumnScope $this$Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C650@26324L1349:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577038361, $changed, -1, "com.example.ui.screens.AlertsAndSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:650)");
            }
            Modifier modifier = PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.Companion.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1156009042, "C653@26479L10,655@26578L11,651@26379L239,657@26629L40,660@26879L10,661@26935L11,658@26680L347,665@27039L41,668@27122L34,673@27398L11,673@27354L64,667@27092L571:AlertsAndSettingsScreen.kt#2thlc2");
            TextKt.Text--4IGK_g("Privacy & App Information (தனியுரிமை)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 196614, 0, 65498);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g("SL Prayer is strictly offline-first. Your location, prayer counts, and personal activity remain private on your device without tracking.", (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 6, 64506);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, Dp.constructor-impl(12)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -730004749, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda27
                    public final Object invoke() {
                        return AlertsAndSettingsScreenKt.AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77($showPrivacyPolicyDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) rememberedValue, TestTagKt.testTag(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), "open_privacy_policy_btn"), false, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(12)), ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, (MutableInteractionSource) null, ComposableSingletons$AlertsAndSettingsScreenKt.INSTANCE.getLambda$982247105$app(), $composer, 805306422, 484);
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
    public static final Unit AlertsAndSettingsScreen$lambda$83$lambda$82$lambda$81$lambda$80$lambda$79$lambda$78$lambda$77(MutableState $showPrivacyPolicyDialog$delegate) {
        AlertsAndSettingsScreen$lambda$11($showPrivacyPolicyDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$85$lambda$84(MutableState $showLoginDialog$delegate) {
        AlertsAndSettingsScreen$lambda$8($showLoginDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AlertsAndSettingsScreen$lambda$87$lambda$86(MutableState $showPrivacyPolicyDialog$delegate) {
        AlertsAndSettingsScreen$lambda$11($showPrivacyPolicyDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ThemeOptionChip(@org.jetbrains.annotations.NotNull final java.lang.String r22, @org.jetbrains.annotations.NotNull final androidx.compose.ui.graphics.vector.ImageVector r23, final boolean r24, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.ThemeOptionChip(java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeOptionChip$lambda$90$lambda$89(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0196  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ThemeOptionChip$lambda$92(androidx.compose.ui.graphics.vector.ImageVector r51, long r52, boolean r54, java.lang.String r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.ThemeOptionChip$lambda$92(androidx.compose.ui.graphics.vector.ImageVector, long, boolean, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PrayerAlertSettingItem(@NotNull final PrayerType prayer, @NotNull final AlertSoundType selectedSound, @NotNull final Function1<? super AlertSoundType, Unit> function1, @NotNull final Function0<Unit> function0, @Nullable Composer $composer, final int $changed) {
        Object obj;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(prayer, "prayer");
        Intrinsics.checkNotNullParameter(selectedSound, "selectedSound");
        Intrinsics.checkNotNullParameter(function1, "onSoundSelected");
        Intrinsics.checkNotNullParameter(function0, "onTestSound");
        Composer $composer3 = $composer.startRestartGroup(-581655568);
        ComposerKt.sourceInformation($composer3, "C(PrayerAlertSettingItem)P(2,3)745@29557L34,752@29810L11,752@29768L62,753@29861L38,754@29904L2954,747@29595L3263:AlertsAndSettingsScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(prayer.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(selectedSound.ordinal()) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581655568, $dirty, -1, "com.example.ui.screens.PrayerAlertSettingItem (AlertsAndSettingsScreen.kt:744)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -625246254, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                obj = SnapshotStateKt.mutableStateOf$default(false, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState isMenuOpen$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16)));
            String lowerCase = prayer.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            CardKt.Card(TestTagKt.testTag(clip, "alert_row_" + lowerCase), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1466431938, true, new Function3() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda36
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return AlertsAndSettingsScreenKt.PrayerAlertSettingItem$lambda$112(function0, prayer, selectedSound, isMenuOpen$delegate, function1, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 196608, 18);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda37
                public final Object invoke(Object obj2, Object obj3) {
                    return AlertsAndSettingsScreenKt.PrayerAlertSettingItem$lambda$113(PrayerType.this, selectedSound, function1, function0, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean PrayerAlertSettingItem$lambda$95(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void PrayerAlertSettingItem$lambda$96(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fe  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PrayerAlertSettingItem$lambda$112(kotlin.jvm.functions.Function0 r104, final com.example.data.model.PrayerType r105, final com.example.data.model.AlertSoundType r106, final androidx.compose.runtime.MutableState r107, final kotlin.jvm.functions.Function1 r108, androidx.compose.foundation.layout.ColumnScope r109, androidx.compose.runtime.Composer r110, int r111) {
        /*
            Method dump skipped, instructions count: 1807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.PrayerAlertSettingItem$lambda$112(kotlin.jvm.functions.Function0, com.example.data.model.PrayerType, com.example.data.model.AlertSoundType, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$99$lambda$98(MutableState $isMenuOpen$delegate) {
        PrayerAlertSettingItem$lambda$96($isMenuOpen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$101$lambda$100(MutableState $isMenuOpen$delegate) {
        PrayerAlertSettingItem$lambda$96($isMenuOpen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$107(final Function1 $onSoundSelected, final AlertSoundType $selectedSound, final MutableState $isMenuOpen$delegate, ColumnScope $this$DropdownMenu, Composer $composer, int $changed) {
        int i;
        Object obj;
        Function2 function2;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter($this$DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*798@31418L965,819@32411L97,797@31377L1147:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079756583, $changed, -1, "com.example.ui.screens.PrayerAlertSettingItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:796)");
            }
            AlertSoundType[] values = AlertSoundType.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                final AlertSoundType alertSoundType = values[i2];
                Function2 rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1710916555, true, new Function2() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda40
                    public final Object invoke(Object obj2, Object obj3) {
                        return AlertsAndSettingsScreenKt.PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$103(AlertSoundType.this, $selectedSound, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -860494458, "CC(remember):AlertsAndSettingsScreen.kt#9igjgp");
                boolean changed = composer.changed($onSoundSelected) | composer.changed(alertSoundType.ordinal());
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    i = length;
                    function2 = rememberComposableLambda;
                    obj = new Function0() { // from class: com.example.ui.screens.AlertsAndSettingsScreenKt$$ExternalSyntheticLambda41
                        public final Object invoke() {
                            return AlertsAndSettingsScreenKt.PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$105$lambda$104($onSoundSelected, alertSoundType, $isMenuOpen$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    i = length;
                    function2 = rememberComposableLambda;
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(function2, (Function0) obj, (Modifier) null, (Function2) null, (Function2) null, false, (MenuItemColors) null, (PaddingValues) null, (MutableInteractionSource) null, composer, 6, 508);
                i2++;
                composer = $composer;
                length = i;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0152  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$103(com.example.data.model.AlertSoundType r51, com.example.data.model.AlertSoundType r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.AlertsAndSettingsScreenKt.PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$103(com.example.data.model.AlertSoundType, com.example.data.model.AlertSoundType, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerAlertSettingItem$lambda$112$lambda$111$lambda$109$lambda$108$lambda$107$lambda$106$lambda$105$lambda$104(Function1 $onSoundSelected, AlertSoundType $sound, MutableState $isMenuOpen$delegate) {
        $onSoundSelected.invoke($sound);
        PrayerAlertSettingItem$lambda$96($isMenuOpen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PrayerAlertSettingItem$lambda$112$lambda$111$lambda$110(PrayerType $prayer, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C834@32811L11,831@32655L185:AlertsAndSettingsScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-318620835, $changed, -1, "com.example.ui.screens.PrayerAlertSettingItem.<anonymous>.<anonymous>.<anonymous> (AlertsAndSettingsScreen.kt:831)");
            }
            IconKt.Icon-ww6aTOc(VolumeUpKt.getVolumeUp(Icons.INSTANCE.getDefault()), "Test sound for " + $prayer.getDisplayName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
