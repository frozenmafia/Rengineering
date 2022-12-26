package com.app.dream11.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class DeleteCardDialog_ViewBinding implements Unbinder {
    private View HaptikSDK$b;
    private DeleteCardDialog ah$a;
    private View toString;
    private View valueOf;
    private View values;

    public DeleteCardDialog_ViewBinding(final DeleteCardDialog deleteCardDialog, View view) {
        this.ah$a = deleteCardDialog;
        deleteCardDialog.tip = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.tip, "field 'tip'", CustomTextView.class);
        deleteCardDialog.cardInfo = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.cardInfo, "field 'cardInfo'", CustomTextView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.delete, "field 'delete' and method 'onClick'");
        deleteCardDialog.delete = (CustomButton) MediaControllerCompat.Callback.toString(valueOf, R.id.delete, "field 'delete'", CustomButton.class);
        this.values = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.DeleteCardDialog_ViewBinding.3
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                deleteCardDialog.onClick(view2);
            }
        });
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.cancel, "field 'cancel' and method 'onCancelClick'");
        deleteCardDialog.cancel = (CustomButton) MediaControllerCompat.Callback.toString(valueOf2, R.id.cancel, "field 'cancel'", CustomButton.class);
        this.toString = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.DeleteCardDialog_ViewBinding.1
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                deleteCardDialog.onCancelClick(view2);
            }
        });
        View valueOf3 = MediaControllerCompat.Callback.valueOf(view, R.id.okbtn, "field 'okbtn' and method 'onbtnOKClick'");
        deleteCardDialog.okbtn = (CustomButton) MediaControllerCompat.Callback.toString(valueOf3, R.id.okbtn, "field 'okbtn'", CustomButton.class);
        this.HaptikSDK$b = valueOf3;
        valueOf3.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.DeleteCardDialog_ViewBinding.5
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                deleteCardDialog.onbtnOKClick(view2);
            }
        });
        deleteCardDialog.prev = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.prev, "field 'prev'", RelativeLayout.class);
        deleteCardDialog.success = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.success, "field 'success'", RelativeLayout.class);
        deleteCardDialog.btn = (LinearLayout) MediaControllerCompat.Callback.ag$a(view, R.id.btn, "field 'btn'", LinearLayout.class);
        deleteCardDialog.title = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.txt, "field 'title'", CustomTextView.class);
        deleteCardDialog.icon = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a05ee, "field 'icon'", ImageView.class);
        deleteCardDialog.sep = MediaControllerCompat.Callback.valueOf(view, R.id.res_0x7f0a0b8f, "field 'sep'");
        View valueOf4 = MediaControllerCompat.Callback.valueOf(view, R.id.ok, "method 'onOkClick'");
        this.valueOf = valueOf4;
        valueOf4.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.ui.DeleteCardDialog_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                deleteCardDialog.onOkClick(view2);
            }
        });
    }
}
