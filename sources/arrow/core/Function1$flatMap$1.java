package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.ICustomTabsService;
import o.Styleable;
import o.extraCommand;
/* loaded from: classes6.dex */
public final class Function1$flatMap$1 extends Lambda implements Styleable.ChangeBounds<I, B> {
    final /* synthetic */ Styleable.ChangeBounds $f;
    final /* synthetic */ extraCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function1$flatMap$1(extraCommand extracommand, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.this$0 = extracommand;
        this.$f = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [B, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final B invoke(I i) {
        return ICustomTabsService.valueOf((ICustomTabsCallback.Default) this.$f.invoke(this.this$0.values().invoke(i)), i);
    }
}
