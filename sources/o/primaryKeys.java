package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dreampay.ui.commons.HyperLinkTextView;
import o.C0368entity;
/* loaded from: classes7.dex */
public final class primaryKeys implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    public final View ag$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$a;
    public final androidx.appcompat.widget.AppCompatTextView toString;
    public final HyperLinkTextView valueOf;
    public final androidx.appcompat.widget.AppCompatTextView values;

    private primaryKeys(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.appcompat.widget.AppCompatTextView appCompatTextView, androidx.appcompat.widget.AppCompatTextView appCompatTextView2, HyperLinkTextView hyperLinkTextView, View view) {
        this.HaptikSDK$a = constraintLayout;
        this.ah$a = appCompatImageView;
        this.values = appCompatTextView;
        this.toString = appCompatTextView2;
        this.valueOf = hyperLinkTextView;
        this.ag$a = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.HaptikSDK$a;
    }

    public static primaryKeys ag$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.fragment_sfa_information, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return values(inflate);
    }

    public static primaryKeys values(View view) {
        View findViewById;
        int i = C0368entity.valueOf.ivVisa;
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
        if (appCompatImageView != null) {
            i = C0368entity.valueOf.tvEnableSingleFactorAuthPaymentTitle;
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
            if (appCompatTextView != null) {
                i = C0368entity.valueOf.tvSfaInfoMessage;
                androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                if (appCompatTextView2 != null) {
                    i = C0368entity.valueOf.tvVisaTnC;
                    HyperLinkTextView hyperLinkTextView = (HyperLinkTextView) view.findViewById(i);
                    if (hyperLinkTextView != null && (findViewById = view.findViewById((i = C0368entity.valueOf.viewTopKnob))) != null) {
                        return new primaryKeys((androidx.constraintlayout.widget.ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2, hyperLinkTextView, findViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
