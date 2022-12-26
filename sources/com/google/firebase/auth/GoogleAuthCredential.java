package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.distanceToCenter;
/* loaded from: classes7.dex */
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new distanceToCenter();
    private final String ah$a;
    private final String values;

    public GoogleAuthCredential(String str, String str2) {
        if (str != null || str2 != null) {
            if (str == null || str.length() != 0) {
                if (str2 != null && str2.length() == 0) {
                    throw new IllegalArgumentException("accessToken cannot be empty");
                }
                this.values = str;
                this.ah$a = str2;
                return;
            }
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String ag$a() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return new GoogleAuthCredential(this.values, this.ah$a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.values, false);
        SafeParcelWriter.writeString(parcel, 2, this.ah$a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
