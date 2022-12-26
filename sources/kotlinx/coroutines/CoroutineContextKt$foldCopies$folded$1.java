package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.initCubic;
/* loaded from: classes5.dex */
public final class CoroutineContextKt$foldCopies$folded$1 extends Lambda implements Transition<PropertyValuesHolderUtils, PropertyValuesHolderUtils.toString, PropertyValuesHolderUtils> {
    final /* synthetic */ boolean $isNewCoroutine;
    final /* synthetic */ Ref.ObjectRef<PropertyValuesHolderUtils> $leftoverContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineContextKt$foldCopies$folded$1(Ref.ObjectRef<PropertyValuesHolderUtils> objectRef, boolean z) {
        super(2);
        this.$leftoverContext = objectRef;
        this.$isNewCoroutine = z;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, o.PropertyValuesHolderUtils] */
    @Override // o.Transition
    public final PropertyValuesHolderUtils invoke(PropertyValuesHolderUtils propertyValuesHolderUtils, PropertyValuesHolderUtils.toString tostring) {
        if (tostring instanceof initCubic) {
            PropertyValuesHolderUtils.toString tostring2 = this.$leftoverContext.element.get(tostring.getKey());
            if (tostring2 == null) {
                initCubic initcubic = (initCubic) tostring;
                if (this.$isNewCoroutine) {
                    initcubic = initcubic.ag$a();
                }
                return propertyValuesHolderUtils.plus(initcubic);
            }
            Ref.ObjectRef<PropertyValuesHolderUtils> objectRef = this.$leftoverContext;
            objectRef.element = objectRef.element.minusKey(tostring.getKey());
            return propertyValuesHolderUtils.plus(((initCubic) tostring).ag$a(tostring2));
        }
        return propertyValuesHolderUtils.plus(tostring);
    }
}
