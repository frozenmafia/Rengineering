package kotlin.sequences;

import kotlin.jvm.internal.Lambda;
import o.GhostViewPort;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class SequencesKt___SequencesKt$filterIndexed$2 extends Lambda implements Styleable.ChangeBounds<GhostViewPort<? extends T>, T> {
    public static final SequencesKt___SequencesKt$filterIndexed$2 INSTANCE = new SequencesKt___SequencesKt$filterIndexed$2();

    SequencesKt___SequencesKt$filterIndexed$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((GhostViewPort<? extends Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public final T invoke(GhostViewPort<? extends T> ghostViewPort) {
        runAnimators.ag$a(ghostViewPort, "it");
        return ghostViewPort.values();
    }
}
