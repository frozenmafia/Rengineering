package o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class readFont extends RecyclerView.ItemDecoration {
    private int ag$a;
    private Drawable ah$a;
    private int toString;
    private final String valueOf;

    public readFont(Drawable drawable, int i, int i2) {
        runAnimators.ag$a(drawable, "mDivider");
        this.ah$a = drawable;
        this.ag$a = i;
        this.toString = i2;
        this.valueOf = "CreateTeamFilterItemDecoration";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        runAnimators.ag$a(canvas, "c");
        runAnimators.ag$a(recyclerView, "parent");
        runAnimators.ag$a(state, "state");
        int i = this.ag$a;
        int width = recyclerView.getWidth();
        int i2 = this.toString;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount - 1; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) layoutParams).bottomMargin;
            this.ah$a.setBounds(i, bottom, width - i2, this.ah$a.getIntrinsicHeight() + bottom);
            this.ah$a.draw(canvas);
        }
    }
}
