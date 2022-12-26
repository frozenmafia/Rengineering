package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import o.putStringSet;
/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new putStringSet(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof putStringSet) {
            putStringSet putstringset = (putStringSet) dialog;
            BottomSheetBehavior<FrameLayout> behavior = putstringset.getBehavior();
            if (behavior.HaptikSDK$c() && putstringset.getDismissWithAnimation()) {
                dismissWithAnimation(behavior, z);
                return true;
            }
            return false;
        }
        return false;
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.ag$a() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof putStringSet) {
            ((putStringSet) getDialog()).removeDefaultCallback();
        }
        bottomSheetBehavior.ag$a(new BottomSheetDialogFragment$ah$a(this));
        bottomSheetBehavior.ah$b(5);
    }

    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }
}
