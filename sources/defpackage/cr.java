package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.dreampay.commons.constants.Constants;
import java.security.InvalidParameterException;
import o.MediaControllerCompat;
import o.putEncryptedObject;
/* renamed from: cr  reason: default package */
/* loaded from: classes5.dex */
public final class cr implements Parcelable {
    private static final String toString = "cr";
    private final int[] ah$a;
    public static final cr ag$a = new cr("0.0.0");
    public static final Parcelable.Creator<cr> CREATOR = new Parcelable.Creator<cr>() { // from class: cr.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public cr[] newArray(int i) {
            return new cr[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public cr createFromParcel(Parcel parcel) {
            return new cr(parcel);
        }
    };

    public cr(Parcel parcel) {
        int[] iArr = new int[parcel.readInt()];
        this.ah$a = iArr;
        parcel.readIntArray(iArr);
        String str = toString;
        putEncryptedObject.valueOf(str, "MAPVersion Created from PARCEL: " + toString());
    }

    public cr(String str) {
        putEncryptedObject.valueOf(toString, "MAPVersion from String : " + str);
        if (str == null) {
            throw new InvalidParameterException("version must not be null");
        }
        String[] split = TextUtils.split(str, "\\.");
        this.ah$a = new int[split.length];
        int i = 0;
        for (String str2 : split) {
            try {
                this.ah$a[i] = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.ah$a[i] = 0;
            }
            i++;
        }
    }

    public int ag$a(cr crVar) {
        try {
            int[] values = crVar.values();
            int min = Math.min(this.ah$a.length, crVar.values().length);
            int i = 0;
            while (i < min - 1 && this.ah$a[i] == values[i]) {
                i++;
            }
            Integer valueOf = Integer.valueOf(this.ah$a[i]);
            Integer valueOf2 = Integer.valueOf(values[i]);
            int[] iArr = this.ah$a;
            if (i == iArr.length && iArr.length == crVar.values().length) {
                return 0;
            }
            return (values.length == this.ah$a.length || !valueOf.equals(valueOf2)) ? valueOf.compareTo(valueOf2) : Integer.valueOf(this.ah$a.length).compareTo(Integer.valueOf(values.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("1=" + toString() + " vs 2=" + crVar.toString() + Constants.WHITE_SPACE + e.getMessage());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return MediaControllerCompat.Callback.MediaControllerCallbackApi21.ah$a(this.ah$a);
    }

    public int[] values() {
        return this.ah$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = toString;
        putEncryptedObject.valueOf(str, "MAPVersion writing " + this.ah$a.length + " ints to parcel");
        parcel.writeInt(this.ah$a.length);
        parcel.writeIntArray(this.ah$a);
    }
}
