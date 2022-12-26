package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes5.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new Parcelable.Creator<Counter>() { // from class: com.google.firebase.perf.metrics.Counter.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public Counter[] newArray(int i) {
            return new Counter[i];
        }
    };
    private final String ah$a;
    private final AtomicLong values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Counter(String str) {
        this.ah$a = str;
        this.values = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.ah$a = parcel.readString();
        this.values = new AtomicLong(parcel.readLong());
    }

    public String ah$a() {
        return this.ah$a;
    }

    public long valueOf() {
        return this.values.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(long j) {
        this.values.set(j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ah$a);
        parcel.writeLong(this.values.get());
    }
}
