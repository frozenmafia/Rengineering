package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.findSnapView;
/* loaded from: classes7.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new findSnapView();
    private String HaptikSDK$a;
    private int HaptikSDK$b;
    private String HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final boolean ah$b;
    private final String invoke;
    private final String toString;
    private final String valueOf;
    private final boolean values;

    public String HaptikSDK$a() {
        return this.valueOf;
    }

    public final int HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final String HaptikSDK$c() {
        return this.toString;
    }

    public final String HaptikSDK$d() {
        return this.HaptikSDK$a;
    }

    public final void ag$a(int i) {
        this.HaptikSDK$b = i;
    }

    public boolean ag$a() {
        return this.values;
    }

    public String ah$a() {
        return this.ag$a;
    }

    public final String ah$b() {
        return this.HaptikSDK$c;
    }

    public String invoke() {
        return this.ah$a;
    }

    public String valueOf() {
        return this.invoke;
    }

    public boolean values() {
        return this.ah$b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, HaptikSDK$a(), false);
        SafeParcelWriter.writeString(parcel, 2, invoke(), false);
        SafeParcelWriter.writeString(parcel, 3, this.toString, false);
        SafeParcelWriter.writeString(parcel, 4, ah$a(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, ag$a());
        SafeParcelWriter.writeString(parcel, 6, valueOf(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, values());
        SafeParcelWriter.writeString(parcel, 8, this.HaptikSDK$a, false);
        SafeParcelWriter.writeInt(parcel, 9, this.HaptikSDK$b);
        SafeParcelWriter.writeString(parcel, 10, this.HaptikSDK$c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7) {
        this.valueOf = str;
        this.ah$a = str2;
        this.toString = str3;
        this.ag$a = str4;
        this.values = z;
        this.invoke = str5;
        this.ah$b = z2;
        this.HaptikSDK$a = str6;
        this.HaptikSDK$b = i;
        this.HaptikSDK$c = str7;
    }
}
