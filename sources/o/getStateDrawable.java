package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
/* loaded from: classes2.dex */
public final class getStateDrawable {
    @androidx.databinding.BindingAdapter({"teamWiseWinningViews"})
    public static final void ah$a(LinearLayout linearLayout, List<kotlin.Pair<Integer, String>> list) {
        runAnimators.ag$a(linearLayout, Promotion.ACTION_VIEW);
        runAnimators.ag$a(list, "teamWinningsList");
        linearLayout.removeAllViews();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.databinding.ViewDataBinding bind = androidx.databinding.DataBindingUtil.bind(LayoutInflater.from(linearLayout.getContext()).inflate(com.app.dream11Pro.R.layout.res_0x7f0d00c1, (ViewGroup) linearLayout, false));
            kotlin.Pair<Integer, String> pair = list.get(i);
            setGapSize setgapsize = new setGapSize(pair.getFirst().intValue(), pair.getSecond());
            if (bind != null) {
                bind.setVariable(67, setgapsize);
            }
            linearLayout.addView(bind == null ? null : bind.getRoot());
        }
    }
}
