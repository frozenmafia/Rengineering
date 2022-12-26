package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import o.onProgressUpdateSent;
/* loaded from: classes4.dex */
public class Entry extends onProgressUpdateSent implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() { // from class: com.github.mikephil.charting.data.Entry.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public Entry[] newArray(int i) {
            return new Entry[i];
        }
    };
    private float ah$a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry() {
        this.ah$a = 0.0f;
    }

    public Entry(float f, float f2) {
        super(f2);
        this.ah$a = 0.0f;
        this.ah$a = f;
    }

    public Entry(float f, float f2, Object obj) {
        super(f2, obj);
        this.ah$a = 0.0f;
        this.ah$a = f;
    }

    public Entry(float f, float f2, Drawable drawable) {
        super(f2, drawable);
        this.ah$a = 0.0f;
        this.ah$a = f;
    }

    public float HaptikWebView() {
        return this.ah$a;
    }

    public void toString(float f) {
        this.ah$a = f;
    }

    public String toString() {
        return "Entry, x: " + this.ah$a + " y: " + ah$b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.ah$a);
        parcel.writeFloat(ah$b());
        if (HaptikSDK$a() != null) {
            if (HaptikSDK$a() instanceof Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) HaptikSDK$a(), i);
                return;
            }
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }

    protected Entry(Parcel parcel) {
        this.ah$a = 0.0f;
        this.ah$a = parcel.readFloat();
        values(parcel.readFloat());
        if (parcel.readInt() == 1) {
            valueOf(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
