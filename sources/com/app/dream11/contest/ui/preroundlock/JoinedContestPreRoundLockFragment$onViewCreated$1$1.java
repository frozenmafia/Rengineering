package com.app.dream11.contest.ui.preroundlock;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class JoinedContestPreRoundLockFragment$onViewCreated$1$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ JoinedContestPreRoundLockFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinedContestPreRoundLockFragment$onViewCreated$1$1(JoinedContestPreRoundLockFragment joinedContestPreRoundLockFragment) {
        super(0);
        this.this$0 = joinedContestPreRoundLockFragment;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.reloadData();
    }
}
