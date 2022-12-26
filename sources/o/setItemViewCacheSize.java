package o;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;
/* loaded from: classes5.dex */
public class setItemViewCacheSize<K, V> implements LLRBNode<K, V> {
    private static final setItemViewCacheSize ah$a = new setItemViewCacheSize();

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> HaptikSDK$a() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> HaptikSDK$b() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> HaptikSDK$c() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean ag$a() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> ah$a(K k, V v, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public K ah$a() {
        return null;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public void ah$a(LLRBNode.values<K, V> valuesVar) {
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public V ah$b() {
        return null;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean getSignupData() {
        return true;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> invoke() {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> valueOf(K k, Comparator<K> comparator) {
        return this;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public int values() {
        return 0;
    }

    public static <K, V> setItemViewCacheSize<K, V> valueOf() {
        return ah$a;
    }

    private setItemViewCacheSize() {
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> valueOf(K k, V v, Comparator<K> comparator) {
        return new setLayoutManager(k, v);
    }
}
