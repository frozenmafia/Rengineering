package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzbb;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public final class assignPositionFromScrapList implements Parcelable.Creator<zzbb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbb createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) == 1) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, PhoneMultiFactorInfo.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbb(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbb[] newArray(int i) {
        return new zzbb[i];
    }
}
