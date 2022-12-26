package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import o.Preference;
import o.PreferenceGroup;
import o.createItem;
import o.setInitialExpandedChildrenCount;
/* loaded from: classes7.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(createItem.valueOf(context, attributeSet, i, i2), attributeSet, i);
        int valueOf;
        Context context2 = getContext();
        if (values(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (toString(context2, theme, attributeSet, i, i2) || (valueOf = valueOf(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            values(theme, valueOf);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (values(context)) {
            values(context.getTheme(), i);
        }
    }

    private void values(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, Preference.BaseSavedState.getSignupData.MaterialTextAppearance);
        int materialTextView = toString(getContext(), obtainStyledAttributes, Preference.BaseSavedState.getSignupData.MaterialTextAppearance_android_lineHeight, Preference.BaseSavedState.getSignupData.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (materialTextView >= 0) {
            setLineHeight(materialTextView);
        }
    }

    private static boolean values(Context context) {
        return setInitialExpandedChildrenCount.values(context, Preference.BaseSavedState.values.textAppearanceLineHeightEnabled, true);
    }

    private static int toString(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = PreferenceGroup.AnonymousClass1.ah$a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private static boolean toString(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, Preference.BaseSavedState.getSignupData.MaterialTextView, i, i2);
        int materialTextView = toString(context, obtainStyledAttributes, Preference.BaseSavedState.getSignupData.MaterialTextView_android_lineHeight, Preference.BaseSavedState.getSignupData.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return materialTextView != -1;
    }

    private static int valueOf(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, Preference.BaseSavedState.getSignupData.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(Preference.BaseSavedState.getSignupData.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
