package com.app.dream11.newmycontests.playerstats.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.LinkedHashMap;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class CustomHorizontalScrollView extends HorizontalScrollView {
    public Map<Integer, View> ah$a;
    private CustomHorizontalScrollView$ah$a values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomHorizontalScrollView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attributeSet");
        this.ah$a = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attributeSet");
        this.ah$a = new LinkedHashMap();
    }

    public final void setListener(CustomHorizontalScrollView$ah$a customHorizontalScrollView$ah$a) {
        runAnimators.ag$a(customHorizontalScrollView$ah$a, "onScrollChangedListener");
        this.values = customHorizontalScrollView$ah$a;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        CustomHorizontalScrollView$ah$a customHorizontalScrollView$ah$a = this.values;
        if (customHorizontalScrollView$ah$a != null) {
            customHorizontalScrollView$ah$a.toString(i, i2, i3, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }
}
