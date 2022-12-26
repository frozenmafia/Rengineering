package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.TwitterAuthCredential;
/* loaded from: classes7.dex */
public final class calculateDistanceToFinalSnap implements Parcelable.Creator<TwitterAuthCredential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TwitterAuthCredential createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new TwitterAuthCredential(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TwitterAuthCredential[] newArray(int i) {
        return new TwitterAuthCredential[i];
    }
}
