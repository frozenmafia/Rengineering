package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class viewModels {
    private static final PointF ag$a = new PointF();

    public static float ag$a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int valueOf(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static boolean valueOf(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF ag$a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void ah$a(getQueueItem getqueueitem, Path path) {
        path.reset();
        PointF ag$a2 = getqueueitem.ag$a();
        path.moveTo(ag$a2.x, ag$a2.y);
        ag$a.set(ag$a2.x, ag$a2.y);
        for (int i = 0; i < getqueueitem.ah$a().size(); i++) {
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass1 = getqueueitem.ah$a().get(i);
            PointF valueOf = anonymousClass1.valueOf();
            PointF ag$a3 = anonymousClass1.ag$a();
            PointF ah$a = anonymousClass1.ah$a();
            PointF pointF = ag$a;
            if (valueOf.equals(pointF) && ag$a3.equals(ah$a)) {
                path.lineTo(ah$a.x, ah$a.y);
            } else {
                path.cubicTo(valueOf.x, valueOf.y, ag$a3.x, ag$a3.y, ah$a.x, ah$a.y);
            }
            pointF.set(ah$a.x, ah$a.y);
        }
        if (getqueueitem.valueOf()) {
            path.close();
        }
    }

    /* renamed from: o.viewModels$default */
    /* loaded from: classes.dex */
    public class Cdefault<T> {
        public final T HaptikSDK$a;
        private final ensureClassLoader HaptikSDK$b;
        public final float HaptikSDK$c;
        private float HaptikSDK$d;
        private int HaptikSDK$e;
        private float HaptikWebView;
        public PointF ag$a;
        public PointF ah$a;
        public final Interpolator ah$b;
        private int aj$a;
        private float getInitSettings;
        private float getSignupData;
        public final Interpolator invoke;
        public final Interpolator toString;
        public Float valueOf;
        public T values;

        public Cdefault(ensureClassLoader ensureclassloader, T t, T t2, Interpolator interpolator, float f, Float f2) {
            this.getInitSettings = -3987645.8f;
            this.getSignupData = -3987645.8f;
            this.aj$a = 784923401;
            this.HaptikSDK$e = 784923401;
            this.HaptikSDK$d = Float.MIN_VALUE;
            this.HaptikWebView = Float.MIN_VALUE;
            this.ag$a = null;
            this.ah$a = null;
            this.HaptikSDK$b = ensureclassloader;
            this.HaptikSDK$a = t;
            this.values = t2;
            this.toString = interpolator;
            this.ah$b = null;
            this.invoke = null;
            this.HaptikSDK$c = f;
            this.valueOf = f2;
        }

        public Cdefault(ensureClassLoader ensureclassloader, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
            this.getInitSettings = -3987645.8f;
            this.getSignupData = -3987645.8f;
            this.aj$a = 784923401;
            this.HaptikSDK$e = 784923401;
            this.HaptikSDK$d = Float.MIN_VALUE;
            this.HaptikWebView = Float.MIN_VALUE;
            this.ag$a = null;
            this.ah$a = null;
            this.HaptikSDK$b = ensureclassloader;
            this.HaptikSDK$a = t;
            this.values = t2;
            this.toString = null;
            this.ah$b = interpolator;
            this.invoke = interpolator2;
            this.HaptikSDK$c = f;
            this.valueOf = f2;
        }

        public Cdefault(ensureClassLoader ensureclassloader, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
            this.getInitSettings = -3987645.8f;
            this.getSignupData = -3987645.8f;
            this.aj$a = 784923401;
            this.HaptikSDK$e = 784923401;
            this.HaptikSDK$d = Float.MIN_VALUE;
            this.HaptikWebView = Float.MIN_VALUE;
            this.ag$a = null;
            this.ah$a = null;
            this.HaptikSDK$b = ensureclassloader;
            this.HaptikSDK$a = t;
            this.values = t2;
            this.toString = interpolator;
            this.ah$b = interpolator2;
            this.invoke = interpolator3;
            this.HaptikSDK$c = f;
            this.valueOf = f2;
        }

        public Cdefault(T t) {
            this.getInitSettings = -3987645.8f;
            this.getSignupData = -3987645.8f;
            this.aj$a = 784923401;
            this.HaptikSDK$e = 784923401;
            this.HaptikSDK$d = Float.MIN_VALUE;
            this.HaptikWebView = Float.MIN_VALUE;
            this.ag$a = null;
            this.ah$a = null;
            this.HaptikSDK$b = null;
            this.HaptikSDK$a = t;
            this.values = t;
            this.toString = null;
            this.ah$b = null;
            this.invoke = null;
            this.HaptikSDK$c = Float.MIN_VALUE;
            this.valueOf = Float.valueOf(Float.MAX_VALUE);
        }

        public float HaptikSDK$b() {
            ensureClassLoader ensureclassloader = this.HaptikSDK$b;
            if (ensureclassloader == null) {
                return 0.0f;
            }
            if (this.HaptikSDK$d == Float.MIN_VALUE) {
                this.HaptikSDK$d = (this.HaptikSDK$c - ensureclassloader.getSignupData()) / this.HaptikSDK$b.ag$a();
            }
            return this.HaptikSDK$d;
        }

        public float ah$a() {
            if (this.HaptikSDK$b == null) {
                return 1.0f;
            }
            if (this.HaptikWebView == Float.MIN_VALUE) {
                if (this.valueOf == null) {
                    this.HaptikWebView = 1.0f;
                } else {
                    this.HaptikWebView = HaptikSDK$b() + ((this.valueOf.floatValue() - this.HaptikSDK$c) / this.HaptikSDK$b.ag$a());
                }
            }
            return this.HaptikWebView;
        }

        public boolean HaptikSDK$a() {
            return this.toString == null && this.ah$b == null && this.invoke == null;
        }

        public boolean toString(float f) {
            return f >= HaptikSDK$b() && f < ah$a();
        }

        public float HaptikSDK$c() {
            if (this.getInitSettings == -3987645.8f) {
                this.getInitSettings = ((Float) this.HaptikSDK$a).floatValue();
            }
            return this.getInitSettings;
        }

        public float valueOf() {
            if (this.getSignupData == -3987645.8f) {
                this.getSignupData = ((Float) this.values).floatValue();
            }
            return this.getSignupData;
        }

        public int ah$b() {
            if (this.aj$a == 784923401) {
                this.aj$a = ((Integer) this.HaptikSDK$a).intValue();
            }
            return this.aj$a;
        }

        public int invoke() {
            if (this.HaptikSDK$e == 784923401) {
                this.HaptikSDK$e = ((Integer) this.values).intValue();
            }
            return this.HaptikSDK$e;
        }

        public String toString() {
            return "Keyframe{startValue=" + this.HaptikSDK$a + ", endValue=" + this.values + ", startFrame=" + this.HaptikSDK$c + ", endFrame=" + this.valueOf + ", interpolator=" + this.toString + '}';
        }
    }

    public static int toString(float f, float f2) {
        return ah$a((int) f, (int) f2);
    }

    private static int ah$a(int i, int i2) {
        return i - (i2 * toString(i, i2));
    }

    private static int toString(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static void toString(MediaSessionCompat.MediaSessionImplApi28 mediaSessionImplApi28, int i, List<MediaSessionCompat.MediaSessionImplApi28> list, MediaSessionCompat.MediaSessionImplApi28 mediaSessionImplApi282, onSeekTo onseekto) {
        if (mediaSessionImplApi28.toString(onseekto.valueOf(), i)) {
            list.add(mediaSessionImplApi282.ag$a(onseekto.valueOf()).valueOf(onseekto));
        }
    }
}
