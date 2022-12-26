package com.app.dream11.chat;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes6.dex */
public class VerticalSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final int firstItemSpaceHeight;
    private final int verticalSpaceHeight;

    public VerticalSpacingItemDecoration(int i, int i2) {
        this.verticalSpaceHeight = i;
        this.firstItemSpaceHeight = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = this.firstItemSpaceHeight;
        }
        rect.bottom = this.verticalSpaceHeight;
    }
}
