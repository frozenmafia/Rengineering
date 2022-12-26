package com.app.dream11.model.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
/* loaded from: classes3.dex */
public class BasePageVM extends BaseObservable {
    private boolean progressVisibilty = false;

    @Bindable
    public boolean isProgressVisibilty() {
        return this.progressVisibilty;
    }

    public void setProgressVisibilty(boolean z) {
        this.progressVisibilty = z;
        notifyPropertyChanged(323);
    }
}
