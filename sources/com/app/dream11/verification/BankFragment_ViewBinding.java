package com.app.dream11.verification;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import com.google.android.material.textfield.TextInputLayout;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class BankFragment_ViewBinding implements Unbinder {
    private BankFragment valueOf;

    public BankFragment_ViewBinding(BankFragment bankFragment, View view) {
        this.valueOf = bankFragment;
        bankFragment.bank_no = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_no, "field 'bank_no'", TextInputLayout.class);
        bankFragment.bank_branch = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_branch, "field 'bank_branch'", TextInputLayout.class);
        bankFragment.bank_ifsc = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_ifsc, "field 'bank_ifsc'", TextInputLayout.class);
        bankFragment.bank_name = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.bank_name, "field 'bank_name'", TextInputLayout.class);
        bankFragment.rootView = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0add, "field 'rootView'", RelativeLayout.class);
        bankFragment.re_bank_no = (TextInputLayout) MediaControllerCompat.Callback.ag$a(view, R.id.re_bank_no, "field 're_bank_no'", TextInputLayout.class);
        bankFragment.txt2 = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.txt2, "field 'txt2'", CustomTextView.class);
        bankFragment.customTextView3 = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.customTextView3, "field 'customTextView3'", CustomTextView.class);
        bankFragment.imageView21 = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.imageView21, "field 'imageView21'", ImageView.class);
    }
}
