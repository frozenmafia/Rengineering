package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PorterDuffKt {
    public static final PorterDuffXfermode toXfermode(PorterDuff.Mode mode) {
        runAnimators.ag$a(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }

    public static final PorterDuffColorFilter toColorFilter(PorterDuff.Mode mode, int i) {
        runAnimators.ag$a(mode, "<this>");
        return new PorterDuffColorFilter(i, mode);
    }
}
