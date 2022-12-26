package arrow.core.extensions;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.cancel;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class SequenceKUnzip$unzip$1$2 extends Lambda implements Styleable.ChangeBounds<cancel<? extends A, ? extends B>, B> {
    public static final SequenceKUnzip$unzip$1$2 INSTANCE = new SequenceKUnzip$unzip$1$2();

    SequenceKUnzip$unzip$1$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((cancel<? extends A, ? extends Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
    public final B invoke(cancel<? extends A, ? extends B> cancelVar) {
        runAnimators.valueOf(cancelVar, "it");
        return cancelVar.ah$a();
    }
}
