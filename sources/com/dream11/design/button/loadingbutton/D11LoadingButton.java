package com.dream11.design.button.loadingbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.dream11.design.button.D11Button;
import java.util.LinkedHashMap;
import java.util.Map;
import o.isInBoundsOfChild;
import o.isInBoundsOfChild$ag$a;
import o.mirror$ah$a;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class D11LoadingButton extends FrameLayout {
    public Map<Integer, View> ah$a;
    private isInBoundsOfChild toString;
    private D11Button valueOf;
    private DottedLoadingView values;

    public final isInBoundsOfChild valueOf() {
        return this.toString;
    }

    public final void setState(isInBoundsOfChild isinboundsofchild) {
        runAnimators.ag$a(isinboundsofchild, "value");
        this.toString = isinboundsofchild;
        values();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11LoadingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        isInBoundsOfChild.toString tostring;
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, "attrs");
        this.ah$a = new LinkedHashMap();
        String str = "";
        this.toString = new isInBoundsOfChild.toString("");
        setPadding(0, 0, 0, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mirror$ah$a.D11LoadingView, 0, 0);
        try {
            int i = obtainStyledAttributes.getInt(mirror$ah$a.D11LoadingView_buttonState, 0);
            String string = obtainStyledAttributes.getString(mirror$ah$a.D11LoadingView_buttonText);
            if (string != null) {
                str = string;
            }
            values(attributeSet);
            D11Button d11Button = this.valueOf;
            if (d11Button == null) {
                runAnimators.valueOf("primaryView");
                d11Button = null;
            }
            d11Button.setText(str);
            ag$a(attributeSet);
            if (i == 0) {
                tostring = new isInBoundsOfChild.toString(str);
            } else if (i == 1) {
                tostring = isInBoundsOfChild.valueOf.values;
            } else if (i == 2) {
                tostring = new isInBoundsOfChild$ag$a(str);
            } else {
                throw new IllegalArgumentException(i + " is not a valid state");
            }
            setState(tostring);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void values(AttributeSet attributeSet) {
        Context context = getContext();
        runAnimators.ah$a(context, "this.context");
        D11Button d11Button = new D11Button(context, attributeSet);
        d11Button.setGravity(17);
        d11Button.setClickable(false);
        this.valueOf = d11Button;
        addView(d11Button);
    }

    private final void ag$a(AttributeSet attributeSet) {
        Context context = getContext();
        runAnimators.ah$a(context, "this.context");
        DottedLoadingView dottedLoadingView = new DottedLoadingView(context, attributeSet);
        dottedLoadingView.setGravity(17);
        this.values = dottedLoadingView;
        addView(dottedLoadingView);
    }

    private final void values() {
        isInBoundsOfChild isinboundsofchild = this.toString;
        DottedLoadingView dottedLoadingView = null;
        if (isinboundsofchild instanceof isInBoundsOfChild.toString) {
            toString(false);
            D11Button d11Button = this.valueOf;
            if (d11Button == null) {
                runAnimators.valueOf("primaryView");
                d11Button = null;
            }
            d11Button.setEnabled(true);
            D11Button d11Button2 = this.valueOf;
            if (d11Button2 == null) {
                runAnimators.valueOf("primaryView");
                d11Button2 = null;
            }
            d11Button2.setText(((isInBoundsOfChild.toString) this.toString).valueOf());
            setEnabled(true);
            DottedLoadingView dottedLoadingView2 = this.values;
            if (dottedLoadingView2 == null) {
                runAnimators.valueOf("loadingView");
            } else {
                dottedLoadingView = dottedLoadingView2;
            }
            dottedLoadingView.values();
        } else if (isinboundsofchild instanceof isInBoundsOfChild$ag$a) {
            toString(false);
            D11Button d11Button3 = this.valueOf;
            if (d11Button3 == null) {
                runAnimators.valueOf("primaryView");
                d11Button3 = null;
            }
            d11Button3.setEnabled(false);
            setEnabled(false);
            D11Button d11Button4 = this.valueOf;
            if (d11Button4 == null) {
                runAnimators.valueOf("primaryView");
                d11Button4 = null;
            }
            d11Button4.setText(((isInBoundsOfChild$ag$a) this.toString).valueOf());
            DottedLoadingView dottedLoadingView3 = this.values;
            if (dottedLoadingView3 == null) {
                runAnimators.valueOf("loadingView");
            } else {
                dottedLoadingView = dottedLoadingView3;
            }
            dottedLoadingView.values();
        } else if (isinboundsofchild instanceof isInBoundsOfChild.valueOf) {
            toString(true);
            setEnabled(false);
            DottedLoadingView dottedLoadingView4 = this.values;
            if (dottedLoadingView4 == null) {
                runAnimators.valueOf("loadingView");
            } else {
                dottedLoadingView = dottedLoadingView4;
            }
            dottedLoadingView.ag$a();
        }
    }

    private final void toString(boolean z) {
        DottedLoadingView dottedLoadingView = null;
        if (z) {
            D11Button d11Button = this.valueOf;
            if (d11Button == null) {
                runAnimators.valueOf("primaryView");
                d11Button = null;
            }
            ah$a(d11Button);
            DottedLoadingView dottedLoadingView2 = this.values;
            if (dottedLoadingView2 == null) {
                runAnimators.valueOf("loadingView");
            } else {
                dottedLoadingView = dottedLoadingView2;
            }
            toString(dottedLoadingView);
            return;
        }
        DottedLoadingView dottedLoadingView3 = this.values;
        if (dottedLoadingView3 == null) {
            runAnimators.valueOf("loadingView");
            dottedLoadingView3 = null;
        }
        ah$a(dottedLoadingView3);
        D11Button d11Button2 = this.valueOf;
        if (d11Button2 == null) {
            runAnimators.valueOf("primaryView");
        } else {
            dottedLoadingView = d11Button2;
        }
        toString(dottedLoadingView);
    }

    private final void ah$a(View view) {
        view.animate().alpha(0.3f).setDuration(200L);
        view.setVisibility(4);
    }

    private final void toString(View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setVisibility(0);
    }
}
