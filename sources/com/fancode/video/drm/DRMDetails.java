package com.fancode.video.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class DRMDetails implements Parcelable {
    public static final Parcelable.Creator<DRMDetails> CREATOR = new Parcelable.Creator<DRMDetails>() { // from class: com.fancode.video.drm.DRMDetails$ag$a
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public final DRMDetails createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            runAnimators.ag$a(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DRMDetails(readString, linkedHashMap, DRMProvider.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: valueOf */
        public final DRMDetails[] newArray(int i) {
            return new DRMDetails[i];
        }
    };
    private String ag$a;
    private Map<String, String> toString;
    private DRMProvider valueOf;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        Map<String, String> map = this.toString;
        return (((hashCode * 31) + (map == null ? 0 : map.hashCode())) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        String str = this.ag$a;
        Map<String, String> map = this.toString;
        DRMProvider dRMProvider = this.valueOf;
        return "DRMDetails(licenceUrl=" + str + ", headers=" + map + ", provider=" + dRMProvider + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeString(this.ag$a);
        Map<String, String> map = this.toString;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.valueOf.name());
    }

    public DRMDetails(String str, Map<String, String> map, DRMProvider dRMProvider) {
        runAnimators.ag$a(str, "licenceUrl");
        runAnimators.ag$a(dRMProvider, "provider");
        this.ag$a = str;
        this.toString = map;
        this.valueOf = dRMProvider;
    }

    public /* synthetic */ DRMDetails(String str, Map map, DRMProvider dRMProvider, int i, getTargetTypes gettargettypes) {
        this(str, (i & 2) != 0 ? null : map, dRMProvider);
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final DRMProvider ag$a() {
        return this.valueOf;
    }

    public final String ah$a() {
        String name = this.valueOf.name();
        String str = this.ag$a;
        return name + str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DRMDetails)) {
            return false;
        }
        return runAnimators.values((Object) ah$a(), (Object) ((DRMDetails) obj).ah$a());
    }
}
