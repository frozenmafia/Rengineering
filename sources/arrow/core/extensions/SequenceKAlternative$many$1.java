package arrow.core.extensions;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.Styleable;
import o.invalidateChildInParent;
/* loaded from: classes6.dex */
public final class SequenceKAlternative$many$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub<? extends A>> {
    public static final SequenceKAlternative$many$1 INSTANCE = new SequenceKAlternative$many$1();

    SequenceKAlternative$many$1() {
        super(1);
    }

    /* loaded from: classes6.dex */
    public static final class values implements invalidateChildInParent<A> {
        final /* synthetic */ Object ag$a;

        public values(Object obj) {
            this.ag$a = obj;
        }

        @Override // o.invalidateChildInParent
        public Iterator<A> iterator() {
            return new SequenceKAlternative$many$1$values$ah$a(this);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SequenceKAlternative$many$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub<A> invoke(A a) {
        return IPostMessageService.Stub.Proxy.ah$a(new values(a));
    }
}
