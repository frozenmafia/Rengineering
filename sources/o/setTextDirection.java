package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class setTextDirection {
    public final int ah$a;

    public static int ah$a(int i) {
        return (i >> 24) & 255;
    }

    public static int valueOf(int i) {
        return i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
    }

    public setTextDirection(int i) {
        this.ah$a = i;
    }

    public String toString() {
        return ag$a(this.ah$a);
    }

    /* loaded from: classes3.dex */
    static final class valueOf extends setTextDirection {
        public final List<valueOf> toString;
        public final long valueOf;
        public final List<setTextDirection$ag$a> values;

        public valueOf(int i, long j) {
            super(i);
            this.valueOf = j;
            this.values = new ArrayList();
            this.toString = new ArrayList();
        }

        public void ag$a(setTextDirection$ag$a settextdirection_ag_a) {
            this.values.add(settextdirection_ag_a);
        }

        public void toString(valueOf valueof) {
            this.toString.add(valueof);
        }

        public setTextDirection$ag$a values(int i) {
            int size = this.values.size();
            for (int i2 = 0; i2 < size; i2++) {
                setTextDirection$ag$a settextdirection_ag_a = this.values.get(i2);
                if (settextdirection_ag_a.ah$a == i) {
                    return settextdirection_ag_a;
                }
            }
            return null;
        }

        public valueOf toString(int i) {
            int size = this.toString.size();
            for (int i2 = 0; i2 < size; i2++) {
                valueOf valueof = this.toString.get(i2);
                if (valueof.ah$a == i) {
                    return valueof;
                }
            }
            return null;
        }

        @Override // o.setTextDirection
        public String toString() {
            return ag$a(this.ah$a) + " leaves: " + Arrays.toString(this.values.toArray()) + " containers: " + Arrays.toString(this.toString.toArray());
        }
    }

    public static String ag$a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }
}
