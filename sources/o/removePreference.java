package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import o.PreferenceDialogFragmentCompat;
import o.PreferenceFragmentCompat;
/* loaded from: classes7.dex */
public final class removePreference extends isOrderingAsAdded<ObjectAnimator> {
    private static final Property<removePreference, Float> toString = new Property<removePreference, Float>(Float.class, "animationFraction") { // from class: o.removePreference.4
        @Override // android.util.Property
        /* renamed from: values */
        public Float get(removePreference removepreference) {
            return Float.valueOf(removepreference.invoke());
        }

        @Override // android.util.Property
        /* renamed from: toString */
        public void set(removePreference removepreference, Float f) {
            removepreference.toString(f.floatValue());
        }
    };
    private int HaptikSDK$a;
    private final PreferenceFragmentCompat.OnPreferenceStartFragmentCallback HaptikSDK$b;
    private boolean HaptikSDK$c;
    private float ag$a;
    private ObjectAnimator ah$b;
    private androidx.interpolator.view.animation.FastOutSlowInInterpolator invoke;

    @Override // o.isOrderingAsAdded
    public void ag$a() {
    }

    @Override // o.isOrderingAsAdded
    public void ah$b() {
    }

    @Override // o.isOrderingAsAdded
    public void valueOf(Animatable2Compat.AnimationCallback animationCallback) {
    }

    public removePreference(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.HaptikSDK$a = 1;
        this.HaptikSDK$b = linearProgressIndicatorSpec;
        this.invoke = new androidx.interpolator.view.animation.FastOutSlowInInterpolator();
    }

    @Override // o.isOrderingAsAdded
    public void HaptikSDK$c() {
        HaptikSDK$a();
        values();
        this.ah$b.start();
    }

    private void HaptikSDK$a() {
        if (this.ah$b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, toString, 0.0f, 1.0f);
            this.ah$b = ofFloat;
            ofFloat.setDuration(333L);
            this.ah$b.setInterpolator(null);
            this.ah$b.setRepeatCount(-1);
            this.ah$b.addListener(new AnimatorListenerAdapter() { // from class: o.removePreference.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    removePreference removepreference = removePreference.this;
                    removepreference.HaptikSDK$a = (removepreference.HaptikSDK$a + 1) % removePreference.this.HaptikSDK$b.valueOf.length;
                    removePreference.this.HaptikSDK$c = true;
                }
            });
        }
    }

    @Override // o.isOrderingAsAdded
    public void valueOf() {
        ObjectAnimator objectAnimator = this.ah$b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o.isOrderingAsAdded
    public void ah$a() {
        values();
    }

    private void toString(int i) {
        this.values[0] = 0.0f;
        float valueOf = valueOf(i, 0, 667);
        float[] fArr = this.values;
        float[] fArr2 = this.values;
        float interpolation = this.invoke.getInterpolation(valueOf);
        fArr2[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr3 = this.values;
        float[] fArr4 = this.values;
        float interpolation2 = this.invoke.getInterpolation(valueOf + 0.49925038f);
        fArr4[4] = interpolation2;
        fArr3[3] = interpolation2;
        this.values[5] = 1.0f;
    }

    private void HaptikSDK$b() {
        if (!this.HaptikSDK$c || this.values[3] >= 1.0f) {
            return;
        }
        this.ah$a[2] = this.ah$a[1];
        this.ah$a[1] = this.ah$a[0];
        this.ah$a[0] = PreferenceDialogFragmentCompat.Api30Impl.values(this.HaptikSDK$b.valueOf[this.HaptikSDK$a], this.valueOf.getAlpha());
        this.HaptikSDK$c = false;
    }

    void values() {
        this.HaptikSDK$c = true;
        this.HaptikSDK$a = 1;
        Arrays.fill(this.ah$a, PreferenceDialogFragmentCompat.Api30Impl.values(this.HaptikSDK$b.valueOf[0], this.valueOf.getAlpha()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float invoke() {
        return this.ag$a;
    }

    void toString(float f) {
        this.ag$a = f;
        toString((int) (f * 333.0f));
        HaptikSDK$b();
        this.valueOf.invalidateSelf();
    }
}
