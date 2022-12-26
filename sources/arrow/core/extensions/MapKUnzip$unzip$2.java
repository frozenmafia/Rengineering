package arrow.core.extensions;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.requestPostMessageChannelWithExtras;
import o.runAnimators;
import o.updateVisuals;
/* loaded from: classes6.dex */
public final class MapKUnzip$unzip$2 extends Lambda implements Styleable.ChangeBounds<Map<K, ? extends A>, requestPostMessageChannelWithExtras<K, ? extends A>> {
    public static final MapKUnzip$unzip$2 INSTANCE = new MapKUnzip$unzip$2();

    MapKUnzip$unzip$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final requestPostMessageChannelWithExtras<K, A> invoke(Map<K, ? extends A> map) {
        runAnimators.valueOf(map, "it");
        return updateVisuals.values(map);
    }
}
