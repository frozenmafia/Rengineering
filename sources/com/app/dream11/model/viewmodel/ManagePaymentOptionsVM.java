package com.app.dream11.model.viewmodel;

import androidx.databinding.ObservableList;
import o.BinderThread;
/* loaded from: classes3.dex */
public class ManagePaymentOptionsVM {
    private BinderThread handler;
    private ObservableList<PaymentOptionVM> optionsVMList;

    public ObservableList<PaymentOptionVM> getOptionsVMList() {
        return this.optionsVMList;
    }

    public void setOptionsVMList(ObservableList<PaymentOptionVM> observableList) {
        this.optionsVMList = observableList;
    }

    public BinderThread getHandler() {
        return this.handler;
    }

    public void setHandler(BinderThread binderThread) {
        this.handler = binderThread;
    }
}
