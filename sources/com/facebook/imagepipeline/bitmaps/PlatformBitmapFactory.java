package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.view.ViewCompat;
import o.Fragment;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public abstract class PlatformBitmapFactory {
    public abstract FragmentActivity.AnonymousClass1<Bitmap> createBitmapInternal(int i, int i2, Bitmap.Config config);

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int i, int i2, Bitmap.Config config) {
        return createBitmap(i, i2, config, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int i, int i2) {
        return createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int i, int i2, Bitmap.Config config, Object obj) {
        return createBitmapInternal(i, i2, config);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int i, int i2, Object obj) {
        return createBitmap(i, i2, Bitmap.Config.ARGB_8888, obj);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(Bitmap bitmap) {
        return createBitmap(bitmap, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(Bitmap bitmap, Object obj) {
        return createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), obj);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(Bitmap bitmap, int i, int i2, int i3, int i4) {
        return createBitmap(bitmap, i, i2, i3, i4, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, Object obj) {
        return createBitmap(bitmap, i, i2, i3, i4, (Matrix) null, false, obj);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, Matrix matrix, boolean z) {
        return createBitmap(bitmap, i, i2, i3, i4, matrix, z, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createScaledBitmap(Bitmap bitmap, int i, int i2, boolean z) {
        return createScaledBitmap(bitmap, i, i2, z, null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createScaledBitmap(Bitmap bitmap, int i, int i2, boolean z, Object obj) {
        checkWidthHeight(i, i2);
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.setScale(i / width, i2 / height);
        return createBitmap(bitmap, 0, 0, width, height, matrix, z, obj);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, Matrix matrix, boolean z, Object obj) {
        FragmentActivity.AnonymousClass1<Bitmap> createBitmap;
        Canvas canvas;
        Paint paint;
        Fragment.AnonymousClass8.values(bitmap, "Source bitmap cannot be null");
        checkXYSign(i, i2);
        checkWidthHeight(i3, i4);
        checkFinalImageBounds(bitmap, i, i2, i3, i4);
        Rect rect = new Rect(i, i2, i + i3, i2 + i4);
        RectF rectF = new RectF(0.0f, 0.0f, i3, i4);
        Bitmap.Config suitableBitmapConfig = getSuitableBitmapConfig(bitmap);
        if (matrix == null || matrix.isIdentity()) {
            createBitmap = createBitmap(i3, i4, suitableBitmapConfig, bitmap.hasAlpha(), obj);
            setPropertyFromSourceBitmap(bitmap, createBitmap.HaptikSDK$c());
            canvas = new Canvas(createBitmap.HaptikSDK$c());
            paint = null;
        } else {
            boolean z2 = !matrix.rectStaysRect();
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            int round = Math.round(rectF2.width());
            int round2 = Math.round(rectF2.height());
            if (z2) {
                suitableBitmapConfig = Bitmap.Config.ARGB_8888;
            }
            createBitmap = createBitmap(round, round2, suitableBitmapConfig, z2 || bitmap.hasAlpha(), obj);
            setPropertyFromSourceBitmap(bitmap, createBitmap.HaptikSDK$c());
            canvas = new Canvas(createBitmap.HaptikSDK$c());
            canvas.translate(-rectF2.left, -rectF2.top);
            canvas.concat(matrix);
            paint = new Paint();
            paint.setFilterBitmap(z);
            if (z2) {
                paint.setAntiAlias(true);
            }
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int i, int i2, Bitmap.Config config) {
        return createBitmap(displayMetrics, i, i2, config, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int i, int i2, Bitmap.Config config, Object obj) {
        return createBitmap(displayMetrics, i, i2, config, true, obj);
    }

    private FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int i, int i2, Bitmap.Config config, boolean z) {
        return createBitmap(i, i2, config, z, (Object) null);
    }

    private FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int i, int i2, Bitmap.Config config, boolean z, Object obj) {
        return createBitmap((DisplayMetrics) null, i, i2, config, z, obj);
    }

    private FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int i, int i2, Bitmap.Config config, boolean z) {
        return createBitmap(displayMetrics, i, i2, config, z, (Object) null);
    }

    private FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int i, int i2, Bitmap.Config config, boolean z, Object obj) {
        checkWidthHeight(i, i2);
        FragmentActivity.AnonymousClass1<Bitmap> createBitmapInternal = createBitmapInternal(i, i2, config);
        Bitmap HaptikSDK$c = createBitmapInternal.HaptikSDK$c();
        if (displayMetrics != null) {
            HaptikSDK$c.setDensity(displayMetrics.densityDpi);
        }
        if (Build.VERSION.SDK_INT >= 12) {
            HaptikSDK$c.setHasAlpha(z);
        }
        if (config == Bitmap.Config.ARGB_8888 && !z) {
            HaptikSDK$c.eraseColor(ViewCompat.MEASURED_STATE_MASK);
        }
        return createBitmapInternal;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int[] iArr, int i, int i2, Bitmap.Config config) {
        return createBitmap(iArr, i, i2, config, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(int[] iArr, int i, int i2, Bitmap.Config config, Object obj) {
        FragmentActivity.AnonymousClass1<Bitmap> createBitmapInternal = createBitmapInternal(i, i2, config);
        createBitmapInternal.HaptikSDK$c().setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmapInternal;
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int[] iArr, int i, int i2, Bitmap.Config config) {
        return createBitmap(displayMetrics, iArr, i, i2, config, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int[] iArr, int i, int i2, Bitmap.Config config, Object obj) {
        return createBitmap(displayMetrics, iArr, 0, i, i, i2, config, obj);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int[] iArr, int i, int i2, int i3, int i4, Bitmap.Config config) {
        return createBitmap(displayMetrics, iArr, i, i2, i3, i4, config, (Object) null);
    }

    public FragmentActivity.AnonymousClass1<Bitmap> createBitmap(DisplayMetrics displayMetrics, int[] iArr, int i, int i2, int i3, int i4, Bitmap.Config config, Object obj) {
        FragmentActivity.AnonymousClass1<Bitmap> createBitmap = createBitmap(displayMetrics, i3, i4, config, obj);
        createBitmap.HaptikSDK$c().setPixels(iArr, i, i2, 0, 0, i3, i4);
        return createBitmap;
    }

    private static Bitmap.Config getSuitableBitmapConfig(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = bitmap.getConfig();
        if (config2 != null) {
            int i = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return Bitmap.Config.ALPHA_8;
                }
                return Bitmap.Config.ARGB_8888;
            }
            return Bitmap.Config.RGB_565;
        }
        return config;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void checkWidthHeight(int i, int i2) {
        Fragment.AnonymousClass8.valueOf(i > 0, "width must be > 0");
        Fragment.AnonymousClass8.valueOf(i2 > 0, "height must be > 0");
    }

    private static void checkXYSign(int i, int i2) {
        Fragment.AnonymousClass8.valueOf(i >= 0, "x must be >= 0");
        Fragment.AnonymousClass8.valueOf(i2 >= 0, "y must be >= 0");
    }

    private static void checkFinalImageBounds(Bitmap bitmap, int i, int i2, int i3, int i4) {
        Fragment.AnonymousClass8.valueOf(i + i3 <= bitmap.getWidth(), "x + width must be <= bitmap.width()");
        Fragment.AnonymousClass8.valueOf(i2 + i4 <= bitmap.getHeight(), "y + height must be <= bitmap.height()");
    }

    private static void setPropertyFromSourceBitmap(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
        if (Build.VERSION.SDK_INT >= 12) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap2.setPremultiplied(bitmap.isPremultiplied());
        }
    }
}
