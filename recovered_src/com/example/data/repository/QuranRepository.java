package com.example.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import com.example.data.local.AppDatabase;
import com.example.data.local.QuranBookmarkDao;
import com.example.data.local.QuranBookmarkEntity;
import com.example.data.model.Ayah;
import com.example.data.model.QuranModelKt;
import com.example.data.model.Surah;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: QuranRepository.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/example/data/repository/QuranRepository;", "", "db", "Lcom/example/data/local/AppDatabase;", "<init>", "(Lcom/example/data/local/AppDatabase;)V", "bookmarkDao", "Lcom/example/data/local/QuranBookmarkDao;", "getSurahsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/model/Surah;", "toggleBookmark", "", "surah", "(Lcom/example/data/model/Surah;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAyahsForSurah", "Lcom/example/data/model/Ayah;", "surahNumber", "", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQuranRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuranRepository.kt\ncom/example/data/repository/QuranRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,49:1\n49#2:50\n51#2:54\n46#3:51\n51#3:53\n105#4:52\n*S KotlinDebug\n*F\n+ 1 QuranRepository.kt\ncom/example/data/repository/QuranRepository\n*L\n17#1:50\n17#1:54\n17#1:51\n17#1:53\n17#1:52\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/QuranRepository.dex */
public final class QuranRepository {
    public static final int $stable = 8;

    @NotNull
    private final QuranBookmarkDao bookmarkDao;

    @NotNull
    private final AppDatabase db;

    public QuranRepository(@NotNull AppDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.db = db;
        this.bookmarkDao = this.db.quranBookmarkDao();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Flow<List<Surah>> getSurahsFlow() {
        final Flow allBookmarks = this.bookmarkDao.getAllBookmarks();
        return new Flow<List<? extends Surah>>() { // from class: com.example.data.repository.QuranRepository$getSurahsFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 QuranRepository.kt\ncom/example/data/repository/QuranRepository\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n18#3:51\n19#3:56\n20#3:60\n21#3:62\n1563#4:52\n1634#4,3:53\n1563#4:57\n1634#4,2:58\n1636#4:61\n*S KotlinDebug\n*F\n+ 1 QuranRepository.kt\ncom/example/data/repository/QuranRepository\n*L\n18#1:52\n18#1:53,3\n19#1:57\n19#1:58,2\n19#1:61\n*E\n"})
            /* renamed from: com.example.data.repository.QuranRepository$getSurahsFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/QuranRepository$getSurahsFlow$$inlined$map$1$2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
                @DebugMetadata(c = "com.example.data.repository.QuranRepository$getSurahsFlow$$inlined$map$1$2", f = "QuranRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.example.data.repository.QuranRepository$getSurahsFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/QuranRepository$getSurahsFlow$$inlined$map$1$2$1.dex */
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
                public final java.lang.Object emit(java.lang.Object r32, kotlin.coroutines.Continuation r33) {
                    /*
                        Method dump skipped, instructions count: 288
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.example.data.repository.QuranRepository$getSurahsFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public Object collect(FlowCollector collector, Continuation $completion) {
                Object collect = allBookmarks.collect(new AnonymousClass2(collector), $completion);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    public final Object toggleBookmark(@NotNull Surah surah, @NotNull Continuation<? super Unit> continuation) {
        boolean isBookmarked = surah.isBookmarked();
        QuranBookmarkDao quranBookmarkDao = this.bookmarkDao;
        if (isBookmarked) {
            Object deleteBookmark = quranBookmarkDao.deleteBookmark(surah.getNumber(), continuation);
            return deleteBookmark == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteBookmark : Unit.INSTANCE;
        }
        Object insertBookmark = quranBookmarkDao.insertBookmark(new QuranBookmarkEntity(surah.getNumber(), surah.getNameEnglish(), 0L, 4, null), continuation);
        return insertBookmark == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insertBookmark : Unit.INSTANCE;
    }

    @NotNull
    public final List<Ayah> getAyahsForSurah(int surahNumber) {
        List<Ayah> list = QuranModelKt.getSampleSurahAyahs().get(Integer.valueOf(surahNumber));
        return list == null ? CollectionsKt.listOf(new Ayah(1, "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "Bismillāhir-Raḥmānir-Raḥīm", "In the name of Allah, the Entirely Merciful, the Especially Merciful.")) : list;
    }
}
