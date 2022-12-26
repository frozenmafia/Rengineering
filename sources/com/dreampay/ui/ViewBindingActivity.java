package com.dreampay.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes4.dex */
public abstract class ViewBindingActivity<VB extends ViewBinding> extends AppCompatActivity {
    private ViewBinding values;

    public abstract Styleable.ChangeBounds<LayoutInflater, VB> ah$b();

    public final VB values() {
        VB vb = (VB) this.values;
        Objects.requireNonNull(vb, "null cannot be cast to non-null type VB of com.dreampay.ui.ViewBindingActivity");
        return vb;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Styleable.ChangeBounds<LayoutInflater, VB> ah$b = ah$b();
        LayoutInflater layoutInflater = getLayoutInflater();
        runAnimators.ah$a(layoutInflater, "layoutInflater");
        VB invoke = ah$b.invoke(layoutInflater);
        this.values = invoke;
        if (invoke == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        setContentView(invoke.getRoot());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.values = null;
    }
}
