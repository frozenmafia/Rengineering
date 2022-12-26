package o;

import com.google.android.exoplayer2.C;
/* loaded from: classes3.dex */
public final class UserManagerCompat {
    public final int HaptikSDK$a;
    public final int ag$a;
    public final Object ah$a;
    public final int ah$b;
    public final createFromIcon toString;
    public final long valueOf;
    public final long values;

    public UserManagerCompat(int i) {
        this(i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public UserManagerCompat(int i, int i2, createFromIcon createfromicon, int i3, Object obj, long j, long j2) {
        this.ag$a = i;
        this.ah$b = i2;
        this.toString = createfromicon;
        this.HaptikSDK$a = i3;
        this.ah$a = obj;
        this.values = j;
        this.valueOf = j2;
    }
}
