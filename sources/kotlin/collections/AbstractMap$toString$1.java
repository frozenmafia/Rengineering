package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.calculateMaxDistance;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class AbstractMap$toString$1 extends Lambda implements Styleable.ChangeBounds<Map.Entry<? extends K, ? extends V>, CharSequence> {
    final /* synthetic */ calculateMaxDistance<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractMap$toString$1(calculateMaxDistance<K, ? extends V> calculatemaxdistance) {
        super(1);
        this.this$0 = calculatemaxdistance;
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(Map.Entry<? extends K, ? extends V> entry) {
        String values;
        runAnimators.ag$a(entry, "it");
        values = this.this$0.values(entry);
        return values;
    }
}
