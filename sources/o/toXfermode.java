package o;

import java.util.List;
import o.ViewPager2;
/* loaded from: classes3.dex */
public final class toXfermode {
    public final int ag$a;
    public final int ah$a;
    public final List<TypefaceCompat> valueOf;
    public final int values;

    public /* synthetic */ toXfermode(int i, int i2, int i3, int i4, List list) {
        if (11 != (i & 11)) {
            ViewPager2.AnonymousClass4.values(i, 11, toXfermode$ah$a.ag$a.values());
        }
        this.ag$a = i2;
        this.values = i3;
        if ((i & 4) == 0) {
            this.ah$a = Integer.MAX_VALUE;
        } else {
            this.ah$a = i4;
        }
        this.valueOf = list;
    }
}
