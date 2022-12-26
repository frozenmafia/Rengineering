package com.app.dream11.chat.dynamiccard;

import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public abstract class DynamicChatCardVm implements IDynamicChatCardOps {
    private boolean dynamicDataLoading;
    private final Styleable.ChangeBounds<DynamicChatCardVm, setAnimationMatrix> fetchDataOp;
    private boolean isDataLoaded;
    private boolean isViewAttached;
    private final Styleable.ChangeBounds<Boolean, setAnimationMatrix> onDynamicCardAttachedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicChatCardVm(Styleable.ChangeBounds<? super DynamicChatCardVm, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(changeBounds, "fetchDataOp");
        this.fetchDataOp = changeBounds;
        this.onDynamicCardAttachedListener = new DynamicChatCardVm$onDynamicCardAttachedListener$1(this);
    }

    public final boolean getDynamicDataLoading() {
        return this.dynamicDataLoading;
    }

    public final void setDynamicDataLoading(boolean z) {
        this.dynamicDataLoading = z;
    }

    protected final boolean isViewAttached() {
        return this.isViewAttached;
    }

    protected final void setViewAttached(boolean z) {
        this.isViewAttached = z;
    }

    public final boolean isDataLoaded() {
        return this.isDataLoaded;
    }

    public final void setDataLoaded(boolean z) {
        this.isDataLoaded = z;
    }

    @Override // com.app.dream11.chat.dynamiccard.IDynamicChatCardOps
    public void fetchDynamicData() {
        if (this.dynamicDataLoading || this.isDataLoaded) {
            return;
        }
        this.fetchDataOp.invoke(this);
        setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        setDynamicDataLoading(true);
    }

    @Override // com.app.dream11.chat.dynamiccard.IDynamicChatCardOps
    public void onAttached() {
        this.isViewAttached = true;
    }

    @Override // com.app.dream11.chat.dynamiccard.IDynamicChatCardOps
    public void onDetached() {
        this.isViewAttached = false;
    }

    @Override // com.app.dream11.chat.dynamiccard.IDynamicChatCardOps
    public boolean isAttached() {
        return this.isViewAttached;
    }

    public final Styleable.ChangeBounds<Boolean, setAnimationMatrix> getOnDynamicCardAttachedListener() {
        return this.onDynamicCardAttachedListener;
    }
}
