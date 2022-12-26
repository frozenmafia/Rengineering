package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import o.WindowInsetsAnimationCompat;
import o.WindowInsetsAnimationControllerCompat;
/* loaded from: classes3.dex */
final class getCurrentFraction {
    private static final scaleXBy valueOf = new setUpdateListener() { // from class: o.getCurrentFraction.2
        @Override // o.setUpdateListener, o.scaleXBy
        public void values(Bitmap bitmap) {
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewKt$postDelayed$runnable$1<Bitmap> ag$a(scaleXBy scalexby, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof android.graphics.drawable.Animatable) {
            bitmap = null;
        } else {
            bitmap = toString(scalexby, current, i, i2);
            z = true;
        }
        if (!z) {
            scalexby = valueOf;
        }
        return WindowInsetsAnimationCompat.Impl30.ProxyCallback.valueOf(bitmap, scalexby);
    }

    private static Bitmap toString(scaleXBy scalexby, Drawable drawable, int i, int i2) {
        Lock lock;
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            lock = WindowInsetsAnimationControllerCompat.Impl.values;
            lock.lock();
            Bitmap scalexby2 = scalexby.toString(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(scalexby2);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return scalexby2;
            } finally {
                lock.unlock();
            }
        }
    }
}
