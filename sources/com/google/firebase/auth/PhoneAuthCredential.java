package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.getHorizontalHelper;
/* loaded from: classes5.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new getHorizontalHelper();
    private String HaptikSDK$c;
    private boolean ag$a;
    private String ah$a;
    private String ah$b;
    private String toString;
    private String valueOf;
    private boolean values;

    public PhoneAuthCredential(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        Preconditions.checkArgument((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || (z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || !((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.toString = str;
        this.ah$a = str2;
        this.values = z;
        this.valueOf = str3;
        this.ag$a = z2;
        this.HaptikSDK$c = str4;
        this.ah$b = str5;
    }

    public static PhoneAuthCredential toString(String str, String str2) {
        return new PhoneAuthCredential(str, str2, false, null, true, null, null);
    }

    public static PhoneAuthCredential values(String str, String str2) {
        return new PhoneAuthCredential(null, null, false, str, true, str2, null);
    }

    public final String HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    public final boolean HaptikSDK$b() {
        return this.ag$a;
    }

    public final String HaptikSDK$c() {
        return this.valueOf;
    }

    public final PhoneAuthCredential ag$a(boolean z) {
        this.ag$a = false;
        return this;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String ag$a() {
        return HintConstants.AUTOFILL_HINT_PHONE;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return clone();
    }

    public final String invoke() {
        return this.toString;
    }

    /* renamed from: valueOf */
    public final PhoneAuthCredential clone() {
        return new PhoneAuthCredential(this.toString, values(), this.values, this.valueOf, this.ag$a, this.HaptikSDK$c, this.ah$b);
    }

    public String values() {
        return this.ah$a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.toString, false);
        SafeParcelWriter.writeString(parcel, 2, values(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.values);
        SafeParcelWriter.writeString(parcel, 4, this.valueOf, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.ag$a);
        SafeParcelWriter.writeString(parcel, 6, this.HaptikSDK$c, false);
        SafeParcelWriter.writeString(parcel, 7, this.ah$b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
