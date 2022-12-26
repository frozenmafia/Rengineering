package com.app.dream11.chat.reaction;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ChatReactionOverlayView$viewDismissListener$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ChatReactionOverlayView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatReactionOverlayView$viewDismissListener$1(ChatReactionOverlayView chatReactionOverlayView) {
        super(0);
        this.this$0 = chatReactionOverlayView;
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
        z = this.this$0.isShowing;
        if (z) {
            this.this$0.isShowing = false;
            this.this$0.setVisibility(8);
        }
    }
}
