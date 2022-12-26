package androidx.lifecycle;

import o.PropertyValuesHolderUtils;
import o.drawPath;
import o.parseInterpolatorFromTypeArray;
import o.runAnimators;
import o.sortChildDrawingOrder;
/* loaded from: classes6.dex */
public final class PausingDispatcher extends parseInterpolatorFromTypeArray {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // o.parseInterpolatorFromTypeArray
    public boolean isDispatchNeeded(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        drawPath drawpath;
        runAnimators.ag$a(propertyValuesHolderUtils, "context");
        drawpath = sortChildDrawingOrder.toString;
        if (drawpath.valueOf().isDispatchNeeded(propertyValuesHolderUtils)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }

    @Override // o.parseInterpolatorFromTypeArray
    public void dispatch(PropertyValuesHolderUtils propertyValuesHolderUtils, Runnable runnable) {
        runAnimators.ag$a(propertyValuesHolderUtils, "context");
        runAnimators.ag$a(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(propertyValuesHolderUtils, runnable);
    }
}
