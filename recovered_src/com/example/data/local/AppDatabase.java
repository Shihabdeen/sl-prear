package com.example.data.local;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppDatabase.kt */
@StabilityInferred(parameters = 0)
@Database(entities = {PrayerLogEntity.class, MosqueReminderEntity.class, QuranBookmarkEntity.class, UserPreferenceEntity.class, UserEntity.class, ChatMessageEntity.class}, exportSchema = BuildConfig.DEBUG, version = BuildConfig.VERSION_CODE)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/example/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "prayerLogDao", "Lcom/example/data/local/PrayerLogDao;", "mosqueReminderDao", "Lcom/example/data/local/MosqueReminderDao;", "quranBookmarkDao", "Lcom/example/data/local/QuranBookmarkDao;", "userPreferenceDao", "Lcom/example/data/local/UserPreferenceDao;", "userDao", "Lcom/example/data/local/UserDao;", "chatMessageDao", "Lcom/example/data/local/ChatMessageDao;", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/AppDatabase.dex */
public abstract class AppDatabase extends RoomDatabase {

    @Nullable
    private static volatile AppDatabase INSTANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public abstract ChatMessageDao chatMessageDao();

    @NotNull
    public abstract MosqueReminderDao mosqueReminderDao();

    @NotNull
    public abstract PrayerLogDao prayerLogDao();

    @NotNull
    public abstract QuranBookmarkDao quranBookmarkDao();

    @NotNull
    public abstract UserDao userDao();

    @NotNull
    public abstract UserPreferenceDao userPreferenceDao();

    /* compiled from: AppDatabase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/example/data/local/AppDatabase$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/example/data/local/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/AppDatabase$Companion.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final AppDatabase getDatabase(@NotNull Context context) {
            AppDatabase appDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            AppDatabase appDatabase2 = AppDatabase.INSTANCE;
            if (appDatabase2 != null) {
                return appDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                appDatabase = (AppDatabase) Room.databaseBuilder(applicationContext, AppDatabase.class, "sl_prayer_tracker.db").fallbackToDestructiveMigration().build();
                Companion companion = AppDatabase.INSTANCE;
                AppDatabase.INSTANCE = appDatabase;
            }
            return appDatabase;
        }
    }
}
