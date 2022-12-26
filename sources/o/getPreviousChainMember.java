package o;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public final class getPreviousChainMember extends RecyclerView.ViewHolder implements connectCircularConstraint {
    private final androidx.databinding.ViewDataBinding ah$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPreviousChainMember(androidx.databinding.ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        runAnimators.ag$a(viewDataBinding, "itemViewBinding");
        this.ah$a = viewDataBinding;
    }

    @Override // o.connectCircularConstraint
    public void values(setGoneMargin setgonemargin) {
        runAnimators.ag$a(setgonemargin, "data");
        this.ah$a.setVariable(setgonemargin.getBindingVar(), setgonemargin);
        this.ah$a.executePendingBindings();
    }
}
