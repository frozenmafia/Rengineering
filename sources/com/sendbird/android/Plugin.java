package com.sendbird.android;

import android.util.Base64;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import com.sendbird.android.shadow.com.google.gson.JsonParser;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public final class Plugin {
    private final Map<String, String> detail = new HashMap();
    private final String type;
    private final String vendor;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Plugin(JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.vendor = asJsonObject.has(StringSet.vendor) ? asJsonObject.get(StringSet.vendor).getAsString() : "";
        this.type = asJsonObject.has("type") ? asJsonObject.get("type").getAsString() : "";
        if (asJsonObject.has("detail")) {
            for (Map.Entry<String, JsonElement> entry : asJsonObject.get("detail").getAsJsonObject().entrySet()) {
                if (entry.getValue() != null && !entry.getValue().isJsonNull()) {
                    if (entry.getValue().isJsonPrimitive()) {
                        this.detail.put(entry.getKey(), entry.getValue().getAsString());
                    } else {
                        this.detail.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(StringSet.vendor, this.vendor);
        jsonObject.addProperty("type", this.type);
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry<String, String> entry : this.detail.entrySet()) {
            jsonObject2.addProperty(entry.getKey(), entry.getValue());
        }
        jsonObject.add("detail", jsonObject2);
        return jsonObject;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, String> getDetail() {
        return Collections.unmodifiableMap(this.detail);
    }

    public static Plugin buildFromSerializedData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ (i & 255));
        }
        try {
            return new Plugin(new JsonParser().parse(new String(Base64.decode(bArr2, 0), "UTF-8")));
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

    public String toString() {
        return "Plugin{vendor='" + this.vendor + "', type='" + this.type + "', detail=" + this.detail + '}';
    }
}
