package com.fancode.video.base;

import android.os.Parcel;
import android.os.Parcelable;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CSAI implements Parcelable {
    public static final Parcelable.Creator<CSAI> CREATOR = new valueOf();
    private DAISDKType ag$a;
    private boolean valueOf;
    private String values;

    /* loaded from: classes4.dex */
    public static final class valueOf implements Parcelable.Creator<CSAI> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public final CSAI createFromParcel(Parcel parcel) {
            runAnimators.ag$a(parcel, "parcel");
            return new CSAI(parcel.readInt() != 0, parcel.readString(), DAISDKType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: toString */
        public final CSAI[] newArray(int i) {
            return new CSAI[i];
        }
    }

    public CSAI() {
        this(false, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CSAI) {
            CSAI csai = (CSAI) obj;
            return this.valueOf == csai.valueOf && runAnimators.values((Object) this.values, (Object) csai.values) && this.ag$a == csai.ag$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.valueOf;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.values.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        boolean z = this.valueOf;
        String str = this.values;
        DAISDKType dAISDKType = this.ag$a;
        return "CSAI(enabled=" + z + ", adTagUrl=" + str + ", daiSdkType=" + dAISDKType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        runAnimators.ag$a(parcel, "out");
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeString(this.values);
        parcel.writeString(this.ag$a.name());
    }

    public CSAI(boolean z, String str, DAISDKType dAISDKType) {
        runAnimators.ag$a(str, "adTagUrl");
        runAnimators.ag$a(dAISDKType, "daiSdkType");
        this.valueOf = z;
        this.values = str;
        this.ag$a = dAISDKType;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }

    public final String values() {
        return this.values;
    }

    public /* synthetic */ CSAI(boolean z, String str, DAISDKType dAISDKType, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? DAISDKType.IMA_DAI_EXTENSION : dAISDKType);
    }
}
