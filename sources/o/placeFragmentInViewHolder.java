package o;

import java.lang.annotation.Annotation;
import java.util.List;
import o.FragmentStateAdapter;
/* loaded from: classes7.dex */
public final class placeFragmentInViewHolder<T> extends arePagesLaidOutContiguously<T> {
    private final setIdentityTransforms ah$a;
    private List<? extends Annotation> valueOf;
    private final copyViewImage<T> values;

    @Override // o.arePagesLaidOutContiguously
    public copyViewImage<T> valueOf() {
        return this.values;
    }

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return (FragmentStateAdapter.DataSetChangeObserver) this.ah$a.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + valueOf() + ')';
    }
}
