package com.app.dream11.social.ui.customviews;

import kotlin.jvm.internal.Lambda;
import o.AppComponentFactory$ah$a;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class FeedReactionActionView$setReactionsPopup$1$config$1 extends Lambda implements Styleable.ChangeBounds<AppComponentFactory$ah$a, setAnimationMatrix> {
    public static final FeedReactionActionView$setReactionsPopup$1$config$1 INSTANCE = new FeedReactionActionView$setReactionsPopup$1$config$1();

    FeedReactionActionView$setReactionsPopup$1$config$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(AppComponentFactory$ah$a appComponentFactory$ah$a) {
        invoke2(appComponentFactory$ah$a);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AppComponentFactory$ah$a appComponentFactory$ah$a) {
        runAnimators.ag$a(appComponentFactory$ah$a, "$this$reactionConfig");
        appComponentFactory$ah$a.toString(true);
    }
}
