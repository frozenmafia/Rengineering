package com.app.dream11.model.viewmodel;

import androidx.databinding.BaseObservable;
/* loaded from: classes6.dex */
public class FilterClickViewItem extends BaseObservable {
    private String filterText;
    private boolean isFilterApplied;

    public String getFilterText() {
        return this.filterText;
    }

    public void setFilterText(String str) {
        this.filterText = str;
    }

    public boolean isFilterApplied() {
        return this.isFilterApplied;
    }

    public void setFilterApplied(boolean z) {
        this.isFilterApplied = z;
    }
}
