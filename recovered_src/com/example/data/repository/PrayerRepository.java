package com.example.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import com.example.data.local.AppDatabase;
import com.example.data.local.PrayerLogDao;
import com.example.data.local.PrayerLogEntity;
import com.example.data.local.UserPreferenceDao;
import com.example.data.local.UserPreferenceEntity;
import com.example.data.model.District;
import com.example.data.model.PrayerType;
import com.example.data.model.SinglePrayerTime;
import com.example.util.PrayerCalculator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrayerRepository.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001e\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0019J\"\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/example/data/repository/PrayerRepository;", "", "db", "Lcom/example/data/local/AppDatabase;", "<init>", "(Lcom/example/data/local/AppDatabase;)V", "logDao", "Lcom/example/data/local/PrayerLogDao;", "prefDao", "Lcom/example/data/local/UserPreferenceDao;", "getTodayKey", "", "getCompletedPrayerNamesFlow", "Lkotlinx/coroutines/flow/Flow;", "", "dateKey", "togglePrayerCompleted", "", "prayerType", "Lcom/example/data/model/PrayerType;", "isCurrentlyCompleted", "", "(Lcom/example/data/model/PrayerType;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSelectedDistrictId", "districtId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectedDistrictId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveThemeMode", "mode", "getThemeMode", "saveAlertPreference", "prayerName", "soundType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlertPreference", "getCalculatedPrayers", "", "Lcom/example/data/model/SinglePrayerTime;", "district", "Lcom/example/data/model/District;", "completedSet", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrayerRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerRepository.kt\ncom/example/data/repository/PrayerRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,107:1\n49#2:108\n51#2:112\n46#3:109\n51#3:111\n105#4:110\n*S KotlinDebug\n*F\n+ 1 PrayerRepository.kt\ncom/example/data/repository/PrayerRepository\n*L\n28#1:108\n28#1:112\n28#1:109\n28#1:111\n28#1:110\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/PrayerRepository.dex */
public final class PrayerRepository {
    public static final int $stable = 8;

    @NotNull
    private final AppDatabase db;

    @NotNull
    private final PrayerLogDao logDao;

    @NotNull
    private final UserPreferenceDao prefDao;

    public PrayerRepository(@NotNull AppDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
        this.logDao = this.db.prayerLogDao();
        this.prefDao = this.db.userPreferenceDao();
    }

