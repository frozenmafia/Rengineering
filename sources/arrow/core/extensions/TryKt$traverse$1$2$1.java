package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ITrustedWebActivityService;
import o.Styleable;
/* loaded from: classes6.dex */
public final class TryKt$traverse$1$2$1 extends Lambda implements Styleable.ChangeBounds<B, ITrustedWebActivityService<? extends B>> {
    public static final TryKt$traverse$1$2$1 INSTANCE = new TryKt$traverse$1$2$1();

    TryKt$traverse$1$2$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((TryKt$traverse$1$2$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ITrustedWebActivityService<B> invoke(B b2) {
        return ITrustedWebActivityService.toString.valueOf(b2);
    }
}
