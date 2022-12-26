package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.calculateDistanceToFinalSnap;
/* loaded from: classes7.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new calculateDistanceToFinalSnap();
    private String ag$a;
    private String valueOf;

    public TwitterAuthCredential(String str, String str2) {
        this.valueOf = Preconditions.checkNotEmpty(str);
        this.ag$a = Preconditions.checkNotEmpty(str2);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String ag$a() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return new TwitterAuthCredential(this.valueOf, this.ag$a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.valueOf, false);
        SafeParcelWriter.writeString(parcel, 2, this.ag$a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
