package o;
/* loaded from: classes7.dex */
public final class writeFloat$ah$a implements writeByteArray<T> {
    final /* synthetic */ Iterable ah$a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // o.writeByteArray
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(o.writeCharArray<? super T> r5, o.setPatternPath<? super o.setAnimationMatrix> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 + r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.PatternPathMotion.values()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r2 = r0.L$0
            o.writeCharArray r2 = (o.writeCharArray) r2
            o.ChangeTransform.AnonymousClass1.valueOf(r6)
            goto L48
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            o.ChangeTransform.AnonymousClass1.valueOf(r6)
            r6 = r0
            o.setPatternPath r6 = (o.setPatternPath) r6
            java.lang.Iterable r6 = r4.ah$a
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
            r5 = r6
        L48:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r5.next()
            r0.L$0 = r2
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r2.emit(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L5f:
            o.setAnimationMatrix r5 = o.setAnimationMatrix.ag$a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.writeFloat$ah$a.collect(o.writeCharArray, o.setPatternPath):java.lang.Object");
    }
}
