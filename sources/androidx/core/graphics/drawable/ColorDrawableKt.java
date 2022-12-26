package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ColorDrawableKt {
    public static final ColorDrawable toDrawable(int i) {
        return new ColorDrawable(i);
    }

    public static final ColorDrawable toDrawable(Color color) {
        runAnimators.ag$a(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
