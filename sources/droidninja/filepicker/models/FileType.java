package droidninja.filepicker.models;

import android.os.Parcel;
import android.os.Parcelable;
import o.MasterKey;
/* loaded from: classes5.dex */
public class FileType implements Parcelable {
    public static final Parcelable.Creator<FileType> CREATOR = new Parcelable.Creator<FileType>() { // from class: droidninja.filepicker.models.FileType.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public FileType createFromParcel(Parcel parcel) {
            return new FileType(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public FileType[] newArray(int i) {
            return new FileType[i];
        }
    };
    public String ag$a;
    public String[] toString;
    public int values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FileType(String str, String[] strArr, int i) {
        this.ag$a = str;
        this.toString = strArr;
        this.values = i;
    }

    protected FileType(Parcel parcel) {
        this.ag$a = parcel.readString();
        this.values = parcel.readInt();
        this.toString = parcel.createStringArray();
    }

    public int valueOf() {
        int i = this.values;
        return i == 0 ? MasterKey.AnonymousClass1.toString.ic_search : i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ag$a);
        parcel.writeInt(this.values);
        parcel.writeStringArray(this.toString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.ag$a;
        String str2 = ((FileType) obj).ag$a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.ag$a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
