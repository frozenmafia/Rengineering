package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.captureHierarchy;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatContestInviteViewAllVM$onViewAllCTAClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Integer $contestCount;
    final /* synthetic */ String $inviterTeamName;
    final /* synthetic */ Integer $invitorId;
    final /* synthetic */ captureHierarchy<Integer, Integer, String, Integer, setAnimationMatrix> $onViewAllClick;
    final /* synthetic */ Integer $roundId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatContestInviteViewAllVM$onViewAllCTAClicked$1(captureHierarchy<? super Integer, ? super Integer, ? super String, ? super Integer, setAnimationMatrix> capturehierarchy, Integer num, Integer num2, String str, Integer num3) {
        super(0);
        this.$onViewAllClick = capturehierarchy;
        this.$roundId = num;
        this.$invitorId = num2;
        this.$inviterTeamName = str;
        this.$contestCount = num3;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onViewAllClick.invoke(this.$roundId, this.$invitorId, this.$inviterTeamName, this.$contestCount);
    }
}
