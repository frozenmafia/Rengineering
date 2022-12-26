package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new Parcelable.Creator<InternalFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.InternalFrame.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    };
    public final String ah$a;
    public final String toString;
    public final String values;

    public InternalFrame(String str, String str2, String str3) {
        super(com.google.android.exoplayer2.metadata.id3.InternalFrame.ID);
        this.toString = str;
        this.ah$a = str2;
        this.values = str3;
    }

    InternalFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.InternalFrame.ID);
        this.toString = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ah$a = (String) getElevationDegrees.ah$a(parcel.readString());
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return getElevationDegrees.values(this.ah$a, internalFrame.ah$a) && getElevationDegrees.values(this.toString, internalFrame.toString) && getElevationDegrees.values(this.values, internalFrame.values);
    }

    public int hashCode() {
        String str = this.toString;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ah$a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.values;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.HaptikSDK$b + ": domain=" + this.toString + ", description=" + this.ah$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.toString);
        parcel.writeString(this.values);
    }
}
