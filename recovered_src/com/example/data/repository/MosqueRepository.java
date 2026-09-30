package com.example.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import com.example.data.local.AppDatabase;
import com.example.data.local.MosqueReminderDao;
import com.example.data.model.MosqueEvent;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: MosqueRepository.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/example/data/repository/MosqueRepository;", "", "db", "Lcom/example/data/local/AppDatabase;", "<init>", "(Lcom/example/data/local/AppDatabase;)V", "reminderDao", "Lcom/example/data/local/MosqueReminderDao;", "_communityEvents", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/data/model/MosqueEvent;", "getAllEventsFlow", "Lkotlinx/coroutines/flow/Flow;", "toggleReminder", "", "event", "(Lcom/example/data/model/MosqueEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCommunityEvent", "", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/MosqueRepository.dex */
public final class MosqueRepository {
    public static final int $stable = 8;

    @NotNull
    private final MutableStateFlow<List<MosqueEvent>> _communityEvents;

    @NotNull
    private final AppDatabase db;

    @NotNull
    private final MosqueReminderDao reminderDao;

    public MosqueRepository(@NotNull AppDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
        this.reminderDao = this.db.mosqueReminderDao();
        this._communityEvents = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
    }

    @NotNull
    public final Flow<List<MosqueEvent>> getAllEventsFlow() {
        return FlowKt.combine(this.reminderDao.getAllReminders(), this._communityEvents, new MosqueRepository$getAllEventsFlow$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toggleReminder(@org.jetbrains.annotations.NotNull com.example.data.model.MosqueEvent r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.example.data.repository.MosqueRepository$toggleReminder$1
            if (r0 == 0) goto L14
            r0 = r14
            com.example.data.repository.MosqueRepository$toggleReminder$1 r0 = (com.example.data.repository.MosqueRepository$toggleReminder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.MosqueRepository$toggleReminder$1 r0 = new com.example.data.repository.MosqueRepository$toggleReminder$1
            r0.<init>(r12, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L43;
                case 1: goto L38;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r2 = r0.I$0
            java.lang.Object r3 = r0.L$0
            r13 = r3
            com.example.data.model.MosqueEvent r13 = (com.example.data.model.MosqueEvent) r13
            kotlin.ResultKt.throwOnFailure(r1)
            goto L8a
        L38:
            int r2 = r0.I$0
            java.lang.Object r3 = r0.L$0
            r13 = r3
            com.example.data.model.MosqueEvent r13 = (com.example.data.model.MosqueEvent) r13
            kotlin.ResultKt.throwOnFailure(r1)
            goto L72
        L43:
            kotlin.ResultKt.throwOnFailure(r1)
            boolean r3 = r13.isReminderSet()
            r3 = r3 ^ r4
            com.example.data.local.MosqueReminderDao r5 = r12.reminderDao
            if (r3 == 0) goto L73
        L51:
            com.example.data.local.MosqueReminderEntity r6 = new com.example.data.local.MosqueReminderEntity
            long r7 = r13.getId()
            long r10 = java.lang.System.currentTimeMillis()
            r9 = 1
            r6.<init>(r7, r9, r10)
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r0.L$0 = r7
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r5 = r5.insertOrUpdate(r6, r0)
            if (r5 != r2) goto L71
            return r2
        L71:
            r2 = r3
        L72:
            goto L8b
        L73:
            long r6 = r13.getId()
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r0.L$0 = r8
            r0.I$0 = r3
            r8 = 2
            r0.label = r8
            java.lang.Object r5 = r5.deleteReminder(r6, r0)
            if (r5 != r2) goto L89
            return r2
        L89:
            r2 = r3
        L8a:
        L8b:
            if (r2 == 0) goto L8e
            goto L8f
        L8e:
            r4 = 0
        L8f:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.MosqueRepository.toggleReminder(com.example.data.model.MosqueEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void addCommunityEvent(@NotNull MosqueEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this._communityEvents.setValue(CollectionsKt.plus((Collection) this._communityEvents.getValue(), event));
    }
}
