package o;

import android.view.View;
import com.dreampay.ui.commons.SecureEditText;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class insertAndReturnIdsList implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final androidx.appcompat.widget.AppCompatTextView ah$a;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final SecureEditText values;

    private insertAndReturnIdsList(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, SecureEditText secureEditText, androidx.constraintlayout.widget.Guideline guideline, androidx.appcompat.widget.AppCompatTextView appCompatTextView) {
        this.ag$a = constraintLayout;
        this.values = secureEditText;
        this.toString = guideline;
        this.ah$a = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.ag$a;
    }

    public static insertAndReturnIdsList toString(View view) {
        int i = C0368entity.valueOf.cvv;
        SecureEditText secureEditText = (SecureEditText) view.findViewById(i);
        if (secureEditText != null) {
            i = C0368entity.valueOf.guidelineVertical;
            androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
            if (guideline != null) {
                i = C0368entity.valueOf.pay;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                if (appCompatTextView != null) {
                    return new insertAndReturnIdsList((androidx.constraintlayout.widget.ConstraintLayout) view, secureEditText, guideline, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
