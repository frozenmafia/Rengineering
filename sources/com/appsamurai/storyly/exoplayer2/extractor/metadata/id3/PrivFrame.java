package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new Parcelable.Creator<PrivFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.PrivFrame.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    };
    public final byte[] ah$a;
    public final String values;

    public PrivFrame(String str, byte[] bArr) {
        super(com.google.android.exoplayer2.metadata.id3.PrivFrame.ID);
        this.values = str;
        this.ah$a = bArr;
    }

    PrivFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.PrivFrame.ID);
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ah$a = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return getElevationDegrees.values(this.values, privFrame.values) && Arrays.equals(this.ah$a, privFrame.ah$a);
    }

    public int hashCode() {
        String str = this.values;
        return (((str != null ? str.hashCode() : 0) + BR.userTeamVM) * 31) + Arrays.hashCode(this.ah$a);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.HaptikSDK$b + ": owner=" + this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.values);
        parcel.writeByteArray(this.ah$a);
    }
}
