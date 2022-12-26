package o;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
/* loaded from: classes4.dex */
public class createController implements DrawableFactory {
    private final DrawableFactory ag$a;
    private final Resources valueOf;

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public boolean supportsImageType(CloseableImage closeableImage) {
        return true;
    }

    public createController(Resources resources, DrawableFactory drawableFactory) {
        this.valueOf = resources;
        this.ag$a = drawableFactory;
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public Drawable createDrawable(CloseableImage closeableImage) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("DefaultDrawableFactory#createDrawable");
            }
            if (closeableImage instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.valueOf, closeableStaticBitmap.getUnderlyingBitmap());
                if (toString(closeableStaticBitmap) || ah$a(closeableStaticBitmap)) {
                    FragmentFactory fragmentFactory = new FragmentFactory(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
                    if (FrescoSystrace.isTracing()) {
                        FrescoSystrace.endSection();
                    }
                    return fragmentFactory;
                }
                return bitmapDrawable;
            }
            DrawableFactory drawableFactory = this.ag$a;
            if (drawableFactory == null || !drawableFactory.supportsImageType(closeableImage)) {
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                    return null;
                }
                return null;
            }
            Drawable createDrawable = this.ag$a.createDrawable(closeableImage);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            return createDrawable;
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    private static boolean toString(CloseableStaticBitmap closeableStaticBitmap) {
        return (closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) ? false : true;
    }

    private static boolean ah$a(CloseableStaticBitmap closeableStaticBitmap) {
        return (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0) ? false : true;
    }
}
