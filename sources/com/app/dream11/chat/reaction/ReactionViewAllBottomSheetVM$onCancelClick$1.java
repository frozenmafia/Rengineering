package com.app.dream11.chat.reaction;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
final class ReactionViewAllBottomSheetVM$onCancelClick$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ IReactionBottomSheetHandler $handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionViewAllBottomSheetVM$onCancelClick$1(IReactionBottomSheetHandler iReactionBottomSheetHandler) {
        super(0);
        this.$handler = iReactionBottomSheetHandler;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IReactionBottomSheetHandler iReactionBottomSheetHandler = this.$handler;
        if (iReactionBottomSheetHandler == null) {
            return;
        }
        iReactionBottomSheetHandler.onCancelClicked();
    }
}
