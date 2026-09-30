package com.example.data.repository;

import com.example.BuildConfig;
import com.example.data.local.ChatMessageEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthAndChatRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.repository.AuthAndChatRepository$uploadMessageToCloud$2", f = "AuthAndChatRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAuthAndChatRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository$uploadMessageToCloud$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,441:1\n1869#2,2:442\n*S KotlinDebug\n*F\n+ 1 AuthAndChatRepository.kt\ncom/example/data/repository/AuthAndChatRepository$uploadMessageToCloud$2\n*L\n331#1:442,2\n*E\n"})
/* loaded from: /app/applet/app/build/intermediates/project_dex_archive/debug/dexBuilderDebug/out/com/example/data/repository/AuthAndChatRepository$uploadMessageToCloud$2.dex */
public final class AuthAndChatRepository$uploadMessageToCloud$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ ChatMessageEntity $entity;
    int label;
    final /* synthetic */ AuthAndChatRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthAndChatRepository$uploadMessageToCloud$2(AuthAndChatRepository authAndChatRepository, ChatMessageEntity chatMessageEntity, Continuation<? super AuthAndChatRepository$uploadMessageToCloud$2> continuation) {
        super(2, continuation);
        this.this$0 = authAndChatRepository;
        this.$entity = chatMessageEntity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthAndChatRepository$uploadMessageToCloud$2(this.this$0, this.$entity, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object obj;
        OkHttpClient okHttpClient;
        OkHttpClient okHttpClient2;
        Object createFailure;
        String body;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                try {
                    Request getReq = new Request.Builder().url("https://api.restful-api.dev/objects/ff808181a09d98f701a0d23934bc04f0").header("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36").get().build();
                    okHttpClient = this.this$0.httpClient;
                    Response getResp = okHttpClient.newCall(getReq).execute();
                    List currentList = new ArrayList();
                    if (getResp.isSuccessful()) {
                        ResponseBody body2 = getResp.body();
                        String body3 = body2 != null ? body2.string() : null;
                        if (body3 == null) {
                            body3 = "";
                        }
                        getResp.close();
                        JSONObject root = new JSONObject(body3);
                        JSONObject data = root.optJSONObject("data");
                        JSONArray arr = data != null ? data.optJSONArray("messages") : null;
                        if (arr != null) {
                            int i = 0;
                            int length = arr.length();
                            while (i < length) {
                                JSONObject obj2 = arr.getJSONObject(i);
                                int i2 = length;
                                Response getResp2 = getResp;
                                if (obj2.optLong("timestamp") == this.$entity.getTimestamp()) {
                                    body = body3;
                                    if (Intrinsics.areEqual(obj2.optString("text"), this.$entity.getText())) {
                                        i++;
                                        length = i2;
                                        body3 = body;
                                        getResp = getResp2;
                                    }
                                } else {
                                    body = body3;
                                }
                                Intrinsics.checkNotNull(obj2);
                                currentList.add(obj2);
                                i++;
                                length = i2;
                                body3 = body;
                                getResp = getResp2;
                            }
                        }
                    } else {
                        getResp.close();
                    }
                    JSONObject newObj = new JSONObject();
                    ChatMessageEntity chatMessageEntity = this.$entity;
                    newObj.put("id", chatMessageEntity.getTimestamp());
                    newObj.put("groupId", chatMessageEntity.getGroupId());
                    newObj.put("senderPhone", chatMessageEntity.getSenderPhone());
                    newObj.put("senderName", chatMessageEntity.getSenderName());
                    newObj.put("senderRole", "ADMIN");
                    String senderDesignation = chatMessageEntity.getSenderDesignation();
                    if (senderDesignation == null) {
                        senderDesignation = "Verified Mosque Administrator";
                    }
                    newObj.put("senderDesignation", senderDesignation);
                    String senderMosque = chatMessageEntity.getSenderMosque();
                    if (senderMosque == null) {
                        senderMosque = "Bogawantalawa Town Jummah Mosque (Hatton & Bogawantalawa)";
                    }
                    newObj.put("senderMosque", senderMosque);
                    newObj.put("text", chatMessageEntity.getText());
                    newObj.put("timestamp", chatMessageEntity.getTimestamp());
                    String tag = chatMessageEntity.getTag();
                    if (tag == null) {
                        tag = "OFFICIAL NOTICE";
                    }
                    newObj.put("tag", tag);
                    newObj.put("isPinned", chatMessageEntity.isPinned());
                    newObj.put("reactionsCount", chatMessageEntity.getReactionsCount());
                    currentList.add(newObj);
                    List trimmed = currentList.size() > 80 ? CollectionsKt.takeLast(currentList, 80) : currentList;
                    JSONArray updatedJsonArray = new JSONArray();
                    Iterator it = trimmed.iterator();
                    while (it.hasNext()) {
                        updatedJsonArray.put((JSONObject) it.next());
                    }
                    JSONObject payload = new JSONObject();
                    payload.put("name", "sl_prayer_registry");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("messages", updatedJsonArray);
                    jSONObject.put("lastUpdated", System.currentTimeMillis());
                    Unit unit = Unit.INSTANCE;
                    payload.put("data", jSONObject);
                    MediaType jsonType = MediaType.Companion.get("application/json; charset=utf-8");
                    Request.Builder header = new Request.Builder().url("https://api.restful-api.dev/objects/ff808181a09d98f701a0d23934bc04f0").header("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36").header("Content-Type", "application/json");
                    RequestBody.Companion companion = RequestBody.Companion;
                    String jSONObject2 = payload.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                    Request putReq = header.put(companion.create(jSONObject2, jsonType)).build();
                    okHttpClient2 = this.this$0.httpClient;
                    Response putResp = okHttpClient2.newCall(putReq).execute();
                    boolean isSuccess = putResp.isSuccessful();
                    putResp.close();
                    if (isSuccess) {
                        Result.Companion companion2 = Result.Companion;
                        createFailure = Unit.INSTANCE;
                    } else {
                        Result.Companion companion3 = Result.Companion;
                        createFailure = ResultKt.createFailure(new Exception("Cloud HTTP " + putResp.code()));
                    }
                    obj = Result.constructor-impl(createFailure);
                } catch (Exception e) {
                    Result.Companion companion4 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(e));
                }
                return Result.box-impl(obj);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
