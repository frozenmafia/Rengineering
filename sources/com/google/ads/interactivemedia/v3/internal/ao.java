package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
public final class ao implements Parcelable {
    public static final Parcelable.Creator<ao> CREATOR = new m(2);
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    private final an[] f660b;

    public ao(long j, an... anVarArr) {
        this.a = j;
        this.f660b = anVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ao(Parcel parcel) {
        this.f660b = new an[parcel.readInt()];
        int i = 0;
        while (true) {
            an[] anVarArr = this.f660b;
            if (i < anVarArr.length) {
                anVarArr[i] = (an) parcel.readParcelable(an.class.getClassLoader());
                i++;
            } else {
                this.a = parcel.readLong();
                return;
            }
        }
    }

    public final int a() {
        return this.f660b.length;
    }

    public final an b(int i) {
        return this.f660b[i];
    }

    public final ao c(an... anVarArr) {
        return anVarArr.length == 0 ? this : new ao(this.a, (an[]) cp.ah(this.f660b, anVarArr));
    }

    public final ao d(ao aoVar) {
        return aoVar == null ? this : c(aoVar.f660b);
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
        ao aoVar = (ao) obj;
        return Arrays.equals(this.f660b, aoVar.f660b) && this.a == aoVar.a;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f660b) * 31) + ayu.f(this.a);
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.f660b);
        long j = this.a;
        if (j == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f660b.length);
        for (an anVar : this.f660b) {
            parcel.writeParcelable(anVar, 0);
        }
        parcel.writeLong(this.a);
    }

    public ao(List list) {
        this((an[]) list.toArray(new an[0]));
    }

    public ao(an... anVarArr) {
        this(C.TIME_UNSET, anVarArr);
    }
}
