package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes5.dex */
public final class onNavigateToScreen {
    private final View toString;
    private boolean valueOf = false;
    private int values = 0;

    public onNavigateToScreen(onPreferenceTreeClick onpreferencetreeclick) {
        this.toString = (View) onpreferencetreeclick;
    }

    public boolean ah$a() {
        return this.valueOf;
    }

    public Bundle ag$a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.valueOf);
        bundle.putInt("expandedComponentIdHint", this.values);
        return bundle;
    }

    public void values(Bundle bundle) {
        this.valueOf = bundle.getBoolean("expanded", false);
        this.values = bundle.getInt("expandedComponentIdHint", 0);
        if (this.valueOf) {
            valueOf();
        }
    }

    public void ag$a(int i) {
        this.values = i;
    }

    public int values() {
        return this.values;
    }

    private void valueOf() {
        ViewParent parent = this.toString.getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout) parent).dispatchDependentViewsChanged(this.toString);
        }
    }
}
