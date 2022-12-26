package com.app.dream11.chat.presenters;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readFamily;
import o.setAnimationMatrix;
import o.setFlag;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Dream11ContactsListPresenter$sendSearchEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Dream11ContactsListPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ContactsListPresenter$sendSearchEvent$1(Dream11ContactsListPresenter dream11ContactsListPresenter) {
        super(0);
        this.this$0 = dream11ContactsListPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setFlag contactSyncFeature = this.this$0.getContactSyncFeature();
        String access$getSourceFromFlowState = Dream11ContactsListPresenter.access$getSourceFromFlowState(this.this$0);
        String screenFromFlowState = this.this$0.getScreenFromFlowState();
        setFlag setflag = contactSyncFeature;
        readFamily.toString(setflag, access$getSourceFromFlowState, this.this$0.isAdmin(), this.this$0.getGroupUrlFromFlowState(), Dream11ContactsListPresenter.access$newOrExistingGroupType(this.this$0), screenFromFlowState, this.this$0.getContactSyncFeature().invoke());
    }
}
