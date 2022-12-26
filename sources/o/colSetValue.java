package o;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* loaded from: classes3.dex */
public final class colSetValue implements SwipeRefreshLayout.OnRefreshListener {
    final values toString;
    final int values;

    /* loaded from: classes3.dex */
    public interface values {
        void a_(int i);
    }

    public colSetValue(values valuesVar, int i) {
        this.toString = valuesVar;
        this.values = i;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.toString.a_(this.values);
    }
}
