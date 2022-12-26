package o;

import android.graphics.Canvas;
import android.os.Build;
/* loaded from: classes5.dex */
public class putInt {
    public static int toString(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
