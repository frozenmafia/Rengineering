package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onPostMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AndThen$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super B, ? extends C>, onPostMessage<A, C>> {
    final /* synthetic */ onPostMessage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndThen$ap$1(onPostMessage onpostmessage) {
        super(1);
        this.this$0 = onpostmessage;
    }

    @Override // o.Styleable.ChangeBounds
    public final onPostMessage<A, C> invoke(Styleable.ChangeBounds<? super B, ? extends C> changeBounds) {
        runAnimators.valueOf(changeBounds, "f");
        return this.this$0.toString(changeBounds);
    }
}
