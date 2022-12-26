package o;

import com.google.protobuf.MapFieldLite;
import java.util.Map;
import o.popFromPreLayout;
/* loaded from: classes5.dex */
class onViewDetached implements popFromPostLayout {
    @Override // o.popFromPostLayout
    public Map<?, ?> ah$a(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // o.popFromPostLayout
    public popFromPreLayout.toString<?, ?> ag$a(Object obj) {
        return ((popFromPreLayout) obj).ag$a();
    }

    @Override // o.popFromPostLayout
    public Map<?, ?> values(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // o.popFromPostLayout
    public boolean toString(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }

    @Override // o.popFromPostLayout
    public Object HaptikSDK$c(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // o.popFromPostLayout
    public Object valueOf(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // o.popFromPostLayout
    public Object ag$a(Object obj, Object obj2) {
        return toString(obj, obj2);
    }

    private static <K, V> MapFieldLite<K, V> toString(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // o.popFromPostLayout
    public int toString(int i, Object obj, Object obj2) {
        return values(i, obj, obj2);
    }

    private static <K, V> int values(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        popFromPreLayout popfromprelayout = (popFromPreLayout) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            i2 += popfromprelayout.valueOf(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }
}
