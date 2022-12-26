package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p003firebaseauthapi.zzll;
import o.estimateNextPositionDiffForFling;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new estimateNextPositionDiffForFling();
    private final long ag$a;
    private final String ah$a;
    private final String valueOf;
    private final String values;

    public PhoneMultiFactorInfo(String str, String str2, long j, String str3) {
        this.valueOf = Preconditions.checkNotEmpty(str);
        this.values = str2;
        this.ag$a = j;
        this.ah$a = Preconditions.checkNotEmpty(str3);
    }

    public String HaptikSDK$a() {
        return this.valueOf;
    }

    public String ag$a() {
        return this.values;
    }

    public long ah$a() {
        return this.ag$a;
    }

    public String valueOf() {
        return this.ah$a;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public JSONObject values() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", HintConstants.AUTOFILL_HINT_PHONE);
            jSONObject.putOpt("uid", this.valueOf);
            jSONObject.putOpt("displayName", this.values);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.ag$a));
            jSONObject.putOpt(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.ah$a);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzll(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, HaptikSDK$a(), false);
        SafeParcelWriter.writeString(parcel, 2, ag$a(), false);
        SafeParcelWriter.writeLong(parcel, 3, ah$a());
        SafeParcelWriter.writeString(parcel, 4, valueOf(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
