package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsService;
import o.Styleable;
import o.postMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SequenceKUnalign$unalign$1$rs$1 extends Lambda implements Styleable.ChangeBounds<postMessage<? extends A, ? extends B>, ICustomTabsService.Stub.Proxy<? extends B>> {
    public static final SequenceKUnalign$unalign$1$rs$1 INSTANCE = new SequenceKUnalign$unalign$1$rs$1();

    SequenceKUnalign$unalign$1$rs$1() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsService.Stub.Proxy<B> invoke(postMessage<? extends A, ? extends B> postmessage) {
        runAnimators.valueOf(postmessage, "it");
        return postmessage.ah$a();
    }
}
