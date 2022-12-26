package o;

import com.google.firebase.database.snapshot.Node;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class RecyclerView$AdapterDataObservable$ah$a extends RecyclerView.AdapterDataObservable {
    private final Node toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView$AdapterDataObservable$ah$a(Node node) {
        this.toString = node;
    }

    @Override // o.RecyclerView.AdapterDataObservable
    public RecyclerView.AdapterDataObservable ag$a(detachViewAt detachviewat) {
        return new RecyclerView$AdapterDataObservable$ah$a(this.toString.toString(detachviewat));
    }

    @Override // o.RecyclerView.AdapterDataObservable
    public Node values() {
        return this.toString;
    }
}
