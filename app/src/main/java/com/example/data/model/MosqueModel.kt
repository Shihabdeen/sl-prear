package com.example.data.model

enum class MosqueEventType(val label: String, val badgeColorHex: Long) {
    JUMMAH("Jummah Khutbah", 0xFF0B6623),
    BAYAN("Islamic Lecture / Bayan", 0xFF0E6222),
    COMMUNITY("Welfare & Community", 0xFF007BFF),
    YOUTH("Youth & Madrasa", 0xFF8E44AD),
    RAMADAN("Ramadan & Iftar", 0xFFD4AF37),
    JANAZA("Janaza Notice", 0xFFC0392B)
}

data class MosqueEvent(
    val id: Long,
    val mosqueName: String,
    val district: String,
    val eventType: MosqueEventType,
    val title: String,
    val speaker: String,
    val dateFormatted: String,
    val timeFormatted: String,
    val description: String,
    val address: String,
    val isReminderSet: Boolean = false
)

val SampleSriLankaMosqueEvents: List<MosqueEvent> = listOf(
    MosqueEvent(
        id = 101L,
        mosqueName = "Bogawantalawa Town Jummah Mosque",
        district = "Hatton & Bogawantalawa",
        eventType = MosqueEventType.JUMMAH,
        title = "Friday Jummah Service & Khutbah",
        speaker = "Ash-Sheikh Moulavi A. C. M. Ihsan",
        dateFormatted = "This Friday",
        timeFormatted = "12:30 PM - 01:15 PM",
        description = "Topic: Brotherhood, Sincerity, and Good Character in Daily Life. Tamil and Sinhala summary delivered. Early arrival recommended.",
        address = "Main Street, Bogawantalawa Town",
        isReminderSet = true
    ),
    MosqueEvent(
        id = 102L,
        mosqueName = "Hatton Grand Jummah Mosque",
        district = "Hatton & Bogawantalawa",
        eventType = MosqueEventType.BAYAN,
        title = "Weekly Tafseer & Seerah Study Circle",
        speaker = "Moulavi Fazil Farook (Hatton)",
        dateFormatted = "Thursday Evening",
        timeFormatted = "07:15 PM (After Maghrib)",
        description = "Study of Surah Al-Hujurat and prophetic character. Tea refreshments and QA session for community members and youth.",
        address = "Dimbula Road, Hatton Town",
        isReminderSet = true
    ),
    MosqueEvent(
        id = 103L,
        mosqueName = "Bogawantalawa Town Jummah Mosque",
        district = "Hatton & Bogawantalawa",
        eventType = MosqueEventType.YOUTH,
        title = "Highland Youth & Maktab Quran Program",
        speaker = "Moulavi M. S. M. Farhan",
        dateFormatted = "Sunday Morning",
        timeFormatted = "09:30 AM - 11:30 AM",
        description = "Tajweed coaching, character development, and academic encouragement for school and college students across Bogawantalawa valley.",
        address = "Madrasa Hall, Bogawantalawa Mosque",
        isReminderSet = false
    ),
    MosqueEvent(
        id = 104L,
        mosqueName = "Hatton Grand Jummah Mosque",
        district = "Hatton & Bogawantalawa",
        eventType = MosqueEventType.COMMUNITY,
        title = "Hatton-Bogawantalawa Winter Aid & Health Checkup",
        speaker = "Mosque Welfare & Relief Committee",
        dateFormatted = "Saturday",
        timeFormatted = "10:00 AM - 01:00 PM",
        description = "Warm clothing distribution, blood pressure and glucose testing for community elders and families across the tea estate sector.",
        address = "Grand Mosque Community Hall, Hatton",
        isReminderSet = false
    ),
    MosqueEvent(
        id = 1L,
        mosqueName = "Colombo Grand Mosque",
        district = "Colombo",
        eventType = MosqueEventType.JUMMAH,
        title = "Friday Jummah Service & Khutbah",
        speaker = "Ash-Sheikh M. Rizwe Mufthi (ACJU)",
        dateFormatted = "This Friday",
        timeFormatted = "12:15 PM - 01:15 PM",
        description = "Topic: Strengthening Family Bonds in Contemporary Society. Special Sinhala and Tamil summary leaflets distributed. Early arrival recommended for seating.",
        address = "New Moor Street, Colombo 12",
        isReminderSet = true
    ),
    MosqueEvent(
        id = 2L,
        mosqueName = "Dewatagaha Jumma Mosque",
        district = "Colombo",
        eventType = MosqueEventType.BAYAN,
        title = "Weekly Quran Tafseer & Spiritual Halaqa",
        speaker = "Ash-Sheikh Abdullah Abdul Majeed",
        dateFormatted = "Thursday Evening",
        timeFormatted = "07:30 PM (After Maghrib)",
        description = "Continuation of Surah Al-Kahf commentary. Refreshments and dinner packs distributed for attendees. Family section available upstairs.",
        address = "Cinnamon Gardens, Colombo 07",
        isReminderSet = false
    ),
    MosqueEvent(
        id = 3L,
        mosqueName = "Katukele Jumma Mosque",
        district = "Kandy",
        eventType = MosqueEventType.JUMMAH,
        title = "Jummah Prayer & English/Tamil Khutbah",
        speaker = "Moulavi Fazil Farook",
        dateFormatted = "This Friday",
        timeFormatted = "12:30 PM - 01:20 PM",
        description = "Theme: Cultivating Taqwa in Everyday Work and Business Ethics. Dedicated student hall open for university and school students.",
        address = "Peradeniya Road, Katukele, Kandy",
        isReminderSet = false
    ),
    MosqueEvent(
        id = 4L,
        mosqueName = "Meeran Jumma Mosque",
        district = "Galle",
        eventType = MosqueEventType.COMMUNITY,
        title = "Southern Province Medical & Eye Camp",
        speaker = "Dr. Farhan Nazeer & Medical Volunteers",
        dateFormatted = "Saturday, 9:00 AM",
        timeFormatted = "09:00 AM - 02:00 PM",
        description = "Free health screening, glucose checkup, blood pressure testing, and free reading glasses distribution for all community members.",
        address = "Lighthouse Street, Galle Fort",
        isReminderSet = false
    ),
    MosqueEvent(
        id = 5L,
        mosqueName = "Jami Ul-Alfar (Red Mosque)",
        district = "Colombo",
        eventType = MosqueEventType.BAYAN,
        title = "Sirah of the Prophet: Mercy to All Creation",
        speaker = "Sheikh Arkam Nooramith",
        dateFormatted = "Sunday Evening",
        timeFormatted = "06:45 PM (After Maghrib)",
        description = "An inspiring evening exploring lessons from the Medina society and interfaith harmony. Audio broadcast over local FM available.",
        address = "2nd Cross Street, Pettah, Colombo 11",
        isReminderSet = true
    ),
    MosqueEvent(
        id = 6L,
        mosqueName = "Mohideen Jumma Mosque",
        district = "Ampara",
        eventType = MosqueEventType.YOUTH,
        title = "Eastern Youth Leadership & Quran Circle",
        speaker = "Ustadh Salman Al-Amani",
        dateFormatted = "Saturday Afternoon",
        timeFormatted = "04:30 PM (After Asr)",
        description = "Workshop covering Quranic memorization techniques, time management, and university career mentorship for Muslim youth.",
        address = "Main Street, Kalmunai",
        isReminderSet = false
    ),
    MosqueEvent(
        id = 7L,
        mosqueName = "Kechimalai Mosque",
        district = "Kalutara",
        eventType = MosqueEventType.RAMADAN,
        title = "Historical Seafarers Spiritual Gathering & Dua",
        speaker = "Mufti M. S. M. Thassim",
        dateFormatted = "Next Wednesday",
        timeFormatted = "05:00 PM - 07:00 PM",
        description = "Annual coastal community Dhikr gathering followed by Maghrib prayer and collective community Iftar gathering overlooking the ocean cliff.",
        address = "Kechimalai Hill, Beruwala",
        isReminderSet = false
    ),
    MosqueEvent(
        id = 8L,
        mosqueName = "Grand Mosque Negombo",
        district = "Gampaha",
        eventType = MosqueEventType.JANAZA,
        title = "Janaza Notice: Haji M. I. M. Rauf",
        speaker = "Imam Moulavi Junaideen",
        dateFormatted = "Today",
        timeFormatted = "04:15 PM (After Asr)",
        description = "Janaza prayers will be held at Negombo Grand Mosque burial grounds. Please make special Dua for Maghfirah for the deceased.",
        address = "Kamachchode, Negombo",
        isReminderSet = false
    )
)
