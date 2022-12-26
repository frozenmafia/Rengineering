package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
/* loaded from: classes4.dex */
public class ReactUnimplementedView extends LinearLayout {
    private AppCompatTextView ah$a;

    public ReactUnimplementedView(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.ah$a = appCompatTextView;
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.ah$a.setGravity(17);
        this.ah$a.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(this.ah$a);
    }

    public void setName(String str) {
        AppCompatTextView appCompatTextView = this.ah$a;
        appCompatTextView.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
