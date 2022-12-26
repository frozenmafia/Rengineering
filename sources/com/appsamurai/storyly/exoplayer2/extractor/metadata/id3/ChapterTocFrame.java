package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new Parcelable.Creator<ChapterTocFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.ChapterTocFrame.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    };
    public final String ag$a;
    public final boolean ah$a;
    private final Id3Frame[] toString;
    public final String[] valueOf;
    public final boolean values;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.ID);
        this.ag$a = str;
        this.values = z;
        this.ah$a = z2;
        this.valueOf = strArr;
        this.toString = id3FrameArr;
    }

    ChapterTocFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.ID);
        this.ag$a = (String) getElevationDegrees.ah$a(parcel.readString());
        this.values = parcel.readByte() != 0;
        this.ah$a = parcel.readByte() != 0;
        this.valueOf = (String[]) getElevationDegrees.ah$a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.toString = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.toString[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.values == chapterTocFrame.values && this.ah$a == chapterTocFrame.ah$a && getElevationDegrees.values(this.ag$a, chapterTocFrame.ag$a) && Arrays.equals(this.valueOf, chapterTocFrame.valueOf) && Arrays.equals(this.toString, chapterTocFrame.toString);
    }

    public int hashCode() {
        boolean z = this.values;
        boolean z2 = this.ah$a;
        String str = this.ag$a;
        return (((((z ? 1 : 0) + BR.userTeamVM) * 31) + (z2 ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ag$a);
        parcel.writeByte(this.values ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ah$a ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.valueOf);
        parcel.writeInt(this.toString.length);
        for (Id3Frame id3Frame : this.toString) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
