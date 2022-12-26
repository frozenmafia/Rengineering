package o;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.random.Random;
import o.TranslationAnimationCreator;
/* loaded from: classes5.dex */
public interface TransitionManager<T, V> {
    V ah$a(T t, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener);

    void toString(T t, TranslationAnimationCreator.TransitionPositionListener<?> transitionPositionListener, V v);

    /* loaded from: classes5.dex */
    public final class MultiListener {
        public static final int values(int i, int i2) {
            return (i >>> (32 - i2)) & ((-i2) >> 31);
        }

        public static final int ag$a(Random random, TransitionPropagation transitionPropagation) {
            runAnimators.ag$a(random, "<this>");
            runAnimators.ag$a(transitionPropagation, SessionDescription.ATTR_RANGE);
            if (!transitionPropagation.valueOf()) {
                return transitionPropagation.ah$a() < Integer.MAX_VALUE ? random.nextInt(transitionPropagation.ag$a(), transitionPropagation.ah$a() + 1) : transitionPropagation.ag$a() > Integer.MIN_VALUE ? random.nextInt(transitionPropagation.ag$a() - 1, transitionPropagation.ah$a()) + 1 : random.nextInt();
            }
            throw new IllegalArgumentException("Cannot get random in empty range: " + transitionPropagation);
        }

        public static final int valueOf(int i) {
            return 31 - Integer.numberOfLeadingZeros(i);
        }

        public static final void valueOf(int i, int i2) {
            if (!(i2 > i)) {
                throw new IllegalArgumentException(ah$a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
            }
        }

        public static final void ag$a(long j, long j2) {
            if (!(j2 > j)) {
                throw new IllegalArgumentException(ah$a(Long.valueOf(j), Long.valueOf(j2)).toString());
            }
        }

        public static final void ah$a(double d, double d2) {
            if (!(d2 > d)) {
                throw new IllegalArgumentException(ah$a(Double.valueOf(d), Double.valueOf(d2)).toString());
            }
        }

        public static final String ah$a(Object obj, Object obj2) {
            runAnimators.ag$a(obj, "from");
            runAnimators.ag$a(obj2, "until");
            return "Random range is empty: [" + obj + ", " + obj2 + ").";
        }
    }
}
