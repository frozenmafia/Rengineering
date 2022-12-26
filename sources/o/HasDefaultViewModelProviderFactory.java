package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fancode.core.ui.androidhelpers.adapters.BaseAdapter;
import o.Lifecycle;
/* loaded from: classes6.dex */
public abstract class HasDefaultViewModelProviderFactory extends BaseAdapter {
    public abstract void ag$a(androidx.databinding.ViewDataBinding viewDataBinding, int i);

    @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public void valueOf(BaseAdapter.values valuesVar, int i) {
        runAnimators.ag$a(valuesVar, "holder");
        try {
            androidx.databinding.ViewDataBinding values = ((Lifecycle.AnonymousClass1) valuesVar).values();
            values.unbind();
            ag$a(values, i);
            values.executePendingBindings();
        } catch (Exception unused) {
            valuesVar.setIsRecyclable(false);
            valuesVar.itemView.setVisibility(8);
            if (valuesVar.itemView.getLayoutParams() != null) {
                valuesVar.itemView.getLayoutParams().height = 0;
                return;
            }
            View view = valuesVar.itemView;
            if (view instanceof LinearLayout) {
                ((LinearLayout) valuesVar.itemView).setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            } else if (view instanceof RelativeLayout) {
                ((RelativeLayout) valuesVar.itemView).setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
            } else if (view instanceof FrameLayout) {
                ((FrameLayout) valuesVar.itemView).setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            }
        }
    }
}
