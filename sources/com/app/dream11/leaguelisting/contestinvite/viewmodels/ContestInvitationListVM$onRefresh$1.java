package com.app.dream11.leaguelisting.contestinvite.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getKeyFrameInfo;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class ContestInvitationListVM$onRefresh$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Styleable.ArcMotion<setAnimationMatrix> $onRefreshListener;
    final /* synthetic */ getKeyFrameInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestInvitationListVM$onRefresh$1(getKeyFrameInfo getkeyframeinfo, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        super(0);
        this.this$0 = getkeyframeinfo;
        this.$onRefreshListener = arcMotion;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.onXdkEvent().set(true);
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.$onRefreshListener;
        if (arcMotion == null) {
            return;
        }
        arcMotion.invoke();
    }
}
