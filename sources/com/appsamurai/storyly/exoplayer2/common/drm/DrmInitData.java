package com.appsamurai.storyly.exoplayer2.common.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import o.DrawableKt;
import o.FingerprintManagerCompat;
import o.getElevationDegrees;
/* loaded from: classes3.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new Parcelable.Creator<DrmInitData>() { // from class: com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    };
    public final String ag$a;
    public final int toString;
    private int valueOf;
    private final SchemeData[] values;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static DrmInitData ah$a(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        SchemeData[] schemeDataArr;
        SchemeData[] schemeDataArr2;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.ag$a;
            for (SchemeData schemeData : drmInitData.values) {
                if (schemeData.ah$a()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.ag$a;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.values) {
                if (schemeData2.ah$a() && !valueOf(arrayList, size, schemeData2.valueOf)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.ag$a = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.values = schemeDataArr;
        this.toString = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.ag$a = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) getElevationDegrees.ah$a((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.values = schemeDataArr;
        this.toString = schemeDataArr.length;
    }

    public SchemeData valueOf(int i) {
        return this.values[i];
    }

    public DrmInitData ag$a(String str) {
        return getElevationDegrees.values(this.ag$a, str) ? this : new DrmInitData(str, false, this.values);
    }

    public DrmInitData ag$a(DrmInitData drmInitData) {
        String str;
        String str2 = this.ag$a;
        FingerprintManagerCompat.ah$a(str2 == null || (str = drmInitData.ag$a) == null || TextUtils.equals(str2, str));
        String str3 = this.ag$a;
        if (str3 == null) {
            str3 = drmInitData.ag$a;
        }
        return new DrmInitData(str3, (SchemeData[]) getElevationDegrees.valueOf(this.values, drmInitData.values));
    }

    public int hashCode() {
        if (this.valueOf == 0) {
            String str = this.ag$a;
            this.valueOf = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.values);
        }
        return this.valueOf;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return getElevationDegrees.values(this.ag$a, drmInitData.ag$a) && Arrays.equals(this.values, drmInitData.values);
    }

    @Override // java.util.Comparator
    /* renamed from: values */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (DrawableKt.ag$a.equals(schemeData.valueOf)) {
            return DrawableKt.ag$a.equals(schemeData2.valueOf) ? 0 : 1;
        }
        return schemeData.valueOf.compareTo(schemeData2.valueOf);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ag$a);
        parcel.writeTypedArray(this.values, 0);
    }

    private static boolean valueOf(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).valueOf.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes3.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new Parcelable.Creator<SchemeData>() { // from class: com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData.SchemeData.4
            @Override // android.os.Parcelable.Creator
            /* renamed from: toString */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ag$a */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        };
        public final String ag$a;
        private int ah$a;
        public final byte[] toString;
        public final UUID valueOf;
        public final String values;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.valueOf = (UUID) FingerprintManagerCompat.toString(uuid);
            this.values = str;
            this.ag$a = (String) FingerprintManagerCompat.toString(str2);
            this.toString = bArr;
        }

        SchemeData(Parcel parcel) {
            this.valueOf = new UUID(parcel.readLong(), parcel.readLong());
            this.values = parcel.readString();
            this.ag$a = (String) getElevationDegrees.ah$a(parcel.readString());
            this.toString = parcel.createByteArray();
        }

        public boolean ag$a(UUID uuid) {
            return DrawableKt.ag$a.equals(this.valueOf) || uuid.equals(this.valueOf);
        }

        public boolean ah$a() {
            return this.toString != null;
        }

        public SchemeData valueOf(byte[] bArr) {
            return new SchemeData(this.valueOf, this.values, this.ag$a, bArr);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SchemeData) {
                if (obj == this) {
                    return true;
                }
                SchemeData schemeData = (SchemeData) obj;
                return getElevationDegrees.values(this.values, schemeData.values) && getElevationDegrees.values(this.ag$a, schemeData.ag$a) && getElevationDegrees.values(this.valueOf, schemeData.valueOf) && Arrays.equals(this.toString, schemeData.toString);
            }
            return false;
        }

        public int hashCode() {
            if (this.ah$a == 0) {
                int hashCode = this.valueOf.hashCode();
                String str = this.values;
                this.ah$a = (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.ag$a.hashCode()) * 31) + Arrays.hashCode(this.toString);
            }
            return this.ah$a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.valueOf.getMostSignificantBits());
            parcel.writeLong(this.valueOf.getLeastSignificantBits());
            parcel.writeString(this.values);
            parcel.writeString(this.ag$a);
            parcel.writeByteArray(this.toString);
        }
    }
}
