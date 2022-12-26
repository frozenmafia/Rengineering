package o;

import android.view.ViewGroup;
/* loaded from: classes3.dex */
public final class instantiateApplicationCompat {
    private static final int valueOf(int i, int i2, float f) {
        return i + ((int) ((i2 - i) * f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(ViewGroup.LayoutParams layoutParams, int i) {
        layoutParams.width = i;
        layoutParams.height = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int values(kotlin.Pair<Integer, Integer> pair, float f) {
        return valueOf(pair.getFirst().intValue(), pair.getSecond().intValue(), f);
    }
}
