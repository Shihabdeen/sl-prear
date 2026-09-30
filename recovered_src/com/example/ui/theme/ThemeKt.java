package com.example.ui.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "SLPrayerTheme", "", "themeMode", "Lcom/example/ui/theme/ThemeMode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/example/ui/theme/ThemeMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/theme/ThemeKt.dex */
public final class ThemeKt {

    @NotNull
    private static final ColorScheme DarkColorScheme = ColorSchemeKt.darkColorScheme-C-Xl9yA$default(ColorKt.getDarkPrimaryEmerald(), ColorKt.getDarkOnPrimary(), ColorKt.getDarkPrimaryContainer(), ColorKt.getDarkTextPrimary(), 0, ColorKt.getDarkGoldAccent(), androidx.compose.ui.graphics.ColorKt.Color(4280686848L), ColorKt.getDarkGoldContainer(), ColorKt.getDarkGoldAccent(), androidx.compose.ui.graphics.ColorKt.Color(4281908728L), androidx.compose.ui.graphics.ColorKt.Color(4278203720L), 0, 0, ColorKt.getDarkEmeraldBackground(), ColorKt.getDarkTextPrimary(), ColorKt.getDarkEmeraldSurface(), ColorKt.getDarkTextPrimary(), ColorKt.getDarkEmeraldSurfaceVariant(), ColorKt.getDarkTextSecondary(), 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4281158976L), androidx.compose.ui.graphics.ColorKt.Color(4280171055L), 0, 0, 0, 0, 0, 0, 0, 0, -201844720, 15, (Object) null);

    @NotNull
    private static final ColorScheme LightColorScheme = ColorSchemeKt.lightColorScheme-C-Xl9yA$default(ColorKt.getLightPrimaryEmerald(), ColorKt.getLightOnPrimary(), ColorKt.getLightPrimaryContainer(), androidx.compose.ui.graphics.ColorKt.Color(4278198549L), 0, ColorKt.getLightGoldAccent(), Color.Companion.getWhite-0d7_KjU(), ColorKt.getLightGoldContainer(), androidx.compose.ui.graphics.ColorKt.Color(4282199040L), ColorKt.getSkyBlue(), Color.Companion.getWhite-0d7_KjU(), 0, 0, ColorKt.getLightBackground(), ColorKt.getLightTextPrimary(), ColorKt.getLightSurface(), ColorKt.getLightTextPrimary(), ColorKt.getLightSurfaceVariant(), ColorKt.getLightTextSecondary(), 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4290959051L), androidx.compose.ui.graphics.ColorKt.Color(4293061605L), 0, 0, 0, 0, 0, 0, 0, 0, -201844720, 15, (Object) null);

    /* compiled from: Theme.kt */
    @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/theme/ThemeKt$WhenMappings.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ThemeMode.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SLPrayerTheme$lambda$0(ThemeMode themeMode, Function2 function2, int i, int i2, Composer composer, int i3) {
        SLPrayerTheme(themeMode, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void SLPrayerTheme(@Nullable final ThemeMode themeMode, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer $composer, final int $changed, final int i) {
        final Function2 content;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer $composer2 = $composer.startRestartGroup(-1261233839);
        ComposerKt.sourceInformation($composer2, "C(SLPrayerTheme)P(1)70@2067L100:Theme.kt#75kw8w");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(themeMode == null ? -1 : themeMode.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            content = function2;
        } else {
            if (i2 != 0) {
                themeMode = ThemeMode.SYSTEM;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1261233839, $dirty, -1, "com.example.ui.theme.SLPrayerTheme (Theme.kt:61)");
            }
            boolean z = false;
            switch (WhenMappings.$EnumSwitchMapping$0[themeMode.ordinal()]) {
                case 1:
                    $composer2.startReplaceGroup(-864936346);
                    ComposerKt.sourceInformation($composer2, "63@1911L21");
                    z = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
                    $composer2.endReplaceGroup();
                    break;
                case BuildConfig.VERSION_CODE /* 2 */:
                    $composer2.startReplaceGroup(-1043177569);
                    $composer2.endReplaceGroup();
                    break;
                case 3:
                    $composer2.startReplaceGroup(-1043149830);
                    $composer2.endReplaceGroup();
                    z = true;
                    break;
                default:
                    $composer2.startReplaceGroup(-864937619);
                    $composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            boolean isDark = z;
            ColorScheme colorScheme = isDark ? DarkColorScheme : LightColorScheme;
            content = function2;
            MaterialThemeKt.MaterialTheme(colorScheme, (Shapes) null, TypeKt.getTypography(), content, $composer2, (($dirty << 6) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.SLPrayerTheme$lambda$0(ThemeMode.this, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
