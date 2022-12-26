package com.app.dream11;

import kotlin.jvm.internal.Lambda;
import o.ActivityResultContracts;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class PrivateContestShareVM$friendsTabsClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ActivityResultContracts.OpenMultipleDocuments this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateContestShareVM$friendsTabsClicked$1(ActivityResultContracts.OpenMultipleDocuments openMultipleDocuments) {
        super(0);
        this.this$0 = openMultipleDocuments;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z;
        this.this$0.ah$b().set(1);
        this.this$0.onXdkEvent().valueOf(1);
        z = this.this$0.extraCallback;
        if (z) {
            return;
        }
        this.this$0.extraCallback = true;
        this.this$0.onXdkEvent().invoke();
    }
}
