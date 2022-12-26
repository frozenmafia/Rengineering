package o;

import o.FragmentTransitionSupport;
import o.Transition;
/* loaded from: classes5.dex */
public class go implements Iterable<Character>, Transition.ArrayListManager {
    public static final valueOf valueOf = new valueOf(null);
    private final char ag$a;
    private final char toString;
    private final int values;

    public go(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.toString = c;
        this.ag$a = (char) setSide.ah$a(c, c2, i);
        this.values = i;
    }

    public final char ah$a() {
        return this.toString;
    }

    public final char valueOf() {
        return this.ag$a;
    }

    @Override // java.lang.Iterable
    /* renamed from: ag$a */
    public FragmentTransitionSupport.AnonymousClass3 iterator() {
        return new sceneChangeSetup(this.toString, this.ag$a, this.values);
    }

    public boolean values() {
        return this.values <= 0 ? runAnimators.toString(this.toString, this.ag$a) < 0 : runAnimators.toString(this.toString, this.ag$a) > 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof go) {
            if (!values() || !((go) obj).values()) {
                go goVar = (go) obj;
                if (this.toString != goVar.toString || this.ag$a != goVar.ag$a || this.values != goVar.values) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (values()) {
            return -1;
        }
        return (((this.toString * 31) + this.ag$a) * 31) + this.values;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.values > 0) {
            sb = new StringBuilder();
            sb.append(this.toString);
            sb.append("..");
            sb.append(this.ag$a);
            sb.append(" step ");
            i = this.values;
        } else {
            sb = new StringBuilder();
            sb.append(this.toString);
            sb.append(" downTo ");
            sb.append(this.ag$a);
            sb.append(" step ");
            i = -this.values;
        }
        sb.append(i);
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
