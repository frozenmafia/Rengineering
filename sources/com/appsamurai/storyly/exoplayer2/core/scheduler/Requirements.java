package com.appsamurai.storyly.exoplayer2.core.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import o.FingerprintManagerCompat;
import o.getElevationDegrees;
/* loaded from: classes6.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new Parcelable.Creator<Requirements>() { // from class: com.appsamurai.storyly.exoplayer2.core.scheduler.Requirements.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    };
    private final int values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Requirements(int i) {
        this.values = (i & 2) != 0 ? i | 1 : i;
    }

    public boolean ah$a() {
        return (this.values & 1) != 0;
    }

    public boolean invoke() {
        return (this.values & 2) != 0;
    }

    public boolean ag$a() {
        return (this.values & 8) != 0;
    }

    public boolean values() {
        return (this.values & 4) != 0;
    }

    public boolean valueOf() {
        return (this.values & 16) != 0;
    }

    public int values(Context context) {
        int ag$a = ag$a(context);
        if (ag$a() && !valueOf(context)) {
            ag$a |= 8;
        }
        if (values() && !ah$a(context)) {
            ag$a |= 4;
        }
        return (!valueOf() || toString(context)) ? ag$a : ag$a | 16;
    }

    private int ag$a(Context context) {
        if (ah$a()) {
            ConnectivityManager connectivityManager = (ConnectivityManager) FingerprintManagerCompat.toString(context.getSystemService("connectivity"));
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && toString(connectivityManager)) {
                return (invoke() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
            }
            return this.values & 3;
        }
        return 0;
    }

    private boolean valueOf(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean ah$a(Context context) {
        PowerManager powerManager = (PowerManager) FingerprintManagerCompat.toString(context.getSystemService("power"));
        if (getElevationDegrees.HaptikSDK$b >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        return getElevationDegrees.HaptikSDK$b < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
    }

    private boolean toString(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    private static boolean toString(ConnectivityManager connectivityManager) {
        if (getElevationDegrees.HaptikSDK$b < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.values == ((Requirements) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.values);
    }
}
