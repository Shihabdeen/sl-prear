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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/example/data/local/QuranBookmarkDao;", "", "getAllBookmarks", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/local/QuranBookmarkEntity;", "insertBookmark", "", "entity", "(Lcom/example/data/local/QuranBookmarkEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBookmark", "surahNumber", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/QuranBookmarkDao.dex */
public interface QuranBookmarkDao {
    @Query("DELETE FROM quran_bookmarks WHERE surahNumber = :surahNumber")
    @Nullable
    Object deleteBookmark(int i, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM quran_bookmarks ORDER BY bookmarkedAt DESC")
    @NotNull
    Flow<List<QuranBookmarkEntity>> getAllBookmarks();

    @Insert(onConflict = 1)
    @Nullable
    Object insertBookmark(@NotNull QuranBookmarkEntity quranBookmarkEntity, @NotNull Continuation<? super Unit> continuation);
}
