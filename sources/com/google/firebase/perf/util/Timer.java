package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() { // from class: com.google.firebase.perf.util.Timer.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    };
    private long ah$a;
    private long valueOf;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Timer() {
        this.valueOf = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.ah$a = System.nanoTime();
    }

    private Timer(Parcel parcel) {
        this.valueOf = parcel.readLong();
        this.ah$a = parcel.readLong();
    }

    public long values() {
        return this.valueOf;
    }

    public long ag$a() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.ah$a);
    }

    public long ag$a(Timer timer) {
        return TimeUnit.NANOSECONDS.toMicros(timer.ah$a - this.ah$a);
    }

    public long valueOf() {
        return this.valueOf + ag$a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.valueOf);
        parcel.writeLong(this.ah$a);
    }
}
