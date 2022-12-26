package arrow.core.extensions;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.IPostMessageService;
import o.Styleable;
import o.invalidateChildInParent;
/* loaded from: classes6.dex */
public final class SequenceKAlternative$some$1 extends Lambda implements Styleable.ChangeBounds<A, ICustomTabsService.Stub<? extends A>> {
    public static final SequenceKAlternative$some$1 INSTANCE = new SequenceKAlternative$some$1();

    SequenceKAlternative$some$1() {
        super(1);
    }

    /* loaded from: classes6.dex */
    public static final class valueOf implements invalidateChildInParent<A> {
        final /* synthetic */ Object valueOf;

        public valueOf(Object obj) {
            this.valueOf = obj;
        }

        @Override // o.invalidateChildInParent
        public Iterator<A> iterator() {
            return new SequenceKAlternative$some$1$valueOf$ag$a(this);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SequenceKAlternative$some$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub<A> invoke(A a) {
        return IPostMessageService.Stub.Proxy.ah$a(new valueOf(a));
    }
}
