package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import o.MediaBrowserServiceCompat;
import o.onSetVolumeTo;
/* loaded from: classes4.dex */
class onSetVolumeTo$ag$a {
    final /* synthetic */ onSetVolumeTo ag$a;
    private Bitmap[] ah$a;
    private Path valueOf;

    private onSetVolumeTo$ag$a(onSetVolumeTo onsetvolumeto) {
        this.ag$a = onsetvolumeto;
        this.valueOf = new Path();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ onSetVolumeTo$ag$a(onSetVolumeTo onsetvolumeto, onSetVolumeTo.AnonymousClass5 anonymousClass5) {
        this(onsetvolumeto);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean values(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6 anonymousClass6) {
        int valueOf = anonymousClass6.valueOf();
        Bitmap[] bitmapArr = this.ah$a;
        if (bitmapArr == null) {
            this.ah$a = new Bitmap[valueOf];
        } else if (bitmapArr.length == valueOf) {
            return false;
        } else {
            this.ah$a = new Bitmap[valueOf];
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6 anonymousClass6, boolean z, boolean z2) {
        int valueOf = anonymousClass6.valueOf();
        float ag$a = anonymousClass6.ag$a();
        float ah$a = anonymousClass6.ah$a();
        for (int i = 0; i < valueOf; i++) {
            int i2 = (int) (ag$a * 2.1d);
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            this.ah$a[i] = createBitmap;
            this.ag$a.ah$b.setColor(anonymousClass6.toString(i));
            if (z2) {
                this.valueOf.reset();
                this.valueOf.addCircle(ag$a, ag$a, ag$a, Path.Direction.CW);
                this.valueOf.addCircle(ag$a, ag$a, ah$a, Path.Direction.CCW);
                canvas.drawPath(this.valueOf, this.ag$a.ah$b);
            } else {
                canvas.drawCircle(ag$a, ag$a, ag$a, this.ag$a.ah$b);
                if (z) {
                    canvas.drawCircle(ag$a, ag$a, ah$a, this.ag$a.HaptikSDK$d);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bitmap ag$a(int i) {
        Bitmap[] bitmapArr = this.ah$a;
        return bitmapArr[i % bitmapArr.length];
    }
}
