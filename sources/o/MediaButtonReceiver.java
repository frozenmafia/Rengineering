package o;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import o.buildMediaButtonPendingIntent;
/* loaded from: classes4.dex */
public class MediaButtonReceiver extends buildMediaButtonPendingIntent.valueOf {
    public static final Parcelable.Creator<MediaButtonReceiver> ag$a;
    private static buildMediaButtonPendingIntent<MediaButtonReceiver> valueOf;
    public float toString;
    public float values;

    static {
        buildMediaButtonPendingIntent<MediaButtonReceiver> buildmediabuttonpendingintent = buildMediaButtonPendingIntent.toString(32, new MediaButtonReceiver(0.0f, 0.0f));
        valueOf = buildmediabuttonpendingintent;
        buildmediabuttonpendingintent.toString(0.5f);
        ag$a = new Parcelable.Creator<MediaButtonReceiver>() { // from class: o.MediaButtonReceiver.2
            @Override // android.os.Parcelable.Creator
            /* renamed from: values */
            public MediaButtonReceiver createFromParcel(Parcel parcel) {
                MediaButtonReceiver mediaButtonReceiver = new MediaButtonReceiver(0.0f, 0.0f);
                mediaButtonReceiver.toString(parcel);
                return mediaButtonReceiver;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ag$a */
            public MediaButtonReceiver[] newArray(int i) {
                return new MediaButtonReceiver[i];
            }
        };
    }

    public MediaButtonReceiver() {
    }

    public MediaButtonReceiver(float f, float f2) {
        this.values = f;
        this.toString = f2;
    }

    public static MediaButtonReceiver toString(float f, float f2) {
        MediaButtonReceiver ah$a = valueOf.ah$a();
        ah$a.values = f;
        ah$a.toString = f2;
        return ah$a;
    }

    public static MediaButtonReceiver valueOf() {
        return valueOf.ah$a();
    }

    public static MediaButtonReceiver ag$a(MediaButtonReceiver mediaButtonReceiver) {
        MediaButtonReceiver ah$a = valueOf.ah$a();
        ah$a.values = mediaButtonReceiver.values;
        ah$a.toString = mediaButtonReceiver.toString;
        return ah$a;
    }

    public static void toString(MediaButtonReceiver mediaButtonReceiver) {
        valueOf.valueOf(mediaButtonReceiver);
    }

    public void toString(Parcel parcel) {
        this.values = parcel.readFloat();
        this.toString = parcel.readFloat();
    }

    public float values() {
        return this.values;
    }

    public float ah$a() {
        return this.toString;
    }

    /* loaded from: classes4.dex */
    public class MediaButtonConnectionCallback {
        protected final Matrix toString = new Matrix();
        protected RectF ag$a = new RectF();
        protected float values = 0.0f;
        protected float valueOf = 0.0f;
        private float getSignupData = 1.0f;
        private float ah$b = Float.MAX_VALUE;
        private float HaptikSDK$a = 1.0f;
        private float HaptikSDK$c = Float.MAX_VALUE;
        private float HaptikSDK$e = 1.0f;
        private float getInitSettings = 1.0f;
        private float ak = 0.0f;
        private float isLogoutPending = 0.0f;
        private float HaptikSDK$d = 0.0f;
        private float HaptikWebView = 0.0f;
        protected float[] invoke = new float[9];
        protected Matrix ah$a = new Matrix();
        protected final float[] HaptikSDK$b = new float[9];

        public void ag$a(float f, float f2) {
            float onPostMessage = onPostMessage();
            float onMessageChannelReady = onMessageChannelReady();
            float ICustomTabsCallback$Default = ICustomTabsCallback$Default();
            float extraCallback = extraCallback();
            this.valueOf = f2;
            this.values = f;
            ah$a(onPostMessage, onMessageChannelReady, ICustomTabsCallback$Default, extraCallback);
        }

        public boolean aj$a() {
            return this.valueOf > 0.0f && this.values > 0.0f;
        }

        public void ah$a(float f, float f2, float f3, float f4) {
            this.ag$a.set(f, f2, this.values - f3, this.valueOf - f4);
        }

        public float onPostMessage() {
            return this.ag$a.left;
        }

        public float ICustomTabsCallback$Default() {
            return this.values - this.ag$a.right;
        }

        public float onMessageChannelReady() {
            return this.ag$a.top;
        }

        public float extraCallback() {
            return this.valueOf - this.ag$a.bottom;
        }

        public float HaptikSDK$a() {
            return this.ag$a.top;
        }

        public float HaptikSDK$c() {
            return this.ag$a.left;
        }

        public float invoke() {
            return this.ag$a.right;
        }

        public float HaptikSDK$b() {
            return this.ag$a.bottom;
        }

        public float HaptikSDK$d() {
            return this.ag$a.width();
        }

        public float ah$b() {
            return this.ag$a.height();
        }

        public RectF HaptikWebView() {
            return this.ag$a;
        }

        public MediaButtonReceiver getInitSettings() {
            return MediaButtonReceiver.toString(this.ag$a.centerX(), this.ag$a.centerY());
        }

        public float HaptikSDK$e() {
            return this.valueOf;
        }

        public float getSignupData() {
            return this.values;
        }

        public float onXdkEvent() {
            return Math.min(this.ag$a.width(), this.ag$a.height());
        }

        public void ag$a(float f, float f2, Matrix matrix) {
            matrix.reset();
            matrix.set(this.toString);
            matrix.postScale(f, f2);
        }

        public void toString(float f, float f2, float f3, float f4, Matrix matrix) {
            matrix.reset();
            matrix.set(this.toString);
            matrix.postScale(f, f2, f3, f4);
        }

        public void values(Matrix matrix) {
            this.HaptikSDK$a = 1.0f;
            this.getSignupData = 1.0f;
            matrix.set(this.toString);
            float[] fArr = this.invoke;
            for (int i = 0; i < 9; i++) {
                fArr[i] = 0.0f;
            }
            matrix.getValues(fArr);
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[0] = 1.0f;
            fArr[4] = 1.0f;
            matrix.setValues(fArr);
        }

        public void toString(float[] fArr, Matrix matrix) {
            matrix.reset();
            matrix.set(this.toString);
            matrix.postTranslate(-(fArr[0] - onPostMessage()), -(fArr[1] - onMessageChannelReady()));
        }

        public void ag$a(float[] fArr, View view) {
            Matrix matrix = this.ah$a;
            matrix.reset();
            matrix.set(this.toString);
            matrix.postTranslate(-(fArr[0] - onPostMessage()), -(fArr[1] - onMessageChannelReady()));
            ag$a(matrix, view, true);
        }

        public Matrix ag$a(Matrix matrix, View view, boolean z) {
            this.toString.set(matrix);
            ah$a(this.toString, this.ag$a);
            if (z) {
                view.invalidate();
            }
            matrix.set(this.toString);
            return matrix;
        }

        public void ah$a(Matrix matrix, RectF rectF) {
            float f;
            matrix.getValues(this.HaptikSDK$b);
            float[] fArr = this.HaptikSDK$b;
            float f2 = fArr[2];
            float f3 = fArr[0];
            float f4 = fArr[5];
            float f5 = fArr[4];
            this.HaptikSDK$e = Math.min(Math.max(this.HaptikSDK$a, f3), this.HaptikSDK$c);
            this.getInitSettings = Math.min(Math.max(this.getSignupData, f5), this.ah$b);
            float f6 = 0.0f;
            if (rectF != null) {
                f6 = rectF.width();
                f = rectF.height();
            } else {
                f = 0.0f;
            }
            this.ak = Math.min(Math.max(f2, ((-f6) * (this.HaptikSDK$e - 1.0f)) - this.HaptikSDK$d), this.HaptikSDK$d);
            float max = Math.max(Math.min(f4, (f * (this.getInitSettings - 1.0f)) + this.HaptikWebView), -this.HaptikWebView);
            this.isLogoutPending = max;
            float[] fArr2 = this.HaptikSDK$b;
            fArr2[2] = this.ak;
            fArr2[0] = this.HaptikSDK$e;
            fArr2[5] = max;
            fArr2[4] = this.getInitSettings;
            matrix.setValues(fArr2);
        }

        public void HaptikWebView(float f) {
            if (f < 1.0f) {
                f = 1.0f;
            }
            this.HaptikSDK$a = f;
            ah$a(this.toString, this.ag$a);
        }

        public void HaptikSDK$c(float f) {
            if (f == 0.0f) {
                f = Float.MAX_VALUE;
            }
            this.HaptikSDK$c = f;
            ah$a(this.toString, this.ag$a);
        }

        public void ah$a(float f, float f2) {
            if (f < 1.0f) {
                f = 1.0f;
            }
            if (f2 == 0.0f) {
                f2 = Float.MAX_VALUE;
            }
            this.HaptikSDK$a = f;
            this.HaptikSDK$c = f2;
            ah$a(this.toString, this.ag$a);
        }

        public void getSignupData(float f) {
            if (f < 1.0f) {
                f = 1.0f;
            }
            this.getSignupData = f;
            ah$a(this.toString, this.ag$a);
        }

        public void invoke(float f) {
            if (f == 0.0f) {
                f = Float.MAX_VALUE;
            }
            this.ah$b = f;
            ah$a(this.toString, this.ag$a);
        }

        public void toString(float f, float f2) {
            if (f < 1.0f) {
                f = 1.0f;
            }
            if (f2 == 0.0f) {
                f2 = Float.MAX_VALUE;
            }
            this.getSignupData = f;
            this.ah$b = f2;
            ah$a(this.toString, this.ag$a);
        }

        public Matrix isLogoutPending() {
            return this.toString;
        }

        public boolean ag$a(float f) {
            return values(f) && ah$a(f);
        }

        public boolean HaptikSDK$a(float f) {
            return valueOf(f) && toString(f);
        }

        public boolean valueOf(float f, float f2) {
            return ag$a(f) && HaptikSDK$a(f2);
        }

        public boolean values(float f) {
            return this.ag$a.left <= f + 1.0f;
        }

        public boolean ah$a(float f) {
            return this.ag$a.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
        }

        public boolean valueOf(float f) {
            return this.ag$a.top <= f;
        }

        public boolean toString(float f) {
            return this.ag$a.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
        }

        public float ak() {
            return this.HaptikSDK$e;
        }

        public float a() {
            return this.getInitSettings;
        }

        public boolean ak$a() {
            return ICustomTabsCallback() && extraCallbackWithResult();
        }

        public boolean extraCallbackWithResult() {
            float f = this.getInitSettings;
            float f2 = this.getSignupData;
            return f <= f2 && f2 <= 1.0f;
        }

        public boolean ICustomTabsCallback() {
            float f = this.HaptikSDK$e;
            float f2 = this.HaptikSDK$a;
            return f <= f2 && f2 <= 1.0f;
        }

        public void ah$b(float f) {
            this.HaptikSDK$d = getServiceComponentByAction.valueOf(f);
        }

        public void HaptikSDK$b(float f) {
            this.HaptikWebView = getServiceComponentByAction.valueOf(f);
        }

        public boolean ak$b() {
            return this.HaptikSDK$d <= 0.0f && this.HaptikWebView <= 0.0f;
        }

        public boolean ag$a() {
            return this.HaptikSDK$e > this.HaptikSDK$a;
        }

        public boolean ah$a() {
            return this.HaptikSDK$e < this.HaptikSDK$c;
        }

        public boolean values() {
            return this.getInitSettings > this.getSignupData;
        }

        public boolean valueOf() {
            return this.getInitSettings < this.ah$b;
        }
    }

    @Override // o.buildMediaButtonPendingIntent.valueOf
    protected buildMediaButtonPendingIntent.valueOf ag$a() {
        return new MediaButtonReceiver(0.0f, 0.0f);
    }
}
