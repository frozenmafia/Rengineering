package o;

import com.google.firebase.database.snapshot.Node;
/* loaded from: classes5.dex */
public class notifyItemMoved {
    private Node valueOf;

    public notifyItemMoved() {
        this.valueOf = getDecoratedBottom.HaptikWebView();
    }

    public notifyItemMoved(Node node) {
        this.valueOf = node;
    }

    public Node ag$a() {
        return this.valueOf;
    }

    public Node values(bindViewHolder bindviewholder) {
        return this.valueOf.toString(bindviewholder);
    }

    public void values(bindViewHolder bindviewholder, Node node) {
        this.valueOf = this.valueOf.toString(bindviewholder, node);
    }
}
