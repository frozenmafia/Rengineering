package o;
/* loaded from: classes7.dex */
public final class VersionedParcel$1$ah$b implements writeByteArray<R> {
    final /* synthetic */ writeByteArray ag$a;
    final /* synthetic */ Transition valueOf;

    /* renamed from: o.VersionedParcel$1$ah$b$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass5<T> implements writeCharArray {
        final /* synthetic */ Transition ah$a;
        final /* synthetic */ writeCharArray toString;

        public AnonymousClass5(writeCharArray writechararray, Transition transition) {
            this.toString = writechararray;
            this.ah$a = transition;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        @Override // o.writeCharArray
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, o.setPatternPath<? super o.setAnimationMatrix> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1
                if (r0 == 0) goto L14
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.label
                int r8 = r8 + r2
                r0.label = r8
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1
                r0.<init>(r6, r8)
            L19:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = o.PatternPathMotion.values()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3d
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                o.ChangeTransform.AnonymousClass1.valueOf(r8)
                goto L64
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                java.lang.Object r7 = r0.L$0
                o.writeCharArray r7 = (o.writeCharArray) r7
                o.ChangeTransform.AnonymousClass1.valueOf(r8)
                goto L55
            L3d:
                o.ChangeTransform.AnonymousClass1.valueOf(r8)
                o.writeCharArray r8 = r6.toString
                r2 = r0
                o.setPatternPath r2 = (o.setPatternPath) r2
                o.Transition r2 = r6.ah$a
                r0.L$0 = r8
                r0.label = r4
                java.lang.Object r7 = r2.invoke(r7, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r5 = r8
                r8 = r7
                r7 = r5
            L55:
                if (r8 != 0) goto L58
                goto L64
            L58:
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L64
                return r1
            L64:
                o.setAnimationMatrix r7 = o.setAnimationMatrix.ag$a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.VersionedParcel$1$ah$b.AnonymousClass5.emit(java.lang.Object, o.setPatternPath):java.lang.Object");
        }
    }

    @Override // o.writeByteArray
    public Object collect(writeCharArray writechararray, setPatternPath setpatternpath) {
        Object collect = this.ag$a.collect(new AnonymousClass5(writechararray, this.valueOf), setpatternpath);
        return collect == PatternPathMotion.values() ? collect : setAnimationMatrix.ag$a;
    }
}
