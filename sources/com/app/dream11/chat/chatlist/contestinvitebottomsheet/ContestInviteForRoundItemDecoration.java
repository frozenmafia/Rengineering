package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.dream11.androidhelpers.adapters.BaseAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.hasOpaqueBackground;
import o.hasPeekingDrawer;
import o.hasVisibleDrawer;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ContestInviteForRoundItemDecoration extends RecyclerView.ItemDecoration {
    private final int bottomMargin;
    private final int middleMargin;
    private final int topMargin;

    public ContestInviteForRoundItemDecoration(int i, int i2, int i3) {
        this.topMargin = i;
        this.middleMargin = i2;
        this.bottomMargin = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        runAnimators.ag$a(rect, "outRect");
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        try {
            if (recyclerView.getAdapter() == null || childAdapterPosition < 0 || !(recyclerView.getAdapter() instanceof hasOpaqueBackground)) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dream11.androidhelpers.adapters.PaginationWithChildrenAdapter");
            }
            BaseAdapter ag$a = ((hasOpaqueBackground) adapter).ag$a();
            if (ag$a == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dream11.androidhelpers.adapters.MultiListAdapter");
            }
            BaseAdapter.values ah$a = ((hasPeekingDrawer) ag$a).ah$a(childAdapterPosition);
            if (ah$a.values instanceof hasVisibleDrawer) {
                int i2 = ah$a.toString;
                BaseAdapter baseAdapter = ah$a.values;
                if (baseAdapter == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.dream11.androidhelpers.adapters.HeaderFooterWithChildrenAdapter");
                }
                BaseAdapter ah$a2 = ((hasVisibleDrawer) baseAdapter).ah$a();
                if (i2 == 0 || i2 - 1 < 0) {
                    return;
                }
                if (ah$a2.values() == 1) {
                    rect.top = this.topMargin;
                    rect.bottom = this.bottomMargin;
                } else if (i == 0) {
                    rect.top = this.topMargin;
                    rect.bottom = this.middleMargin;
                } else if (i == ah$a2.values() - 1) {
                    BaseAdapter baseAdapter2 = ah$a.values;
                    if (baseAdapter2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.dream11.androidhelpers.adapters.HeaderFooterWithChildrenAdapter");
                    }
                    if (((hasVisibleDrawer) baseAdapter2).valueOf() == 1) {
                        rect.bottom = this.bottomMargin / 2;
                    } else {
                        rect.bottom = this.bottomMargin;
                    }
                } else {
                    rect.bottom = this.middleMargin;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
