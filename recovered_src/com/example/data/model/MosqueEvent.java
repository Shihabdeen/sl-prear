package com.example.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MosqueModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 ¨\u00062"}, d2 = {"Lcom/example/data/model/MosqueEvent;", "", "id", "", "mosqueName", "", "district", "eventType", "Lcom/example/data/model/MosqueEventType;", "title", "speaker", "dateFormatted", "timeFormatted", "description", "address", "isReminderSet", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/example/data/model/MosqueEventType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()J", "getMosqueName", "()Ljava/lang/String;", "getDistrict", "getEventType", "()Lcom/example/data/model/MosqueEventType;", "getTitle", "getSpeaker", "getDateFormatted", "getTimeFormatted", "getDescription", "getAddress", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/MosqueEvent.dex */
public final /* data */ class MosqueEvent {
    public static final int $stable = 0;

    @NotNull
    private final String address;

    @NotNull
    private final String dateFormatted;

    @NotNull
    private final String description;

    @NotNull
    private final String district;

    @NotNull
    private final MosqueEventType eventType;
    private final long id;
    private final boolean isReminderSet;

    @NotNull
    private final String mosqueName;

    @NotNull
    private final String speaker;

    @NotNull
    private final String timeFormatted;

    @NotNull
    private final String title;

    public static /* synthetic */ MosqueEvent copy$default(MosqueEvent mosqueEvent, long j, String str, String str2, MosqueEventType mosqueEventType, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mosqueEvent.id;
        }
        return mosqueEvent.copy(j, (i & 2) != 0 ? mosqueEvent.mosqueName : str, (i & 4) != 0 ? mosqueEvent.district : str2, (i & 8) != 0 ? mosqueEvent.eventType : mosqueEventType, (i & 16) != 0 ? mosqueEvent.title : str3, (i & 32) != 0 ? mosqueEvent.speaker : str4, (i & 64) != 0 ? mosqueEvent.dateFormatted : str5, (i & 128) != 0 ? mosqueEvent.timeFormatted : str6, (i & 256) != 0 ? mosqueEvent.description : str7, (i & 512) != 0 ? mosqueEvent.address : str8, (i & 1024) != 0 ? mosqueEvent.isReminderSet : z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsReminderSet() {
        return this.isReminderSet;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMosqueName() {
        return this.mosqueName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final MosqueEventType getEventType() {
        return this.eventType;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSpeaker() {
        return this.speaker;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getDateFormatted() {
        return this.dateFormatted;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTimeFormatted() {
        return this.timeFormatted;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final MosqueEvent copy(long id, @NotNull String mosqueName, @NotNull String district, @NotNull MosqueEventType eventType, @NotNull String title, @NotNull String speaker, @NotNull String dateFormatted, @NotNull String timeFormatted, @NotNull String description, @NotNull String address, boolean isReminderSet) {
        Intrinsics.checkNotNullParameter(mosqueName, "mosqueName");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(speaker, "speaker");
        Intrinsics.checkNotNullParameter(dateFormatted, "dateFormatted");
        Intrinsics.checkNotNullParameter(timeFormatted, "timeFormatted");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(address, "address");
        return new MosqueEvent(id, mosqueName, district, eventType, title, speaker, dateFormatted, timeFormatted, description, address, isReminderSet);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MosqueEvent)) {
            return false;
        }
        MosqueEvent mosqueEvent = (MosqueEvent) other;
        return this.id == mosqueEvent.id && Intrinsics.areEqual(this.mosqueName, mosqueEvent.mosqueName) && Intrinsics.areEqual(this.district, mosqueEvent.district) && this.eventType == mosqueEvent.eventType && Intrinsics.areEqual(this.title, mosqueEvent.title) && Intrinsics.areEqual(this.speaker, mosqueEvent.speaker) && Intrinsics.areEqual(this.dateFormatted, mosqueEvent.dateFormatted) && Intrinsics.areEqual(this.timeFormatted, mosqueEvent.timeFormatted) && Intrinsics.areEqual(this.description, mosqueEvent.description) && Intrinsics.areEqual(this.address, mosqueEvent.address) && this.isReminderSet == mosqueEvent.isReminderSet;
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.id) * 31) + this.mosqueName.hashCode()) * 31) + this.district.hashCode()) * 31) + this.eventType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.speaker.hashCode()) * 31) + this.dateFormatted.hashCode()) * 31) + this.timeFormatted.hashCode()) * 31) + this.description.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.isReminderSet);
    }

    @NotNull
    public String toString() {
        return "MosqueEvent(id=" + this.id + ", mosqueName=" + this.mosqueName + ", district=" + this.district + ", eventType=" + this.eventType + ", title=" + this.title + ", speaker=" + this.speaker + ", dateFormatted=" + this.dateFormatted + ", timeFormatted=" + this.timeFormatted + ", description=" + this.description + ", address=" + this.address + ", isReminderSet=" + this.isReminderSet + ")";
    }

    public MosqueEvent(long id, @NotNull String mosqueName, @NotNull String district, @NotNull MosqueEventType eventType, @NotNull String title, @NotNull String speaker, @NotNull String dateFormatted, @NotNull String timeFormatted, @NotNull String description, @NotNull String address, boolean isReminderSet) {
        Intrinsics.checkNotNullParameter(mosqueName, "mosqueName");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(speaker, "speaker");
        Intrinsics.checkNotNullParameter(dateFormatted, "dateFormatted");
        Intrinsics.checkNotNullParameter(timeFormatted, "timeFormatted");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(address, "address");
        this.id = id;
        this.mosqueName = mosqueName;
        this.district = district;
        this.eventType = eventType;
        this.title = title;
        this.speaker = speaker;
        this.dateFormatted = dateFormatted;
        this.timeFormatted = timeFormatted;
        this.description = description;
        this.address = address;
        this.isReminderSet = isReminderSet;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MosqueEvent(long r15, java.lang.String r17, java.lang.String r18, com.example.data.model.MosqueEventType r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r27
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L9
            r0 = 0
            r13 = r0
            goto Lb
        L9:
            r13 = r26
        Lb:
            r1 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.model.MosqueEvent.<init>(long, java.lang.String, java.lang.String, com.example.data.model.MosqueEventType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getMosqueName() {
        return this.mosqueName;
    }

    @NotNull
    public final String getDistrict() {
        return this.district;
    }

    @NotNull
    public final MosqueEventType getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getSpeaker() {
        return this.speaker;
    }

    @NotNull
    public final String getDateFormatted() {
        return this.dateFormatted;
    }

    @NotNull
    public final String getTimeFormatted() {
        return this.timeFormatted;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final boolean isReminderSet() {
        return this.isReminderSet;
    }
}
