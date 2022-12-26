package o;

import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class getDecoratedMeasuredHeight extends LeafNode<getDecoratedMeasuredHeight> {
    private final Double toString;

    public getDecoratedMeasuredHeight(Double d, Node node) {
        super(node);
        this.toString = d;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object ah$a() {
        return this.toString;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String valueOf(Node.HashVersion hashVersion) {
        return (ag$a(hashVersion) + "number:") + RecyclerView.ItemAnimator.AdapterChanges.values(this.toString.doubleValue());
    }

    @Override // com.google.firebase.database.snapshot.Node
    /* renamed from: valueOf */
    public getDecoratedMeasuredHeight values(Node node) {
        RecyclerView.ItemAnimator.AdapterChanges.ah$a(getTopDecorationHeight.valueOf(node));
        return new getDecoratedMeasuredHeight(this.toString, node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType ag$a() {
        return LeafNode.LeafType.Number;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.snapshot.LeafNode
    /* renamed from: ag$a */
    public int values(getDecoratedMeasuredHeight getdecoratedmeasuredheight) {
        return this.toString.compareTo(getdecoratedmeasuredheight.toString);
    }

    public boolean equals(Object obj) {
        if (obj instanceof getDecoratedMeasuredHeight) {
            getDecoratedMeasuredHeight getdecoratedmeasuredheight = (getDecoratedMeasuredHeight) obj;
            return this.toString.equals(getdecoratedmeasuredheight.toString) && this.ah$a.equals(getdecoratedmeasuredheight.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return this.toString.hashCode() + this.ah$a.hashCode();
    }
}
