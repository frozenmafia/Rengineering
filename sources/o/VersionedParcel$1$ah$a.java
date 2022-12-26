package o;
/* loaded from: classes7.dex */
public final class VersionedParcel$1$ah$a implements writeByteArray<T> {
    final /* synthetic */ writeByteArray ag$a;

    /* renamed from: o.VersionedParcel$1$ah$a$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1<T> implements writeCharArray {
        final /* synthetic */ writeCharArray ah$a;

        public AnonymousClass1(writeCharArray writechararray) {
            this.ah$a = writechararray;
        }

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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1
                if (r0 == 0) goto L14
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r6 = r0.label
                int r6 = r6 + r2
                r0.label = r6
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1
                r0.<init>(r4, r6)
            L19:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = o.PatternPathMotion.values()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                o.ChangeTransform.AnonymousClass1.valueOf(r6)
                goto L45
            L2a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L32:
                o.ChangeTransform.AnonymousClass1.valueOf(r6)
                o.writeCharArray r6 = r4.ah$a
                r2 = r0
                o.setPatternPath r2 = (o.setPatternPath) r2
                if (r5 == 0) goto L45
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L45
                return r1
            L45:
                o.setAnimationMatrix r5 = o.setAnimationMatrix.ag$a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.VersionedParcel$1$ah$a.AnonymousClass1.emit(java.lang.Object, o.setPatternPath):java.lang.Object");
        }
    }

    @Override // o.writeByteArray
    public Object collect(writeCharArray writechararray, setPatternPath setpatternpath) {
        Object collect = this.ag$a.collect(new AnonymousClass1(writechararray), setpatternpath);
        return collect == PatternPathMotion.values() ? collect : setAnimationMatrix.ag$a;
    }
}
