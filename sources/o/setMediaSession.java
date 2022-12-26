package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
/* loaded from: classes7.dex */
public class setMediaSession implements getContentViewLayoutResource {
    @Override // o.getContentViewLayoutResource
    public void toString(Canvas canvas, MediaBrowserServiceCompat.ServiceHandler serviceHandler, MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getServiceComponentByAction.valueOf(1.0f));
        float valueOf = (serviceHandler.valueOf() / 2.0f) * 2.0f;
        float f3 = f2 - valueOf;
        canvas.drawLine(f, f3, f + valueOf, f2, paint);
        canvas.drawLine(f, f3, f - valueOf, f2, paint);
    }
}
