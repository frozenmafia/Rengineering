package o;

import java.util.concurrent.ExecutorService;
import o.processAppeared;
/* loaded from: classes7.dex */
final /* synthetic */ class scrollStep implements setRecycleChildrenOnDetach {
    private final processAppeared.toString ag$a;
    private final ExecutorService toString;

    private scrollStep(ExecutorService executorService, processAppeared.toString tostring) {
        this.toString = executorService;
        this.ag$a = tostring;
    }

    public static setRecycleChildrenOnDetach values(ExecutorService executorService, processAppeared.toString tostring) {
        return new scrollStep(executorService, tostring);
    }

    @Override // o.setRecycleChildrenOnDetach
    public void ag$a(C0373getDy c0373getDy) {
        this.toString.execute(setAccessibilityDelegateCompat.values(this.ag$a, c0373getDy));
    }
}
