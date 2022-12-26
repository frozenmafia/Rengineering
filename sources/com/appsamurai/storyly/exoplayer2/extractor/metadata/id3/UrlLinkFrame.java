package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new Parcelable.Creator<UrlLinkFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.UrlLinkFrame.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    };
    public final String valueOf;
    public final String values;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.valueOf = str2;
        this.values = str3;
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) getElevationDegrees.ah$a(parcel.readString()));
        this.valueOf = parcel.readString();
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.HaptikSDK$b.equals(urlLinkFrame.HaptikSDK$b) && getElevationDegrees.values(this.valueOf, urlLinkFrame.valueOf) && getElevationDegrees.values(this.values, urlLinkFrame.values);
    }

    public int hashCode() {
        int hashCode = this.HaptikSDK$b.hashCode();
        String str = this.valueOf;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.values;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.HaptikSDK$b + ": url=" + this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.values);
    }
}
