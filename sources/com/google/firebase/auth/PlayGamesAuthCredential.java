package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p003firebaseauthapi.zzxq;
import o.ListAdapter;
/* loaded from: classes7.dex */
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new ListAdapter();
    private final String values;

    public PlayGamesAuthCredential(String str) {
        this.values = Preconditions.checkNotEmpty(str);
    }

    public static zzxq values(PlayGamesAuthCredential playGamesAuthCredential, String str) {
        Preconditions.checkNotNull(playGamesAuthCredential);
        return new zzxq(null, null, playGamesAuthCredential.ag$a(), null, null, playGamesAuthCredential.values, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String ag$a() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential ah$a() {
        return new PlayGamesAuthCredential(this.values);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.values, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
