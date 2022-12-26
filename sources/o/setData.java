package o;

import android.view.View;
import android.view.ViewConfiguration;
import com.app.dream11.core.service.graphql.api.type.EntityType;
/* loaded from: classes3.dex */
public final class setData {
    private boolean ag$a;
    private final values valueOf;
    private final valueOf values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void toString(values valuesVar);
    }

    /* loaded from: classes3.dex */
    public static final class values {
        private static int HaptikSDK$a = -226916931;
        private static int HaptikSDK$b = 9;
        private static short[] HaptikSDK$d = null;
        private static int ah$b = -212771198;
        private static int getInitSettings = 1;
        private static int getSignupData;
        private static byte[] invoke = {-7, -8, 11, -11, 0};
        private final String HaptikSDK$c;
        private final String ag$a;
        private final String ah$a;
        private final int toString;
        private final String valueOf;
        private final EntityType values;

        public values(int i, String str, String str2, String str3, String str4, EntityType entityType) {
            runAnimators.ag$a(str, ah$a((byte) View.resolveSize(0, 0), (-4) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSizeAndState(0, 0, 0) + 212771314, (short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 226916931).intern());
            runAnimators.ag$a(str2, "nextPageTitle");
            runAnimators.ag$a(str3, "description");
            runAnimators.ag$a(str4, "nextPageDescription");
            this.toString = i;
            this.HaptikSDK$c = str;
            this.ah$a = str2;
            this.valueOf = str3;
            this.ag$a = str4;
            this.values = entityType;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ values(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.app.dream11.core.service.graphql.api.type.EntityType r13, int r14, o.getTargetTypes r15) {
            /*
                r7 = this;
                r14 = r14 & 32
                r15 = 24
                if (r14 == 0) goto L9
                r14 = 68
                goto Lb
            L9:
                r14 = 24
            Lb:
                if (r14 == r15) goto L27
                int r13 = o.setData.values.getSignupData
                int r13 = r13 + 109
                int r14 = r13 % 128
                o.setData.values.getInitSettings = r14
                int r13 = r13 % 2
                r13 = 0
                int r14 = o.setData.values.getSignupData     // Catch: java.lang.Exception -> L25
                int r14 = r14 + 25
                int r15 = r14 % 128
                o.setData.values.getInitSettings = r15     // Catch: java.lang.Exception -> L23
                int r14 = r14 % 2
                goto L27
            L23:
                r8 = move-exception
                throw r8
            L25:
                r8 = move-exception
                throw r8
            L27:
                r6 = r13
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setData.values.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.app.dream11.core.service.graphql.api.type.EntityType, int, o.getTargetTypes):void");
        }

        public final String HaptikSDK$c() {
            try {
                int i = getInitSettings + 31;
                getSignupData = i % 128;
                int i2 = i % 2;
                String str = this.HaptikSDK$c;
                int i3 = getSignupData + 89;
                getInitSettings = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        }

        public final int valueOf() {
            int i = getSignupData + 29;
            getInitSettings = i % 128;
            if (!(i % 2 != 0)) {
                int i2 = this.toString;
                Object obj = null;
                super.hashCode();
                return i2;
            }
            return this.toString;
        }

        public final String ah$a() {
            String str;
            int i = getInitSettings + 73;
            getSignupData = i % 128;
            Object[] objArr = null;
            if (i % 2 != 0) {
                str = this.ah$a;
                int length = objArr.length;
            } else {
                str = this.ah$a;
            }
            int i2 = getSignupData + 29;
            getInitSettings = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            int length2 = objArr.length;
            return str;
        }

        public final String values() {
            int i = getSignupData + 79;
            getInitSettings = i % 128;
            int i2 = i % 2;
            String str = this.valueOf;
            int i3 = getInitSettings + 115;
            getSignupData = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public final String ag$a() {
            try {
                int i = getInitSettings + 1;
                getSignupData = i % 128;
                if (!(i % 2 != 0)) {
                    return this.ag$a;
                }
                String str = this.ag$a;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            } catch (Exception e) {
                throw e;
            }
        }

        private static String ah$a(byte b2, int i, int i2, short s, int i3) {
            String obj;
            synchronized (moveToLast.ah$a) {
                StringBuilder sb = new StringBuilder();
                int i4 = i + HaptikSDK$b;
                boolean z = i4 == -1;
                if (z) {
                    if (invoke != null) {
                        i4 = (byte) (invoke[HaptikSDK$a + i3] + HaptikSDK$b);
                    } else {
                        i4 = (short) (HaptikSDK$d[HaptikSDK$a + i3] + HaptikSDK$b);
                    }
                }
                if (i4 > 0) {
                    moveToLast.values = ((i3 + i4) - 2) + HaptikSDK$a + (z ? 1 : 0);
                    moveToLast.ag$a = (char) (i2 + ah$b);
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf = 1;
                    while (moveToLast.valueOf < i4) {
                        if (invoke != null) {
                            byte[] bArr = invoke;
                            int i5 = moveToLast.values;
                            moveToLast.values = i5 - 1;
                            moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                        } else {
                            short[] sArr = HaptikSDK$d;
                            int i6 = moveToLast.values;
                            moveToLast.values = i6 - 1;
                            moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                        }
                        sb.append(moveToLast.ag$a);
                        moveToLast.toString = moveToLast.ag$a;
                        moveToLast.valueOf++;
                    }
                }
                obj = sb.toString();
            }
            return obj;
        }
    }

    public setData(values valuesVar, valueOf valueof) {
        runAnimators.ag$a(valuesVar, "data");
        runAnimators.ag$a(valueof, "handler");
        this.valueOf = valuesVar;
        this.values = valueof;
    }

    public final values valueOf() {
        return this.valueOf;
    }

    public final valueOf values() {
        return this.values;
    }

    public final boolean ah$a() {
        return this.ag$a;
    }

    public final void toString(boolean z) {
        this.ag$a = z;
    }
}
