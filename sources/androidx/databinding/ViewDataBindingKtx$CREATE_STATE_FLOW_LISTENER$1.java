package androidx.databinding;

import androidx.databinding.ViewDataBindingKtx;
import java.lang.ref.ReferenceQueue;
import o.runAnimators;
/* loaded from: classes6.dex */
final class ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1 implements CreateWeakListener {
    public static final ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1 INSTANCE = new ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1();

    ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1() {
    }

    @Override // androidx.databinding.CreateWeakListener
    public final WeakListener<Object> create(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
        runAnimators.ah$a(referenceQueue, "referenceQueue");
        return new ViewDataBindingKtx.StateFlowListener(viewDataBinding, i, referenceQueue).getListener();
    }
}
