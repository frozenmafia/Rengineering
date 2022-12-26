package o;

import android.view.View;
/* loaded from: classes5.dex */
public class PreferenceFragmentCompat$DividerDecoration$ah$a {
    public int ag$a;
    public int ah$a;
    public int toString;
    public int valueOf;

    public PreferenceFragmentCompat$DividerDecoration$ah$a(int i, int i2, int i3, int i4) {
        this.ah$a = i;
        this.toString = i2;
        this.valueOf = i3;
        this.ag$a = i4;
    }

    public PreferenceFragmentCompat$DividerDecoration$ah$a(PreferenceFragmentCompat$DividerDecoration$ah$a preferenceFragmentCompat$DividerDecoration$ah$a) {
        this.ah$a = preferenceFragmentCompat$DividerDecoration$ah$a.ah$a;
        this.toString = preferenceFragmentCompat$DividerDecoration$ah$a.toString;
        this.valueOf = preferenceFragmentCompat$DividerDecoration$ah$a.valueOf;
        this.ag$a = preferenceFragmentCompat$DividerDecoration$ah$a.ag$a;
    }

    public void ag$a(View view) {
        androidx.core.view.ViewCompat.setPaddingRelative(view, this.ah$a, this.toString, this.valueOf, this.ag$a);
    }
}
