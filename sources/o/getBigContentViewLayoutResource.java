package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
/* loaded from: classes7.dex */
public class getBigContentViewLayoutResource implements getContentViewLayoutResource {
    @Override // o.getContentViewLayoutResource
    public void toString(Canvas canvas, MediaBrowserServiceCompat.ServiceHandler serviceHandler, MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, Paint paint) {
        float valueOf = serviceHandler.valueOf() / 2.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getServiceComponentByAction.valueOf(1.0f));
        canvas.drawLine(f - valueOf, f2, f + valueOf, f2, paint);
        canvas.drawLine(f, f2 - valueOf, f, f2 + valueOf, paint);
    }
}
