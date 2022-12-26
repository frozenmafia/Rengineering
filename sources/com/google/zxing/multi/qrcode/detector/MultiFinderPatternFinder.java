package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.io.Serializable;
import java.util.Comparator;
import o.clearBindings;
import o.simpleQueryForLong;
/* loaded from: classes7.dex */
final class MultiFinderPatternFinder extends FinderPatternFinder {
    private static final simpleQueryForLong[] ag$a = new simpleQueryForLong[0];

    /* loaded from: classes7.dex */
    static final class ModuleSizeComparator implements Serializable, Comparator<clearBindings> {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(clearBindings clearbindings, clearBindings clearbindings2) {
            double values = clearbindings2.values() - clearbindings.values();
            if (values < 0.0d) {
                return -1;
            }
            return values > 0.0d ? 1 : 0;
        }
    }
}
