package com.dreampay.commons.upi;

import android.os.Parcel;
import android.os.Parcelable;
import com.dreampay.commons.HealthStatus;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class UpiAppHealth implements Parcelable {
    public static final Parcelable.Creator<UpiAppHealth> CREATOR = new Creator();
    private final String backgroundColor;
    private final boolean disablePayment;
    private final String healthIcon;
    private final String healthMessage;
    private final int healthStatusIdentifier;
    private final String textColor;
    private final HealthStatus upiAppHealthStatus;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<UpiAppHealth> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpiAppHealth createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new UpiAppHealth(HealthStatus.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpiAppHealth[] newArray(int i) {
            return new UpiAppHealth[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeString(this.upiAppHealthStatus.name());
        parcel.writeInt(this.disablePayment ? 1 : 0);
        parcel.writeInt(this.healthStatusIdentifier);
        parcel.writeString(this.healthMessage);
        parcel.writeString(this.healthIcon);
        parcel.writeString(this.textColor);
        parcel.writeString(this.backgroundColor);
    }

    public UpiAppHealth(HealthStatus healthStatus, boolean z, int i, String str, String str2, String str3, String str4) {
        runAnimators.ag$a(healthStatus, "upiAppHealthStatus");
        runAnimators.ag$a(str, "healthMessage");
        runAnimators.ag$a(str2, "healthIcon");
        runAnimators.ag$a(str3, "textColor");
        runAnimators.ag$a(str4, "backgroundColor");
        this.upiAppHealthStatus = healthStatus;
        this.disablePayment = z;
        this.healthStatusIdentifier = i;
        this.healthMessage = str;
        this.healthIcon = str2;
        this.textColor = str3;
        this.backgroundColor = str4;
    }

    public /* synthetic */ UpiAppHealth(HealthStatus healthStatus, boolean z, int i, String str, String str2, String str3, String str4, int i2, getTargetTypes gettargettypes) {
        this(healthStatus, z, i, str, str2, str3, (i2 & 64) != 0 ? "" : str4);
    }

    public final boolean getDisablePayment() {
        return this.disablePayment;
    }

    public final int getHealthStatusIdentifier() {
        return this.healthStatusIdentifier;
    }

    public final HealthStatus getUpiAppHealthStatus() {
        return this.upiAppHealthStatus;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getHealthIcon() {
        return this.healthIcon;
    }

    public final String getHealthMessage() {
        return this.healthMessage;
    }

    public final String getTextColor() {
        return this.textColor;
    }
}
