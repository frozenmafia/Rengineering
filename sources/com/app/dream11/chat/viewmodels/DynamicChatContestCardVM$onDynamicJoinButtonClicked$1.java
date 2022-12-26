package com.app.dream11.chat.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DynamicChatContestCardVM$onDynamicJoinButtonClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ DynamicChatContestCardVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicChatContestCardVM$onDynamicJoinButtonClicked$1(DynamicChatContestCardVM dynamicChatContestCardVM) {
        super(0);
        this.this$0 = dynamicChatContestCardVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Styleable.ChangeBounds changeBounds;
        if (this.this$0.getChatContestCard().getMatch().getContestCardMetaInfo().getInviteCode() == null) {
            return;
        }
        DynamicChatContestCardVM dynamicChatContestCardVM = this.this$0;
        changeBounds = dynamicChatContestCardVM.onJoinRequest;
        changeBounds.invoke(dynamicChatContestCardVM.getChatContestCard());
    }
}
