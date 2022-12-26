package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
/* loaded from: classes3.dex */
public interface computeHorizontalScrollOffset {

    /* loaded from: classes3.dex */
    public static final class valueOf implements computeHorizontalScrollOffset {
        public static final valueOf toString = new valueOf();

        @Override // o.computeHorizontalScrollOffset
        public void ah$a(Canvas canvas, Paint paint, float f) {
            runAnimators.ag$a(canvas, "canvas");
            runAnimators.ag$a(paint, "paint");
            canvas.drawRect(0.0f, 0.0f, f, f, paint);
        }
    }

    /* loaded from: classes3.dex */
    public static final class values implements computeHorizontalScrollOffset {
        public static final values valueOf = new values();
        public static final RectF ah$a = new RectF();

        @Override // o.computeHorizontalScrollOffset
        public void ah$a(Canvas canvas, Paint paint, float f) {
            runAnimators.ag$a(canvas, "canvas");
            runAnimators.ag$a(paint, "paint");
            RectF rectF = ah$a;
            rectF.set(0.0f, 0.0f, f, f);
            canvas.drawOval(rectF, paint);
        }
    }

    void ah$a(Canvas canvas, Paint paint, float f);
}
