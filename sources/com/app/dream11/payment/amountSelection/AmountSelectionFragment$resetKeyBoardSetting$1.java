package com.app.dream11.payment.amountSelection;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AmountSelectionFragment$resetKeyBoardSetting$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ AmountSelectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountSelectionFragment$resetKeyBoardSetting$1(AmountSelectionFragment amountSelectionFragment) {
        super(0);
        this.this$0 = amountSelectionFragment;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Window window;
        Integer valueOf = AmountSelectionFragment.valueOf(this.this$0);
        if (valueOf == null) {
            return;
        }
        AmountSelectionFragment amountSelectionFragment = this.this$0;
        int intValue = valueOf.intValue();
        FragmentActivity activity = amountSelectionFragment.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(intValue);
    }
}
