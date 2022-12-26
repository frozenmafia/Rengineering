package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.app.dream11.contest.ui.JoinedContestsTeamsPreRLLinearLayout;
import com.app.dream11.teamselection.teampreivew.PreviewPlayerInfo;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class getMinimumHeight {
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"teams", "contestCardPosition"})
    public static final void toString(JoinedContestsTeamsPreRLLinearLayout joinedContestsTeamsPreRLLinearLayout, List<setPositiveButtonIcon> list, int i) {
        runAnimators.ag$a(joinedContestsTeamsPreRLLinearLayout, TtmlNode.TAG_LAYOUT);
        if (list == null) {
            return;
        }
        joinedContestsTeamsPreRLLinearLayout.removeAllViews();
        for (setPositiveButtonIcon setpositivebuttonicon : list) {
            androidx.databinding.ViewDataBinding inflate = androidx.databinding.DataBindingUtil.inflate(LayoutInflater.from(joinedContestsTeamsPreRLLinearLayout.getContext()), com.app.dream11Pro.R.layout.res_0x7f0d01b7, joinedContestsTeamsPreRLLinearLayout, false);
            inflate.setVariable(263, setpositivebuttonicon);
            inflate.setVariable(43, Integer.valueOf(i));
            joinedContestsTeamsPreRLLinearLayout.addView(inflate.getRoot());
        }
    }

    @androidx.databinding.BindingAdapter({"specialPlayerListPreRL"})
    public static final void ah$a(LinearLayout linearLayout, LinkedHashMap<Integer, PreviewPlayerInfo> linkedHashMap) {
        runAnimators.ag$a(linearLayout, Promotion.ACTION_VIEW);
        linearLayout.removeAllViews();
        if (linkedHashMap == null) {
            return;
        }
        for (Map.Entry<Integer, PreviewPlayerInfo> entry : linkedHashMap.entrySet()) {
            PreviewPlayerInfo value = entry.getValue();
            if (value != null) {
                androidx.databinding.ViewDataBinding inflate = androidx.databinding.DataBindingUtil.inflate(LayoutInflater.from(linearLayout.getContext()), com.app.dream11Pro.R.layout.res_0x7f0d0444, linearLayout, false);
                value.setShouldShowSubtitle(false);
                inflate.setVariable(263, value);
                View root = inflate.getRoot();
                runAnimators.ah$a(root, "viewDataBinding.root");
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                linearLayout.addView(root);
            }
        }
    }
}
