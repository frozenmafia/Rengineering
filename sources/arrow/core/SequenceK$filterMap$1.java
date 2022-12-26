package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SequenceK$filterMap$1 extends Lambda implements Styleable.ChangeBounds<ICustomTabsService.Stub.Proxy<? extends B>, Boolean> {
    public static final SequenceK$filterMap$1 INSTANCE = new SequenceK$filterMap$1();

    SequenceK$filterMap$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(invoke((ICustomTabsService.Stub.Proxy) obj));
    }

    public final boolean invoke(ICustomTabsService.Stub.Proxy<? extends B> proxy) {
        runAnimators.valueOf(proxy, "it");
        return proxy.values();
    }
}
