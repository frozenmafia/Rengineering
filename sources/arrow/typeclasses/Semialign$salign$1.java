package arrow.typeclasses;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import o.IPostMessageService;
import o.Styleable;
import o.isCaptioningEnabled;
import o.postMessage;
import o.postMessage$ag$a;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Semialign$salign$1 extends Lambda implements Styleable.ChangeBounds<postMessage<? extends A, ? extends A>, A> {
    final /* synthetic */ isCaptioningEnabled $SG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Semialign$salign$1(isCaptioningEnabled iscaptioningenabled) {
        super(1);
        this.$SG = iscaptioningenabled;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((postMessage<? extends Object, ? extends Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [A, java.lang.Object] */
    public final A invoke(postMessage<? extends A, ? extends A> postmessage) {
        Object values;
        runAnimators.valueOf(postmessage, "it");
        if (postmessage instanceof postMessage.toString) {
            values = ((postMessage.toString) postmessage).valueOf();
        } else if (!(postmessage instanceof postMessage$ag$a)) {
            if (postmessage instanceof postMessage.valueOf) {
                postMessage.valueOf valueof = (postMessage.valueOf) postmessage;
                return this.$SG.ah$a(valueof.values(), valueof.valueOf());
            }
            throw new NoWhenBranchMatchedException();
        } else {
            values = ((postMessage$ag$a) postmessage).values();
        }
        return IPostMessageService.toString(values);
    }
}
