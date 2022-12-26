package com.sendbird.android;

import android.util.Base64;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import com.sendbird.android.shadow.com.google.gson.JsonParser;
import java.io.UnsupportedEncodingException;
/* loaded from: classes7.dex */
public class Emoji {
    private final String key;
    private final String url;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Emoji(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.key = asJsonObject.has(StringSet.key) ? asJsonObject.get(StringSet.key).getAsString() : "";
        this.url = asJsonObject.has("url") ? asJsonObject.get("url").getAsString() : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(StringSet.key, this.key);
        jsonObject.addProperty("url", this.url);
        return jsonObject;
    }

    public static Emoji buildFromSerializedData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ (i & 255));
        }
        try {
            return new Emoji(new JsonParser().parse(new String(Base64.decode(bArr2, 0), "UTF-8")));
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

    public String getUrl() {
        return this.url;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return getKey().equals(((Emoji) obj).getKey());
    }

    public int hashCode() {
        return HashUtils.generateHashCode(getKey());
    }

    public String toString() {
        return "Emoji{, key='" + this.key + "', url='" + this.url + "'}";
    }
}
