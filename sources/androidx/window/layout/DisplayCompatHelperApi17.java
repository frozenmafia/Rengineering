package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        runAnimators.ag$a(display, ViewProps.DISPLAY);
        runAnimators.ag$a(point, "point");
        display.getRealSize(point);
    }
}
