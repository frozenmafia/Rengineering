package o;

import com.google.firebase.database.snapshot.Node;
import java.util.Map;
/* loaded from: classes5.dex */
public class notifyItemChanged {
    private Node ah$a = null;
    private Map<detachViewAt, notifyItemChanged> values = null;

    /* loaded from: classes5.dex */
    public interface values {
        void ag$a(bindViewHolder bindviewholder, Node node);
    }

    public void valueOf(final bindViewHolder bindviewholder, final values valuesVar) {
        Node node = this.ah$a;
        if (node != null) {
            valuesVar.ag$a(bindviewholder, node);
        } else {
            toString(new notifyItemChanged$ah$a() { // from class: o.notifyItemChanged.3
                @Override // o.notifyItemChanged$ah$a
                public void ah$a(detachViewAt detachviewat, notifyItemChanged notifyitemchanged) {
                    notifyitemchanged.valueOf(bindviewholder.valueOf(detachviewat), valuesVar);
                }
            });
        }
    }

    public void toString(notifyItemChanged$ah$a notifyitemchanged_ah_a) {
        Map<detachViewAt, notifyItemChanged> map = this.values;
        if (map != null) {
            for (Map.Entry<detachViewAt, notifyItemChanged> entry : map.entrySet()) {
                notifyitemchanged_ah_a.ah$a(entry.getKey(), entry.getValue());
            }
        }
    }
}
