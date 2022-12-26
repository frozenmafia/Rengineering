package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
/* loaded from: classes7.dex */
public class createDecoratedMediaCustomViewStyle implements getContentViewLayoutResource {
    protected Path ag$a = new Path();

    @Override // o.getContentViewLayoutResource
    public void toString(Canvas canvas, MediaBrowserServiceCompat.ServiceHandler serviceHandler, MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, Paint paint) {
        float valueOf = serviceHandler.valueOf();
        float f3 = valueOf / 2.0f;
        float valueOf2 = (valueOf - (getServiceComponentByAction.valueOf(serviceHandler.ah$a()) * 2.0f)) / 2.0f;
        int ag$a = serviceHandler.ag$a();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.ag$a;
        path.reset();
        float f4 = f2 - f3;
        path.moveTo(f, f4);
        float f5 = f + f3;
        float f6 = f2 + f3;
        path.lineTo(f5, f6);
        float f7 = f - f3;
        path.lineTo(f7, f6);
        int i = (valueOf > 0.0d ? 1 : (valueOf == 0.0d ? 0 : -1));
        if (i > 0) {
            path.lineTo(f, f4);
            float f8 = f7 + valueOf2;
            float f9 = f6 - valueOf2;
            path.moveTo(f8, f9);
            path.lineTo(f5 - valueOf2, f9);
            path.lineTo(f, f4 + valueOf2);
            path.lineTo(f8, f9);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (i <= 0 || ag$a == 1122867) {
            return;
        }
        paint.setColor(ag$a);
        path.moveTo(f, f4 + valueOf2);
        float f10 = f6 - valueOf2;
        path.lineTo(f5 - valueOf2, f10);
        path.lineTo(f7 + valueOf2, f10);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}
