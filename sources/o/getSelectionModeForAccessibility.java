package o;

import com.google.firebase.database.snapshot.Node;
/* loaded from: classes5.dex */
public class getSelectionModeForAccessibility extends getDecoratedRight {
    private static final getSelectionModeForAccessibility valueOf = new getSelectionModeForAccessibility();

    @Override // o.getDecoratedRight
    public String ah$a() {
        return ".value";
    }

    public int hashCode() {
        return 4;
    }

    public String toString() {
        return "ValueIndex";
    }

    @Override // o.getDecoratedRight
    public boolean toString(Node node) {
        return true;
    }

    private getSelectionModeForAccessibility() {
    }

    public static getSelectionModeForAccessibility valueOf() {
        return valueOf;
    }

    @Override // o.getDecoratedRight
    public getLeftDecorationWidth toString(detachViewAt detachviewat, Node node) {
        return new getLeftDecorationWidth(detachviewat, node);
    }

    @Override // o.getDecoratedRight
    public getLeftDecorationWidth values() {
        detachViewAt detachviewat;
        detachviewat = detachViewAt.ag$a;
        return new getLeftDecorationWidth(detachviewat, Node.valueOf);
    }

    @Override // java.util.Comparator
    /* renamed from: values */
    public int compare(getLeftDecorationWidth getleftdecorationwidth, getLeftDecorationWidth getleftdecorationwidth2) {
        int compareTo = getleftdecorationwidth.valueOf().compareTo(getleftdecorationwidth2.valueOf());
        return compareTo == 0 ? getleftdecorationwidth.values().compareTo(getleftdecorationwidth2.values()) : compareTo;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof getSelectionModeForAccessibility;
    }
}
