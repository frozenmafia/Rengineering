package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzae;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public final class scrollBy implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        zzag zzagVar = null;
        String str = null;
        zze zzeVar = null;
        zzx zzxVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, PhoneMultiFactorInfo.CREATOR);
            } else if (fieldId == 2) {
                zzagVar = (zzag) SafeParcelReader.createParcelable(parcel, readHeader, zzag.CREATOR);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
            } else if (fieldId == 5) {
                zzxVar = (zzx) SafeParcelReader.createParcelable(parcel, readHeader, zzx.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzae(arrayList, zzagVar, str, zzeVar, zzxVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}
