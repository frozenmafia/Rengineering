package com.app.dream11.chat.presenters;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OneToOneChatWindowPresenter$handleUI$3 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ OneToOneChatWindowPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneToOneChatWindowPresenter$handleUI$3(OneToOneChatWindowPresenter oneToOneChatWindowPresenter) {
        super(0);
        this.this$0 = oneToOneChatWindowPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.acceptChannelInvitation();
    }
}
