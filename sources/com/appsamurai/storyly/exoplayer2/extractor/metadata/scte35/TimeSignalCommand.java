package com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import o.C$default$setContentDescription;
import o.getCarrierFrequencyHz;
/* loaded from: classes3.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Parcelable.Creator<TimeSignalCommand>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35.TimeSignalCommand.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    };
    public final long ag$a;
    public final long ah$a;

    private TimeSignalCommand(long j, long j2) {
        this.ag$a = j;
        this.ah$a = j2;
    }

    public static TimeSignalCommand toString(C$default$setContentDescription c$default$setContentDescription, long j, getCarrierFrequencyHz getcarrierfrequencyhz) {
        long timeSignalCommand = toString(c$default$setContentDescription, j);
        return new TimeSignalCommand(timeSignalCommand, getcarrierfrequencyhz.valueOf(timeSignalCommand));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long toString(C$default$setContentDescription c$default$setContentDescription, long j) {
        long extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        return (128 & extraCallbackWithResult) != 0 ? ((((extraCallbackWithResult & 1) << 32) | c$default$setContentDescription.onPostMessage()) + j) & 8589934591L : C.TIME_UNSET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ag$a);
        parcel.writeLong(this.ah$a);
    }
}
