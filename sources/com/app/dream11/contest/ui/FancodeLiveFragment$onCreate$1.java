package com.app.dream11.contest.ui;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onActivityPreDestroyed;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FancodeLiveFragment$onCreate$1 extends Lambda implements Styleable.ChangeBounds<onActivityPreDestroyed, setAnimationMatrix> {
    final /* synthetic */ FancodeLiveFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancodeLiveFragment$onCreate$1(FancodeLiveFragment fancodeLiveFragment) {
        super(1);
        this.this$0 = fancodeLiveFragment;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(onActivityPreDestroyed onactivitypredestroyed) {
        invoke2(onactivitypredestroyed);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(onActivityPreDestroyed onactivitypredestroyed) {
        this.this$0.ag$a(onactivitypredestroyed);
    }
}
