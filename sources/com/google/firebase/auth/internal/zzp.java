package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;
import o.LinearLayoutManager;
import o.LinearSnapHelper;
/* loaded from: classes5.dex */
public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new LinearSnapHelper();
    private final boolean ag$a;
    private final String ah$a;
    private final Map<String, Object> toString;
    private final String valueOf;

    public zzp(String str, String str2, boolean z) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.ah$a = str;
        this.valueOf = str2;
        this.toString = LinearLayoutManager.LayoutChunkResult.values(str2);
        this.ag$a = z;
    }

    public zzp(boolean z) {
        this.ag$a = z;
        this.valueOf = null;
        this.ah$a = null;
        this.toString = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.ah$a, false);
        SafeParcelWriter.writeString(parcel, 2, this.valueOf, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.ag$a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
