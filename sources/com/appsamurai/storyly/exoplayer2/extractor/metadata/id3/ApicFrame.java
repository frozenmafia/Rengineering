package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
import o.getElevationDegrees;
import o.getResId;
/* loaded from: classes3.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new Parcelable.Creator<ApicFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.ApicFrame.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    };
    public final int ah$a;
    public final byte[] toString;
    public final String valueOf;
    public final String values;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(com.google.android.exoplayer2.metadata.id3.ApicFrame.ID);
        this.values = str;
        this.valueOf = str2;
        this.ah$a = i;
        this.toString = bArr;
    }

    ApicFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.ApicFrame.ID);
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
        this.valueOf = parcel.readString();
        this.ah$a = parcel.readInt();
        this.toString = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame, com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public void valueOf(getResId.values valuesVar) {
        valuesVar.ag$a(this.toString, this.ah$a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.ah$a == apicFrame.ah$a && getElevationDegrees.values(this.values, apicFrame.values) && getElevationDegrees.values(this.valueOf, apicFrame.valueOf) && Arrays.equals(this.toString, apicFrame.toString);
    }

    public int hashCode() {
        int i = this.ah$a;
        String str = this.values;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.valueOf;
        return ((((((i + BR.userTeamVM) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.toString);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.HaptikSDK$b + ": mimeType=" + this.values + ", description=" + this.valueOf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.values);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.ah$a);
        parcel.writeByteArray(this.toString);
    }
}
