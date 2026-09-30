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
import java.util.ArrayList;
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

/* compiled from: UserPreferenceDao_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eH\u0016J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/data/local/UserPreferenceDao_Impl;", "Lcom/example/data/local/UserPreferenceDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfUserPreferenceEntity", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/local/UserPreferenceEntity;", "setPreference", "", "entity", "(Lcom/example/data/local/UserPreferenceEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPreferences", "Lkotlinx/coroutines/flow/Flow;", "", "getPreferenceValue", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/UserPreferenceDao_Impl.dex */
public final class UserPreferenceDao_Impl implements UserPreferenceDao {

    @NotNull
    private final RoomDatabase __db;

    @NotNull
    private final EntityInsertAdapter<UserPreferenceEntity> __insertAdapterOfUserPreferenceEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UserPreferenceDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfUserPreferenceEntity = new EntityInsertAdapter<UserPreferenceEntity>() { // from class: com.example.data.local.UserPreferenceDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `user_preferences` (`key`,`value`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(SQLiteStatement statement, UserPreferenceEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getKey());
                statement.bindText(2, entity.getValue());
            }
        };
    }

    @Override // com.example.data.local.UserPreferenceDao
    @Nullable
    public Object setPreference(@NotNull final UserPreferenceEntity entity, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.UserPreferenceDao_Impl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UserPreferenceDao_Impl.setPreference$lambda$0(UserPreferenceDao_Impl.this, entity, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit setPreference$lambda$0(UserPreferenceDao_Impl this$0, UserPreferenceEntity $entity, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfUserPreferenceEntity.insert(_connection, $entity);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.local.UserPreferenceDao
    @NotNull
    public Flow<List<UserPreferenceEntity>> getAllPreferences() {
        final String _sql = "SELECT * FROM user_preferences";
        return FlowUtil.createFlow(this.__db, false, new String[]{"user_preferences"}, new Function1() { // from class: com.example.data.local.UserPreferenceDao_Impl$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return UserPreferenceDao_Impl.getAllPreferences$lambda$1(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllPreferences$lambda$1(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "key");
            int _columnIndexOfValue = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "value");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpKey = _stmt.getText(_columnIndexOfKey);
                String _tmpValue = _stmt.getText(_columnIndexOfValue);
                UserPreferenceEntity _item = new UserPreferenceEntity(_tmpKey, _tmpValue);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.UserPreferenceDao
    @Nullable
    public Object getPreferenceValue(@NotNull final String key, @NotNull Continuation<? super String> continuation) {
        final String _sql = "SELECT value FROM user_preferences WHERE `key` = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.local.UserPreferenceDao_Impl$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return UserPreferenceDao_Impl.getPreferenceValue$lambda$2(_sql, key, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String getPreferenceValue$lambda$2(String $_sql, String $key, SQLiteConnection _connection) {
        String _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $key);
            if (_stmt.step()) {
                if (_stmt.isNull(0)) {
                    _result = null;
                } else {
                    _result = _stmt.getText(0);
                }
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    /* compiled from: UserPreferenceDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/local/UserPreferenceDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/UserPreferenceDao_Impl$Companion.dex */
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
