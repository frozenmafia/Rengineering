package o;

import com.google.firebase.database.collection.LLRBNode;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* loaded from: classes5.dex */
public class setOnFlingListener<K, V> implements Iterator<Map.Entry<K, V>> {
    private final boolean toString;
    private final ArrayDeque<setPreserveFocusAfterLayout<K, V>> values = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnFlingListener(LLRBNode<K, V> lLRBNode, K k, Comparator<K> comparator, boolean z) {
        int i;
        this.toString = z;
        while (!lLRBNode.getSignupData()) {
            if (k == null) {
                i = 1;
            } else if (z) {
                i = comparator.compare(k, lLRBNode.ah$a());
            } else {
                i = comparator.compare(lLRBNode.ah$a(), k);
            }
            if (i < 0) {
                if (z) {
                    lLRBNode = lLRBNode.HaptikSDK$b();
                } else {
                    lLRBNode = lLRBNode.HaptikSDK$a();
                }
            } else if (i == 0) {
                this.values.push((setPreserveFocusAfterLayout) lLRBNode);
                return;
            } else {
                this.values.push((setPreserveFocusAfterLayout) lLRBNode);
                if (z) {
                    lLRBNode = lLRBNode.HaptikSDK$a();
                } else {
                    lLRBNode = lLRBNode.HaptikSDK$b();
                }
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.values.size() > 0;
    }

    @Override // java.util.Iterator
    /* renamed from: ag$a */
    public Map.Entry<K, V> next() {
        try {
            setPreserveFocusAfterLayout<K, V> pop = this.values.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.ah$a(), pop.ah$b());
            if (this.toString) {
                for (LLRBNode<K, V> HaptikSDK$b = pop.HaptikSDK$b(); !HaptikSDK$b.getSignupData(); HaptikSDK$b = HaptikSDK$b.HaptikSDK$a()) {
                    this.values.push((setPreserveFocusAfterLayout) HaptikSDK$b);
                }
            } else {
                for (LLRBNode<K, V> HaptikSDK$a = pop.HaptikSDK$a(); !HaptikSDK$a.getSignupData(); HaptikSDK$a = HaptikSDK$a.HaptikSDK$b()) {
                    this.values.push((setPreserveFocusAfterLayout) HaptikSDK$a);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
