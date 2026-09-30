package com.example.data.model

data class District(
    val id: String,
    val name: String,
    val province: String,
    val latitude: Double,
    val longitude: Double
)

enum class PrayerType(
    val displayName: String,
    val arabicName: String,
    val isFard: Boolean = true
) {
    FAJR("Fajr", "الفجر", true),
    SUNRISE("Sunrise", "الشروق", false),
    DHUHR("Dhuhr", "الظهر", true),
    ASR("Asr", "العصر", true),
    MAGHRIB("Maghrib", "المغرب", true),
    ISHA("Isha", "العشاء", true)
}

data class SinglePrayerTime(
    val type: PrayerType,
    val hour: Int,
    val minute: Int,
    val formattedTime: String,
    val isCompleted: Boolean = false,
    val isNext: Boolean = false,
    val isCurrent: Boolean = false
)

enum class AlertSoundType(val displayName: String) {
    ADHAN_MAKKAH("Adhan (Makkah)"),
    TAKBEER("Takbeer"),
    CHIME("Gentle Chime"),
    VIBRATE("Vibrate Only"),
    SILENT("Off / Silent")
}

data class PrayerAlertConfig(
    val prayerType: PrayerType,
    val isEnabled: Boolean = true,
    val soundType: AlertSoundType = AlertSoundType.ADHAN_MAKKAH,
    val preReminderMinutes: Int = 10
)

data class DayPrayerSchedule(
    val district: District,
    val gregorianDate: String,
    val hijriDate: String,
    val prayers: List<SinglePrayerTime>,
    val nextPrayer: SinglePrayerTime?,
    val remainingTimeFormatted: String,
    val progressPercent: Float,
    val completedPrayersCount: Int
)

val SriLankaDistricts: List<District> = listOf(
    District("hatton_bogawantalawa", "Hatton & Bogawantalawa", "Central", 6.8441, 80.6294),
    District("colombo", "Colombo", "Western", 6.9271, 79.8612),
    District("kandy", "Kandy", "Central", 7.2906, 80.6337),
    District("galle", "Galle", "Southern", 6.0535, 80.2210),
    District("batticaloa", "Batticaloa", "Eastern", 7.7310, 81.6747),
    District("trincomalee", "Trincomalee", "Eastern", 8.5874, 81.2152),
    District("jaffna", "Jaffna", "Northern", 9.6615, 80.0255),
    District("gampaha", "Gampaha / Negombo", "Western", 7.0840, 80.0098),
    District("kalutara", "Kalutara / Beruwala", "Western", 6.5854, 79.9607),
    District("ampara", "Ampara / Kalmunai", "Eastern", 7.2882, 81.6720),
    District("puttalam", "Puttalam", "North Western", 8.0362, 79.8283),
    District("kurunegala", "Kurunegala", "North Western", 7.4863, 80.3623),
    District("ratnapura", "Ratnapura", "Sabaragamuwa", 6.7056, 80.3847),
    District("matale", "Matale", "Central", 7.4675, 80.6234),
    District("nuwara_eliya", "Nuwara Eliya", "Central", 6.9497, 80.7891),
    District("badulla", "Badulla", "Uva", 6.9934, 81.0550),
    District("anuradhapura", "Anuradhapura", "North Central", 8.3114, 80.4037),
    District("matara", "Matara / Weligama", "Southern", 5.9549, 80.5550),
    District("hambantota", "Hambantota", "Southern", 6.1429, 81.1212),
    District("kegalle", "Kegalle / Mawanella", "Sabaragamuwa", 7.2513, 80.3464),
    District("polonnaruwa", "Polonnaruwa", "North Central", 7.9403, 81.0188),
    District("mannar", "Mannar", "Northern", 8.9810, 79.9044),
    District("vavuniya", "Vavuniya", "Northern", 8.7514, 80.4971),
    District("monaragala", "Monaragala", "Uva", 6.8728, 81.3507),
    District("kilinochchi", "Kilinochchi", "Northern", 9.3803, 80.3770),
    District("mullaitivu", "Mullaitivu", "Northern", 9.2671, 80.8143)
)
