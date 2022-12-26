package o;

import kotlin.jvm.internal.Ref;
/* loaded from: classes7.dex */
public final class VersionedParcel$1$HaptikSDK$a<T> implements writeCharArray {
    final /* synthetic */ Ref.ObjectRef<R> ag$a;
    final /* synthetic */ writeCharArray<R> ah$a;
    final /* synthetic */ excludeObject<R, T, setPatternPath<? super R>, Object> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public VersionedParcel$1$HaptikSDK$a(Ref.ObjectRef<R> objectRef, excludeObject<? super R, ? super T, ? super setPatternPath<? super R>, ? extends Object> excludeobject, writeCharArray<? super R> writechararray) {
        this.ag$a = objectRef;
        this.values = excludeobject;
        this.ah$a = writechararray;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    @Override // o.writeCharArray
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, o.setPatternPath<? super o.setAnimationMatrix> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 + r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.PatternPathMotion.values()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            o.ChangeTransform.AnonymousClass1.valueOf(r9)
            goto L71
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r2 = r0.L$0
            o.VersionedParcel$1$HaptikSDK$a r2 = (o.VersionedParcel$1$HaptikSDK$a) r2
            o.ChangeTransform.AnonymousClass1.valueOf(r9)
            goto L5b
        L41:
            o.ChangeTransform.AnonymousClass1.valueOf(r9)
            kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r7.ag$a
            o.excludeObject<R, T, o.setPatternPath<? super R>, java.lang.Object> r2 = r7.values
            T r5 = r9.element
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = r2.invoke(r5, r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L5b:
            r8.element = r9
            o.writeCharArray<R> r8 = r2.ah$a
            kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r2.ag$a
            T r9 = r9.element
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            o.setAnimationMatrix r8 = o.setAnimationMatrix.ag$a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.VersionedParcel$1$HaptikSDK$a.emit(java.lang.Object, o.setPatternPath):java.lang.Object");
    }
}
