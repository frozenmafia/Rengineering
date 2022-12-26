package com.app.dream11.privacy.blockuser;

import kotlin.jvm.internal.Lambda;
import o.CoordinatorLayout;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class BlockedUsersItemVM$unblockClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ CoordinatorLayout.OnPreDrawListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedUsersItemVM$unblockClicked$1(CoordinatorLayout.OnPreDrawListener onPreDrawListener) {
        super(0);
        this.this$0 = onPreDrawListener;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        CoordinatorLayout.OnPreDrawListener.toString ah$b = this.this$0.ah$b();
        if (ah$b == null) {
            return null;
        }
        ah$b.toString(this.this$0);
        return setAnimationMatrix.ag$a;
    }
}
