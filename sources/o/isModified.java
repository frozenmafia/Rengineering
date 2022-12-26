package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
public final class isModified {
    static {
        isModified.class.getClassLoader();
    }

    private isModified() {
    }

    public static void ag$a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void ah$a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    public static <T extends Parcelable> T toString(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
