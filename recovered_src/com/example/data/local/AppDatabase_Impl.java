package com.example.data.local;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.example.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppDatabase_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u001a0\u0018H\u0014J\u0016\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u00190\u001cH\u0016J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\u001a\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u0019\u0012\u0004\u0012\u00020\u001d0\u0018H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\u000eH\u0016J\b\u0010&\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/example/data/local/AppDatabase_Impl;", "Lcom/example/data/local/AppDatabase;", "<init>", "()V", "_prayerLogDao", "Lkotlin/Lazy;", "Lcom/example/data/local/PrayerLogDao;", "_mosqueReminderDao", "Lcom/example/data/local/MosqueReminderDao;", "_quranBookmarkDao", "Lcom/example/data/local/QuranBookmarkDao;", "_userPreferenceDao", "Lcom/example/data/local/UserPreferenceDao;", "_userDao", "Lcom/example/data/local/UserDao;", "_chatMessageDao", "Lcom/example/data/local/ChatMessageDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "prayerLogDao", "mosqueReminderDao", "quranBookmarkDao", "userPreferenceDao", "userDao", "chatMessageDao", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/AppDatabase_Impl.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static final int $stable = 8;

    @NotNull
    private final Lazy<PrayerLogDao> _prayerLogDao = LazyKt.lazy(new Function0() { // from class: com.example.data.local.AppDatabase_Impl$$ExternalSyntheticLambda0
        public final Object invoke() {
            return AppDatabase_Impl._prayerLogDao$lambda$0(AppDatabase_Impl.this);
        }
    });

    @NotNull
    private final Lazy<MosqueReminderDao> _mosqueReminderDao = LazyKt.lazy(new Function0() { // from class: com.example.data.local.AppDatabase_Impl$$ExternalSyntheticLambda1
        public final Object invoke() {
            return AppDatabase_Impl._mosqueReminderDao$lambda$1(AppDatabase_Impl.this);
        }
    });

    @NotNull
    private final Lazy<QuranBookmarkDao> _quranBookmarkDao = LazyKt.lazy(new Function0() { // from class: com.example.data.local.AppDatabase_Impl$$ExternalSyntheticLambda2
        public final Object invoke() {
            return AppDatabase_Impl._quranBookmarkDao$lambda$2(AppDatabase_Impl.this);
        }
    });

    @NotNull
    private final Lazy<UserPreferenceDao> _userPreferenceDao = LazyKt.lazy(new Function0() { // from class: com.example.data.local.AppDatabase_Impl$$ExternalSyntheticLambda3
        public final Object invoke() {
            return AppDatabase_Impl._userPreferenceDao$lambda$3(AppDatabase_Impl.this);
        }
    });

    @NotNull
    private final Lazy<UserDao> _userDao = LazyKt.lazy(new Function0() { // from class: com.example.data.local.AppDatabase_Impl$$ExternalSyntheticLambda4
        public final Object invoke() {
            return AppDatabase_Impl._userDao$lambda$4(AppDatabase_Impl.this);
        }
    });

    @NotNull
    private final Lazy<ChatMessageDao> _chatMessageDao = LazyKt.lazy(new Function0() { // from class: com.example.data.local.AppDatabase_Impl$$ExternalSyntheticLambda5
        public final Object invoke() {
            return AppDatabase_Impl._chatMessageDao$lambda$5(AppDatabase_Impl.this);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final PrayerLogDao_Impl _prayerLogDao$lambda$0(AppDatabase_Impl this$0) {
        return new PrayerLogDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final MosqueReminderDao_Impl _mosqueReminderDao$lambda$1(AppDatabase_Impl this$0) {
        return new MosqueReminderDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final QuranBookmarkDao_Impl _quranBookmarkDao$lambda$2(AppDatabase_Impl this$0) {
        return new QuranBookmarkDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final UserPreferenceDao_Impl _userPreferenceDao$lambda$3(AppDatabase_Impl this$0) {
        return new UserPreferenceDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final UserDao_Impl _userDao$lambda$4(AppDatabase_Impl this$0) {
        return new UserDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final ChatMessageDao_Impl _chatMessageDao$lambda$5(AppDatabase_Impl this$0) {
        return new ChatMessageDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: createOpenDelegate, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate m11createOpenDelegate() {
        RoomOpenDelegate _openDelegate = new RoomOpenDelegate() { // from class: com.example.data.local.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2, "cc48f5c735460bc98184f7abeea68e0f", "f56ba647cc4f5161a729e74ded5ad81f");
            }

            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `prayer_logs` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dateKey` TEXT NOT NULL, `prayerName` TEXT NOT NULL, `isCompleted` INTEGER NOT NULL, `completedAt` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_prayer_logs_dateKey_prayerName` ON `prayer_logs` (`dateKey`, `prayerName`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `mosque_reminders` (`eventId` INTEGER NOT NULL, `isReminderActive` INTEGER NOT NULL, `reminderTime` INTEGER NOT NULL, PRIMARY KEY(`eventId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `quran_bookmarks` (`surahNumber` INTEGER NOT NULL, `surahName` TEXT NOT NULL, `bookmarkedAt` INTEGER NOT NULL, PRIMARY KEY(`surahNumber`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `user_preferences` (`key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `users` (`phoneNumber` TEXT NOT NULL, `fullName` TEXT NOT NULL, `role` TEXT NOT NULL, `adminDesignation` TEXT, `mosqueAffiliation` TEXT, `isLoggedIn` INTEGER NOT NULL, PRIMARY KEY(`phoneNumber`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `chat_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `groupId` TEXT NOT NULL, `senderPhone` TEXT NOT NULL, `senderName` TEXT NOT NULL, `senderRole` TEXT NOT NULL, `senderDesignation` TEXT, `senderMosque` TEXT, `text` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `tag` TEXT, `isPinned` INTEGER NOT NULL, `reactionsCount` INTEGER NOT NULL)");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_chat_messages_groupId` ON `chat_messages` (`groupId`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cc48f5c735460bc98184f7abeea68e0f')");
            }

            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `prayer_logs`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `mosque_reminders`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `quran_bookmarks`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `user_preferences`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `users`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `chat_messages`");
            }

            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                AppDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Map _columnsPrayerLogs = new LinkedHashMap();
                _columnsPrayerLogs.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
                _columnsPrayerLogs.put("dateKey", new TableInfo.Column("dateKey", "TEXT", true, 0, (String) null, 1));
                _columnsPrayerLogs.put("prayerName", new TableInfo.Column("prayerName", "TEXT", true, 0, (String) null, 1));
                _columnsPrayerLogs.put("isCompleted", new TableInfo.Column("isCompleted", "INTEGER", true, 0, (String) null, 1));
                _columnsPrayerLogs.put("completedAt", new TableInfo.Column("completedAt", "INTEGER", true, 0, (String) null, 1));
                Set _foreignKeysPrayerLogs = new LinkedHashSet();
                Set _indicesPrayerLogs = new LinkedHashSet();
                _indicesPrayerLogs.add(new TableInfo.Index("index_prayer_logs_dateKey_prayerName", true, CollectionsKt.listOf(new String[]{"dateKey", "prayerName"}), CollectionsKt.listOf(new String[]{"ASC", "ASC"})));
                TableInfo _infoPrayerLogs = new TableInfo("prayer_logs", _columnsPrayerLogs, _foreignKeysPrayerLogs, _indicesPrayerLogs);
                TableInfo _existingPrayerLogs = TableInfo.Companion.read(connection, "prayer_logs");
                if (!_infoPrayerLogs.equals(_existingPrayerLogs)) {
                    return new RoomOpenDelegate.ValidationResult(false, "prayer_logs(com.example.data.local.PrayerLogEntity).\n Expected:\n" + _infoPrayerLogs + "\n Found:\n" + _existingPrayerLogs);
                }
                Map _columnsMosqueReminders = new LinkedHashMap();
                _columnsMosqueReminders.put("eventId", new TableInfo.Column("eventId", "INTEGER", true, 1, (String) null, 1));
                _columnsMosqueReminders.put("isReminderActive", new TableInfo.Column("isReminderActive", "INTEGER", true, 0, (String) null, 1));
                _columnsMosqueReminders.put("reminderTime", new TableInfo.Column("reminderTime", "INTEGER", true, 0, (String) null, 1));
                Set _foreignKeysMosqueReminders = new LinkedHashSet();
                Set _indicesMosqueReminders = new LinkedHashSet();
                TableInfo _infoMosqueReminders = new TableInfo("mosque_reminders", _columnsMosqueReminders, _foreignKeysMosqueReminders, _indicesMosqueReminders);
                TableInfo _existingMosqueReminders = TableInfo.Companion.read(connection, "mosque_reminders");
                if (!_infoMosqueReminders.equals(_existingMosqueReminders)) {
                    return new RoomOpenDelegate.ValidationResult(false, "mosque_reminders(com.example.data.local.MosqueReminderEntity).\n Expected:\n" + _infoMosqueReminders + "\n Found:\n" + _existingMosqueReminders);
                }
                Map _columnsQuranBookmarks = new LinkedHashMap();
                _columnsQuranBookmarks.put("surahNumber", new TableInfo.Column("surahNumber", "INTEGER", true, 1, (String) null, 1));
                _columnsQuranBookmarks.put("surahName", new TableInfo.Column("surahName", "TEXT", true, 0, (String) null, 1));
                _columnsQuranBookmarks.put("bookmarkedAt", new TableInfo.Column("bookmarkedAt", "INTEGER", true, 0, (String) null, 1));
                Set _foreignKeysQuranBookmarks = new LinkedHashSet();
                Set _indicesQuranBookmarks = new LinkedHashSet();
                TableInfo _infoQuranBookmarks = new TableInfo("quran_bookmarks", _columnsQuranBookmarks, _foreignKeysQuranBookmarks, _indicesQuranBookmarks);
                TableInfo _existingQuranBookmarks = TableInfo.Companion.read(connection, "quran_bookmarks");
                if (!_infoQuranBookmarks.equals(_existingQuranBookmarks)) {
                    return new RoomOpenDelegate.ValidationResult(false, "quran_bookmarks(com.example.data.local.QuranBookmarkEntity).\n Expected:\n" + _infoQuranBookmarks + "\n Found:\n" + _existingQuranBookmarks);
                }
                Map _columnsUserPreferences = new LinkedHashMap();
                _columnsUserPreferences.put("key", new TableInfo.Column("key", "TEXT", true, 1, (String) null, 1));
                _columnsUserPreferences.put("value", new TableInfo.Column("value", "TEXT", true, 0, (String) null, 1));
                Set _foreignKeysUserPreferences = new LinkedHashSet();
                Set _indicesUserPreferences = new LinkedHashSet();
                TableInfo _infoUserPreferences = new TableInfo("user_preferences", _columnsUserPreferences, _foreignKeysUserPreferences, _indicesUserPreferences);
                TableInfo _existingUserPreferences = TableInfo.Companion.read(connection, "user_preferences");
                if (!_infoUserPreferences.equals(_existingUserPreferences)) {
                    return new RoomOpenDelegate.ValidationResult(false, "user_preferences(com.example.data.local.UserPreferenceEntity).\n Expected:\n" + _infoUserPreferences + "\n Found:\n" + _existingUserPreferences);
                }
                Map _columnsUsers = new LinkedHashMap();
                _columnsUsers.put("phoneNumber", new TableInfo.Column("phoneNumber", "TEXT", true, 1, (String) null, 1));
                _columnsUsers.put("fullName", new TableInfo.Column("fullName", "TEXT", true, 0, (String) null, 1));
                _columnsUsers.put("role", new TableInfo.Column("role", "TEXT", true, 0, (String) null, 1));
                _columnsUsers.put("adminDesignation", new TableInfo.Column("adminDesignation", "TEXT", false, 0, (String) null, 1));
                _columnsUsers.put("mosqueAffiliation", new TableInfo.Column("mosqueAffiliation", "TEXT", false, 0, (String) null, 1));
                _columnsUsers.put("isLoggedIn", new TableInfo.Column("isLoggedIn", "INTEGER", true, 0, (String) null, 1));
                Set _foreignKeysUsers = new LinkedHashSet();
                Set _indicesUsers = new LinkedHashSet();
                TableInfo _infoUsers = new TableInfo("users", _columnsUsers, _foreignKeysUsers, _indicesUsers);
                TableInfo _existingUsers = TableInfo.Companion.read(connection, "users");
                if (!_infoUsers.equals(_existingUsers)) {
                    return new RoomOpenDelegate.ValidationResult(false, "users(com.example.data.local.UserEntity).\n Expected:\n" + _infoUsers + "\n Found:\n" + _existingUsers);
                }
                Map _columnsChatMessages = new LinkedHashMap();
                _columnsChatMessages.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
                _columnsChatMessages.put("groupId", new TableInfo.Column("groupId", "TEXT", true, 0, (String) null, 1));
                _columnsChatMessages.put("senderPhone", new TableInfo.Column("senderPhone", "TEXT", true, 0, (String) null, 1));
                _columnsChatMessages.put("senderName", new TableInfo.Column("senderName", "TEXT", true, 0, (String) null, 1));
                _columnsChatMessages.put("senderRole", new TableInfo.Column("senderRole", "TEXT", true, 0, (String) null, 1));
                _columnsChatMessages.put("senderDesignation", new TableInfo.Column("senderDesignation", "TEXT", false, 0, (String) null, 1));
                _columnsChatMessages.put("senderMosque", new TableInfo.Column("senderMosque", "TEXT", false, 0, (String) null, 1));
                _columnsChatMessages.put("text", new TableInfo.Column("text", "TEXT", true, 0, (String) null, 1));
                _columnsChatMessages.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, (String) null, 1));
                _columnsChatMessages.put("tag", new TableInfo.Column("tag", "TEXT", false, 0, (String) null, 1));
                _columnsChatMessages.put("isPinned", new TableInfo.Column("isPinned", "INTEGER", true, 0, (String) null, 1));
                _columnsChatMessages.put("reactionsCount", new TableInfo.Column("reactionsCount", "INTEGER", true, 0, (String) null, 1));
                Set _foreignKeysChatMessages = new LinkedHashSet();
                Set _indicesChatMessages = new LinkedHashSet();
                _indicesChatMessages.add(new TableInfo.Index("index_chat_messages_groupId", false, CollectionsKt.listOf("groupId"), CollectionsKt.listOf("ASC")));
                TableInfo _infoChatMessages = new TableInfo("chat_messages", _columnsChatMessages, _foreignKeysChatMessages, _indicesChatMessages);
                TableInfo _existingChatMessages = TableInfo.Companion.read(connection, "chat_messages");
                if (!_infoChatMessages.equals(_existingChatMessages)) {
                    return new RoomOpenDelegate.ValidationResult(false, "chat_messages(com.example.data.local.ChatMessageEntity).\n Expected:\n" + _infoChatMessages + "\n Found:\n" + _existingChatMessages);
                }
                return new RoomOpenDelegate.ValidationResult(true, (String) null);
            }
        };
        return _openDelegate;
    }

    @NotNull
    protected InvalidationTracker createInvalidationTracker() {
        Map _shadowTablesMap = new LinkedHashMap();
        Map _viewTables = new LinkedHashMap();
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, new String[]{"prayer_logs", "mosque_reminders", "quran_bookmarks", "user_preferences", "users", "chat_messages"});
    }

    public void clearAllTables() {
        super.performClear(false, new String[]{"prayer_logs", "mosque_reminders", "quran_bookmarks", "user_preferences", "users", "chat_messages"});
    }

    @NotNull
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Map _typeConvertersMap = new LinkedHashMap();
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(PrayerLogDao.class), PrayerLogDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(MosqueReminderDao.class), MosqueReminderDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(QuranBookmarkDao.class), QuranBookmarkDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(UserPreferenceDao.class), UserPreferenceDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(UserDao.class), UserDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(ChatMessageDao.class), ChatMessageDao_Impl.INSTANCE.getRequiredConverters());
        return _typeConvertersMap;
    }

    @NotNull
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set _autoMigrationSpecsSet = new LinkedHashSet();
        return _autoMigrationSpecsSet;
    }

    @NotNull
    public List<Migration> createAutoMigrations(@NotNull Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        List _autoMigrations = new ArrayList();
        return _autoMigrations;
    }

    @Override // com.example.data.local.AppDatabase
    @NotNull
    public PrayerLogDao prayerLogDao() {
        return (PrayerLogDao) this._prayerLogDao.getValue();
    }

    @Override // com.example.data.local.AppDatabase
    @NotNull
    public MosqueReminderDao mosqueReminderDao() {
        return (MosqueReminderDao) this._mosqueReminderDao.getValue();
    }

    @Override // com.example.data.local.AppDatabase
    @NotNull
    public QuranBookmarkDao quranBookmarkDao() {
        return (QuranBookmarkDao) this._quranBookmarkDao.getValue();
    }

    @Override // com.example.data.local.AppDatabase
    @NotNull
    public UserPreferenceDao userPreferenceDao() {
        return (UserPreferenceDao) this._userPreferenceDao.getValue();
    }

    @Override // com.example.data.local.AppDatabase
    @NotNull
    public UserDao userDao() {
        return (UserDao) this._userDao.getValue();
    }

    @Override // com.example.data.local.AppDatabase
    @NotNull
    public ChatMessageDao chatMessageDao() {
        return (ChatMessageDao) this._chatMessageDao.getValue();
    }
}
