package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class b {
    public static final b a = new b(new a[0]);
    private static final a d = new a().c();
    private final a[] e;
    public final long c = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f782b = 0;

    private b(a[] aVarArr) {
        this.e = aVarArr;
    }

    public final a a(int i) {
        return i < 0 ? d : this.e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return cp.V(null, null) && Arrays.equals(this.e, ((b) obj).e);
    }

    public final int hashCode() {
        return (((int) C.TIME_UNSET) * 961) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
