package o;

import kotlin.jvm.internal.Ref;
/* loaded from: classes7.dex */
public final class writeSize$ah$a<T> implements writeCharArray {
    final /* synthetic */ Ref.IntRef ag$a;
    final /* synthetic */ writeCharArray<T> ah$a;
    final /* synthetic */ int valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // o.writeCharArray
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r5, o.setPatternPath<? super o.setAnimationMatrix> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 + r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.PatternPathMotion.values()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            o.ChangeTransform.AnonymousClass1.valueOf(r6)
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            o.ChangeTransform.AnonymousClass1.valueOf(r6)
            kotlin.jvm.internal.Ref$IntRef r6 = r4.ag$a
            int r6 = r6.element
            int r2 = r4.valueOf
            if (r6 < r2) goto L4b
            o.writeCharArray<T> r6 = r4.ah$a
            r0.label = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            o.setAnimationMatrix r5 = o.setAnimationMatrix.ag$a
            return r5
        L4b:
            kotlin.jvm.internal.Ref$IntRef r5 = r4.ag$a
            int r6 = r5.element
            int r6 = r6 + r3
            r5.element = r6
            kotlin.jvm.internal.Ref$IntRef r5 = r4.ag$a
            int r5 = r5.element
            o.setAnimationMatrix r5 = o.setAnimationMatrix.ag$a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.writeSize$ah$a.emit(java.lang.Object, o.setPatternPath):java.lang.Object");
    }
}
