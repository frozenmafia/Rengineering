package o;

import com.app.dream11.ui.LinkableCustomTextView;
/* loaded from: classes3.dex */
public final class findCamByJ {
    @androidx.databinding.BindingAdapter({"urlLinkClickListener"})
    public static final void ag$a(LinkableCustomTextView linkableCustomTextView, LinkableCustomTextView.values valuesVar) {
        runAnimators.ag$a(valuesVar, "onLinkClickListener");
        if (linkableCustomTextView == null) {
            return;
        }
        linkableCustomTextView.setOnLinkClickListener(valuesVar);
    }
}
