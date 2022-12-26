package com.facebook.react.views.scroll;

import android.content.Context;
import com.facebook.react.views.view.ReactViewGroup;
import o.setNonConfig;
/* loaded from: classes4.dex */
public class ReactHorizontalScrollContainerView extends ReactViewGroup {
    private int ah$a;
    private int toString;

    public ReactHorizontalScrollContainerView(Context context) {
        super(context);
        this.toString = setNonConfig.ah$a().toString(context) ? 1 : 0;
        this.ah$a = 0;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.uimanager.ReactClippingViewGroup
    public void setRemoveClippedSubviews(boolean z) {
        if (this.toString == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.toString == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            if (this.ah$a != getWidth()) {
                ReactHorizontalScrollView reactHorizontalScrollView = (ReactHorizontalScrollView) getParent();
                int scrollX = reactHorizontalScrollView.getScrollX();
                int width = getWidth();
                reactHorizontalScrollView.scrollTo(((scrollX + width) - this.ah$a) - reactHorizontalScrollView.getWidth(), reactHorizontalScrollView.getScrollY());
            }
        }
        this.ah$a = getWidth();
    }
}
