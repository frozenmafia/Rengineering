package com.app.dream11.teampreviewnew.presenters;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readFamily;
import o.setAnimationMatrix;
import o.setHintScreenTimeout;
import o.setStartScrollBottom;
/* loaded from: classes3.dex */
public final class BaseTeamPreviewPresenter$sendFPSClickEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ setHintScreenTimeout<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTeamPreviewPresenter$sendFPSClickEvent$1(setHintScreenTimeout<T> sethintscreentimeout) {
        super(0);
        this.this$0 = sethintscreentimeout;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setStartScrollBottom extraCallbackWithResult = this.this$0.extraCallbackWithResult();
        setStartScrollBottom setstartscrollbottom = extraCallbackWithResult;
        readFamily.values(setstartscrollbottom, "Team Preview", this.this$0.ak$b(), this.this$0.HaptikWebView());
    }
}
