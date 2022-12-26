package com.app.dream11.chat.groups;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getCategory;
import o.readFamily;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CreateGroupPresenter$trackContactsAddedToGroupEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $channelUrl;
    final /* synthetic */ int $selectedContactSize;
    final /* synthetic */ CreateGroupPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupPresenter$trackContactsAddedToGroupEvent$1(CreateGroupPresenter createGroupPresenter, String str, int i) {
        super(0);
        this.this$0 = createGroupPresenter;
        this.$channelUrl = str;
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
        String newOrExistingGroupType;
        getCategory socialFeature = this.this$0.getSocialFeature();
        sourceFromFlowState = this.this$0.getSourceFromFlowState();
        newOrExistingGroupType = this.this$0.newOrExistingGroupType();
        readFamily.values(socialFeature, this.$channelUrl, newOrExistingGroupType, this.this$0.isAdmin(), this.$selectedContactSize, sourceFromFlowState);
    }
}
