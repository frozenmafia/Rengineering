package com.app.dream11.model.viewmodel;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import com.app.dream11.ui.databinding.RxObservableField;
import com.app.dream11Pro.R;
import o.loadFont;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class EnterMobileNumberVM extends BasePageVM {
    private ObservableField<Integer> checkBoxDrawable;
    @Bindable
    private String errorMessage;
    private EnterMobileNumberPageHandler handler;
    private final RxObservableField<Boolean> isAgeCheckboxSelected;
    private final boolean isPlayStoreBuild;
    private String mobileNumber;

    public static /* synthetic */ EnterMobileNumberVM copy$default(EnterMobileNumberVM enterMobileNumberVM, String str, EnterMobileNumberPageHandler enterMobileNumberPageHandler, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enterMobileNumberVM.mobileNumber;
        }
        if ((i & 2) != 0) {
            enterMobileNumberPageHandler = enterMobileNumberVM.handler;
        }
        if ((i & 4) != 0) {
            str2 = enterMobileNumberVM.errorMessage;
        }
        return enterMobileNumberVM.copy(str, enterMobileNumberPageHandler, str2);
    }

    public final String component1() {
        return this.mobileNumber;
    }

    public final EnterMobileNumberPageHandler component2() {
        return this.handler;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final EnterMobileNumberVM copy(String str, EnterMobileNumberPageHandler enterMobileNumberPageHandler, String str2) {
        runAnimators.ag$a(str, "mobileNumber");
        runAnimators.ag$a(enterMobileNumberPageHandler, "handler");
        runAnimators.ag$a(str2, "errorMessage");
        return new EnterMobileNumberVM(str, enterMobileNumberPageHandler, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnterMobileNumberVM) {
            EnterMobileNumberVM enterMobileNumberVM = (EnterMobileNumberVM) obj;
            return runAnimators.values((Object) this.mobileNumber, (Object) enterMobileNumberVM.mobileNumber) && runAnimators.values(this.handler, enterMobileNumberVM.handler) && runAnimators.values((Object) this.errorMessage, (Object) enterMobileNumberVM.errorMessage);
        }
        return false;
    }

    public int hashCode() {
        return (((this.mobileNumber.hashCode() * 31) + this.handler.hashCode()) * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        String str = this.mobileNumber;
        EnterMobileNumberPageHandler enterMobileNumberPageHandler = this.handler;
        String str2 = this.errorMessage;
        return "EnterMobileNumberVM(mobileNumber=" + str + ", handler=" + enterMobileNumberPageHandler + ", errorMessage=" + str2 + ")";
    }

    public EnterMobileNumberVM(String str, EnterMobileNumberPageHandler enterMobileNumberPageHandler, String str2) {
        runAnimators.ag$a(str, "mobileNumber");
        runAnimators.ag$a(enterMobileNumberPageHandler, "handler");
        runAnimators.ag$a(str2, "errorMessage");
        this.mobileNumber = str;
        this.handler = enterMobileNumberPageHandler;
        this.errorMessage = str2;
        boolean z = loadFont.valueOf;
        this.isPlayStoreBuild = z;
        this.isAgeCheckboxSelected = new RxObservableField<>(Boolean.valueOf(!z));
        this.checkBoxDrawable = new ObservableField<>(Integer.valueOf((int) R.drawable.ic_checkbox_unchecked_square));
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final EnterMobileNumberPageHandler getHandler() {
        return this.handler;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final void setErrorMessage(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setHandler(EnterMobileNumberPageHandler enterMobileNumberPageHandler) {
        runAnimators.ag$a(enterMobileNumberPageHandler, "<set-?>");
        this.handler = enterMobileNumberPageHandler;
    }

    public final void setMobileNumber(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final boolean isPlayStoreBuild() {
        return this.isPlayStoreBuild;
    }

    public final RxObservableField<Boolean> isAgeCheckboxSelected() {
        return this.isAgeCheckboxSelected;
    }

    public final ObservableField<Integer> getCheckBoxDrawable() {
        return this.checkBoxDrawable;
    }

    public final void setCheckBoxDrawable(ObservableField<Integer> observableField) {
        runAnimators.ag$a(observableField, "<set-?>");
        this.checkBoxDrawable = observableField;
    }

    public final void setError(String str) {
        runAnimators.ag$a(str, "error");
        this.errorMessage = str;
        notifyPropertyChanged(100);
    }
}
