package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SequenceK$filterMap$2 extends Lambda implements Styleable.ChangeBounds<ICustomTabsService.Stub.Proxy<? extends B>, B> {
    public static final SequenceK$filterMap$2 INSTANCE = new SequenceK$filterMap$2();

    SequenceK$filterMap$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ICustomTabsService.Stub.Proxy<? extends Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
    public final B invoke(ICustomTabsService.Stub.Proxy<? extends B> proxy) {
        runAnimators.valueOf(proxy, "it");
        ?? valueOf = proxy.valueOf();
        if (valueOf == 0) {
            runAnimators.values();
        }
        return valueOf;
    }
}
