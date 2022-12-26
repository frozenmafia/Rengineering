package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            if (arrayList == null || (arrayList != null && arrayList.contains(chainHead.mFirst))) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r2.mHorizontalChainStyle == 2) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (r2.mVerticalChainStyle == 2) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        r15 = r14;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
        r15 = r14;
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r36, androidx.constraintlayout.solver.LinearSystem r37, int r38, int r39, androidx.constraintlayout.solver.widgets.ChainHead r40) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):void");
    }
}
