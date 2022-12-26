package com.giphy.sdk.ui.universallist;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import o.WindowMetricsCalculatorDecorator;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public WrapStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        runAnimators.ag$a(state, "state");
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
            WindowMetricsCalculatorDecorator.toString("IndexOutOfBoundsException in RecyclerView triggered by RecyclerView.onLayout()", new Object[0]);
        }
    }
}
