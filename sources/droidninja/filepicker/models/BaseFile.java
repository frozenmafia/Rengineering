package droidninja.filepicker.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class BaseFile implements Parcelable {
    public static final Parcelable.Creator<BaseFile> CREATOR = new Parcelable.Creator<BaseFile>() { // from class: droidninja.filepicker.models.BaseFile.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public BaseFile createFromParcel(Parcel parcel) {
            return new BaseFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public BaseFile[] newArray(int i) {
            return new BaseFile[i];
        }
    };
    protected String ag$a;
    protected int toString;
    protected String values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaseFile() {
    }

    public BaseFile(int i, String str, String str2) {
        this.toString = i;
        this.values = str;
        this.ag$a = str2;
    }

    protected BaseFile(Parcel parcel) {
        this.toString = parcel.readInt();
        this.values = parcel.readString();
        this.ag$a = parcel.readString();
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BaseFile) {
            BaseFile baseFile = (BaseFile) obj;
            String str2 = this.ag$a;
            return (str2 == null || (str = baseFile.ag$a) == null) ? this.toString == baseFile.toString : this.toString == baseFile.toString && str2.equals(str);
        }
        return false;
    }

    public String ag$a() {
        return this.ag$a;
    }

    public int valueOf() {
        return this.toString;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.toString);
        parcel.writeString(this.values);
        parcel.writeString(this.ag$a);
    }
}
