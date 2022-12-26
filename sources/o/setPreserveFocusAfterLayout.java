package o;

import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;
/* loaded from: classes5.dex */
public abstract class setPreserveFocusAfterLayout<K, V> implements LLRBNode<K, V> {
    private final K ah$a;
    private final LLRBNode<K, V> toString;
    private LLRBNode<K, V> valueOf;
    private final V values;

    protected abstract setPreserveFocusAfterLayout<K, V> ag$a(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    @Override // com.google.firebase.database.collection.LLRBNode
    public boolean getSignupData() {
        return false;
    }

    protected abstract LLRBNode.Color valueOf();

    private static LLRBNode.Color ah$a(LLRBNode lLRBNode) {
        return lLRBNode.ag$a() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPreserveFocusAfterLayout(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        this.ah$a = k;
        this.values = v;
        this.valueOf = lLRBNode == null ? setItemViewCacheSize.valueOf() : lLRBNode;
        this.toString = lLRBNode2 == null ? setItemViewCacheSize.valueOf() : lLRBNode2;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> HaptikSDK$b() {
        return this.valueOf;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> HaptikSDK$a() {
        return this.toString;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public K ah$a() {
        return this.ah$a;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public V ah$b() {
        return this.values;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    /* renamed from: toString */
    public setPreserveFocusAfterLayout<K, V> ah$a(K k, V v, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k == null) {
            k = this.ah$a;
        }
        if (v == null) {
            v = this.values;
        }
        if (lLRBNode == null) {
            lLRBNode = this.valueOf;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.toString;
        }
        if (color == LLRBNode.Color.RED) {
            return new setLayoutManager(k, v, lLRBNode, lLRBNode2);
        }
        return new setLayoutFrozen(k, v, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> valueOf(K k, V v, Comparator<K> comparator) {
        setPreserveFocusAfterLayout<K, V> ag$a;
        int compare = comparator.compare(k, this.ah$a);
        if (compare < 0) {
            ag$a = ag$a(null, null, this.valueOf.valueOf(k, v, comparator), null);
        } else if (compare == 0) {
            ag$a = ag$a(k, v, null, null);
        } else {
            ag$a = ag$a(null, null, null, this.toString.valueOf(k, v, comparator));
        }
        return ag$a.HaptikSDK$d();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> valueOf(K k, Comparator<K> comparator) {
        setPreserveFocusAfterLayout<K, V> ag$a;
        if (comparator.compare(k, this.ah$a) < 0) {
            setPreserveFocusAfterLayout<K, V> HaptikSDK$e = (this.valueOf.getSignupData() || this.valueOf.ag$a() || ((setPreserveFocusAfterLayout) this.valueOf).valueOf.ag$a()) ? this : HaptikSDK$e();
            ag$a = HaptikSDK$e.ag$a(null, null, HaptikSDK$e.valueOf.valueOf(k, comparator), null);
        } else {
            setPreserveFocusAfterLayout<K, V> onXdkEvent = this.valueOf.ag$a() ? onXdkEvent() : this;
            if (!onXdkEvent.toString.getSignupData() && !onXdkEvent.toString.ag$a() && !((setPreserveFocusAfterLayout) onXdkEvent.toString).valueOf.ag$a()) {
                onXdkEvent = onXdkEvent.getInitSettings();
            }
            if (comparator.compare(k, onXdkEvent.ah$a) == 0) {
                if (onXdkEvent.toString.getSignupData()) {
                    return setItemViewCacheSize.valueOf();
                }
                LLRBNode<K, V> HaptikSDK$c = onXdkEvent.toString.HaptikSDK$c();
                onXdkEvent = onXdkEvent.ag$a(HaptikSDK$c.ah$a(), HaptikSDK$c.ah$b(), null, ((setPreserveFocusAfterLayout) onXdkEvent.toString).aj$a());
            }
            ag$a = onXdkEvent.ag$a(null, null, null, onXdkEvent.toString.valueOf(k, comparator));
        }
        return ag$a.HaptikSDK$d();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> HaptikSDK$c() {
        return this.valueOf.getSignupData() ? this : this.valueOf.HaptikSDK$c();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public LLRBNode<K, V> invoke() {
        return this.toString.getSignupData() ? this : this.toString.invoke();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    public void ah$a(LLRBNode.values<K, V> valuesVar) {
        this.valueOf.ah$a(valuesVar);
        valuesVar.values(this.ah$a, this.values);
        this.toString.ah$a(valuesVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(LLRBNode<K, V> lLRBNode) {
        this.valueOf = lLRBNode;
    }

    private LLRBNode<K, V> aj$a() {
        if (this.valueOf.getSignupData()) {
            return setItemViewCacheSize.valueOf();
        }
        setPreserveFocusAfterLayout<K, V> HaptikSDK$e = (HaptikSDK$b().ag$a() || HaptikSDK$b().HaptikSDK$b().ag$a()) ? this : HaptikSDK$e();
        return HaptikSDK$e.ag$a(null, null, ((setPreserveFocusAfterLayout) HaptikSDK$e.valueOf).aj$a(), null).HaptikSDK$d();
    }

    private setPreserveFocusAfterLayout<K, V> HaptikSDK$e() {
        setPreserveFocusAfterLayout<K, V> HaptikWebView = HaptikWebView();
        return HaptikWebView.HaptikSDK$a().HaptikSDK$b().ag$a() ? HaptikWebView.ag$a(null, null, null, ((setPreserveFocusAfterLayout) HaptikWebView.HaptikSDK$a()).onXdkEvent()).isLogoutPending().HaptikWebView() : HaptikWebView;
    }

    private setPreserveFocusAfterLayout<K, V> getInitSettings() {
        setPreserveFocusAfterLayout<K, V> HaptikWebView = HaptikWebView();
        return HaptikWebView.HaptikSDK$b().HaptikSDK$b().ag$a() ? HaptikWebView.onXdkEvent().HaptikWebView() : HaptikWebView;
    }

    private setPreserveFocusAfterLayout<K, V> HaptikSDK$d() {
        setPreserveFocusAfterLayout<K, V> isLogoutPending = (!this.toString.ag$a() || this.valueOf.ag$a()) ? this : isLogoutPending();
        if (isLogoutPending.valueOf.ag$a() && ((setPreserveFocusAfterLayout) isLogoutPending.valueOf).valueOf.ag$a()) {
            isLogoutPending = isLogoutPending.onXdkEvent();
        }
        return (isLogoutPending.valueOf.ag$a() && isLogoutPending.toString.ag$a()) ? isLogoutPending.HaptikWebView() : isLogoutPending;
    }

    private setPreserveFocusAfterLayout<K, V> isLogoutPending() {
        return (setPreserveFocusAfterLayout) this.toString.ah$a(null, null, valueOf(), ah$a(null, null, LLRBNode.Color.RED, null, ((setPreserveFocusAfterLayout) this.toString).valueOf), null);
    }

    private setPreserveFocusAfterLayout<K, V> onXdkEvent() {
        return (setPreserveFocusAfterLayout) this.valueOf.ah$a(null, null, valueOf(), null, ah$a(null, null, LLRBNode.Color.RED, ((setPreserveFocusAfterLayout) this.valueOf).toString, null));
    }

    private setPreserveFocusAfterLayout<K, V> HaptikWebView() {
        LLRBNode<K, V> lLRBNode = this.valueOf;
        LLRBNode<K, V> ah$a = lLRBNode.ah$a(null, null, ah$a(lLRBNode), null, null);
        LLRBNode<K, V> lLRBNode2 = this.toString;
        return ah$a(null, null, ah$a(this), ah$a, lLRBNode2.ah$a(null, null, ah$a(lLRBNode2), null, null));
    }
}
