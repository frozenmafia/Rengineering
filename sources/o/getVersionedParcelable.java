package o;

import o.PropertyValuesHolderUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getVersionedParcelable implements PropertyValuesHolderUtils.toString, PropertyValuesHolderUtils.valueOf<getVersionedParcelable> {
    public static final getVersionedParcelable ag$a = new getVersionedParcelable();

    private getVersionedParcelable() {
    }

    @Override // o.PropertyValuesHolderUtils
    public <R> R fold(R r, Transition<? super R, ? super PropertyValuesHolderUtils.toString, ? extends R> transition) {
        return (R) PropertyValuesHolderUtils$toString$ah$a.values(this, r, transition);
    }

    @Override // o.PropertyValuesHolderUtils.toString, o.PropertyValuesHolderUtils
    public <E extends PropertyValuesHolderUtils.toString> E get(PropertyValuesHolderUtils.valueOf<E> valueof) {
        return (E) PropertyValuesHolderUtils$toString$ah$a.valueOf(this, valueof);
    }

    @Override // o.PropertyValuesHolderUtils
    public PropertyValuesHolderUtils minusKey(PropertyValuesHolderUtils.valueOf<?> valueof) {
        return PropertyValuesHolderUtils$toString$ah$a.ag$a(this, valueof);
    }

    @Override // o.PropertyValuesHolderUtils
    public PropertyValuesHolderUtils plus(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        return PropertyValuesHolderUtils$toString$ah$a.toString(this, propertyValuesHolderUtils);
    }

    @Override // o.PropertyValuesHolderUtils.toString
    public PropertyValuesHolderUtils.valueOf<?> getKey() {
        return this;
    }
}
