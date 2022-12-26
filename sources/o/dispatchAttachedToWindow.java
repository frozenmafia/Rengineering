package o;

import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
/* loaded from: classes5.dex */
public class dispatchAttachedToWindow extends LeafNode<dispatchAttachedToWindow> {
    private final boolean ag$a;

    public dispatchAttachedToWindow(Boolean bool, Node node) {
        super(node);
        this.ag$a = bool.booleanValue();
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object ah$a() {
        return Boolean.valueOf(this.ag$a);
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String valueOf(Node.HashVersion hashVersion) {
        return ag$a(hashVersion) + "boolean:" + this.ag$a;
    }

    @Override // com.google.firebase.database.snapshot.Node
    /* renamed from: toString */
    public dispatchAttachedToWindow values(Node node) {
        return new dispatchAttachedToWindow(Boolean.valueOf(this.ag$a), node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType ag$a() {
        return LeafNode.LeafType.Boolean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.snapshot.LeafNode
    /* renamed from: valueOf */
    public int values(dispatchAttachedToWindow dispatchattachedtowindow) {
        boolean z = this.ag$a;
        if (z == dispatchattachedtowindow.ag$a) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dispatchAttachedToWindow) {
            dispatchAttachedToWindow dispatchattachedtowindow = (dispatchAttachedToWindow) obj;
            return this.ag$a == dispatchattachedtowindow.ag$a && this.ah$a.equals(dispatchattachedtowindow.ah$a);
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        return (z ? 1 : 0) + this.ah$a.hashCode();
    }
}
