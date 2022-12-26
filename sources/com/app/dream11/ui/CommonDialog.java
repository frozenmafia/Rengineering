package com.app.dream11.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11Pro.R;
import o.conditional;
import o.loadFont;
/* loaded from: classes3.dex */
public class CommonDialog extends conditional {
    private String HaptikSDK$a;
    private String ag$a;
    private String ah$a;
    @BindView
    Button btnOK;
    values toString;
    @BindView
    CustomTextView tvMessage;
    @BindView
    CustomTextView tvTitle;
    toString valueOf;

    /* loaded from: classes3.dex */
    public interface toString {
        void values(View view);
    }

    /* loaded from: classes6.dex */
    public interface values {
        void ah$a(View view);
    }

    public CommonDialog(BaseActivity baseActivity) {
        super(baseActivity, R.layout.res_0x7f0d0186);
        this.ag$a = "";
        this.HaptikSDK$a = "";
        this.ah$a = "";
    }

    @Override // o.conditional
    public void values(Bundle bundle) {
        ButterKnife.ag$a(this, values());
        this.tvTitle.setText(loadFont.HaptikSDK$a(this.HaptikSDK$a));
        this.tvMessage.setText(loadFont.HaptikSDK$a(this.ag$a));
        if (!TextUtils.isEmpty(this.ah$a)) {
            this.btnOK.setText(loadFont.HaptikSDK$a(this.ah$a));
        }
        this.tvMessage.setMovementMethod(LinkMovementMethod.getInstance());
        this.tvTitle.setMovementMethod(LinkMovementMethod.getInstance());
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public void toString(String str) {
        if (str != null) {
            this.HaptikSDK$a = str;
        }
    }

    public void ag$a(String str) {
        if (str != null) {
            this.ag$a = str;
        }
    }

    public void valueOf(String str) {
        if (str != null) {
            this.ah$a = str;
        }
    }

    public void valueOf(toString tostring) {
        this.valueOf = tostring;
    }

    @Override // o.conditional, android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.conditional, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick
    public void onClick(View view) {
        values valuesVar = this.toString;
        if (valuesVar != null) {
            valuesVar.ah$a(view);
        } else {
            dismiss();
        }
    }

    @OnClick
    public void oncontactUSClick(View view) {
        toString tostring = this.valueOf;
        if (tostring != null) {
            tostring.values(view);
        } else {
            dismiss();
        }
    }

    @OnClick
    public void onCancelClick(View view) {
        dismiss();
    }
}
