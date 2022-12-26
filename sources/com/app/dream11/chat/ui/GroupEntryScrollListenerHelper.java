package com.app.dream11.chat.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import o.runAnimators;
import o.setHeaderView;
/* loaded from: classes.dex */
public final class GroupEntryScrollListenerHelper {
    private setHeaderView currentScrollListener;
    private RecyclerView.OnScrollListener onScrollListener;
    private final GroupsEntryComponent view;

    public GroupEntryScrollListenerHelper(GroupsEntryComponent groupsEntryComponent) {
        runAnimators.ag$a(groupsEntryComponent, Promotion.ACTION_VIEW);
        this.view = groupsEntryComponent;
        this.onScrollListener = groupsEntryComponent.getOnScrollChangeListener();
    }

    public final setHeaderView getCurrentScrollListener() {
        return this.currentScrollListener;
    }

    public final void setCurrentScrollListener(setHeaderView setheaderview) {
        RecyclerView values;
        RecyclerView values2;
        setHeaderView setheaderview2 = this.currentScrollListener;
        if (setheaderview2 != null && (values2 = setheaderview2.values()) != null) {
            values2.removeOnScrollListener(this.onScrollListener);
        }
        this.currentScrollListener = setheaderview;
        if (setheaderview == null || (values = setheaderview.values()) == null) {
            return;
        }
        values.addOnScrollListener(this.onScrollListener);
    }

    public final void setChatBarExpanded(boolean z) {
        this.view.setChatBarExpanded(z);
    }
}
