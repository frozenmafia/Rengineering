package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwy  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzwy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwy> CREATOR = new zzwz();
    private final List<zzww> zza;

    public zzwy() {
        this.zza = new ArrayList();
    }

    public static zzwy zza(JSONArray jSONArray) throws JSONException {
        zzww zzwwVar;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzwy(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                zzwwVar = new zzww();
            } else {
                zzwwVar = new zzww(Strings.emptyToNull(jSONObject.optString("federatedId", null)), Strings.emptyToNull(jSONObject.optString("displayName", null)), Strings.emptyToNull(jSONObject.optString("photoUrl", null)), Strings.emptyToNull(jSONObject.optString("providerId", null)), null, Strings.emptyToNull(jSONObject.optString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, null)), Strings.emptyToNull(jSONObject.optString("email", null)));
            }
            arrayList.add(zzwwVar);
        }
        return new zzwy(arrayList);
    }

    public static zzwy zzb(zzwy zzwyVar) {
        List<zzww> list = zzwyVar.zza;
        zzwy zzwyVar2 = new zzwy();
        if (list != null) {
            zzwyVar2.zza.addAll(list);
        }
        return zzwyVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List<zzww> zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwy(List<zzww> list) {
        if (list == null || list.isEmpty()) {
            this.zza = Collections.emptyList();
        } else {
            this.zza = Collections.unmodifiableList(list);
        }
    }
}
