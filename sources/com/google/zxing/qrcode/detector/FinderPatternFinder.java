package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;
import o.clearBindings;
/* loaded from: classes7.dex */
public class FinderPatternFinder {

    /* loaded from: classes7.dex */
    static final class FurthestFromAverageComparator implements Serializable, Comparator<clearBindings> {
        private final float average;

        private FurthestFromAverageComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(clearBindings clearbindings, clearBindings clearbindings2) {
            return Float.compare(Math.abs(clearbindings2.values() - this.average), Math.abs(clearbindings.values() - this.average));
        }
    }

    /* loaded from: classes7.dex */
    static final class CenterComparator implements Serializable, Comparator<clearBindings> {
        private final float average;

        private CenterComparator(float f) {
            this.average = f;
        }

        @Override // java.util.Comparator
        public int compare(clearBindings clearbindings, clearBindings clearbindings2) {
            int compare = Integer.compare(clearbindings2.valueOf(), clearbindings.valueOf());
            return compare == 0 ? Float.compare(Math.abs(clearbindings.values() - this.average), Math.abs(clearbindings2.values() - this.average)) : compare;
        }
    }
}
