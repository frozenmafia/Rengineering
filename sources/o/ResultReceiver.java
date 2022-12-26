package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.IResultReceiver;
/* loaded from: classes.dex */
public class ResultReceiver {
    private static setQueue valueOf = new IResultReceiver.Stub.Proxy();

    /* loaded from: classes.dex */
    public abstract class MyRunnable extends ValueAnimator {
        private final Set<ValueAnimator.AnimatorUpdateListener> toString = new CopyOnWriteArraySet();
        private final Set<Animator.AnimatorListener> ah$a = new CopyOnWriteArraySet();

        @Override // android.animation.ValueAnimator, android.animation.Animator
        public long getStartDelay() {
            throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
        }

        @Override // android.animation.ValueAnimator, android.animation.Animator
        public void setStartDelay(long j) {
            throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
        }

        @Override // android.animation.ValueAnimator, android.animation.Animator
        public ValueAnimator setDuration(long j) {
            throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
        }

        @Override // android.animation.ValueAnimator, android.animation.Animator
        public void setInterpolator(TimeInterpolator timeInterpolator) {
            throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
        }

        @Override // android.animation.ValueAnimator
        public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.toString.add(animatorUpdateListener);
        }

        @Override // android.animation.ValueAnimator
        public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.toString.remove(animatorUpdateListener);
        }

        @Override // android.animation.ValueAnimator
        public void removeAllUpdateListeners() {
            this.toString.clear();
        }

        @Override // android.animation.Animator
        public void addListener(Animator.AnimatorListener animatorListener) {
            this.ah$a.add(animatorListener);
        }

        @Override // android.animation.Animator
        public void removeListener(Animator.AnimatorListener animatorListener) {
            this.ah$a.remove(animatorListener);
        }

        @Override // android.animation.Animator
        public void removeAllListeners() {
            this.ah$a.clear();
        }

        void valueOf(boolean z) {
            for (Animator.AnimatorListener animatorListener : this.ah$a) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(this, z);
                } else {
                    animatorListener.onAnimationStart(this);
                }
            }
        }

        void ah$a() {
            for (Animator.AnimatorListener animatorListener : this.ah$a) {
                animatorListener.onAnimationRepeat(this);
            }
        }

        void ah$a(boolean z) {
            for (Animator.AnimatorListener animatorListener : this.ah$a) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationEnd(this, z);
                } else {
                    animatorListener.onAnimationEnd(this);
                }
            }
        }

        void ag$a() {
            for (Animator.AnimatorListener animatorListener : this.ah$a) {
                animatorListener.onAnimationCancel(this);
            }
        }

        void valueOf() {
            for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.toString) {
                animatorUpdateListener.onAnimationUpdate(this);
            }
        }
    }

    /* renamed from: o.ResultReceiver$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 {
        private static float valueOf(float f) {
            return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
        }

        private static float ag$a(float f) {
            return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }

        public static int valueOf(float f, int i, int i2) {
            if (i == i2) {
                return i;
            }
            float f2 = ((i >> 24) & 255) / 255.0f;
            float ag$a = ag$a(((i >> 16) & 255) / 255.0f);
            float ag$a2 = ag$a(((i >> 8) & 255) / 255.0f);
            float ag$a3 = ag$a((i & 255) / 255.0f);
            float ag$a4 = ag$a(((i2 >> 16) & 255) / 255.0f);
            float ag$a5 = ag$a(((i2 >> 8) & 255) / 255.0f);
            float ag$a6 = ag$a((i2 & 255) / 255.0f);
            float valueOf = valueOf(ag$a + ((ag$a4 - ag$a) * f));
            float valueOf2 = valueOf(ag$a2 + ((ag$a5 - ag$a2) * f));
            float valueOf3 = valueOf(ag$a3 + ((ag$a6 - ag$a3) * f));
            return (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(valueOf * 255.0f) << 16) | (Math.round(valueOf2 * 255.0f) << 8) | Math.round(valueOf3 * 255.0f);
        }
    }

    public static void valueOf(String str) {
        valueOf.valueOf(str);
    }

    public static void ah$a(String str) {
        valueOf.toString(str);
    }

    public static void values(String str, Throwable th) {
        valueOf.ag$a(str, th);
    }

    public static void ah$a(String str, Throwable th) {
        valueOf.toString(str, th);
    }

    /* loaded from: classes.dex */
    public class MyResultReceiver extends MyRunnable implements Choreographer.FrameCallback {
        private ensureClassLoader values;
        private float HaptikSDK$a = 1.0f;
        private boolean invoke = false;
        private long ag$a = 0;
        private float toString = 0.0f;
        private int ah$b = 0;
        private float HaptikSDK$b = -2.14748365E9f;
        private float ah$a = 2.14748365E9f;
        protected boolean valueOf = false;

        @Override // android.animation.ValueAnimator
        public Object getAnimatedValue() {
            return Float.valueOf(HaptikSDK$c());
        }

        public float HaptikSDK$c() {
            ensureClassLoader ensureclassloader = this.values;
            if (ensureclassloader == null) {
                return 0.0f;
            }
            return (this.toString - ensureclassloader.getSignupData()) / (this.values.ah$b() - this.values.getSignupData());
        }

        @Override // android.animation.ValueAnimator
        public float getAnimatedFraction() {
            float invoke;
            float ah$b;
            float invoke2;
            if (this.values == null) {
                return 0.0f;
            }
            if (isLogoutPending()) {
                invoke = ah$b() - this.toString;
                ah$b = ah$b();
                invoke2 = invoke();
            } else {
                invoke = this.toString - invoke();
                ah$b = ah$b();
                invoke2 = invoke();
            }
            return invoke / (ah$b - invoke2);
        }

        @Override // android.animation.ValueAnimator, android.animation.Animator
        public long getDuration() {
            ensureClassLoader ensureclassloader = this.values;
            if (ensureclassloader == null) {
                return 0L;
            }
            return ensureclassloader.values();
        }

        public float HaptikSDK$a() {
            return this.toString;
        }

        @Override // android.animation.ValueAnimator, android.animation.Animator
        public boolean isRunning() {
            return this.valueOf;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            float max;
            HaptikSDK$e();
            if (this.values == null || !isRunning()) {
                return;
            }
            skipToNext.values("LottieValueAnimator#doFrame");
            long j2 = this.ag$a;
            float a = ((float) (j2 != 0 ? j - j2 : 0L)) / a();
            float f = this.toString;
            if (isLogoutPending()) {
                a = -a;
            }
            float f2 = f + a;
            this.toString = f2;
            boolean valueOf = viewModels.valueOf(f2, invoke(), ah$b());
            max = Math.max(invoke(), Math.min(ah$b(), this.toString));
            this.toString = max;
            this.ag$a = j;
            valueOf();
            if (!valueOf) {
                if (getRepeatCount() != -1 && this.ah$b >= getRepeatCount()) {
                    this.toString = this.HaptikSDK$a < 0.0f ? invoke() : ah$b();
                    getInitSettings();
                    ah$a(isLogoutPending());
                } else {
                    ah$a();
                    this.ah$b++;
                    if (getRepeatMode() == 2) {
                        this.invoke = !this.invoke;
                        ak();
                    } else {
                        this.toString = isLogoutPending() ? ah$b() : invoke();
                    }
                    this.ag$a = j;
                }
            }
            aj$a();
            skipToNext.ag$a("LottieValueAnimator#doFrame");
        }

        private float a() {
            ensureClassLoader ensureclassloader = this.values;
            if (ensureclassloader == null) {
                return Float.MAX_VALUE;
            }
            return (1.0E9f / ensureclassloader.HaptikSDK$a()) / Math.abs(this.HaptikSDK$a);
        }

        public void values() {
            this.values = null;
            this.HaptikSDK$b = -2.14748365E9f;
            this.ah$a = 2.14748365E9f;
        }

        public void ag$a(ensureClassLoader ensureclassloader) {
            boolean z = this.values == null;
            this.values = ensureclassloader;
            if (z) {
                ag$a(Math.max(this.HaptikSDK$b, ensureclassloader.getSignupData()), Math.min(this.ah$a, ensureclassloader.ah$b()));
            } else {
                ag$a((int) ensureclassloader.getSignupData(), (int) ensureclassloader.ah$b());
            }
            float f = this.toString;
            this.toString = 0.0f;
            ag$a((int) f);
            valueOf();
        }

        public void ag$a(float f) {
            float max;
            if (this.toString == f) {
                return;
            }
            max = Math.max(invoke(), Math.min(ah$b(), f));
            this.toString = max;
            this.ag$a = 0L;
            valueOf();
        }

        public void ah$a(int i) {
            ag$a(i, (int) this.ah$a);
        }

        public void values(float f) {
            ag$a(this.HaptikSDK$b, f);
        }

        public void ag$a(float f, float f2) {
            float max;
            float max2;
            float max3;
            if (f > f2) {
                throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
            }
            ensureClassLoader ensureclassloader = this.values;
            float signupData = ensureclassloader == null ? -3.4028235E38f : ensureclassloader.getSignupData();
            ensureClassLoader ensureclassloader2 = this.values;
            float ah$b = ensureclassloader2 == null ? Float.MAX_VALUE : ensureclassloader2.ah$b();
            max = Math.max(signupData, Math.min(ah$b, f));
            max2 = Math.max(signupData, Math.min(ah$b, f2));
            if (max == this.HaptikSDK$b && max2 == this.ah$a) {
                return;
            }
            this.HaptikSDK$b = max;
            this.ah$a = max2;
            max3 = Math.max(max, Math.min(max2, this.toString));
            ag$a((int) max3);
        }

        public void ak() {
            valueOf(-HaptikWebView());
        }

        public void valueOf(float f) {
            this.HaptikSDK$a = f;
        }

        public float HaptikWebView() {
            return this.HaptikSDK$a;
        }

        @Override // android.animation.ValueAnimator
        public void setRepeatMode(int i) {
            super.setRepeatMode(i);
            if (i == 2 || !this.invoke) {
                return;
            }
            this.invoke = false;
            ak();
        }

        public void HaptikSDK$d() {
            this.valueOf = true;
            valueOf(isLogoutPending());
            ag$a((int) (isLogoutPending() ? ah$b() : invoke()));
            this.ag$a = 0L;
            this.ah$b = 0;
            HaptikSDK$e();
        }

        public void HaptikSDK$b() {
            getInitSettings();
            ah$a(isLogoutPending());
        }

        public void getSignupData() {
            getInitSettings();
        }

        public void onXdkEvent() {
            this.valueOf = true;
            HaptikSDK$e();
            this.ag$a = 0L;
            if (isLogoutPending() && HaptikSDK$a() == invoke()) {
                this.toString = ah$b();
            } else if (isLogoutPending() || HaptikSDK$a() != ah$b()) {
            } else {
                this.toString = invoke();
            }
        }

        @Override // android.animation.ValueAnimator, android.animation.Animator
        public void cancel() {
            ag$a();
            getInitSettings();
        }

        private boolean isLogoutPending() {
            return HaptikWebView() < 0.0f;
        }

        public float invoke() {
            ensureClassLoader ensureclassloader = this.values;
            if (ensureclassloader == null) {
                return 0.0f;
            }
            float f = this.HaptikSDK$b;
            return f == -2.14748365E9f ? ensureclassloader.getSignupData() : f;
        }

        public float ah$b() {
            ensureClassLoader ensureclassloader = this.values;
            if (ensureclassloader == null) {
                return 0.0f;
            }
            float f = this.ah$a;
            return f == 2.14748365E9f ? ensureclassloader.ah$b() : f;
        }

        @Override // o.ResultReceiver.MyRunnable
        void ag$a() {
            super.ag$a();
            ah$a(isLogoutPending());
        }

        protected void HaptikSDK$e() {
            if (isRunning()) {
                values(false);
                Choreographer.getInstance().postFrameCallback(this);
            }
        }

        protected void getInitSettings() {
            values(true);
        }

        protected void values(boolean z) {
            Choreographer.getInstance().removeFrameCallback(this);
            if (z) {
                this.valueOf = false;
            }
        }

        private void aj$a() {
            if (this.values == null) {
                return;
            }
            float f = this.toString;
            if (f < this.HaptikSDK$b || f > this.ah$a) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.HaptikSDK$b), Float.valueOf(this.ah$a), Float.valueOf(this.toString)));
            }
        }
    }
}
