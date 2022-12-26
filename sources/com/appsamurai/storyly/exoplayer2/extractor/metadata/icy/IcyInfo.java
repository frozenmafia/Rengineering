package com.appsamurai.storyly.exoplayer2.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import java.util.Arrays;
import o.FingerprintManagerCompat;
import o.createFromIcon;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new Parcelable.Creator<IcyInfo>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.icy.IcyInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    };
    public final String ah$a;
    public final byte[] toString;
    public final String valueOf;

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

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.toString = bArr;
        this.valueOf = str;
        this.ah$a = str2;
    }

    IcyInfo(Parcel parcel) {
        this.toString = (byte[]) FingerprintManagerCompat.toString(parcel.createByteArray());
        this.valueOf = parcel.readString();
        this.ah$a = parcel.readString();
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public void valueOf(getResId.values valuesVar) {
        String str = this.valueOf;
        if (str != null) {
            valuesVar.HaptikSDK$e(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.toString, ((IcyInfo) obj).toString);
    }

    public int hashCode() {
        return Arrays.hashCode(this.toString);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.valueOf, this.ah$a, Integer.valueOf(this.toString.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.toString);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.ah$a);
    }
}
