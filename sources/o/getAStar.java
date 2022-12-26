package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public class getAStar extends RecyclerView.ItemDecoration {
    private boolean ag$a;
    private boolean ah$a;
    private final int valueOf;

    public getAStar(int i, boolean z) {
        this.valueOf = i;
        this.ah$a = z;
    }

    public getAStar(int i, boolean z, boolean z2) {
        this.valueOf = i;
        this.ah$a = z;
        this.ag$a = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, androidx.recyclerview.widget.RecyclerView recyclerView, RecyclerView.State state) {
        rect.bottom = this.valueOf;
        if (this.ah$a) {
            rect.right = this.valueOf;
        }
        if (this.ag$a) {
            rect.left = this.valueOf;
        }
    }
}
