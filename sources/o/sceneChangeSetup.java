package o;

import java.util.NoSuchElementException;
import o.FragmentTransitionSupport;
/* loaded from: classes5.dex */
public final class sceneChangeSetup extends FragmentTransitionSupport.AnonymousClass3 {
    private final int ag$a;
    private boolean toString;
    private int valueOf;
    private final int values;

    public sceneChangeSetup(char c, char c2, int i) {
        this.values = i;
        this.ag$a = c2;
        boolean z = i <= 0 ? runAnimators.toString(c, c2) >= 0 : runAnimators.toString(c, c2) <= 0;
        this.toString = z;
        this.valueOf = z ? c : c2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.toString;
    }

    @Override // o.FragmentTransitionSupport.AnonymousClass3
    public char valueOf() {
        int i = this.valueOf;
        if (i == this.ag$a) {
            if (!this.toString) {
                throw new NoSuchElementException();
            }
            this.toString = false;
        } else {
            this.valueOf = this.values + i;
        }
        return (char) i;
    }
}
