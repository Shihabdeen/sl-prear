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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/example/data/local/UserPreferenceDao;", "", "getAllPreferences", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/local/UserPreferenceEntity;", "getPreferenceValue", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPreference", "", "entity", "(Lcom/example/data/local/UserPreferenceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/UserPreferenceDao.dex */
public interface UserPreferenceDao {
    @Query("SELECT * FROM user_preferences")
    @NotNull
    Flow<List<UserPreferenceEntity>> getAllPreferences();

    @Query("SELECT value FROM user_preferences WHERE `key` = :key")
    @Nullable
    Object getPreferenceValue(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object setPreference(@NotNull UserPreferenceEntity userPreferenceEntity, @NotNull Continuation<? super Unit> continuation);
}
