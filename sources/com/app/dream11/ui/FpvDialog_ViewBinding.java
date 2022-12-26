package com.app.dream11.ui;

import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class FpvDialog_ViewBinding implements Unbinder {
    private FpvDialog ah$a;
    private View values;

    public FpvDialog_ViewBinding(final FpvDialog fpvDialog, View view) {
        this.ah$a = fpvDialog;
        fpvDialog.webView = (WebView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a1084, "field 'webView'", WebView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.cancel, "method 'cancelClick'");
        this.values = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.FpvDialog_ViewBinding.1
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                fpvDialog.cancelClick();
            }
        });
    }
}
