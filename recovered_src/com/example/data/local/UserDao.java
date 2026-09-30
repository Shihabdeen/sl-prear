package com.example.data.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Daos.kt */
@Dao
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0006¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/example/data/local/UserDao;", "", "getActiveUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/data/local/UserEntity;", "getActiveUserOnce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserByPhone", "phone", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUser", "", "user", "(Lcom/example/data/local/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logoutAll", "clearUsers", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/UserDao.dex */
public interface UserDao {
    @Query("DELETE FROM users")
    @Nullable
    Object clearUsers(@NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM users WHERE isLoggedIn = 1 LIMIT 1")
    @NotNull
    Flow<UserEntity> getActiveUser();

    @Query("SELECT * FROM users WHERE isLoggedIn = 1 LIMIT 1")
    @Nullable
    Object getActiveUserOnce(@NotNull Continuation<? super UserEntity> continuation);

    @Query("SELECT * FROM users WHERE phoneNumber = :phone LIMIT 1")
    @Nullable
    Object getUserByPhone(@NotNull String str, @NotNull Continuation<? super UserEntity> continuation);

    @Query("UPDATE users SET isLoggedIn = 0")
    @Nullable
    Object logoutAll(@NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object saveUser(@NotNull UserEntity userEntity, @NotNull Continuation<? super Unit> continuation);
}
