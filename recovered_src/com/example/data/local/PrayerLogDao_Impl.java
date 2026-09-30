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

/* compiled from: PrayerLogDao_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eH\u0016J\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/example/data/local/PrayerLogDao_Impl;", "Lcom/example/data/local/PrayerLogDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfPrayerLogEntity", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/local/PrayerLogEntity;", "insertOrUpdate", "", "entity", "(Lcom/example/data/local/PrayerLogEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogsForDate", "Lkotlinx/coroutines/flow/Flow;", "", "dateKey", "", "getAllLogs", "deleteLog", "prayerName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/PrayerLogDao_Impl.dex */
public final class PrayerLogDao_Impl implements PrayerLogDao {

    @NotNull
    private final RoomDatabase __db;

    @NotNull
    private final EntityInsertAdapter<PrayerLogEntity> __insertAdapterOfPrayerLogEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PrayerLogDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfPrayerLogEntity = new EntityInsertAdapter<PrayerLogEntity>() { // from class: com.example.data.local.PrayerLogDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `prayer_logs` (`id`,`dateKey`,`prayerName`,`isCompleted`,`completedAt`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(SQLiteStatement statement, PrayerLogEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, entity.getDateKey());
                statement.bindText(3, entity.getPrayerName());
                statement.bindLong(4, entity.isCompleted() ? 1L : 0L);
                statement.bindLong(5, entity.getCompletedAt());
            }
        };
    }

    @Override // com.example.data.local.PrayerLogDao
    @Nullable
    public Object insertOrUpdate(@NotNull final PrayerLogEntity entity, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.PrayerLogDao_Impl$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PrayerLogDao_Impl.insertOrUpdate$lambda$0(PrayerLogDao_Impl.this, entity, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertOrUpdate$lambda$0(PrayerLogDao_Impl this$0, PrayerLogEntity $entity, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfPrayerLogEntity.insert(_connection, $entity);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.local.PrayerLogDao
    @NotNull
    public Flow<List<PrayerLogEntity>> getLogsForDate(@NotNull final String dateKey) {
        Intrinsics.checkNotNullParameter(dateKey, "dateKey");
        final String _sql = "SELECT * FROM prayer_logs WHERE dateKey = ?";
        return FlowUtil.createFlow(this.__db, false, new String[]{"prayer_logs"}, new Function1() { // from class: com.example.data.local.PrayerLogDao_Impl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return PrayerLogDao_Impl.getLogsForDate$lambda$1(_sql, dateKey, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getLogsForDate$lambda$1(String $_sql, String $dateKey, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $dateKey);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfDateKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "dateKey");
            int _columnIndexOfPrayerName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "prayerName");
            int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
            int _columnIndexOfCompletedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "completedAt");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpId = _stmt.getLong(_columnIndexOfId);
                String _tmpDateKey = _stmt.getText(_columnIndexOfDateKey);
                String _tmpPrayerName = _stmt.getText(_columnIndexOfPrayerName);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsCompleted);
                boolean _tmpIsCompleted = _tmp != 0;
                long _tmpCompletedAt = _stmt.getLong(_columnIndexOfCompletedAt);
                PrayerLogEntity _item = new PrayerLogEntity(_tmpId, _tmpDateKey, _tmpPrayerName, _tmpIsCompleted, _tmpCompletedAt);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.PrayerLogDao
    @NotNull
    public Flow<List<PrayerLogEntity>> getAllLogs() {
        final String _sql = "SELECT * FROM prayer_logs ORDER BY completedAt DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"prayer_logs"}, new Function1() { // from class: com.example.data.local.PrayerLogDao_Impl$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return PrayerLogDao_Impl.getAllLogs$lambda$2(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllLogs$lambda$2(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfDateKey = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "dateKey");
            int _columnIndexOfPrayerName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "prayerName");
            int _columnIndexOfIsCompleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isCompleted");
            int _columnIndexOfCompletedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "completedAt");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpId = _stmt.getLong(_columnIndexOfId);
                String _tmpDateKey = _stmt.getText(_columnIndexOfDateKey);
                String _tmpPrayerName = _stmt.getText(_columnIndexOfPrayerName);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsCompleted);
                boolean _tmpIsCompleted = _tmp != 0;
                long _tmpCompletedAt = _stmt.getLong(_columnIndexOfCompletedAt);
                PrayerLogEntity _item = new PrayerLogEntity(_tmpId, _tmpDateKey, _tmpPrayerName, _tmpIsCompleted, _tmpCompletedAt);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.PrayerLogDao
    @Nullable
    public Object deleteLog(@NotNull final String dateKey, @NotNull final String prayerName, @NotNull Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM prayer_logs WHERE dateKey = ? AND prayerName = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.PrayerLogDao_Impl$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return PrayerLogDao_Impl.deleteLog$lambda$3(_sql, dateKey, prayerName, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteLog$lambda$3(String $_sql, String $dateKey, String $prayerName, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $dateKey);
            _stmt.bindText(2, $prayerName);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: PrayerLogDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/local/PrayerLogDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/PrayerLogDao_Impl$Companion.dex */
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
