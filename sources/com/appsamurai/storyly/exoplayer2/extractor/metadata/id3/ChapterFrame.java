package com.appsamurai.storyly.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import java.util.Arrays;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator<ChapterFrame>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.ChapterFrame.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    };
    public final long ag$a;
    public final int ah$a;
    private final Id3Frame[] ah$b;
    public final long toString;
    public final int valueOf;
    public final String values;

    @Override // com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterFrame.ID);
        this.values = str;
        this.ah$a = i;
        this.valueOf = i2;
        this.toString = j;
        this.ag$a = j2;
        this.ah$b = id3FrameArr;
    }

    ChapterFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterFrame.ID);
        this.values = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ah$a = parcel.readInt();
        this.valueOf = parcel.readInt();
        this.toString = parcel.readLong();
        this.ag$a = parcel.readLong();
        int readInt = parcel.readInt();
        this.ah$b = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.ah$b[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.ah$a == chapterFrame.ah$a && this.valueOf == chapterFrame.valueOf && this.toString == chapterFrame.toString && this.ag$a == chapterFrame.ag$a && getElevationDegrees.values(this.values, chapterFrame.values) && Arrays.equals(this.ah$b, chapterFrame.ah$b);
    }

    public int hashCode() {
        int i = this.ah$a;
        int i2 = this.valueOf;
        int i3 = (int) this.toString;
        int i4 = (int) this.ag$a;
        String str = this.values;
        return ((((((((i + BR.userTeamVM) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.values);
        parcel.writeInt(this.ah$a);
        parcel.writeInt(this.valueOf);
        parcel.writeLong(this.toString);
        parcel.writeLong(this.ag$a);
        parcel.writeInt(this.ah$b.length);
        for (Id3Frame id3Frame : this.ah$b) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
