package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes3.dex */
public final class addRoot {
    @androidx.databinding.BindingAdapter({"constraintPercent"})
    public static final void toString(androidx.constraintlayout.widget.Guideline guideline, float f) {
        ViewGroup.LayoutParams layoutParams = guideline == null ? null : guideline.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.guidePercent = f;
        }
        if (guideline == null) {
            return;
        }
        guideline.setLayoutParams(layoutParams2);
    }
}
