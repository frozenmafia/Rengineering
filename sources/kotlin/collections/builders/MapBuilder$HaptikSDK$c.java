package kotlin.collections.builders;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.MapBuilder;
import o.createCustom;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class MapBuilder$HaptikSDK$c<K, V> extends MapBuilder.toString<K, V> implements Iterator<V>, createCustom {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapBuilder$HaptikSDK$c(MapBuilder<K, V> mapBuilder) {
        super(mapBuilder);
        runAnimators.ag$a(mapBuilder, "map");
    }

    @Override // java.util.Iterator
    public V next() {
        if (values() >= ((MapBuilder) invoke()).length) {
            throw new NoSuchElementException();
        }
        int values = values();
        values(values + 1);
        ah$a(values);
        Object[] objArr = ((MapBuilder) invoke()).valuesArray;
        runAnimators.toString(objArr);
        V v = (V) objArr[valueOf()];
        HaptikSDK$a();
        return v;
    }
}
