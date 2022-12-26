package com.app.dream11.dream11;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes6.dex */
public class DHRecyclerView extends RecyclerView {
    public DHRecyclerView(Context context) {
        super(context);
    }

    public DHRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DHRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = (size * 80) / 100;
        Log.d("dream11/dh-recyclerview", "onMeasure: " + size + "newheight " + i3);
        if (size > i3) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
