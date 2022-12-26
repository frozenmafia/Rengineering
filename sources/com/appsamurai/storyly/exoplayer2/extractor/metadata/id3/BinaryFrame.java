package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new Parcelable.Creator<BinaryFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.BinaryFrame.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    };
    public final byte[] values;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.values = bArr;
    }

    BinaryFrame(Parcel parcel) {
        super((String) getElevationDegrees.ah$a(parcel.readString()));
        this.values = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.HaptikSDK$b.equals(binaryFrame.HaptikSDK$b) && Arrays.equals(this.values, binaryFrame.values);
    }

    public int hashCode() {
        return ((this.HaptikSDK$b.hashCode() + BR.userTeamVM) * 31) + Arrays.hashCode(this.values);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeByteArray(this.values);
    }
}
