package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import o.PreferenceFragment;
import o.onCreateLayoutManager;
/* loaded from: classes7.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public Month createFromParcel(Parcel parcel) {
            return Month.ag$a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    };
    private String HaptikSDK$c;
    public final int ag$a;
    final long ah$a;
    private final Calendar invoke;
    public final int toString;
    public final int valueOf;
    public final int values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar ag$a = onCreateLayoutManager.ag$a(calendar);
        this.invoke = ag$a;
        this.toString = ag$a.get(2);
        this.values = ag$a.get(1);
        this.ag$a = ag$a.getMaximum(7);
        this.valueOf = ag$a.getActualMaximum(5);
        this.ah$a = ag$a.getTimeInMillis();
    }

    public static Month valueOf(long j) {
        Calendar values = onCreateLayoutManager.values();
        values.setTimeInMillis(j);
        return new Month(values);
    }

    public static Month ag$a(int i, int i2) {
        Calendar values = onCreateLayoutManager.values();
        values.set(1, i);
        values.set(2, i2);
        return new Month(values);
    }

    public static Month valueOf() {
        return new Month(onCreateLayoutManager.valueOf());
    }

    public int ah$a() {
        int firstDayOfWeek = this.invoke.get(7) - this.invoke.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.ag$a : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.toString == month.toString && this.values == month.values;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.toString), Integer.valueOf(this.values)});
    }

    @Override // java.lang.Comparable
    /* renamed from: ah$a */
    public int compareTo(Month month) {
        return this.invoke.compareTo(month.invoke);
    }

    public int valueOf(Month month) {
        if (this.invoke instanceof GregorianCalendar) {
            return ((month.values - this.values) * 12) + (month.toString - this.toString);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public long values() {
        return this.invoke.getTimeInMillis();
    }

    public long values(int i) {
        Calendar ag$a = onCreateLayoutManager.ag$a(this.invoke);
        ag$a.set(5, i);
        return ag$a.getTimeInMillis();
    }

    public int ag$a(long j) {
        Calendar ag$a = onCreateLayoutManager.ag$a(this.invoke);
        ag$a.setTimeInMillis(j);
        return ag$a.get(5);
    }

    public Month valueOf(int i) {
        Calendar ag$a = onCreateLayoutManager.ag$a(this.invoke);
        ag$a.add(2, i);
        return new Month(ag$a);
    }

    public String valueOf(Context context) {
        if (this.HaptikSDK$c == null) {
            this.HaptikSDK$c = PreferenceFragment.values(context, this.invoke.getTimeInMillis());
        }
        return this.HaptikSDK$c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.values);
        parcel.writeInt(this.toString);
    }
}
