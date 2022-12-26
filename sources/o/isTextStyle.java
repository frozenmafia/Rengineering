package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import o.dispatchAnimationFrame;
/* loaded from: classes4.dex */
public final class isTextStyle implements androidx.viewbinding.ViewBinding {
    public final FrameLayout ag$a;
    private final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final ProgressBar values;

    private isTextStyle(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, FrameLayout frameLayout, ProgressBar progressBar) {
        this.ah$a = constraintLayout;
        this.ag$a = frameLayout;
        this.values = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: values */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.ah$a;
    }

    public static isTextStyle toString(LayoutInflater layoutInflater) {
        return valueOf(layoutInflater, null, false);
    }

    public static isTextStyle valueOf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(dispatchAnimationFrame.valueOf.activity_upi, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return toString(inflate);
    }

    public static isTextStyle toString(View view) {
        int i = dispatchAnimationFrame$ah$a.fragment_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            i = dispatchAnimationFrame$ah$a.progressBar;
            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
            if (progressBar != null) {
                return new isTextStyle((androidx.constraintlayout.widget.ConstraintLayout) view, frameLayout, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
