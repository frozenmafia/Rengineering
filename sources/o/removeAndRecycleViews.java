package o;

import com.google.firebase.database.snapshot.Node;
/* loaded from: classes5.dex */
public class removeAndRecycleViews {
    private final bindViewHolder ah$a;
    private final notifyItemMoved toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public removeAndRecycleViews(Node node) {
        this(new notifyItemMoved(node), new bindViewHolder(""));
    }

    private removeAndRecycleViews(notifyItemMoved notifyitemmoved, bindViewHolder bindviewholder) {
        this.toString = notifyitemmoved;
        this.ah$a = bindviewholder;
        unregisterAdapterDataObserver.values(bindviewholder, ah$a());
    }

    Node ag$a() {
        return this.toString.values(this.ah$a);
    }

    public Object ah$a() {
        return ag$a().ah$a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof removeAndRecycleViews) {
            removeAndRecycleViews removeandrecycleviews = (removeAndRecycleViews) obj;
            if (this.toString.equals(removeandrecycleviews.toString) && this.ah$a.equals(removeandrecycleviews.ah$a)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        detachViewAt ah$a = this.ah$a.ah$a();
        StringBuilder sb = new StringBuilder();
        sb.append("MutableData { key = ");
        sb.append(ah$a != null ? ah$a.valueOf() : "<none>");
        sb.append(", value = ");
        sb.append(this.toString.ag$a().toString(true));
        sb.append(" }");
        return sb.toString();
    }
}
