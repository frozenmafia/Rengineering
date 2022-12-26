package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new Parcelable.Creator<MlltFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.MlltFrame.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    };
    public final int ag$a;
    public final int[] ah$a;
    public final int[] toString;
    public final int valueOf;
    public final int values;

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(com.google.android.exoplayer2.metadata.id3.MlltFrame.ID);
        this.ag$a = i;
        this.values = i2;
        this.valueOf = i3;
        this.ah$a = iArr;
        this.toString = iArr2;
    }

    MlltFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.MlltFrame.ID);
        this.ag$a = parcel.readInt();
        this.values = parcel.readInt();
        this.valueOf = parcel.readInt();
        this.ah$a = (int[]) getElevationDegrees.ah$a(parcel.createIntArray());
        this.toString = (int[]) getElevationDegrees.ah$a(parcel.createIntArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.ag$a == mlltFrame.ag$a && this.values == mlltFrame.values && this.valueOf == mlltFrame.valueOf && Arrays.equals(this.ah$a, mlltFrame.ah$a) && Arrays.equals(this.toString, mlltFrame.toString);
    }

    public int hashCode() {
        int i = this.ag$a;
        int i2 = this.values;
        int i3 = this.valueOf;
        return ((((((((i + BR.userTeamVM) * 31) + i2) * 31) + i3) * 31) + Arrays.hashCode(this.ah$a)) * 31) + Arrays.hashCode(this.toString);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ag$a);
        parcel.writeInt(this.values);
        parcel.writeInt(this.valueOf);
        parcel.writeIntArray(this.ah$a);
        parcel.writeIntArray(this.toString);
    }
}
