package com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new Parcelable.Creator<SpliceNullCommand>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35.SpliceNullCommand.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public SpliceNullCommand[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    };

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
