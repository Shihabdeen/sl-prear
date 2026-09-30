package com.example.data.model;

import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ChatModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"DefaultChatGroups", "", "Lcom/example/data/model/ChatGroup;", "getDefaultChatGroups", "()Ljava/util/List;", "SampleInitialMessages", "Lcom/example/data/model/ChatMessage;", "getSampleInitialMessages", "app"}, k = BuildConfig.VERSION_CODE, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/model/ChatModelKt.dex */
public final class ChatModelKt {

    @NotNull
    private static final List<ChatGroup> DefaultChatGroups = CollectionsKt.listOf(new ChatGroup[]{new ChatGroup("hatton_bogawantalawa_mosques", "Hatton & Bogawantalawa Mosque Updates", "Official broadcasts from Bogawantalawa Town Jummah Mosque & Hatton Grand Mosque. Jummah timings, janaza notices, and valley programs.", "🕌", 4280, true), new ChatGroup("sl_central_broadcast", "SL Central Mosque Announcements", "Official announcements from All Ceylon Jamiyyathul Ulama & Mosques Federation. Only Admins can send messages.", "📢", 12450, true), new ChatGroup("colombo_mosques", "Colombo District Mosque Updates", "Jummah bayans, Ramadan schedules, and charity programs across Colombo. Only Admins can send messages.", "📢", 8920, true), new ChatGroup("hilal_sighting", "Moon Sighting & Hijri Calendar", "Official Hilal Sighting Committee updates for Ramadan, Eid al-Fitr & Eid al-Adha in Sri Lanka. Only Admins can send messages.", "🌙", 15300, true), new ChatGroup("community_relief", "Emergency Relief & Janaza Notices", "Urgent community blood donor requests, emergency relief, and verified Janaza announcements. Only Admins can post.", "🤲", 9840, true)});

    @NotNull
    private static final List<ChatMessage> SampleInitialMessages = CollectionsKt.listOf(new ChatMessage[]{new ChatMessage(101, "hatton_bogawantalawa_mosques", "shihab2415", "Shihab (Mosque Admin)", UserRole.ADMIN, "Verified Mosque Administrator", "Bogawantalawa Town Jummah Mosque", "Assalamu Alaikum wa Rahmatullahi wa Barakatuhu. Official Announcement from Bogawantalawa Town Jummah Mosque: Friday Jummah Khutbah commences at 12:30 PM. All community members across Bogawantalawa valley and Hatton are requested to arrive early.", System.currentTimeMillis() - 1200000, "OFFICIAL NOTICE", true, 64), new ChatMessage(102, "hatton_bogawantalawa_mosques", "+94 77 987 6543", "Hatton Grand Mosque Committee", UserRole.ADMIN, "Secretary & Khatib", "Hatton Grand Jummah Mosque", "Hatton Grand Mosque Notice: Daily Maktab Quran classes for youth and students will be held daily after Asr prayer. Winter relief supply coordination continues at the community hall.", System.currentTimeMillis() - 3600000, "COMMUNITY NOTICE", true, 48), new ChatMessage(1, "sl_central_broadcast", "+94 77 123 4567", "Moulavi Rizwe Mufthi", UserRole.ADMIN, "ACJU President / Trustee", "Colombo Grand Mosque", "Assalamu Alaikum wa Rahmatullahi wa Barakatuhu. Dear community members, all mosques in Sri Lanka are requested to observe standard prayer timings according to the ACJU timetable.", System.currentTimeMillis() - 7200000, "OFFICIAL NOTICE", true, 42), new ChatMessage(2, "sl_central_broadcast", "+94 77 234 5678", "Ash-Sheikh M. H. M. Bilal", UserRole.ADMIN, "Chief Khatib", "Dewatagaha Mosque, Colombo 07", "Jummah Khutbah this Friday will begin at 12:45 PM sharp. Topic: 'Strengthening Community Brotherhood & Upright Character in Daily Life'. All are warmly welcome.", System.currentTimeMillis() - 3600000, "JUMMAH", false, 28), new ChatMessage(3, "colombo_mosques", "+94 77 345 6789", "Al-Haj Faizur Rahman", UserRole.ADMIN, "Board Trustee", "Red Mosque (Jami Ul-Alfar), Pettah", "Notice: Daily Dhuhr congregation will be held on the first and second floors to accommodate travelers and workers in Pettah market. Please cooperate with our volunteer coordinators.", System.currentTimeMillis() - 1800000, "MOSQUE UPDATE", false, 19), new ChatMessage(4, "hilal_sighting", "+94 77 456 7890", "Hilal Committee Sri Lanka", UserRole.ADMIN, "Central Moon Sighting Directorate", "Colombo Grand Mosque", "The monthly moon sighting session for the upcoming Islamic month will convene on the 29th evening at Colombo Grand Mosque after Maghrib prayer. Please forward verified sightings via designated district lines.", System.currentTimeMillis() - 900000, "MOON SIGHTING", true, 56)});

    @NotNull
    public static final List<ChatGroup> getDefaultChatGroups() {
        return DefaultChatGroups;
    }

    @NotNull
    public static final List<ChatMessage> getSampleInitialMessages() {
        return SampleInitialMessages;
    }
}
