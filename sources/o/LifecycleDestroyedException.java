package o;

import android.view.View;
/* loaded from: classes4.dex */
public final class LifecycleDestroyedException implements View.OnClickListener {
    final int ag$a;
    final toString toString;

    /* loaded from: classes4.dex */
    public interface toString {
        void values(int i, View view);
    }

    public LifecycleDestroyedException(toString tostring, int i) {
        this.toString = tostring;
        this.ag$a = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.toString.values(this.ag$a, view);
    }
}
