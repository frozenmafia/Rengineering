package o;

import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class getDecoratedTop extends LeafNode<getDecoratedTop> {
    private final long values;

    public getDecoratedTop(Long l, Node node) {
        super(node);
        this.values = l.longValue();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object ah$a() {
        return Long.valueOf(this.values);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String valueOf(Node.HashVersion hashVersion) {
        return (ag$a(hashVersion) + "number:") + RecyclerView.ItemAnimator.AdapterChanges.values(this.values);
    }

    @Override // com.google.firebase.database.snapshot.Node
    /* renamed from: valueOf */
    public getDecoratedTop values(Node node) {
        return new getDecoratedTop(Long.valueOf(this.values), node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType ag$a() {
        return LeafNode.LeafType.Number;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.snapshot.LeafNode
    /* renamed from: ag$a */
    public int values(getDecoratedTop getdecoratedtop) {
        return RecyclerView.ItemAnimator.AdapterChanges.toString(this.values, getdecoratedtop.values);
    }

    public boolean equals(Object obj) {
        if (obj instanceof getDecoratedTop) {
            getDecoratedTop getdecoratedtop = (getDecoratedTop) obj;
            return this.values == getdecoratedtop.values && this.ah$a.equals(getdecoratedtop.ah$a);
        }
        return false;
    }

    public int hashCode() {
        long j = this.values;
        return ((int) (j ^ (j >>> 32))) + this.ah$a.hashCode();
    }
}
