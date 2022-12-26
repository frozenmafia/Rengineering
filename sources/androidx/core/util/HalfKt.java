package androidx.core.util;

import android.util.Half;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class HalfKt {
    public static final Half toHalf(short s) {
        Half valueOf = Half.valueOf(s);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final Half toHalf(float f) {
        Half valueOf = Half.valueOf(f);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final Half toHalf(String str) {
        runAnimators.ag$a(str, "<this>");
        Half valueOf = Half.valueOf(str);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final Half toHalf(double d) {
        Half valueOf = Half.valueOf((float) d);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }
}
