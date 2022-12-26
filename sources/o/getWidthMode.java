package o;

import com.google.firebase.database.snapshot.LeafNode;
import com.google.firebase.database.snapshot.Node;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class getWidthMode extends LeafNode<getWidthMode> {
    private final String values;

    public getWidthMode(String str, Node node) {
        super(node);
        this.values = str;
    }

    @Override // com.google.firebase.database.snapshot.Node
    public Object ah$a() {
        return this.values;
    }

    /* renamed from: o.getWidthMode$4  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] ah$a;

        static {
            int[] iArr = new int[Node.HashVersion.values().length];
            ah$a = iArr;
            try {
                iArr[Node.HashVersion.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ah$a[Node.HashVersion.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.firebase.database.snapshot.Node
    public String valueOf(Node.HashVersion hashVersion) {
        int i = AnonymousClass4.ah$a[hashVersion.ordinal()];
        if (i == 1) {
            return ag$a(hashVersion) + "string:" + this.values;
        } else if (i == 2) {
            return ag$a(hashVersion) + "string:" + RecyclerView.ItemAnimator.AdapterChanges.valueOf(this.values);
        } else {
            throw new IllegalArgumentException("Invalid hash version for string node: " + hashVersion);
        }
    }

    @Override // com.google.firebase.database.snapshot.Node
    /* renamed from: ah$a */
    public getWidthMode values(Node node) {
        return new getWidthMode(this.values, node);
    }

    @Override // com.google.firebase.database.snapshot.LeafNode
    public LeafNode.LeafType ag$a() {
        return LeafNode.LeafType.String;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.snapshot.LeafNode
    /* renamed from: valueOf */
    public int values(getWidthMode getwidthmode) {
        return this.values.compareTo(getwidthmode.values);
    }

    public boolean equals(Object obj) {
        if (obj instanceof getWidthMode) {
            getWidthMode getwidthmode = (getWidthMode) obj;
            return this.values.equals(getwidthmode.values) && this.ah$a.equals(getwidthmode.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return this.values.hashCode() + this.ah$a.hashCode();
    }
}
