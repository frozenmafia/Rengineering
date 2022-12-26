package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.writeByteArray;
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$5$1 extends Lambda implements Styleable.ArcMotion<T[]> {
    final /* synthetic */ writeByteArray<T>[] $flows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$5$1(writeByteArray<? extends T>[] writebytearrayArr) {
        super(0);
        this.$flows = writebytearrayArr;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
    @Override // o.Styleable.ArcMotion
    public final T[] invoke() {
        int length = this.$flows.length;
        runAnimators.values(0, "T?");
        return new Object[length];
    }
}
