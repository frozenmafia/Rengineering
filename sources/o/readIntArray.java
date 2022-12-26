package o;

import java.util.concurrent.CancellationException;
/* loaded from: classes7.dex */
public interface readIntArray<E> {
    readExceptionCode<E> HaptikSDK$a();

    transformPage<E> ag$a();

    transformPage<writeSerializable<E>> ah$a();

    Object getSignupData();

    Object valueOf(setPatternPath<? super writeSerializable<? extends E>> setpatternpath);

    void valueOf(CancellationException cancellationException);

    /* loaded from: classes7.dex */
    public static final class toString {
        public static /* synthetic */ void ag$a(readIntArray readintarray, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            readintarray.valueOf(cancellationException);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object ah$a(o.readIntArray<? extends E> r4, o.setPatternPath<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                if (r0 == 0) goto L14
                r0 = r5
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = (kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r5 = r0.label
                int r5 = r5 + r2
                r0.label = r5
                goto L19
            L14:
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = new kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                r0.<init>(r5)
            L19:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = o.PatternPathMotion.values()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                o.ChangeTransform.AnonymousClass1.valueOf(r5)
                o.writeSerializable r5 = (o.writeSerializable) r5
                java.lang.Object r4 = r5.values()
                goto L44
            L30:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L38:
                o.ChangeTransform.AnonymousClass1.valueOf(r5)
                r0.label = r3
                java.lang.Object r4 = r4.valueOf(r0)
                if (r4 != r1) goto L44
                return r1
            L44:
                java.lang.Object r4 = o.writeSerializable.values(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.readIntArray.toString.ah$a(o.readIntArray, o.setPatternPath):java.lang.Object");
        }
    }
}
