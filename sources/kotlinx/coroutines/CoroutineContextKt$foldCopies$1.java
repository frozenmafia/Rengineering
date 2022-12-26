package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.initCubic;
/* loaded from: classes5.dex */
public final class CoroutineContextKt$foldCopies$1 extends Lambda implements Transition<PropertyValuesHolderUtils, PropertyValuesHolderUtils.toString, PropertyValuesHolderUtils> {
    public static final CoroutineContextKt$foldCopies$1 INSTANCE = new CoroutineContextKt$foldCopies$1();

    CoroutineContextKt$foldCopies$1() {
        super(2);
    }

    @Override // o.Transition
    public final PropertyValuesHolderUtils invoke(PropertyValuesHolderUtils propertyValuesHolderUtils, PropertyValuesHolderUtils.toString tostring) {
        if (tostring instanceof initCubic) {
            return propertyValuesHolderUtils.plus(((initCubic) tostring).ag$a());
        }
        return propertyValuesHolderUtils.plus(tostring);
    }
}
