package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.FailedSpecification;
import o.FragmentStateAdapter;
import o.Transition;
import o.runAnimators;
/* loaded from: classes5.dex */
public final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements Transition<FragmentStateAdapter.DataSetChangeObserver, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, FailedSpecification.WhenMappings.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i) {
        boolean valueOf;
        runAnimators.ag$a(dataSetChangeObserver, "p0");
        valueOf = ((FailedSpecification.WhenMappings) this.receiver).valueOf(dataSetChangeObserver, i);
        return Boolean.valueOf(valueOf);
    }

    @Override // o.Transition
    public /* synthetic */ Boolean invoke(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, Integer num) {
        return invoke(dataSetChangeObserver, num.intValue());
    }
}
