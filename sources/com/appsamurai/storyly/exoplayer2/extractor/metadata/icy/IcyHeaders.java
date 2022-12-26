package com.appsamurai.storyly.exoplayer2.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import o.FingerprintManagerCompat;
import o.createFromIcon;
import o.getElevationDegrees;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.icy.IcyHeaders.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    };
    public final String ag$a;
    public final boolean ah$a;
    public final String ah$b;
    public final String toString;
    public final int valueOf;
    public final int values;

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ byte[] ah$a() {
        return updateDstRect.toString(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ createFromIcon valueOf() {
        return updateDstRect.valueOf(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsamurai.storyly.exoplayer2.extractor.metadata.icy.IcyHeaders ag$a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsamurai.storyly.exoplayer2.extractor.metadata.icy.IcyHeaders.ag$a(java.util.Map):com.appsamurai.storyly.exoplayer2.extractor.metadata.icy.IcyHeaders");
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        FingerprintManagerCompat.toString(i2 == -1 || i2 > 0);
        this.values = i;
        this.ag$a = str;
        this.toString = str2;
        this.ah$b = str3;
        this.ah$a = z;
        this.valueOf = i2;
    }

    IcyHeaders(Parcel parcel) {
        this.values = parcel.readInt();
        this.ag$a = parcel.readString();
        this.toString = parcel.readString();
        this.ah$b = parcel.readString();
        this.ah$a = getElevationDegrees.toString(parcel);
        this.valueOf = parcel.readInt();
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public void valueOf(getResId.values valuesVar) {
        String str = this.toString;
        if (str != null) {
            valuesVar.HaptikSDK$c(str);
        }
        String str2 = this.ag$a;
        if (str2 != null) {
            valuesVar.invoke(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.values == icyHeaders.values && getElevationDegrees.values(this.ag$a, icyHeaders.ag$a) && getElevationDegrees.values(this.toString, icyHeaders.toString) && getElevationDegrees.values(this.ah$b, icyHeaders.ah$b) && this.ah$a == icyHeaders.ah$a && this.valueOf == icyHeaders.valueOf;
    }

    public int hashCode() {
        int i = this.values;
        String str = this.ag$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.toString;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ah$b;
        return ((((((((((i + BR.userTeamVM) * 31) + hashCode) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.ah$a ? 1 : 0)) * 31) + this.valueOf;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.toString + "\", genre=\"" + this.ag$a + "\", bitrate=" + this.values + ", metadataInterval=" + this.valueOf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.values);
        parcel.writeString(this.ag$a);
        parcel.writeString(this.toString);
        parcel.writeString(this.ah$b);
        getElevationDegrees.values(parcel, this.ah$a);
        parcel.writeInt(this.valueOf);
    }
}
