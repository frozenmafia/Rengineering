package androidx.core.util;

import android.util.Range;
import o.getPropagationProperties;
import o.getPropagationProperties$ah$a;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class RangeKt {
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        runAnimators.ag$a(t, "<this>");
        runAnimators.ag$a(t2, "that");
        return new Range<>(t, t2);
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        runAnimators.ag$a(range, "<this>");
        runAnimators.ag$a(t, "value");
        Range<T> extend = range.extend((Range<T>) t);
        runAnimators.ah$a(extend, "extend(value)");
        return extend;
    }

    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        runAnimators.ag$a(range, "<this>");
        runAnimators.ag$a(range2, "other");
        Range<T> extend = range.extend(range2);
        runAnimators.ah$a(extend, "extend(other)");
        return extend;
    }

    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        runAnimators.ag$a(range, "<this>");
        runAnimators.ag$a(range2, "other");
        Range<T> intersect = range.intersect(range2);
        runAnimators.ah$a(intersect, "intersect(other)");
        return intersect;
    }

    public static final <T extends Comparable<? super T>> getPropagationProperties<T> toClosedRange(final Range<T> range) {
        runAnimators.ag$a(range, "<this>");
        return (getPropagationProperties) new getPropagationProperties<T>() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                return runAnimators.ag$a(comparable, "value");
            }

            public boolean isEmpty() {
                return getPropagationProperties$ah$a.toString(this);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // o.getPropagationProperties
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // o.getPropagationProperties
            public Comparable getStart() {
                return range.getLower();
            }
        };
    }

    public static final <T extends Comparable<? super T>> Range<T> toRange(getPropagationProperties<T> getpropagationproperties) {
        runAnimators.ag$a(getpropagationproperties, "<this>");
        return new Range<>(getpropagationproperties.getStart(), getpropagationproperties.getEndInclusive());
    }
}
