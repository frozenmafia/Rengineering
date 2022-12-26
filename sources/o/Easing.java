package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.ui.CustomTextView;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes3.dex */
public final class Easing extends RecyclerView.ItemDecoration {
    private int ag$a;
    private int ah$a;
    private int toString;
    private int valueOf;
    private final String values = "TeamSelectionItem";

    public Easing(int i, int i2, int i3, int i4) {
        this.toString = i;
        this.ag$a = i2;
        this.ah$a = i3;
        this.valueOf = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        runAnimators.ag$a(rect, "outRect");
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter == null ? 1 : adapter.getItemCount();
        if (recyclerView.getAdapter() == null || childAdapterPosition != itemCount - 1) {
            return;
        }
        rect.bottom = this.ag$a;
    }

    /* loaded from: classes.dex */
    public class CubicEasing extends BaseAdapter$ag$a {
        public CustomTextView ag$a;
        public CustomTextView values;

        public CubicEasing(Context context, int i, ViewGroup viewGroup) {
            super(context, i, viewGroup);
            this.ag$a = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.price);
            this.values = (CustomTextView) this.itemView.findViewById(com.app.dream11Pro.R.id.rank);
        }
    }
}
