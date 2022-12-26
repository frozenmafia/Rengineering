package com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import o.FingerprintManagerCompat;
import o.createFromIcon;
import o.getElevationDegrees;
import o.getResId;
import o.recycleUpdateOp;
import o.startWrite;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new Parcelable.Creator<SlowMotionData>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4.SlowMotionData.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    };
    public final List<Segment> toString;

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

    /* loaded from: classes3.dex */
    public static final class Segment implements Parcelable {
        public final int toString;
        public final long valueOf;
        public final long values;
        public static final Comparator<Segment> ag$a = startWrite.toString;
        public static final Parcelable.Creator<Segment> CREATOR = new Parcelable.Creator<Segment>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4.SlowMotionData.Segment.5
            @Override // android.os.Parcelable.Creator
            /* renamed from: valueOf */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: valueOf */
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Segment(long j, long j2, int i) {
            FingerprintManagerCompat.toString(j < j2);
            this.values = j;
            this.valueOf = j2;
            this.toString = i;
        }

        public String toString() {
            return getElevationDegrees.values("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.values), Long.valueOf(this.valueOf), Integer.valueOf(this.toString));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.values == segment.values && this.valueOf == segment.valueOf && this.toString == segment.toString;
        }

        public int hashCode() {
            return recycleUpdateOp.valueOf(Long.valueOf(this.values), Long.valueOf(this.valueOf), Integer.valueOf(this.toString));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.values);
            parcel.writeLong(this.valueOf);
            parcel.writeInt(this.toString);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.toString = list;
        FingerprintManagerCompat.toString(!ah$a(list));
    }

    public String toString() {
        return "SlowMotion: segments=" + this.toString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.toString.equals(((SlowMotionData) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.toString);
    }

    private static boolean ah$a(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).valueOf;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).values < j) {
                return true;
            }
            j = list.get(i).valueOf;
        }
        return false;
    }
}
