package com.app.dream11.model.viewmodel;

import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import o.setVelocity;
/* loaded from: classes3.dex */
public class OtpSubmitPageVM extends OtpPageViewModel<setVelocity> {
    private boolean isClearOtp;
    private boolean usingLoginVisibility;

    public OtpSubmitPageVM(setVelocity setvelocity, String str) {
        super(setvelocity, str);
    }

    @Bindable
    public boolean isUsingLoginVisibility() {
        return this.usingLoginVisibility;
    }

    public void setUsingLoginVisibility(boolean z) {
        this.usingLoginVisibility = z;
        notifyPropertyChanged(BR.usingLoginVisibility);
    }

    @Bindable
    public boolean isClearOtp() {
        return this.isClearOtp;
    }

    public void setClearOtp(boolean z) {
        this.isClearOtp = z;
        notifyPropertyChanged(30);
    }
}
