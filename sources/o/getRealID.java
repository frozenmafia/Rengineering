package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.app.dream11.model.viewmodel.RegisterPageVM;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class getRealID {
    @androidx.databinding.BindingAdapter({"registerVM"})
    public static final void ag$a(LinearLayout linearLayout, RegisterPageVM registerPageVM) {
        int i;
        runAnimators.ag$a(linearLayout, TtmlNode.TAG_LAYOUT);
        if (registerPageVM == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (registerPageVM.isShouldLoginLinkAtCenter()) {
            layoutParams2.addRule(14);
            i = 0;
        } else {
            layoutParams2.addRule(11);
            i = 1;
        }
        linearLayout.setOrientation(i);
        linearLayout.setLayoutParams(layoutParams2);
    }
}
