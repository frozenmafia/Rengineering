package o;

import java.lang.reflect.Method;
import kotlin.random.Random;
/* loaded from: classes5.dex */
public class setEnterAction {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class valueOf {
        public static final Method ah$a;
        public static final valueOf valueOf = new valueOf();
        public static final Method values;

        private valueOf() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[LOOP:0: B:3:0x0015->B:13:0x0043, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[EDGE_INSN: B:23:0x0047->B:15:0x0047 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                o.setEnterAction$valueOf r0 = new o.setEnterAction$valueOf
                r0.<init>()
                o.setEnterAction.valueOf.valueOf = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r0 = r0.getMethods()
                java.lang.String r1 = "throwableMethods"
                o.runAnimators.ah$a(r0, r1)
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L15:
                r4 = 0
                if (r3 >= r1) goto L46
                r5 = r0[r3]
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = o.runAnimators.values(r6, r7)
                if (r6 == 0) goto L3f
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                o.runAnimators.ah$a(r6, r7)
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                java.lang.Object r6 = o.getStartAlpha.HaptikSDK$c(r6)
                java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
                boolean r6 = o.runAnimators.values(r6, r7)
                if (r6 == 0) goto L3f
                r6 = 1
                goto L40
            L3f:
                r6 = 0
            L40:
                if (r6 == 0) goto L43
                goto L47
            L43:
                int r3 = r3 + 1
                goto L15
            L46:
                r5 = r4
            L47:
                o.setEnterAction.valueOf.ah$a = r5
                int r1 = r0.length
            L4a:
                if (r2 >= r1) goto L5f
                r3 = r0[r2]
                java.lang.String r5 = r3.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r5 = o.runAnimators.values(r5, r6)
                if (r5 == 0) goto L5c
                r4 = r3
                goto L5f
            L5c:
                int r2 = r2 + 1
                goto L4a
            L5f:
                o.setEnterAction.valueOf.values = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setEnterAction.valueOf.<clinit>():void");
        }
    }

    public void ah$a(Throwable th, Throwable th2) {
        runAnimators.ag$a(th, "cause");
        runAnimators.ag$a(th2, "exception");
        Method method = valueOf.ah$a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public Random ah$a() {
        return new changeScene();
    }
}
