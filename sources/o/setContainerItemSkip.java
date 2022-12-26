package o;

import android.view.View;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes3.dex */
public class setContainerItemSkip extends getTransformedMotionEvent {
    private View ah$a;
    private final int toString;

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
    }

    public setContainerItemSkip(View view, int i) {
        this.ah$a = view;
        this.toString = i;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return this.toString;
    }
}
