package o;

import java.util.List;
import java.util.Objects;
import o.PercentRelativeLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class restoreLayoutParams extends PercentRelativeLayout.LayoutParams {
    private final List<onBindViewHolder> ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public restoreLayoutParams(List<onBindViewHolder> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.ag$a = list;
    }

    @Override // o.PercentRelativeLayout.LayoutParams
    public List<onBindViewHolder> values() {
        return this.ag$a;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.ag$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PercentRelativeLayout.LayoutParams) {
            return this.ag$a.equals(((PercentRelativeLayout.LayoutParams) obj).values());
        }
        return false;
    }

    public int hashCode() {
        return this.ag$a.hashCode() ^ 1000003;
    }
}
