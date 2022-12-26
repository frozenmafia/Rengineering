package com.app.dream11.onboarding;

import android.content.Context;
import com.app.dream11.ui.Dream11ToolTipManager;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OnBoardingSportsSelectionFragment$toolTipManager$2 extends Lambda implements Styleable.ArcMotion<Dream11ToolTipManager> {
    final /* synthetic */ OnBoardingSportsSelectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingSportsSelectionFragment$toolTipManager$2(OnBoardingSportsSelectionFragment onBoardingSportsSelectionFragment) {
        super(0);
        this.this$0 = onBoardingSportsSelectionFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Dream11ToolTipManager invoke() {
        Context context = this.this$0.getContext();
        if (context == null) {
            return null;
        }
        return new Dream11ToolTipManager(context, this.this$0);
    }
}
