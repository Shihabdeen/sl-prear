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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u000e\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u000bJ0\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u001e¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/example/data/local/ChatMessageDao;", "", "getMessagesForGroup", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/local/ChatMessageEntity;", "groupId", "", "getAllAdminMessages", "getMessageCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroupMessageCount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMessage", "", "message", "(Lcom/example/data/local/ChatMessageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "messages", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMessagesList", "findExisting", "timestamp", "", "senderPhone", "text", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessage", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementReaction", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/local/ChatMessageDao.dex */
public interface ChatMessageDao {
    @Query("DELETE FROM chat_messages WHERE id = :id")
    @Nullable
    Object deleteMessage(long j, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM chat_messages WHERE groupId = :groupId AND ((timestamp = :timestamp AND senderPhone = :senderPhone) OR (text = :text AND timestamp = :timestamp)) LIMIT 1")
    @Nullable
    Object findExisting(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ChatMessageEntity> continuation);

    @Query("SELECT * FROM chat_messages WHERE senderRole = 'ADMIN' ORDER BY timestamp DESC")
    @NotNull
    Flow<List<ChatMessageEntity>> getAllAdminMessages();

    @Query("SELECT * FROM chat_messages ORDER BY timestamp DESC")
    @Nullable
    Object getAllMessagesList(@NotNull Continuation<? super List<ChatMessageEntity>> continuation);

    @Query("SELECT COUNT(*) FROM chat_messages WHERE groupId = :groupId")
    @Nullable
    Object getGroupMessageCount(@NotNull String str, @NotNull Continuation<? super Integer> continuation);

    @Query("SELECT COUNT(*) FROM chat_messages")
    @Nullable
    Object getMessageCount(@NotNull Continuation<? super Integer> continuation);

    @Query("SELECT * FROM chat_messages WHERE groupId = :groupId ORDER BY timestamp ASC")
    @NotNull
    Flow<List<ChatMessageEntity>> getMessagesForGroup(@NotNull String groupId);

    @Query("UPDATE chat_messages SET reactionsCount = reactionsCount + 1 WHERE id = :id")
    @Nullable
    Object incrementReaction(long j, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertAll(@NotNull List<ChatMessageEntity> list, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertMessage(@NotNull ChatMessageEntity chatMessageEntity, @NotNull Continuation<? super Unit> continuation);
}
