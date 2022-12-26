package com.appsamurai.storyly.exoplayer2.common.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import o.createFromIcon;
import o.getElevationDegrees;
import o.getResId;
/* loaded from: classes3.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    };
    private final Entry[] valueOf;

    /* loaded from: classes3.dex */
    public interface Entry extends Parcelable {
        byte[] ah$a();

        createFromIcon valueOf();

        void valueOf(getResId.values valuesVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Metadata(Entry... entryArr) {
        this.valueOf = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this.valueOf = (Entry[]) list.toArray(new Entry[0]);
    }

    Metadata(Parcel parcel) {
        this.valueOf = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.valueOf;
            if (i >= entryArr.length) {
                return;
            }
            entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i++;
        }
    }

    public int values() {
        return this.valueOf.length;
    }

    public Entry valueOf(int i) {
        return this.valueOf[i];
    }

    public Metadata values(Metadata metadata) {
        return metadata == null ? this : ah$a(metadata.valueOf);
    }

    public Metadata ah$a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) getElevationDegrees.valueOf(this.valueOf, entryArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.valueOf, ((Metadata) obj).valueOf);
    }

    public int hashCode() {
        return Arrays.hashCode(this.valueOf);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.valueOf);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.valueOf.length);
        for (Entry entry : this.valueOf) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
