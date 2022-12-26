package com.app.dream11.chat.presenters;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getCategory;
import o.readFamily;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AddParticipantsLandingPresenter$trackContactsAddedToGroupEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ int $selectedContactSize;
    final /* synthetic */ AddParticipantsLandingPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddParticipantsLandingPresenter$trackContactsAddedToGroupEvent$1(AddParticipantsLandingPresenter addParticipantsLandingPresenter, int i) {
        super(0);
        this.this$0 = addParticipantsLandingPresenter;
        this.$selectedContactSize = i;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String sourceFromFlowState;
        String groupUrlFromFlowState;
        String newOrExistingGroupType;
        Boolean isAdmin;
        getCategory socialFeature = this.this$0.getSocialFeature();
        sourceFromFlowState = this.this$0.getSourceFromFlowState();
        groupUrlFromFlowState = this.this$0.getGroupUrlFromFlowState();
        newOrExistingGroupType = this.this$0.newOrExistingGroupType();
        isAdmin = this.this$0.isAdmin();
        readFamily.values(socialFeature, groupUrlFromFlowState, newOrExistingGroupType, isAdmin == null ? false : isAdmin.booleanValue(), this.$selectedContactSize, sourceFromFlowState);
    }
}
