package com.app.dream11.chat.ui;

import com.app.dream11.chat.presenters.ExitOrBlockUserPresenter;
import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExitOrBlockUserBottomSheet$exitOrBlockUserPresenter$2 extends Lambda implements Styleable.ArcMotion<ExitOrBlockUserPresenter> {
    final /* synthetic */ ExitOrBlockUserBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitOrBlockUserBottomSheet$exitOrBlockUserPresenter$2(ExitOrBlockUserBottomSheet exitOrBlockUserBottomSheet) {
        super(0);
        this.this$0 = exitOrBlockUserBottomSheet;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final ExitOrBlockUserPresenter invoke() {
        ExitOrBlockUserPresenter newSessionWithExtras = ActionMenuItem.valueOf().newSessionWithExtras();
        ExitOrBlockUserBottomSheet exitOrBlockUserBottomSheet = this.this$0;
        newSessionWithExtras.setGroupInvitorName(exitOrBlockUserBottomSheet.getInvitorName());
        newSessionWithExtras.setMActionListener(exitOrBlockUserBottomSheet.getActionListener());
        return newSessionWithExtras;
    }
}
