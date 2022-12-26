package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;
import o.PreferenceFragmentCompat;
/* loaded from: classes7.dex */
public abstract class addPreference extends Drawable implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final Property<addPreference, Float> values = new Property<addPreference, Float>(Float.class, "growFraction") { // from class: o.addPreference.4
        @Override // android.util.Property
        /* renamed from: valueOf */
        public Float get(addPreference addpreference) {
            return Float.valueOf(addpreference.ah$b());
        }

        @Override // android.util.Property
        /* renamed from: values */
        public void set(addPreference addpreference, Float f) {
            addpreference.ag$a(f.floatValue());
        }
    };
    private Animatable2Compat.AnimationCallback HaptikSDK$a;
    private boolean HaptikSDK$b;
    private ValueAnimator HaptikSDK$c;
    private int HaptikSDK$d;
    private float HaptikSDK$e;
    private ValueAnimator HaptikWebView;
    final PreferenceFragmentCompat.OnPreferenceStartFragmentCallback ag$a;
    private List<Animatable2Compat.AnimationCallback> ah$b;
    private boolean getInitSettings;
    private boolean getSignupData;
    private float invoke;
    final Context valueOf;
    final Paint ah$a = new Paint();
    public PreferenceFragmentCompat.OnPreferenceStartScreenCallback toString = new PreferenceFragmentCompat.OnPreferenceStartScreenCallback();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public addPreference(Context context, PreferenceFragmentCompat.OnPreferenceStartFragmentCallback onPreferenceStartFragmentCallback) {
        this.valueOf = context;
        this.ag$a = onPreferenceStartFragmentCallback;
        setAlpha(255);
    }

    private void HaptikSDK$b() {
        if (this.HaptikWebView == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, values, 0.0f, 1.0f);
            this.HaptikWebView = ofFloat;
            ofFloat.setDuration(500L);
            this.HaptikWebView.setInterpolator(onPreferenceChange.values);
            ah$a(this.HaptikWebView);
        }
        if (this.HaptikSDK$c == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, values, 1.0f, 0.0f);
            this.HaptikSDK$c = ofFloat2;
            ofFloat2.setDuration(500L);
            this.HaptikSDK$c.setInterpolator(onPreferenceChange.values);
            values(this.HaptikSDK$c);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (this.ah$b == null) {
            this.ah$b = new ArrayList();
        }
        if (this.ah$b.contains(animationCallback)) {
            return;
        }
        this.ah$b.add(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.ah$b;
        if (list == null || !list.contains(animationCallback)) {
            return false;
        }
        this.ah$b.remove(animationCallback);
        if (this.ah$b.isEmpty()) {
            this.ah$b = null;
            return true;
        }
        return true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.ah$b.clear();
        this.ah$b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HaptikSDK$a() {
        Animatable2Compat.AnimationCallback animationCallback = this.HaptikSDK$a;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.ah$b;
        if (list == null || this.HaptikSDK$b) {
            return;
        }
        for (Animatable2Compat.AnimationCallback animationCallback2 : list) {
            animationCallback2.onAnimationStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a() {
        Animatable2Compat.AnimationCallback animationCallback = this.HaptikSDK$a;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.ah$b;
        if (list == null || this.HaptikSDK$b) {
            return;
        }
        for (Animatable2Compat.AnimationCallback animationCallback2 : list) {
            animationCallback2.onAnimationEnd(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        valueOf(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        valueOf(false, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return values() || valueOf();
    }

    public boolean values() {
        ValueAnimator valueAnimator = this.HaptikWebView;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.getInitSettings;
    }

    public boolean valueOf() {
        ValueAnimator valueAnimator = this.HaptikSDK$c;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.getSignupData;
    }

    public boolean ag$a() {
        return toString(false, false, false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return toString(z, z2, true);
    }

    public boolean toString(boolean z, boolean z2, boolean z3) {
        return valueOf(z, z2, z3 && this.toString.toString(this.valueOf.getContentResolver()) > 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean valueOf(boolean z, boolean z2, boolean z3) {
        HaptikSDK$b();
        if (isVisible() || z) {
            ValueAnimator valueAnimator = z ? this.HaptikWebView : this.HaptikSDK$c;
            if (!z3) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.end();
                } else {
                    ag$a(valueAnimator);
                }
                return super.setVisible(z, false);
            } else if (z3 && valueAnimator.isRunning()) {
                return false;
            } else {
                boolean z4 = !z || super.setVisible(z, false);
                if (!(z ? this.ag$a.values() : this.ag$a.ag$a())) {
                    ag$a(valueAnimator);
                    return z4;
                }
                if (z2 || Build.VERSION.SDK_INT < 19 || !valueAnimator.isPaused()) {
                    valueAnimator.start();
                } else {
                    valueAnimator.resume();
                }
                return z4;
            }
        }
        return false;
    }

    private void ag$a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.HaptikSDK$b;
        this.HaptikSDK$b = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.HaptikSDK$b = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.HaptikSDK$d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.HaptikSDK$d;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ah$a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private void ah$a(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.HaptikWebView;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.HaptikWebView = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: o.addPreference.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                addPreference.this.HaptikSDK$a();
            }
        });
    }

    private void values(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.HaptikSDK$c;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.HaptikSDK$c = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: o.addPreference.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                addPreference.super.setVisible(false, false);
                addPreference.this.ah$a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float ah$b() {
        if (this.ag$a.values() || this.ag$a.ag$a()) {
            if (this.getSignupData || this.getInitSettings) {
                return this.HaptikSDK$e;
            }
            return this.invoke;
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(float f) {
        if (this.invoke != f) {
            this.invoke = f;
            invalidateSelf();
        }
    }
}
