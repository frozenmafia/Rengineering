package o;

import android.os.SystemClock;
import java.util.Date;
/* loaded from: classes.dex */
public class getCachedColorStateList {
    private static getCachedColorStateList ah$a;
    private Long toString = Long.valueOf(new Date().getTime() - SystemClock.elapsedRealtime());

    private getCachedColorStateList() {
    }

    public void ag$a(Long l) {
        if (l.longValue() > 0) {
            this.toString = Long.valueOf(l.longValue() - SystemClock.elapsedRealtime());
        }
    }

    public static getCachedColorStateList ag$a() {
        getCachedColorStateList getcachedcolorstatelist;
        synchronized (getCachedColorStateList.class) {
            if (ah$a == null) {
                ah$a = new getCachedColorStateList();
            }
            getcachedcolorstatelist = ah$a;
        }
        return getcachedcolorstatelist;
    }

    public Long ah$a() {
        return Long.valueOf(this.toString.longValue() + SystemClock.elapsedRealtime());
    }
}
