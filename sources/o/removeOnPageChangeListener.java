package o;

import o.VectorDrawableCompat;
/* loaded from: classes5.dex */
public final class removeOnPageChangeListener {
    private final Object[] ag$a;
    private final VectorDrawableCompat.VectorDrawableDelegateState<Object>[] toString;
    public final PropertyValuesHolderUtils valueOf;
    private int values;

    public removeOnPageChangeListener(PropertyValuesHolderUtils propertyValuesHolderUtils, int i) {
        this.valueOf = propertyValuesHolderUtils;
        this.ag$a = new Object[i];
        this.toString = new VectorDrawableCompat.VectorDrawableDelegateState[i];
    }

    public final void valueOf(VectorDrawableCompat.VectorDrawableDelegateState<?> vectorDrawableDelegateState, Object obj) {
        Object[] objArr = this.ag$a;
        int i = this.values;
        objArr[i] = obj;
        VectorDrawableCompat.VectorDrawableDelegateState<Object>[] vectorDrawableDelegateStateArr = this.toString;
        this.values = i + 1;
        vectorDrawableDelegateStateArr[i] = vectorDrawableDelegateState;
    }

    public final void ag$a(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        int length = this.toString.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            VectorDrawableCompat.VectorDrawableDelegateState<Object> vectorDrawableDelegateState = this.toString[length];
            runAnimators.toString(vectorDrawableDelegateState);
            vectorDrawableDelegateState.ah$a(propertyValuesHolderUtils, this.ag$a[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
