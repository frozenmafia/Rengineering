package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import o.PropertyValuesHolderUtils;
import o.VectorDrawableCompat;
import o.applyAlpha;
import o.getPatternPath;
import o.readSize;
/* loaded from: classes7.dex */
public final class DebuggerInfo implements Serializable {
    private final Long coroutineId;
    private final String dispatcher;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final String lastObservedThreadName;
    private final String lastObservedThreadState;
    private final String name;
    private final long sequenceNumber;
    private final String state;

    public DebuggerInfo(readSize readsize, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        Thread.State state;
        applyAlpha applyalpha = (applyAlpha) propertyValuesHolderUtils.get(applyAlpha.values);
        this.coroutineId = applyalpha != null ? Long.valueOf(applyalpha.ah$a()) : null;
        getPatternPath getpatternpath = (getPatternPath) propertyValuesHolderUtils.get(getPatternPath.ag$a);
        this.dispatcher = getpatternpath != null ? getpatternpath.toString() : null;
        VectorDrawableCompat vectorDrawableCompat = (VectorDrawableCompat) propertyValuesHolderUtils.get(VectorDrawableCompat.toString);
        this.name = vectorDrawableCompat != null ? vectorDrawableCompat.ag$a() : null;
        this.state = readsize.invoke();
        Thread thread = readsize.ag$a;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = readsize.ag$a;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = readsize.HaptikSDK$b();
        this.sequenceNumber = readsize.valueOf;
    }

    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    public final String getDispatcher() {
        return this.dispatcher;
    }

    public final String getName() {
        return this.name;
    }

    public final String getState() {
        return this.state;
    }

    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }
}
