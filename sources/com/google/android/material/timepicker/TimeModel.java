package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.createItemFromTag;
/* loaded from: classes7.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    };
    private final createItemFromTag HaptikSDK$c;
    public int ag$a;
    public final int ah$a;
    private final createItemFromTag invoke;
    public int toString;
    public int valueOf;
    public int values;

    private static int values(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.values = i;
        this.valueOf = i2;
        this.ag$a = i3;
        this.ah$a = i4;
        this.toString = values(i);
        this.invoke = new createItemFromTag(59);
        this.HaptikSDK$c = new createItemFromTag(i4 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public void valueOf(int i) {
        if (this.ah$a == 1) {
            this.values = i;
        } else {
            this.values = (i % 12) + (this.toString == 1 ? 12 : 0);
        }
    }

    public void ag$a(int i) {
        this.valueOf = i % 60;
    }

    public int ah$a() {
        if (this.ah$a == 1) {
            return this.values % 24;
        }
        int i = this.values;
        if (i % 12 == 0) {
            return 12;
        }
        return this.toString == 1 ? i - 12 : i;
    }

    public createItemFromTag values() {
        return this.invoke;
    }

    public createItemFromTag ag$a() {
        return this.HaptikSDK$c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.ah$a), Integer.valueOf(this.values), Integer.valueOf(this.valueOf), Integer.valueOf(this.ag$a)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeModel) {
            TimeModel timeModel = (TimeModel) obj;
            return this.values == timeModel.values && this.valueOf == timeModel.valueOf && this.ah$a == timeModel.ah$a && this.ag$a == timeModel.ag$a;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.values);
        parcel.writeInt(this.valueOf);
        parcel.writeInt(this.ag$a);
        parcel.writeInt(this.ah$a);
    }

    public void ah$a(int i) {
        if (i != this.toString) {
            this.toString = i;
            int i2 = this.values;
            if (i2 < 12 && i == 1) {
                this.values = i2 + 12;
            } else if (i2 < 12 || i != 0) {
            } else {
                this.values = i2 - 12;
            }
        }
    }

    public static String valueOf(Resources resources, CharSequence charSequence) {
        return values(resources, charSequence, "%02d");
    }

    public static String values(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }
}
