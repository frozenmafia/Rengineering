package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import o.Preference;
/* loaded from: classes7.dex */
public abstract class setPreferenceScreen implements shouldDrawDividerBelow {
    private final setDivider HaptikSDK$b;
    private Preference.OnPreferenceClickListener ag$a;
    private Preference.OnPreferenceClickListener ah$a;
    private final ExtendedFloatingActionButton toString;
    private final ArrayList<Animator.AnimatorListener> valueOf = new ArrayList<>();
    private final Context values;

    public setPreferenceScreen(ExtendedFloatingActionButton extendedFloatingActionButton, setDivider setdivider) {
        this.toString = extendedFloatingActionButton;
        this.values = extendedFloatingActionButton.getContext();
        this.HaptikSDK$b = setdivider;
    }

    @Override // o.shouldDrawDividerBelow
    public final void valueOf(Preference.OnPreferenceClickListener onPreferenceClickListener) {
        this.ag$a = onPreferenceClickListener;
    }

    public final Preference.OnPreferenceClickListener ag$a() {
        Preference.OnPreferenceClickListener onPreferenceClickListener = this.ag$a;
        if (onPreferenceClickListener != null) {
            return onPreferenceClickListener;
        }
        if (this.ah$a == null) {
            this.ah$a = Preference.OnPreferenceClickListener.ah$a(this.values, invoke());
        }
        return (Preference.OnPreferenceClickListener) androidx.core.util.Preconditions.checkNotNull(this.ah$a);
    }

    @Override // o.shouldDrawDividerBelow
    public final List<Animator.AnimatorListener> ah$a() {
        return this.valueOf;
    }

    @Override // o.shouldDrawDividerBelow
    public void ag$a(Animator animator) {
        this.HaptikSDK$b.ag$a(animator);
    }

    @Override // o.shouldDrawDividerBelow
    public void HaptikSDK$b() {
        this.HaptikSDK$b.ag$a();
    }

    @Override // o.shouldDrawDividerBelow
    public void valueOf() {
        this.HaptikSDK$b.ag$a();
    }

    @Override // o.shouldDrawDividerBelow
    public AnimatorSet values() {
        return values(ag$a());
    }

    public AnimatorSet values(Preference.OnPreferenceClickListener onPreferenceClickListener) {
        ArrayList arrayList = new ArrayList();
        if (onPreferenceClickListener.ah$a(ViewProps.OPACITY)) {
            arrayList.add(onPreferenceClickListener.valueOf(ViewProps.OPACITY, this.toString, View.ALPHA));
        }
        if (onPreferenceClickListener.ah$a("scale")) {
            arrayList.add(onPreferenceClickListener.valueOf("scale", this.toString, View.SCALE_Y));
            arrayList.add(onPreferenceClickListener.valueOf("scale", this.toString, View.SCALE_X));
        }
        if (onPreferenceClickListener.ah$a("width")) {
            arrayList.add(onPreferenceClickListener.valueOf("width", this.toString, ExtendedFloatingActionButton.ah$a));
        }
        if (onPreferenceClickListener.ah$a("height")) {
            arrayList.add(onPreferenceClickListener.valueOf("height", this.toString, ExtendedFloatingActionButton.values));
        }
        if (onPreferenceClickListener.ah$a(ViewProps.PADDING_START)) {
            arrayList.add(onPreferenceClickListener.valueOf(ViewProps.PADDING_START, this.toString, ExtendedFloatingActionButton.ag$a));
        }
        if (onPreferenceClickListener.ah$a(ViewProps.PADDING_END)) {
            arrayList.add(onPreferenceClickListener.valueOf(ViewProps.PADDING_END, this.toString, ExtendedFloatingActionButton.toString));
        }
        if (onPreferenceClickListener.ah$a("labelOpacity")) {
            arrayList.add(onPreferenceClickListener.valueOf("labelOpacity", this.toString, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: o.setPreferenceScreen.2
                @Override // android.util.Property
                /* renamed from: valueOf */
                public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    return Float.valueOf(onPreferenceChange.toString(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.valueOf.getColorForState(extendedFloatingActionButton.getDrawableState(), setPreferenceScreen.this.toString.valueOf.getDefaultColor()))));
                }

                @Override // android.util.Property
                /* renamed from: toString */
                public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    int colorForState = extendedFloatingActionButton.valueOf.getColorForState(extendedFloatingActionButton.getDrawableState(), setPreferenceScreen.this.toString.valueOf.getDefaultColor());
                    ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (onPreferenceChange.toString(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f.floatValue() == 1.0f) {
                        extendedFloatingActionButton.ag$a(extendedFloatingActionButton.valueOf);
                    } else {
                        extendedFloatingActionButton.ag$a(valueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Preference.BaseSavedState.AnonymousClass1.toString(animatorSet, arrayList);
        return animatorSet;
    }
}
