package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new Parcelable.Creator<CommentFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.CommentFrame.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    };
    public final String ag$a;
    public final String ah$a;
    public final String valueOf;

    public CommentFrame(String str, String str2, String str3) {
        super(com.google.android.exoplayer2.metadata.id3.CommentFrame.ID);
        this.valueOf = str;
        this.ag$a = str2;
        this.ah$a = str3;
    }

    CommentFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.CommentFrame.ID);
        this.valueOf = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ag$a = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ah$a = (String) getElevationDegrees.ah$a(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return getElevationDegrees.values(this.ag$a, commentFrame.ag$a) && getElevationDegrees.values(this.valueOf, commentFrame.valueOf) && getElevationDegrees.values(this.ah$a, commentFrame.ah$a);
    }

    public int hashCode() {
        String str = this.valueOf;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ag$a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ah$a;
        return ((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.HaptikSDK$b + ": language=" + this.valueOf + ", description=" + this.ag$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HaptikSDK$b);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.ah$a);
    }
}
