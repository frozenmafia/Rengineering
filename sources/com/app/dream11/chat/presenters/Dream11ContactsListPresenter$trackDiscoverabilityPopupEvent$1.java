package com.app.dream11.chat.presenters;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getCategory;
import o.readFamily;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Dream11ContactsListPresenter$trackDiscoverabilityPopupEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $interaction;
    final /* synthetic */ Dream11ContactsListPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dream11ContactsListPresenter$trackDiscoverabilityPopupEvent$1(Dream11ContactsListPresenter dream11ContactsListPresenter, String str) {
        super(0);
        this.this$0 = dream11ContactsListPresenter;
        this.$interaction = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        getCategory socialFeature = this.this$0.getSocialFeature();
        getCategory getcategory = socialFeature;
        readFamily.toString(getcategory, Dream11ContactsListPresenter.access$getSourceFromFlowState(this.this$0), this.this$0.isAdmin(), this.this$0.getGroupUrlFromFlowState(), Dream11ContactsListPresenter.access$newOrExistingGroupType(this.this$0), this.$interaction);
    }
}
