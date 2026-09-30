package com.example.ui.viewmodel;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.example.BuildConfig;
import com.example.data.local.AppDatabase;
import com.example.data.model.AlertSoundType;
import com.example.data.model.AudioPlayerState;
import com.example.data.model.ChatGroup;
import com.example.data.model.ChatMessage;
import com.example.data.model.DefaultDuas;
import com.example.data.model.District;
import com.example.data.model.DuaCategory;
import com.example.data.model.DuaItem;
import com.example.data.model.MosqueEvent;
import com.example.data.model.MosqueEventType;
import com.example.data.model.PrayerModelKt;
import com.example.data.model.PrayerType;
import com.example.data.model.SinglePrayerTime;
import com.example.data.model.Surah;
import com.example.data.model.UserProfile;
import com.example.data.model.UserRole;
import com.example.data.repository.AuthAndChatRepository;
import com.example.data.repository.CloudSyncStatus;
import com.example.data.repository.MosqueRepository;
import com.example.data.repository.PrayerRepository;
import com.example.data.repository.QuranRepository;
import com.example.ui.theme.ThemeMode;
import com.example.util.AudioRecitationManager;
import com.example.util.CompassSensorManager;
import com.example.util.HijriCalendarHelper;
import com.example.util.MakkahAdhanPlayer;
import com.example.util.NotificationHelper;
import com.example.util.QiblaCalculator;
import com.example.work.PrayerWorkScheduler;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\n\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0002J\b\u0010\u008a\u0001\u001a\u00030\u0085\u0001J\b\u0010\u008b\u0001\u001a\u00030\u0085\u0001J\b\u0010\u008c\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u008d\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u008e\u0001\u001a\u00020%J\u0011\u0010\u008f\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0090\u0001\u001a\u00020+J\b\u0010\u0091\u0001\u001a\u00030\u0085\u0001J\u0012\u0010\u0092\u0001\u001a\u00030\u0085\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0013\u0010\u0095\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0090\u0001\u001a\u00020+H\u0002J\u0011\u0010\u0096\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0097\u0001\u001a\u00020@J\u001b\u0010\u0098\u0001\u001a\u00030\u0085\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0099\u0001\u001a\u00020]J\u0011\u0010\u009a\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u009b\u0001\u001a\u000204J\u0013\u0010\u009c\u0001\u001a\u00030\u0085\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u000204J\b\u0010\u009d\u0001\u001a\u00030\u0085\u0001J\b\u0010\u009e\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u009f\u0001\u001a\u00030\u0085\u00012\u0007\u0010 \u0001\u001a\u00020xJG\u0010¡\u0001\u001a\u00030\u0085\u00012\u0007\u0010¢\u0001\u001a\u0002042\u0007\u0010£\u0001\u001a\u0002042\u0007\u0010¤\u0001\u001a\u0002042\u0007\u0010¥\u0001\u001a\u0002042\u0007\u0010¦\u0001\u001a\u0002042\u0007\u0010§\u0001\u001a\u0002042\u0007\u0010¨\u0001\u001a\u00020XJq\u0010©\u0001\u001a\u00030\u0085\u00012\u0007\u0010ª\u0001\u001a\u0002042\u0007\u0010«\u0001\u001a\u0002042\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\t\b\u0002\u0010®\u0001\u001a\u0002042\u000b\b\u0002\u0010¯\u0001\u001a\u0004\u0018\u0001042\u000b\b\u0002\u0010°\u0001\u001a\u0004\u0018\u0001042\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010²\u00012\u0015\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0005\u0012\u00030\u0085\u00010´\u0001J\b\u0010µ\u0001\u001a\u00030\u0085\u0001J\u0011\u0010¶\u0001\u001a\u00030\u0085\u00012\u0007\u0010·\u0001\u001a\u00020gJQ\u0010¸\u0001\u001a\u00030\u0085\u00012\u0007\u0010¹\u0001\u001a\u0002042\u000b\b\u0002\u0010º\u0001\u001a\u0004\u0018\u0001042\t\b\u0002\u0010»\u0001\u001a\u00020N2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010²\u00012\u0015\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0005\u0012\u00030\u0085\u00010´\u0001JQ\u0010¼\u0001\u001a\u00030\u0085\u00012\u0007\u0010¹\u0001\u001a\u0002042\u000b\b\u0002\u0010º\u0001\u001a\u0004\u0018\u0001042\t\b\u0002\u0010»\u0001\u001a\u00020N2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010²\u00012\u0015\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0005\u0012\u00030\u0085\u00010´\u0001J\u0012\u0010½\u0001\u001a\u00030\u0085\u00012\b\u0010¾\u0001\u001a\u00030¿\u0001J\u0012\u0010À\u0001\u001a\u00030\u0085\u00012\b\u0010¾\u0001\u001a\u00030¿\u0001J\b\u0010Á\u0001\u001a\u00030\u0085\u0001J\u0011\u0010Â\u0001\u001a\u00030\u0085\u00012\u0007\u0010Ã\u0001\u001a\u00020/J\u0011\u0010Ä\u0001\u001a\u00030\u0085\u00012\u0007\u0010Å\u0001\u001a\u000204J\u0013\u0010Æ\u0001\u001a\u00030\u0085\u00012\t\u0010Ç\u0001\u001a\u0004\u0018\u00010TJ\u0011\u0010È\u0001\u001a\u00030\u0085\u00012\u0007\u0010Ç\u0001\u001a\u00020TJ\u0011\u0010É\u0001\u001a\u00030\u0085\u00012\u0007\u0010Ç\u0001\u001a\u00020TJ\b\u0010Ê\u0001\u001a\u00030\u0085\u0001J\b\u0010Ë\u0001\u001a\u00030\u0085\u0001J\u0012\u0010Ì\u0001\u001a\u00030\u0085\u00012\b\u0010Í\u0001\u001a\u00030Î\u0001J\b\u0010Ï\u0001\u001a\u00030\u0085\u0001J\b\u0010Ð\u0001\u001a\u00030\u0085\u0001J\u0013\u0010Ñ\u0001\u001a\u00030\u0085\u00012\t\u0010¨\u0001\u001a\u0004\u0018\u00010XJ\n\u0010Ò\u0001\u001a\u00030\u0085\u0001H\u0002J\n\u0010Ó\u0001\u001a\u00030\u0085\u0001H\u0002J\n\u0010Ô\u0001\u001a\u00030\u0085\u0001H\u0002J\u0007\u0010Õ\u0001\u001a\u000204J\u0007\u0010Ö\u0001\u001a\u000204J\u0011\u0010×\u0001\u001a\u00030\u0085\u00012\u0007\u0010Ø\u0001\u001a\u000204J\u0012\u0010é\u0001\u001a\u00030\u0085\u00012\b\u0010ê\u0001\u001a\u00030Ú\u0001J\u0011\u0010ë\u0001\u001a\u00030\u0085\u00012\u0007\u0010Å\u0001\u001a\u000204J\u0011\u0010ì\u0001\u001a\u00030\u0085\u00012\u0007\u0010í\u0001\u001a\u000204J\u0011\u0010î\u0001\u001a\u00030\u0085\u00012\u0007\u0010í\u0001\u001a\u000204J\u0011\u0010ï\u0001\u001a\u00030\u0085\u00012\u0007\u0010í\u0001\u001a\u000204J\n\u0010ð\u0001\u001a\u00030\u0085\u0001H\u0014R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0'¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030'¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002040$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00108\u001a\b\u0012\u0004\u0012\u0002040'¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020;0'¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u001a\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?0'¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0016\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0'¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020G0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020G0'¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020G0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020G0'¢\u0006\b\n\u0000\u001a\u0004\bL\u0010)R\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020N0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020N0'¢\u0006\b\n\u0000\u001a\u0004\bO\u0010)R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u0002040$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u0002040'¢\u0006\b\n\u0000\u001a\u0004\bR\u0010)R\u0016\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0'¢\u0006\b\n\u0000\u001a\u0004\bV\u0010)R\u0016\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0'¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010)R \u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020]0\\0$X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020]0\\0'¢\u0006\b\n\u0000\u001a\u0004\b_\u0010)R\u0016\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040'¢\u0006\b\n\u0000\u001a\u0004\bb\u0010)R\u0019\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0'¢\u0006\b\n\u0000\u001a\u0004\be\u0010)R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020g0?¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\b\u0012\u0004\u0012\u00020g0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020g0'¢\u0006\b\n\u0000\u001a\u0004\bl\u0010)R\u001d\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0?0'¢\u0006\b\n\u0000\u001a\u0004\bo\u0010)R\u001d\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0?0'¢\u0006\b\n\u0000\u001a\u0004\bq\u0010)R\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020s0'¢\u0006\b\n\u0000\u001a\u0004\bt\u0010)R\u001d\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0?0'¢\u0006\b\n\u0000\u001a\u0004\bv\u0010)R\u001d\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0?0'¢\u0006\b\n\u0000\u001a\u0004\by\u0010)R\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020{0'¢\u0006\b\n\u0000\u001a\u0004\b|\u0010)R\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020N0'¢\u0006\b\n\u0000\u001a\u0004\b}\u0010)R\u0017\u0010~\u001a\b\u0012\u0004\u0012\u0002040'¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010)R\u0019\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020;0'¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010)R\u0012\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0083\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020N0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020N0'¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010)R\u0016\u0010Ù\u0001\u001a\t\u0012\u0005\u0012\u00030Ú\u00010$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Û\u0001\u001a\t\u0012\u0005\u0012\u00030Ú\u00010'¢\u0006\t\n\u0000\u001a\u0005\bÜ\u0001\u0010)R\u0015\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u0002040$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u0002040'¢\u0006\t\n\u0000\u001a\u0005\bß\u0001\u0010)R\u001b\u0010à\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010á\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030'¢\u0006\t\n\u0000\u001a\u0005\bâ\u0001\u0010)R\"\u0010ã\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000204\u0012\u0005\u0012\u00030Î\u00010\\0$X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010ä\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000204\u0012\u0005\u0012\u00030Î\u00010\\0'¢\u0006\t\n\u0000\u001a\u0005\bå\u0001\u0010)R \u0010æ\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ç\u00010?0'¢\u0006\t\n\u0000\u001a\u0005\bè\u0001\u0010)¨\u0006ñ\u0001"}, d2 = {"Lcom/example/ui/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "database", "Lcom/example/data/local/AppDatabase;", "prayerRepository", "Lcom/example/data/repository/PrayerRepository;", "getPrayerRepository", "()Lcom/example/data/repository/PrayerRepository;", "mosqueRepository", "Lcom/example/data/repository/MosqueRepository;", "getMosqueRepository", "()Lcom/example/data/repository/MosqueRepository;", "quranRepository", "Lcom/example/data/repository/QuranRepository;", "getQuranRepository", "()Lcom/example/data/repository/QuranRepository;", "authChatRepository", "Lcom/example/data/repository/AuthAndChatRepository;", "getAuthChatRepository", "()Lcom/example/data/repository/AuthAndChatRepository;", "compassManager", "Lcom/example/util/CompassSensorManager;", "getCompassManager", "()Lcom/example/util/CompassSensorManager;", "audioManager", "Lcom/example/util/AudioRecitationManager;", "getAudioManager", "()Lcom/example/util/AudioRecitationManager;", "_selectedTab", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/ui/viewmodel/AppTab;", "selectedTab", "Lkotlinx/coroutines/flow/StateFlow;", "getSelectedTab", "()Lkotlinx/coroutines/flow/StateFlow;", "_selectedDistrict", "Lcom/example/data/model/District;", "selectedDistrict", "getSelectedDistrict", "_themeMode", "Lcom/example/ui/theme/ThemeMode;", "themeMode", "getThemeMode", "_completedPrayers", "", "", "completedPrayers", "getCompletedPrayers", "_countdownText", "countdownText", "getCountdownText", "_progressPercent", "", "progressPercent", "getProgressPercent", "_calculatedPrayers", "", "Lcom/example/data/model/SinglePrayerTime;", "calculatedPrayers", "getCalculatedPrayers", "_nextPrayer", "nextPrayer", "getNextPrayer", "_qiblaBearing", "", "qiblaBearing", "getQiblaBearing", "_distanceToKaabaKm", "distanceToKaabaKm", "getDistanceToKaabaKm", "_isFacingQibla", "", "isFacingQibla", "_quranSearchQuery", "quranSearchQuery", "getQuranSearchQuery", "_readingSurah", "Lcom/example/data/model/Surah;", "readingSurah", "getReadingSurah", "_selectedMosqueFilter", "Lcom/example/data/model/MosqueEventType;", "selectedMosqueFilter", "getSelectedMosqueFilter", "_prayerAlerts", "", "Lcom/example/data/model/AlertSoundType;", "prayerAlerts", "getPrayerAlerts", "_userFeedbackMessage", "userFeedbackMessage", "getUserFeedbackMessage", "currentUser", "Lcom/example/data/model/UserProfile;", "getCurrentUser", "chatGroups", "Lcom/example/data/model/ChatGroup;", "getChatGroups", "()Ljava/util/List;", "_selectedChatGroup", "selectedChatGroup", "getSelectedChatGroup", "currentGroupMessages", "Lcom/example/data/model/ChatMessage;", "getCurrentGroupMessages", "allAdminMessages", "getAllAdminMessages", "chatSyncStatus", "Lcom/example/data/repository/CloudSyncStatus;", "getChatSyncStatus", "allSurahs", "getAllSurahs", "mosqueEvents", "Lcom/example/data/model/MosqueEvent;", "getMosqueEvents", "audioPlayerState", "Lcom/example/data/model/AudioPlayerState;", "getAudioPlayerState", "isMakkahAdhanPlaying", "makkahAdhanPrayerName", "getMakkahAdhanPrayerName", "deviceAzimuth", "getDeviceAzimuth", "tickerJob", "Lkotlinx/coroutines/Job;", "loadSavedPreferences", "", "observeCompletedPrayers", "liveChatJob", "_isLiveChatActive", "isLiveChatActive", "startLiveChatPolling", "stopLiveChatPolling", "pollChatSyncSilent", "selectTab", "tab", "selectDistrict", "district", "reschedulePrayerNotifications", "triggerWorkManagerTestAdhan", "prayerType", "Lcom/example/data/model/PrayerType;", "updateQiblaCalculation", "togglePrayerCheck", "prayer", "setPrayerAlertSound", "sound", "testAdhanAlert", "prayerName", "playMakkahAzan", "stopMakkahAzan", "setAllPrayersToMakkahAzan", "toggleMosqueReminder", "event", "addCommunityMosqueEvent", "mosqueName", "title", "speaker", "time", "address", "description", "type", "loginWithPhoneNumber", "phone", "fullName", "role", "Lcom/example/data/model/UserRole;", "adminPin", "adminDesignation", "mosqueAffiliation", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "logout", "selectChatGroup", "group", "sendChatMessage", "text", "tag", "isPinned", "sendAdminChatMessage", "reactToMessage", "messageId", "", "deleteMessage", "triggerChatSync", "setThemeMode", "mode", "setQuranSearch", "query", "openSurahReader", "surah", "toggleSurahBookmark", "playSurahRecitation", "pauseRecitation", "resumeRecitation", "seekRecitation", "posMs", "", "toggleRecitationLoop", "stopRecitation", "setMosqueFilter", "refreshPrayerSchedule", "startTicker", "updateCountdown", "getGregorianDateFormatted", "getHijriDateFormatted", "showFeedback", "msg", "_duaCategory", "Lcom/example/data/model/DuaCategory;", "duaCategory", "getDuaCategory", "_duaSearchQuery", "duaSearchQuery", "getDuaSearchQuery", "_favoriteDuaIds", "favoriteDuaIds", "getFavoriteDuaIds", "_duaCounters", "duaCounters", "getDuaCounters", "filteredDuas", "Lcom/example/data/model/DuaItem;", "getFilteredDuas", "setDuaCategory", "category", "setDuaSearchQuery", "toggleDuaFavorite", "duaId", "incrementDuaCounter", "resetDuaCounter", "onCleared", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/example/ui/viewmodel/MainViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,758:1\n8569#2,2:759\n9251#2,4:761\n8569#2,2:766\n9251#2,4:768\n189#3:765\n1088#4,2:772\n434#4:774\n507#4,5:775\n1#5:780\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/example/ui/viewmodel/MainViewModel\n*L\n131#1:759,2\n131#1:761,4\n354#1:766,2\n354#1:768,4\n150#1:765\n427#1:772,2\n428#1:774\n428#1:775,5\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel.dex */
public final class MainViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final MutableStateFlow<List<SinglePrayerTime>> _calculatedPrayers;

    @NotNull
    private final MutableStateFlow<Set<String>> _completedPrayers;

    @NotNull
    private final MutableStateFlow<String> _countdownText;

    @NotNull
    private final MutableStateFlow<Double> _distanceToKaabaKm;

    @NotNull
    private final MutableStateFlow<DuaCategory> _duaCategory;

    @NotNull
    private final MutableStateFlow<Map<String, Integer>> _duaCounters;

    @NotNull
    private final MutableStateFlow<String> _duaSearchQuery;

    @NotNull
    private final MutableStateFlow<Set<String>> _favoriteDuaIds;

    @NotNull
    private final MutableStateFlow<Boolean> _isFacingQibla;

    @NotNull
    private final MutableStateFlow<Boolean> _isLiveChatActive;

    @NotNull
    private final MutableStateFlow<SinglePrayerTime> _nextPrayer;

    @NotNull
    private final MutableStateFlow<Map<String, AlertSoundType>> _prayerAlerts;

    @NotNull
    private final MutableStateFlow<Float> _progressPercent;

    @NotNull
    private final MutableStateFlow<Double> _qiblaBearing;

    @NotNull
    private final MutableStateFlow<String> _quranSearchQuery;

    @NotNull
    private final MutableStateFlow<Surah> _readingSurah;

    @NotNull
    private final MutableStateFlow<ChatGroup> _selectedChatGroup;

    @NotNull
    private final MutableStateFlow<District> _selectedDistrict;

    @NotNull
    private final MutableStateFlow<MosqueEventType> _selectedMosqueFilter;

    @NotNull
    private final MutableStateFlow<AppTab> _selectedTab;

    @NotNull
    private final MutableStateFlow<ThemeMode> _themeMode;

    @NotNull
    private final MutableStateFlow<String> _userFeedbackMessage;

    @NotNull
    private final StateFlow<List<ChatMessage>> allAdminMessages;

    @NotNull
    private final StateFlow<List<Surah>> allSurahs;

    @NotNull
    private final AudioRecitationManager audioManager;

    @NotNull
    private final StateFlow<AudioPlayerState> audioPlayerState;

    @NotNull
    private final AuthAndChatRepository authChatRepository;

    @NotNull
    private final StateFlow<List<SinglePrayerTime>> calculatedPrayers;

    @NotNull
    private final List<ChatGroup> chatGroups;

    @NotNull
    private final StateFlow<CloudSyncStatus> chatSyncStatus;

    @NotNull
    private final CompassSensorManager compassManager;

    @NotNull
    private final StateFlow<Set<String>> completedPrayers;
    private final Context context;

    @NotNull
    private final StateFlow<String> countdownText;

    @NotNull
    private final StateFlow<List<ChatMessage>> currentGroupMessages;

    @NotNull
    private final StateFlow<UserProfile> currentUser;

    @NotNull
    private final AppDatabase database;

    @NotNull
    private final StateFlow<Float> deviceAzimuth;

    @NotNull
    private final StateFlow<Double> distanceToKaabaKm;

    @NotNull
    private final StateFlow<DuaCategory> duaCategory;

    @NotNull
    private final StateFlow<Map<String, Integer>> duaCounters;

    @NotNull
    private final StateFlow<String> duaSearchQuery;

    @NotNull
    private final StateFlow<Set<String>> favoriteDuaIds;

    @NotNull
    private final StateFlow<List<DuaItem>> filteredDuas;

    @NotNull
    private final StateFlow<Boolean> isFacingQibla;

    @NotNull
    private final StateFlow<Boolean> isLiveChatActive;

    @NotNull
    private final StateFlow<Boolean> isMakkahAdhanPlaying;

    @Nullable
    private Job liveChatJob;

    @NotNull
    private final StateFlow<String> makkahAdhanPrayerName;

    @NotNull
    private final StateFlow<List<MosqueEvent>> mosqueEvents;

    @NotNull
    private final MosqueRepository mosqueRepository;

    @NotNull
    private final StateFlow<SinglePrayerTime> nextPrayer;

    @NotNull
    private final StateFlow<Map<String, AlertSoundType>> prayerAlerts;

    @NotNull
    private final PrayerRepository prayerRepository;

    @NotNull
    private final StateFlow<Float> progressPercent;

    @NotNull
    private final StateFlow<Double> qiblaBearing;

    @NotNull
    private final QuranRepository quranRepository;

    @NotNull
    private final StateFlow<String> quranSearchQuery;

    @NotNull
    private final StateFlow<Surah> readingSurah;

    @NotNull
    private final StateFlow<ChatGroup> selectedChatGroup;

    @NotNull
    private final StateFlow<District> selectedDistrict;

    @NotNull
    private final StateFlow<MosqueEventType> selectedMosqueFilter;

    @NotNull
    private final StateFlow<AppTab> selectedTab;

    @NotNull
    private final StateFlow<ThemeMode> themeMode;

    @Nullable
    private Job tickerJob;

    @NotNull
    private final StateFlow<String> userFeedbackMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.context = application.getApplicationContext();
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.database = companion.getDatabase(context);
        this.prayerRepository = new PrayerRepository(this.database);
        this.mosqueRepository = new MosqueRepository(this.database);
        this.quranRepository = new QuranRepository(this.database);
        this.authChatRepository = new AuthAndChatRepository(this.database);
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.compassManager = new CompassSensorManager(context2);
        Context context3 = this.context;
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        this.audioManager = new AudioRecitationManager(context3);
        this._selectedTab = StateFlowKt.MutableStateFlow(AppTab.PRAYER);
        this.selectedTab = FlowKt.asStateFlow(this._selectedTab);
        this._selectedDistrict = StateFlowKt.MutableStateFlow(PrayerModelKt.getSriLankaDistricts().get(0));
        this.selectedDistrict = FlowKt.asStateFlow(this._selectedDistrict);
        this._themeMode = StateFlowKt.MutableStateFlow(ThemeMode.SYSTEM);
        this.themeMode = FlowKt.asStateFlow(this._themeMode);
        this._completedPrayers = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this.completedPrayers = FlowKt.asStateFlow(this._completedPrayers);
        this._countdownText = StateFlowKt.MutableStateFlow("Calculating...");
        this.countdownText = FlowKt.asStateFlow(this._countdownText);
        this._progressPercent = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this.progressPercent = FlowKt.asStateFlow(this._progressPercent);
        this._calculatedPrayers = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.calculatedPrayers = FlowKt.asStateFlow(this._calculatedPrayers);
        Object obj = null;
        this._nextPrayer = StateFlowKt.MutableStateFlow((Object) null);
        this.nextPrayer = FlowKt.asStateFlow(this._nextPrayer);
        this._qiblaBearing = StateFlowKt.MutableStateFlow(Double.valueOf(294.0d));
        this.qiblaBearing = FlowKt.asStateFlow(this._qiblaBearing);
        this._distanceToKaabaKm = StateFlowKt.MutableStateFlow(Double.valueOf(4650.0d));
        this.distanceToKaabaKm = FlowKt.asStateFlow(this._distanceToKaabaKm);
        this._isFacingQibla = StateFlowKt.MutableStateFlow(false);
        this.isFacingQibla = FlowKt.asStateFlow(this._isFacingQibla);
        this._quranSearchQuery = StateFlowKt.MutableStateFlow("");
        this.quranSearchQuery = FlowKt.asStateFlow(this._quranSearchQuery);
        this._readingSurah = StateFlowKt.MutableStateFlow((Object) null);
        this.readingSurah = FlowKt.asStateFlow(this._readingSurah);
        this._selectedMosqueFilter = StateFlowKt.MutableStateFlow((Object) null);
        this.selectedMosqueFilter = FlowKt.asStateFlow(this._selectedMosqueFilter);
        PrayerType[] values = PrayerType.values();
        Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        int length = values.length;
        int i = 0;
        while (i < length) {
            Object obj2 = obj;
            Pair pair = TuplesKt.to(values[i].name(), AlertSoundType.ADHAN_MAKKAH);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
            i++;
            obj = obj2;
        }
        Object obj3 = obj;
        this._prayerAlerts = StateFlowKt.MutableStateFlow(linkedHashMap);
        this.prayerAlerts = FlowKt.asStateFlow(this._prayerAlerts);
        this._userFeedbackMessage = StateFlowKt.MutableStateFlow(obj3);
        this.userFeedbackMessage = FlowKt.asStateFlow(this._userFeedbackMessage);
        this.currentUser = FlowKt.stateIn(this.authChatRepository.getActiveUserFlow(), ViewModelKt.getViewModelScope((ViewModel) this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), obj3);
        this.chatGroups = this.authChatRepository.getChatGroups();
        this._selectedChatGroup = StateFlowKt.MutableStateFlow(this.chatGroups.get(0));
        this.selectedChatGroup = FlowKt.asStateFlow(this._selectedChatGroup);
        this.currentGroupMessages = FlowKt.stateIn(FlowKt.transformLatest(this._selectedChatGroup, new MainViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope((ViewModel) this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
        this.allAdminMessages = FlowKt.stateIn(this.authChatRepository.getAllAdminMessagesFlow(), ViewModelKt.getViewModelScope((ViewModel) this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
        this.chatSyncStatus = this.authChatRepository.getSyncStatusFlow();
        this.allSurahs = FlowKt.stateIn(this.quranRepository.getSurahsFlow(), ViewModelKt.getViewModelScope((ViewModel) this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
        this.mosqueEvents = FlowKt.stateIn(this.mosqueRepository.getAllEventsFlow(), ViewModelKt.getViewModelScope((ViewModel) this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), CollectionsKt.emptyList());
        this.audioPlayerState = this.audioManager.getPlayerState();
        this.isMakkahAdhanPlaying = MakkahAdhanPlayer.INSTANCE.isPlaying();
        this.makkahAdhanPrayerName = MakkahAdhanPlayer.INSTANCE.getCurrentPrayerName();
        this.deviceAzimuth = this.compassManager.getAzimuthFlow();
        NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
        Context context4 = this.context;
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        notificationHelper.createNotificationChannels(context4);
        loadSavedPreferences();
        observeCompletedPrayers();
        startTicker();
        updateQiblaCalculation((District) this._selectedDistrict.getValue());
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(null), 3, (Object) null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(null), 3, (Object) null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(null), 3, (Object) null);
        this._isLiveChatActive = StateFlowKt.MutableStateFlow(false);
        this.isLiveChatActive = FlowKt.asStateFlow(this._isLiveChatActive);
        this._duaCategory = StateFlowKt.MutableStateFlow(DuaCategory.ALL);
        this.duaCategory = FlowKt.asStateFlow(this._duaCategory);
        this._duaSearchQuery = StateFlowKt.MutableStateFlow("");
        this.duaSearchQuery = FlowKt.asStateFlow(this._duaSearchQuery);
        this._favoriteDuaIds = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this.favoriteDuaIds = FlowKt.asStateFlow(this._favoriteDuaIds);
        this._duaCounters = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.duaCounters = FlowKt.asStateFlow(this._duaCounters);
        this.filteredDuas = FlowKt.stateIn(FlowKt.combine(this._duaCategory, this._duaSearchQuery, this._favoriteDuaIds, new MainViewModel$filteredDuas$1(null)), ViewModelKt.getViewModelScope((ViewModel) this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, (Object) null), DefaultDuas.INSTANCE.getList());
    }

    @NotNull
    public final PrayerRepository getPrayerRepository() {
        return this.prayerRepository;
    }

    @NotNull
    public final MosqueRepository getMosqueRepository() {
        return this.mosqueRepository;
    }

    @NotNull
    public final QuranRepository getQuranRepository() {
        return this.quranRepository;
    }

    @NotNull
    public final AuthAndChatRepository getAuthChatRepository() {
        return this.authChatRepository;
    }

    @NotNull
    public final CompassSensorManager getCompassManager() {
        return this.compassManager;
    }

    @NotNull
    public final AudioRecitationManager getAudioManager() {
        return this.audioManager;
    }

    @NotNull
    public final StateFlow<AppTab> getSelectedTab() {
        return this.selectedTab;
    }

    @NotNull
    public final StateFlow<District> getSelectedDistrict() {
        return this.selectedDistrict;
    }

    @NotNull
    public final StateFlow<ThemeMode> getThemeMode() {
        return this.themeMode;
    }

    @NotNull
    public final StateFlow<Set<String>> getCompletedPrayers() {
        return this.completedPrayers;
    }

    @NotNull
    public final StateFlow<String> getCountdownText() {
        return this.countdownText;
    }

    @NotNull
    public final StateFlow<Float> getProgressPercent() {
        return this.progressPercent;
    }

    @NotNull
    public final StateFlow<List<SinglePrayerTime>> getCalculatedPrayers() {
        return this.calculatedPrayers;
    }

    @NotNull
    public final StateFlow<SinglePrayerTime> getNextPrayer() {
        return this.nextPrayer;
    }

    @NotNull
    public final StateFlow<Double> getQiblaBearing() {
        return this.qiblaBearing;
    }

    @NotNull
    public final StateFlow<Double> getDistanceToKaabaKm() {
        return this.distanceToKaabaKm;
    }

    @NotNull
    public final StateFlow<Boolean> isFacingQibla() {
        return this.isFacingQibla;
    }

    @NotNull
    public final StateFlow<String> getQuranSearchQuery() {
        return this.quranSearchQuery;
    }

    @NotNull
    public final StateFlow<Surah> getReadingSurah() {
        return this.readingSurah;
    }

    @NotNull
    public final StateFlow<MosqueEventType> getSelectedMosqueFilter() {
        return this.selectedMosqueFilter;
    }

    @NotNull
    public final StateFlow<Map<String, AlertSoundType>> getPrayerAlerts() {
        return this.prayerAlerts;
    }

    @NotNull
    public final StateFlow<String> getUserFeedbackMessage() {
        return this.userFeedbackMessage;
    }

    @NotNull
    public final StateFlow<UserProfile> getCurrentUser() {
        return this.currentUser;
    }

    @NotNull
    public final List<ChatGroup> getChatGroups() {
        return this.chatGroups;
    }

    @NotNull
    public final StateFlow<ChatGroup> getSelectedChatGroup() {
        return this.selectedChatGroup;
    }

    @NotNull
    public final StateFlow<List<ChatMessage>> getCurrentGroupMessages() {
        return this.currentGroupMessages;
    }

    @NotNull
    public final StateFlow<List<ChatMessage>> getAllAdminMessages() {
        return this.allAdminMessages;
    }

    @NotNull
    public final StateFlow<CloudSyncStatus> getChatSyncStatus() {
        return this.chatSyncStatus;
    }

    @NotNull
    public final StateFlow<List<Surah>> getAllSurahs() {
        return this.allSurahs;
    }

    @NotNull
    public final StateFlow<List<MosqueEvent>> getMosqueEvents() {
        return this.mosqueEvents;
    }

    @NotNull
    public final StateFlow<AudioPlayerState> getAudioPlayerState() {
        return this.audioPlayerState;
    }

    @NotNull
    public final StateFlow<Boolean> isMakkahAdhanPlaying() {
        return this.isMakkahAdhanPlaying;
    }

    @NotNull
    public final StateFlow<String> getMakkahAdhanPrayerName() {
        return this.makkahAdhanPrayerName;
    }

    @NotNull
    public final StateFlow<Float> getDeviceAzimuth() {
        return this.deviceAzimuth;
    }

    /* compiled from: MainViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$1", f = "MainViewModel.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.ui.viewmodel.MainViewModel$1, reason: invalid class name */
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$1.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (MainViewModel.this.getAuthChatRepository().checkAndSeedInitialMessages((Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MainViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$2", f = "MainViewModel.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.ui.viewmodel.MainViewModel$2, reason: invalid class name */
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$2.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MainViewModel.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "azimuth", "", "bearing", ""}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
        @DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$2$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.example.ui.viewmodel.MainViewModel$2$1, reason: invalid class name */
        /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$2$1.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Float, Double, Continuation<? super Boolean>, Object> {
            /* synthetic */ double D$0;
            /* synthetic */ float F$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public final Object invoke(float f, double d, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.F$0 = f;
                anonymousClass1.D$0 = d;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).floatValue(), ((Number) obj2).doubleValue(), (Continuation<? super Boolean>) obj3);
            }

            public final Object invokeSuspend(Object $result) {
                float azimuth = this.F$0;
                double bearing = this.D$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        float diff = Math.abs(azimuth - ((float) bearing));
                        float shortestDiff = diff > 180.0f ? 360.0f - diff : diff;
                        return Boxing.boxBoolean(shortestDiff < 4.0f);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Flow combine = FlowKt.combine(MainViewModel.this.getDeviceAzimuth(), MainViewModel.this._qiblaBearing, new AnonymousClass1(null));
                    final MainViewModel mainViewModel = MainViewModel.this;
                    this.label = 1;
                    if (combine.collect(new FlowCollector() { // from class: com.example.ui.viewmodel.MainViewModel.2.2
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit(((Boolean) value).booleanValue(), (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(boolean facing, Continuation<? super Unit> continuation) {
                            if (facing && !((Boolean) MainViewModel.this._isFacingQibla.getValue()).booleanValue()) {
                                MainViewModel.this.getCompassManager().triggerQiblaHaptic();
                            }
                            MainViewModel.this._isFacingQibla.setValue(Boxing.boxBoolean(facing));
                            return Unit.INSTANCE;
                        }
                    }, (Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MainViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.viewmodel.MainViewModel$3", f = "MainViewModel.kt", i = {0, 1}, l = {203, 204}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    /* renamed from: com.example.ui.viewmodel.MainViewModel$3, reason: invalid class name */
    /* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/ui/viewmodel/MainViewModel$3.dex */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:7:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r6.label
                switch(r2) {
                    case 0: goto L25;
                    case 1: goto L20;
                    case 2: goto L15;
                    default: goto Ld;
                }
            Ld:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L15:
                kotlin.ResultKt.throwOnFailure(r7)
                r2 = r7
                kotlin.Result r2 = (kotlin.Result) r2
                r2.unbox-impl()
                r2 = r6
                goto L55
            L20:
                kotlin.ResultKt.throwOnFailure(r7)
                r2 = r6
                goto L40
            L25:
                kotlin.ResultKt.throwOnFailure(r7)
                r2 = r6
            L29:
                boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                if (r3 == 0) goto L56
                r3 = r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r2.L$0 = r0
                r4 = 1
                r2.label = r4
                r4 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r4, r3)
                if (r3 != r1) goto L40
                return r1
            L40:
                com.example.ui.viewmodel.MainViewModel r3 = com.example.ui.viewmodel.MainViewModel.this
                com.example.data.repository.AuthAndChatRepository r3 = r3.getAuthChatRepository()
                r4 = r2
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r2.L$0 = r0
                r5 = 2
                r2.label = r5
                java.lang.Object r3 = r3.m19syncWithCloudIoAF18A(r4)
                if (r3 != r1) goto L55
                return r1
            L55:
                goto L29
            L56:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ui.viewmodel.MainViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void loadSavedPreferences() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$loadSavedPreferences$1(this, null), 3, (Object) null);
    }

    private final void observeCompletedPrayers() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$observeCompletedPrayers$1(this, null), 3, (Object) null);
    }

    @NotNull
    public final StateFlow<Boolean> isLiveChatActive() {
        return this.isLiveChatActive;
    }

    public final void startLiveChatPolling() {
        this._isLiveChatActive.setValue(true);
        Job job = this.liveChatJob;
        if (job != null && job.isActive()) {
            return;
        }
        this.liveChatJob = BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$startLiveChatPolling$1(this, null), 3, (Object) null);
    }

    public final void stopLiveChatPolling() {
        this._isLiveChatActive.setValue(false);
        Job job = this.liveChatJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.liveChatJob = null;
    }

    public final void pollChatSyncSilent() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$pollChatSyncSilent$1(this, null), 3, (Object) null);
    }

    public final void selectTab(@NotNull AppTab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this._selectedTab.setValue(tab);
        AppTab appTab = AppTab.QIBLA;
        CompassSensorManager compassSensorManager = this.compassManager;
        if (tab == appTab) {
            compassSensorManager.start();
        } else {
            compassSensorManager.stop();
        }
        if (tab == AppTab.CHAT) {
            startLiveChatPolling();
        } else {
            stopLiveChatPolling();
        }
    }

    public final void selectDistrict(@NotNull District district) {
        Intrinsics.checkNotNullParameter(district, "district");
        this._selectedDistrict.setValue(district);
        updateQiblaCalculation(district);
        refreshPrayerSchedule();
        PrayerWorkScheduler prayerWorkScheduler = PrayerWorkScheduler.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        prayerWorkScheduler.scheduleDailyPrayerNotifications(context, district);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$selectDistrict$1(this, district, null), 3, (Object) null);
        showFeedback("Selected " + district.getName() + " • 5 daily prayer notifications updated");
    }

    public final void reschedulePrayerNotifications() {
        PrayerWorkScheduler prayerWorkScheduler = PrayerWorkScheduler.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        prayerWorkScheduler.scheduleDailyPrayerNotifications(context, (District) this._selectedDistrict.getValue());
        showFeedback("WorkManager: 5 daily prayer notifications refreshed for " + ((District) this._selectedDistrict.getValue()).getName());
    }

    public final void triggerWorkManagerTestAdhan(@NotNull PrayerType prayerType) {
        Intrinsics.checkNotNullParameter(prayerType, "prayerType");
        PrayerWorkScheduler prayerWorkScheduler = PrayerWorkScheduler.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        prayerWorkScheduler.triggerImmediateTestWork(context, prayerType, (District) this._selectedDistrict.getValue());
        showFeedback("Dispatched WorkManager background alert for " + prayerType.getDisplayName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateQiblaCalculation(District district) {
        double bearing = QiblaCalculator.INSTANCE.calculateQiblaBearing(district.getLatitude(), district.getLongitude());
        double distance = QiblaCalculator.INSTANCE.calculateDistanceToKaabaKm(district.getLatitude(), district.getLongitude());
        this._qiblaBearing.setValue(Double.valueOf(bearing));
        this._distanceToKaabaKm.setValue(Double.valueOf(distance));
    }

    public final void togglePrayerCheck(@NotNull SinglePrayerTime prayer) {
        Intrinsics.checkNotNullParameter(prayer, "prayer");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$togglePrayerCheck$1(prayer, this, null), 3, (Object) null);
    }

    public final void setPrayerAlertSound(@NotNull PrayerType prayerType, @NotNull AlertSoundType sound) {
        Intrinsics.checkNotNullParameter(prayerType, "prayerType");
        Intrinsics.checkNotNullParameter(sound, "sound");
        this._prayerAlerts.setValue(MapsKt.plus((Map) this._prayerAlerts.getValue(), TuplesKt.to(prayerType.name(), sound)));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$setPrayerAlertSound$1(this, prayerType, sound, null), 3, (Object) null);
        showFeedback("Alert for " + prayerType.getDisplayName() + " set to " + sound.getDisplayName());
    }

    public final void testAdhanAlert(@NotNull String prayerName) {
        Intrinsics.checkNotNullParameter(prayerName, "prayerName");
        MakkahAdhanPlayer makkahAdhanPlayer = MakkahAdhanPlayer.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        MakkahAdhanPlayer.playMakkahAdhan$default(makkahAdhanPlayer, context, prayerName, false, null, 8, null);
        String time = new SimpleDateFormat("hh:mm a", Locale.US).format(Calendar.getInstance().getTime());
        NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Intrinsics.checkNotNull(time);
        notificationHelper.sendPrayerAlertNotification(context2, prayerName, time, ((District) this._selectedDistrict.getValue()).getName());
        showFeedback("Playing Makkah Azan (أذان مكة) & notification for " + prayerName);
    }

    public static /* synthetic */ void playMakkahAzan$default(MainViewModel mainViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Fajr";
        }
        mainViewModel.playMakkahAzan(str);
    }

    public final void playMakkahAzan(@NotNull String prayerName) {
        Intrinsics.checkNotNullParameter(prayerName, "prayerName");
        MakkahAdhanPlayer makkahAdhanPlayer = MakkahAdhanPlayer.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        MakkahAdhanPlayer.playMakkahAdhan$default(makkahAdhanPlayer, context, prayerName, false, null, 8, null);
        showFeedback("Playing Makkah Azan • " + prayerName);
    }

    public final void stopMakkahAzan() {
        MakkahAdhanPlayer.INSTANCE.stopAdhan();
        showFeedback("Makkah Azan stopped ⏹️");
    }

    public final void setAllPrayersToMakkahAzan() {
        PrayerType[] values = PrayerType.values();
        Map updated = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (PrayerType prayerType : values) {
            Pair pair = TuplesKt.to(prayerType.name(), AlertSoundType.ADHAN_MAKKAH);
            updated.put(pair.getFirst(), pair.getSecond());
        }
        this._prayerAlerts.setValue(updated);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$setAllPrayersToMakkahAzan$1(this, null), 3, (Object) null);
        showFeedback("All 5 prayer alarms set to Makkah Azan (أذان مكة المكرمة)");
    }

    public final void toggleMosqueReminder(@NotNull MosqueEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$toggleMosqueReminder$1(this, event, null), 3, (Object) null);
    }

    public final void addCommunityMosqueEvent(@NotNull String mosqueName, @NotNull String title, @NotNull String speaker, @NotNull String time, @NotNull String address, @NotNull String description, @NotNull MosqueEventType type) {
        Intrinsics.checkNotNullParameter(mosqueName, "mosqueName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(speaker, "speaker");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        MosqueEvent newEvent = new MosqueEvent(System.currentTimeMillis(), mosqueName, ((District) this._selectedDistrict.getValue()).getName(), type, title, speaker, "Upcoming Event", time, description, address, true);
        this.mosqueRepository.addCommunityEvent(newEvent);
        NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        notificationHelper.sendMosqueEventNotification(context, mosqueName, title, time, address);
        showFeedback("Community announcement posted successfully!");
    }

    public final void loginWithPhoneNumber(@NotNull String phone, @NotNull String fullName, @NotNull UserRole role, @NotNull String adminPin, @Nullable String adminDesignation, @Nullable String mosqueAffiliation, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super String, Unit> onError) {
        boolean z;
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(adminPin, "adminPin");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        String trimmed = StringsKt.trim(phone).toString();
        String str = trimmed;
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (Character.isLetter(str.charAt(i))) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        boolean isAlphaId = z;
        String str2 = trimmed;
        Appendable sb = new StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = ((StringBuilder) sb).toString();
        if (isAlphaId) {
            if (trimmed.length() < 3) {
                onError.invoke("Please enter a valid Admin ID (minimum 3 characters)");
                return;
            }
        } else if (sb2.length() < 9 && !Intrinsics.areEqual(trimmed, "shihab2415")) {
            onError.invoke("Please enter a valid Sri Lankan phone number (e.g., 077 123 4567) or Admin ID");
            return;
        }
        if (role == UserRole.ADMIN) {
            List validPins = CollectionsKt.listOf(new String[]{"shihab2415", "7860", "1234", "786", "9999"});
            if (!validPins.contains(StringsKt.trim(adminPin).toString())) {
                onError.invoke("Invalid Admin password. Please check your credentials.");
                return;
            }
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$loginWithPhoneNumber$1(trimmed, role, mosqueAffiliation, adminDesignation, this, fullName, onSuccess, null), 3, (Object) null);
    }

    public final void logout() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$logout$1(this, null), 3, (Object) null);
    }

    public final void selectChatGroup(@NotNull ChatGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this._selectedChatGroup.setValue(group);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$selectChatGroup$1(this, null), 3, (Object) null);
    }

    public static /* synthetic */ void sendChatMessage$default(MainViewModel mainViewModel, String str, String str2, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
        String str3;
        boolean z2;
        if ((i & 2) == 0) {
            str3 = str2;
        } else {
            str3 = null;
        }
        if ((i & 4) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        mainViewModel.sendChatMessage(str, str3, z2, function0, function1);
    }

    public final void sendChatMessage(@NotNull String text, @Nullable String tag, boolean isPinned, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        UserProfile userProfile = (UserProfile) this.currentUser.getValue();
        if (userProfile == null) {
            userProfile = new UserProfile("+94721160032", "Shihab (Mosque Admin)", UserRole.ADMIN, "Verified Mosque Administrator", "Bogawantalawa Town Jummah Mosque (Hatton & Bogawantalawa)", true);
        }
        UserProfile activeUser = userProfile;
        if (activeUser.getRole() != UserRole.ADMIN) {
            onError.invoke("Only verified Mosque Admins can post announcements.");
        } else if (StringsKt.isBlank(text)) {
            onError.invoke("Message cannot be empty.");
        } else {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$sendChatMessage$1(this, activeUser, text, tag, isPinned, onSuccess, onError, null), 3, (Object) null);
        }
    }

    public static /* synthetic */ void sendAdminChatMessage$default(MainViewModel mainViewModel, String str, String str2, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
        String str3;
        boolean z2;
        if ((i & 2) == 0) {
            str3 = str2;
        } else {
            str3 = null;
        }
        if ((i & 4) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        mainViewModel.sendAdminChatMessage(str, str3, z2, function0, function1);
    }

    public final void sendAdminChatMessage(@NotNull String text, @Nullable String tag, boolean isPinned, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        sendChatMessage(text, tag, isPinned, onSuccess, onError);
    }

    public final void reactToMessage(long messageId) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$reactToMessage$1(this, messageId, null), 3, (Object) null);
    }

    public final void deleteMessage(long messageId) {
        UserProfile user = (UserProfile) this.currentUser.getValue();
        if ((user != null ? user.getRole() : null) != UserRole.ADMIN) {
            showFeedback("Only Admins can delete messages.");
        } else {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$deleteMessage$1(this, messageId, user, null), 3, (Object) null);
        }
    }

    public final void triggerChatSync() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$triggerChatSync$1(this, null), 3, (Object) null);
    }

    public final void setThemeMode(@NotNull ThemeMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this._themeMode.setValue(mode);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$setThemeMode$1(this, mode, null), 3, (Object) null);
    }

    public final void setQuranSearch(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._quranSearchQuery.setValue(query);
    }

    public final void openSurahReader(@Nullable Surah surah) {
        this._readingSurah.setValue(surah);
    }

    public final void toggleSurahBookmark(@NotNull Surah surah) {
        Intrinsics.checkNotNullParameter(surah, "surah");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$toggleSurahBookmark$1(this, surah, null), 3, (Object) null);
    }

    public final void playSurahRecitation(@NotNull Surah surah) {
        Intrinsics.checkNotNullParameter(surah, "surah");
        this.audioManager.playSurah(surah);
    }

    public final void pauseRecitation() {
        this.audioManager.pause();
    }

    public final void resumeRecitation() {
        this.audioManager.resume();
    }

    public final void seekRecitation(int posMs) {
        this.audioManager.seekTo(posMs);
    }

    public final void toggleRecitationLoop() {
        this.audioManager.toggleLoop();
    }

    public final void stopRecitation() {
        this.audioManager.stop();
    }

    public final void setMosqueFilter(@Nullable MosqueEventType type) {
        this._selectedMosqueFilter.setValue(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPrayerSchedule() {
        Object obj;
        List list = this.prayerRepository.getCalculatedPrayers((District) this._selectedDistrict.getValue(), (Set) this._completedPrayers.getValue());
        this._calculatedPrayers.setValue(list);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SinglePrayerTime) obj).isNext()) {
                    break;
                }
            }
        }
        SinglePrayerTime next = (SinglePrayerTime) obj;
        if (next == null) {
            next = (SinglePrayerTime) CollectionsKt.firstOrNull(list);
        }
        this._nextPrayer.setValue(next);
        updateCountdown();
    }

    private final void startTicker() {
        Job job = this.tickerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.tickerJob = BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$startTicker$1(this, null), 3, (Object) null);
    }

    private final void updateCountdown() {
        SinglePrayerTime next = (SinglePrayerTime) this._nextPrayer.getValue();
        if (next == null) {
            return;
        }
        Calendar now = Calendar.getInstance();
        int nowSeconds = (now.get(11) * 3600) + (now.get(12) * 60) + now.get(13);
        int targetSeconds = (next.getHour() * 3600) + (next.getMinute() * 60);
        int diffSeconds = targetSeconds - nowSeconds;
        if (diffSeconds < 0) {
            diffSeconds += 86400;
        }
        int hours = diffSeconds / 3600;
        int mins = (diffSeconds % 3600) / 60;
        int secs = diffSeconds % 60;
        MutableStateFlow<String> mutableStateFlow = this._countdownText;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "-%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hours), Integer.valueOf(mins), Integer.valueOf(secs)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        mutableStateFlow.setValue(format);
        float elapsed = RangesKt.coerceAtLeast(14400.0f - diffSeconds, 0.0f);
        this._progressPercent.setValue(Float.valueOf(RangesKt.coerceIn(elapsed / 14400.0f, 0.05f, 1.0f)));
    }

    @NotNull
    public final String getGregorianDateFormatted() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMMM yyyy", Locale.US);
        String format = sdf.format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public final String getHijriDateFormatted() {
        return HijriCalendarHelper.getHijriDate$default(HijriCalendarHelper.INSTANCE, null, 1, null).toFormattedString();
    }

    public final void showFeedback(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this._userFeedbackMessage.setValue(msg);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new MainViewModel$showFeedback$1(this, msg, null), 3, (Object) null);
    }

    @NotNull
    public final StateFlow<DuaCategory> getDuaCategory() {
        return this.duaCategory;
    }

    @NotNull
    public final StateFlow<String> getDuaSearchQuery() {
        return this.duaSearchQuery;
    }

    @NotNull
    public final StateFlow<Set<String>> getFavoriteDuaIds() {
        return this.favoriteDuaIds;
    }

    @NotNull
    public final StateFlow<Map<String, Integer>> getDuaCounters() {
        return this.duaCounters;
    }

    @NotNull
    public final StateFlow<List<DuaItem>> getFilteredDuas() {
        return this.filteredDuas;
    }

    public final void setDuaCategory(@NotNull DuaCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this._duaCategory.setValue(category);
    }

    public final void setDuaSearchQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._duaSearchQuery.setValue(query);
    }

    public final void toggleDuaFavorite(@NotNull String duaId) {
        Intrinsics.checkNotNullParameter(duaId, "duaId");
        Set current = (Set) this._favoriteDuaIds.getValue();
        boolean contains = current.contains(duaId);
        MutableStateFlow<Set<String>> mutableStateFlow = this._favoriteDuaIds;
        if (contains) {
            mutableStateFlow.setValue(SetsKt.minus(current, duaId));
            showFeedback("Removed from favorites");
        } else {
            mutableStateFlow.setValue(SetsKt.plus(current, duaId));
            showFeedback("Added to favorites ❤️");
        }
    }

    public final void incrementDuaCounter(@NotNull String duaId) {
        Intrinsics.checkNotNullParameter(duaId, "duaId");
        Map currentMap = MapsKt.toMutableMap((Map) this._duaCounters.getValue());
        Integer num = (Integer) currentMap.get(duaId);
        int count = (num != null ? num.intValue() : 0) + 1;
        currentMap.put(duaId, Integer.valueOf(count));
        this._duaCounters.setValue(currentMap);
    }

    public final void resetDuaCounter(@NotNull String duaId) {
        Intrinsics.checkNotNullParameter(duaId, "duaId");
        Map currentMap = MapsKt.toMutableMap((Map) this._duaCounters.getValue());
        currentMap.put(duaId, 0);
        this._duaCounters.setValue(currentMap);
    }

    protected void onCleared() {
        super.onCleared();
        Job job = this.tickerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.compassManager.stop();
        this.audioManager.release();
    }
}
