package o;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public final class inflateFromResource {
    private static final ClassLoader toString = inflateFromResource.class.getClassLoader();

    private inflateFromResource() {
    }

    public static Parcelable toString(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void values(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    public static void values(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
