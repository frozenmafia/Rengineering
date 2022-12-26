package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import o.C0368entity;
/* loaded from: classes5.dex */
public final class indices implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$a;
    public final androidx.constraintlayout.widget.Group ag$a;
    public final androidx.appcompat.widget.AppCompatTextView ah$a;
    public final androidx.appcompat.widget.AppCompatTextView invoke;
    public final androidx.appcompat.widget.AppCompatImageView toString;
    public final FrameLayout valueOf;
    public final ProgressBar values;

    private indices(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, FrameLayout frameLayout, androidx.constraintlayout.widget.Group group, androidx.appcompat.widget.AppCompatImageView appCompatImageView, ProgressBar progressBar, androidx.appcompat.widget.AppCompatTextView appCompatTextView, androidx.appcompat.widget.AppCompatTextView appCompatTextView2) {
        this.HaptikSDK$a = constraintLayout;
        this.valueOf = frameLayout;
        this.ag$a = group;
        this.toString = appCompatImageView;
        this.values = progressBar;
        this.ah$a = appCompatTextView;
        this.invoke = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ag$a */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.HaptikSDK$a;
    }

    public static indices valueOf(LayoutInflater layoutInflater) {
        return ag$a(layoutInflater, null, false);
    }

    public static indices ag$a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(entity$HaptikSDK$b.activity_vsc_flow, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return valueOf(inflate);
    }

    public static indices valueOf(View view) {
        int i = C0368entity.valueOf.fragment_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            i = C0368entity.valueOf.groupLoader;
            androidx.constraintlayout.widget.Group group = (androidx.constraintlayout.widget.Group) view.findViewById(i);
            if (group != null) {
                i = C0368entity.valueOf.ivVisaIcon;
                androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) view.findViewById(i);
                if (appCompatImageView != null) {
                    i = C0368entity.valueOf.progressBar;
                    ProgressBar progressBar = (ProgressBar) view.findViewById(i);
                    if (progressBar != null) {
                        i = C0368entity.valueOf.tvLoading;
                        androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                        if (appCompatTextView != null) {
                            i = C0368entity.valueOf.tvSFaFooter;
                            androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = (androidx.appcompat.widget.AppCompatTextView) view.findViewById(i);
                            if (appCompatTextView2 != null) {
                                return new indices((androidx.constraintlayout.widget.ConstraintLayout) view, frameLayout, group, appCompatImageView, progressBar, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
