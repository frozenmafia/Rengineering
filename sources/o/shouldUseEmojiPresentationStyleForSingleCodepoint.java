package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import o.dispatchAnimationFrame;
/* loaded from: classes4.dex */
public final class shouldUseEmojiPresentationStyleForSingleCodepoint implements androidx.viewbinding.ViewBinding {
    public final ProgressBar ag$a;
    private final androidx.constraintlayout.widget.ConstraintLayout values;

    private shouldUseEmojiPresentationStyleForSingleCodepoint(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ProgressBar progressBar) {
        this.values = constraintLayout;
        this.ag$a = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: valueOf */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.values;
    }

    public static shouldUseEmojiPresentationStyleForSingleCodepoint values(LayoutInflater layoutInflater) {
        return values(layoutInflater, null, false);
    }

    public static shouldUseEmojiPresentationStyleForSingleCodepoint values(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(dispatchAnimationFrame.valueOf.activity_wallet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ag$a(inflate);
    }

    public static shouldUseEmojiPresentationStyleForSingleCodepoint ag$a(View view) {
        int i = dispatchAnimationFrame$ah$a.progressBar;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            return new shouldUseEmojiPresentationStyleForSingleCodepoint((androidx.constraintlayout.widget.ConstraintLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
