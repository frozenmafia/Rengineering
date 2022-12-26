package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
/* loaded from: classes7.dex */
public class generateContentView implements getContentViewLayoutResource {
    @Override // o.getContentViewLayoutResource
    public void toString(Canvas canvas, MediaBrowserServiceCompat.ServiceHandler serviceHandler, MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, Paint paint) {
        float valueOf = serviceHandler.valueOf() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getServiceComponentByAction.valueOf(1.0f));
        float f3 = f - valueOf;
        float f4 = f2 - valueOf;
        float f5 = f + valueOf;
        float f6 = valueOf + f2;
        canvas.drawLine(f3, f4, f5, f6, paint);
        canvas.drawLine(f5, f4, f3, f6, paint);
    }
}
