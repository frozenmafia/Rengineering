package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.GithubAuthCredential;
/* loaded from: classes7.dex */
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new Parcelable.Creator<GithubAuthCredential>() { // from class: o.MessageThreadUtil.1.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GithubAuthCredential createFromParcel(Parcel parcel) {
            int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
            String str = null;
            while (parcel.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel);
                if (SafeParcelReader.getFieldId(readHeader) == 1) {
                    str = SafeParcelReader.createString(parcel, readHeader);
                } else {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                }
            }
            SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
            return new GithubAuthCredential(str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GithubAuthCredential[] newArray(int i) {
            return new GithubAuthCredential[i];
        }
    };
    private String toString;

    public GithubAuthCredential(String str) {
        this.toString = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String ag$a() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return new GithubAuthCredential(this.toString);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.toString, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
