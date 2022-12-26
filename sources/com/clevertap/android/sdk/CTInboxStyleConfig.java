package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class CTInboxStyleConfig implements Parcelable {
    public static final Parcelable.Creator<CTInboxStyleConfig> CREATOR = new Parcelable.Creator<CTInboxStyleConfig>() { // from class: com.clevertap.android.sdk.CTInboxStyleConfig.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public CTInboxStyleConfig createFromParcel(Parcel parcel) {
            return new CTInboxStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public CTInboxStyleConfig[] newArray(int i) {
            return new CTInboxStyleConfig[i];
        }
    };
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private String HaptikSDK$c;
    private String HaptikSDK$d;
    private String[] HaptikSDK$e;
    private String HaptikWebView;
    private String ag$a;
    private String ah$a;
    private String ah$b;
    private String invoke;
    private String toString;
    private String valueOf;
    private String values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CTInboxStyleConfig() {
        this.valueOf = "#FFFFFF";
        this.values = "App Inbox";
        this.invoke = "#333333";
        this.toString = "#D3D4DA";
        this.ag$a = "#333333";
        this.HaptikSDK$c = "#1C84FE";
        this.HaptikSDK$d = "#808080";
        this.HaptikSDK$a = "#1C84FE";
        this.HaptikWebView = "#FFFFFF";
        this.HaptikSDK$e = new String[0];
        this.HaptikSDK$b = "No Message(s) to show";
        this.ah$b = "#000000";
        this.ah$a = "ALL";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CTInboxStyleConfig(CTInboxStyleConfig cTInboxStyleConfig) {
        this.valueOf = cTInboxStyleConfig.valueOf;
        this.values = cTInboxStyleConfig.values;
        this.invoke = cTInboxStyleConfig.invoke;
        this.toString = cTInboxStyleConfig.toString;
        this.ag$a = cTInboxStyleConfig.ag$a;
        this.HaptikSDK$c = cTInboxStyleConfig.HaptikSDK$c;
        this.HaptikSDK$d = cTInboxStyleConfig.HaptikSDK$d;
        this.HaptikSDK$a = cTInboxStyleConfig.HaptikSDK$a;
        this.HaptikWebView = cTInboxStyleConfig.HaptikWebView;
        String[] strArr = cTInboxStyleConfig.HaptikSDK$e;
        this.HaptikSDK$e = strArr == null ? new String[0] : (String[]) Arrays.copyOf(strArr, strArr.length);
        this.HaptikSDK$b = cTInboxStyleConfig.HaptikSDK$b;
        this.ah$b = cTInboxStyleConfig.ah$b;
        this.ah$a = cTInboxStyleConfig.ah$a;
    }

    protected CTInboxStyleConfig(Parcel parcel) {
        this.valueOf = parcel.readString();
        this.values = parcel.readString();
        this.invoke = parcel.readString();
        this.toString = parcel.readString();
        this.HaptikSDK$e = parcel.createStringArray();
        this.ag$a = parcel.readString();
        this.HaptikSDK$c = parcel.readString();
        this.HaptikSDK$d = parcel.readString();
        this.HaptikSDK$a = parcel.readString();
        this.HaptikWebView = parcel.readString();
        this.HaptikSDK$b = parcel.readString();
        this.ah$b = parcel.readString();
        this.ah$a = parcel.readString();
    }

    public String ag$a() {
        return this.ag$a;
    }

    public void values(String str) {
        this.ag$a = str;
    }

    public String ah$a() {
        return this.ah$a;
    }

    public String values() {
        return this.toString;
    }

    public void toString(String str) {
        this.toString = str;
    }

    public String valueOf() {
        return this.valueOf;
    }

    public void valueOf(String str) {
        this.valueOf = str;
    }

    public String HaptikSDK$a() {
        return this.values;
    }

    public void ag$a(String str) {
        this.values = str;
    }

    public String HaptikSDK$b() {
        return this.invoke;
    }

    public void ah$a(String str) {
        this.invoke = str;
    }

    public String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public void ah$b(String str) {
        this.HaptikSDK$b = str;
    }

    public String invoke() {
        return this.ah$b;
    }

    public void HaptikSDK$a(String str) {
        this.ah$b = str;
    }

    public String ah$b() {
        return this.HaptikSDK$c;
    }

    public void HaptikSDK$c(String str) {
        this.HaptikSDK$c = str;
    }

    public String getSignupData() {
        return this.HaptikSDK$a;
    }

    public void HaptikSDK$b(String str) {
        this.HaptikSDK$a = str;
    }

    public String HaptikSDK$d() {
        return this.HaptikWebView;
    }

    public void invoke(String str) {
        this.HaptikWebView = str;
    }

    public ArrayList<String> getInitSettings() {
        return this.HaptikSDK$e == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(this.HaptikSDK$e));
    }

    public void values(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        if (arrayList.size() > 2) {
            arrayList = new ArrayList<>(arrayList.subList(0, 2));
        }
        this.HaptikSDK$e = (String[]) arrayList.toArray(new String[0]);
    }

    public String HaptikWebView() {
        return this.HaptikSDK$d;
    }

    public void HaptikWebView(String str) {
        this.HaptikSDK$d = str;
    }

    public boolean HaptikSDK$e() {
        String[] strArr = this.HaptikSDK$e;
        return strArr != null && strArr.length > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueOf);
        parcel.writeString(this.values);
        parcel.writeString(this.invoke);
        parcel.writeString(this.toString);
        parcel.writeStringArray(this.HaptikSDK$e);
        parcel.writeString(this.ag$a);
        parcel.writeString(this.HaptikSDK$c);
        parcel.writeString(this.HaptikSDK$d);
        parcel.writeString(this.HaptikSDK$a);
        parcel.writeString(this.HaptikWebView);
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.ah$b);
        parcel.writeString(this.ah$a);
    }
}
