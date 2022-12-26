package com.app.dream11.chat.presenters;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getCategory;
import o.readFamily;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AddParticipantsLandingPresenter$trackAddParticipantContinueClickedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ int $noOfContactsSelected;
    final /* synthetic */ int $noOfFriendsSelected;
    final /* synthetic */ int $noOfParticipantsSelected;
    final /* synthetic */ String $tabSelected;
    final /* synthetic */ AddParticipantsLandingPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddParticipantsLandingPresenter$trackAddParticipantContinueClickedEvent$1(AddParticipantsLandingPresenter addParticipantsLandingPresenter, String str, String str2, int i, int i2, int i3) {
        super(0);
        this.this$0 = addParticipantsLandingPresenter;
        this.$tabSelected = str;
        this.$errorMessage = str2;
        this.$noOfContactsSelected = i;
        this.$noOfFriendsSelected = i2;
        this.$noOfParticipantsSelected = i3;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String screenFromFlowState;
        getCategory socialFeature = this.this$0.getSocialFeature();
        String str = this.$tabSelected;
        String str2 = this.$errorMessage;
        screenFromFlowState = this.this$0.getScreenFromFlowState();
        readFamily.valueOf(socialFeature, str, str2, screenFromFlowState, this.$noOfContactsSelected, this.$noOfFriendsSelected, this.$noOfParticipantsSelected);
    }
}
