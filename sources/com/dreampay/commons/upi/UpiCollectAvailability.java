package com.dreampay.commons.upi;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class UpiCollectAvailability implements Parcelable {
    public static final Parcelable.Creator<UpiCollectAvailability> CREATOR = new Creator();
    private final UpiAppHealth health;
    private final boolean isInstrumentEnabled;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<UpiCollectAvailability> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpiCollectAvailability createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new UpiCollectAvailability(parcel.readInt() != 0, parcel.readInt() == 0 ? null : UpiAppHealth.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpiCollectAvailability[] newArray(int i) {
            return new UpiCollectAvailability[i];
        }
    }

    public UpiCollectAvailability() {
        this(false, null, 3, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeInt(this.isInstrumentEnabled ? 1 : 0);
        UpiAppHealth upiAppHealth = this.health;
        if (upiAppHealth == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        upiAppHealth.writeToParcel(parcel, i);
    }

    public UpiCollectAvailability(boolean z, UpiAppHealth upiAppHealth) {
        this.isInstrumentEnabled = z;
        this.health = upiAppHealth;
    }

    public /* synthetic */ UpiCollectAvailability(boolean z, UpiAppHealth upiAppHealth, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : upiAppHealth);
    }

    public final UpiAppHealth getHealth() {
        return this.health;
    }

    public final boolean isInstrumentEnabled() {
        return this.isInstrumentEnabled;
    }
}
