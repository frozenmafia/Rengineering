package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityCallback;
import o.Styleable;
/* loaded from: classes6.dex */
public final class OptionKt$traverse$1$2$1 extends Lambda implements Styleable.ChangeBounds<B, ITrustedWebActivityCallback<? extends B>> {
    public static final OptionKt$traverse$1$2$1 INSTANCE = new OptionKt$traverse$1$2$1();

    OptionKt$traverse$1$2$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((OptionKt$traverse$1$2$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityCallback<B> invoke(B b2) {
        return new ITrustedWebActivityCallback<>(b2);
    }
}
