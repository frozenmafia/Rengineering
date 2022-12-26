package com.dreampay.ui.upi;

import android.view.LayoutInflater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Entity;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class UPIOptionListActivity$bindingInflater$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<LayoutInflater, Entity> {
    public static final UPIOptionListActivity$bindingInflater$1 INSTANCE = new UPIOptionListActivity$bindingInflater$1();

    UPIOptionListActivity$bindingInflater$1() {
        super(1, Entity.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lib/dreampay/databinding/ActivityUpiOptionsBinding;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final Entity invoke(LayoutInflater layoutInflater) {
        runAnimators.ag$a(layoutInflater, "p0");
        return Entity.values(layoutInflater);
    }
}
