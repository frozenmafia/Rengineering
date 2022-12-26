package o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class hasObservers extends RecyclerView.ItemDecoration {
    private final Drawable ag$a;

    public hasObservers(Drawable drawable) {
        runAnimators.ag$a(drawable, "divider");
        this.ag$a = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        runAnimators.ag$a(canvas, "c");
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth();
        int paddingRight = recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 2;
        if (childCount < 0) {
            return;
        }
        int i = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) layoutParams).bottomMargin;
            this.ag$a.setBounds(paddingLeft + 12, bottom, (width - paddingRight) - 12, this.ag$a.getIntrinsicHeight() + bottom);
            this.ag$a.draw(canvas);
            if (i == childCount) {
                return;
            }
            i++;
        }
    }
}
