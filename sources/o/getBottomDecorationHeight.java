package o;

import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import java.util.Map;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class getBottomDecorationHeight extends LeafNode<getBottomDecorationHeight> {
    private Map<Object, Object> values;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.snapshot.LeafNode
    /* renamed from: valueOf */
    public int values(getBottomDecorationHeight getbottomdecorationheight) {
        return 0;
    }

    public getBottomDecorationHeight(Map<Object, Object> map, Node node) {
        super(node);
        this.values = map;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object ah$a() {
        return this.values;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String valueOf(Node.HashVersion hashVersion) {
        return ag$a(hashVersion) + "deferredValue:" + this.values;
    }

    @Override // com.google.firebase.database.snapshot.Node
    /* renamed from: toString */
    public getBottomDecorationHeight values(Node node) {
        RecyclerView.ItemAnimator.AdapterChanges.ah$a(getTopDecorationHeight.valueOf(node));
        return new getBottomDecorationHeight(this.values, node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType ag$a() {
        return LeafNode.LeafType.DeferredValue;
    }

    public boolean equals(Object obj) {
        if (obj instanceof getBottomDecorationHeight) {
            getBottomDecorationHeight getbottomdecorationheight = (getBottomDecorationHeight) obj;
            return this.values.equals(getbottomdecorationheight.values) && this.ah$a.equals(getbottomdecorationheight.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return this.values.hashCode() + this.ah$a.hashCode();
    }
}
