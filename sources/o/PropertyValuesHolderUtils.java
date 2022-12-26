package o;
/* loaded from: classes5.dex */
public interface PropertyValuesHolderUtils {

    /* loaded from: classes5.dex */
    public interface toString extends PropertyValuesHolderUtils {
        @Override // o.PropertyValuesHolderUtils
        <E extends toString> E get(valueOf<E> valueof);

        valueOf<?> getKey();
    }

    /* loaded from: classes5.dex */
    public interface valueOf<E extends toString> {
    }

    <R> R fold(R r, Transition<? super R, ? super toString, ? extends R> transition);

    <E extends toString> E get(valueOf<E> valueof);

    PropertyValuesHolderUtils minusKey(valueOf<?> valueof);

    PropertyValuesHolderUtils plus(PropertyValuesHolderUtils propertyValuesHolderUtils);
}
