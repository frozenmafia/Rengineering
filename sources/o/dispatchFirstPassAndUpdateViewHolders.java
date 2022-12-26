package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes5.dex */
public class dispatchFirstPassAndUpdateViewHolders {
    private final String toString;

    public static dispatchFirstPassAndUpdateViewHolders valueOf(String str) {
        return new dispatchFirstPassAndUpdateViewHolders(str);
    }

    public static dispatchFirstPassAndUpdateViewHolders ah$a(char c) {
        return new dispatchFirstPassAndUpdateViewHolders(String.valueOf(c));
    }

    private dispatchFirstPassAndUpdateViewHolders(String str) {
        this.toString = (String) markViewHoldersUpdated.toString(str);
    }

    private dispatchFirstPassAndUpdateViewHolders(dispatchFirstPassAndUpdateViewHolders dispatchfirstpassandupdateviewholders) {
        this.toString = dispatchfirstpassandupdateviewholders.toString;
    }

    public <A extends Appendable> A ah$a(A a, Iterator<? extends Object> it) throws IOException {
        markViewHoldersUpdated.toString(a);
        if (it.hasNext()) {
            a.append(values(it.next()));
            while (it.hasNext()) {
                a.append(this.toString);
                a.append(values(it.next()));
            }
        }
        return a;
    }

    public final StringBuilder values(StringBuilder sb, Iterable<? extends Object> iterable) {
        return toString(sb, iterable.iterator());
    }

    public final StringBuilder toString(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            ah$a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String values(Iterable<? extends Object> iterable) {
        return valueOf(iterable.iterator());
    }

    public final String valueOf(Iterator<? extends Object> it) {
        return toString(new StringBuilder(), it).toString();
    }

    public final String values(Object[] objArr) {
        return values((Iterable<? extends Object>) Arrays.asList(objArr));
    }

    public dispatchFirstPassAndUpdateViewHolders toString(final String str) {
        markViewHoldersUpdated.toString(str);
        return new dispatchFirstPassAndUpdateViewHolders(this) { // from class: o.dispatchFirstPassAndUpdateViewHolders.4
            @Override // o.dispatchFirstPassAndUpdateViewHolders
            CharSequence values(Object obj) {
                return obj == null ? str : dispatchFirstPassAndUpdateViewHolders.this.values(obj);
            }

            @Override // o.dispatchFirstPassAndUpdateViewHolders
            public dispatchFirstPassAndUpdateViewHolders toString(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    CharSequence values(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
