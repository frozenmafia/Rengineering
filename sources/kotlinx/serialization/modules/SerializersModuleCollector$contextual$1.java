package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.containsItem;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class SerializersModuleCollector$contextual$1 extends Lambda implements Styleable.ChangeBounds<List<? extends containsItem<?>>, containsItem<?>> {
    final /* synthetic */ containsItem<T> $serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializersModuleCollector$contextual$1(containsItem<T> containsitem) {
        super(1);
        this.$serializer = containsitem;
    }

    @Override // o.Styleable.ChangeBounds
    public final containsItem<?> invoke(List<? extends containsItem<?>> list) {
        runAnimators.ag$a(list, "it");
        return this.$serializer;
    }
}
