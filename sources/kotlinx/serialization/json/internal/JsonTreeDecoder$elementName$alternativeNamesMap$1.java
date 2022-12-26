package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.FragmentStateAdapter;
import o.SpecificationComputer;
import o.Styleable;
/* loaded from: classes5.dex */
public final /* synthetic */ class JsonTreeDecoder$elementName$alternativeNamesMap$1 extends FunctionReferenceImpl implements Styleable.ArcMotion<Map<String, ? extends Integer>> {
    public JsonTreeDecoder$elementName$alternativeNamesMap$1(Object obj) {
        super(0, obj, SpecificationComputer.class, "buildAlternativeNamesMap", "buildAlternativeNamesMap(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", 1);
    }

    @Override // o.Styleable.ArcMotion
    public final Map<String, ? extends Integer> invoke() {
        return SpecificationComputer.toString((FragmentStateAdapter.DataSetChangeObserver) this.receiver);
    }
}
