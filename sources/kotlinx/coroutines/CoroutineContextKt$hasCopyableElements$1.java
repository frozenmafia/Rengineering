package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.initCubic;
/* loaded from: classes5.dex */
public final class CoroutineContextKt$hasCopyableElements$1 extends Lambda implements Transition<Boolean, PropertyValuesHolderUtils.toString, Boolean> {
    public static final CoroutineContextKt$hasCopyableElements$1 INSTANCE = new CoroutineContextKt$hasCopyableElements$1();

    CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    public final Boolean invoke(boolean z, PropertyValuesHolderUtils.toString tostring) {
        return Boolean.valueOf(z || (tostring instanceof initCubic));
    }

    @Override // o.Transition
    public /* synthetic */ Boolean invoke(Boolean bool, PropertyValuesHolderUtils.toString tostring) {
        return invoke(bool.booleanValue(), tostring);
    }
}
