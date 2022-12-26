package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class EntityInsertionAdapter implements androidx.viewbinding.ViewBinding {
    public final TextView HaptikSDK$a;
    public final TextView HaptikSDK$b;
    public final TextInputLayout HaptikSDK$c;
    public final TextView HaptikSDK$d;
    public final TextView HaptikWebView;
    public final MaterialButton ag$a;
    public final androidx.constraintlayout.widget.Barrier ah$a;
    public final ProgressBar ah$b;
    private final androidx.constraintlayout.widget.ConstraintLayout getInitSettings;
    public final TextView getSignupData;
    public final TextView invoke;
    public final androidx.constraintlayout.widget.Barrier toString;
    public final View valueOf;
    public final TextInputEditText values;

    private EntityInsertionAdapter(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, MaterialButton materialButton, androidx.constraintlayout.widget.Barrier barrier, androidx.constraintlayout.widget.Barrier barrier2, View view, TextInputEditText textInputEditText, TextView textView, TextView textView2, ProgressBar progressBar, TextInputLayout textInputLayout, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.getInitSettings = constraintLayout;
        this.ag$a = materialButton;
        this.ah$a = barrier;
        this.toString = barrier2;
        this.valueOf = view;
        this.values = textInputEditText;
        this.invoke = textView;
        this.HaptikSDK$a = textView2;
        this.ah$b = progressBar;
        this.HaptikSDK$c = textInputLayout;
        this.HaptikSDK$b = textView3;
        this.HaptikWebView = textView4;
        this.getSignupData = textView5;
        this.HaptikSDK$d = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.getInitSettings;
    }

    public static EntityInsertionAdapter ag$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.fragment_wallet_verify_credential, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return valueOf(inflate);
    }

    public static EntityInsertionAdapter valueOf(View view) {
        View findViewById;
        int i = C0368entity.valueOf.action_submit;
        MaterialButton materialButton = (MaterialButton) view.findViewById(i);
        if (materialButton != null) {
            i = C0368entity.valueOf.barrier3;
            androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) view.findViewById(i);
            if (barrier != null) {
                i = C0368entity.valueOf.barrier4;
                androidx.constraintlayout.widget.Barrier barrier2 = (androidx.constraintlayout.widget.Barrier) view.findViewById(i);
                if (barrier2 != null && (findViewById = view.findViewById((i = C0368entity.valueOf.bottom_view))) != null) {
                    i = C0368entity.valueOf.input_otp;
                    TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(i);
                    if (textInputEditText != null) {
                        i = C0368entity.valueOf.lblOTPMobile;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            i = C0368entity.valueOf.otpMobileNumber;
                            TextView textView2 = (TextView) view.findViewById(i);
                            if (textView2 != null) {
                                i = C0368entity.valueOf.progressBar;
                                ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                                if (progressBar != null) {
                                    i = C0368entity.valueOf.til_otp;
                                    TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(i);
                                    if (textInputLayout != null) {
                                        i = C0368entity.valueOf.tvOtpLeftPreString;
                                        TextView textView3 = (TextView) view.findViewById(i);
                                        if (textView3 != null) {
                                            i = C0368entity.valueOf.tvResendOtp;
                                            TextView textView4 = (TextView) view.findViewById(i);
                                            if (textView4 != null) {
                                                i = C0368entity.valueOf.tvResendTimer;
                                                TextView textView5 = (TextView) view.findViewById(i);
                                                if (textView5 != null) {
                                                    i = C0368entity.valueOf.tvTimeLeftLabel;
                                                    TextView textView6 = (TextView) view.findViewById(i);
                                                    if (textView6 != null) {
                                                        return new EntityInsertionAdapter((androidx.constraintlayout.widget.ConstraintLayout) view, materialButton, barrier, barrier2, findViewById, textInputEditText, textView, textView2, progressBar, textInputLayout, textView3, textView4, textView5, textView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
