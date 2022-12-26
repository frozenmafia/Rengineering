package o;

import android.widget.ImageView;
/* loaded from: classes4.dex */
class onLoadItem {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ag$a(int i) {
        return (i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    onLoadItem() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ag$a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean toString(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* renamed from: o.onLoadItem$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ah$a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean valueOf(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass2.ah$a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
