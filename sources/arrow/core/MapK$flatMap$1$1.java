package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
/* loaded from: classes6.dex */
public final class MapK$flatMap$1$1 extends Lambda implements Styleable.ChangeBounds<B, cancel<? extends K, ? extends B>> {
    final /* synthetic */ Object $k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapK$flatMap$1$1(Object obj) {
        super(1);
        this.$k = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((MapK$flatMap$1$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<K, B> invoke(B b2) {
        return new cancel<>(this.$k, b2);
    }
}
