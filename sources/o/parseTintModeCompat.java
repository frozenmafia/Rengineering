package o;

import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes5.dex */
public final class parseTintModeCompat {
    public static final void toString(PropertyValuesHolderUtils propertyValuesHolderUtils, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) propertyValuesHolderUtils.get(CoroutineExceptionHandler.toString);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(propertyValuesHolderUtils, th);
            } else {
                initQuad.valueOf(propertyValuesHolderUtils, th);
            }
        } catch (Throwable th2) {
            initQuad.valueOf(propertyValuesHolderUtils, toString(th, th2));
        }
    }

    public static final Throwable toString(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ChangeScroll.toString(runtimeException, th);
        return runtimeException;
    }
}
