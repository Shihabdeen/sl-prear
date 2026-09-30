package com.example.data.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Daos.kt */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/example/data/local/PrayerLogDao;", "", "getLogsForDate", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/local/PrayerLogEntity;", "dateKey", "", "getAllLogs", "insertOrUpdate", "", "entity", "(Lcom/example/data/local/PrayerLogEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLog", "prayerName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/PrayerLogDao.dex */
public interface PrayerLogDao {
    @Query("DELETE FROM prayer_logs WHERE dateKey = :dateKey AND prayerName = :prayerName")
    @Nullable
    Object deleteLog(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM prayer_logs ORDER BY completedAt DESC")
    @NotNull
    Flow<List<PrayerLogEntity>> getAllLogs();

    @Query("SELECT * FROM prayer_logs WHERE dateKey = :dateKey")
    @NotNull
    Flow<List<PrayerLogEntity>> getLogsForDate(@NotNull String dateKey);

    @Insert(onConflict = 1)
    @Nullable
    Object insertOrUpdate(@NotNull PrayerLogEntity prayerLogEntity, @NotNull Continuation<? super Unit> continuation);
}
