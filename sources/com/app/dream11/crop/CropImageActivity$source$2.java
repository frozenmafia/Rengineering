package com.app.dream11.crop;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isLast;
/* loaded from: classes2.dex */
final class CropImageActivity$source$2 extends Lambda implements Styleable.ArcMotion<String> {
    private static int ag$a = 243;
    private static boolean ah$a = true;
    private static int invoke = 1;
    private static char[] toString = {358, 354, 360, 357, 342, 344};
    private static int valueOf = 0;
    private static boolean values = true;
    final /* synthetic */ CropImageActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageActivity$source$2(CropImageActivity cropImageActivity) {
        super(0);
        this.this$0 = cropImageActivity;
    }

    @Override // o.Styleable.ArcMotion
    public /* synthetic */ String invoke() {
        String invoke2;
        int i = valueOf + 105;
        invoke = i % 128;
        Object obj = null;
        if (!(i % 2 == 0)) {
            try {
                invoke2 = invoke2();
            } catch (Exception e) {
                throw e;
            }
        } else {
            invoke2 = invoke2();
            super.hashCode();
        }
        int i2 = invoke + 43;
        valueOf = i2 % 128;
        if ((i2 % 2 != 0 ? 'F' : (char) 2) != 'F') {
            return invoke2;
        }
        super.hashCode();
        return invoke2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        r0 = r0.getExtras();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        r0 = r0.getString(valueOf(null, null, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-122, -123, -124, -125, -126, -127}).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        r0 = com.app.dream11.crop.CropImageActivity$source$2.invoke + 35;
        com.app.dream11.crop.CropImageActivity$source$2.valueOf = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if ((r0 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        r0 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r0 == null) goto L13;
     */
    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String invoke2() {
        /*
            r5 = this;
            int r0 = com.app.dream11.crop.CropImageActivity$source$2.invoke
            int r0 = r0 + 91
            int r1 = r0 % 128
            com.app.dream11.crop.CropImageActivity$source$2.valueOf = r1
            int r0 = r0 % 2
            r1 = 69
            if (r0 == 0) goto L11
            r0 = 69
            goto L13
        L11:
            r0 = 99
        L13:
            java.lang.String r2 = ""
            r3 = 0
            if (r0 == r1) goto L21
            com.app.dream11.crop.CropImageActivity r0 = r5.this$0
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L2b
            goto L50
        L21:
            com.app.dream11.crop.CropImageActivity r0 = r5.this$0
            android.content.Intent r0 = r0.getIntent()
            int r1 = r3.length     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L2b
            goto L50
        L2b:
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto L32
            goto L50
        L32:
            int r1 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r1 = r1 >> 16
            int r1 = r1 + 127
            r4 = 6
            byte[] r4 = new byte[r4]
            r4 = {x006c: FILL_ARRAY_DATA  , data: [-122, -123, -124, -125, -126, -127} // fill-array
            java.lang.String r1 = valueOf(r3, r3, r1, r4)
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r2 = r0
        L50:
            int r0 = com.app.dream11.crop.CropImageActivity$source$2.invoke
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.app.dream11.crop.CropImageActivity$source$2.valueOf = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L5f
            r0 = 0
            goto L60
        L5f:
            r0 = 1
        L60:
            if (r0 == 0) goto L63
            return r2
        L63:
            r0 = 73
            int r0 = r0 / r1
            return r2
        L67:
            r0 = move-exception
            throw r0
        L69:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.crop.CropImageActivity$source$2.invoke2():java.lang.String");
    }

    private static String valueOf(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = toString;
            int i2 = ag$a;
            if (ah$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (values) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
