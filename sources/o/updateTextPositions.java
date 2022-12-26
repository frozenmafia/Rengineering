package o;

import kotlinx.coroutines.flow.internal.AbortFlowException;
/* loaded from: classes7.dex */
public final class updateTextPositions {
    public static final void ag$a(AbortFlowException abortFlowException, writeCharArray<?> writechararray) {
        if (abortFlowException.owner != writechararray) {
            throw abortFlowException;
        }
    }
}
