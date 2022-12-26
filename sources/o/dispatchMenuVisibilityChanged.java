package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes.dex */
public final class dispatchMenuVisibilityChanged extends RecyclerView.ItemDecoration {
    private final int ah$a;

    public dispatchMenuVisibilityChanged(int i) {
        this.ah$a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        runAnimators.ag$a(rect, "outRect");
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getItemViewType(childAdapterPosition) == com.app.dream11Pro.R.layout.res_0x7f0d033e) {
            rect.top = this.ah$a;
            int i = childAdapterPosition + 1;
            try {
                if (i >= adapter.getItemCount() || adapter.getItemViewType(i) != com.app.dream11Pro.R.layout.res_0x7f0d033f) {
                    return;
                }
                rect.bottom = this.ah$a;
            } catch (Exception unused) {
            }
        }
    }
}
