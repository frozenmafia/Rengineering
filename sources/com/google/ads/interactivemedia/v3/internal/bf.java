package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class bf {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f819b;
    public final int c;
    private final s[] d;
    private int e;

    public bf(String str, s... sVarArr) {
        int length = sVarArr.length;
        int i = 1;
        af.u(length > 0);
        this.f819b = str;
        this.d = sVarArr;
        this.a = length;
        int b2 = ar.b(sVarArr[0].l);
        this.c = b2 == -1 ? ar.b(sVarArr[0].k) : b2;
        String d = d(sVarArr[0].c);
        int c = c(sVarArr[0].e);
        while (true) {
            s[] sVarArr2 = this.d;
            if (i >= sVarArr2.length) {
                return;
            }
            if (d.equals(d(sVarArr2[i].c))) {
                s[] sVarArr3 = this.d;
                if (c != c(sVarArr3[i].e)) {
                    e("role flags", Integer.toBinaryString(sVarArr3[0].e), Integer.toBinaryString(this.d[i].e), i);
                    return;
                }
                i++;
            } else {
                s[] sVarArr4 = this.d;
                e("languages", sVarArr4[0].c, sVarArr4[i].c, i);
                return;
            }
        }
    }

    private static int c(int i) {
        return i | 16384;
    }

    private static String d(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static void e(String str, String str2, String str3, int i) {
        cc.c("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final int a(s sVar) {
        int i = 0;
        while (true) {
            s[] sVarArr = this.d;
            if (i >= sVarArr.length) {
                return -1;
            }
            if (sVar == sVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final s b(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bf bfVar = (bf) obj;
        return this.f819b.equals(bfVar.f819b) && Arrays.equals(this.d, bfVar.d);
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = ((this.f819b.hashCode() + BR.userTeamVM) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }
}
