package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
/* loaded from: classes7.dex */
public class onPreferenceDisplayDialog extends androidx.transition.Transition {
    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        ag$a(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        ag$a(transitionValues);
    }

    private void ag$a(androidx.transition.TransitionValues transitionValues) {
        if (transitionValues.view instanceof TextView) {
            transitionValues.values.put("android:textscale:scale", Float.valueOf(((TextView) transitionValues.view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof TextView) || !(transitionValues2.view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) transitionValues2.view;
        Map<String, Object> map = transitionValues.values;
        Map<String, Object> map2 = transitionValues2.values;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.onPreferenceDisplayDialog.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
            }
        });
        return ofFloat;
    }
}
