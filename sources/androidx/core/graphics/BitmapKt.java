package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import easypay.manager.Constants;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes5.dex */
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, Styleable.ChangeBounds<? super Canvas, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(bitmap, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        changeBounds.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final int get(Bitmap bitmap, int i, int i2) {
        runAnimators.ag$a(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    public static final void set(Bitmap bitmap, int i, int i2, int i3) {
        runAnimators.ag$a(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        runAnimators.ag$a(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        runAnimators.ah$a(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final Bitmap scale(Bitmap bitmap, int i, int i2, boolean z) {
        runAnimators.ag$a(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        runAnimators.ah$a(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        runAnimators.ag$a(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        runAnimators.ah$a(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        runAnimators.ag$a(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        runAnimators.ah$a(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            runAnimators.ah$a(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        runAnimators.ag$a(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        runAnimators.ag$a(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        runAnimators.ah$a(createBitmap, "createBitmap(width, height, config, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace) {
        runAnimators.ag$a(config, Constants.EASY_PAY_CONFIG_PREF_KEY);
        runAnimators.ag$a(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        runAnimators.ah$a(createBitmap, "createBitmap(width, height, config, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        runAnimators.ag$a(bitmap, "<this>");
        runAnimators.ag$a(point, TtmlNode.TAG_P);
        return point.x >= 0 && point.x < bitmap.getWidth() && point.y >= 0 && point.y < bitmap.getHeight();
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        runAnimators.ag$a(bitmap, "<this>");
        runAnimators.ag$a(pointF, TtmlNode.TAG_P);
        return pointF.x >= 0.0f && pointF.x < ((float) bitmap.getWidth()) && pointF.y >= 0.0f && pointF.y < ((float) bitmap.getHeight());
    }
}
