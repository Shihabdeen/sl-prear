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

/* compiled from: MosqueReminderDao_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/data/local/MosqueReminderDao_Impl;", "Lcom/example/data/local/MosqueReminderDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMosqueReminderEntity", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/local/MosqueReminderEntity;", "insertOrUpdate", "", "entity", "(Lcom/example/data/local/MosqueReminderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllReminders", "Lkotlinx/coroutines/flow/Flow;", "", "deleteReminder", "eventId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/MosqueReminderDao_Impl.dex */
public final class MosqueReminderDao_Impl implements MosqueReminderDao {

    @NotNull
    private final RoomDatabase __db;

    @NotNull
    private final EntityInsertAdapter<MosqueReminderEntity> __insertAdapterOfMosqueReminderEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MosqueReminderDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfMosqueReminderEntity = new EntityInsertAdapter<MosqueReminderEntity>() { // from class: com.example.data.local.MosqueReminderDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `mosque_reminders` (`eventId`,`isReminderActive`,`reminderTime`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(SQLiteStatement statement, MosqueReminderEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getEventId());
                statement.bindLong(2, entity.isReminderActive() ? 1L : 0L);
                statement.bindLong(3, entity.getReminderTime());
            }
        };
    }

    @Override // com.example.data.local.MosqueReminderDao
    @Nullable
    public Object insertOrUpdate(@NotNull final MosqueReminderEntity entity, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.MosqueReminderDao_Impl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return MosqueReminderDao_Impl.insertOrUpdate$lambda$0(MosqueReminderDao_Impl.this, entity, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertOrUpdate$lambda$0(MosqueReminderDao_Impl this$0, MosqueReminderEntity $entity, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfMosqueReminderEntity.insert(_connection, $entity);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.local.MosqueReminderDao
    @NotNull
    public Flow<List<MosqueReminderEntity>> getAllReminders() {
        final String _sql = "SELECT * FROM mosque_reminders";
        return FlowUtil.createFlow(this.__db, false, new String[]{"mosque_reminders"}, new Function1() { // from class: com.example.data.local.MosqueReminderDao_Impl$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return MosqueReminderDao_Impl.getAllReminders$lambda$1(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllReminders$lambda$1(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfEventId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "eventId");
            int _columnIndexOfIsReminderActive = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isReminderActive");
            int _columnIndexOfReminderTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reminderTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpEventId = _stmt.getLong(_columnIndexOfEventId);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsReminderActive);
                boolean _tmpIsReminderActive = _tmp != 0;
                long _tmpReminderTime = _stmt.getLong(_columnIndexOfReminderTime);
                MosqueReminderEntity _item = new MosqueReminderEntity(_tmpEventId, _tmpIsReminderActive, _tmpReminderTime);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.MosqueReminderDao
    @Nullable
    public Object deleteReminder(final long eventId, @NotNull Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM mosque_reminders WHERE eventId = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.MosqueReminderDao_Impl$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return MosqueReminderDao_Impl.deleteReminder$lambda$2(_sql, eventId, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteReminder$lambda$2(String $_sql, long $eventId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $eventId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: MosqueReminderDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/local/MosqueReminderDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/MosqueReminderDao_Impl$Companion.dex */
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
