package com.app.dream11.contest.buypass;

import android.content.Context;
import com.app.dream11.ui.Dream11ToolTipManager;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BuyNowConfirmationDialog$toolTipManager$2 extends Lambda implements Styleable.ArcMotion<Dream11ToolTipManager> {
    final /* synthetic */ BuyNowConfirmationDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNowConfirmationDialog$toolTipManager$2(BuyNowConfirmationDialog buyNowConfirmationDialog) {
        super(0);
        this.this$0 = buyNowConfirmationDialog;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Dream11ToolTipManager invoke() {
        Context requireContext = this.this$0.requireContext();
        runAnimators.ah$a(requireContext, "requireContext()");
        return new Dream11ToolTipManager(requireContext, this.this$0);
    }
}
