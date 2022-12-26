package com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C$default$setContentDescription;
import o.getCarrierFrequencyHz;
/* loaded from: classes3.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35.SpliceInsertCommand.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    };
    public final boolean HaptikSDK$a;
    public final boolean HaptikSDK$b;
    public final boolean HaptikSDK$c;
    public final int HaptikSDK$d;
    public final long HaptikSDK$e;
    public final boolean HaptikWebView;
    public final int ag$a;
    public final List<SpliceInsertCommand$ag$a> ah$a;
    public final long ah$b;
    public final long invoke;
    public final long toString;
    public final int valueOf;
    public final boolean values;

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<SpliceInsertCommand$ag$a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.HaptikSDK$e = j;
        this.HaptikSDK$c = z;
        this.HaptikSDK$b = z2;
        this.HaptikSDK$a = z3;
        this.HaptikWebView = z4;
        this.invoke = j2;
        this.ah$b = j3;
        this.ah$a = Collections.unmodifiableList(list);
        this.values = z5;
        this.toString = j4;
        this.HaptikSDK$d = i;
        this.valueOf = i2;
        this.ag$a = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.HaptikSDK$e = parcel.readLong();
        this.HaptikSDK$c = parcel.readByte() == 1;
        this.HaptikSDK$b = parcel.readByte() == 1;
        this.HaptikSDK$a = parcel.readByte() == 1;
        this.HaptikWebView = parcel.readByte() == 1;
        this.invoke = parcel.readLong();
        this.ah$b = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(SpliceInsertCommand$ag$a.toString(parcel));
        }
        this.ah$a = Collections.unmodifiableList(arrayList);
        this.values = parcel.readByte() == 1;
        this.toString = parcel.readLong();
        this.HaptikSDK$d = parcel.readInt();
        this.valueOf = parcel.readInt();
        this.ag$a = parcel.readInt();
    }

    public static SpliceInsertCommand toString(C$default$setContentDescription c$default$setContentDescription, long j, getCarrierFrequencyHz getcarrierfrequencyhz) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        long j4;
        long onPostMessage = c$default$setContentDescription.onPostMessage();
        boolean z6 = (c$default$setContentDescription.extraCallbackWithResult() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z6) {
            list = emptyList;
            z = false;
            z2 = false;
            j2 = C.TIME_UNSET;
            z3 = false;
            j3 = C.TIME_UNSET;
            i = 0;
            i2 = 0;
            i3 = 0;
            z4 = false;
        } else {
            int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
            boolean z7 = (extraCallbackWithResult & 128) != 0;
            boolean z8 = (extraCallbackWithResult & 64) != 0;
            boolean z9 = (extraCallbackWithResult & 32) != 0;
            boolean z10 = (extraCallbackWithResult & 16) != 0;
            long timeSignalCommand = (!z8 || z10) ? C.TIME_UNSET : TimeSignalCommand.toString(c$default$setContentDescription, j);
            if (!z8) {
                int extraCallbackWithResult2 = c$default$setContentDescription.extraCallbackWithResult();
                ArrayList arrayList = new ArrayList(extraCallbackWithResult2);
                for (int i4 = 0; i4 < extraCallbackWithResult2; i4++) {
                    int extraCallbackWithResult3 = c$default$setContentDescription.extraCallbackWithResult();
                    long timeSignalCommand2 = !z10 ? TimeSignalCommand.toString(c$default$setContentDescription, j) : C.TIME_UNSET;
                    arrayList.add(new SpliceInsertCommand$ag$a(extraCallbackWithResult3, timeSignalCommand2, getcarrierfrequencyhz.valueOf(timeSignalCommand2)));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long extraCallbackWithResult4 = c$default$setContentDescription.extraCallbackWithResult();
                boolean z11 = (128 & extraCallbackWithResult4) != 0;
                j4 = ((((extraCallbackWithResult4 & 1) << 32) | c$default$setContentDescription.onPostMessage()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = C.TIME_UNSET;
            }
            i = c$default$setContentDescription.ICustomTabsCallback$Default();
            z4 = z8;
            i2 = c$default$setContentDescription.extraCallbackWithResult();
            i3 = c$default$setContentDescription.extraCallbackWithResult();
            list = emptyList;
            long j5 = timeSignalCommand;
            z3 = z5;
            j3 = j4;
            z2 = z10;
            z = z7;
            j2 = j5;
        }
        return new SpliceInsertCommand(onPostMessage, z6, z, z4, z2, j2, getcarrierfrequencyhz.valueOf(j2), list, z3, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.HaptikSDK$e);
        parcel.writeByte(this.HaptikSDK$c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.HaptikSDK$b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.HaptikSDK$a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.HaptikWebView ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.invoke);
        parcel.writeLong(this.ah$b);
        int size = this.ah$a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.ah$a.get(i2).valueOf(parcel);
        }
        parcel.writeByte(this.values ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.toString);
        parcel.writeInt(this.HaptikSDK$d);
        parcel.writeInt(this.valueOf);
        parcel.writeInt(this.ag$a);
    }
}
