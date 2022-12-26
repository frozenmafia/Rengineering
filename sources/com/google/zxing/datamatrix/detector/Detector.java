package com.google.zxing.datamatrix.detector;

import java.io.Serializable;
import java.util.Comparator;
import o.lambda$setVersion$1;
/* loaded from: classes7.dex */
public final class Detector {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString {
        private final int ah$a;
        private final lambda$setVersion$1 valueOf;
        private final lambda$setVersion$1 values;

        int valueOf() {
            return this.ah$a;
        }

        public String toString() {
            return this.valueOf + "/" + this.values + '/' + this.ah$a;
        }
    }

    /* loaded from: classes7.dex */
    static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<toString> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(toString tostring, toString tostring2) {
            return tostring.valueOf() - tostring2.valueOf();
        }
    }
}
