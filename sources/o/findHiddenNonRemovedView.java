package o;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.AsyncListUtil;
/* loaded from: classes7.dex */
public final class findHiddenNonRemovedView<T> {
    private T ag$a;
    private final int ah$a;
    private final T[] toString;
    private int valueOf;
    private final Comparator<? super T> values;

    public static <T> findHiddenNonRemovedView<T> toString(int i, Comparator<? super T> comparator) {
        return new findHiddenNonRemovedView<>(comparator, i);
    }

    private findHiddenNonRemovedView(Comparator<? super T> comparator, int i) {
        this.values = (Comparator) markViewHoldersUpdated.valueOf(comparator, "comparator");
        this.ah$a = i;
        markViewHoldersUpdated.values(i >= 0, "k (%s) must be >= 0", i);
        markViewHoldersUpdated.values(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.toString = (T[]) new Object[onAttachedToRecyclerView.valueOf(i, 2)];
        this.valueOf = 0;
        this.ag$a = null;
    }

    public void values(T t) {
        int i = this.ah$a;
        if (i == 0) {
            return;
        }
        int i2 = this.valueOf;
        if (i2 == 0) {
            this.toString[0] = t;
            this.ag$a = t;
            this.valueOf = 1;
        } else if (i2 < i) {
            T[] tArr = this.toString;
            this.valueOf = i2 + 1;
            tArr[i2] = t;
            if (this.values.compare(t, (Object) AsyncListUtil.ViewCallback.ag$a(this.ag$a)) > 0) {
                this.ag$a = t;
            }
        } else if (this.values.compare(t, (Object) AsyncListUtil.ViewCallback.ag$a(this.ag$a)) < 0) {
            T[] tArr2 = this.toString;
            int i3 = this.valueOf;
            int i4 = i3 + 1;
            this.valueOf = i4;
            tArr2[i3] = t;
            if (i4 == this.ah$a * 2) {
                valueOf();
            }
        }
    }

    private void valueOf() {
        int i = (this.ah$a * 2) - 1;
        int onattachedtorecyclerview = onAttachedToRecyclerView.toString(i + 0, RoundingMode.CEILING);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < i) {
                int ag$a = ag$a(i3, i, ((i3 + i) + 1) >>> 1);
                int i5 = this.ah$a;
                if (ag$a <= i5) {
                    if (ag$a >= i5) {
                        break;
                    }
                    i3 = Math.max(ag$a, i3 + 1);
                    i2 = ag$a;
                } else {
                    i = ag$a - 1;
                }
                i4++;
                if (i4 >= onattachedtorecyclerview * 3) {
                    Arrays.sort(this.toString, i3, i + 1, this.values);
                    break;
                }
            } else {
                break;
            }
        }
        this.valueOf = this.ah$a;
        this.ag$a = (T) AsyncListUtil.ViewCallback.ag$a(this.toString[i2]);
        while (true) {
            i2++;
            if (i2 >= this.ah$a) {
                return;
            }
            if (this.values.compare((Object) AsyncListUtil.ViewCallback.ag$a(this.toString[i2]), (Object) AsyncListUtil.ViewCallback.ag$a(this.ag$a)) > 0) {
                this.ag$a = this.toString[i2];
            }
        }
    }

    private int ag$a(int i, int i2, int i3) {
        Object ag$a = AsyncListUtil.ViewCallback.ag$a(this.toString[i3]);
        T[] tArr = this.toString;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.values.compare((Object) AsyncListUtil.ViewCallback.ag$a(this.toString[i]), ag$a) < 0) {
                ah$a(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.toString;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = ag$a;
        return i4;
    }

    private void ah$a(int i, int i2) {
        T[] tArr = this.toString;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    public void ah$a(Iterator<? extends T> it) {
        while (it.hasNext()) {
            values(it.next());
        }
    }

    public List<T> ag$a() {
        Arrays.sort(this.toString, 0, this.valueOf, this.values);
        int i = this.valueOf;
        int i2 = this.ah$a;
        if (i > i2) {
            T[] tArr = this.toString;
            Arrays.fill(tArr, i2, tArr.length, (Object) null);
            int i3 = this.ah$a;
            this.valueOf = i3;
            this.ag$a = this.toString[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.toString, this.valueOf)));
    }
}
