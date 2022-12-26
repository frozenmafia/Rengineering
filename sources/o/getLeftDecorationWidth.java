package o;

import com.google.firebase.database.snapshot.Node;
/* loaded from: classes5.dex */
public final class getLeftDecorationWidth {
    private static final getLeftDecorationWidth ag$a;
    private static final getLeftDecorationWidth ah$a;
    private final detachViewAt toString;
    private final Node values;

    static {
        detachViewAt detachviewat;
        detachViewAt detachviewat2;
        detachviewat = detachViewAt.toString;
        ah$a = new getLeftDecorationWidth(detachviewat, getDecoratedBottom.HaptikWebView());
        detachviewat2 = detachViewAt.ag$a;
        ag$a = new getLeftDecorationWidth(detachviewat2, Node.valueOf);
    }

    public static getLeftDecorationWidth ah$a() {
        return ah$a;
    }

    public getLeftDecorationWidth(detachViewAt detachviewat, Node node) {
        this.toString = detachviewat;
        this.values = node;
    }

    public detachViewAt values() {
        return this.toString;
    }

    public Node valueOf() {
        return this.values;
    }

    public String toString() {
        return "NamedNode{name=" + this.toString + ", node=" + this.values + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getLeftDecorationWidth getleftdecorationwidth = (getLeftDecorationWidth) obj;
        return this.toString.equals(getleftdecorationwidth.toString) && this.values.equals(getleftdecorationwidth.values);
    }

    public int hashCode() {
        return (this.toString.hashCode() * 31) + this.values.hashCode();
    }
}
