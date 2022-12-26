package com.app.dream11.utils;

import android.view.View;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class Dream11MessageDialog_ViewBinding implements Unbinder {
    private View ah$a;
    private Dream11MessageDialog valueOf;
    private View values;

    public Dream11MessageDialog_ViewBinding(final Dream11MessageDialog dream11MessageDialog, View view) {
        this.valueOf = dream11MessageDialog;
        dream11MessageDialog.messageView = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.tv_dialog_message, "field 'messageView'", CustomTextView.class);
        dream11MessageDialog.dialogMessageTitle = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.tv_dialog_message_title, "field 'dialogMessageTitle'", CustomTextView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.tv_dialog_negative, "field 'negativeButton'");
        dream11MessageDialog.negativeButton = (CustomTextView) MediaControllerCompat.Callback.toString(valueOf, R.id.tv_dialog_negative, "field 'negativeButton'", CustomTextView.class);
        this.values = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.utils.Dream11MessageDialog_ViewBinding.2
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                dream11MessageDialog.negativeButtonClicked();
            }
        });
        View valueOf2 = MediaControllerCompat.Callback.valueOf(view, R.id.tv_dialog_positive, "field 'positiveButton' and method 'positiveButtonClicked'");
        dream11MessageDialog.positiveButton = (CustomTextView) MediaControllerCompat.Callback.toString(valueOf2, R.id.tv_dialog_positive, "field 'positiveButton'", CustomTextView.class);
        this.ah$a = valueOf2;
        valueOf2.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.utils.Dream11MessageDialog_ViewBinding.5
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                dream11MessageDialog.positiveButtonClicked();
            }
        });
    }
}
