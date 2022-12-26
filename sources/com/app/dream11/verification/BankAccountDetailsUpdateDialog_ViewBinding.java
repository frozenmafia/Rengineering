package com.app.dream11.verification;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import com.google.android.material.textfield.TextInputLayout;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class BankAccountDetailsUpdateDialog_ViewBinding implements Unbinder {
    private View ah$a;
    private View toString;
    private BankAccountDetailsUpdateDialog values;

    public BankAccountDetailsUpdateDialog_ViewBinding(final BankAccountDetailsUpdateDialog bankAccountDetailsUpdateDialog, View view) {
        this.values = bankAccountDetailsUpdateDialog;
        bankAccountDetailsUpdateDialog.state = (Spinner) MediaControllerCompat.Callback.ag$a(view, R.id.state, "field 'state'", Spinner.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.save, "field 'save' and method 'onSaveClicked'");
        bankAccountDetailsUpdateDialog.save = valueOf;
        this.ah$a = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.verification.BankAccountDetailsUpdateDialog_ViewBinding.3
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                bankAccountDetailsUpdateDialog.onSaveClicked(view2);
            }
        });
        bankAccountDetailsUpdateDialog.display_text = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.display_text, "field 'display_text'", TextView.class);
        bankAccountDetailsUpdateDialog.re_bank_number = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.bank_no_txt, "field 're_bank_number'", TextView.class);
        bankAccountDetailsUpdateDialog.bank_number = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.re_bank_no_txt, "field 'bank_number'", TextView.class);
        bankAccountDetailsUpdateDialog.bank_branch = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.bank_branch_txt, "field 'bank_branch'", TextView.class);
        bankAccountDetailsUpdateDialog.bank_name = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.bank_name_txt, "field 'bank_name'", TextView.class);
        bankAccountDetailsUpdateDialog.bank_ifsc = (TextView) MediaControllerCompat.Callback.ag$a(view, R.id.bank_ifsc_txt, "field 'bank_ifsc'", TextView.class);
        bankAccountDetailsUpdateDialog.bank_number_il = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_no, "field 'bank_number_il'", TextInputLayout.class);
        bankAccountDetailsUpdateDialog.re_bank_number_il = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.re_bank_no, "field 're_bank_number_il'", TextInputLayout.class);
        bankAccountDetailsUpdateDialog.bank_branch_il = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_branch, "field 'bank_branch_il'", TextInputLayout.class);
        bankAccountDetailsUpdateDialog.bank_name_il = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_name, "field 'bank_name_il'", TextInputLayout.class);
        bankAccountDetailsUpdateDialog.bank_ifsc_il = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_ifsc, "field 'bank_ifsc_il'", TextInputLayout.class);
        bankAccountDetailsUpdateDialog.state_il = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.state_il, "field 'state_il'", TextInputLayout.class);
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.cross, "method 'onDismissClicked'");
        this.toString = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.verification.BankAccountDetailsUpdateDialog_ViewBinding.4
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                bankAccountDetailsUpdateDialog.onDismissClicked();
            }
        });
    }
}
