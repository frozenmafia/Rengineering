package com.dreampay.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import o.excludeObject;
import o.runAnimators;
/* loaded from: classes4.dex */
public abstract class ViewBindingFragment<VB extends ViewBinding> extends Fragment {
    private ViewBinding values;

    public abstract excludeObject<LayoutInflater, ViewGroup, Boolean, VB> ah$a();

    public final VB values() {
        VB vb = (VB) this.values;
        Objects.requireNonNull(vb, "null cannot be cast to non-null type VB of com.dreampay.ui.ViewBindingFragment");
        return vb;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        runAnimators.ag$a(layoutInflater, "inflater");
        VB invoke = ah$a().invoke(layoutInflater, viewGroup, false);
        this.values = invoke;
        if (invoke != null) {
            return invoke.getRoot();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.values = null;
    }
}
