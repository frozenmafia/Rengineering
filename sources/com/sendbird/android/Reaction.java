package com.sendbird.android;

import android.util.Base64;
import com.sendbird.android.ReactionEvent;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonArray;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import com.sendbird.android.shadow.com.google.gson.JsonParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class Reaction implements Comparable<Reaction> {
    private final String key;
    private final Map<String, Long> reactionUpdateMap;
    private long updatedAt;
    private final List<String> userIds;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Reaction(ReactionEvent reactionEvent) {
        ArrayList arrayList = new ArrayList();
        this.userIds = arrayList;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.reactionUpdateMap = concurrentHashMap;
        this.key = reactionEvent.getKey();
        this.updatedAt = reactionEvent.getUpdatedAt();
        arrayList.add(reactionEvent.getUserId());
        concurrentHashMap.put(reactionEvent.getUserId(), Long.valueOf(reactionEvent.getUpdatedAt()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Reaction(JsonElement jsonElement) {
        this.userIds = new ArrayList();
        this.reactionUpdateMap = new ConcurrentHashMap();
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.key = asJsonObject.get(StringSet.key).getAsString();
        this.updatedAt = asJsonObject.has("latest_updated_at") ? asJsonObject.get("latest_updated_at").getAsLong() : 0L;
        if (asJsonObject.has("user_ids")) {
            JsonArray asJsonArray = asJsonObject.getAsJsonArray("user_ids");
            for (int i = 0; i < asJsonArray.size(); i++) {
                if (asJsonArray.get(i) != null) {
                    String asString = asJsonArray.get(i).getAsString();
                    this.userIds.add(asString);
                    this.reactionUpdateMap.put(asString, Long.valueOf(this.updatedAt));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(StringSet.key, this.key);
        jsonObject.addProperty("latest_updated_at", Long.valueOf(this.updatedAt));
        synchronized (this.userIds) {
            if (this.userIds.size() > 0) {
                JsonArray jsonArray = new JsonArray();
                for (String str : this.userIds) {
                    if (str != null) {
                        jsonArray.add(str);
                    }
                }
                jsonObject.add("user_ids", jsonArray);
            }
        }
        return jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean merge(ReactionEvent reactionEvent) {
        if (this.updatedAt < reactionEvent.getUpdatedAt()) {
            this.updatedAt = reactionEvent.getUpdatedAt();
        }
        Long l = this.reactionUpdateMap.get(reactionEvent.getUserId());
        if (l == null) {
            l = 0L;
        }
        if (l.longValue() > reactionEvent.getUpdatedAt()) {
            return false;
        }
        this.reactionUpdateMap.put(reactionEvent.getUserId(), Long.valueOf(reactionEvent.getUpdatedAt()));
        synchronized (this.userIds) {
            this.userIds.remove(reactionEvent.getUserId());
            if (reactionEvent.getOperation() == ReactionEvent.ReactionEventAction.ADD) {
                this.userIds.add(reactionEvent.getUserId());
            }
        }
        return true;
    }

    public static Reaction buildFromSerializedData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ (i & 255));
        }
        try {
            return new Reaction(new JsonParser().parse(new String(Base64.decode(bArr2, 0), "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] serialize() {
        JsonObject asJsonObject = toJson().getAsJsonObject();
        asJsonObject.addProperty("version", SendBird.getSDKVersion());
        try {
            byte[] encode = Base64.encode(asJsonObject.toString().getBytes("UTF-8"), 0);
            for (int i = 0; i < encode.length; i++) {
                encode[i] = (byte) (encode[i] ^ (i & 255));
            }
            return encode;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getKey() {
        return this.key;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public List<String> getUserIds() {
        return Collections.unmodifiableList(this.userIds);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return getKey().equals(((Reaction) obj).getKey());
    }

    public int hashCode() {
        return HashUtils.generateHashCode(getKey());
    }

    public String toString() {
        return "Reaction{key='" + this.key + "', updatedAt=" + this.updatedAt + ", userIds=" + this.userIds + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(Reaction reaction) {
        return (int) (this.updatedAt - reaction.updatedAt);
    }

    public static Reaction clone(Reaction reaction) {
        return new Reaction(reaction.toJson());
    }
}
