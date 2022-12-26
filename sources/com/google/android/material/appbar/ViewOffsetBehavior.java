package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int ag$a;
    private Preference.SummaryProvider ah$a;
    private int toString;

    public ViewOffsetBehavior() {
        this.toString = 0;
        this.ag$a = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = 0;
        this.ag$a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        ag$a(coordinatorLayout, v, i);
        if (this.ah$a == null) {
            this.ah$a = new Preference.SummaryProvider(v);
        }
        this.ah$a.ag$a();
        this.ah$a.valueOf();
        int i2 = this.toString;
        if (i2 != 0) {
            this.ah$a.toString(i2);
            this.toString = 0;
        }
        int i3 = this.ag$a;
        if (i3 != 0) {
            this.ah$a.valueOf(i3);
            this.ag$a = 0;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag$a(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean toString(int i) {
        Preference.SummaryProvider summaryProvider = this.ah$a;
        if (summaryProvider != null) {
            return summaryProvider.toString(i);
        }
        this.toString = i;
        return false;
    }

    public int ag$a() {
        Preference.SummaryProvider summaryProvider = this.ah$a;
        if (summaryProvider != null) {
            return summaryProvider.ah$a();
        }
        return 0;
    }
}
