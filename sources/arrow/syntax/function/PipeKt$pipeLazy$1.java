package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class PipeKt$pipeLazy$1 extends Lambda implements Styleable.ArcMotion<R> {
    final /* synthetic */ Styleable.ChangeBounds $t;
    final /* synthetic */ Object $this_pipeLazy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeKt$pipeLazy$1(Object obj, Styleable.ChangeBounds changeBounds) {
        super(0);
        this.$this_pipeLazy = obj;
        this.$t = changeBounds;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ArcMotion
    public final R invoke() {
        return this.$t.invoke(this.$this_pipeLazy);
    }
}
