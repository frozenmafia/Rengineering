package o;

import android.util.SparseArray;
import com.appsamurai.storyly.exoplayer2.common.ParserException;
/* loaded from: classes3.dex */
public interface onTransitionPause {

    /* loaded from: classes3.dex */
    public interface values {
        onTransitionPause ag$a(int i, onTransitionPause$ag$a ontransitionpause_ag_a);

        SparseArray<onTransitionPause> ah$a();
    }

    void ag$a(C$default$setContentDescription c$default$setContentDescription, int i) throws ParserException;

    void ag$a(getCarrierFrequencyHz getcarrierfrequencyhz, markBefore markbefore, toString tostring);

    void ah$a();

    /* loaded from: classes3.dex */
    public static final class toString {
        private final int ag$a;
        private final int ah$a;
        private int toString;
        private final String valueOf;
        private String values;

        public toString(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public toString(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.valueOf = str;
            this.ag$a = i2;
            this.ah$a = i3;
            this.toString = Integer.MIN_VALUE;
            this.values = "";
        }

        public void valueOf() {
            int i = this.toString;
            this.toString = i == Integer.MIN_VALUE ? this.ag$a : i + this.ah$a;
            this.values = this.valueOf + this.toString;
        }

        public int values() {
            ag$a();
            return this.toString;
        }

        public String ah$a() {
            ag$a();
            return this.values;
        }

        private void ag$a() {
            if (this.toString == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
