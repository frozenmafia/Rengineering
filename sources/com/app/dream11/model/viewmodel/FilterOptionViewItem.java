package com.app.dream11.model.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
/* loaded from: classes6.dex */
public class FilterOptionViewItem extends BaseObservable {
    private boolean isEnableForCombination = true;
    private boolean isSelected;
    private String title;
    private String value;

    @Bindable
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Bindable
    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @Bindable
    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
        notifyPropertyChanged(364);
    }

    public boolean isEnableForCombination() {
        return this.isEnableForCombination;
    }

    public void setEnableForCombination(boolean z) {
        this.isEnableForCombination = z;
    }
}
