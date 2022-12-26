package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public class setLiveRegion extends RecyclerView.ItemDecoration {
    private final int values;

    public setLiveRegion(int i) {
        this.values = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        rect.bottom = this.values;
    }
}
