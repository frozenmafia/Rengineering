package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.Styleable;
import o.cancel;
import o.postMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class MapKSemialign$align$1$1 extends Lambda implements Styleable.ChangeBounds<postMessage<? extends A, ? extends B>, cancel<? extends K, ? extends postMessage<? extends A, ? extends B>>> {
    final /* synthetic */ Object $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapKSemialign$align$1$1(Object obj) {
        super(1);
        this.$key = obj;
    }

    @Override // o.Styleable.ChangeBounds
    public final cancel<K, postMessage<A, B>> invoke(postMessage<? extends A, ? extends B> postmessage) {
        runAnimators.valueOf(postmessage, "it");
        return AudioAttributesImplApi21Parcelizer.ag$a(this.$key, postmessage);
    }
}
