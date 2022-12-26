package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class pj implements an {
    public static final Parcelable.Creator<pj> CREATOR = new ph(1);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1213b;
    public final List c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pj(Parcel parcel) {
        this.a = parcel.readString();
        this.f1213b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((pi) parcel.readParcelable(pi.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pj pjVar = (pj) obj;
        return TextUtils.equals(this.a, pjVar.a) && TextUtils.equals(this.f1213b, pjVar.f1213b) && this.c.equals(pjVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f1213b;
        return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            str = " [" + str2 + ", " + this.f1213b + "]";
        } else {
            str = "";
        }
        return "HlsTrackMetadataEntry".concat(String.valueOf(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.f1213b);
        int size = this.c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.c.get(i2), 0);
        }
    }

    public pj(String str, String str2, List list) {
        this.a = str;
        this.f1213b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }
}
