package com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import o.C$default$setContentDescription;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new Parcelable.Creator<PrivateCommand>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35.PrivateCommand.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    };
    public final byte[] ah$a;
    public final long toString;
    public final long values;

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.toString = j2;
        this.values = j;
        this.ah$a = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.toString = parcel.readLong();
        this.values = parcel.readLong();
        this.ah$a = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    public static PrivateCommand ag$a(C$default$setContentDescription c$default$setContentDescription, int i, long j) {
        long onPostMessage = c$default$setContentDescription.onPostMessage();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        c$default$setContentDescription.valueOf(bArr, 0, i2);
        return new PrivateCommand(onPostMessage, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.toString);
        parcel.writeLong(this.values);
        parcel.writeByteArray(this.ah$a);
    }
}
