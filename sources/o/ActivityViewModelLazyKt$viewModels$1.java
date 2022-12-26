package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$1 {
    private static final ThreadLocal<PathMeasure> ag$a = new ThreadLocal<PathMeasure>() { // from class: o.ActivityViewModelLazyKt$viewModels$1.4
        @Override // java.lang.ThreadLocal
        /* renamed from: values */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> ah$a = new ThreadLocal<Path>() { // from class: o.ActivityViewModelLazyKt$viewModels$1.1
        @Override // java.lang.ThreadLocal
        /* renamed from: ag$a */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> valueOf = new ThreadLocal<Path>() { // from class: o.ActivityViewModelLazyKt$viewModels$1.3
        @Override // java.lang.ThreadLocal
        /* renamed from: values */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> toString = new ThreadLocal<float[]>() { // from class: o.ActivityViewModelLazyKt$viewModels$1.2
        @Override // java.lang.ThreadLocal
        /* renamed from: values */
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float values = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int ag$a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) androidx.databinding.library.baseAdapters.BR.userTeamVM) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean valueOf(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static Path values(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void ah$a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static float valueOf(Matrix matrix) {
        float[] fArr = toString.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = values;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean values(Matrix matrix) {
        float[] fArr = toString.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void toString(Path path, setSessionImpl setsessionimpl) {
        if (setsessionimpl == null || setsessionimpl.ah$b()) {
            return;
        }
        ag$a(path, ((clearCurrentControllerInfo) setsessionimpl.HaptikSDK$a()).HaptikSDK$b() / 100.0f, ((clearCurrentControllerInfo) setsessionimpl.values()).HaptikSDK$b() / 100.0f, ((clearCurrentControllerInfo) setsessionimpl.ag$a()).HaptikSDK$b() / 360.0f);
    }

    public static void ag$a(Path path, float f, float f2, float f3) {
        skipToNext.values("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = ag$a.get();
        Path path2 = ah$a.get();
        Path path3 = valueOf.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            skipToNext.ag$a("applyTrimPathIfNeeded");
        } else if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            skipToNext.ag$a("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = viewModels.toString(min, length);
                max = viewModels.toString(max, length);
            }
            if (min < 0.0f) {
                min = viewModels.toString(min, length);
            }
            if (max < 0.0f) {
                max = viewModels.toString(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                skipToNext.ag$a("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            skipToNext.ag$a("applyTrimPathIfNeeded");
        }
    }

    public static float ag$a(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap toString(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean values(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void valueOf(Canvas canvas, RectF rectF, Paint paint, int i) {
        skipToNext.values("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        skipToNext.ag$a("Utils#saveLayer");
    }
}
