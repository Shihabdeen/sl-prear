package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimaryEmerald,
    onPrimary = DarkOnPrimary,
    primaryContainer = DarkPrimaryContainer,
    onPrimaryContainer = DarkTextPrimary,
    secondary = DarkGoldAccent,
    onSecondary = Color(0xFF1E281F),
    secondaryContainer = DarkGoldContainer,
    onSecondaryContainer = DarkGoldAccent,
    tertiary = Color(0xFF263328),
    onTertiary = Color(0xFF001508),
    background = DarkEmeraldBackground,
    onBackground = DarkTextPrimary,
    surface = DarkEmeraldSurface,
    onSurface = DarkTextPrimary,
    surfaceVariant = DarkEmeraldSurfaceVariant,
    onSurfaceVariant = DarkTextSecondary,
    outline = Color(0xFF2E3D2F),
    outlineVariant = Color(0xFF1F2B20)
)

private val LightColorScheme = lightColorScheme(
    primary = LightPrimaryEmerald,
    onPrimary = LightOnPrimary,
    primaryContainer = LightPrimaryContainer,
    onPrimaryContainer = Color(0xFF00210E),
    secondary = LightGoldAccent,
    onSecondary = Color.White,
    secondaryContainer = LightGoldContainer,
    onSecondaryContainer = Color(0xFF2A2000),
    tertiary = SkyBlue,
    onTertiary = Color.White,
    background = LightBackground,
    onBackground = LightTextPrimary,
    surface = LightSurface,
    onSurface = LightTextPrimary,
    surfaceVariant = LightSurfaceVariant,
    onSurfaceVariant = LightTextSecondary,
    outline = Color(0xFFC0CEC2),
    outlineVariant = Color(0xFFE0EAE2)
)

@Composable
fun SLPrayerTheme(
    themeMode: ThemeMode = ThemeMode.SYSTEM,
    content: @Composable () -> Unit
) {
    val isDark = when (themeMode) {
        ThemeMode.SYSTEM -> isSystemInDarkTheme()
        ThemeMode.LIGHT -> false
        ThemeMode.DARK -> true
    }
    val colorScheme = if (isDark) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
