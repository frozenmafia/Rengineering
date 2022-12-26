package o;

import android.view.View;
/* loaded from: classes3.dex */
public final class colGetMap implements View.OnClickListener {
    final int toString;
    final colGetMap$ah$a values;

    public colGetMap(colGetMap$ah$a colgetmap_ah_a, int i) {
        this.values = colgetmap_ah_a;
        this.toString = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.values.valueOf(this.toString, view);
    }
}
