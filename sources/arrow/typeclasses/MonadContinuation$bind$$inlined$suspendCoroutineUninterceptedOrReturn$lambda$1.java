package arrow.typeclasses;

import java.util.List;
import kotlin.Result;
import kotlin.Result$ah$a;
import kotlin.jvm.internal.Lambda;
import o.ICustomTabsCallback;
import o.IMediaSession;
import o.Styleable;
import o.onQueueChanged;
import o.setPatternPath;
/* loaded from: classes6.dex */
public final class MonadContinuation$bind$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 extends Lambda implements Styleable.ChangeBounds<B, ICustomTabsCallback.Default<? extends F, ? extends A>> {
    final /* synthetic */ setPatternPath $c;
    final /* synthetic */ List $labelHere;
    final /* synthetic */ ICustomTabsCallback.Default $this_bind$inlined;
    final /* synthetic */ IMediaSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonadContinuation$bind$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1(setPatternPath setpatternpath, List list, IMediaSession iMediaSession, ICustomTabsCallback.Default r4) {
        super(1);
        this.$c = setpatternpath;
        this.$labelHere = list;
        this.this$0 = iMediaSession;
        this.$this_bind$inlined = r4;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((MonadContinuation$bind$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final ICustomTabsCallback.Default<F, A> invoke(B b2) {
        onQueueChanged.toString(this.$c, this.$labelHere);
        setPatternPath setpatternpath = this.$c;
        Result$ah$a result$ah$a = Result.Companion;
        setpatternpath.resumeWith(Result.m1233constructorimpl(b2));
        return this.this$0.values();
    }
}
