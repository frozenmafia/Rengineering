package o;
/* loaded from: classes7.dex */
public final class writeFloat$HaptikSDK$a implements writeByteArray<T> {
    final /* synthetic */ Object[] ag$a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:19:0x0064). Please submit an issue!!! */
    @Override // o.writeByteArray
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(o.writeCharArray<? super T> r8, o.setPatternPath<? super o.setAnimationMatrix> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 + r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.PatternPathMotion.values()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r8 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            o.writeCharArray r4 = (o.writeCharArray) r4
            java.lang.Object r5 = r0.L$0
            o.writeFloat$HaptikSDK$a r5 = (o.writeFloat$HaptikSDK$a) r5
            o.ChangeTransform.AnonymousClass1.valueOf(r9)
            r9 = r4
            goto L64
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            o.ChangeTransform.AnonymousClass1.valueOf(r9)
            r9 = r0
            o.setPatternPath r9 = (o.setPatternPath) r9
            java.lang.Object[] r9 = r7.ag$a
            int r9 = r9.length
            r2 = 0
            r5 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L4d:
            if (r2 >= r8) goto L66
            java.lang.Object[] r4 = r5.ag$a
            r4 = r4[r2]
            r0.L$0 = r5
            r0.L$1 = r9
            r0.I$0 = r2
            r0.I$1 = r8
            r0.label = r3
            java.lang.Object r4 = r9.emit(r4, r0)
            if (r4 != r1) goto L64
            return r1
        L64:
            int r2 = r2 + r3
            goto L4d
        L66:
            o.setAnimationMatrix r8 = o.setAnimationMatrix.ag$a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.writeFloat$HaptikSDK$a.collect(o.writeCharArray, o.setPatternPath):java.lang.Object");
    }
}
