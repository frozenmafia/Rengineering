package o;

import com.google.crypto.tink.shaded.protobuf.MapFieldLite;
import java.util.Map;
/* loaded from: classes7.dex */
class scrollIfNecessary implements postDispatchSwipe {
    @Override // o.postDispatchSwipe
    public Map<?, ?> valueOf(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // o.postDispatchSwipe
    public findAnimation$ah$a<?, ?> ah$a(Object obj) {
        return ((findAnimation) obj).valueOf();
    }

    @Override // o.postDispatchSwipe
    public Map<?, ?> toString(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // o.postDispatchSwipe
    public boolean values(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }

    @Override // o.postDispatchSwipe
    public Object HaptikSDK$a(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // o.postDispatchSwipe
    public Object ag$a(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // o.postDispatchSwipe
    public Object values(Object obj, Object obj2) {
        return valueOf(obj, obj2);
    }

    private static <K, V> MapFieldLite<K, V> valueOf(Object obj, Object obj2) {
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

    @Override // o.postDispatchSwipe
    public int valueOf(int i, Object obj, Object obj2) {
        return values(i, obj, obj2);
    }

    private static <K, V> int values(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        findAnimation findanimation = (findAnimation) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            i2 += findanimation.values(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }
}
