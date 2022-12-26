package o;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class onChildViewAttachedToWindow {
    private static final onChildViewAttachedToWindow ah$a = new onChildViewAttachedToWindow$ah$a();
    private static final onChildViewAttachedToWindow ag$a = new toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> ah$a(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void ah$a(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void values(Object obj, long j);

    private onChildViewAttachedToWindow() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static onChildViewAttachedToWindow valueOf() {
        return ag$a;
    }

    /* loaded from: classes7.dex */
    static final class toString extends onChildViewAttachedToWindow {
        private toString() {
            super();
        }

        @Override // o.onChildViewAttachedToWindow
        <L> List<L> ah$a(Object obj, long j) {
            checkSelectForSwipe$ah$b tostring = toString(obj, j);
            if (tostring.ah$a()) {
                return tostring;
            }
            int size = tostring.size();
            checkSelectForSwipe$ah$b checkselectforswipe_ah_b = tostring.toString(size == 0 ? 10 : size * 2);
            getSwipeVelocityThreshold.ak.ag$a(obj, j, checkselectforswipe_ah_b);
            return checkselectforswipe_ah_b;
        }

        @Override // o.onChildViewAttachedToWindow
        void values(Object obj, long j) {
            toString(obj, j).valueOf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [o.checkSelectForSwipe$ah$b] */
        @Override // o.onChildViewAttachedToWindow
        <E> void ah$a(Object obj, Object obj2, long j) {
            checkSelectForSwipe$ah$b<E> tostring = toString(obj, j);
            checkSelectForSwipe$ah$b<E> tostring2 = toString(obj2, j);
            int size = tostring.size();
            int size2 = tostring2.size();
            checkSelectForSwipe$ah$b<E> checkselectforswipe_ah_b = tostring;
            checkselectforswipe_ah_b = tostring;
            if (size > 0 && size2 > 0) {
                boolean ah$a = tostring.ah$a();
                checkSelectForSwipe$ah$b<E> checkselectforswipe_ah_b2 = tostring;
                if (!ah$a) {
                    checkselectforswipe_ah_b2 = tostring.toString(size2 + size);
                }
                checkselectforswipe_ah_b2.addAll(tostring2);
                checkselectforswipe_ah_b = checkselectforswipe_ah_b2;
            }
            if (size > 0) {
                tostring2 = checkselectforswipe_ah_b;
            }
            getSwipeVelocityThreshold.ak.ag$a(obj, j, tostring2);
        }

        static <E> checkSelectForSwipe$ah$b<E> toString(Object obj, long j) {
            Object ah$b;
            ah$b = getSwipeVelocityThreshold.ak.ah$b(obj, j);
            return (checkSelectForSwipe$ah$b) ah$b;
        }
    }
}
