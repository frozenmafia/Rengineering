package com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C$default$setContentDescription;
/* loaded from: classes3.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.scte35.SpliceScheduleCommand.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    };
    public final List<toString> toString;

    /* loaded from: classes3.dex */
    public static final class toString {
        public final boolean HaptikSDK$a;
        public final boolean HaptikSDK$b;
        public final int HaptikSDK$c;
        public final List<values> ag$a;
        public final int ah$a;
        public final boolean ah$b;
        public final long getSignupData;
        public final long invoke;
        public final int toString;
        public final long valueOf;
        public final boolean values;

        private toString(long j, boolean z, boolean z2, boolean z3, List<values> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.invoke = j;
            this.ah$b = z;
            this.HaptikSDK$b = z2;
            this.HaptikSDK$a = z3;
            this.ag$a = Collections.unmodifiableList(list);
            this.getSignupData = j2;
            this.values = z4;
            this.valueOf = j3;
            this.HaptikSDK$c = i;
            this.toString = i2;
            this.ah$a = i3;
        }

        private toString(Parcel parcel) {
            this.invoke = parcel.readLong();
            this.ah$b = parcel.readByte() == 1;
            this.HaptikSDK$b = parcel.readByte() == 1;
            this.HaptikSDK$a = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(values.values(parcel));
            }
            this.ag$a = Collections.unmodifiableList(arrayList);
            this.getSignupData = parcel.readLong();
            this.values = parcel.readByte() == 1;
            this.valueOf = parcel.readLong();
            this.HaptikSDK$c = parcel.readInt();
            this.toString = parcel.readInt();
            this.ah$a = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static toString toString(C$default$setContentDescription c$default$setContentDescription) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z3;
            boolean z4;
            long j3;
            long onPostMessage = c$default$setContentDescription.onPostMessage();
            boolean z5 = (c$default$setContentDescription.extraCallbackWithResult() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = C.TIME_UNSET;
                z2 = false;
                j2 = C.TIME_UNSET;
                i = 0;
                i2 = 0;
                i3 = 0;
                z3 = false;
            } else {
                int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
                boolean z6 = (extraCallbackWithResult & 128) != 0;
                boolean z7 = (extraCallbackWithResult & 64) != 0;
                boolean z8 = (extraCallbackWithResult & 32) != 0;
                long onPostMessage2 = z7 ? c$default$setContentDescription.onPostMessage() : C.TIME_UNSET;
                if (!z7) {
                    int extraCallbackWithResult2 = c$default$setContentDescription.extraCallbackWithResult();
                    ArrayList arrayList3 = new ArrayList(extraCallbackWithResult2);
                    for (int i4 = 0; i4 < extraCallbackWithResult2; i4++) {
                        arrayList3.add(new values(c$default$setContentDescription.extraCallbackWithResult(), c$default$setContentDescription.onPostMessage()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long extraCallbackWithResult3 = c$default$setContentDescription.extraCallbackWithResult();
                    boolean z9 = (128 & extraCallbackWithResult3) != 0;
                    j3 = ((((extraCallbackWithResult3 & 1) << 32) | c$default$setContentDescription.onPostMessage()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = C.TIME_UNSET;
                }
                int ICustomTabsCallback$Default = c$default$setContentDescription.ICustomTabsCallback$Default();
                int extraCallbackWithResult4 = c$default$setContentDescription.extraCallbackWithResult();
                z3 = z7;
                i3 = c$default$setContentDescription.extraCallbackWithResult();
                j2 = j3;
                arrayList = arrayList2;
                long j4 = onPostMessage2;
                i = ICustomTabsCallback$Default;
                i2 = extraCallbackWithResult4;
                j = j4;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new toString(onPostMessage, z5, z, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void values(Parcel parcel) {
            parcel.writeLong(this.invoke);
            parcel.writeByte(this.ah$b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.HaptikSDK$b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.HaptikSDK$a ? (byte) 1 : (byte) 0);
            int size = this.ag$a.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.ag$a.get(i).toString(parcel);
            }
            parcel.writeLong(this.getSignupData);
            parcel.writeByte(this.values ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.valueOf);
            parcel.writeInt(this.HaptikSDK$c);
            parcel.writeInt(this.toString);
            parcel.writeInt(this.ah$a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static toString toString(Parcel parcel) {
            return new toString(parcel);
        }
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public final long ah$a;
        public final int toString;

        private values(int i, long j) {
            this.toString = i;
            this.ah$a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static values values(Parcel parcel) {
            return new values(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void toString(Parcel parcel) {
            parcel.writeInt(this.toString);
            parcel.writeLong(this.ah$a);
        }
    }

    private SpliceScheduleCommand(List<toString> list) {
        this.toString = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(toString.toString(parcel));
        }
        this.toString = Collections.unmodifiableList(arrayList);
    }

    public static SpliceScheduleCommand ag$a(C$default$setContentDescription c$default$setContentDescription) {
        int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        ArrayList arrayList = new ArrayList(extraCallbackWithResult);
        for (int i = 0; i < extraCallbackWithResult; i++) {
            arrayList.add(toString.toString(c$default$setContentDescription));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.toString.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.toString.get(i2).values(parcel);
        }
    }
}
