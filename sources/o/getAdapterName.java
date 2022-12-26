package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
/* loaded from: classes6.dex */
public final class getAdapterName extends RecyclerView.ItemDecoration {
    public static final valueOf ag$a = new valueOf(null);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        runAnimators.ag$a(rect, "outRect");
        runAnimators.ag$a(view, Promotion.ACTION_VIEW);
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        runAnimators.toString(adapter);
        int itemCount = adapter.getItemCount();
        if (valueOf(recyclerView, view, itemCount)) {
            if (view.getHeight() == 0 && state.didStructureChange()) {
                values(rect, view, recyclerView);
            } else {
                rect.set(0, toString(recyclerView, view, itemCount), 0, 0);
            }
        }
    }

    private final void values(Rect rect, View view, final androidx.recyclerview.widget.RecyclerView recyclerView) {
        rect.set(0, 5000, 0, 0);
        view.post(new Runnable() { // from class: o.Lifecycling
            @Override // java.lang.Runnable
            public final void run() {
                getAdapterName.values(androidx.recyclerview.widget.RecyclerView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(androidx.recyclerview.widget.RecyclerView recyclerView) {
        runAnimators.ag$a(recyclerView, "$parent");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        runAnimators.toString(adapter);
        adapter.notifyDataSetChanged();
    }

    private final int toString(androidx.recyclerview.widget.RecyclerView recyclerView, View view, int i) {
        int height = recyclerView.getHeight() - ah$a(recyclerView, view, i);
        if (height < 0) {
            return 0;
        }
        return height;
    }

    private final int ah$a(androidx.recyclerview.widget.RecyclerView recyclerView, View view, int i) {
        int min = Math.min(recyclerView.getChildCount(), i);
        int i2 = 0;
        for (int i3 = 0; i3 < min - 1; i3++) {
            i2 += recyclerView.getChildAt(i3).getHeight();
        }
        return i2 + view.getHeight();
    }

    private final boolean valueOf(androidx.recyclerview.widget.RecyclerView recyclerView, View view, int i) {
        return recyclerView.getChildAdapterPosition(view) == i - 1;
    }

    /* loaded from: classes6.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
