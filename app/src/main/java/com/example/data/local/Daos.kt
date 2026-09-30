package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PrayerLogDao {
    @Query("SELECT * FROM prayer_logs WHERE dateKey = :dateKey")
    fun getPrayerLogsForDate(dateKey: String): Flow<List<PrayerLogEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(prayerLog: PrayerLogEntity)

    @Query("DELETE FROM prayer_logs WHERE dateKey = :dateKey AND prayerName = :prayerName")
    suspend fun deletePrayerLog(dateKey: String, prayerName: String)

    @Query("SELECT * FROM prayer_logs ORDER BY completedAt DESC")
    fun getAllPrayerLogs(): Flow<List<PrayerLogEntity>>
}

@Dao
interface MosqueReminderDao {
    @Query("SELECT * FROM mosque_reminders")
    fun getAllReminders(): Flow<List<MosqueReminderEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setReminder(reminder: MosqueReminderEntity)

    @Query("DELETE FROM mosque_reminders WHERE eventId = :eventId")
    suspend fun deleteReminder(eventId: Long)
}

@Dao
interface QuranBookmarkDao {
    @Query("SELECT * FROM quran_bookmarks ORDER BY bookmarkedAt DESC")
    fun getAllBookmarks(): Flow<List<QuranBookmarkEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookmark(bookmark: QuranBookmarkEntity)

    @Query("DELETE FROM quran_bookmarks WHERE surahNumber = :surahNumber")
    suspend fun deleteBookmark(surahNumber: Int)
}

@Dao
interface UserPreferenceDao {
    @Query("SELECT value FROM user_preferences WHERE `key` = :key")
    suspend fun getPreference(key: String): String?

    @Query("SELECT * FROM user_preferences")
    fun getAllPreferencesFlow(): Flow<List<UserPreferenceEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePreference(preference: UserPreferenceEntity)
}

@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE isLoggedIn = 1 LIMIT 1")
    fun getActiveUser(): Flow<UserEntity?>

    @Query("SELECT * FROM users WHERE isLoggedIn = 1 LIMIT 1")
    suspend fun getActiveUserOnce(): UserEntity?

    @Query("SELECT * FROM users WHERE phoneNumber = :phone LIMIT 1")
    suspend fun getUserByPhone(phone: String): UserEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUser(user: UserEntity)

    @Query("UPDATE users SET isLoggedIn = 0")
    suspend fun clearActiveUser()

    @Query("DELETE FROM users")
    suspend fun deleteAllUsers()
}

@Dao
interface ChatMessageDao {
    @Query("SELECT * FROM chat_messages WHERE groupId = :groupId ORDER BY timestamp ASC")
    fun getMessagesForGroup(groupId: String): Flow<List<ChatMessageEntity>>

    @Query("SELECT * FROM chat_messages WHERE senderRole = 'ADMIN' ORDER BY timestamp DESC")
    fun getAdminBroadcasts(): Flow<List<ChatMessageEntity>>

    @Query("SELECT * FROM chat_messages ORDER BY timestamp DESC")
    fun getAllMessages(): Flow<List<ChatMessageEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMessage(message: ChatMessageEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(messages: List<ChatMessageEntity>)

    @Query("UPDATE chat_messages SET reactionsCount = reactionsCount + 1 WHERE id = :id")
    suspend fun incrementReactions(id: Long)

    @Query("DELETE FROM chat_messages WHERE id = :id")
    suspend fun deleteMessage(id: Long)

    @Query("SELECT COUNT(*) FROM chat_messages WHERE groupId = :groupId")
    suspend fun getGroupMessageCount(groupId: String): Int

    @Query("SELECT COUNT(*) FROM chat_messages")
    suspend fun getTotalMessageCount(): Int

    @Query("SELECT * FROM chat_messages WHERE groupId = :groupId AND ((timestamp = :timestamp AND senderPhone = :senderPhone) OR (text = :text AND timestamp = :timestamp)) LIMIT 1")
    suspend fun findDuplicate(groupId: String, timestamp: Long, senderPhone: String, text: String): ChatMessageEntity?
}
