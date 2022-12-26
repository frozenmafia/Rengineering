package com.appsamurai.storyly.exoplayer2.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.createFromIcon;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new Parcelable.Creator<HlsTrackMetadataEntry>() { // from class: com.appsamurai.storyly.exoplayer2.hls.HlsTrackMetadataEntry.5
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public HlsTrackMetadataEntry[] newArray(int i) {
            return new HlsTrackMetadataEntry[i];
        }
    };
    public final String ag$a;
    public final List<VariantInfo> valueOf;
    public final String values;

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

    /* loaded from: classes3.dex */
    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new Parcelable.Creator<VariantInfo>() { // from class: com.appsamurai.storyly.exoplayer2.hls.HlsTrackMetadataEntry.VariantInfo.4
            @Override // android.os.Parcelable.Creator
            /* renamed from: toString */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ah$a */
            public VariantInfo[] newArray(int i) {
                return new VariantInfo[i];
            }
        };
        public final String HaptikSDK$c;
        public final String ag$a;
        public final int ah$a;
        public final String toString;
        public final String valueOf;
        public final int values;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public VariantInfo(int i, int i2, String str, String str2, String str3, String str4) {
            this.values = i;
            this.ah$a = i2;
            this.HaptikSDK$c = str;
            this.valueOf = str2;
            this.toString = str3;
            this.ag$a = str4;
        }

        VariantInfo(Parcel parcel) {
            this.values = parcel.readInt();
            this.ah$a = parcel.readInt();
            this.HaptikSDK$c = parcel.readString();
            this.valueOf = parcel.readString();
            this.toString = parcel.readString();
            this.ag$a = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.values == variantInfo.values && this.ah$a == variantInfo.ah$a && TextUtils.equals(this.HaptikSDK$c, variantInfo.HaptikSDK$c) && TextUtils.equals(this.valueOf, variantInfo.valueOf) && TextUtils.equals(this.toString, variantInfo.toString) && TextUtils.equals(this.ag$a, variantInfo.ag$a);
        }

        public int hashCode() {
            int i = this.values;
            int i2 = this.ah$a;
            String str = this.HaptikSDK$c;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.valueOf;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.toString;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.ag$a;
            return (((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.values);
            parcel.writeInt(this.ah$a);
            parcel.writeString(this.HaptikSDK$c);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.toString);
            parcel.writeString(this.ag$a);
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<VariantInfo> list) {
        this.ag$a = str;
        this.values = str2;
        this.valueOf = Collections.unmodifiableList(new ArrayList(list));
    }

    HlsTrackMetadataEntry(Parcel parcel) {
        this.ag$a = parcel.readString();
        this.values = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.valueOf = Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.ag$a != null) {
            str = " [" + this.ag$a + ", " + this.values + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.ag$a, hlsTrackMetadataEntry.ag$a) && TextUtils.equals(this.values, hlsTrackMetadataEntry.values) && this.valueOf.equals(hlsTrackMetadataEntry.valueOf);
    }

    public int hashCode() {
        String str = this.ag$a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.values;
        return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.valueOf.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ag$a);
        parcel.writeString(this.values);
        int size = this.valueOf.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.valueOf.get(i2), 0);
        }
    }
}
