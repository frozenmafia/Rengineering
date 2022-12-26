package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes5.dex */
class BottomSheetDialogFragment$ah$a extends BottomSheetBehavior.valueOf {
    final /* synthetic */ BottomSheetDialogFragment toString;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.valueOf
    public void onSlide(View view, float f) {
    }

    private BottomSheetDialogFragment$ah$a(BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.toString = bottomSheetDialogFragment;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.valueOf
    public void onStateChanged(View view, int i) {
        if (i == 5) {
            BottomSheetDialogFragment.access$100(this.toString);
        }
    }
}
