package o;

import com.sendbird.android.constant.StringSet;
import o.PropertyValuesHolderUtils;
/* loaded from: classes5.dex */
public abstract class ofPointF implements PropertyValuesHolderUtils.toString {
    private final PropertyValuesHolderUtils.valueOf<?> key;

    public ofPointF(PropertyValuesHolderUtils.valueOf<?> valueof) {
        runAnimators.ag$a(valueof, StringSet.key);
        this.key = valueof;
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
        return this.key;
    }
}
