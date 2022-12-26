package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int ag$a;
    final Rect ah$a;
    final Rect toString;
    private int values;

    private static int values(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    float toString(View view) {
        return 1.0f;
    }

    abstract View valueOf(List<View> list);

    protected boolean values() {
        return false;
    }

    public HeaderScrollingViewBehavior() {
        this.toString = new Rect();
        this.ah$a = new Rect();
        this.values = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = new Rect();
        this.ah$a = new Rect();
        this.values = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View valueOf;
        WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (valueOf = valueOf(coordinatorLayout.getDependencies(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (ViewCompat.getFitsSystemWindows(valueOf) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int ag$a = size + ag$a(valueOf);
            int measuredHeight = valueOf.getMeasuredHeight();
            if (values()) {
                view.setTranslationY(-measuredHeight);
            } else {
                ag$a -= measuredHeight;
            }
            coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(ag$a, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void ag$a(CoordinatorLayout coordinatorLayout, View view, int i) {
        View valueOf = valueOf(coordinatorLayout.getDependencies(view));
        if (valueOf != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.toString;
            int paddingLeft = coordinatorLayout.getPaddingLeft();
            int i2 = layoutParams.leftMargin;
            int bottom = valueOf.getBottom();
            int i3 = layoutParams.topMargin;
            int width = coordinatorLayout.getWidth();
            int paddingRight = coordinatorLayout.getPaddingRight();
            rect.set(paddingLeft + i2, bottom + i3, (width - paddingRight) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + valueOf.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.ah$a;
            GravityCompat.apply(values(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int values = values(valueOf);
            view.layout(rect2.left, rect2.top - values, rect2.right, rect2.bottom - values);
            this.values = rect2.top - valueOf.getBottom();
            return;
        }
        super.ag$a(coordinatorLayout, view, i);
        this.values = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int values(View view) {
        if (this.ag$a == 0) {
            return 0;
        }
        float headerScrollingViewBehavior = toString(view);
        int i = this.ag$a;
        return MathUtils.clamp((int) (headerScrollingViewBehavior * i), 0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int ag$a(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int valueOf() {
        return this.values;
    }

    public final void ag$a(int i) {
        this.ag$a = i;
    }

    public final int ah$a() {
        return this.ag$a;
    }
}
