package com.example;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.example.ui.theme.ThemeKt;
import com.example.ui.theme.ThemeMode;
import com.example.ui.viewmodel.MainViewModel;
import com.example.util.NotificationHelper;
import com.example.work.PrayerWorkScheduler;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainActivity.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"Lcom/example/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/example/ui/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/ui/viewmodel/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app", "themeMode", "Lcom/example/ui/theme/ThemeMode;"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/example/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,366:1\n70#2,11:367\n81#3:378\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/example/MainActivity\n*L\n90#1:367,11\n101#1:378\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/MainActivity.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    public MainActivity() {
        final MainActivity mainActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainViewModel.class), new Function0<ViewModelStore>() { // from class: com.example.MainActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m9invoke() {
                return mainActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.example.MainActivity$special$$inlined$viewModels$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m8invoke() {
                return mainActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.example.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CreationExtras m10invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? mainActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final MainViewModel getViewModel() {
        return (MainViewModel) this.viewModel.getValue();
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, (SystemBarStyle) null, (SystemBarStyle) null, 3, (Object) null);
        NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        notificationHelper.createNotificationChannels(applicationContext);
        PrayerWorkScheduler prayerWorkScheduler = PrayerWorkScheduler.INSTANCE;
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        PrayerWorkScheduler.scheduleDailyPrayerNotifications$default(prayerWorkScheduler, applicationContext2, null, 2, null);
        ComponentActivityKt.setContent$default(this, (CompositionContext) null, ComposableLambdaKt.composableLambdaInstance(-601144069, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$lambda$2(MainActivity.this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit onCreate$lambda$2(final MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C100@4454L16,102@4515L60,102@4478L97:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601144069, $changed, -1, "com.example.MainActivity.onCreate.<anonymous> (MainActivity.kt:100)");
            }
            State themeMode$delegate = SnapshotStateKt.collectAsState(this$0.getViewModel().getThemeMode(), (CoroutineContext) null, $composer, 0, 1);
            ThemeKt.SLPrayerTheme(onCreate$lambda$2$lambda$0(themeMode$delegate), ComposableLambdaKt.rememberComposableLambda(-1454432322, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$2$lambda$1(MainActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final ThemeMode onCreate$lambda$2$lambda$0(State<? extends ThemeMode> state) {
        return (ThemeMode) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit onCreate$lambda$2$lambda$1(MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C103@4525L42:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1454432322, $changed, -1, "com.example.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:103)");
            }
            MainActivityKt.MainScreenContainer(this$0.getViewModel(), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
