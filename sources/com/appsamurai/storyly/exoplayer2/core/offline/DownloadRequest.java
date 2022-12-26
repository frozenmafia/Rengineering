package com.appsamurai.storyly.exoplayer2.core.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsamurai.storyly.exoplayer2.common.offline.StreamKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.getElevationDegrees;
/* loaded from: classes6.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: com.appsamurai.storyly.exoplayer2.core.offline.DownloadRequest.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ah$a */
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };
    public final List<StreamKey> HaptikSDK$a;
    public final Uri HaptikSDK$b;
    public final byte[] ag$a;
    public final String ah$a;
    public final byte[] toString;
    public final String valueOf;
    public final String values;

    /* loaded from: classes6.dex */
    public static class UnsupportedRequestException extends IOException {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    DownloadRequest(Parcel parcel) {
        this.valueOf = (String) getElevationDegrees.ah$a(parcel.readString());
        this.HaptikSDK$b = Uri.parse((String) getElevationDegrees.ah$a(parcel.readString()));
        this.values = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.HaptikSDK$a = Collections.unmodifiableList(arrayList);
        this.ag$a = parcel.createByteArray();
        this.ah$a = parcel.readString();
        this.toString = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    public String toString() {
        return this.values + ":" + this.valueOf;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DownloadRequest) {
            DownloadRequest downloadRequest = (DownloadRequest) obj;
            return this.valueOf.equals(downloadRequest.valueOf) && this.HaptikSDK$b.equals(downloadRequest.HaptikSDK$b) && getElevationDegrees.values(this.values, downloadRequest.values) && this.HaptikSDK$a.equals(downloadRequest.HaptikSDK$a) && Arrays.equals(this.ag$a, downloadRequest.ag$a) && getElevationDegrees.values(this.ah$a, downloadRequest.ah$a) && Arrays.equals(this.toString, downloadRequest.toString);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int hashCode2 = this.HaptikSDK$b.hashCode();
        String str = this.values;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int hashCode4 = this.HaptikSDK$a.hashCode();
        int hashCode5 = Arrays.hashCode(this.ag$a);
        String str2 = this.ah$a;
        return (((((((((((hashCode * 31 * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.toString);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueOf);
        parcel.writeString(this.HaptikSDK$b.toString());
        parcel.writeString(this.values);
        parcel.writeInt(this.HaptikSDK$a.size());
        for (int i2 = 0; i2 < this.HaptikSDK$a.size(); i2++) {
            parcel.writeParcelable(this.HaptikSDK$a.get(i2), 0);
        }
        parcel.writeByteArray(this.ag$a);
        parcel.writeString(this.ah$a);
        parcel.writeByteArray(this.toString);
    }
}
