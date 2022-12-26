package com.appsamurai.storyly.exoplayer2.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import o.createFromIcon;
import o.createFromIcon$ag$a;
import o.getElevationDegrees;
import o.getResId;
import o.updateDstRect;
/* loaded from: classes3.dex */
public final class EventMessage implements Metadata.Entry {
    public final byte[] ag$a;
    public final String ah$a;
    private int invoke;
    public final long toString;
    public final String valueOf;
    public final long values;
    private static final createFromIcon HaptikSDK$a = new createFromIcon$ag$a().invoke(MimeTypes.APPLICATION_ID3).valueOf();
    private static final createFromIcon HaptikSDK$b = new createFromIcon$ag$a().invoke(MimeTypes.APPLICATION_SCTE35).valueOf();
    public static final Parcelable.Creator<EventMessage> CREATOR = new Parcelable.Creator<EventMessage>() { // from class: com.appsamurai.storyly.exoplayer2.extractor.metadata.emsg.EventMessage.4
        @Override // android.os.Parcelable.Creator
        /* renamed from: values */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ag$a */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public /* synthetic */ void valueOf(getResId.values valuesVar) {
        updateDstRect.valueOf(this, valuesVar);
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.valueOf = str;
        this.ah$a = str2;
        this.values = j;
        this.toString = j2;
        this.ag$a = bArr;
    }

    EventMessage(Parcel parcel) {
        this.valueOf = (String) getElevationDegrees.ah$a(parcel.readString());
        this.ah$a = (String) getElevationDegrees.ah$a(parcel.readString());
        this.values = parcel.readLong();
        this.toString = parcel.readLong();
        this.ag$a = (byte[]) getElevationDegrees.ah$a(parcel.createByteArray());
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public createFromIcon valueOf() {
        char c;
        String str = this.valueOf;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1468477611) {
            if (str.equals(com.google.android.exoplayer2.metadata.emsg.EventMessage.SCTE35_SCHEME_ID)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -795945609) {
            if (hashCode == 1303648457 && str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(com.google.android.exoplayer2.metadata.emsg.EventMessage.ID3_SCHEME_ID_AOM)) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1 || c == 2) {
                return HaptikSDK$a;
            }
            return null;
        }
        return HaptikSDK$b;
    }

    @Override // com.appsamurai.storyly.exoplayer2.common.metadata.Metadata.Entry
    public byte[] ah$a() {
        if (valueOf() != null) {
            return this.ag$a;
        }
        return null;
    }

    public int hashCode() {
        if (this.invoke == 0) {
            String str = this.valueOf;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.ah$a;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.values;
            long j2 = this.toString;
            int hashCode3 = Arrays.hashCode(this.ag$a);
            this.invoke = ((((((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + hashCode3;
        }
        return this.invoke;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.values == eventMessage.values && this.toString == eventMessage.toString && getElevationDegrees.values(this.valueOf, eventMessage.valueOf) && getElevationDegrees.values(this.ah$a, eventMessage.ah$a) && Arrays.equals(this.ag$a, eventMessage.ag$a);
    }

    public String toString() {
        return "EMSG: scheme=" + this.valueOf + ", id=" + this.toString + ", durationMs=" + this.values + ", value=" + this.ah$a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueOf);
        parcel.writeString(this.ah$a);
        parcel.writeLong(this.values);
        parcel.writeLong(this.toString);
        parcel.writeByteArray(this.ag$a);
    }
}
