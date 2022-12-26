package arrow.core.extensions;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.requestPostMessageChannelWithExtras;
import o.runAnimators;
import o.updateVisuals;
/* loaded from: classes6.dex */
public final class MapKUnalign$unalign$1$3 extends Lambda implements Styleable.ChangeBounds<Map<K, ? extends B>, requestPostMessageChannelWithExtras<K, ? extends B>> {
    public static final MapKUnalign$unalign$1$3 INSTANCE = new MapKUnalign$unalign$1$3();

    MapKUnalign$unalign$1$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final requestPostMessageChannelWithExtras<K, B> invoke(Map<K, ? extends B> map) {
        runAnimators.valueOf(map, "it");
        return updateVisuals.values(map);
    }
}
