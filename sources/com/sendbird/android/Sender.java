package com.sendbird.android;

import android.util.Base64;
import com.sendbird.android.Member;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import com.sendbird.android.shadow.com.google.gson.JsonParser;
import java.io.UnsupportedEncodingException;
/* loaded from: classes5.dex */
public class Sender extends User {
    private boolean mIsBlockedByMe;
    private Member.Role role;

    /* JADX INFO: Access modifiers changed from: protected */
    public Sender(JsonElement jsonElement) {
        super(jsonElement);
        this.role = Member.Role.NONE;
        if (jsonElement.isJsonNull()) {
            return;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.mIsBlockedByMe = asJsonObject.has("is_blocked_by_me") && asJsonObject.get("is_blocked_by_me").getAsBoolean();
        if (asJsonObject.has(StringSet.role)) {
            this.role = Member.Role.fromValue(asJsonObject.get(StringSet.role).getAsString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.User
    public JsonElement toJson() {
        JsonObject asJsonObject = super.toJson().getAsJsonObject();
        asJsonObject.addProperty("is_blocked_by_me", Boolean.valueOf(this.mIsBlockedByMe));
        asJsonObject.addProperty(StringSet.role, this.role.getValue());
        return asJsonObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Sender toSender(User user, Member.Role role) {
        if (user == null) {
            return null;
        }
        JsonElement json = user.toJson();
        if (role != null && (json instanceof JsonObject)) {
            ((JsonObject) json).addProperty(StringSet.role, role.getValue());
        }
        return new Sender(json);
    }

    public boolean isBlockedByMe() {
        return this.mIsBlockedByMe;
    }

    public Member.Role getRole() {
        return this.role;
    }

    @Override // com.sendbird.android.User
    public String toString() {
        return super.toString() + "\nSender{mIsBlockedByMe=" + this.mIsBlockedByMe + "role=" + this.role + '}';
    }

    public static Sender buildFromSerializedData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ (i & 255));
        }
        try {
            return new Sender(new JsonParser().parse(new String(Base64.decode(bArr2, 0), "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sendbird.android.User
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
}
