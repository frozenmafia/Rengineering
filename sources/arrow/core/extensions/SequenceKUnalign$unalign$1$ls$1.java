package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.postMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SequenceKUnalign$unalign$1$ls$1 extends Lambda implements Styleable.ChangeBounds<postMessage<? extends A, ? extends B>, ICustomTabsService.Stub.Proxy<? extends A>> {
    public static final SequenceKUnalign$unalign$1$ls$1 INSTANCE = new SequenceKUnalign$unalign$1$ls$1();

    SequenceKUnalign$unalign$1$ls$1() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<A> invoke(postMessage<? extends A, ? extends B> postmessage) {
        runAnimators.valueOf(postmessage, "it");
        return postmessage.ag$a();
    }
}
