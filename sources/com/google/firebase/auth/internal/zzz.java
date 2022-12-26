package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.FirebaseUserMetadata;
import o.scrollToPositionWithOffset;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new scrollToPositionWithOffset();
    private final long toString;
    private final long valueOf;

    public zzz(long j, long j2) {
        this.toString = j;
        this.valueOf = j2;
    }

    public final JSONObject ah$a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.toString);
            jSONObject.put("creationTimestamp", this.valueOf);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.toString);
        SafeParcelWriter.writeLong(parcel, 2, this.valueOf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
