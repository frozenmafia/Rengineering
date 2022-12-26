package com.sendbird.android;

import android.util.Base64;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonArray;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import com.sendbird.android.shadow.com.google.gson.JsonParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public class ThreadInfo {
    private long lastRepliedAt;
    private final List<User> mostRepliedUsers;
    private int replyCount;
    private long updatedAt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ThreadInfo() {
        this.mostRepliedUsers = new ArrayList();
        this.lastRepliedAt = 0L;
        this.updatedAt = 0L;
        this.replyCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ThreadInfo(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        ArrayList arrayList = new ArrayList();
        JsonArray asJsonArray = asJsonObject.has(StringSet.most_replies) ? asJsonObject.get(StringSet.most_replies).getAsJsonArray() : null;
        if (asJsonArray != null) {
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(new User(it.next()));
            }
        }
        this.mostRepliedUsers = arrayList;
        this.lastRepliedAt = asJsonObject.has(StringSet.last_replied_at) ? asJsonObject.get(StringSet.last_replied_at).getAsLong() : 0L;
        this.updatedAt = asJsonObject.has(StringSet.updated_at) ? asJsonObject.get(StringSet.updated_at).getAsLong() : 0L;
        this.replyCount = asJsonObject.has(StringSet.reply_count) ? asJsonObject.get(StringSet.reply_count).getAsInt() : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement toJson() {
        JsonObject jsonObject;
        synchronized (this) {
            jsonObject = new JsonObject();
            List<User> list = this.mostRepliedUsers;
            if (list != null && !list.isEmpty()) {
                JsonArray jsonArray = new JsonArray();
                for (User user : this.mostRepliedUsers) {
                    if (user != null) {
                        jsonArray.add(user.toJson());
                    }
                }
                jsonObject.add(StringSet.most_replies, jsonArray);
            }
            jsonObject.addProperty(StringSet.last_replied_at, Long.valueOf(this.lastRepliedAt));
            jsonObject.addProperty(StringSet.updated_at, Long.valueOf(this.updatedAt));
            jsonObject.addProperty(StringSet.reply_count, Integer.valueOf(this.replyCount));
        }
        return jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean merge(ThreadInfo threadInfo) {
        synchronized (this) {
            if (threadInfo.getUpdatedAt() < this.updatedAt) {
                return false;
            }
            this.mostRepliedUsers.clear();
            this.mostRepliedUsers.addAll(threadInfo.getMostRepliedUsers());
            this.lastRepliedAt = threadInfo.getLastRepliedAt();
            this.replyCount = threadInfo.getReplyCount();
            this.updatedAt = threadInfo.getUpdatedAt();
            return true;
        }
    }

    public static ThreadInfo buildFromSerializedData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ (i & 255));
        }
        try {
            return new ThreadInfo(new JsonParser().parse(new String(Base64.decode(bArr2, 0), "UTF-8")).getAsJsonObject());
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

    public List<User> getMostRepliedUsers() {
        return Collections.unmodifiableList(this.mostRepliedUsers);
    }

    public long getLastRepliedAt() {
        return this.lastRepliedAt;
    }

    public int getReplyCount() {
        return this.replyCount;
    }

    long getUpdatedAt() {
        return this.updatedAt;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            ThreadInfo threadInfo = (ThreadInfo) obj;
            if (this.lastRepliedAt == threadInfo.lastRepliedAt && this.replyCount == threadInfo.replyCount && this.mostRepliedUsers.equals(threadInfo.mostRepliedUsers)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return HashUtils.generateHashCode(this.mostRepliedUsers, Long.valueOf(this.lastRepliedAt), Integer.valueOf(this.replyCount));
    }

    public String toString() {
        return "ThreadInfo{mostRepliedUsers=" + this.mostRepliedUsers + ", lastRepliedAt=" + this.lastRepliedAt + ", replyCount=" + this.replyCount + ", updatedAt=" + this.updatedAt + '}';
    }
}
