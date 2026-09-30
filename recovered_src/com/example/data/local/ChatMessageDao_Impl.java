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

/* compiled from: ChatMessageDao_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u0012H\u0016J\u000e\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0096@¢\u0006\u0002\u0010\u0018J0\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/example/data/local/ChatMessageDao_Impl;", "Lcom/example/data/local/ChatMessageDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfChatMessageEntity", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/local/ChatMessageEntity;", "insertMessage", "", "message", "(Lcom/example/data/local/ChatMessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "messages", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesForGroup", "Lkotlinx/coroutines/flow/Flow;", "groupId", "", "getAllAdminMessages", "getMessageCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroupMessageCount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMessagesList", "findExisting", "timestamp", "", "senderPhone", "text", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessage", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementReaction", "Companion", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/ChatMessageDao_Impl.dex */
public final class ChatMessageDao_Impl implements ChatMessageDao {

    @NotNull
    private final RoomDatabase __db;

    @NotNull
    private final EntityInsertAdapter<ChatMessageEntity> __insertAdapterOfChatMessageEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ChatMessageDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfChatMessageEntity = new EntityInsertAdapter<ChatMessageEntity>() { // from class: com.example.data.local.ChatMessageDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `chat_messages` (`id`,`groupId`,`senderPhone`,`senderName`,`senderRole`,`senderDesignation`,`senderMosque`,`text`,`timestamp`,`tag`,`isPinned`,`reactionsCount`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(SQLiteStatement statement, ChatMessageEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, entity.getGroupId());
                statement.bindText(3, entity.getSenderPhone());
                statement.bindText(4, entity.getSenderName());
                statement.bindText(5, entity.getSenderRole());
                String senderDesignation = entity.getSenderDesignation();
                if (senderDesignation == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindText(6, senderDesignation);
                }
                String senderMosque = entity.getSenderMosque();
                if (senderMosque == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindText(7, senderMosque);
                }
                statement.bindText(8, entity.getText());
                statement.bindLong(9, entity.getTimestamp());
                String tag = entity.getTag();
                if (tag == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindText(10, tag);
                }
                statement.bindLong(11, entity.isPinned() ? 1L : 0L);
                statement.bindLong(12, entity.getReactionsCount());
            }
        };
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object insertMessage(@NotNull final ChatMessageEntity message, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.insertMessage$lambda$0(ChatMessageDao_Impl.this, message, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertMessage$lambda$0(ChatMessageDao_Impl this$0, ChatMessageEntity $message, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfChatMessageEntity.insert(_connection, $message);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object insertAll(@NotNull final List<ChatMessageEntity> list, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.insertAll$lambda$1(ChatMessageDao_Impl.this, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit insertAll$lambda$1(ChatMessageDao_Impl this$0, List $messages, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfChatMessageEntity.insert(_connection, $messages);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.local.ChatMessageDao
    @NotNull
    public Flow<List<ChatMessageEntity>> getMessagesForGroup(@NotNull final String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        final String _sql = "SELECT * FROM chat_messages WHERE groupId = ? ORDER BY timestamp ASC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"chat_messages"}, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.getMessagesForGroup$lambda$2(_sql, groupId, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getMessagesForGroup$lambda$2(String $_sql, String $groupId, SQLiteConnection _connection) {
        String _tmpSenderDesignation;
        String _tmpSenderMosque;
        String _tmpTag;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $groupId);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfGroupId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "groupId");
            int _columnIndexOfSenderPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderPhone");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderRole");
            int _columnIndexOfSenderDesignation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderDesignation");
            int _columnIndexOfSenderMosque = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderMosque");
            int _columnIndexOfText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "text");
            int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
            int _columnIndexOfTag = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tag");
            int _columnIndexOfIsPinned = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isPinned");
            int _columnIndexOfReactionsCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reactionsCount");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpId = _stmt.getLong(_columnIndexOfId);
                String _tmpGroupId = _stmt.getText(_columnIndexOfGroupId);
                String _tmpSenderPhone = _stmt.getText(_columnIndexOfSenderPhone);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderRole = _stmt.getText(_columnIndexOfSenderRole);
                if (_stmt.isNull(_columnIndexOfSenderDesignation)) {
                    _tmpSenderDesignation = null;
                } else {
                    String _tmpSenderDesignation2 = _stmt.getText(_columnIndexOfSenderDesignation);
                    _tmpSenderDesignation = _tmpSenderDesignation2;
                }
                if (_stmt.isNull(_columnIndexOfSenderMosque)) {
                    _tmpSenderMosque = null;
                } else {
                    String _tmpSenderMosque2 = _stmt.getText(_columnIndexOfSenderMosque);
                    _tmpSenderMosque = _tmpSenderMosque2;
                }
                String _tmpText = _stmt.getText(_columnIndexOfText);
                long _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
                if (_stmt.isNull(_columnIndexOfTag)) {
                    _tmpTag = null;
                } else {
                    String _tmpTag2 = _stmt.getText(_columnIndexOfTag);
                    _tmpTag = _tmpTag2;
                }
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsPinned);
                boolean _tmpIsPinned = _tmp != 0;
                int _tmpReactionsCount = (int) _stmt.getLong(_columnIndexOfReactionsCount);
                ChatMessageEntity _item = new ChatMessageEntity(_tmpId, _tmpGroupId, _tmpSenderPhone, _tmpSenderName, _tmpSenderRole, _tmpSenderDesignation, _tmpSenderMosque, _tmpText, _tmpTimestamp, _tmpTag, _tmpIsPinned, _tmpReactionsCount);
                List _result2 = _result;
                _result2.add(_item);
                _result = _result2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.ChatMessageDao
    @NotNull
    public Flow<List<ChatMessageEntity>> getAllAdminMessages() {
        final String _sql = "SELECT * FROM chat_messages WHERE senderRole = 'ADMIN' ORDER BY timestamp DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"chat_messages"}, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.getAllAdminMessages$lambda$3(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllAdminMessages$lambda$3(String $_sql, SQLiteConnection _connection) {
        String _tmpSenderDesignation;
        String _tmpSenderMosque;
        String _tmpTag;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfGroupId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "groupId");
            int _columnIndexOfSenderPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderPhone");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderRole");
            int _columnIndexOfSenderDesignation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderDesignation");
            int _columnIndexOfSenderMosque = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderMosque");
            int _columnIndexOfText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "text");
            int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
            int _columnIndexOfTag = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tag");
            int _columnIndexOfIsPinned = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isPinned");
            int _columnIndexOfReactionsCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reactionsCount");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpId = _stmt.getLong(_columnIndexOfId);
                String _tmpGroupId = _stmt.getText(_columnIndexOfGroupId);
                String _tmpSenderPhone = _stmt.getText(_columnIndexOfSenderPhone);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderRole = _stmt.getText(_columnIndexOfSenderRole);
                if (_stmt.isNull(_columnIndexOfSenderDesignation)) {
                    _tmpSenderDesignation = null;
                } else {
                    String _tmpSenderDesignation2 = _stmt.getText(_columnIndexOfSenderDesignation);
                    _tmpSenderDesignation = _tmpSenderDesignation2;
                }
                if (_stmt.isNull(_columnIndexOfSenderMosque)) {
                    _tmpSenderMosque = null;
                } else {
                    String _tmpSenderMosque2 = _stmt.getText(_columnIndexOfSenderMosque);
                    _tmpSenderMosque = _tmpSenderMosque2;
                }
                String _tmpText = _stmt.getText(_columnIndexOfText);
                long _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
                if (_stmt.isNull(_columnIndexOfTag)) {
                    _tmpTag = null;
                } else {
                    String _tmpTag2 = _stmt.getText(_columnIndexOfTag);
                    _tmpTag = _tmpTag2;
                }
                int _columnIndexOfId2 = _columnIndexOfId;
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsPinned);
                boolean _tmpIsPinned = _tmp != 0;
                int _tmpReactionsCount = (int) _stmt.getLong(_columnIndexOfReactionsCount);
                ChatMessageEntity _item = new ChatMessageEntity(_tmpId, _tmpGroupId, _tmpSenderPhone, _tmpSenderName, _tmpSenderRole, _tmpSenderDesignation, _tmpSenderMosque, _tmpText, _tmpTimestamp, _tmpTag, _tmpIsPinned, _tmpReactionsCount);
                _result.add(_item);
                _columnIndexOfId = _columnIndexOfId2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object getMessageCount(@NotNull Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM chat_messages";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return Integer.valueOf(ChatMessageDao_Impl.getMessageCount$lambda$4(_sql, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int getMessageCount$lambda$4(String $_sql, SQLiteConnection _connection) {
        int _tmp;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            if (_stmt.step()) {
                _tmp = (int) _stmt.getLong(0);
            } else {
                _tmp = 0;
            }
            return _tmp;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object getGroupMessageCount(@NotNull final String groupId, @NotNull Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM chat_messages WHERE groupId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return Integer.valueOf(ChatMessageDao_Impl.getGroupMessageCount$lambda$5(_sql, groupId, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int getGroupMessageCount$lambda$5(String $_sql, String $groupId, SQLiteConnection _connection) {
        int _tmp;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $groupId);
            if (_stmt.step()) {
                _tmp = (int) _stmt.getLong(0);
            } else {
                _tmp = 0;
            }
            return _tmp;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object getAllMessagesList(@NotNull Continuation<? super List<ChatMessageEntity>> continuation) {
        final String _sql = "SELECT * FROM chat_messages ORDER BY timestamp DESC";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.getAllMessagesList$lambda$6(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllMessagesList$lambda$6(String $_sql, SQLiteConnection _connection) {
        String _tmpSenderDesignation;
        String _tmpSenderMosque;
        String _tmpTag;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfGroupId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "groupId");
            int _columnIndexOfSenderPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderPhone");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderRole");
            int _columnIndexOfSenderDesignation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderDesignation");
            int _columnIndexOfSenderMosque = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderMosque");
            int _columnIndexOfText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "text");
            int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
            int _columnIndexOfTag = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tag");
            int _columnIndexOfIsPinned = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isPinned");
            int _columnIndexOfReactionsCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reactionsCount");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpId = _stmt.getLong(_columnIndexOfId);
                String _tmpGroupId = _stmt.getText(_columnIndexOfGroupId);
                String _tmpSenderPhone = _stmt.getText(_columnIndexOfSenderPhone);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderRole = _stmt.getText(_columnIndexOfSenderRole);
                if (_stmt.isNull(_columnIndexOfSenderDesignation)) {
                    _tmpSenderDesignation = null;
                } else {
                    String _tmpSenderDesignation2 = _stmt.getText(_columnIndexOfSenderDesignation);
                    _tmpSenderDesignation = _tmpSenderDesignation2;
                }
                if (_stmt.isNull(_columnIndexOfSenderMosque)) {
                    _tmpSenderMosque = null;
                } else {
                    String _tmpSenderMosque2 = _stmt.getText(_columnIndexOfSenderMosque);
                    _tmpSenderMosque = _tmpSenderMosque2;
                }
                String _tmpText = _stmt.getText(_columnIndexOfText);
                long _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
                if (_stmt.isNull(_columnIndexOfTag)) {
                    _tmpTag = null;
                } else {
                    String _tmpTag2 = _stmt.getText(_columnIndexOfTag);
                    _tmpTag = _tmpTag2;
                }
                int _columnIndexOfId2 = _columnIndexOfId;
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsPinned);
                boolean _tmpIsPinned = _tmp != 0;
                int _tmpReactionsCount = (int) _stmt.getLong(_columnIndexOfReactionsCount);
                ChatMessageEntity _item = new ChatMessageEntity(_tmpId, _tmpGroupId, _tmpSenderPhone, _tmpSenderName, _tmpSenderRole, _tmpSenderDesignation, _tmpSenderMosque, _tmpText, _tmpTimestamp, _tmpTag, _tmpIsPinned, _tmpReactionsCount);
                _result.add(_item);
                _columnIndexOfId = _columnIndexOfId2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object findExisting(@NotNull final String groupId, final long timestamp, @NotNull final String senderPhone, @NotNull final String text, @NotNull Continuation<? super ChatMessageEntity> continuation) {
        final String _sql = "SELECT * FROM chat_messages WHERE groupId = ? AND ((timestamp = ? AND senderPhone = ?) OR (text = ? AND timestamp = ?)) LIMIT 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.findExisting$lambda$7(_sql, groupId, timestamp, senderPhone, text, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final ChatMessageEntity findExisting$lambda$7(String $_sql, String $groupId, long $timestamp, String $senderPhone, String $text, SQLiteConnection _connection) {
        ChatMessageEntity _result;
        String _tmpSenderDesignation;
        String _tmpSenderMosque;
        String _tmpTag;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $groupId);
            _stmt.bindLong(2, $timestamp);
            try {
                _stmt.bindText(3, $senderPhone);
                try {
                    _stmt.bindText(4, $text);
                    _stmt.bindLong(5, $timestamp);
                    int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
                    int _columnIndexOfGroupId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "groupId");
                    int _columnIndexOfSenderPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderPhone");
                    int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
                    int _columnIndexOfSenderRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderRole");
                    int _columnIndexOfSenderDesignation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderDesignation");
                    int _columnIndexOfSenderMosque = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderMosque");
                    int _columnIndexOfText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "text");
                    int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
                    int _columnIndexOfTag = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tag");
                    int _columnIndexOfIsPinned = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isPinned");
                    int _columnIndexOfReactionsCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reactionsCount");
                    if (_stmt.step()) {
                        long _tmpId = _stmt.getLong(_columnIndexOfId);
                        String _tmpGroupId = _stmt.getText(_columnIndexOfGroupId);
                        String _tmpSenderPhone = _stmt.getText(_columnIndexOfSenderPhone);
                        String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                        String _tmpSenderRole = _stmt.getText(_columnIndexOfSenderRole);
                        if (_stmt.isNull(_columnIndexOfSenderDesignation)) {
                            _tmpSenderDesignation = null;
                        } else {
                            String _tmpSenderDesignation2 = _stmt.getText(_columnIndexOfSenderDesignation);
                            _tmpSenderDesignation = _tmpSenderDesignation2;
                        }
                        if (_stmt.isNull(_columnIndexOfSenderMosque)) {
                            _tmpSenderMosque = null;
                        } else {
                            String _tmpSenderMosque2 = _stmt.getText(_columnIndexOfSenderMosque);
                            _tmpSenderMosque = _tmpSenderMosque2;
                        }
                        String _tmpText = _stmt.getText(_columnIndexOfText);
                        long _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
                        if (_stmt.isNull(_columnIndexOfTag)) {
                            _tmpTag = null;
                        } else {
                            String _tmpTag2 = _stmt.getText(_columnIndexOfTag);
                            _tmpTag = _tmpTag2;
                        }
                        int _tmp = (int) _stmt.getLong(_columnIndexOfIsPinned);
                        boolean _tmpIsPinned = _tmp != 0;
                        int _tmpReactionsCount = (int) _stmt.getLong(_columnIndexOfReactionsCount);
                        _result = new ChatMessageEntity(_tmpId, _tmpGroupId, _tmpSenderPhone, _tmpSenderName, _tmpSenderRole, _tmpSenderDesignation, _tmpSenderMosque, _tmpText, _tmpTimestamp, _tmpTag, _tmpIsPinned, _tmpReactionsCount);
                    } else {
                        _result = null;
                    }
                    _stmt.close();
                    return _result;
                } catch (Throwable th) {
                    th = th;
                    _stmt.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                _stmt.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object deleteMessage(final long id, @NotNull Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM chat_messages WHERE id = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.deleteMessage$lambda$8(_sql, id, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteMessage$lambda$8(String $_sql, long $id, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $id);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.example.data.local.ChatMessageDao
    @Nullable
    public Object incrementReaction(final long id, @NotNull Continuation<? super Unit> continuation) {
        final String _sql = "UPDATE chat_messages SET reactionsCount = reactionsCount + 1 WHERE id = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.local.ChatMessageDao_Impl$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return ChatMessageDao_Impl.incrementReaction$lambda$9(_sql, id, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit incrementReaction$lambda$9(String $_sql, long $id, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $id);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: ChatMessageDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/local/ChatMessageDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/ChatMessageDao_Impl$Companion.dex */
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
