package com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.google.common.primitives.Longs;
import o.createFromIcon;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4.MotionPhotoMetadata.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    };
    public final long ag$a;
    public final long ah$a;
    public final long toString;
    public final long valueOf;
    public final long values;

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ byte[] ah$a() {
        return updateDstRect.toString(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ createFromIcon valueOf() {
        return updateDstRect.valueOf(this);
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ void valueOf(getResId.values valuesVar) {
        updateDstRect.valueOf(this, valuesVar);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.values = j;
        this.toString = j2;
        this.valueOf = j3;
        this.ag$a = j4;
        this.ah$a = j5;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.values = parcel.readLong();
        this.toString = parcel.readLong();
        this.valueOf = parcel.readLong();
        this.ag$a = parcel.readLong();
        this.ah$a = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.values == motionPhotoMetadata.values && this.toString == motionPhotoMetadata.toString && this.valueOf == motionPhotoMetadata.valueOf && this.ag$a == motionPhotoMetadata.ag$a && this.ah$a == motionPhotoMetadata.ah$a;
    }

    public int hashCode() {
        int ah$a = Longs.ah$a(this.values);
        int ah$a2 = Longs.ah$a(this.toString);
        int ah$a3 = Longs.ah$a(this.valueOf);
        return ((((((((ah$a + BR.userTeamVM) * 31) + ah$a2) * 31) + ah$a3) * 31) + Longs.ah$a(this.ag$a)) * 31) + Longs.ah$a(this.ah$a);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.values + ", photoSize=" + this.toString + ", photoPresentationTimestampUs=" + this.valueOf + ", videoStartPosition=" + this.ag$a + ", videoSize=" + this.ah$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.values);
        parcel.writeLong(this.toString);
        parcel.writeLong(this.valueOf);
        parcel.writeLong(this.ag$a);
        parcel.writeLong(this.ah$a);
    }
}
