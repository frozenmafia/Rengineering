package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;
import o.onPreferenceTreeClick;
@Deprecated
/* loaded from: classes7.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    private int ah$a;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    protected abstract boolean valueOf(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.ah$a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah$a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final onPreferenceTreeClick valueOf;
        if (ViewCompat.isLaidOut(view) || (valueOf = valueOf(coordinatorLayout, view)) == null || !valueOf(valueOf.values())) {
            return false;
        }
        final int i2 = valueOf.values() ? 1 : 2;
        this.ah$a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.4
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ExpandableBehavior.this.ah$a == i2) {
                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                    onPreferenceTreeClick onpreferencetreeclick = valueOf;
                    expandableBehavior.valueOf((View) onpreferencetreeclick, view, onpreferencetreeclick.values(), false);
                }
                return false;
            }
        });
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        onPreferenceTreeClick onpreferencetreeclick = (onPreferenceTreeClick) view2;
        if (valueOf(onpreferencetreeclick.values())) {
            this.ah$a = onpreferencetreeclick.values() ? 1 : 2;
            return valueOf((View) onpreferencetreeclick, view, onpreferencetreeclick.values(), true);
        }
        return false;
    }

    protected onPreferenceTreeClick valueOf(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (onPreferenceTreeClick) view2;
            }
        }
        return null;
    }

    private boolean valueOf(boolean z) {
        if (!z) {
            return this.ah$a == 1;
        }
        int i = this.ah$a;
        return i == 0 || i == 2;
    }
}
