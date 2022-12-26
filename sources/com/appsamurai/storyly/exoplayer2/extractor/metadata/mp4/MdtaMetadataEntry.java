package com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import java.util.Arrays;
import o.createFromIcon;
import o.getElevationDegrees;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new Parcelable.Creator<MdtaMetadataEntry>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4.MdtaMetadataEntry.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    };
    public final String ag$a;
    public final int toString;
    public final int valueOf;
    public final byte[] values;

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ byte[] ah$a() {
        return updateDstRect.toString(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ createFromIcon valueOf() {
        return updateDstRect.valueOf(this);
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ void valueOf(getResId.values valuesVar) {
        updateDstRect.valueOf(this, valuesVar);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.ag$a = str;
        this.values = bArr;
        this.toString = i;
        this.valueOf = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.ag$a = (String) getElevationDegrees.ah$a(parcel.readString());
        this.values = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
        this.toString = parcel.readInt();
        this.valueOf = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.ag$a.equals(mdtaMetadataEntry.ag$a) && Arrays.equals(this.values, mdtaMetadataEntry.values) && this.toString == mdtaMetadataEntry.toString && this.valueOf == mdtaMetadataEntry.valueOf;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        int hashCode2 = Arrays.hashCode(this.values);
        return ((((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + this.toString) * 31) + this.valueOf;
    }

    public String toString() {
        return "mdta: key=" + this.ag$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ag$a);
        parcel.writeByteArray(this.values);
        parcel.writeInt(this.toString);
        parcel.writeInt(this.valueOf);
    }
}
