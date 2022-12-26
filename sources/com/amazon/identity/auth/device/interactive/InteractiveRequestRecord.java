package com.amazon.identity.auth.device.interactive;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class InteractiveRequestRecord implements Parcelable {
    public static final Parcelable.Creator<InteractiveRequestRecord> CREATOR = new Parcelable.Creator<InteractiveRequestRecord>() { // from class: com.amazon.identity.auth.device.interactive.InteractiveRequestRecord.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public InteractiveRequestRecord createFromParcel(Parcel parcel) {
            return new InteractiveRequestRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public InteractiveRequestRecord[] newArray(int i) {
            return new InteractiveRequestRecord[i];
        }
    };
    private final String ah$a;
    private Bundle toString;
    private final Bundle values;

    private InteractiveRequestRecord(Parcel parcel) {
        this.ah$a = parcel.readString();
        this.values = parcel.readBundle();
        this.toString = parcel.readBundle();
    }

    public InteractiveRequestRecord(String str, Bundle bundle) {
        this.ah$a = str;
        this.values = bundle;
    }

    public Bundle ah$a() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InteractiveRequestRecord interactiveRequestRecord = (InteractiveRequestRecord) obj;
            Bundle bundle = this.toString;
            if (bundle == null) {
                if (interactiveRequestRecord.toString != null) {
                    return false;
                }
            } else if (!bundle.equals(interactiveRequestRecord.toString)) {
                return false;
            }
            Bundle bundle2 = this.values;
            if (bundle2 == null) {
                if (interactiveRequestRecord.values != null) {
                    return false;
                }
            } else if (!bundle2.equals(interactiveRequestRecord.values)) {
                return false;
            }
            String str = this.ah$a;
            String str2 = interactiveRequestRecord.ah$a;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Bundle bundle = this.toString;
        int hashCode = bundle == null ? 0 : bundle.hashCode();
        Bundle bundle2 = this.values;
        int hashCode2 = bundle2 == null ? 0 : bundle2.hashCode();
        String str = this.ah$a;
        return ((((hashCode + 31) * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" id=");
        sb.append(this.ah$a);
        sb.append(" hasFragment=");
        sb.append(this.toString != null);
        return sb.toString();
    }

    public Bundle valueOf() {
        return this.toString;
    }

    public String values() {
        return this.ah$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ah$a);
        parcel.writeBundle(this.values);
        parcel.writeBundle(this.toString);
    }
}
