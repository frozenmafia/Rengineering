package com.app.dream11.ui;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11Pro.R;
import o.conditional;
import o.loadFont;
/* loaded from: classes3.dex */
public class FpvDialog extends conditional {
    private String ag$a;
    private String ah$a;
    private String valueOf;
    @BindView
    WebView webView;

    public FpvDialog(BaseActivity baseActivity) {
        super(baseActivity, R.layout.res_0x7f0d0215);
        this.ag$a = "";
        this.ah$a = "";
        this.valueOf = "";
    }

    @Override // o.conditional
    public void values(Bundle bundle) {
        ButterKnife.ag$a(this, values());
        this.webView.loadUrl("file:///android_asset/FpvPolicy.html");
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.app.dream11.ui.FpvDialog.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (FpvDialog.this.ag$a(str)) {
                    FpvDialog.this.HaptikSDK$c();
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    protected boolean ag$a(String str) {
        return str.contains("termsandconditions#fairplay");
    }

    protected void HaptikSDK$c() {
        loadFont.valueOf(valueOf(), valueOf().getString(R.string.res_0x7f120cae), "termsandconditions#fairplay");
    }

    @Override // o.conditional, android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick
    public void cancelClick() {
        dismiss();
    }

    @Override // o.conditional, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
