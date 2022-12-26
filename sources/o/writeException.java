package o;

import java.util.Collection;
/* loaded from: classes7.dex */
public final /* synthetic */ class writeException {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object toString(o.writeByteArray<? extends T> r4, C r5, o.setPatternPath<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 + r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.PatternPathMotion.values()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            o.ChangeTransform.AnonymousClass1.valueOf(r6)
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            o.ChangeTransform.AnonymousClass1.valueOf(r6)
            o.writeException$values r6 = new o.writeException$values
            r6.<init>(r5)
            o.writeCharArray r6 = (o.writeCharArray) r6
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.writeException.toString(o.writeByteArray, java.util.Collection, o.setPatternPath):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect field signature: TC; */
    /* loaded from: classes7.dex */
    public static final class values<T> implements writeCharArray {
        final /* synthetic */ Collection ah$a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        values(Collection collection) {
            this.ah$a = collection;
        }

        @Override // o.writeCharArray
        public final Object emit(T t, setPatternPath<? super setAnimationMatrix> setpatternpath) {
            this.ah$a.add(t);
            return setAnimationMatrix.ag$a;
        }
    }
}
