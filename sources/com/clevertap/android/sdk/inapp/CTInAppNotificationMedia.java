package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.sendbird.android.constant.StringSet;
import java.util.UUID;
import o.setBoundsInScreen;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class CTInAppNotificationMedia implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotificationMedia> CREATOR = new Parcelable.Creator<CTInAppNotificationMedia>() { // from class: com.clevertap.android.sdk.inapp.CTInAppNotificationMedia.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public CTInAppNotificationMedia createFromParcel(Parcel parcel) {
            return new CTInAppNotificationMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public CTInAppNotificationMedia[] newArray(int i) {
            return new CTInAppNotificationMedia[i];
        }
    };
    int ag$a;
    private String ah$a;
    private String toString;
    private String values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CTInAppNotificationMedia() {
    }

    private CTInAppNotificationMedia(Parcel parcel) {
        this.toString = parcel.readString();
        this.values = parcel.readString();
        this.ah$a = parcel.readString();
        this.ag$a = parcel.readInt();
    }

    public int valueOf() {
        return this.ag$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.toString);
        parcel.writeString(this.values);
        parcel.writeString(this.ah$a);
        parcel.writeInt(this.ag$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ah$a() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String values() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ag$a() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(String str) {
        this.toString = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CTInAppNotificationMedia ag$a(JSONObject jSONObject, int i) {
        this.ag$a = i;
        try {
            this.values = jSONObject.has("content_type") ? jSONObject.getString("content_type") : "";
            String string = jSONObject.has("url") ? jSONObject.getString("url") : "";
            if (!string.isEmpty()) {
                if (this.values.startsWith("image")) {
                    this.toString = string;
                    if (jSONObject.has(StringSet.key)) {
                        this.ah$a = UUID.randomUUID().toString() + jSONObject.getString(StringSet.key);
                    } else {
                        this.ah$a = UUID.randomUUID().toString();
                    }
                } else {
                    this.toString = string;
                }
            }
        } catch (JSONException e) {
            setBoundsInScreen.values("Error parsing Media JSONObject - " + e.getLocalizedMessage());
        }
        if (this.values.isEmpty()) {
            return null;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean HaptikSDK$a() {
        String values = values();
        return (values == null || this.toString == null || !values.startsWith("audio")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$b() {
        String values = values();
        return (values == null || this.toString == null || !values.equals("image/gif")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean HaptikSDK$c() {
        String values = values();
        return (values == null || this.toString == null || !values.startsWith("image") || values.equals("image/gif")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean HaptikSDK$b() {
        String values = values();
        return (values == null || this.toString == null || !values.startsWith("video")) ? false : true;
    }
}
