package com.example.data.local;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserDao_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000eH\u0016J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0016\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/example/data/local/UserDao_Impl;", "Lcom/example/data/local/UserDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfUserEntity", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/local/UserEntity;", "saveUser", "", "user", "(Lcom/example/data/local/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveUser", "Lkotlinx/coroutines/flow/Flow;", "getActiveUserOnce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserByPhone", "phone", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logoutAll", "clearUsers", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/UserDao_Impl.dex */
public final class UserDao_Impl implements UserDao {

    @NotNull
    private final RoomDatabase __db;

    @NotNull
    private final EntityInsertAdapter<UserEntity> __insertAdapterOfUserEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UserDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfUserEntity = new EntityInsertAdapter<UserEntity>() { // from class: com.example.data.local.UserDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `users` (`phoneNumber`,`fullName`,`role`,`adminDesignation`,`mosqueAffiliation`,`isLoggedIn`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(SQLiteStatement statement, UserEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getPhoneNumber());
                statement.bindText(2, entity.getFullName());
                statement.bindText(3, entity.getRole());
                String adminDesignation = entity.getAdminDesignation();
                if (adminDesignation == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, adminDesignation);
                }
                String mosqueAffiliation = entity.getMosqueAffiliation();
                if (mosqueAffiliation == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, mosqueAffiliation);
                }
                statement.bindLong(6, entity.isLoggedIn() ? 1L : 0L);
            }
        };
    }

    @Override // com.example.data.local.UserDao
    @Nullable
    public Object saveUser(@NotNull final UserEntity user, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return UserDao_Impl.saveUser$lambda$0(UserDao_Impl.this, user, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit saveUser$lambda$0(UserDao_Impl this$0, UserEntity $user, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfUserEntity.insert(_connection, $user);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.local.UserDao
    @NotNull
    public Flow<UserEntity> getActiveUser() {
        final String _sql = "SELECT * FROM users WHERE isLoggedIn = 1 LIMIT 1";
        return FlowUtil.createFlow(this.__db, false, new String[]{"users"}, new Function1() { // from class: com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return UserDao_Impl.getActiveUser$lambda$1(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final UserEntity getActiveUser$lambda$1(String $_sql, SQLiteConnection _connection) {
        UserEntity _result;
        String _tmpAdminDesignation;
        String _tmpMosqueAffiliation;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfPhoneNumber = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "phoneNumber");
            int _columnIndexOfFullName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fullName");
            int _columnIndexOfRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "role");
            int _columnIndexOfAdminDesignation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "adminDesignation");
            int _columnIndexOfMosqueAffiliation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mosqueAffiliation");
            int _columnIndexOfIsLoggedIn = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLoggedIn");
            if (_stmt.step()) {
                String _tmpPhoneNumber = _stmt.getText(_columnIndexOfPhoneNumber);
                String _tmpFullName = _stmt.getText(_columnIndexOfFullName);
                String _tmpRole = _stmt.getText(_columnIndexOfRole);
                if (_stmt.isNull(_columnIndexOfAdminDesignation)) {
                    _tmpAdminDesignation = null;
                } else {
                    String _tmpAdminDesignation2 = _stmt.getText(_columnIndexOfAdminDesignation);
                    _tmpAdminDesignation = _tmpAdminDesignation2;
                }
                if (_stmt.isNull(_columnIndexOfMosqueAffiliation)) {
                    _tmpMosqueAffiliation = null;
                } else {
                    String _tmpMosqueAffiliation2 = _stmt.getText(_columnIndexOfMosqueAffiliation);
                    _tmpMosqueAffiliation = _tmpMosqueAffiliation2;
                }
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsLoggedIn);
                boolean _tmpIsLoggedIn = _tmp != 0;
                _result = new UserEntity(_tmpPhoneNumber, _tmpFullName, _tmpRole, _tmpAdminDesignation, _tmpMosqueAffiliation, _tmpIsLoggedIn);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.UserDao
    @Nullable
    public Object getActiveUserOnce(@NotNull Continuation<? super UserEntity> continuation) {
        final String _sql = "SELECT * FROM users WHERE isLoggedIn = 1 LIMIT 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return UserDao_Impl.getActiveUserOnce$lambda$2(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final UserEntity getActiveUserOnce$lambda$2(String $_sql, SQLiteConnection _connection) {
        UserEntity _result;
        String _tmpAdminDesignation;
        String _tmpMosqueAffiliation;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfPhoneNumber = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "phoneNumber");
            int _columnIndexOfFullName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fullName");
            int _columnIndexOfRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "role");
            int _columnIndexOfAdminDesignation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "adminDesignation");
            int _columnIndexOfMosqueAffiliation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mosqueAffiliation");
            int _columnIndexOfIsLoggedIn = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLoggedIn");
            if (_stmt.step()) {
                String _tmpPhoneNumber = _stmt.getText(_columnIndexOfPhoneNumber);
                String _tmpFullName = _stmt.getText(_columnIndexOfFullName);
                String _tmpRole = _stmt.getText(_columnIndexOfRole);
                if (_stmt.isNull(_columnIndexOfAdminDesignation)) {
                    _tmpAdminDesignation = null;
                } else {
                    String _tmpAdminDesignation2 = _stmt.getText(_columnIndexOfAdminDesignation);
                    _tmpAdminDesignation = _tmpAdminDesignation2;
                }
                if (_stmt.isNull(_columnIndexOfMosqueAffiliation)) {
                    _tmpMosqueAffiliation = null;
                } else {
                    String _tmpMosqueAffiliation2 = _stmt.getText(_columnIndexOfMosqueAffiliation);
                    _tmpMosqueAffiliation = _tmpMosqueAffiliation2;
                }
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsLoggedIn);
                boolean _tmpIsLoggedIn = _tmp != 0;
                _result = new UserEntity(_tmpPhoneNumber, _tmpFullName, _tmpRole, _tmpAdminDesignation, _tmpMosqueAffiliation, _tmpIsLoggedIn);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.UserDao
    @Nullable
    public Object getUserByPhone(@NotNull final String phone, @NotNull Continuation<? super UserEntity> continuation) {
        final String _sql = "SELECT * FROM users WHERE phoneNumber = ? LIMIT 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return UserDao_Impl.getUserByPhone$lambda$3(_sql, phone, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final UserEntity getUserByPhone$lambda$3(String $_sql, String $phone, SQLiteConnection _connection) {
        UserEntity _result;
        String _tmpAdminDesignation;
        String _tmpMosqueAffiliation;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $phone);
            int _columnIndexOfPhoneNumber = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "phoneNumber");
            int _columnIndexOfFullName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fullName");
            int _columnIndexOfRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "role");
            int _columnIndexOfAdminDesignation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "adminDesignation");
            int _columnIndexOfMosqueAffiliation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mosqueAffiliation");
            int _columnIndexOfIsLoggedIn = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isLoggedIn");
            if (_stmt.step()) {
                String _tmpPhoneNumber = _stmt.getText(_columnIndexOfPhoneNumber);
                String _tmpFullName = _stmt.getText(_columnIndexOfFullName);
                String _tmpRole = _stmt.getText(_columnIndexOfRole);
                if (_stmt.isNull(_columnIndexOfAdminDesignation)) {
                    _tmpAdminDesignation = null;
                } else {
                    String _tmpAdminDesignation2 = _stmt.getText(_columnIndexOfAdminDesignation);
                    _tmpAdminDesignation = _tmpAdminDesignation2;
                }
                if (_stmt.isNull(_columnIndexOfMosqueAffiliation)) {
                    _tmpMosqueAffiliation = null;
                } else {
                    String _tmpMosqueAffiliation2 = _stmt.getText(_columnIndexOfMosqueAffiliation);
                    _tmpMosqueAffiliation = _tmpMosqueAffiliation2;
                }
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsLoggedIn);
                boolean _tmpIsLoggedIn = _tmp != 0;
                _result = new UserEntity(_tmpPhoneNumber, _tmpFullName, _tmpRole, _tmpAdminDesignation, _tmpMosqueAffiliation, _tmpIsLoggedIn);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.UserDao
    @Nullable
    public Object logoutAll(@NotNull Continuation<? super Unit> continuation) {
        final String _sql = "UPDATE users SET isLoggedIn = 0";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UserDao_Impl.logoutAll$lambda$4(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit logoutAll$lambda$4(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.example.data.local.UserDao
    @Nullable
    public Object clearUsers(@NotNull Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM users";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.UserDao_Impl$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return UserDao_Impl.clearUsers$lambda$5(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit clearUsers$lambda$5(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: UserDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/local/UserDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/UserDao_Impl$Companion.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
