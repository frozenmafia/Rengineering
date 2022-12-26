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
import java.util.List;
/* loaded from: classes7.dex */
public class EmojiContainer {
    private final List<EmojiCategory> emojiCategories = new ArrayList();
    private final String emojiHash;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmojiContainer(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.emojiHash = asJsonObject.has(StringSet.emoji_hash) ? asJsonObject.get(StringSet.emoji_hash).getAsString() : "";
        if (asJsonObject.has(StringSet.emoji_categories)) {
            JsonArray asJsonArray = asJsonObject.getAsJsonArray(StringSet.emoji_categories);
            for (int i = 0; i < asJsonArray.size(); i++) {
                if (asJsonArray.get(i) != null) {
                    this.emojiCategories.add(new EmojiCategory(asJsonArray.get(i).getAsJsonObject()));
                }
            }
        }
    }

    JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(StringSet.emoji_hash, this.emojiHash);
        synchronized (this.emojiCategories) {
            if (this.emojiCategories.size() > 0) {
                JsonArray jsonArray = new JsonArray();
                for (EmojiCategory emojiCategory : this.emojiCategories) {
                    if (emojiCategory != null) {
                        jsonArray.add(emojiCategory.toJson());
                    }
                }
                jsonObject.add(StringSet.emoji_categories, jsonArray);
            }
        }
        return jsonObject;
    }

    public static EmojiContainer buildFromSerializedData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ (i & 255));
        }
        try {
            return new EmojiContainer(new JsonParser().parse(new String(Base64.decode(bArr2, 0), "UTF-8")));
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

    public String getEmojiHash() {
        return this.emojiHash;
    }

    public List<EmojiCategory> getEmojiCategories() {
        return Collections.unmodifiableList(this.emojiCategories);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return getEmojiHash().equals(((EmojiContainer) obj).getEmojiHash());
    }

    public int hashCode() {
        return HashUtils.generateHashCode(getEmojiHash());
    }

    public String toString() {
        return "EmojiContainer{emojiHash='" + this.emojiHash + "', emojiCategories=" + this.emojiCategories + '}';
    }
}
