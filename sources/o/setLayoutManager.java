package o;

import com.google.firebase.database.collection.LLRBNode;
/* loaded from: classes5.dex */
public class setLayoutManager<K, V> extends setPreserveFocusAfterLayout<K, V> {
    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean ag$a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLayoutManager(K k, V v) {
        super(k, v, setItemViewCacheSize.valueOf(), setItemViewCacheSize.valueOf());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLayoutManager(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        super(k, v, lLRBNode, lLRBNode2);
    }

    @Override // o.setPreserveFocusAfterLayout
    protected LLRBNode.Color valueOf() {
        return LLRBNode.Color.RED;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int values() {
        return HaptikSDK$b().values() + 1 + HaptikSDK$a().values();
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
        return new setLayoutManager(k, v, lLRBNode, lLRBNode2);
    }
}
