package o;

import com.google.firebase.database.snapshot.Node;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class getDecoratedBottom extends dispatchDetachedFromWindow {
    private static final getDecoratedBottom toString = new getDecoratedBottom();

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public boolean HaptikSDK$b() {
        return true;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Node HaptikSDK$c() {
        return this;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public detachViewAt ag$a(detachViewAt detachviewat) {
        return null;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Object ah$a() {
        return null;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    /* renamed from: ah$a */
    public getDecoratedBottom values(Node node) {
        return this;
    }

    @Override // o.dispatchDetachedFromWindow
    public int hashCode() {
        return 0;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public boolean invoke() {
        return false;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public String o_() {
        return "";
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Node toString(bindViewHolder bindviewholder) {
        return this;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Node toString(detachViewAt detachviewat) {
        return this;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Object toString(boolean z) {
        return null;
    }

    @Override // o.dispatchDetachedFromWindow
    public String toString() {
        return "<Empty Node>";
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public String valueOf(Node.HashVersion hashVersion) {
        return "";
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public boolean valueOf(detachViewAt detachviewat) {
        return false;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public int values() {
        return 0;
    }

    private getDecoratedBottom() {
    }

    public static getDecoratedBottom HaptikWebView() {
        return toString;
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Node valueOf(detachViewAt detachviewat, Node node) {
        return (node.HaptikSDK$b() || detachviewat.HaptikSDK$b()) ? this : new dispatchDetachedFromWindow().valueOf(detachviewat, node);
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Node toString(bindViewHolder bindviewholder, Node node) {
        if (bindviewholder.HaptikSDK$b()) {
            return node;
        }
        detachViewAt ah$a = bindviewholder.ah$a();
        return valueOf(ah$a, toString(ah$a).toString(bindviewholder.HaptikSDK$c(), node));
    }

    @Override // o.dispatchDetachedFromWindow, java.lang.Iterable
    public Iterator<getLeftDecorationWidth> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // o.dispatchDetachedFromWindow, com.google.firebase.database.snapshot.Node
    public Iterator<getLeftDecorationWidth> HaptikSDK$a() {
        return Collections.emptyList().iterator();
    }

    @Override // o.dispatchDetachedFromWindow, java.lang.Comparable
    /* renamed from: toString */
    public int compareTo(Node node) {
        return node.HaptikSDK$b() ? 0 : -1;
    }

    @Override // o.dispatchDetachedFromWindow
    public boolean equals(Object obj) {
        if (obj instanceof getDecoratedBottom) {
            return true;
        }
        if (obj instanceof Node) {
            Node node = (Node) obj;
            if (node.HaptikSDK$b() && HaptikSDK$c().equals(node.HaptikSDK$c())) {
                return true;
            }
        }
        return false;
    }
}
