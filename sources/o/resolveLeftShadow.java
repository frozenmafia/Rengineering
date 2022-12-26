package o;

import android.content.res.Resources;
/* loaded from: classes.dex */
public final class resolveLeftShadow {
    public static final int toString(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int values(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }
}
