package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import o.onFragmentSaveInstanceState;
/* loaded from: classes6.dex */
public class LogBoxDialog extends Dialog {
    public LogBoxDialog(Activity activity, View view) {
        super(activity, onFragmentSaveInstanceState.toString.Theme_Catalyst_LogBox);
        requestWindowFeature(1);
        setContentView(view);
    }
}
