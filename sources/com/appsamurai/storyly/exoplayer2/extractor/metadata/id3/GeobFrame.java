package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator<GeobFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.GeobFrame.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    };
    public final byte[] ag$a;
    public final String ah$a;
    public final String toString;
    public final String values;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(com.google.android.exoplayer2.metadata.id3.GeobFrame.ID);
        this.ah$a = str;
        this.toString = str2;
        this.values = str3;
        this.ag$a = bArr;
    }

    GeobFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.GeobFrame.ID);
        this.ah$a = (String) getElevationDegrees.ah$a(parcel.readString());
        this.toString = (String) getElevationDegrees.ah$a(parcel.readString());
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ag$a = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return getElevationDegrees.values(this.ah$a, geobFrame.ah$a) && getElevationDegrees.values(this.toString, geobFrame.toString) && getElevationDegrees.values(this.values, geobFrame.values) && Arrays.equals(this.ag$a, geobFrame.ag$a);
    }

    public int hashCode() {
        String str = this.ah$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.toString;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.values;
        return ((((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.ag$a);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.HaptikSDK$b + ": mimeType=" + this.ah$a + ", filename=" + this.toString + ", description=" + this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ah$a);
        parcel.writeString(this.toString);
        parcel.writeString(this.values);
        parcel.writeByteArray(this.ag$a);
    }
}
