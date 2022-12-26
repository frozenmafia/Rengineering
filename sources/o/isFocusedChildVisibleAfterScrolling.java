package o;

import com.google.firebase.database.snapshot.Node;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class isFocusedChildVisibleAfterScrolling {
    private final RecyclerView.ItemDecoration ag$a;
    private final RecyclerView.ItemDecoration toString;

    public isFocusedChildVisibleAfterScrolling(RecyclerView.ItemDecoration itemDecoration, RecyclerView.ItemDecoration itemDecoration2) {
        this.ag$a = itemDecoration;
        this.toString = itemDecoration2;
    }

    public isFocusedChildVisibleAfterScrolling values(getDecoratedLeft getdecoratedleft, boolean z, boolean z2) {
        return new isFocusedChildVisibleAfterScrolling(new RecyclerView.ItemDecoration(getdecoratedleft, z, z2), this.toString);
    }

    public isFocusedChildVisibleAfterScrolling valueOf(getDecoratedLeft getdecoratedleft, boolean z, boolean z2) {
        return new isFocusedChildVisibleAfterScrolling(this.ag$a, new RecyclerView.ItemDecoration(getdecoratedleft, z, z2));
    }

    public RecyclerView.ItemDecoration ah$a() {
        return this.ag$a;
    }

    public Node ag$a() {
        if (this.ag$a.valueOf()) {
            return this.ag$a.ah$a();
        }
        return null;
    }

    public RecyclerView.ItemDecoration valueOf() {
        return this.toString;
    }

    public Node values() {
        if (this.toString.valueOf()) {
            return this.toString.ah$a();
        }
        return null;
    }
}
