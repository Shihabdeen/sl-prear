package com.example.data.repository;

import com.example.BuildConfig;
import com.example.data.local.MosqueReminderEntity;
import com.example.data.model.MosqueEvent;
import com.example.data.model.MosqueModelKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: MosqueRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/example/data/model/MosqueEvent;", "reminders", "Lcom/example/data/local/MosqueReminderEntity;", "customEvents"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.repository.MosqueRepository$getAllEventsFlow$1", f = "MosqueRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMosqueRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosqueRepository.kt\ncom/example/data/repository/MosqueRepository$getAllEventsFlow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1193#2,2:48\n1267#2,4:50\n1563#2:54\n1634#2,3:55\n*S KotlinDebug\n*F\n+ 1 MosqueRepository.kt\ncom/example/data/repository/MosqueRepository$getAllEventsFlow$1\n*L\n18#1:48,2\n18#1:50,4\n20#1:54\n20#1:55,3\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/MosqueRepository$getAllEventsFlow$1.dex */
final class MosqueRepository$getAllEventsFlow$1 extends SuspendLambda implements Function3<List<? extends MosqueReminderEntity>, List<? extends MosqueEvent>, Continuation<? super List<? extends MosqueEvent>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MosqueRepository$getAllEventsFlow$1(Continuation<? super MosqueRepository$getAllEventsFlow$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(List<MosqueReminderEntity> list, List<MosqueEvent> list2, Continuation<? super List<MosqueEvent>> continuation) {
        MosqueRepository$getAllEventsFlow$1 mosqueRepository$getAllEventsFlow$1 = new MosqueRepository$getAllEventsFlow$1(continuation);
        mosqueRepository$getAllEventsFlow$1.L$0 = list;
        mosqueRepository$getAllEventsFlow$1.L$1 = list2;
        return mosqueRepository$getAllEventsFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Iterable reminders = (List) this.L$0;
        List customEvents = (List) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Iterable<MosqueReminderEntity> iterable = reminders;
                Map reminderMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                for (MosqueReminderEntity mosqueReminderEntity : iterable) {
                    Pair pair = TuplesKt.to(Boxing.boxLong(mosqueReminderEntity.getEventId()), Boxing.boxBoolean(mosqueReminderEntity.isReminderActive()));
                    reminderMap.put(pair.getFirst(), pair.getSecond());
                }
                Iterable combinedList = CollectionsKt.plus(MosqueModelKt.getSampleSriLankaMosqueEvents(), customEvents);
                Iterable<MosqueEvent> iterable2 = combinedList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                for (MosqueEvent mosqueEvent : iterable2) {
                    Boolean bool = (Boolean) reminderMap.get(Boxing.boxLong(mosqueEvent.getId()));
                    arrayList.add(MosqueEvent.copy$default(mosqueEvent, 0L, null, null, null, null, null, null, null, null, null, bool != null ? bool.booleanValue() : mosqueEvent.isReminderSet(), 1023, null));
                }
                return (List) arrayList;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
