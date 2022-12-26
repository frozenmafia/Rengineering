package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class CTInAppNotificationButton implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotificationButton> CREATOR = new Parcelable.Creator<CTInAppNotificationButton>() { // from class: com.clevertap.android.sdk.inapp.CTInAppNotificationButton.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public CTInAppNotificationButton createFromParcel(Parcel parcel) {
            return new CTInAppNotificationButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public CTInAppNotificationButton[] newArray(int i) {
            return new CTInAppNotificationButton[i];
        }
    };
    private String HaptikSDK$a;
    private JSONObject HaptikSDK$b;
    private String HaptikSDK$c;
    private String ag$a;
    private String ah$a;
    private HashMap<String, String> ah$b;
    private String getInitSettings;
    private boolean invoke;
    private String toString;
    private String valueOf;
    private String values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CTInAppNotificationButton() {
    }

    protected CTInAppNotificationButton(Parcel parcel) {
        this.HaptikSDK$c = parcel.readString();
        this.HaptikSDK$a = parcel.readString();
        this.values = parcel.readString();
        this.toString = parcel.readString();
        this.ah$a = parcel.readString();
        this.valueOf = parcel.readString();
        this.getInitSettings = parcel.readString();
        this.invoke = parcel.readByte() != 0;
        try {
            this.HaptikSDK$b = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.ag$a = parcel.readString();
        this.ah$b = parcel.readHashMap(null);
    }

    public HashMap<String, String> HaptikSDK$a() {
        return this.ah$b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$c);
        parcel.writeString(this.HaptikSDK$a);
        parcel.writeString(this.values);
        parcel.writeString(this.toString);
        parcel.writeString(this.ah$a);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.getInitSettings);
        parcel.writeByte(this.invoke ? (byte) 1 : (byte) 0);
        if (this.HaptikSDK$b == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.HaptikSDK$b.toString());
        }
        parcel.writeString(this.ag$a);
        parcel.writeMap(this.ah$b);
    }

    public String values() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ah$a() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ag$a() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String valueOf() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String invoke() {
        return this.ag$a;
    }

    public String HaptikSDK$c() {
        return this.HaptikSDK$c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ah$b() {
        return this.HaptikSDK$a;
    }

    public String HaptikSDK$b() {
        return this.getInitSettings;
    }

    public boolean HaptikWebView() {
        return this.invoke;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CTInAppNotificationButton ah$a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Iterator<String> keys;
        try {
            this.HaptikSDK$b = jSONObject;
            this.HaptikSDK$c = jSONObject.has("text") ? jSONObject.getString("text") : "";
            this.HaptikSDK$a = jSONObject.has("color") ? jSONObject.getString("color") : "#0000FF";
            this.values = jSONObject.has("bg") ? jSONObject.getString("bg") : "#FFFFFF";
            this.ah$a = jSONObject.has("border") ? jSONObject.getString("border") : "#FFFFFF";
            this.valueOf = jSONObject.has("radius") ? jSONObject.getString("radius") : "";
            JSONObject jSONObject3 = jSONObject.has("actions") ? jSONObject.getJSONObject("actions") : null;
            if (jSONObject3 != null) {
                String string = jSONObject3.has("android") ? jSONObject3.getString("android") : "";
                if (!string.isEmpty()) {
                    this.toString = string;
                }
                this.getInitSettings = jSONObject3.has("type") ? jSONObject3.getString("type") : "";
                this.invoke = jSONObject3.has("fbSettings") ? jSONObject3.getBoolean("fbSettings") : false;
            }
            if (values(jSONObject3) && (jSONObject2 = jSONObject3.getJSONObject("kv")) != null && (keys = jSONObject2.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string2 = jSONObject2.getString(next);
                    if (!TextUtils.isEmpty(next)) {
                        if (this.ah$b == null) {
                            this.ah$b = new HashMap<>();
                        }
                        this.ah$b.put(next, string2);
                    }
                }
            }
        } catch (JSONException unused) {
            this.ag$a = "Invalid JSON";
        }
        return this;
    }

    private boolean values(JSONObject jSONObject) throws JSONException {
        return jSONObject != null && jSONObject.has("type") && "kv".equalsIgnoreCase(jSONObject.getString("type")) && jSONObject.has("kv");
    }
}
