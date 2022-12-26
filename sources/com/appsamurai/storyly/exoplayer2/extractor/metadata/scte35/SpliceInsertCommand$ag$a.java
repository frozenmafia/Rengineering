package com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
/* loaded from: classes3.dex */
public final class SpliceInsertCommand$ag$a {
    public final int ag$a;
    public final long ah$a;
    public final long valueOf;

    private SpliceInsertCommand$ag$a(int i, long j, long j2) {
        this.ag$a = i;
        this.ah$a = j;
        this.valueOf = j2;
    }

    public void valueOf(Parcel parcel) {
        parcel.writeInt(this.ag$a);
        parcel.writeLong(this.ah$a);
        parcel.writeLong(this.valueOf);
    }

    public static SpliceInsertCommand$ag$a toString(Parcel parcel) {
        return new SpliceInsertCommand$ag$a(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }
}
