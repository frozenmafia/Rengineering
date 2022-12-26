package o;
/* loaded from: classes5.dex */
public final class CircularPropagation implements Comparable<CircularPropagation> {
    public static final CircularPropagation$ah$a ah$a = new CircularPropagation$ah$a(null);
    private final short valueOf;

    public static short ag$a(short s) {
        return s;
    }

    public static int toString(short s) {
        return s;
    }

    public static final /* synthetic */ CircularPropagation valueOf(short s) {
        return new CircularPropagation(s);
    }

    public static boolean values(short s, Object obj) {
        return (obj instanceof CircularPropagation) && s == ((CircularPropagation) obj).valueOf();
    }

    public boolean equals(Object obj) {
        return values(this.valueOf, obj);
    }

    public int hashCode() {
        return toString(this.valueOf);
    }

    public final /* synthetic */ short valueOf() {
        return this.valueOf;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(CircularPropagation circularPropagation) {
        return runAnimators.toString(valueOf() & 65535, circularPropagation.valueOf() & 65535);
    }

    private /* synthetic */ CircularPropagation(short s) {
        this.valueOf = s;
    }

    public static String ah$a(short s) {
        return String.valueOf(s & 65535);
    }

    public String toString() {
        return ah$a(this.valueOf);
    }
}
