package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SequenceKUnzip$unzip$1$1 extends Lambda implements Styleable.ChangeBounds<cancel<? extends A, ? extends B>, A> {
    public static final SequenceKUnzip$unzip$1$1 INSTANCE = new SequenceKUnzip$unzip$1$1();

    SequenceKUnzip$unzip$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((cancel<? extends Object, ? extends B>) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
    public final A invoke(cancel<? extends A, ? extends B> cancelVar) {
        runAnimators.valueOf(cancelVar, "it");
        return cancelVar.ag$a();
    }
}
