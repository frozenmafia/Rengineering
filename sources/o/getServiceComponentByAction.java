package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import o.MediaBrowserServiceCompat;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes4.dex */
public abstract class getServiceComponentByAction {
    private static int HaptikSDK$d = 8000;
    private static DisplayMetrics HaptikSDK$e = null;
    private static int getSignupData = 50;
    public static final double toString = Double.longBitsToDouble(1);
    public static final float valueOf = Float.intBitsToFloat(1);
    private static Rect values = new Rect();
    private static Paint.FontMetrics HaptikSDK$b = new Paint.FontMetrics();
    private static Rect ah$a = new Rect();
    private static final int[] ag$a = {1, 10, 100, 1000, 10000, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND, 1000000, 10000000, 100000000, 1000000000};
    private static MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 ah$b = ah$b();
    private static Rect invoke = new Rect();
    private static Rect HaptikSDK$a = new Rect();
    private static Paint.FontMetrics HaptikSDK$c = new Paint.FontMetrics();

    public static float values(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    public static void values(Context context) {
        if (context == null) {
            getSignupData = ViewConfiguration.getMinimumFlingVelocity();
            HaptikSDK$d = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        getSignupData = viewConfiguration.getScaledMinimumFlingVelocity();
        HaptikSDK$d = viewConfiguration.getScaledMaximumFlingVelocity();
        HaptikSDK$e = context.getResources().getDisplayMetrics();
    }

    public static float valueOf(float f) {
        DisplayMetrics displayMetrics = HaptikSDK$e;
        if (displayMetrics == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return f;
        }
        return f * displayMetrics.density;
    }

    public static int ag$a(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static int ah$a(Paint paint, String str) {
        Rect rect = values;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float values(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float ah$a(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static setCancelButtonIntent valueOf(Paint paint, String str) {
        setCancelButtonIntent ah$a2 = setCancelButtonIntent.ah$a(0.0f, 0.0f);
        ah$a(paint, str, ah$a2);
        return ah$a2;
    }

    public static void ah$a(Paint paint, String str, setCancelButtonIntent setcancelbuttonintent) {
        Rect rect = ah$a;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        setcancelbuttonintent.valueOf = rect.width();
        setcancelbuttonintent.values = rect.height();
    }

    private static MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 ah$b() {
        return new MediaBrowserServiceCompat.MediaBrowserServiceImplApi26(1);
    }

    public static String valueOf(float f, int i, boolean z) {
        return valueOf(f, i, z, '.');
    }

    public static String valueOf(float f, int i, boolean z, char c) {
        boolean z2;
        float f2 = f;
        char[] cArr = new char[35];
        if (f2 == 0.0f) {
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
        int i2 = 0;
        boolean z3 = f2 < 1.0f && f2 > -1.0f;
        if (f2 < 0.0f) {
            f2 = -f2;
            z2 = true;
        } else {
            z2 = false;
        }
        int[] iArr = ag$a;
        int length = i > iArr.length ? iArr.length - 1 : i;
        long round = Math.round(f2 * iArr[length]);
        int i3 = 34;
        boolean z4 = false;
        while (true) {
            if (round == 0 && i2 >= length + 1) {
                break;
            }
            boolean z5 = z4;
            int i4 = (int) (round % 10);
            round /= 10;
            int i5 = i3 - 1;
            cArr[i3] = (char) (i4 + 48);
            i2++;
            if (i2 == length) {
                i3 = i5 - 1;
                cArr[i5] = ',';
                i2++;
                z4 = true;
            } else {
                if (z && round != 0 && i2 > length) {
                    if (z5) {
                        if ((i2 - length) % 4 == 0) {
                            i3 = i5 - 1;
                            cArr[i5] = c;
                            i2++;
                            z4 = z5;
                        }
                    } else if ((i2 - length) % 4 == 3) {
                        i3 = i5 - 1;
                        cArr[i5] = c;
                        i2++;
                        z4 = z5;
                    }
                }
                z4 = z5;
                i3 = i5;
            }
        }
        if (z3) {
            cArr[i3] = '0';
            i2++;
            i3--;
        }
        if (z2) {
            cArr[i3] = Soundex.SILENT_MARKER;
            i2++;
        }
        int i6 = 35 - i2;
        return String.valueOf(cArr, i6, 35 - i6);
    }

    public static float toString(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == 0.0d) {
            return 0.0f;
        }
        float pow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d < 0.0d ? -d : d))));
        return ((float) Math.round(d * pow)) / pow;
    }

    public static int ah$a(float f) {
        float getservicecomponentbyaction = toString(f);
        if (Float.isInfinite(getservicecomponentbyaction)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10(getservicecomponentbyaction))) + 2;
    }

    public static double valueOf(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1L : -1L));
    }

    public static void values(MediaButtonReceiver mediaButtonReceiver, float f, float f2, MediaButtonReceiver mediaButtonReceiver2) {
        double d = f;
        double d2 = f2;
        mediaButtonReceiver2.values = (float) (mediaButtonReceiver.values + (Math.cos(Math.toRadians(d2)) * d));
        mediaButtonReceiver2.toString = (float) (mediaButtonReceiver.toString + (d * Math.sin(Math.toRadians(d2))));
    }

    public static void ag$a(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, HaptikSDK$d);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static void toString(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidateDelayed(10L);
        }
    }

    public static int valueOf() {
        return HaptikSDK$d;
    }

    public static void ah$a(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        MediaButtonReceiver valueOf2 = MediaButtonReceiver.valueOf();
        valueOf2.values = i - (i3 / 2);
        valueOf2.toString = i2 - (i4 / 2);
        drawable.copyBounds(invoke);
        drawable.setBounds(invoke.left, invoke.top, invoke.left + i3, invoke.top + i3);
        int save = canvas.save();
        canvas.translate(valueOf2.values, valueOf2.toString);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void values(Canvas canvas, String str, float f, float f2, Paint paint, MediaButtonReceiver mediaButtonReceiver, float f3) {
        float fontMetrics = paint.getFontMetrics(HaptikSDK$c);
        paint.getTextBounds(str, 0, str.length(), HaptikSDK$a);
        float f4 = 0.0f - HaptikSDK$a.left;
        float f5 = (-HaptikSDK$c.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float width = HaptikSDK$a.width();
            if (mediaButtonReceiver.values != 0.5f || mediaButtonReceiver.toString != 0.5f) {
                setCancelButtonIntent values2 = values(HaptikSDK$a.width(), fontMetrics, f3);
                f -= values2.valueOf * (mediaButtonReceiver.values - 0.5f);
                f2 -= values2.values * (mediaButtonReceiver.toString - 0.5f);
                setCancelButtonIntent.toString(values2);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, f4 - (width * 0.5f), f5 - (fontMetrics * 0.5f), paint);
            canvas.restore();
        } else {
            if (mediaButtonReceiver.values != 0.0f || mediaButtonReceiver.toString != 0.0f) {
                f4 -= HaptikSDK$a.width() * mediaButtonReceiver.values;
                f5 -= fontMetrics * mediaButtonReceiver.toString;
            }
            canvas.drawText(str, f4 + f, f5 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static setCancelButtonIntent values(float f, float f2, float f3) {
        return ag$a(f, f2, f3 * 0.017453292f);
    }

    public static setCancelButtonIntent ag$a(float f, float f2, float f3) {
        double d = f3;
        return setCancelButtonIntent.ah$a(Math.abs(((float) Math.cos(d)) * f) + Math.abs(((float) Math.sin(d)) * f2), Math.abs(f * ((float) Math.sin(d))) + Math.abs(f2 * ((float) Math.cos(d))));
    }

    public static int values() {
        return Build.VERSION.SDK_INT;
    }
}
