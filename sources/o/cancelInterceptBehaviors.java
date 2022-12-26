package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes3.dex */
public final class cancelInterceptBehaviors extends RecyclerView.ItemDecoration {
    private final float toString;

    public cancelInterceptBehaviors(float f) {
        this.toString = f;
    }

    public final float ah$a() {
        return this.toString;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        runAnimators.ag$a(rect, "outRect");
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer valueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
        if (valueOf == null) {
            return;
        }
        valueOf.intValue();
        if (valueOf.intValue() <= 0 || recyclerView.getChildAdapterPosition(view) != valueOf.intValue() - 1) {
            return;
        }
        rect.bottom = (int) ah$a();
    }
}
