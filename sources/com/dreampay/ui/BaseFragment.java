package com.dreampay.ui;

import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import o.orderBy;
/* loaded from: classes4.dex */
public abstract class BaseFragment<VB extends ViewBinding> extends ViewBindingFragment<VB> {
    private orderBy valueOf = new orderBy();

    /* JADX INFO: Access modifiers changed from: protected */
    public final orderBy ag$a() {
        return this.valueOf;
    }

    private final BaseActivity<?> valueOf() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            return (BaseActivity) activity;
        }
        return null;
    }

    public final void ah$a(String str) {
        if (valueOf() == null) {
            return;
        }
        BaseActivity<?> valueOf = valueOf();
        if (valueOf != null) {
            valueOf.f_();
        }
        BaseActivity<?> valueOf2 = valueOf();
        if (valueOf2 == null) {
            return;
        }
        valueOf2.valueOf(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.valueOf.dispose();
    }
}
