package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o.runAnimators;
/* loaded from: classes.dex */
public final class DrawableKt {
    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i, i2, config);
    }

    public static final Bitmap toBitmap(Drawable drawable, int i, int i2, Bitmap.Config config) {
        runAnimators.ag$a(drawable, "<this>");
        if ((drawable instanceof BitmapDrawable) && (config == null || ((BitmapDrawable) drawable).getBitmap().getConfig() == config)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (i == bitmapDrawable.getIntrinsicWidth() && i2 == bitmapDrawable.getIntrinsicHeight()) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                runAnimators.ah$a(bitmap, "bitmap");
                return bitmap;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            runAnimators.ah$a(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
            return createScaledBitmap;
        }
        Rect bounds = drawable.getBounds();
        runAnimators.ah$a(bounds, "bounds");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        runAnimators.ah$a(createBitmap, "bitmap");
        return createBitmap;
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i2 = drawable.getBounds().top;
        }
        if ((i5 & 4) != 0) {
            i3 = drawable.getBounds().right;
        }
        if ((i5 & 8) != 0) {
            i4 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i, i2, i3, i4);
    }

    public static final void updateBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        runAnimators.ag$a(drawable, "<this>");
        drawable.setBounds(i, i2, i3, i4);
    }
}
