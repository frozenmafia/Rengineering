package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;
/* loaded from: classes7.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() { // from class: com.google.android.material.datepicker.DateValidatorPointForward.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    };
    private final long values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DateValidatorPointForward(long j) {
        this.values = j;
    }

    public static DateValidatorPointForward values(long j) {
        return new DateValidatorPointForward(j);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean ag$a(long j) {
        return j >= this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.values);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.values == ((DateValidatorPointForward) obj).values;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.values)});
    }
}
