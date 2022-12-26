package o;

import o.Styleable;
/* loaded from: classes7.dex */
public interface readDoubleArray<E> {
    Object ah$a(E e, setPatternPath<? super setAnimationMatrix> setpatternpath);

    boolean ak$b();

    void toString(Styleable.ChangeBounds<? super Throwable, setAnimationMatrix> changeBounds);

    boolean toString(E e);

    Object valueOf(E e);

    boolean values(Throwable th);

    /* loaded from: classes7.dex */
    public static final class valueOf {
        public static /* synthetic */ boolean ah$a(readDoubleArray readdoublearray, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return readdoublearray.values(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <E> boolean values(readDoubleArray<? super E> readdoublearray, E e) {
            Object valueOf = readdoublearray.valueOf(e);
            if (writeSerializable.HaptikSDK$c(valueOf)) {
                return true;
            }
            Throwable ah$a = writeSerializable.ah$a(valueOf);
            if (ah$a == null) {
                return false;
            }
            throw infoForAnyChild.ag$a(ah$a);
        }
    }
}
