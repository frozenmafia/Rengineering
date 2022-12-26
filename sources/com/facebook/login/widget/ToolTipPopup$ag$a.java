package com.facebook.login.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import o.FragmentManager;
import o.FragmentManager$FragmentIntentSenderContract$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ToolTipPopup$ag$a extends FrameLayout {
    final /* synthetic */ ToolTipPopup ag$a;
    private ImageView ah$a;
    private View toString;
    private ImageView valueOf;
    private ImageView values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolTipPopup$ag$a(ToolTipPopup toolTipPopup, Context context) {
        super(context);
        this.ag$a = toolTipPopup;
        ag$a();
    }

    private void ag$a() {
        LayoutInflater.from(getContext()).inflate(FragmentManager.FragmentIntentSenderContract.values.com_facebook_tooltip_bubble, this);
        this.values = (ImageView) findViewById(FragmentManager$FragmentIntentSenderContract$ag$a.com_facebook_tooltip_bubble_view_top_pointer);
        this.valueOf = (ImageView) findViewById(FragmentManager$FragmentIntentSenderContract$ag$a.com_facebook_tooltip_bubble_view_bottom_pointer);
        this.toString = findViewById(FragmentManager$FragmentIntentSenderContract$ag$a.com_facebook_body_frame);
        this.ah$a = (ImageView) findViewById(FragmentManager$FragmentIntentSenderContract$ag$a.com_facebook_button_xout);
    }

    public void values() {
        this.values.setVisibility(0);
        this.valueOf.setVisibility(4);
    }

    public void valueOf() {
        this.values.setVisibility(4);
        this.valueOf.setVisibility(0);
    }
}
