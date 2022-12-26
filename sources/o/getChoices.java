package o;

import com.app.dream11.teamselection.newcreateteam.FCShimmerLayout;
/* loaded from: classes3.dex */
public final class getChoices {
    @androidx.databinding.BindingAdapter({"showShimmer"})
    public static final void toString(FCShimmerLayout fCShimmerLayout, boolean z) {
        if (fCShimmerLayout == null) {
            return;
        }
        fCShimmerLayout.setShimmerViewVisibility(z);
    }
}
