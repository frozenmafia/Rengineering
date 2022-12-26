package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;
import o.setReverseLayout;
/* loaded from: classes5.dex */
public final class zzag extends MultiFactorSession {
    public static final Parcelable.Creator<zzag> CREATOR = new setReverseLayout();
    private String ah$a;
    private String valueOf;
    private List<PhoneMultiFactorInfo> values;

    private zzag() {
    }

    public static zzag toString(List<MultiFactorInfo> list, String str) {
        Preconditions.checkNotNull(list);
        Preconditions.checkNotEmpty(str);
        zzag zzagVar = new zzag();
        zzagVar.values = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : list) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzagVar.values.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        zzagVar.ah$a = str;
        return zzagVar;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final String values() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.valueOf, false);
        SafeParcelWriter.writeString(parcel, 2, this.ah$a, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.values, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzag(String str, String str2, List<PhoneMultiFactorInfo> list) {
        this.valueOf = str;
        this.ah$a = str2;
        this.values = list;
    }
}
