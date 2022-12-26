package o;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class getStateSet<M> {
    private final M ag$a;

    public getStateSet(M m) {
        this.ag$a = m;
    }

    public boolean values() {
        return this.ag$a == null;
    }

    public M ag$a() {
        M m = this.ag$a;
        if (m != null) {
            return m;
        }
        throw new NoSuchElementException("No value present");
    }
}
