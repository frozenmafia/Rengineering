package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;
import o.onCreateLayoutManager;
/* loaded from: classes7.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    };
    private final int HaptikSDK$c;
    private final int ag$a;
    private Month ah$a;
    private final Month toString;
    private final Month valueOf;
    private final DateValidator values;

    /* loaded from: classes7.dex */
    public interface DateValidator extends Parcelable {
        boolean ag$a(long j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.valueOf = month;
        this.toString = month2;
        this.ah$a = month3;
        this.values = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.ag$a = month.valueOf(month2) + 1;
        this.HaptikSDK$c = (month2.values - month.values) + 1;
    }

    public DateValidator ag$a() {
        return this.values;
    }

    public Month HaptikSDK$a() {
        return this.valueOf;
    }

    public Month values() {
        return this.toString;
    }

    public Month valueOf() {
        return this.ah$a;
    }

    public int ah$a() {
        return this.ag$a;
    }

    public int HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.valueOf.equals(calendarConstraints.valueOf) && this.toString.equals(calendarConstraints.toString) && ObjectsCompat.equals(this.ah$a, calendarConstraints.ah$a) && this.values.equals(calendarConstraints.values);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.valueOf, this.toString, this.ah$a, this.values});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.valueOf, 0);
        parcel.writeParcelable(this.toString, 0);
        parcel.writeParcelable(this.ah$a, 0);
        parcel.writeParcelable(this.values, 0);
    }

    public Month toString(Month month) {
        if (month.compareTo(this.valueOf) < 0) {
            return this.valueOf;
        }
        return month.compareTo(this.toString) > 0 ? this.toString : month;
    }

    /* loaded from: classes7.dex */
    public static final class toString {
        static final long toString = onCreateLayoutManager.valueOf(Month.ag$a(1900, 0).ah$a);
        static final long valueOf = onCreateLayoutManager.valueOf(Month.ag$a(2100, 11).ah$a);
        private DateValidator HaptikSDK$c;
        private long ag$a;
        private long ah$a;
        private Long values;

        public toString() {
            this.ag$a = toString;
            this.ah$a = valueOf;
            this.HaptikSDK$c = DateValidatorPointForward.values(Long.MIN_VALUE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString(CalendarConstraints calendarConstraints) {
            this.ag$a = toString;
            this.ah$a = valueOf;
            this.HaptikSDK$c = DateValidatorPointForward.values(Long.MIN_VALUE);
            this.ag$a = calendarConstraints.valueOf.ah$a;
            this.ah$a = calendarConstraints.toString.ah$a;
            this.values = Long.valueOf(calendarConstraints.ah$a.ah$a);
            this.HaptikSDK$c = calendarConstraints.values;
        }

        public toString valueOf(long j) {
            this.values = Long.valueOf(j);
            return this;
        }

        public CalendarConstraints ah$a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.HaptikSDK$c);
            Month valueOf2 = Month.valueOf(this.ag$a);
            Month valueOf3 = Month.valueOf(this.ah$a);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.values;
            return new CalendarConstraints(valueOf2, valueOf3, dateValidator, l == null ? null : Month.valueOf(l.longValue()));
        }
    }
}
