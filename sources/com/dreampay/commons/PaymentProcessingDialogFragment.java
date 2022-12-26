package com.dreampay.commons;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class PaymentProcessingDialogFragment extends DialogFragment {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "PPDF";

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        runAnimators.ag$a(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_payment_processing, viewGroup);
        runAnimators.ah$a(inflate, "inflater.inflate(R.layout.fragment_payment_processing, container)");
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        runAnimators.ah$a(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        return onCreateDialog;
    }
}
