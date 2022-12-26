package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.extraCommand;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class Function1$ap$1 extends Lambda implements Styleable.ChangeBounds<Styleable.ChangeBounds<? super O, ? extends B>, extraCommand<I, ? extends B>> {
    final /* synthetic */ extraCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function1$ap$1(extraCommand extracommand) {
        super(1);
        this.this$0 = extracommand;
    }

    @Override // o.Styleable.ChangeBounds
    public final extraCommand<I, B> invoke(Styleable.ChangeBounds<? super O, ? extends B> changeBounds) {
        runAnimators.valueOf(changeBounds, "f");
        return this.this$0.toString(changeBounds);
    }
}
