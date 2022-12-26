package o;

import android.os.Build;
/* loaded from: classes3.dex */
public final class canScrollVertically {
    public static final int ag$a(int i) {
        return Build.VERSION.SDK_INT >= 23 ? i | 67108864 : i;
    }
}
