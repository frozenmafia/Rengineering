package o;

import android.view.View;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class ForeignKey implements androidx.viewbinding.ViewBinding {
    public final androidx.appcompat.widget.AppCompatImageView ag$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    private final androidx.constraintlayout.widget.ConstraintLayout toString;
    public final androidx.appcompat.widget.AppCompatTextView values;

    private ForeignKey(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, androidx.appcompat.widget.AppCompatTextView appCompatTextView) {
        this.toString = constraintLayout;
        this.ag$a = appCompatImageView;
        this.ah$a = constraintLayout2;
        this.values = appCompatTextView;
    }

    /* loaded from: classes5.dex */
    public final class Action implements androidx.viewbinding.ViewBinding {
        private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
        public final androidx.appcompat.widget.AppCompatTextView HaptikSDK$b;
        public final View ag$a;
        public final androidx.appcompat.widget.AppCompatImageView ah$a;
        public final androidx.constraintlayout.widget.Guideline toString;
        public final androidx.appcompat.widget.AppCompatTextView valueOf;
        public final androidx.constraintlayout.widget.ConstraintLayout values;

        private Action(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, View view, androidx.constraintlayout.widget.Guideline guideline, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.appcompat.widget.AppCompatTextView appCompatTextView, androidx.appcompat.widget.AppCompatTextView appCompatTextView2) {
            this.HaptikSDK$a = constraintLayout;
            this.values = constraintLayout2;
            this.ag$a = view;
            this.toString = guideline;
            this.ah$a = appCompatImageView;
            this.valueOf = appCompatTextView;
            this.HaptikSDK$b = appCompatTextView2;
        }

        @Override // androidx.viewbinding.ViewBinding
        /* renamed from: ah$a */
        public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
            return this.HaptikSDK$a;
        }

        public static Action values(View view) {
            View findViewById;
            int i = C0368entity.valueOf.clCardLogoContainer;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(i);
            if (constraintLayout != null && (findViewById = view.findViewById((i = C0368entity.valueOf.curvedEdgeView))) != null) {
                i = C0368entity.valueOf.guidelineVertical;
                androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) view.findViewById(i);
                if (guideline != null) {
                    i = C0368entity.valueOf.ivCardIcon;
                    androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                    if (appCompatImageView != null) {
                        i = C0368entity.valueOf.tvCardNumber;
                        androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                        if (appCompatTextView != null) {
                            i = C0368entity.valueOf.tvIssuerName;
                            androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                            if (appCompatTextView2 != null) {
                                return new Action((androidx.constraintlayout.widget.ConstraintLayout) view, constraintLayout, findViewById, guideline, appCompatImageView, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ah$a */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.toString;
    }

    public static ForeignKey values(View view) {
        int i = C0368entity.valueOf.ivCardHealthIcon;
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
        if (appCompatImageView != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view;
            int i2 = C0368entity.valueOf.tvCardHealthMessage;
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i2);
            if (appCompatTextView != null) {
                return new ForeignKey(constraintLayout, appCompatImageView, constraintLayout, appCompatTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
