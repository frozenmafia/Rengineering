package arrow.core;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
public final class NonEmptyList$coflatMap$1 extends Lambda implements Styleable.ChangeBounds<List<? extends A>, List<? extends B>> {
    final /* synthetic */ List $buf;
    final /* synthetic */ Styleable.ChangeBounds $f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonEmptyList$coflatMap$1(List list, Styleable.ChangeBounds changeBounds) {
        super(1);
        this.$buf = list;
        this.$f = changeBounds;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r6 = r6;
     */
    @Override // o.Styleable.ChangeBounds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<B> invoke(java.util.List<? extends A> r6) {
        /*
            r5 = this;
        L0:
            java.lang.String r0 = "list"
            o.runAnimators.valueOf(r6, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto Le
            java.util.List r6 = r5.$buf
            return r6
        Le:
            r0 = 1
            int r1 = r6.size()
            java.util.List r0 = r6.subList(r0, r1)
            java.util.List r1 = r5.$buf
            java.util.Collection r1 = (java.util.Collection) r1
            o.Styleable$ChangeBounds r2 = r5.$f
            o.validateRelationship r3 = new o.validateRelationship
            r4 = 0
            java.lang.Object r6 = r6.get(r4)
            r3.<init>(r6, r0)
            java.lang.Object r6 = r2.invoke(r3)
            r1.add(r6)
            r6 = r5
            arrow.core.NonEmptyList$coflatMap$1 r6 = (arrow.core.NonEmptyList$coflatMap$1) r6
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: arrow.core.NonEmptyList$coflatMap$1.invoke(java.util.List):java.util.List");
    }
}
