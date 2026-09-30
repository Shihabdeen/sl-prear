package com.example.ui.screens;

import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$2"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,433:1\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/screens/QuranScreenKt$QuranScreen$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38$$inlined$items$default$2.dex */
public final class QuranScreenKt$QuranScreen$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38$$inlined$items$default$2 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuranScreenKt$QuranScreen$lambda$42$lambda$41$lambda$40$lambda$39$lambda$38$$inlined$items$default$2(Function1 function1, List list) {
        super(1);
        this.$key = function1;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        return invoke(((Number) p1).intValue());
    }

    @NotNull
    public final Object invoke(int index) {
        return this.$key.invoke(this.$items.get(index));
    }
}
