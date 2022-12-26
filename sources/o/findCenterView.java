package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p003firebaseauthapi.zzwq;
import com.google.firebase.auth.internal.zzbb;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public final class findCenterView implements Parcelable.Creator<zzx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzx createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzwq zzwqVar = null;
        zzt zztVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzz zzzVar = null;
        zze zzeVar = null;
        zzbb zzbbVar = null;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzwqVar = (zzwq) SafeParcelReader.createParcelable(parcel, readHeader, zzwq.CREATOR);
                    break;
                case 2:
                    zztVar = (zzt) SafeParcelReader.createParcelable(parcel, readHeader, zzt.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzt.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 9:
                    zzzVar = (zzz) SafeParcelReader.createParcelable(parcel, readHeader, zzz.CREATOR);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
                    break;
                case 12:
                    zzbbVar = (zzbb) SafeParcelReader.createParcelable(parcel, readHeader, zzbb.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzx(zzwqVar, zztVar, str, str2, arrayList, arrayList2, str3, bool, zzzVar, z, zzeVar, zzbbVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzx[] newArray(int i) {
        return new zzx[i];
    }
}
