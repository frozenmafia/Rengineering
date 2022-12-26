package arrow.syntax.function;

import kotlin.jvm.internal.Lambda;
import o.RemoteActionCompatParcelizer;
import o.Styleable;
import o.excludeId;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class TuplingKt$tupled$4 extends Lambda implements Styleable.ChangeBounds<RemoteActionCompatParcelizer<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>, R> {
    final /* synthetic */ excludeId $this_tupled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TuplingKt$tupled$4(excludeId excludeid) {
        super(1);
        this.$this_tupled = excludeid;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [R, java.lang.Object] */
    @Override // o.Styleable.ChangeBounds
    public final R invoke(RemoteActionCompatParcelizer<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> remoteActionCompatParcelizer) {
        runAnimators.valueOf(remoteActionCompatParcelizer, "<name for destructuring parameter 0>");
        return this.$this_tupled.invoke(remoteActionCompatParcelizer.ag$a(), remoteActionCompatParcelizer.ah$a(), remoteActionCompatParcelizer.values(), remoteActionCompatParcelizer.valueOf(), remoteActionCompatParcelizer.invoke());
    }
}
