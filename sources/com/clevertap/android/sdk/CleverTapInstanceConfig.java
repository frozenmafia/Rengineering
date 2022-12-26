package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapAPI;
import java.util.ArrayList;
import java.util.Arrays;
import o.commitContent;
import o.isPassword;
import o.setBoundsInScreen;
import o.setCollectionInfo;
import o.setItemCount;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class CleverTapInstanceConfig implements Parcelable {
    public static final Parcelable.Creator<CleverTapInstanceConfig> CREATOR = new Parcelable.Creator<CleverTapInstanceConfig>() { // from class: com.clevertap.android.sdk.CleverTapInstanceConfig.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public CleverTapInstanceConfig createFromParcel(Parcel parcel) {
            return new CleverTapInstanceConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public CleverTapInstanceConfig[] newArray(int i) {
            return new CleverTapInstanceConfig[i];
        }
    };
    private boolean HaptikSDK$a;
    private boolean HaptikSDK$b;
    private boolean HaptikSDK$c;
    private setBoundsInScreen HaptikSDK$d;
    private String HaptikSDK$e;
    private boolean HaptikWebView;
    private boolean a;
    private String ag$a;
    private boolean ah$a;
    private int ah$b;
    private boolean aj$a;
    private String[] getInitSettings;
    private boolean getSignupData;
    private boolean invoke;
    private boolean isLogoutPending;
    private String onXdkEvent;
    private String toString;
    private String valueOf;
    private ArrayList<String> values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CleverTapInstanceConfig(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.values = setItemCount.valueOf();
        this.getInitSettings = isPassword.ah$a;
        this.ag$a = cleverTapInstanceConfig.ag$a;
        this.toString = cleverTapInstanceConfig.toString;
        this.valueOf = cleverTapInstanceConfig.valueOf;
        this.getSignupData = cleverTapInstanceConfig.getSignupData;
        this.ah$a = cleverTapInstanceConfig.ah$a;
        this.aj$a = cleverTapInstanceConfig.aj$a;
        this.ah$b = cleverTapInstanceConfig.ah$b;
        this.HaptikSDK$d = cleverTapInstanceConfig.HaptikSDK$d;
        this.a = cleverTapInstanceConfig.a;
        this.HaptikSDK$b = cleverTapInstanceConfig.HaptikSDK$b;
        this.HaptikSDK$a = cleverTapInstanceConfig.HaptikSDK$a;
        this.isLogoutPending = cleverTapInstanceConfig.isLogoutPending;
        this.invoke = cleverTapInstanceConfig.invoke;
        this.HaptikWebView = cleverTapInstanceConfig.HaptikWebView;
        this.HaptikSDK$e = cleverTapInstanceConfig.HaptikSDK$e;
        this.onXdkEvent = cleverTapInstanceConfig.onXdkEvent;
        this.HaptikSDK$c = cleverTapInstanceConfig.HaptikSDK$c;
        this.values = cleverTapInstanceConfig.values;
        this.getInitSettings = cleverTapInstanceConfig.getInitSettings;
    }

    private CleverTapInstanceConfig(Context context, String str, String str2, String str3, boolean z) {
        this.values = setItemCount.valueOf();
        this.getInitSettings = isPassword.ah$a;
        this.ag$a = str;
        this.toString = str2;
        this.valueOf = str3;
        this.getSignupData = z;
        this.ah$a = false;
        this.aj$a = true;
        int intValue = CleverTapAPI.LogLevel.INFO.intValue();
        this.ah$b = intValue;
        this.HaptikSDK$d = new setBoundsInScreen(intValue);
        this.HaptikSDK$a = false;
        setCollectionInfo ag$a = setCollectionInfo.ag$a(context);
        this.a = ag$a.isLogoutPending();
        this.HaptikSDK$b = ag$a.getSignupData();
        this.isLogoutPending = ag$a.getInitSettings();
        this.invoke = ag$a.HaptikSDK$d();
        this.HaptikSDK$e = ag$a.HaptikSDK$a();
        this.onXdkEvent = ag$a.HaptikSDK$b();
        this.HaptikWebView = ag$a.HaptikSDK$e();
        this.HaptikSDK$c = ag$a.ag$a();
        if (this.getSignupData) {
            this.getInitSettings = ag$a.HaptikWebView();
            valueOf("ON_USER_LOGIN", "Setting Profile Keys from Manifest: " + Arrays.toString(this.getInitSettings));
        }
    }

    private CleverTapInstanceConfig(String str) throws Throwable {
        this.values = setItemCount.valueOf();
        this.getInitSettings = isPassword.ah$a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("accountId")) {
                this.ag$a = jSONObject.getString("accountId");
            }
            if (jSONObject.has("accountToken")) {
                this.toString = jSONObject.getString("accountToken");
            }
            if (jSONObject.has("accountRegion")) {
                this.valueOf = jSONObject.getString("accountRegion");
            }
            if (jSONObject.has("analyticsOnly")) {
                this.ah$a = jSONObject.getBoolean("analyticsOnly");
            }
            if (jSONObject.has("isDefaultInstance")) {
                this.getSignupData = jSONObject.getBoolean("isDefaultInstance");
            }
            if (jSONObject.has("useGoogleAdId")) {
                this.a = jSONObject.getBoolean("useGoogleAdId");
            }
            if (jSONObject.has("disableAppLaunchedEvent")) {
                this.HaptikSDK$b = jSONObject.getBoolean("disableAppLaunchedEvent");
            }
            if (jSONObject.has("personalization")) {
                this.aj$a = jSONObject.getBoolean("personalization");
            }
            if (jSONObject.has("debugLevel")) {
                this.ah$b = jSONObject.getInt("debugLevel");
            }
            this.HaptikSDK$d = new setBoundsInScreen(this.ah$b);
            if (jSONObject.has("packageName")) {
                this.onXdkEvent = jSONObject.getString("packageName");
            }
            if (jSONObject.has("createdPostAppLaunch")) {
                this.HaptikSDK$a = jSONObject.getBoolean("createdPostAppLaunch");
            }
            if (jSONObject.has("sslPinning")) {
                this.isLogoutPending = jSONObject.getBoolean("sslPinning");
            }
            if (jSONObject.has("backgroundSync")) {
                this.invoke = jSONObject.getBoolean("backgroundSync");
            }
            if (jSONObject.has("getEnableCustomCleverTapId")) {
                this.HaptikWebView = jSONObject.getBoolean("getEnableCustomCleverTapId");
            }
            if (jSONObject.has("fcmSenderId")) {
                this.HaptikSDK$e = jSONObject.getString("fcmSenderId");
            }
            if (jSONObject.has("beta")) {
                this.HaptikSDK$c = jSONObject.getBoolean("beta");
            }
            if (jSONObject.has("allowedPushTypes")) {
                this.values = commitContent.valueOf(jSONObject.getJSONArray("allowedPushTypes"));
            }
            if (jSONObject.has("identityTypes")) {
                this.getInitSettings = (String[]) commitContent.toString(jSONObject.getJSONArray("identityTypes"));
            }
        } catch (Throwable th) {
            setBoundsInScreen.valueOf("Error constructing CleverTapInstanceConfig from JSON: " + str + ": ", th.getCause());
            throw th;
        }
    }

    private CleverTapInstanceConfig(Parcel parcel) {
        this.values = setItemCount.valueOf();
        this.getInitSettings = isPassword.ah$a;
        this.ag$a = parcel.readString();
        this.toString = parcel.readString();
        this.valueOf = parcel.readString();
        this.ah$a = parcel.readByte() != 0;
        this.getSignupData = parcel.readByte() != 0;
        this.a = parcel.readByte() != 0;
        this.HaptikSDK$b = parcel.readByte() != 0;
        this.aj$a = parcel.readByte() != 0;
        this.ah$b = parcel.readInt();
        this.HaptikSDK$a = parcel.readByte() != 0;
        this.isLogoutPending = parcel.readByte() != 0;
        this.invoke = parcel.readByte() != 0;
        this.HaptikWebView = parcel.readByte() != 0;
        this.HaptikSDK$e = parcel.readString();
        this.onXdkEvent = parcel.readString();
        this.HaptikSDK$d = new setBoundsInScreen(this.ah$b);
        this.HaptikSDK$c = parcel.readByte() != 0;
        ArrayList<String> arrayList = new ArrayList<>();
        this.values = arrayList;
        parcel.readList(arrayList, String.class.getClassLoader());
        this.getInitSettings = parcel.createStringArray();
    }

    public void ag$a(boolean z) {
        this.aj$a = z;
    }

    public String valueOf() {
        return this.ag$a;
    }

    public String values() {
        return this.valueOf;
    }

    public String ag$a() {
        return this.toString;
    }

    public ArrayList<String> ah$a() {
        return this.values;
    }

    public int ah$b() {
        return this.ah$b;
    }

    public String HaptikSDK$a() {
        return this.HaptikSDK$e;
    }

    public setBoundsInScreen HaptikSDK$c() {
        if (this.HaptikSDK$d == null) {
            this.HaptikSDK$d = new setBoundsInScreen(this.ah$b);
        }
        return this.HaptikSDK$d;
    }

    public String getSignupData() {
        return this.onXdkEvent;
    }

    public String[] HaptikSDK$b() {
        return this.getInitSettings;
    }

    public boolean HaptikSDK$d() {
        return this.ah$a;
    }

    public boolean HaptikWebView() {
        return this.HaptikSDK$c;
    }

    public boolean a() {
        return this.getSignupData;
    }

    public void valueOf(String str, String str2) {
        this.HaptikSDK$d.ah$a(toString(str), str2);
    }

    public void toString(String str, String str2, Throwable th) {
        this.HaptikSDK$d.values(toString(str), str2, th);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ag$a);
        parcel.writeString(this.toString);
        parcel.writeString(this.valueOf);
        parcel.writeByte(this.ah$a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getSignupData ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.HaptikSDK$b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.aj$a ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.ah$b);
        parcel.writeByte(this.HaptikSDK$a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLogoutPending ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.invoke ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.HaptikWebView ? (byte) 1 : (byte) 0);
        parcel.writeString(this.HaptikSDK$e);
        parcel.writeString(this.onXdkEvent);
        parcel.writeByte(this.HaptikSDK$c ? (byte) 1 : (byte) 0);
        parcel.writeList(this.values);
        parcel.writeStringArray(this.getInitSettings);
    }

    public boolean invoke() {
        return this.HaptikWebView;
    }

    public boolean HaptikSDK$e() {
        return this.invoke;
    }

    public boolean getInitSettings() {
        return this.HaptikSDK$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onXdkEvent() {
        return this.HaptikSDK$b;
    }

    public boolean aj$a() {
        return this.aj$a;
    }

    public boolean ak() {
        return this.isLogoutPending;
    }

    public boolean isLogoutPending() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ak$b() {
        this.HaptikSDK$a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String extraCallback() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accountId", valueOf());
            jSONObject.put("accountToken", ag$a());
            jSONObject.put("accountRegion", values());
            jSONObject.put("fcmSenderId", HaptikSDK$a());
            jSONObject.put("analyticsOnly", HaptikSDK$d());
            jSONObject.put("isDefaultInstance", a());
            jSONObject.put("useGoogleAdId", isLogoutPending());
            jSONObject.put("disableAppLaunchedEvent", onXdkEvent());
            jSONObject.put("personalization", aj$a());
            jSONObject.put("debugLevel", ah$b());
            jSONObject.put("createdPostAppLaunch", getInitSettings());
            jSONObject.put("sslPinning", ak());
            jSONObject.put("backgroundSync", HaptikSDK$e());
            jSONObject.put("getEnableCustomCleverTapId", invoke());
            jSONObject.put("packageName", getSignupData());
            jSONObject.put("beta", HaptikWebView());
            jSONObject.put("allowedPushTypes", commitContent.valueOf(this.values));
            return jSONObject.toString();
        } catch (Throwable th) {
            setBoundsInScreen.valueOf("Unable to convert config to JSON : ", th.getCause());
            return null;
        }
    }

    private String toString(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = ":" + str;
        }
        sb.append(str2);
        sb.append(":");
        sb.append(this.ag$a);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static CleverTapInstanceConfig toString(Context context, String str, String str2, String str3) {
        return new CleverTapInstanceConfig(context, str, str2, str3, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static CleverTapInstanceConfig valueOf(String str) {
        try {
            return new CleverTapInstanceConfig(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
