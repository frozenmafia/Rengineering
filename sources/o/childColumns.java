package o;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class childColumns implements androidx.viewbinding.ViewBinding {
    public final View HaptikSDK$a;
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$b;
    public final View ag$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final TextView toString;
    public final TextView valueOf;
    public final MaterialCheckBox values;

    private childColumns(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, MaterialCheckBox materialCheckBox, TextView textView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, TextView textView2, View view, View view2) {
        this.HaptikSDK$b = constraintLayout;
        this.values = materialCheckBox;
        this.valueOf = textView;
        this.ah$a = constraintLayout2;
        this.toString = textView2;
        this.ag$a = view;
        this.HaptikSDK$a = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.HaptikSDK$b;
    }

    public static childColumns values(View view) {
        View findViewById;
        View findViewById2;
        int i = C0368entity.valueOf.cbSingleFactorAuth;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) view.findViewById(i);
        if (materialCheckBox != null) {
            i = C0368entity.valueOf.cbSingleFactorAuthTitle;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view;
                i = C0368entity.valueOf.tvSingleFactorAuthMessage;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null && (findViewById = view.findViewById((i = C0368entity.valueOf.viewBottomSeparator))) != null && (findViewById2 = view.findViewById((i = C0368entity.valueOf.viewTopSeparator))) != null) {
                    return new childColumns(constraintLayout, materialCheckBox, textView, constraintLayout, textView2, findViewById, findViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
