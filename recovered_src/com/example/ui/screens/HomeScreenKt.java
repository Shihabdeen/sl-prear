package com.example.ui.screens;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.RadioButtonUncheckedKt;
import androidx.compose.material.icons.filled.VolumeUpKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.example.BuildConfig;
import com.example.data.model.ChatGroup;
import com.example.data.model.ChatMessage;
import com.example.data.model.District;
import com.example.data.model.PrayerModelKt;
import com.example.data.model.PrayerType;
import com.example.data.model.SinglePrayerTime;
import com.example.ui.theme.ColorKt;
import com.example.ui.viewmodel.AppTab;
import com.example.ui.viewmodel.MainViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a1\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\fX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\"X\u008a\u0084\u0002²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bX\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020%X\u008a\u008e\u0002"}, d2 = {"HomeScreen", "", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "onNavigateToTab", "Lkotlin/Function1;", "Lcom/example/ui/viewmodel/AppTab;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/viewmodel/MainViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrayerTimeRowItem", "prayer", "Lcom/example/data/model/SinglePrayerTime;", "onToggleCompleted", "Lkotlin/Function0;", "onTestAlert", "(Lcom/example/data/model/SinglePrayerTime;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HomeAdminAnnouncementCard", "message", "Lcom/example/data/model/ChatMessage;", "onReact", "onOpenChat", "(Lcom/example/data/model/ChatMessage;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "selectedDistrict", "Lcom/example/data/model/District;", "calculatedPrayers", "", "nextPrayer", "countdownText", "", "progressPercent", "", "completedPrayers", "", "adminMessages", "isMakkahAdhanPlaying", "", "makkahAdhanPrayerName", "isDistrictMenuOpen"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreen.kt\ncom/example/ui/screens/HomeScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,1124:1\n1225#2,6:1125\n1225#2,6:1139\n1225#2,6:1151\n1225#2,6:1291\n1225#2,6:1389\n1225#2,6:1467\n1225#2,6:1474\n1225#2,6:1762\n1225#2,6:1892\n1225#2,6:1948\n1225#2,6:1957\n1225#2,6:1966\n1225#2,6:1980\n1225#2,6:2063\n1225#2,6:2193\n1225#2,6:2204\n1225#2,6:2842\n1225#2,6:2849\n774#3:1131\n865#3,2:1132\n774#3:1134\n865#3,2:1135\n1869#3:1388\n1870#3:1395\n148#4:1137\n148#4:1138\n148#4:1145\n158#4:1146\n148#4:1147\n148#4:1148\n148#4:1149\n148#4:1157\n158#4:1158\n148#4:1159\n148#4:1160\n148#4:1173\n148#4:1242\n148#4:1243\n148#4:1289\n148#4:1290\n148#4:1301\n148#4:1302\n148#4:1303\n148#4:1340\n148#4:1341\n148#4:1342\n148#4:1396\n148#4:1466\n148#4:1473\n148#4:1565\n148#4:1566\n148#4:1567\n148#4:1636\n148#4:1637\n148#4:1642\n148#4:1761\n148#4:1768\n148#4:1769\n148#4:1778\n148#4:1779\n148#4:1821\n148#4:1890\n148#4:1891\n148#4:1898\n148#4:1899\n148#4:1904\n148#4:1905\n148#4:1910\n148#4:1911\n148#4:1912\n148#4:1954\n148#4:1955\n148#4:1956\n148#4:1963\n148#4:1964\n148#4:1965\n148#4:1972\n148#4:1973\n148#4:1974\n148#4:1979\n148#4:1986\n148#4:1987\n148#4:2057\n148#4:2058\n148#4:2069\n148#4:2074\n148#4:2143\n148#4:2144\n148#4:2190\n148#4:2191\n148#4:2192\n148#4:2203\n148#4:2210\n148#4:2235\n148#4:2236\n148#4:2305\n148#4:2306\n148#4:2307\n148#4:2382\n148#4:2383\n148#4:2433\n148#4:2434\n148#4:2484\n148#4:2485\n148#4:2522\n148#4:2527\n148#4:2632\n148#4:2633\n148#4:2708\n148#4:2709\n148#4:2759\n148#4:2760\n148#4:2761\n148#4:2770\n148#4:2771\n148#4:2841\n148#4:2848\n148#4:2855\n148#4:2856\n148#4:2857\n148#4:2858\n148#4:2859\n77#5:1150\n81#6:1161\n81#6:1162\n81#6:1163\n81#6:1164\n81#6:1165\n81#6:1166\n81#6:1167\n81#6:1168\n81#6:1169\n81#6:1170\n107#6,2:1171\n98#7,3:1174\n101#7:1205\n98#7:1206\n95#7,6:1207\n101#7:1241\n105#7:1288\n105#7:1300\n98#7:1304\n95#7,6:1305\n101#7:1339\n105#7:1346\n98#7,3:1397\n101#7:1428\n105#7:1528\n98#7,3:1604\n101#7:1635\n105#7:1641\n98#7,3:1643\n101#7:1674\n105#7:1760\n98#7,3:1822\n101#7:1853\n105#7:1909\n98#7:1913\n96#7,5:1914\n101#7:1947\n105#7:1978\n98#7,3:1988\n101#7:2019\n98#7:2020\n94#7,7:2021\n101#7:2056\n105#7:2062\n105#7:2073\n98#7,3:2075\n101#7:2106\n98#7:2107\n95#7,6:2108\n101#7:2142\n105#7:2189\n105#7:2202\n98#7,3:2237\n101#7:2268\n98#7:2269\n95#7,6:2270\n101#7:2304\n98#7:2345\n94#7,7:2346\n101#7:2381\n105#7:2387\n105#7:2395\n98#7:2396\n94#7,7:2397\n101#7:2432\n105#7:2438\n105#7:2442\n98#7:2486\n95#7,6:2487\n101#7:2521\n105#7:2526\n98#7,3:2564\n101#7:2595\n98#7:2596\n95#7,6:2597\n101#7:2631\n98#7:2671\n94#7,7:2672\n101#7:2707\n105#7:2713\n105#7:2721\n98#7:2722\n94#7,7:2723\n101#7:2758\n105#7:2765\n105#7:2769\n98#7,3:2772\n101#7:2803\n98#7:2804\n94#7,7:2805\n101#7:2840\n105#7:2863\n105#7:2867\n78#8,6:1177\n85#8,4:1192\n89#8,2:1202\n78#8,6:1213\n85#8,4:1228\n89#8,2:1238\n78#8,6:1252\n85#8,4:1267\n89#8,2:1277\n93#8:1283\n93#8:1287\n93#8:1299\n78#8,6:1311\n85#8,4:1326\n89#8,2:1336\n93#8:1345\n78#8,6:1355\n85#8,4:1370\n89#8,2:1380\n93#8:1386\n78#8,6:1400\n85#8,4:1415\n89#8,2:1425\n78#8,6:1437\n85#8,4:1452\n89#8,2:1462\n93#8:1482\n78#8,6:1492\n85#8,4:1507\n89#8,2:1517\n93#8:1523\n93#8:1527\n78#8,6:1536\n85#8,4:1551\n89#8,2:1561\n78#8,6:1575\n85#8,4:1590\n89#8,2:1600\n78#8,6:1607\n85#8,4:1622\n89#8,2:1632\n93#8:1640\n78#8,6:1646\n85#8,4:1661\n89#8,2:1671\n78#8,6:1683\n85#8,4:1698\n89#8,2:1708\n93#8:1714\n78#8,6:1724\n85#8,4:1739\n89#8,2:1749\n93#8:1755\n93#8:1759\n93#8:1772\n93#8:1776\n78#8,6:1788\n85#8,4:1803\n89#8,2:1813\n93#8:1819\n78#8,6:1825\n85#8,4:1840\n89#8,2:1850\n78#8,6:1861\n85#8,4:1876\n89#8,2:1886\n93#8:1902\n93#8:1908\n78#8,6:1919\n85#8,4:1934\n89#8,2:1944\n93#8:1977\n78#8,6:1991\n85#8,4:2006\n89#8,2:2016\n78#8,6:2028\n85#8,4:2043\n89#8,2:2053\n93#8:2061\n93#8:2072\n78#8,6:2078\n85#8,4:2093\n89#8,2:2103\n78#8,6:2114\n85#8,4:2129\n89#8,2:2139\n78#8,6:2153\n85#8,4:2168\n89#8,2:2178\n93#8:2184\n93#8:2188\n93#8:2201\n78#8,6:2240\n85#8,4:2255\n89#8,2:2265\n78#8,6:2276\n85#8,4:2291\n89#8,2:2301\n78#8,6:2316\n85#8,4:2331\n89#8,2:2341\n78#8,6:2353\n85#8,4:2368\n89#8,2:2378\n93#8:2386\n93#8:2390\n93#8:2394\n78#8,6:2404\n85#8,4:2419\n89#8,2:2429\n93#8:2437\n93#8:2441\n78#8,6:2451\n85#8,4:2466\n89#8,2:2476\n93#8:2482\n78#8,6:2493\n85#8,4:2508\n89#8,2:2518\n93#8:2525\n78#8,6:2535\n85#8,4:2550\n89#8,2:2560\n78#8,6:2567\n85#8,4:2582\n89#8,2:2592\n78#8,6:2603\n85#8,4:2618\n89#8,2:2628\n78#8,6:2642\n85#8,4:2657\n89#8,2:2667\n78#8,6:2679\n85#8,4:2694\n89#8,2:2704\n93#8:2712\n93#8:2716\n93#8:2720\n78#8,6:2730\n85#8,4:2745\n89#8,2:2755\n93#8:2764\n93#8:2768\n78#8,6:2775\n85#8,4:2790\n89#8,2:2800\n78#8,6:2812\n85#8,4:2827\n89#8,2:2837\n93#8:2862\n93#8:2866\n93#8:2870\n368#9,9:1183\n377#9:1204\n368#9,9:1219\n377#9:1240\n368#9,9:1258\n377#9:1279\n378#9,2:1281\n378#9,2:1285\n378#9,2:1297\n368#9,9:1317\n377#9:1338\n378#9,2:1343\n368#9,9:1361\n377#9:1382\n378#9,2:1384\n368#9,9:1406\n377#9:1427\n368#9,9:1443\n377#9:1464\n378#9,2:1480\n368#9,9:1498\n377#9:1519\n378#9,2:1521\n378#9,2:1525\n368#9,9:1542\n377#9:1563\n368#9,9:1581\n377#9:1602\n368#9,9:1613\n377#9:1634\n378#9,2:1638\n368#9,9:1652\n377#9:1673\n368#9,9:1689\n377#9:1710\n378#9,2:1712\n368#9,9:1730\n377#9:1751\n378#9,2:1753\n378#9,2:1757\n378#9,2:1770\n378#9,2:1774\n368#9,9:1794\n377#9:1815\n378#9,2:1817\n368#9,9:1831\n377#9:1852\n368#9,9:1867\n377#9:1888\n378#9,2:1900\n378#9,2:1906\n368#9,9:1925\n377#9:1946\n378#9,2:1975\n368#9,9:1997\n377#9:2018\n368#9,9:2034\n377#9:2055\n378#9,2:2059\n378#9,2:2070\n368#9,9:2084\n377#9:2105\n368#9,9:2120\n377#9:2141\n368#9,9:2159\n377#9:2180\n378#9,2:2182\n378#9,2:2186\n378#9,2:2199\n368#9,9:2246\n377#9:2267\n368#9,9:2282\n377#9:2303\n368#9,9:2322\n377#9:2343\n368#9,9:2359\n377#9:2380\n378#9,2:2384\n378#9,2:2388\n378#9,2:2392\n368#9,9:2410\n377#9:2431\n378#9,2:2435\n378#9,2:2439\n368#9,9:2457\n377#9:2478\n378#9,2:2480\n368#9,9:2499\n377#9:2520\n378#9,2:2523\n368#9,9:2541\n377#9:2562\n368#9,9:2573\n377#9:2594\n368#9,9:2609\n377#9:2630\n368#9,9:2648\n377#9:2669\n368#9,9:2685\n377#9:2706\n378#9,2:2710\n378#9,2:2714\n378#9,2:2718\n368#9,9:2736\n377#9:2757\n378#9,2:2762\n378#9,2:2766\n368#9,9:2781\n377#9:2802\n368#9,9:2818\n377#9:2839\n378#9,2:2860\n378#9,2:2864\n378#9,2:2868\n4032#10,6:1196\n4032#10,6:1232\n4032#10,6:1271\n4032#10,6:1330\n4032#10,6:1374\n4032#10,6:1419\n4032#10,6:1456\n4032#10,6:1511\n4032#10,6:1555\n4032#10,6:1594\n4032#10,6:1626\n4032#10,6:1665\n4032#10,6:1702\n4032#10,6:1743\n4032#10,6:1807\n4032#10,6:1844\n4032#10,6:1880\n4032#10,6:1938\n4032#10,6:2010\n4032#10,6:2047\n4032#10,6:2097\n4032#10,6:2133\n4032#10,6:2172\n4032#10,6:2259\n4032#10,6:2295\n4032#10,6:2335\n4032#10,6:2372\n4032#10,6:2423\n4032#10,6:2470\n4032#10,6:2512\n4032#10,6:2554\n4032#10,6:2586\n4032#10,6:2622\n4032#10,6:2661\n4032#10,6:2698\n4032#10,6:2749\n4032#10,6:2794\n4032#10,6:2831\n85#11:1244\n81#11,7:1245\n88#11:1280\n92#11:1284\n85#11:1347\n81#11,7:1348\n88#11:1383\n92#11:1387\n85#11:1484\n81#11,7:1485\n88#11:1520\n92#11:1524\n85#11:1568\n82#11,6:1569\n88#11:1603\n85#11:1675\n81#11,7:1676\n88#11:1711\n92#11:1715\n85#11:1716\n81#11,7:1717\n88#11:1752\n92#11:1756\n92#11:1773\n85#11:1854\n82#11,6:1855\n88#11:1889\n92#11:1903\n85#11:2145\n81#11,7:2146\n88#11:2181\n92#11:2185\n85#11:2308\n81#11,7:2309\n88#11:2344\n92#11:2391\n85#11:2528\n82#11,6:2529\n88#11:2563\n85#11:2634\n81#11,7:2635\n88#11:2670\n92#11:2717\n92#11:2871\n71#12:1429\n67#12,7:1430\n74#12:1465\n78#12:1483\n71#12:1529\n68#12,6:1530\n74#12:1564\n78#12:1777\n71#12:1780\n67#12,7:1781\n74#12:1816\n78#12:1820\n71#12:2443\n67#12,7:2444\n74#12:2479\n78#12:2483\n143#13,12:2211\n143#13,12:2223\n*S KotlinDebug\n*F\n+ 1 HomeScreen.kt\ncom/example/ui/screens/HomeScreenKt\n*L\n102#1:1125,6\n114#1:1139,6\n892#1:1151,6\n161#1:1291,6\n240#1:1389,6\n189#1:1467,6\n222#1:1474,6\n376#1:1762,6\n421#1:1892,6\n459#1:1948,6\n479#1:1957,6\n498#1:1966,6\n523#1:1980,6\n619#1:2063,6\n717#1:2193,6\n677#1:2204,6\n1048#1:2842,6\n1070#1:2849,6\n104#1:1131\n104#1:1132,2\n105#1:1134\n105#1:1135,2\n224#1:1388\n224#1:1395\n112#1:1137\n113#1:1138\n783#1:1145\n785#1:1146\n785#1:1147\n787#1:1148\n791#1:1149\n906#1:1157\n911#1:1158\n911#1:1159\n914#1:1160\n130#1:1173\n142#1:1242\n144#1:1243\n165#1:1289\n166#1:1290\n120#1:1301\n125#1:1302\n195#1:1303\n202#1:1340\n204#1:1341\n215#1:1342\n180#1:1396\n188#1:1466\n192#1:1473\n283#1:1565\n291#1:1566\n306#1:1567\n314#1:1636\n316#1:1637\n335#1:1642\n372#1:1761\n379#1:1768\n380#1:1769\n271#1:1778\n274#1:1779\n402#1:1821\n413#1:1890\n419#1:1891\n424#1:1898\n425#1:1899\n431#1:1904\n436#1:1905\n394#1:1910\n397#1:1911\n455#1:1912\n462#1:1954\n464#1:1955\n466#1:1956\n482#1:1963\n484#1:1964\n485#1:1965\n501#1:1972\n503#1:1973\n504#1:1974\n522#1:1979\n526#1:1986\n590#1:1987\n598#1:2057\n609#1:2058\n620#1:2069\n685#1:2074\n697#1:2143\n699#1:2144\n718#1:2190\n719#1:2191\n720#1:2192\n676#1:2203\n680#1:2210\n876#1:2235\n796#1:2236\n809#1:2305\n818#1:2306\n820#1:2307\n833#1:2382\n835#1:2383\n866#1:2433\n870#1:2434\n1011#1:2484\n1052#1:2485\n1056#1:2522\n916#1:2527\n930#1:2632\n942#1:2633\n952#1:2708\n957#1:2709\n974#1:2759\n976#1:2760\n1002#1:2761\n1018#1:2770\n1028#1:2771\n1045#1:2841\n1066#1:2848\n1092#1:2855\n1103#1:2856\n1107#1:2857\n1108#1:2858\n1109#1:2859\n891#1:1150\n92#1:1161\n93#1:1162\n94#1:1163\n95#1:1164\n96#1:1165\n97#1:1166\n98#1:1167\n99#1:1168\n100#1:1169\n102#1:1170\n102#1:1171,2\n127#1:1174,3\n127#1:1205\n134#1:1206\n134#1:1207,6\n134#1:1241\n134#1:1288\n127#1:1300\n194#1:1304\n194#1:1305,6\n194#1:1339\n194#1:1346\n177#1:1397,3\n177#1:1428\n177#1:1528\n308#1:1604,3\n308#1:1635\n308#1:1641\n337#1:1643,3\n337#1:1674\n337#1:1760\n399#1:1822,3\n399#1:1853\n399#1:1909\n453#1:1913\n453#1:1914,5\n453#1:1947\n453#1:1978\n587#1:1988,3\n587#1:2019\n594#1:2020\n594#1:2021,7\n594#1:2056\n594#1:2062\n587#1:2073\n682#1:2075,3\n682#1:2106\n689#1:2107\n689#1:2108,6\n689#1:2142\n689#1:2189\n682#1:2202\n793#1:2237,3\n793#1:2268\n801#1:2269\n801#1:2270,6\n801#1:2304\n824#1:2345\n824#1:2346,7\n824#1:2381\n824#1:2387\n801#1:2395\n858#1:2396\n858#1:2397,7\n858#1:2432\n858#1:2438\n793#1:2442\n1051#1:2486\n1051#1:2487,6\n1051#1:2521\n1051#1:2526\n918#1:2564,3\n918#1:2595\n923#1:2596\n923#1:2597,6\n923#1:2631\n945#1:2671\n945#1:2672,7\n945#1:2707\n945#1:2713\n923#1:2721\n971#1:2722\n971#1:2723,7\n971#1:2758\n971#1:2765\n918#1:2769\n1031#1:2772,3\n1031#1:2803\n1042#1:2804\n1042#1:2805,7\n1042#1:2840\n1042#1:2863\n1031#1:2867\n127#1:1177,6\n127#1:1192,4\n127#1:1202,2\n134#1:1213,6\n134#1:1228,4\n134#1:1238,2\n145#1:1252,6\n145#1:1267,4\n145#1:1277,2\n145#1:1283\n134#1:1287\n127#1:1299\n194#1:1311,6\n194#1:1326,4\n194#1:1336,2\n194#1:1345\n227#1:1355,6\n227#1:1370,4\n227#1:1380,2\n227#1:1386\n177#1:1400,6\n177#1:1415,4\n177#1:1425,2\n185#1:1437,6\n185#1:1452,4\n185#1:1462,2\n185#1:1482\n250#1:1492,6\n250#1:1507,4\n250#1:1517,2\n250#1:1523\n177#1:1527\n276#1:1536,6\n276#1:1551,4\n276#1:1561,2\n303#1:1575,6\n303#1:1590,4\n303#1:1600,2\n308#1:1607,6\n308#1:1622,4\n308#1:1632,2\n308#1:1640\n337#1:1646,6\n337#1:1661,4\n337#1:1671,2\n342#1:1683,6\n342#1:1698,4\n342#1:1708,2\n342#1:1714\n357#1:1724,6\n357#1:1739,4\n357#1:1749,2\n357#1:1755\n337#1:1759\n303#1:1772\n276#1:1776\n438#1:1788,6\n438#1:1803,4\n438#1:1813,2\n438#1:1819\n399#1:1825,6\n399#1:1840,4\n399#1:1850,2\n406#1:1861,6\n406#1:1876,4\n406#1:1886,2\n406#1:1902\n399#1:1908\n453#1:1919,6\n453#1:1934,4\n453#1:1944,2\n453#1:1977\n587#1:1991,6\n587#1:2006,4\n587#1:2016,2\n594#1:2028,6\n594#1:2043,4\n594#1:2053,2\n594#1:2061\n587#1:2072\n682#1:2078,6\n682#1:2093,4\n682#1:2103,2\n689#1:2114,6\n689#1:2129,4\n689#1:2139,2\n700#1:2153,6\n700#1:2168,4\n700#1:2178,2\n700#1:2184\n689#1:2188\n682#1:2201\n793#1:2240,6\n793#1:2255,4\n793#1:2265,2\n801#1:2276,6\n801#1:2291,4\n801#1:2301,2\n823#1:2316,6\n823#1:2331,4\n823#1:2341,2\n824#1:2353,6\n824#1:2368,4\n824#1:2378,2\n824#1:2386\n823#1:2390\n801#1:2394\n858#1:2404,6\n858#1:2419,4\n858#1:2429,2\n858#1:2437\n793#1:2441\n932#1:2451,6\n932#1:2466,4\n932#1:2476,2\n932#1:2482\n1051#1:2493,6\n1051#1:2508,4\n1051#1:2518,2\n1051#1:2525\n916#1:2535,6\n916#1:2550,4\n916#1:2560,2\n918#1:2567,6\n918#1:2582,4\n918#1:2592,2\n923#1:2603,6\n923#1:2618,4\n923#1:2628,2\n944#1:2642,6\n944#1:2657,4\n944#1:2667,2\n945#1:2679,6\n945#1:2694,4\n945#1:2704,2\n945#1:2712\n944#1:2716\n923#1:2720\n971#1:2730,6\n971#1:2745,4\n971#1:2755,2\n971#1:2764\n918#1:2768\n1031#1:2775,6\n1031#1:2790,4\n1031#1:2800,2\n1042#1:2812,6\n1042#1:2827,4\n1042#1:2837,2\n1042#1:2862\n1031#1:2866\n916#1:2870\n127#1:1183,9\n127#1:1204\n134#1:1219,9\n134#1:1240\n145#1:1258,9\n145#1:1279\n145#1:1281,2\n134#1:1285,2\n127#1:1297,2\n194#1:1317,9\n194#1:1338\n194#1:1343,2\n227#1:1361,9\n227#1:1382\n227#1:1384,2\n177#1:1406,9\n177#1:1427\n185#1:1443,9\n185#1:1464\n185#1:1480,2\n250#1:1498,9\n250#1:1519\n250#1:1521,2\n177#1:1525,2\n276#1:1542,9\n276#1:1563\n303#1:1581,9\n303#1:1602\n308#1:1613,9\n308#1:1634\n308#1:1638,2\n337#1:1652,9\n337#1:1673\n342#1:1689,9\n342#1:1710\n342#1:1712,2\n357#1:1730,9\n357#1:1751\n357#1:1753,2\n337#1:1757,2\n303#1:1770,2\n276#1:1774,2\n438#1:1794,9\n438#1:1815\n438#1:1817,2\n399#1:1831,9\n399#1:1852\n406#1:1867,9\n406#1:1888\n406#1:1900,2\n399#1:1906,2\n453#1:1925,9\n453#1:1946\n453#1:1975,2\n587#1:1997,9\n587#1:2018\n594#1:2034,9\n594#1:2055\n594#1:2059,2\n587#1:2070,2\n682#1:2084,9\n682#1:2105\n689#1:2120,9\n689#1:2141\n700#1:2159,9\n700#1:2180\n700#1:2182,2\n689#1:2186,2\n682#1:2199,2\n793#1:2246,9\n793#1:2267\n801#1:2282,9\n801#1:2303\n823#1:2322,9\n823#1:2343\n824#1:2359,9\n824#1:2380\n824#1:2384,2\n823#1:2388,2\n801#1:2392,2\n858#1:2410,9\n858#1:2431\n858#1:2435,2\n793#1:2439,2\n932#1:2457,9\n932#1:2478\n932#1:2480,2\n1051#1:2499,9\n1051#1:2520\n1051#1:2523,2\n916#1:2541,9\n916#1:2562\n918#1:2573,9\n918#1:2594\n923#1:2609,9\n923#1:2630\n944#1:2648,9\n944#1:2669\n945#1:2685,9\n945#1:2706\n945#1:2710,2\n944#1:2714,2\n923#1:2718,2\n971#1:2736,9\n971#1:2757\n971#1:2762,2\n918#1:2766,2\n1031#1:2781,9\n1031#1:2802\n1042#1:2818,9\n1042#1:2839\n1042#1:2860,2\n1031#1:2864,2\n916#1:2868,2\n127#1:1196,6\n134#1:1232,6\n145#1:1271,6\n194#1:1330,6\n227#1:1374,6\n177#1:1419,6\n185#1:1456,6\n250#1:1511,6\n276#1:1555,6\n303#1:1594,6\n308#1:1626,6\n337#1:1665,6\n342#1:1702,6\n357#1:1743,6\n438#1:1807,6\n399#1:1844,6\n406#1:1880,6\n453#1:1938,6\n587#1:2010,6\n594#1:2047,6\n682#1:2097,6\n689#1:2133,6\n700#1:2172,6\n793#1:2259,6\n801#1:2295,6\n823#1:2335,6\n824#1:2372,6\n858#1:2423,6\n932#1:2470,6\n1051#1:2512,6\n916#1:2554,6\n918#1:2586,6\n923#1:2622,6\n944#1:2661,6\n945#1:2698,6\n971#1:2749,6\n1031#1:2794,6\n1042#1:2831,6\n145#1:1244\n145#1:1245,7\n145#1:1280\n145#1:1284\n227#1:1347\n227#1:1348,7\n227#1:1383\n227#1:1387\n250#1:1484\n250#1:1485,7\n250#1:1520\n250#1:1524\n303#1:1568\n303#1:1569,6\n303#1:1603\n342#1:1675\n342#1:1676,7\n342#1:1711\n342#1:1715\n357#1:1716\n357#1:1717,7\n357#1:1752\n357#1:1756\n303#1:1773\n406#1:1854\n406#1:1855,6\n406#1:1889\n406#1:1903\n700#1:2145\n700#1:2146,7\n700#1:2181\n700#1:2185\n823#1:2308\n823#1:2309,7\n823#1:2344\n823#1:2391\n916#1:2528\n916#1:2529,6\n916#1:2563\n944#1:2634\n944#1:2635,7\n944#1:2670\n944#1:2717\n916#1:2871\n185#1:1429\n185#1:1430,7\n185#1:1465\n185#1:1483\n276#1:1529\n276#1:1530,6\n276#1:1564\n276#1:1777\n438#1:1780\n438#1:1781,7\n438#1:1816\n438#1:1820\n932#1:2443\n932#1:2444,7\n932#1:2479\n932#1:2483\n657#1:2211,12\n753#1:2223,12\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/HomeScreenKt.dex */
public final class HomeScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeAdminAnnouncementCard$lambda$121(ChatMessage chatMessage, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeAdminAnnouncementCard(chatMessage, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$90(MainViewModel mainViewModel, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeScreen(mainViewModel, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PrayerTimeRowItem$lambda$99(SinglePrayerTime singlePrayerTime, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        PrayerTimeRowItem(singlePrayerTime, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x02f6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull final com.example.ui.viewmodel.MainViewModel r35, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super com.example.ui.viewmodel.AppTab, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen(com.example.ui.viewmodel.MainViewModel, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final District HomeScreen$lambda$0(State<District> state) {
        return (District) state.getValue();
    }

    private static final List<SinglePrayerTime> HomeScreen$lambda$1(State<? extends List<SinglePrayerTime>> state) {
        return (List) state.getValue();
    }

    private static final SinglePrayerTime HomeScreen$lambda$2(State<SinglePrayerTime> state) {
        return (SinglePrayerTime) state.getValue();
    }

    private static final String HomeScreen$lambda$3(State<String> state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float HomeScreen$lambda$4(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final Set<String> HomeScreen$lambda$5(State<? extends Set<String>> state) {
        return (Set) state.getValue();
    }

    private static final List<ChatMessage> HomeScreen$lambda$6(State<? extends List<ChatMessage>> state) {
        return (List) state.getValue();
    }

    private static final boolean HomeScreen$lambda$7(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final String HomeScreen$lambda$8(State<String> state) {
        return (String) state.getValue();
    }

    private static final boolean HomeScreen$lambda$10(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void HomeScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88(State $isMakkahAdhanPlaying$delegate, final MainViewModel $viewModel, final State $makkahAdhanPrayerName$delegate, final MutableState $isDistrictMenuOpen$delegate, final State $selectedDistrict$delegate, final State $progressPercent$delegate, final State $nextPrayer$delegate, final State $countdownText$delegate, final int $completedFardCount, final int $fardPrayersCount, final float $prayerStreakPercent, final Function1 $onNavigateToTab, final State $adminMessages$delegate, State $calculatedPrayers$delegate, LazyListScope $this$LazyColumn) {
        boolean z;
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        if (HomeScreen$lambda$7($isMakkahAdhanPlaying$delegate)) {
            LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1994638112, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$20(MainViewModel.this, $makkahAdhanPrayerName$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, (Object) null);
        }
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-865062821, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$36($isDistrictMenuOpen$delegate, $selectedDistrict$delegate, $viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(942064772, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda8
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$46($progressPercent$delegate, $nextPrayer$delegate, $countdownText$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(1991933987, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda9
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$54($completedFardCount, $fardPrayersCount, $prayerStreakPercent, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-1253164094, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda10
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$62($onNavigateToTab, $viewModel, $nextPrayer$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(-203294879, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda11
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$65($onNavigateToTab, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(846574336, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda12
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$71($onNavigateToTab, $adminMessages$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        if (HomeScreen$lambda$6($adminMessages$delegate).isEmpty()) {
            LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$HomeScreenKt.INSTANCE.getLambda$2046936009$app(), 3, (Object) null);
            z = true;
        } else {
            final List take = CollectionsKt.take(HomeScreen$lambda$6($adminMessages$delegate), 3);
            final Function1 function1 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda13
                public final Object invoke(Object obj) {
                    return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$72((ChatMessage) obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$89$lambda$88$$inlined$items$default$1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return m76invoke((ChatMessage) p1);
                }

                @Nullable
                /* renamed from: invoke, reason: collision with other method in class */
                public final Void m76invoke(ChatMessage chatMessage) {
                    return null;
                }
            };
            z = true;
            $this$LazyColumn.items(take.size(), new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$89$lambda$88$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke(((Number) p1).intValue());
                }

                @NotNull
                public final Object invoke(int index) {
                    return function1.invoke(take.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$89$lambda$88$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke(((Number) p1).intValue());
                }

                @Nullable
                public final Object invoke(int index) {
                    return function12.invoke(take.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$89$lambda$88$$inlined$items$default$4
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
                    final ChatMessage chatMessage = (ChatMessage) take.get(it);
                    $composer.startReplaceGroup(-1931340933);
                    ComposerKt.sourceInformation($composer, "C*659@24704L40,660@24769L186,657@24628L337:HomeScreen.kt#2thlc2");
                    ComposerKt.sourceInformationMarkerStart($composer, 491890143, "CC(remember):HomeScreen.kt#9igjgp");
                    boolean changedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(chatMessage)) || (i & 48) == 32);
                    Object rememberedValue = $composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        final MainViewModel mainViewModel = $viewModel;
                        obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$1$1$9$1$1
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m80invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m80invoke() {
                                MainViewModel.this.reactToMessage(chatMessage.getId());
                            }
                        };
                        $composer.updateRememberedValue(obj);
                    } else {
                        obj = rememberedValue;
                    }
                    Function0 function0 = (Function0) obj;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 491892369, "CC(remember):HomeScreen.kt#9igjgp");
                    boolean changedInstance2 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(chatMessage)) || (i & 48) == 32) | $composer.changed($onNavigateToTab);
                    Object rememberedValue2 = $composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        final MainViewModel mainViewModel2 = $viewModel;
                        final Function1 function13 = $onNavigateToTab;
                        obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$1$1$9$2$1
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m81invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m81invoke() {
                                Object obj3;
                                List<ChatGroup> chatGroups = MainViewModel.this.getChatGroups();
                                ChatMessage chatMessage2 = chatMessage;
                                Iterator<T> it2 = chatGroups.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj3 = null;
                                        break;
                                    } else {
                                        obj3 = it2.next();
                                        if (Intrinsics.areEqual(((ChatGroup) obj3).getId(), chatMessage2.getGroupId())) {
                                            break;
                                        }
                                    }
                                }
                                ChatGroup chatGroup = (ChatGroup) obj3;
                                if (chatGroup != null) {
                                    MainViewModel.this.selectChatGroup(chatGroup);
                                }
                                function13.invoke(AppTab.CHAT);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                    } else {
                        obj2 = rememberedValue2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    HomeScreenKt.HomeAdminAnnouncementCard(chatMessage, function0, (Function0) obj2, null, $composer, (i >> 3) & 14, 8);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableLambdaKt.composableLambdaInstance(1896443551, z, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda14
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$84($onNavigateToTab, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, (Object) null);
        LazyListScope.item$default($this$LazyColumn, (Object) null, (Object) null, ComposableSingletons$HomeScreenKt.INSTANCE.m48getLambda$1348654530$app(), 3, (Object) null);
        final List HomeScreen$lambda$1 = HomeScreen$lambda$1($calculatedPrayers$delegate);
        final Function1 function13 = new Function1() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$89$lambda$88$$inlined$items$default$5
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m77invoke((SinglePrayerTime) p1);
            }

            @Nullable
            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m77invoke(SinglePrayerTime singlePrayerTime) {
                return null;
            }
        };
        $this$LazyColumn.items(HomeScreen$lambda$1.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$89$lambda$88$$inlined$items$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            @Nullable
            public final Object invoke(int index) {
                return function13.invoke(HomeScreen$lambda$1.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$lambda$89$lambda$88$$inlined$items$default$8
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
                final SinglePrayerTime singlePrayerTime = (SinglePrayerTime) HomeScreen$lambda$1.get(it);
                $composer.startReplaceGroup(9594514);
                ComposerKt.sourceInformation($composer, "C*755@27942L39,756@28005L53,753@27870L196:HomeScreen.kt#2thlc2");
                ComposerKt.sourceInformationMarkerStart($composer, 693048308, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(singlePrayerTime)) || (i & 48) == 32);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    final MainViewModel mainViewModel = $viewModel;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$1$1$11$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m78invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m78invoke() {
                            MainViewModel.this.togglePrayerCheck(singlePrayerTime);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                Function0 function0 = (Function0) obj;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 693050338, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance2 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(singlePrayerTime)) || (i & 48) == 32);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    final MainViewModel mainViewModel2 = $viewModel;
                    obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.screens.HomeScreenKt$HomeScreen$1$1$11$2$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m79invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m79invoke() {
                            MainViewModel.this.testAdhanAlert(singlePrayerTime.getType().getDisplayName());
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                HomeScreenKt.PrayerTimeRowItem(singlePrayerTime, function0, (Function0) obj2, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$20(final MainViewModel $viewModel, final State $makkahAdhanPrayerName$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C122@5493L11,121@5438L93,124@5568L38,125@5617L1788,116@5240L2165:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994638112, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:116)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16))), "home_makkah_azan_playing_banner"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(45578158, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$20$lambda$19(MainViewModel.this, $makkahAdhanPrayerName$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$20$lambda$19(final com.example.ui.viewmodel.MainViewModel r95, androidx.compose.runtime.State r96, androidx.compose.foundation.layout.ColumnScope r97, androidx.compose.runtime.Composer r98, int r99) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$20$lambda$19(com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16(MainViewModel $viewModel) {
        $viewModel.stopMakkahAzan();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0450 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$36(final androidx.compose.runtime.MutableState r75, final androidx.compose.runtime.State r76, final com.example.ui.viewmodel.MainViewModel r77, androidx.compose.foundation.lazy.LazyItemScope r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$36(androidx.compose.runtime.MutableState, androidx.compose.runtime.State, com.example.ui.viewmodel.MainViewModel, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$22$lambda$21(MutableState $isDistrictMenuOpen$delegate) {
        HomeScreen$lambda$11($isDistrictMenuOpen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0248  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$24(androidx.compose.runtime.State r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$24(androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$26$lambda$25(MutableState $isDistrictMenuOpen$delegate) {
        HomeScreen$lambda$11($isDistrictMenuOpen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$32(final MainViewModel $viewModel, final State $selectedDistrict$delegate, final MutableState $isDistrictMenuOpen$delegate, ColumnScope $this$DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter($this$DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*225@9353L667,239@10048L117,224@9312L869:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-980280596, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:223)");
            }
            for (final District district : PrayerModelKt.getSriLankaDistricts()) {
                Function2 rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-403405271, true, new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj2, Object obj3) {
                        return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$32$lambda$31$lambda$28(District.this, $selectedDistrict$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, 1022150062, "CC(remember):HomeScreen.kt#9igjgp");
                boolean changedInstance = composer.changedInstance($viewModel) | composer.changed(district);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda3
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29(MainViewModel.this, district, $isDistrictMenuOpen$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) obj, (Modifier) null, (Function2) null, (Function2) null, false, (MenuItemColors) null, (PaddingValues) null, (MutableInteractionSource) null, composer, 6, 508);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$32$lambda$31$lambda$28(com.example.data.model.District r49, androidx.compose.runtime.State r50, androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$32$lambda$31$lambda$28(com.example.data.model.District, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$36$lambda$35$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29(MainViewModel $viewModel, District $district, MutableState $isDistrictMenuOpen$delegate) {
        $viewModel.selectDistrict($district);
        HomeScreen$lambda$11($isDistrictMenuOpen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$46(final State $progressPercent$delegate, final State $nextPrayer$delegate, final State $countdownText$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C272@11070L11,272@11028L71,273@11134L38,274@11181L3807,267@10855L4133:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(942064772, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:267)");
            }
            CardKt.Card(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24))), "hero_prayer_card"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-552030894, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda22
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$46$lambda$45($progressPercent$delegate, $nextPrayer$delegate, $countdownText$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0914 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x071f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0a2c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$46$lambda$45(final androidx.compose.runtime.State r128, androidx.compose.runtime.State r129, androidx.compose.runtime.State r130, androidx.compose.foundation.layout.ColumnScope r131, androidx.compose.runtime.Composer r132, int r133) {
        /*
            Method dump skipped, instructions count: 2774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$46$lambda$45(androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$54(final int $completedFardCount, final int $fardPrayersCount, final float $prayerStreakPercent, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C395@15227L11,397@15293L2041,390@15045L2289:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991933987, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:390)");
            }
            SurfaceKt.Surface-T9BRK9s(TestTagKt.testTag(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16))), "prayer_tracker_summary"), (Shape) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, Dp.constructor-impl(1), 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-158359704, true, new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda32
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$54$lambda$53($completedFardCount, $fardPrayersCount, $prayerStreakPercent, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12607488, 106);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$54$lambda$53(final int r76, final int r77, final float r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$54$lambda$53(int, int, float, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final float HomeScreen$lambda$89$lambda$88$lambda$54$lambda$53$lambda$52$lambda$49$lambda$48$lambda$47(float $prayerStreakPercent) {
        return $prayerStreakPercent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$54$lambda$53$lambda$52$lambda$51(int r50, int r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$54$lambda$53$lambda$52$lambda$51(int, int, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024a A[ADDED_TO_REGION] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$62(final kotlin.jvm.functions.Function1 r43, final com.example.ui.viewmodel.MainViewModel r44, final androidx.compose.runtime.State r45, androidx.compose.foundation.lazy.LazyItemScope r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$62(kotlin.jvm.functions.Function1, com.example.ui.viewmodel.MainViewModel, androidx.compose.runtime.State, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$62$lambda$61$lambda$56$lambda$55(Function1 $onNavigateToTab) {
        $onNavigateToTab.invoke(AppTab.QIBLA);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$62$lambda$61$lambda$58$lambda$57(MainViewModel $viewModel, State $nextPrayer$delegate) {
        String str;
        PrayerType type;
        SinglePrayerTime HomeScreen$lambda$2 = HomeScreen$lambda$2($nextPrayer$delegate);
        if (HomeScreen$lambda$2 == null || (type = HomeScreen$lambda$2.getType()) == null || (str = type.getDisplayName()) == null) {
            str = "Fajr";
        }
        $viewModel.testAdhanAlert(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$62$lambda$61$lambda$60$lambda$59(Function1 $onNavigateToTab) {
        $onNavigateToTab.invoke(AppTab.MOSQUES);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$65(final Function1 $onNavigateToTab, LazyItemScope $this$item, Composer $composer, int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C522@19824L31,524@19973L11,524@19931L69,525@20035L38,518@19700L2337:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-203294879, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:518)");
            }
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16)));
            ComposerKt.sourceInformationMarkerStart($composer, -2092846144, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed = $composer.changed($onNavigateToTab);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$65$lambda$64$lambda$63($onNavigateToTab);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CardKt.Card(TestTagKt.testTag(ClickableKt.clickable-XHw0xAI$default(clip, false, (String) null, (Role) null, (Function0) obj, 7, (Object) null), "home_quick_dua_banner"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableSingletons$HomeScreenKt.INSTANCE.m49getLambda$1697390545$app(), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$65$lambda$64$lambda$63(Function1 $onNavigateToTab) {
        $onNavigateToTab.invoke(AppTab.DUA);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$71(final kotlin.jvm.functions.Function1 r75, final androidx.compose.runtime.State r76, androidx.compose.foundation.lazy.LazyItemScope r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$71(kotlin.jvm.functions.Function1, androidx.compose.runtime.State, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$71$lambda$70$lambda$68$lambda$67(Function1 $onNavigateToTab) {
        $onNavigateToTab.invoke(AppTab.CHAT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$71$lambda$70$lambda$69(State $adminMessages$delegate, RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C623@23438L10,625@23538L11,621@23343L226:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2018717249, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:621)");
            }
            TextKt.Text--4IGK_g("View All (" + HomeScreen$lambda$6($adminMessages$delegate).size() + ")", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 196608, 0, 65498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object HomeScreen$lambda$89$lambda$88$lambda$72(ChatMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "home_admin_msg_" + it.getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$84(final Function1 $onNavigateToTab, LazyItemScope $this$item, Composer $composer, int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C676@25163L32,678@25313L11,678@25271L88,679@25394L38,680@25441L1625,672@25039L2027:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1896443551, $changed, -1, "com.example.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:672)");
            }
            Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14)));
            ComposerKt.sourceInformationMarkerStart($composer, 1416123263, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed = $composer.changed($onNavigateToTab);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda26
                    public final Object invoke() {
                        return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$84$lambda$77$lambda$76($onNavigateToTab);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CardKt.Card(TestTagKt.testTag(ClickableKt.clickable-XHw0xAI$default(clip, false, (String) null, (Role) null, (Function0) obj, 7, (Object) null), "chat_group_promo_card"), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(402347885, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda27
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$84$lambda$83($onNavigateToTab, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$84$lambda$77$lambda$76(Function1 $onNavigateToTab) {
        $onNavigateToTab.invoke(AppTab.CHAT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeScreen$lambda$89$lambda$88$lambda$84$lambda$83(final kotlin.jvm.functions.Function1 r94, androidx.compose.foundation.layout.ColumnScope r95, androidx.compose.runtime.Composer r96, int r97) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeScreen$lambda$89$lambda$88$lambda$84$lambda$83(kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$89$lambda$88$lambda$84$lambda$83$lambda$82$lambda$81$lambda$80(Function1 $onNavigateToTab) {
        $onNavigateToTab.invoke(AppTab.CHAT);
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PrayerTimeRowItem(@NotNull final SinglePrayerTime prayer, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @Nullable Composer $composer, final int $changed) {
        long containerColor;
        long borderColor;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(prayer, "prayer");
        Intrinsics.checkNotNullParameter(function0, "onToggleCompleted");
        Intrinsics.checkNotNullParameter(function02, "onTestAlert");
        Composer $composer3 = $composer.startRestartGroup(-743996712);
        ComposerKt.sourceInformation($composer3, "C(PrayerTimeRowItem)P(2,1)789@28935L43,790@29009L60,791@29074L3154,779@28616L3612:HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(prayer) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        }
        if (($dirty & 147) == 146 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743996712, $dirty, -1, "com.example.ui.screens.PrayerTimeRowItem (HomeScreen.kt:767)");
            }
            final boolean isNext = prayer.isNext();
            final boolean isDone = prayer.isCompleted();
            if (isNext) {
                $composer3.startReplaceGroup(-2016260214);
                ComposerKt.sourceInformation($composer3, "772@28328L11");
                long j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                $composer3.endReplaceGroup();
                containerColor = j;
            } else if (isDone) {
                $composer3.startReplaceGroup(-2016257846);
                ComposerKt.sourceInformation($composer3, "773@28404L11");
                long j2 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                $composer3.endReplaceGroup();
                containerColor = j2;
            } else {
                $composer3.startReplaceGroup(-2016256033);
                ComposerKt.sourceInformation($composer3, "774@28476L11");
                long j3 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU();
                $composer3.endReplaceGroup();
                containerColor = j3;
            }
            if (isNext) {
                $composer3.startReplaceGroup(-2016253761);
                ComposerKt.sourceInformation($composer3, "777@28547L11");
                borderColor = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary-0d7_KjU();
            } else {
                $composer3.startReplaceGroup(-2016252506);
                ComposerKt.sourceInformation($composer3, "777@28586L11");
                borderColor = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOutlineVariant-0d7_KjU();
            }
            $composer3.endReplaceGroup();
            Modifier modifier = BorderKt.border-xT4_qwU(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16))), isNext ? Dp.constructor-impl((float) 1.5d) : Dp.constructor-impl(1), borderColor, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16)));
            String lowerCase = prayer.getType().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            $composer2 = $composer3;
            CardKt.Card(TestTagKt.testTag(modifier, "prayer_row_" + lowerCase), (Shape) null, CardDefaults.INSTANCE.cardColors-ro_MJ88(containerColor, 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.cardElevation-aqJV_2Y(isNext ? Dp.constructor-impl(3) : Dp.constructor-impl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, CardDefaults.$stable << 18, 62), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1917954378, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda36
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.PrayerTimeRowItem$lambda$98(SinglePrayerTime.this, function0, isDone, isNext, function02, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 196608, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda37
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.PrayerTimeRowItem$lambda$99(SinglePrayerTime.this, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0322  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PrayerTimeRowItem$lambda$98(final com.example.data.model.SinglePrayerTime r132, kotlin.jvm.functions.Function0 r133, final boolean r134, boolean r135, kotlin.jvm.functions.Function0 r136, androidx.compose.foundation.layout.ColumnScope r137, androidx.compose.runtime.Composer r138, int r139) {
        /*
            Method dump skipped, instructions count: 2324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.PrayerTimeRowItem$lambda$98(com.example.data.model.SinglePrayerTime, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PrayerTimeRowItem$lambda$98$lambda$97$lambda$94$lambda$91(boolean $isDone, SinglePrayerTime $prayer, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C811@29742L300:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1627199242, $changed, -1, "com.example.ui.screens.PrayerTimeRowItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:811)");
            }
            Icons.Filled filled = Icons.INSTANCE.getDefault();
            ImageVector checkCircle = $isDone ? CheckCircleKt.getCheckCircle(filled) : RadioButtonUncheckedKt.getRadioButtonUnchecked(filled);
            String str = "Mark " + $prayer.getType().getDisplayName() + " as prayed";
            if ($isDone) {
                $composer.startReplaceGroup(370383510);
                $composer.endReplaceGroup();
                j = ColorKt.getIslamicGreen();
            } else {
                $composer.startReplaceGroup(370384922);
                ComposerKt.sourceInformation($composer, "814@30000L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                $composer.endReplaceGroup();
            }
            IconKt.Icon-ww6aTOc(checkCircle, str, (Modifier) null, j, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit PrayerTimeRowItem$lambda$98$lambda$97$lambda$96$lambda$95(SinglePrayerTime $prayer, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C874@32115L11,871@31948L252:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463571418, $changed, -1, "com.example.ui.screens.PrayerTimeRowItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:871)");
            }
            IconKt.Icon-ww6aTOc(VolumeUpKt.getVolumeUp(Icons.INSTANCE.getDefault()), "Play sound for " + $prayer.getType().getDisplayName(), SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HomeAdminAnnouncementCard(final ChatMessage message, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        ChatMessage chatMessage;
        Function0<Unit> function03;
        Modifier modifier2;
        Modifier modifier3;
        Context context;
        String format;
        Object obj;
        float f;
        long j;
        Composer $composer2;
        final Modifier modifier4;
        Composer $composer3 = $composer.startRestartGroup(-628413698);
        ComposerKt.sourceInformation($composer3, "C(HomeAdminAnnouncementCard)P(!1,3,2)890@32421L7,891@32451L353,907@33031L11,906@32982L74,913@33316L38,914@33359L7334,901@32808L7885:HomeScreen.kt#2thlc2");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            chatMessage = message;
            $dirty |= $composer3.changed(chatMessage) ? 4 : 2;
        } else {
            chatMessage = message;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            function03 = function02;
            $dirty |= $composer3.changedInstance(function03) ? 256 : 128;
        } else {
            function03 = function02;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            modifier4 = modifier2;
            $composer2 = $composer3;
        } else {
            if (i2 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-628413698, $dirty, -1, "com.example.ui.screens.HomeAdminAnnouncementCard (HomeScreen.kt:889)");
            }
            CompositionLocal localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context2 = (Context) consume;
            long timestamp = chatMessage.getTimestamp();
            ComposerKt.sourceInformationMarkerStart($composer3, 1684832319, "CC(remember):HomeScreen.kt#9igjgp");
            boolean changed = $composer3.changed(timestamp);
            Object rememberedValue = $composer3.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                long currentTimeMillis = System.currentTimeMillis() - chatMessage.getTimestamp();
                if (currentTimeMillis < 60000) {
                    format = "Just now";
                    context = context2;
                } else if (currentTimeMillis < 3600000) {
                    context = context2;
                    format = (currentTimeMillis / 60000) + "m ago";
                } else {
                    context = context2;
                    if (currentTimeMillis < 86400000) {
                        format = (currentTimeMillis / 3600000) + "h ago";
                    } else {
                        format = new SimpleDateFormat("MMM d, h:mm a", Locale.getDefault()).format(new Date(message.getTimestamp()));
                    }
                }
                obj = format;
                $composer3.updateRememberedValue(obj);
            } else {
                context = context2;
                obj = rememberedValue;
            }
            final String timeFormatted = (String) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, (Object) null), "home_admin_announcement_" + message.getId());
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16));
            Modifier modifier5 = modifier3;
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14);
            if (message.isPinned()) {
                f = Dp.constructor-impl((float) 1.5d);
            } else {
                f = Dp.constructor-impl(1);
            }
            if (message.isPinned()) {
                $composer3.startReplaceGroup(1684856041);
                $composer3.endReplaceGroup();
                j = ColorKt.getIslamicGold();
            } else {
                $composer3.startReplaceGroup(1684857904);
                ComposerKt.sourceInformation($composer3, "911@33234L11");
                j = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                $composer3.endReplaceGroup();
            }
            final Context context3 = context;
            final Function0<Unit> function04 = function03;
            CardKt.Card(testTag, shape, cardColors, CardDefaults.INSTANCE.cardElevation-aqJV_2Y(Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.BorderStroke-cXLIe8U(f, j), ComposableLambdaKt.rememberComposableLambda(1938110064, true, new Function3() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return HomeScreenKt.HomeAdminAnnouncementCard$lambda$120(ChatMessage.this, timeFormatted, function0, context3, function04, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 196608, 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.screens.HomeScreenKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj2, Object obj3) {
                    return HomeScreenKt.HomeAdminAnnouncementCard$lambda$121(ChatMessage.this, function0, function02, modifier4, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0ee0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0dd9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0d21 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0850 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0ada  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeAdminAnnouncementCard$lambda$120(final com.example.data.model.ChatMessage r160, final java.lang.String r161, final kotlin.jvm.functions.Function0 r162, final android.content.Context r163, kotlin.jvm.functions.Function0 r164, androidx.compose.foundation.layout.ColumnScope r165, androidx.compose.runtime.Composer r166, int r167) {
        /*
            Method dump skipped, instructions count: 3814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeAdminAnnouncementCard$lambda$120(com.example.data.model.ChatMessage, java.lang.String, kotlin.jvm.functions.Function0, android.content.Context, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HomeAdminAnnouncementCard$lambda$120$lambda$119$lambda$108$lambda$105$lambda$102(com.example.data.model.ChatMessage r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeAdminAnnouncementCard$lambda$120$lambda$119$lambda$108$lambda$105$lambda$102(com.example.data.model.ChatMessage, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit HomeAdminAnnouncementCard$lambda$120$lambda$119$lambda$108$lambda$107$lambda$106(ChatMessage $message, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1006@36580L10,1009@36720L11,1004@36500L336:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-789831854, $changed, -1, "com.example.ui.screens.HomeAdminAnnouncementCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:1004)");
            }
            String tag = $message.getTag();
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold = FontWeight.Companion.getBold();
            TextKt.Text--4IGK_g(tag, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(6), Dp.constructor-impl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), TextUnitKt.getSp(9), (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, labelSmall, $composer, 199728, 0, 65488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeAdminAnnouncementCard$lambda$120$lambda$119$lambda$118$lambda$117$lambda$110$lambda$109(Function0 $onReact) {
        $onReact.invoke();
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
    public static final kotlin.Unit HomeAdminAnnouncementCard$lambda$120$lambda$119$lambda$118$lambda$117$lambda$112(com.example.data.model.ChatMessage r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.HomeScreenKt.HomeAdminAnnouncementCard$lambda$120$lambda$119$lambda$118$lambda$117$lambda$112(com.example.data.model.ChatMessage, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeAdminAnnouncementCard$lambda$120$lambda$119$lambda$118$lambda$117$lambda$116$lambda$115(Context $context, ChatMessage $message, String $timeFormatted) {
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
        sb.append("👤 By: " + $message.getSenderName());
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
