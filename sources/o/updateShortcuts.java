package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public class updateShortcuts extends RecyclerView.ItemDecoration {
    private int ag$a;
    private int toString;
    private int valueOf;
    private int values;

    public updateShortcuts(Context context, int i, int i2, int i3, int i4) {
        Resources resources = context.getResources();
        if (i > 0) {
            this.ag$a = (int) resources.getDimension(i);
        }
        if (i2 > 0) {
            this.toString = (int) resources.getDimension(i2);
        }
        if (i3 > 0) {
            this.values = (int) resources.getDimension(i3);
        }
        if (i4 > 0) {
            this.valueOf = (int) resources.getDimension(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(this.ag$a, this.toString, this.values, this.valueOf);
    }
}
