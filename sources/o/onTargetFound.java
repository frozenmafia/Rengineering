package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.internal.zzp;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.zze;
/* loaded from: classes5.dex */
public final class onTargetFound implements Parcelable.Creator<zzr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzx zzxVar = null;
        zzp zzpVar = null;
        zze zzeVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                zzxVar = (zzx) SafeParcelReader.createParcelable(parcel, readHeader, zzx.CREATOR);
            } else if (fieldId == 2) {
                zzpVar = (zzp) SafeParcelReader.createParcelable(parcel, readHeader, zzp.CREATOR);
            } else if (fieldId == 3) {
                zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzr(zzxVar, zzpVar, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzr[] newArray(int i) {
        return new zzr[i];
    }
}
