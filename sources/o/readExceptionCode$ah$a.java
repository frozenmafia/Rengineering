package o;
/* loaded from: classes7.dex */
public final class readExceptionCode$ah$a {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object ah$a(o.readExceptionCode r4, o.setPatternPath r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelIterator$next0$1
            if (r0 == 0) goto L14
            r0 = r5
            kotlinx.coroutines.channels.ChannelIterator$next0$1 r0 = (kotlinx.coroutines.channels.ChannelIterator$next0$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 + r2
            r0.label = r5
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelIterator$next0$1 r0 = new kotlinx.coroutines.channels.ChannelIterator$next0$1
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.PatternPathMotion.values()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            o.readExceptionCode r4 = (o.readExceptionCode) r4
            o.ChangeTransform.AnonymousClass1.valueOf(r5)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            o.ChangeTransform.AnonymousClass1.valueOf(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.ag$a(r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L51
            java.lang.Object r4 = r4.ag$a()
            return r4
        L51:
            kotlinx.coroutines.channels.ClosedReceiveChannelException r4 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r5 = "Channel was closed"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.readExceptionCode$ah$a.ah$a(o.readExceptionCode, o.setPatternPath):java.lang.Object");
    }
}
