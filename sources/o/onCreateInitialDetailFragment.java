package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* loaded from: classes7.dex */
public class onCreateInitialDetailFragment extends openPreferenceHeader {
    private static float toString(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    private static float ag$a(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.openPreferenceHeader
    public void toString(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float oncreateinitialdetailfragment;
        float ag$a;
        RectF values = values(tabLayout, view);
        RectF values2 = values(tabLayout, view2);
        if (values.left < values2.left) {
            oncreateinitialdetailfragment = ag$a(f);
            ag$a = toString(f);
        } else {
            oncreateinitialdetailfragment = toString(f);
            ag$a = ag$a(f);
        }
        drawable.setBounds(onPreferenceChange.valueOf((int) values.left, (int) values2.left, oncreateinitialdetailfragment), drawable.getBounds().top, onPreferenceChange.valueOf((int) values.right, (int) values2.right, ag$a), drawable.getBounds().bottom);
    }
}
