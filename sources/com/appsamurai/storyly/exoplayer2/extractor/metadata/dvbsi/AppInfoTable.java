package com.appsamurai.storyly.exoplayer2.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import o.FingerprintManagerCompat;
import o.createFromIcon;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new Parcelable.Creator<AppInfoTable>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.dvbsi.AppInfoTable.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) FingerprintManagerCompat.toString(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }
    };
    public final int ag$a;
    public final String toString;

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

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ void valueOf(getResId.values valuesVar) {
        updateDstRect.valueOf(this, valuesVar);
    }

    public AppInfoTable(int i, String str) {
        this.ag$a = i;
        this.toString = str;
    }

    public String toString() {
        return "Ait(controlCode=" + this.ag$a + ",url=" + this.toString + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.toString);
        parcel.writeInt(this.ag$a);
    }
}
