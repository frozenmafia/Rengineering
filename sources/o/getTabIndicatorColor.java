package o;

import o.PropertyValuesHolderUtils;
/* loaded from: classes7.dex */
public final class getTabIndicatorColor implements PropertyValuesHolderUtils {
    private final /* synthetic */ PropertyValuesHolderUtils ah$a;
    public final Throwable valueOf;

    @Override // o.PropertyValuesHolderUtils
    public <R> R fold(R r, Transition<? super R, ? super PropertyValuesHolderUtils.toString, ? extends R> transition) {
        return (R) this.ah$a.fold(r, transition);
    }

    @Override // o.PropertyValuesHolderUtils
    public <E extends PropertyValuesHolderUtils.toString> E get(PropertyValuesHolderUtils.valueOf<E> valueof) {
        return (E) this.ah$a.get(valueof);
    }

    @Override // o.PropertyValuesHolderUtils
    public PropertyValuesHolderUtils minusKey(PropertyValuesHolderUtils.valueOf<?> valueof) {
        return this.ah$a.minusKey(valueof);
    }

    @Override // o.PropertyValuesHolderUtils
    public PropertyValuesHolderUtils plus(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        return this.ah$a.plus(propertyValuesHolderUtils);
    }

    public getTabIndicatorColor(Throwable th, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        this.valueOf = th;
        this.ah$a = propertyValuesHolderUtils;
    }
}
