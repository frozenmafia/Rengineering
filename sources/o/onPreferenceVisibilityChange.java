package o;

import android.util.Property;
import android.view.ViewGroup;
/* loaded from: classes7.dex */
public class onPreferenceVisibilityChange extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> toString = new onPreferenceVisibilityChange("childrenAlpha");

    private onPreferenceVisibilityChange(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: valueOf */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(Preference$BaseSavedState$HaptikSDK$c.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: ah$a */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(Preference$BaseSavedState$HaptikSDK$c.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
