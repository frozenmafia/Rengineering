package o;

import java.util.Objects;
import o.PagerTitleStrip;
import o.getCurrentItem;
/* loaded from: classes7.dex */
public final class getOffscreenPageLimit<S extends getCurrentItem<S>> {
    private final Object valueOf;

    public static <S extends getCurrentItem<S>> Object ag$a(Object obj) {
        return obj;
    }

    public static String ah$a(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public static int toString(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static boolean valueOf(Object obj, Object obj2) {
        return (obj2 instanceof getOffscreenPageLimit) && runAnimators.values(obj, ((getOffscreenPageLimit) obj2).ah$a());
    }

    public final /* synthetic */ Object ah$a() {
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        return valueOf(this.valueOf, obj);
    }

    public int hashCode() {
        return toString(this.valueOf);
    }

    public String toString() {
        return ah$a(this.valueOf);
    }

    public static final boolean valueOf(Object obj) {
        fakeDragBy fakedragby;
        fakedragby = PagerTitleStrip.SingleLineAllCapsTransform.ag$a;
        return obj == fakedragby;
    }

    public static final S values(Object obj) {
        fakeDragBy fakedragby;
        fakedragby = PagerTitleStrip.SingleLineAllCapsTransform.ag$a;
        if (obj != fakedragby) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }
}
