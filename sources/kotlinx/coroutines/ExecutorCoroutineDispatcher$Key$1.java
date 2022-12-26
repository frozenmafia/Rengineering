package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Styleable;
import o.setTrimPathEnd;
/* loaded from: classes5.dex */
public final class ExecutorCoroutineDispatcher$Key$1 extends Lambda implements Styleable.ChangeBounds<PropertyValuesHolderUtils.toString, setTrimPathEnd> {
    public static final ExecutorCoroutineDispatcher$Key$1 INSTANCE = new ExecutorCoroutineDispatcher$Key$1();

    ExecutorCoroutineDispatcher$Key$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final setTrimPathEnd invoke(PropertyValuesHolderUtils.toString tostring) {
        if (tostring instanceof setTrimPathEnd) {
            return (setTrimPathEnd) tostring;
        }
        return null;
    }
}
