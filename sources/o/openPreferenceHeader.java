package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import o.PreferenceFragmentCompat;
/* loaded from: classes5.dex */
public class openPreferenceHeader {
    static RectF valueOf(TabLayout.TabView tabView, int i) {
        int ah$a = tabView.ah$a();
        int ag$a = tabView.ag$a();
        int values = (int) PreferenceFragmentCompat.DividerDecoration.values(tabView.getContext(), i);
        if (ah$a < values) {
            ah$a = values;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = ah$a / 2;
        return new RectF(left - i2, top - (ag$a / 2), i2 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF values(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.HaptikSDK$b() && (view instanceof TabLayout.TabView)) {
            return valueOf((TabLayout.TabView) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void valueOf(TabLayout tabLayout, View view, Drawable drawable) {
        RectF values = values(tabLayout, view);
        drawable.setBounds((int) values.left, drawable.getBounds().top, (int) values.right, drawable.getBounds().bottom);
    }

    public void toString(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF values = values(tabLayout, view);
        RectF values2 = values(tabLayout, view2);
        drawable.setBounds(onPreferenceChange.valueOf((int) values.left, (int) values2.left, f), drawable.getBounds().top, onPreferenceChange.valueOf((int) values.right, (int) values2.right, f), drawable.getBounds().bottom);
    }
}
