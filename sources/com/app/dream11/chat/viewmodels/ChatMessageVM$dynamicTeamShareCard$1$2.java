package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.dynamiccard.teamshare.TeamShareCardModel;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatMessageVM$dynamicTeamShareCard$1$2 extends Lambda implements Styleable.ChangeBounds<TeamShareCardModel, setAnimationMatrix> {
    final /* synthetic */ ChatMessageVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageVM$dynamicTeamShareCard$1$2(ChatMessageVM chatMessageVM) {
        super(1);
        this.this$0 = chatMessageVM;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(TeamShareCardModel teamShareCardModel) {
        invoke2(teamShareCardModel);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TeamShareCardModel teamShareCardModel) {
        runAnimators.ag$a(teamShareCardModel, "it");
        this.this$0.onGetSharedTeamClicked();
    }
}
