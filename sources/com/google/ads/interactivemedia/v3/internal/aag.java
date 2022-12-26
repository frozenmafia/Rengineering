package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aag implements an {
    public static final Parcelable.Creator<aag> CREATOR;
    private static final s f;
    private static final s g;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f422b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        r rVar = new r();
        rVar.ae(MimeTypes.APPLICATION_ID3);
        f = rVar.v();
        r rVar2 = new r();
        rVar2.ae(MimeTypes.APPLICATION_SCTE35);
        g = rVar2.v();
        CREATOR = new aaf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aag(Parcel parcel) {
        String readString = parcel.readString();
        int i = cp.a;
        this.a = readString;
        this.f422b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[]) cp.G(parcel.createByteArray());
    }

    public aag(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.f422b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.an
    public final /* synthetic */ void a(ak akVar) {
    }

    public final s b() {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode == -1468477611) {
            if (str.equals(EventMessage.SCTE35_SCHEME_ID)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -795945609) {
            if (hashCode == 1303648457 && str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(EventMessage.ID3_SCHEME_ID_AOM)) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            return f;
        }
        if (c != 2) {
            return null;
        }
        return g;
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
        aag aagVar = (aag) obj;
        return this.c == aagVar.c && this.d == aagVar.d && cp.V(this.a, aagVar.a) && cp.V(this.f422b, aagVar.f422b) && Arrays.equals(this.e, aagVar.e);
    }

    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            String str = this.a;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.f422b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.c;
            long j2 = this.d;
            int hashCode3 = ((((((((hashCode + BR.userTeamVM) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
            this.h = hashCode3;
            return hashCode3;
        }
        return i;
    }

    public final String toString() {
        String str = this.a;
        long j = this.d;
        long j2 = this.c;
        String str2 = this.f422b;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.f422b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }
}
