package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import o.PropertyValuesHolderUtils;
import o.Styleable;
import o.dataSetChanged;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class OnUndeliveredElementKt$bindCancellationFun$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ PropertyValuesHolderUtils $context;
    final /* synthetic */ E $element;
    final /* synthetic */ Styleable.ChangeBounds<E, setAnimationMatrix> $this_bindCancellationFun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnUndeliveredElementKt$bindCancellationFun$1(Styleable.ChangeBounds<? super E, setAnimationMatrix> changeBounds, E e, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        super(1);
        this.$this_bindCancellationFun = changeBounds;
        this.$element = e;
        this.$context = propertyValuesHolderUtils;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        dataSetChanged.toString(this.$this_bindCancellationFun, this.$element, this.$context);
    }
}
