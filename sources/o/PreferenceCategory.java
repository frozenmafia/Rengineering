package o;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.react.uimanager.ViewProps;
import o.Preference;
import o.PreferenceFragment;
/* loaded from: classes5.dex */
public class PreferenceCategory {
    private static final int[] toString = {16843848};

    PreferenceCategory() {
    }

    public static void ag$a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void toString(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray scrollToPreferenceObserver = PreferenceFragment.ScrollToPreferenceObserver.toString(context, attributeSet, toString, i, i2, new int[0]);
        try {
            if (scrollToPreferenceObserver.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, scrollToPreferenceObserver.getResourceId(0, 0)));
            }
        } finally {
            scrollToPreferenceObserver.recycle();
        }
    }

    public static void toString(View view, float f) {
        int integer = view.getResources().getInteger(Preference.BaseSavedState.invoke.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, Preference.BaseSavedState.values.state_liftable, -Preference.BaseSavedState.values.state_lifted}, ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
