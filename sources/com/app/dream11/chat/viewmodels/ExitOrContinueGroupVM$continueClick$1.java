package com.app.dream11.chat.viewmodels;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExitOrContinueGroupVM$continueClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ExitOrContinueGroupVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitOrContinueGroupVM$continueClick$1(ExitOrContinueGroupVM exitOrContinueGroupVM) {
        super(0);
        this.this$0 = exitOrContinueGroupVM;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        ExitOrContinueGroupHandler handler = this.this$0.getHandler();
        if (handler == null) {
            return null;
        }
        handler.onContinueClicked();
        return setAnimationMatrix.ag$a;
    }
}
