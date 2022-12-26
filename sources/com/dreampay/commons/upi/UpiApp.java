package com.dreampay.commons.upi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class UpiApp implements Parcelable {
    public static final Parcelable.Creator<UpiApp> CREATOR = new Creator();
    private final String className;
    private String displayName;
    private String packageName;
    private final UpiAppHealth upiHealth;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<UpiApp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpiApp createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new UpiApp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UpiAppHealth.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpiApp[] newArray(int i) {
            return new UpiApp[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeString(this.className);
        parcel.writeString(this.packageName);
        parcel.writeString(this.displayName);
        UpiAppHealth upiAppHealth = this.upiHealth;
        if (upiAppHealth == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        upiAppHealth.writeToParcel(parcel, i);
    }

    public UpiApp(String str, String str2, String str3, UpiAppHealth upiAppHealth) {
        this.className = str;
        this.packageName = str2;
        this.displayName = str3;
        this.upiHealth = upiAppHealth;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final UpiAppHealth getUpiHealth() {
        return this.upiHealth;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final Drawable getAppIcon(Context context) {
        runAnimators.ag$a(context, "context");
        PackageManager packageManager = context.getPackageManager();
        String str = this.packageName;
        runAnimators.toString((Object) str);
        Drawable applicationIcon = packageManager.getApplicationIcon(str);
        runAnimators.ah$a(applicationIcon, "context.packageManager.getApplicationIcon(this.packageName!!)");
        return applicationIcon;
    }
}
