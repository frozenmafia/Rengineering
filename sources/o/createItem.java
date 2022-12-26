package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.Preference;
/* loaded from: classes5.dex */
public class createItem {
    private static final int[] values = {16842752, Preference.BaseSavedState.values.theme};
    private static final int[] ag$a = {Preference.BaseSavedState.values.materialThemeOverlay};

    public static Context valueOf(Context context, AttributeSet attributeSet, int i, int i2) {
        int createitem = toString(context, attributeSet, i, i2);
        boolean z = (context instanceof androidx.appcompat.view.ContextThemeWrapper) && ((androidx.appcompat.view.ContextThemeWrapper) context).getThemeResId() == createitem;
        if (createitem == 0 || z) {
            return context;
        }
        androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper = new androidx.appcompat.view.ContextThemeWrapper(context, createitem);
        int ag$a2 = ag$a(context, attributeSet);
        if (ag$a2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(ag$a2, true);
        }
        return contextThemeWrapper;
    }

    private static int ag$a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, values);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int toString(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ag$a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
