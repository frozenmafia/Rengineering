package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class MapK$ap2$1$2 extends Lambda implements Styleable.ChangeBounds<Z, cancel<? extends K, ? extends Z>> {
    final /* synthetic */ Object $k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapK$ap2$1$2(Object obj) {
        super(1);
        this.$k = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((MapK$ap2$1$2) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<K, Z> invoke(Z z) {
        return new cancel<>(this.$k, z);
    }
}
