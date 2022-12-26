package kotlin.coroutines;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.PropertyValuesHolderUtils;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
final class CombinedContext$writeReplace$1 extends Lambda implements Transition<setAnimationMatrix, PropertyValuesHolderUtils.toString, setAnimationMatrix> {
    final /* synthetic */ PropertyValuesHolderUtils[] $elements;
    final /* synthetic */ Ref.IntRef $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedContext$writeReplace$1(PropertyValuesHolderUtils[] propertyValuesHolderUtilsArr, Ref.IntRef intRef) {
        super(2);
        this.$elements = propertyValuesHolderUtilsArr;
        this.$index = intRef;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(setAnimationMatrix setanimationmatrix, PropertyValuesHolderUtils.toString tostring) {
        invoke2(setanimationmatrix, tostring);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(setAnimationMatrix setanimationmatrix, PropertyValuesHolderUtils.toString tostring) {
        runAnimators.ag$a(setanimationmatrix, "<anonymous parameter 0>");
        runAnimators.ag$a(tostring, "element");
        PropertyValuesHolderUtils[] propertyValuesHolderUtilsArr = this.$elements;
        int i = this.$index.element;
        this.$index.element = i + 1;
        propertyValuesHolderUtilsArr[i] = tostring;
    }
}
