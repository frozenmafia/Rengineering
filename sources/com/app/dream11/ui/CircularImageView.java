package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import o.loadFont;
/* loaded from: classes3.dex */
public class CircularImageView extends com.mikhaellopez.circularimageview.CircularImageView {
    public CircularImageView(Context context) {
        super(context);
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void values(CircularImageView circularImageView, int i) {
        circularImageView.setBorderWidth(loadFont.values(circularImageView.getContext(), i));
    }

    public static void setContentDescription(CircularImageView circularImageView, String str) {
        circularImageView.setContentDescription(str);
    }
}
