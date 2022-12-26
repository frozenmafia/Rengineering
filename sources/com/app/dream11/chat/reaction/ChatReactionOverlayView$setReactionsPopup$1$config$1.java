package com.app.dream11.chat.reaction;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.AppComponentFactory$ah$a;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatReactionOverlayView$setReactionsPopup$1$config$1 extends Lambda implements Styleable.ChangeBounds<AppComponentFactory$ah$a, setAnimationMatrix> {
    public static final ChatReactionOverlayView$setReactionsPopup$1$config$1 INSTANCE = new ChatReactionOverlayView$setReactionsPopup$1$config$1();

    ChatReactionOverlayView$setReactionsPopup$1$config$1() {
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
        appComponentFactory$ah$a.valueOf(appComponentFactory$ah$a.valueOf().getResources().getDimensionPixelSize(R.dimen.d11_space_04));
        appComponentFactory$ah$a.ag$a(appComponentFactory$ah$a.valueOf().getResources().getDimensionPixelSize(R.dimen.d11_space_04));
        appComponentFactory$ah$a.values(appComponentFactory$ah$a.valueOf().getResources().getDimensionPixelSize(R.dimen.d11_size_12));
        appComponentFactory$ah$a.values(false);
        appComponentFactory$ah$a.toString(true);
    }
}
