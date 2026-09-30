package com.example.data.local

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "prayer_logs",
    indices = [Index(value = ["dateKey", "prayerName"], unique = true)]
)
data class PrayerLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val dateKey: String,
    val prayerName: String,
    val isCompleted: Boolean,
    val completedAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "mosque_reminders")
data class MosqueReminderEntity(
    @PrimaryKey
    val eventId: Long,
    val isReminderActive: Boolean,
    val reminderTime: Long
)

@Entity(tableName = "quran_bookmarks")
data class QuranBookmarkEntity(
    @PrimaryKey
    val surahNumber: Int,
    val surahName: String,
    val bookmarkedAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "user_preferences")
data class UserPreferenceEntity(
    @PrimaryKey
    val key: String,
    val value: String
)

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey
    val phoneNumber: String,
    val fullName: String,
    val role: String,
    val adminDesignation: String? = null,
    val mosqueAffiliation: String? = null,
    val isLoggedIn: Boolean = true
)

@Entity(
    tableName = "chat_messages",
    indices = [Index(value = ["groupId"])]
)
data class ChatMessageEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val groupId: String,
    val senderPhone: String,
    val senderName: String,
    val senderRole: String,
    val senderDesignation: String? = null,
    val senderMosque: String? = null,
    val text: String,
    val timestamp: Long,
    val tag: String? = null,
    val isPinned: Boolean = false,
    val reactionsCount: Int = 0
)
