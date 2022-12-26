package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;
import o.assignPositionFromScrapList;
/* loaded from: classes5.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new assignPositionFromScrapList();
    private final List<PhoneMultiFactorInfo> values;

    public zzbb(List<PhoneMultiFactorInfo> list) {
        this.values = list == null ? new ArrayList<>() : list;
    }

    public final List<MultiFactorInfo> ag$a() {
        ArrayList arrayList = new ArrayList();
        for (PhoneMultiFactorInfo phoneMultiFactorInfo : this.values) {
            arrayList.add(phoneMultiFactorInfo);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.values, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