    @NotNull
    public final String getTodayKey() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        String format = sdf.format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ Flow getCompletedPrayerNamesFlow$default(PrayerRepository prayerRepository, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prayerRepository.getTodayKey();
        }
        return prayerRepository.getCompletedPrayerNamesFlow(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Flow<Set<String>> getCompletedPrayerNamesFlow(@NotNull String dateKey) {
        Intrinsics.checkNotNullParameter(dateKey, "dateKey");
        final Flow logsForDate = this.logDao.getLogsForDate(dateKey);
        return new Flow<Set<? extends String>>() { // from class: com.example.data.repository.PrayerRepository$getCompletedPrayerNamesFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PrayerRepository.kt\ncom/example/data/repository/PrayerRepository\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n29#3:51\n774#4:52\n865#4,2:53\n1563#4:55\n1634#4,3:56\n*S KotlinDebug\n*F\n+ 1 PrayerRepository.kt\ncom/example/data/repository/PrayerRepository\n*L\n29#1:52\n29#1:53,2\n29#1:55\n29#1:56,3\n*E\n"})
            /* renamed from: com.example.data.repository.PrayerRepository$getCompletedPrayerNamesFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/PrayerRepository$getCompletedPrayerNamesFlow$$inlined$map$1$2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
                @DebugMetadata(c = "com.example.data.repository.PrayerRepository$getCompletedPrayerNamesFlow$$inlined$map$1$2", f = "PrayerRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.data.repository.PrayerRepository$getCompletedPrayerNamesFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/PrayerRepository$getCompletedPrayerNamesFlow$$inlined$map$1$2$1.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, (Continuation) this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
                    /*
                        Method dump skipped, instructions count: 248
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.PrayerRepository$getCompletedPrayerNamesFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public Object collect(FlowCollector collector, Continuation $completion) {
                Object collect = logsForDate.collect(new AnonymousClass2(collector), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ Object togglePrayerCompleted$default(PrayerRepository prayerRepository, PrayerType prayerType, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = prayerRepository.getTodayKey();
        }
        return prayerRepository.togglePrayerCompleted(prayerType, str, z, continuation);
    }

    @Nullable
    public final Object togglePrayerCompleted(@NotNull PrayerType prayerType, @NotNull String dateKey, boolean isCurrentlyCompleted, @NotNull Continuation<? super Unit> continuation) {
        PrayerLogDao prayerLogDao = this.logDao;
        if (isCurrentlyCompleted) {
            Object deleteLog = prayerLogDao.deleteLog(dateKey, prayerType.name(), continuation);
            return deleteLog == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteLog : Unit.INSTANCE;
        }
        Object insertOrUpdate = prayerLogDao.insertOrUpdate(new PrayerLogEntity(0L, dateKey, prayerType.name(), true, System.currentTimeMillis(), 1, null), continuation);
        return insertOrUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insertOrUpdate : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveSelectedDistrictId(@NotNull String districtId, @NotNull Continuation<? super Unit> continuation) {
        Object preference = this.prefDao.setPreference(new UserPreferenceEntity("selected_district_id", districtId), continuation);
        return preference == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? preference : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSelectedDistrictId(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.example.data.repository.PrayerRepository$getSelectedDistrictId$1
            if (r0 == 0) goto L14
            r0 = r6
            com.example.data.repository.PrayerRepository$getSelectedDistrictId$1 r0 = (com.example.data.repository.PrayerRepository$getSelectedDistrictId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.PrayerRepository$getSelectedDistrictId$1 r0 = new com.example.data.repository.PrayerRepository$getSelectedDistrictId$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L42
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            com.example.data.local.UserPreferenceDao r3 = r5.prefDao
            r4 = 1
            r0.label = r4
            java.lang.String r4 = "selected_district_id"
            java.lang.Object r3 = r3.getPreferenceValue(r4, r0)
            if (r3 != r2) goto L42
            return r2
        L42:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L48
            java.lang.String r3 = "hatton_bogawantalawa"
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.PrayerRepository.getSelectedDistrictId(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object saveThemeMode(@NotNull String mode, @NotNull Continuation<? super Unit> continuation) {
        Object preference = this.prefDao.setPreference(new UserPreferenceEntity("theme_mode", mode), continuation);
        return preference == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? preference : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getThemeMode(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.example.data.repository.PrayerRepository$getThemeMode$1
            if (r0 == 0) goto L14
            r0 = r6
            com.example.data.repository.PrayerRepository$getThemeMode$1 r0 = (com.example.data.repository.PrayerRepository$getThemeMode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.PrayerRepository$getThemeMode$1 r0 = new com.example.data.repository.PrayerRepository$getThemeMode$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L42
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            com.example.data.local.UserPreferenceDao r3 = r5.prefDao
            r4 = 1
            r0.label = r4
            java.lang.String r4 = "theme_mode"
            java.lang.Object r3 = r3.getPreferenceValue(r4, r0)
            if (r3 != r2) goto L42
            return r2
        L42:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L48
            java.lang.String r3 = "SYSTEM"
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.PrayerRepository.getThemeMode(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object saveAlertPreference(@NotNull String prayerName, @NotNull String soundType, @NotNull Continuation<? super Unit> continuation) {
        Object preference = this.prefDao.setPreference(new UserPreferenceEntity("alert_" + prayerName, soundType), continuation);
        return preference == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? preference : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAlertPreference(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.example.data.repository.PrayerRepository$getAlertPreference$1
            if (r0 == 0) goto L14
            r0 = r8
            com.example.data.repository.PrayerRepository$getAlertPreference$1 r0 = (com.example.data.repository.PrayerRepository$getAlertPreference$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.example.data.repository.PrayerRepository$getAlertPreference$1 r0 = new com.example.data.repository.PrayerRepository$getAlertPreference$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L5e
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            com.example.data.local.UserPreferenceDao r3 = r6.prefDao
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "alert_"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = r3.getPreferenceValue(r4, r0)
            if (r3 != r2) goto L5e
            return r2
        L5e:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L64
            java.lang.String r3 = "ADHAN_MAKKAH"
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.PrayerRepository.getAlertPreference(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final List<SinglePrayerTime> getCalculatedPrayers(@NotNull District district, @NotNull Set<String> completedSet) {
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(completedSet, "completedSet");
        List times = PrayerCalculator.calculatePrayerTimes$default(PrayerCalculator.INSTANCE, district, null, 2, null);
        Calendar now = Calendar.getInstance();
        int currentMinutes = (now.get(11) * 60) + now.get(12);
        boolean nextFound = false;
        List processed = new ArrayList();
        Iterator it = times.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            SinglePrayerTime p = (SinglePrayerTime) it.next();
            int pMinutes = (p.getHour() * 60) + p.getMinute();
            boolean isDone = completedSet.contains(p.getType().name());
            if (!nextFound && pMinutes > currentMinutes) {
                z = true;
            }
            boolean isNext = z;
            if (isNext) {
                nextFound = true;
            }
            processed.add(SinglePrayerTime.copy$default(p, null, 0, 0, null, isDone, isNext, false, 79, null));
        }
        if (!nextFound && !processed.isEmpty()) {
            SinglePrayerTime first = (SinglePrayerTime) processed.get(0);
            processed.set(0, SinglePrayerTime.copy$default(first, null, 0, 0, null, false, true, false, 95, null));
        }
        return processed;
    }
}
