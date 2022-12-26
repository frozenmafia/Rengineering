package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.Transition;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListK$lpadZipWith$1 extends Lambda implements Transition<ICustomTabsService.Stub.Proxy<? extends A>, ICustomTabsService.Stub.Proxy<? extends B>, ICustomTabsService.Stub.Proxy<? extends C>> {
    final /* synthetic */ Transition $fab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListK$lpadZipWith$1(Transition transition) {
        super(2);
        this.$fab = transition;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.ListK$lpadZipWith$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, C> {
        final /* synthetic */ ICustomTabsService.Stub.Proxy $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ICustomTabsService.Stub.Proxy proxy) {
            super(1);
            this.$a = proxy;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [C, java.lang.Object] */
        @Override // o.Styleable.ChangeBounds
        public final C invoke(B b2) {
            return ListK$lpadZipWith$1.this.$fab.invoke(this.$a, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Transition
    public final ICustomTabsService.Stub.Proxy<C> invoke(ICustomTabsService.Stub.Proxy<? extends A> proxy, ICustomTabsService.Stub.Proxy<? extends B> proxy2) {
        runAnimators.valueOf(proxy, "a");
        runAnimators.valueOf(proxy2, "b");
        return proxy2.ag$a(new AnonymousClass1(proxy));
    }
}
