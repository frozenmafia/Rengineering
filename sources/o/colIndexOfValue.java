package o;

import android.view.View;
/* loaded from: classes3.dex */
public final class colIndexOfValue implements View.OnLongClickListener {
    final values ag$a;
    final int ah$a;

    /* loaded from: classes3.dex */
    public interface values {
        boolean ah$a(int i, View view);
    }

    public colIndexOfValue(values valuesVar, int i) {
        this.ag$a = valuesVar;
        this.ah$a = i;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return this.ag$a.ah$a(this.ah$a, view);
    }
}
