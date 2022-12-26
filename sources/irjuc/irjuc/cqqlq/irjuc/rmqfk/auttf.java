package irjuc.irjuc.cqqlq.irjuc.rmqfk;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class auttf extends jmjou implements Parcelable {
    public static final Parcelable.Creator<auttf> CREATOR = new Parcelable.Creator<auttf>() { // from class: irjuc.irjuc.cqqlq.irjuc.rmqfk.auttf$ag$a
        @Override // android.os.Parcelable.Creator
        public auttf createFromParcel(Parcel parcel) {
            return new auttf(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public auttf[] newArray(int i) {
            return new auttf[i];
        }
    };
    public double toString;
    public double values;

    public auttf() {
    }

    public auttf(Parcel parcel) {
        super(parcel);
        this.toString = parcel.readDouble();
        this.values = parcel.readDouble();
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.toString);
        parcel.writeDouble(this.values);
    }
}
