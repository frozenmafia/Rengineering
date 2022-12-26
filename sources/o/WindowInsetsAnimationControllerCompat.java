package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class WindowInsetsAnimationControllerCompat implements ImageHeaderParser {

    /* loaded from: classes3.dex */
    public final class Impl30 extends WindowInsetsAnimationControlListenerCompat {
        private static final byte[] values = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(valueOf);
        private final int ag$a;

        public Impl30(int i) {
            WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(i > 0, "roundingRadius must be greater than 0.");
            this.ag$a = i;
        }

        @Override // o.WindowInsetsAnimationControlListenerCompat
        protected Bitmap values(scaleXBy scalexby, Bitmap bitmap, int i, int i2) {
            return Impl.ag$a(scalexby, bitmap, this.ag$a);
        }

        @Override // o.getDescendants
        public boolean equals(Object obj) {
            return (obj instanceof Impl30) && this.ag$a == ((Impl30) obj).ag$a;
        }

        @Override // o.getDescendants
        public int hashCode() {
            int values2;
            values2 = WindowInsetsControllerCompat.Impl30.AnonymousClass1.values(this.ag$a, 17);
            return WindowInsetsControllerCompat.Impl30.AnonymousClass1.values(-569625254, values2);
        }

        @Override // o.getDescendants
        public void ag$a(MessageDigest messageDigest) {
            messageDigest.update(values);
            messageDigest.update(ByteBuffer.allocate(4).putInt(this.ag$a).array());
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType toString(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType values(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* loaded from: classes3.dex */
    public final class Impl {
        private static final Set<String> ag$a;
        private static final Paint toString;
        private static final Lock values;
        private static final Paint ah$a = new Paint(6);
        private static final Paint valueOf = new Paint(7);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public interface valueOf {
            void values(Canvas canvas, Paint paint, RectF rectF);
        }

        public static boolean ag$a(int i) {
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return true;
                default:
                    return false;
            }
        }

        public static int valueOf(int i) {
            switch (i) {
                case 3:
                case 4:
                    return 180;
                case 5:
                case 6:
                    return 90;
                case 7:
                case 8:
                    return 270;
                default:
                    return 0;
            }
        }

        static {
            HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
            ag$a = hashSet;
            values = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new toString();
            Paint paint = new Paint(7);
            toString = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }

        public static Bitmap values(scaleXBy scalexby, Bitmap bitmap, int i, int i2) {
            float width;
            float height;
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            float f = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = i2 / bitmap.getHeight();
                f = (i - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i / bitmap.getWidth();
                height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
            Bitmap scalexby2 = scalexby.toString(i, i2, ag$a(bitmap));
            toString(bitmap, scalexby2);
            ag$a(bitmap, scalexby2, matrix);
            return scalexby2;
        }

        public static Bitmap ag$a(scaleXBy scalexby, Bitmap bitmap, int i, int i2) {
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "requested target size matches input, returning input");
                }
                return bitmap;
            }
            float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int round = Math.round(bitmap.getWidth() * min);
            int round2 = Math.round(bitmap.getHeight() * min);
            if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "adjusted target size matches input, returning input");
                }
                return bitmap;
            }
            Bitmap scalexby2 = scalexby.toString((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), ag$a(bitmap));
            toString(bitmap, scalexby2);
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "request: " + i + "x" + i2);
                Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                Log.v("TransformationUtils", "toReuse: " + scalexby2.getWidth() + "x" + scalexby2.getHeight());
                StringBuilder sb = new StringBuilder();
                sb.append("minPct:   ");
                sb.append(min);
                Log.v("TransformationUtils", sb.toString());
            }
            Matrix matrix = new Matrix();
            matrix.setScale(min, min);
            ag$a(bitmap, scalexby2, matrix);
            return scalexby2;
        }

        public static Bitmap toString(scaleXBy scalexby, Bitmap bitmap, int i, int i2) {
            if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                }
                return bitmap;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return ag$a(scalexby, bitmap, i, i2);
        }

        public static void toString(Bitmap bitmap, Bitmap bitmap2) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }

        public static Bitmap values(scaleXBy scalexby, Bitmap bitmap, int i) {
            if (ag$a(i)) {
                Matrix matrix = new Matrix();
                valueOf(i, matrix);
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                Bitmap scalexby2 = scalexby.toString(Math.round(rectF.width()), Math.round(rectF.height()), ag$a(bitmap));
                matrix.postTranslate(-rectF.left, -rectF.top);
                scalexby2.setHasAlpha(bitmap.hasAlpha());
                ag$a(bitmap, scalexby2, matrix);
                return scalexby2;
            }
            return bitmap;
        }

        private static Bitmap toString(scaleXBy scalexby, Bitmap bitmap) {
            Bitmap.Config ah$a2 = ah$a(bitmap);
            if (ah$a2.equals(bitmap.getConfig())) {
                return bitmap;
            }
            Bitmap scalexby2 = scalexby.toString(bitmap.getWidth(), bitmap.getHeight(), ah$a2);
            new Canvas(scalexby2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return scalexby2;
        }

        private static Bitmap.Config ah$a(Bitmap bitmap) {
            if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
                return Bitmap.Config.RGBA_F16;
            }
            return Bitmap.Config.ARGB_8888;
        }

        public static Bitmap ag$a(scaleXBy scalexby, Bitmap bitmap, final int i) {
            WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(i > 0, "roundingRadius must be greater than 0.");
            return ag$a(scalexby, bitmap, new valueOf() { // from class: o.WindowInsetsAnimationControllerCompat.Impl.2
                @Override // o.WindowInsetsAnimationControllerCompat.Impl.valueOf
                public void values(Canvas canvas, Paint paint, RectF rectF) {
                    float f = i;
                    canvas.drawRoundRect(rectF, f, f, paint);
                }
            });
        }

        private static Bitmap ag$a(scaleXBy scalexby, Bitmap bitmap, valueOf valueof) {
            Bitmap.Config ah$a2 = ah$a(bitmap);
            Bitmap impl = toString(scalexby, bitmap);
            Bitmap scalexby2 = scalexby.toString(impl.getWidth(), impl.getHeight(), ah$a2);
            scalexby2.setHasAlpha(true);
            BitmapShader bitmapShader = new BitmapShader(impl, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            RectF rectF = new RectF(0.0f, 0.0f, scalexby2.getWidth(), scalexby2.getHeight());
            Lock lock = values;
            lock.lock();
            try {
                Canvas canvas = new Canvas(scalexby2);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                valueof.values(canvas, paint, rectF);
                values(canvas);
                lock.unlock();
                if (!impl.equals(bitmap)) {
                    scalexby.values(impl);
                }
                return scalexby2;
            } catch (Throwable th) {
                values.unlock();
                throw th;
            }
        }

        private static void values(Canvas canvas) {
            canvas.setBitmap(null);
        }

        private static Bitmap.Config ag$a(Bitmap bitmap) {
            return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
        }

        private static void ag$a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
            Lock lock = values;
            lock.lock();
            try {
                Canvas canvas = new Canvas(bitmap2);
                canvas.drawBitmap(bitmap, matrix, ah$a);
                values(canvas);
                lock.unlock();
            } catch (Throwable th) {
                values.unlock();
                throw th;
            }
        }

        static void valueOf(int i, Matrix matrix) {
            switch (i) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    return;
                case 3:
                    matrix.setRotate(180.0f);
                    return;
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    return;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    return;
                case 6:
                    matrix.setRotate(90.0f);
                    return;
                case 7:
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    return;
                case 8:
                    matrix.setRotate(-90.0f);
                    return;
                default:
                    return;
            }
        }

        /* loaded from: classes3.dex */
        static final class toString implements Lock {
            @Override // java.util.concurrent.locks.Lock
            public void lock() {
            }

            @Override // java.util.concurrent.locks.Lock
            public void lockInterruptibly() throws InterruptedException {
            }

            @Override // java.util.concurrent.locks.Lock
            public boolean tryLock() {
                return true;
            }

            @Override // java.util.concurrent.locks.Lock
            public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
                return true;
            }

            @Override // java.util.concurrent.locks.Lock
            public void unlock() {
            }

            toString() {
            }

            @Override // java.util.concurrent.locks.Lock
            public Condition newCondition() {
                throw new UnsupportedOperationException("Should not be called");
            }
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int ag$a(InputStream inputStream, rotationXBy rotationxby) throws IOException {
        int attributeInt = new androidx.exifinterface.media.ExifInterface(inputStream).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
