package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addTransitionInternal;
import o.fetchDrawMatrixField;
/* loaded from: classes7.dex */
final class CharDirectionality$Companion$directionalityMap$2 extends Lambda implements Styleable.ArcMotion<Map<Integer, ? extends CharDirectionality>> {
    public static final CharDirectionality$Companion$directionalityMap$2 INSTANCE = new CharDirectionality$Companion$directionalityMap$2();

    CharDirectionality$Companion$directionalityMap$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final Map<Integer, ? extends CharDirectionality> invoke() {
        CharDirectionality[] values = CharDirectionality.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(addTransitionInternal.ah$a(fetchDrawMatrixField.toString(values.length), 16));
        for (CharDirectionality charDirectionality : values) {
            linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
        }
        return linkedHashMap;
    }
}
