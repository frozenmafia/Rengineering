package o;
/* loaded from: classes7.dex */
public final class VersionedParcel$1$ag$a implements writeByteArray<Object> {
    final /* synthetic */ writeByteArray ag$a;

    /* renamed from: o.VersionedParcel$1$ag$a$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass2<T> implements writeCharArray {
        final /* synthetic */ writeCharArray ag$a;

        public AnonymousClass2(writeCharArray writechararray) {
            this.ag$a = writechararray;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
        @Override // o.writeCharArray
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, o.setPatternPath r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                if (r0 == 0) goto L14
                r0 = r7
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r7 = r0.label
                int r7 = r7 + r2
                r0.label = r7
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1
                r0.<init>(r5, r7)
            L19:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = o.PatternPathMotion.values()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                o.ChangeTransform.AnonymousClass1.valueOf(r7)
                goto L4d
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                o.ChangeTransform.AnonymousClass1.valueOf(r7)
                o.writeCharArray r7 = r5.ag$a
                r2 = r0
                o.setPatternPath r2 = (o.setPatternPath) r2
                r2 = 3
                java.lang.String r4 = "R"
                o.runAnimators.values(r2, r4)
                boolean r2 = r6 instanceof java.lang.Object
                if (r2 == 0) goto L4d
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L4d
                return r1
            L4d:
                o.setAnimationMatrix r6 = o.setAnimationMatrix.ag$a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.VersionedParcel$1$ag$a.AnonymousClass2.emit(java.lang.Object, o.setPatternPath):java.lang.Object");
        }
    }

    @Override // o.writeByteArray
    public Object collect(writeCharArray<? super Object> writechararray, setPatternPath setpatternpath) {
        writeByteArray writebytearray = this.ag$a;
        runAnimators.valueOf();
        Object collect = writebytearray.collect(new AnonymousClass2(writechararray), setpatternpath);
        return collect == PatternPathMotion.values() ? collect : setAnimationMatrix.ag$a;
    }
}
