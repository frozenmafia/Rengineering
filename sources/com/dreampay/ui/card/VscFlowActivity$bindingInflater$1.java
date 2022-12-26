package com.dreampay.ui.card;

import android.view.LayoutInflater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Styleable;
import o.indices;
import o.runAnimators;
/* loaded from: classes4.dex */
final /* synthetic */ class VscFlowActivity$bindingInflater$1 extends FunctionReferenceImpl implements Styleable.ChangeBounds<LayoutInflater, indices> {
    public static final VscFlowActivity$bindingInflater$1 INSTANCE = new VscFlowActivity$bindingInflater$1();

    VscFlowActivity$bindingInflater$1() {
        super(1, indices.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lib/dreampay/databinding/ActivityVscFlowBinding;", 0);
    }

    @Override // o.Styleable.ChangeBounds
    public final indices invoke(LayoutInflater layoutInflater) {
        runAnimators.ag$a(layoutInflater, "p0");
        return indices.valueOf(layoutInflater);
    }
}
