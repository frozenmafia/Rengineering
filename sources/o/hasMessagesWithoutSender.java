package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes3.dex */
public final class hasMessagesWithoutSender extends RecyclerView.ItemDecoration {
    private final int values;

    public hasMessagesWithoutSender(int i) {
        this.values = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        runAnimators.ag$a(rect, "outRect");
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = this.values;
        }
    }
}
