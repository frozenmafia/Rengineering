package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.ExitOrBlockUserVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExitOrBlockUserVM$exitClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ExitOrBlockUserVM.ExitOrBlockUserHandler $handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitOrBlockUserVM$exitClicked$1(ExitOrBlockUserVM.ExitOrBlockUserHandler exitOrBlockUserHandler) {
        super(0);
        this.$handler = exitOrBlockUserHandler;
    }

    @Override // o.Styleable.ArcMotion
    public final setAnimationMatrix invoke() {
        ExitOrBlockUserVM.ExitOrBlockUserHandler exitOrBlockUserHandler = this.$handler;
        if (exitOrBlockUserHandler == null) {
            return null;
        }
        exitOrBlockUserHandler.onExitClicked();
        return setAnimationMatrix.ag$a;
    }
}
