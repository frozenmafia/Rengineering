package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class handle implements androidx.viewbinding.ViewBinding {
    public final View HaptikSDK$a;
    public final androidx.appcompat.widget.AppCompatImageView HaptikSDK$b;
    public final ProgressBar HaptikSDK$c;
    public final TextView HaptikWebView;
    public final TextView ag$a;
    public final Button ah$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$b;
    private final androidx.constraintlayout.widget.ConstraintLayout getInitSettings;
    public final TextView invoke;
    public final Button toString;
    public final androidx.constraintlayout.widget.Barrier valueOf;
    public final TextView values;

    private handle(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, TextView textView, Button button, Button button2, androidx.constraintlayout.widget.Barrier barrier, TextView textView2, TextView textView3, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.appcompat.widget.AppCompatImageView appCompatImageView2, ProgressBar progressBar, View view, TextView textView4) {
        this.getInitSettings = constraintLayout;
        this.values = textView;
        this.ah$a = button;
        this.toString = button2;
        this.valueOf = barrier;
        this.ag$a = textView2;
        this.invoke = textView3;
        this.ah$b = appCompatImageView;
        this.HaptikSDK$b = appCompatImageView2;
        this.HaptikSDK$c = progressBar;
        this.HaptikSDK$a = view;
        this.HaptikWebView = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.getInitSettings;
    }

    public static handle valueOf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.fragment_wallet_credential_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return valueOf(inflate);
    }

    public static handle valueOf(View view) {
        View findViewById;
        int i = C0368entity.valueOf.account_desc;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = C0368entity.valueOf.action_cancel;
            Button button = (Button) view.findViewById(i);
            if (button != null) {
                i = C0368entity.valueOf.action_proceed;
                Button button2 = (Button) view.findViewById(i);
                if (button2 != null) {
                    i = C0368entity.valueOf.barrier2;
                    androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) view.findViewById(i);
                    if (barrier != null) {
                        i = C0368entity.valueOf.label_link_with;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = C0368entity.valueOf.label_no_account;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null) {
                                i = C0368entity.valueOf.link_icon;
                                androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                                if (appCompatImageView != null) {
                                    i = C0368entity.valueOf.logo;
                                    androidx.appcompat.widget.AppCompatImageView appCompatImageView2 = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                                    if (appCompatImageView2 != null) {
                                        i = C0368entity.valueOf.progressBar;
                                        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                                        if (progressBar != null && (findViewById = view.findViewById((i = C0368entity.valueOf.small_divider))) != null) {
                                            i = C0368entity.valueOf.tv_mobile_number;
                                            TextView textView4 = (TextView) view.findViewById(i);
                                            if (textView4 != null) {
                                                return new handle((androidx.constraintlayout.widget.ConstraintLayout) view, textView, button, button2, barrier, textView2, textView3, appCompatImageView, appCompatImageView2, progressBar, findViewById, textView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
