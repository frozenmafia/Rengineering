package com.app.dream11.chat.presenters;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addPage;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AddParticipantsLandingPresenter$searchHelper$2 extends Lambda implements Styleable.ArcMotion<addPage> {
    final /* synthetic */ AddParticipantsLandingPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddParticipantsLandingPresenter$searchHelper$2(AddParticipantsLandingPresenter addParticipantsLandingPresenter) {
        super(0);
        this.this$0 = addParticipantsLandingPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public final addPage invoke() {
        return new addPage(this.this$0.getContactSyncFeature(), this.this$0.getUserSearchFeature(), this.this$0.getSocialFeature(), this.this$0.getResourceProvider());
    }
}
