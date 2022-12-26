package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class ScreenStackHeaderSubview extends ReactViewGroup {
    private int ag$a;
    private int toString;
    private Type valueOf;

    /* loaded from: classes5.dex */
    public enum Type {
        LEFT,
        CENTER,
        RIGHT,
        BACK,
        SEARCH_BAR
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ScreenStackHeaderSubview(ReactContext reactContext) {
        super(reactContext);
        this.valueOf = Type.RIGHT;
    }

    public final void setType(Type type) {
        runAnimators.ag$a(type, "<set-?>");
        this.valueOf = type;
    }

    public final Type valueOf() {
        return this.valueOf;
    }

    public final ScreenStackHeaderConfig ah$a() {
        ViewParent parent = getParent();
        CustomToolbar customToolbar = parent instanceof CustomToolbar ? (CustomToolbar) parent : null;
        if (customToolbar == null) {
            return null;
        }
        return customToolbar.ah$a();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.ag$a = View.MeasureSpec.getSize(i);
            this.toString = View.MeasureSpec.getSize(i2);
            ViewParent parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.ag$a, this.toString);
    }
}
