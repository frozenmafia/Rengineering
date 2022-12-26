package o;

import kotlin.NoWhenBranchMatchedException;
import o.ICustomTabsCallback;
import o.Styleable;
import o.disconnect;
/* loaded from: classes6.dex */
public final class AudioAttributesImplApi26Parcelizer {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E, A, B> disconnect<E, B> ag$a(ICustomTabsCallback.Default<? extends ICustomTabsCallback.Default<Object, ? extends E>, ? extends A> r1, isCaptioningEnabled<E> iscaptioningenabled, disconnect<? extends E, ? extends Styleable.ChangeBounds<? super A, ? extends B>> disconnectVar) {
        disconnect<E, B> disconnect_ag_a;
        disconnect<E, B> disconnect_ag_a2;
        runAnimators.valueOf(r1, "$this$ap");
        runAnimators.valueOf(iscaptioningenabled, "SE");
        runAnimators.valueOf(disconnectVar, "f");
        disconnect disconnectVar2 = (disconnect) r1;
        if (disconnectVar2 instanceof disconnect.valueOf) {
            Object valueOf = ((disconnect.valueOf) disconnectVar2).valueOf();
            if (disconnectVar instanceof disconnect.valueOf) {
                disconnect_ag_a2 = new disconnect.valueOf<>(((Styleable.ChangeBounds) ((disconnect.valueOf) disconnectVar).valueOf()).invoke(valueOf));
            } else if (disconnectVar instanceof disconnect$ag$a) {
                disconnect_ag_a2 = new disconnect$ag$a<>(((disconnect$ag$a) disconnectVar).ah$a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            disconnect_ag_a = disconnect_ag_a2;
        } else if (!(disconnectVar2 instanceof disconnect$ag$a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            Object ah$a = ((disconnect$ag$a) disconnectVar2).ah$a();
            if (disconnectVar instanceof disconnect.valueOf) {
                Styleable.ChangeBounds changeBounds = (Styleable.ChangeBounds) ((disconnect.valueOf) disconnectVar).valueOf();
                disconnect_ag_a = new disconnect$ag$a(ah$a);
            } else if (disconnectVar instanceof disconnect$ag$a) {
                disconnect_ag_a = new disconnect$ag$a(iscaptioningenabled.ah$a(ah$a, ((disconnect$ag$a) disconnectVar).ah$a()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return disconnect_ag_a;
    }
}
