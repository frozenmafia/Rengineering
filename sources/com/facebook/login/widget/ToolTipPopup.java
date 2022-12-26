package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.FragmentManager;
import o.FragmentManager$FragmentIntentSenderContract$ag$a;
import o.isStateAtLeast;
/* loaded from: classes4.dex */
public class ToolTipPopup {
    private final String HaptikSDK$c;
    private final Context ag$a;
    private PopupWindow ah$a;
    private ToolTipPopup$ag$a toString;
    private final WeakReference<View> valueOf;
    private Style HaptikSDK$a = Style.BLUE;
    private long values = 6000;
    private final ViewTreeObserver.OnScrollChangedListener HaptikSDK$b = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.ToolTipPopup.2
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (ToolTipPopup.toString(ToolTipPopup.this).get() == null || ToolTipPopup.ah$a(ToolTipPopup.this) == null || !ToolTipPopup.ah$a(ToolTipPopup.this).isShowing()) {
                return;
            }
            if (ToolTipPopup.ah$a(ToolTipPopup.this).isAboveAnchor()) {
                ToolTipPopup.ag$a(ToolTipPopup.this).valueOf();
            } else {
                ToolTipPopup.ag$a(ToolTipPopup.this).values();
            }
        }
    };

    /* loaded from: classes4.dex */
    public enum Style {
        BLUE,
        BLACK
    }

    static /* synthetic */ ToolTipPopup$ag$a ag$a(ToolTipPopup toolTipPopup) {
        if (isStateAtLeast.values(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.toString;
        } catch (Throwable th) {
            isStateAtLeast.values(th, ToolTipPopup.class);
            return null;
        }
    }

    static /* synthetic */ PopupWindow ah$a(ToolTipPopup toolTipPopup) {
        if (isStateAtLeast.values(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.ah$a;
        } catch (Throwable th) {
            isStateAtLeast.values(th, ToolTipPopup.class);
            return null;
        }
    }

    static /* synthetic */ WeakReference toString(ToolTipPopup toolTipPopup) {
        if (isStateAtLeast.values(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.valueOf;
        } catch (Throwable th) {
            isStateAtLeast.values(th, ToolTipPopup.class);
            return null;
        }
    }

    public ToolTipPopup(String str, View view) {
        this.HaptikSDK$c = str;
        this.valueOf = new WeakReference<>(view);
        this.ag$a = view.getContext();
    }

    public void ag$a(Style style) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            this.HaptikSDK$a = style;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    public void ah$a() {
        View view;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        View view2;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            if (this.valueOf.get() != null) {
                ToolTipPopup$ag$a toolTipPopup$ag$a = new ToolTipPopup$ag$a(this, this.ag$a);
                this.toString = toolTipPopup$ag$a;
                ((TextView) toolTipPopup$ag$a.findViewById(FragmentManager$FragmentIntentSenderContract$ag$a.com_facebook_tooltip_bubble_view_text_body)).setText(this.HaptikSDK$c);
                if (this.HaptikSDK$a == Style.BLUE) {
                    view2 = this.toString.toString;
                    view2.setBackgroundResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_blue_background);
                    imageView4 = this.toString.valueOf;
                    imageView4.setImageResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_blue_bottomnub);
                    imageView5 = this.toString.values;
                    imageView5.setImageResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_blue_topnub);
                    imageView6 = this.toString.ah$a;
                    imageView6.setImageResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_blue_xout);
                } else {
                    view = this.toString.toString;
                    view.setBackgroundResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_black_background);
                    imageView = this.toString.valueOf;
                    imageView.setImageResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_black_bottomnub);
                    imageView2 = this.toString.values;
                    imageView2.setImageResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_black_topnub);
                    imageView3 = this.toString.ah$a;
                    imageView3.setImageResource(FragmentManager.FragmentIntentSenderContract.valueOf.com_facebook_tooltip_black_xout);
                }
                View decorView = ((Activity) this.ag$a).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                ag$a();
                this.toString.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                ToolTipPopup$ag$a toolTipPopup$ag$a2 = this.toString;
                PopupWindow popupWindow = new PopupWindow(toolTipPopup$ag$a2, toolTipPopup$ag$a2.getMeasuredWidth(), this.toString.getMeasuredHeight());
                this.ah$a = popupWindow;
                popupWindow.showAsDropDown(this.valueOf.get());
                invoke();
                if (this.values > 0) {
                    this.toString.postDelayed(new Runnable() { // from class: com.facebook.login.widget.ToolTipPopup.5
                        @Override // java.lang.Runnable
                        public void run() {
                            if (isStateAtLeast.values(this)) {
                                return;
                            }
                            try {
                                ToolTipPopup.this.valueOf();
                            } catch (Throwable th) {
                                isStateAtLeast.values(th, this);
                            }
                        }
                    }, this.values);
                }
                this.ah$a.setTouchable(true);
                this.toString.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.widget.ToolTipPopup.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        if (isStateAtLeast.values(this)) {
                            return;
                        }
                        try {
                            ToolTipPopup.this.valueOf();
                        } catch (Throwable th) {
                            isStateAtLeast.values(th, this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    public void ah$a(long j) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            this.values = j;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    private void invoke() {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.ah$a;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            if (this.ah$a.isAboveAnchor()) {
                this.toString.valueOf();
            } else {
                this.toString.values();
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    public void valueOf() {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            values();
            PopupWindow popupWindow = this.ah$a;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    private void ag$a() {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            values();
            if (this.valueOf.get() != null) {
                this.valueOf.get().getViewTreeObserver().addOnScrollChangedListener(this.HaptikSDK$b);
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    private void values() {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            if (this.valueOf.get() != null) {
                this.valueOf.get().getViewTreeObserver().removeOnScrollChangedListener(this.HaptikSDK$b);
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }
}
