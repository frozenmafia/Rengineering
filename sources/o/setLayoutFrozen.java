package o;

import com.google.firebase.database.collection.LLRBNode;
/* loaded from: classes5.dex */
public class setLayoutFrozen<K, V> extends setPreserveFocusAfterLayout<K, V> {
    private int values;

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean ag$a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLayoutFrozen(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k, v, lLRBNode, lLRBNode2);
        this.values = -1;
    }

    @Override // o.setPreserveFocusAfterLayout
    protected LLRBNode.Color valueOf() {
        return LLRBNode.Color.BLACK;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int values() {
        if (this.values == -1) {
            this.values = HaptikSDK$b().values() + 1 + HaptikSDK$a().values();
        }
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setPreserveFocusAfterLayout
    public void ag$a(LLRBNode<K, V> lLRBNode) {
        if (this.values != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.ag$a(lLRBNode);
    }

    @Override // o.setPreserveFocusAfterLayout
    protected setPreserveFocusAfterLayout<K, V> ag$a(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k == null) {
            k = ah$a();
        }
        if (v == null) {
            v = ah$b();
        }
        if (lLRBNode == null) {
            lLRBNode = HaptikSDK$b();
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = HaptikSDK$a();
        }
        return new setLayoutFrozen(k, v, lLRBNode, lLRBNode2);
    }
}
