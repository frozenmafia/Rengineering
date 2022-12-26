package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Styleable;
import o.parseInterpolatorFromTypeArray;
/* loaded from: classes5.dex */
public final class CoroutineDispatcher$Key$1 extends Lambda implements Styleable.ChangeBounds<PropertyValuesHolderUtils.toString, parseInterpolatorFromTypeArray> {
    public static final CoroutineDispatcher$Key$1 INSTANCE = new CoroutineDispatcher$Key$1();

    CoroutineDispatcher$Key$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final parseInterpolatorFromTypeArray invoke(PropertyValuesHolderUtils.toString tostring) {
        if (tostring instanceof parseInterpolatorFromTypeArray) {
            return (parseInterpolatorFromTypeArray) tostring;
        }
        return null;
    }
}
