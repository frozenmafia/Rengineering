package o;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.List;
/* loaded from: classes3.dex */
public final class queueTask {
    @androidx.databinding.BindingAdapter({"combinationPlayerTypes"})
    public static final void ah$a(LinearLayout linearLayout, List<getMainExecutor> list) {
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        float values = loadFont.values(linearLayout.getContext(), 36.0f);
        if (!loadFont.ag$a(list) || list == null) {
            return;
        }
        for (getMainExecutor getmainexecutor : list) {
            androidx.databinding.ViewDataBinding inflate = androidx.databinding.DataBindingUtil.inflate(LayoutInflater.from(linearLayout.getContext()), com.app.dream11Pro.R.layout.res_0x7f0d033b, null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins((int) values, 0, 0, 0);
            inflate.getRoot().setLayoutParams(layoutParams);
            linearLayout.addView(inflate.getRoot());
            inflate.setVariable(308, getmainexecutor);
        }
    }
}
