package com.example.ui.viewmodel;

import com.example.BuildConfig;
import com.example.data.model.DuaCategory;
import com.example.data.model.DuaItem;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MainViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\n"}, d2 = {"<anonymous>", "", "Lcom/example/data/model/DuaItem;", "category", "Lcom/example/data/model/DuaCategory;", "query", "", "favorites", ""}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$filteredDuas$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/example/ui/viewmodel/MainViewModel$filteredDuas$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,758:1\n774#2:759\n865#2,2:760\n1563#2:762\n1634#2,3:763\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/example/ui/viewmodel/MainViewModel$filteredDuas$1\n*L\n702#1:759\n702#1:760,2\n714#1:762\n714#1:763,3\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$filteredDuas$1.dex */
final class MainViewModel$filteredDuas$1 extends SuspendLambda implements Function4<DuaCategory, String, Set<? extends String>, Continuation<? super List<? extends DuaItem>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MainViewModel$filteredDuas$1(Continuation<? super MainViewModel$filteredDuas$1> continuation) {
        super(4, continuation);
    }

    public final Object invoke(DuaCategory duaCategory, String str, Set<String> set, Continuation<? super List<DuaItem>> continuation) {
        MainViewModel$filteredDuas$1 mainViewModel$filteredDuas$1 = new MainViewModel$filteredDuas$1(continuation);
        mainViewModel$filteredDuas$1.L$0 = duaCategory;
        mainViewModel$filteredDuas$1.L$1 = str;
        mainViewModel$filteredDuas$1.L$2 = set;
        return mainViewModel$filteredDuas$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.viewmodel.MainViewModel$filteredDuas$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
