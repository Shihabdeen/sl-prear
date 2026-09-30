package com.example.data.model

data class ChatGroup(
    val id: String,
    val name: String,
    val description: String,
    val iconEmoji: String,
    val memberCount: Int,
    val isVerifiedBroadcastOnly: Boolean = true
)

data class ChatMessage(
    val id: Long = 0,
    val groupId: String,
    val senderPhone: String,
    val senderName: String,
    val senderRole: UserRole,
    val senderDesignation: String? = null,
    val senderMosque: String? = null,
    val text: String,
    val timestamp: Long = System.currentTimeMillis(),
    val tag: String? = null,
    val isPinned: Boolean = false,
    val reactionsCount: Int = 0
)

val DefaultChatGroups: List<ChatGroup> = listOf(
    ChatGroup(
        id = "hatton_bogawantalawa_mosques",
        name = "Hatton & Bogawantalawa Mosque Updates",
        description = "Official broadcasts from Bogawantalawa Town Jummah Mosque & Hatton Grand Mosque. Jummah timings, janaza notices, and valley programs.",
        iconEmoji = "🕌",
        memberCount = 4280,
        isVerifiedBroadcastOnly = true
    ),
    ChatGroup(
        id = "sl_central_broadcast",
        name = "SL Central Mosque Announcements",
        description = "Official announcements from All Ceylon Jamiyyathul Ulama & Mosques Federation. Only Admins can send messages.",
        iconEmoji = "📢",
        memberCount = 12450,
        isVerifiedBroadcastOnly = true
    ),
    ChatGroup(
        id = "colombo_mosques",
        name = "Colombo District Mosque Updates",
        description = "Jummah bayans, Ramadan schedules, and charity programs across Colombo. Only Admins can send messages.",
        iconEmoji = "📢",
        memberCount = 8920,
        isVerifiedBroadcastOnly = true
    ),
    ChatGroup(
        id = "hilal_sighting",
        name = "Moon Sighting & Hijri Calendar",
        description = "Official Hilal Sighting Committee updates for Ramadan, Eid al-Fitr & Eid al-Adha in Sri Lanka. Only Admins can send messages.",
        iconEmoji = "🌙",
        memberCount = 15300,
        isVerifiedBroadcastOnly = true
    ),
    ChatGroup(
        id = "community_relief",
        name = "Emergency Relief & Janaza Notices",
        description = "Urgent community blood donor requests, emergency relief, and verified Janaza announcements. Only Admins can post.",
        iconEmoji = "🤲",
        memberCount = 9840,
        isVerifiedBroadcastOnly = true
    )
)

val SampleInitialMessages: List<ChatMessage> = listOf(
    ChatMessage(
        id = 101L,
        groupId = "hatton_bogawantalawa_mosques",
        senderPhone = "shihab2415",
        senderName = "Shihab (Mosque Admin)",
        senderRole = UserRole.ADMIN,
        senderDesignation = "Verified Mosque Administrator",
        senderMosque = "Bogawantalawa Town Jummah Mosque",
        text = "Assalamu Alaikum wa Rahmatullahi wa Barakatuhu. Official Announcement from Bogawantalawa Town Jummah Mosque: Friday Jummah Khutbah commences at 12:30 PM. All community members across Bogawantalawa valley and Hatton are requested to arrive early.",
        timestamp = System.currentTimeMillis() - 1200000L,
        tag = "OFFICIAL NOTICE",
        isPinned = true,
        reactionsCount = 64
    ),
    ChatMessage(
        id = 102L,
        groupId = "hatton_bogawantalawa_mosques",
        senderPhone = "+94 77 987 6543",
        senderName = "Hatton Grand Mosque Committee",
        senderRole = UserRole.ADMIN,
        senderDesignation = "Secretary & Khatib",
        senderMosque = "Hatton Grand Jummah Mosque",
        text = "Hatton Grand Mosque Notice: Daily Maktab Quran classes for youth and students will be held daily after Asr prayer. Winter relief supply coordination continues at the community hall.",
        timestamp = System.currentTimeMillis() - 3600000L,
        tag = "COMMUNITY NOTICE",
        isPinned = true,
        reactionsCount = 48
    ),
    ChatMessage(
        id = 1L,
        groupId = "sl_central_broadcast",
        senderPhone = "+94 77 123 4567",
        senderName = "Moulavi Rizwe Mufthi",
        senderRole = UserRole.ADMIN,
        senderDesignation = "ACJU President / Trustee",
        senderMosque = "Colombo Grand Mosque",
        text = "Assalamu Alaikum wa Rahmatullahi wa Barakatuhu. Dear community members, all mosques in Sri Lanka are requested to observe standard prayer timings according to the ACJU timetable.",
        timestamp = System.currentTimeMillis() - 7200000L,
        tag = "OFFICIAL NOTICE",
        isPinned = true,
        reactionsCount = 42
    ),
    ChatMessage(
        id = 2L,
        groupId = "sl_central_broadcast",
        senderPhone = "+94 77 234 5678",
        senderName = "Ash-Sheikh M. H. M. Bilal",
        senderRole = UserRole.ADMIN,
        senderDesignation = "Chief Khatib",
        senderMosque = "Dewatagaha Mosque, Colombo 07",
        text = "Jummah Khutbah this Friday will begin at 12:45 PM sharp. Topic: 'Strengthening Community Brotherhood & Upright Character in Daily Life'. All are warmly welcome.",
        timestamp = System.currentTimeMillis() - 3600000L,
        tag = "JUMMAH",
        isPinned = false,
        reactionsCount = 28
    ),
    ChatMessage(
        id = 3L,
        groupId = "colombo_mosques",
        senderPhone = "+94 77 345 6789",
        senderName = "Al-Haj Faizur Rahman",
        senderRole = UserRole.ADMIN,
        senderDesignation = "Board Trustee",
        senderMosque = "Red Mosque (Jami Ul-Alfar), Pettah",
        text = "Notice: Daily Dhuhr congregation will be held on the first and second floors to accommodate travelers and workers in Pettah market. Please cooperate with our volunteer coordinators.",
        timestamp = System.currentTimeMillis() - 1800000L,
        tag = "MOSQUE UPDATE",
        isPinned = false,
        reactionsCount = 19
    ),
    ChatMessage(
        id = 4L,
        groupId = "hilal_sighting",
        senderPhone = "+94 77 456 7890",
        senderName = "Hilal Committee Sri Lanka",
        senderRole = UserRole.ADMIN,
        senderDesignation = "Central Moon Sighting Directorate",
        senderMosque = "Colombo Grand Mosque",
        text = "The monthly moon sighting session for the upcoming Islamic month will convene on the 29th evening at Colombo Grand Mosque after Maghrib prayer. Please forward verified sightings via designated district lines.",
        timestamp = System.currentTimeMillis() - 900000L,
        tag = "MOON SIGHTING",
        isPinned = true,
        reactionsCount = 56
    )
)
