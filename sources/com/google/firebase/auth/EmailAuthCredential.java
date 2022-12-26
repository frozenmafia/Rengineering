package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.getMainThreadProxy;
/* loaded from: classes7.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new getMainThreadProxy();
    private boolean ag$a;
    private String ah$a;
    private final String toString;
    private String valueOf;
    private String values;

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z) {
        this.values = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.ah$a = str2;
        this.toString = str3;
        this.valueOf = str4;
        this.ag$a = z;
    }

    public final boolean HaptikSDK$a() {
        return !TextUtils.isEmpty(this.toString);
    }

    public final String HaptikSDK$b() {
        return this.values;
    }

    public final String HaptikSDK$c() {
        return this.toString;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String ag$a() {
        return HintConstants.AUTOFILL_HINT_PASSWORD;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return new EmailAuthCredential(this.values, this.ah$a, this.toString, this.valueOf, this.ag$a);
    }

    public final boolean ah$b() {
        return this.ag$a;
    }

    public final String invoke() {
        return this.ah$a;
    }

    public String valueOf() {
        return !TextUtils.isEmpty(this.ah$a) ? HintConstants.AUTOFILL_HINT_PASSWORD : "emailLink";
    }

    public final EmailAuthCredential values(FirebaseUser firebaseUser) {
        this.valueOf = firebaseUser.invoke();
        this.ag$a = true;
        return this;
    }

    public final String values() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.values, false);
        SafeParcelWriter.writeString(parcel, 2, this.ah$a, false);
        SafeParcelWriter.writeString(parcel, 3, this.toString, false);
        SafeParcelWriter.writeString(parcel, 4, this.valueOf, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.ag$a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
