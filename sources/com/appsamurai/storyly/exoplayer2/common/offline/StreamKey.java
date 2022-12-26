package com.appsamurai.storyly.exoplayer2.common.offline;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.appsamurai.storyly.exoplayer2.common.offline.StreamKey.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    };
    @Deprecated
    public final int ah$a;
    public final int toString;
    public final int valueOf;
    public final int values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    StreamKey(Parcel parcel) {
        this.valueOf = parcel.readInt();
        this.values = parcel.readInt();
        int readInt = parcel.readInt();
        this.toString = readInt;
        this.ah$a = readInt;
    }

    public String toString() {
        return this.valueOf + "." + this.values + "." + this.toString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.valueOf == streamKey.valueOf && this.values == streamKey.values && this.toString == streamKey.toString;
    }

    public int hashCode() {
        return (((this.valueOf * 31) + this.values) * 31) + this.toString;
    }

    @Override // java.lang.Comparable
    /* renamed from: values */
    public int compareTo(StreamKey streamKey) {
        int i = this.valueOf - streamKey.valueOf;
        if (i == 0) {
            int i2 = this.values - streamKey.values;
            return i2 == 0 ? this.toString - streamKey.toString : i2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.valueOf);
        parcel.writeInt(this.values);
        parcel.writeInt(this.toString);
    }
}
