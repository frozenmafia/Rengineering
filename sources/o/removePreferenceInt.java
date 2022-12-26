package o;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;
/* loaded from: classes7.dex */
public final class removePreferenceInt extends NavigationBarItemView {
    public removePreferenceInt(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int ag$a() {
        return Preference$BaseSavedState$HaptikSDK$b.mtrl_navigation_rail_item;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    public int valueOf() {
        return Preference$BaseSavedState$ah$a.mtrl_navigation_rail_icon_margin;
    }
}
