package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import o.FragmentLifecycleCallbacksDispatcher;
/* loaded from: classes4.dex */
public class mergeTransitionsTogether {
    private static final Point ah$a = new Point();
    private static final Point toString = new Point();
    private static final Point ag$a = new Point();

    mergeTransitionsTogether() {
    }

    public static Point values(Context context) {
        Display defaultDisplay = ((WindowManager) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        Point point = ah$a;
        Point point2 = toString;
        defaultDisplay.getCurrentSizeRange(point, point2);
        Point point3 = ag$a;
        defaultDisplay.getSize(point3);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        if (point3.x < point3.y) {
            return new Point(point.x, point2.y + i);
        }
        return new Point(point2.x, point.y + i);
    }
}
