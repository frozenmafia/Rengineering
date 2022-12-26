package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.getBackgroundProxy;
/* loaded from: classes7.dex */
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new getBackgroundProxy();
    private final String toString;

    public FacebookAuthCredential(String str) {
        this.toString = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String ag$a() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return new FacebookAuthCredential(this.toString);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.toString, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
