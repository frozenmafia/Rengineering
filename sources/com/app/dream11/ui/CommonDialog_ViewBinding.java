package com.app.dream11.ui;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class CommonDialog_ViewBinding implements Unbinder {
    private View ah$a;
    private CommonDialog toString;
    private View valueOf;
    private View values;

    public CommonDialog_ViewBinding(final CommonDialog commonDialog, View view) {
        this.toString = commonDialog;
        commonDialog.tvTitle = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.tvDialogHeader, "field 'tvTitle'", CustomTextView.class);
        commonDialog.tvMessage = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.tvDialogText1, "field 'tvMessage'", CustomTextView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.btnOK, "field 'btnOK' and method 'onClick'");
        commonDialog.btnOK = (Button) MediaControllerCompat.Callback.toString(valueOf, R.id.btnOK, "field 'btnOK'", Button.class);
        this.values = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.CommonDialog_ViewBinding.5
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                commonDialog.onClick(view2);
            }
        });
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.contact, "method 'oncontactUSClick'");
        this.ah$a = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.CommonDialog_ViewBinding.1
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                commonDialog.oncontactUSClick(view2);
            }
        });
        View valueOf3 = MediaControllerCompat.Callback.valueOf(view, R.id.cancel, "method 'onCancelClick'");
        this.valueOf = valueOf3;
        valueOf3.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.CommonDialog_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                commonDialog.onCancelClick(view2);
            }
        });
    }
}
