package com.apxor.androidsdk.plugins.wysiwyg;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class c {
    private static StringBuilder a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private static final CopyOnWriteArrayList<View> f407b = new CopyOnWriteArrayList<>();

    public static CopyOnWriteArrayList<View> a() {
        return f407b;
    }

    private static String b(CharSequence charSequence) {
        int i;
        char charAt;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 < 55296 || charAt2 > 57343) {
                if (charAt2 <= '~' && charAt2 >= ' ') {
                    sb.append(charAt2);
                } else {
                    sb.append("?");
                }
            } else if (charAt2 < 56320 && (i = i2 + 1) < charSequence.length() && (charAt = charSequence.charAt(i)) >= 56320 && charAt <= 57343) {
                sb.append("?");
                i2 = i;
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(View view) {
        f407b.clear();
        if (view == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        a = sb;
        sb.append("[");
        Rect rect = new Rect();
        view.getRootView().getWindowVisibleDisplayFrame(rect);
        a(view, rect, "");
        a.append("]");
        return a.toString().replaceAll("\\},\\]", "}]").replaceAll("\\],\\]", "\\]\\]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:148|149|(3:177|178|(16:180|181|182|183|161|162|163|164|165|115|(1:125)(1:119)|120|(1:122)|123|124|17))|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|115|(1:117)|125|120|(0)|123|124|17) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:18|(14:19|20|(1:22)|23|(1:224)(6:27|28|29|30|31|(3:215|216|(1:218)))|33|34|35|36|37|38|39|40|41)|(27:43|44|45|(3:58|59|17)|(1:61)|62|63|(3:65|(2:67|(1:69))|195)(2:(2:197|198)|195)|70|71|(1:73)(1:192)|74|75|76|77|(26:148|149|(3:177|178|(16:180|181|182|183|161|162|163|164|165|115|(1:125)(1:119)|120|(1:122)|123|124|17))|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|115|(1:117)|125|120|(0)|123|124|17)(21:79|80|81|(3:83|(2:85|86)|140)(3:141|(2:143|(2:145|86))|140)|87|88|89|90|91|92|93|94|95|96|97|(4:99|100|(3:102|103|104)(1:126)|105)(1:127)|106|(1:108)|109|110|17)|136|113|114|115|(0)|125|120|(0)|123|124|17)|206|(0)|62|63|(0)(0)|70|71|(0)(0)|74|75|76|77|(0)(0)|136|113|114|115|(0)|125|120|(0)|123|124|17) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:18|19|20|(1:22)|23|(1:224)(6:27|28|29|30|31|(3:215|216|(1:218)))|33|34|35|36|37|38|39|40|41|(27:43|44|45|(3:58|59|17)|(1:61)|62|63|(3:65|(2:67|(1:69))|195)(2:(2:197|198)|195)|70|71|(1:73)(1:192)|74|75|76|77|(26:148|149|(3:177|178|(16:180|181|182|183|161|162|163|164|165|115|(1:125)(1:119)|120|(1:122)|123|124|17))|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|115|(1:117)|125|120|(0)|123|124|17)(21:79|80|81|(3:83|(2:85|86)|140)(3:141|(2:143|(2:145|86))|140)|87|88|89|90|91|92|93|94|95|96|97|(4:99|100|(3:102|103|104)(1:126)|105)(1:127)|106|(1:108)|109|110|17)|136|113|114|115|(0)|125|120|(0)|123|124|17)|206|(0)|62|63|(0)(0)|70|71|(0)(0)|74|75|76|77|(0)(0)|136|113|114|115|(0)|125|120|(0)|123|124|17) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0281, code lost:
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0283, code lost:
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0286, code lost:
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x038d, code lost:
        r28 = r1;
        r29 = r2;
        r30 = r3;
        r31 = r4;
        r25 = r9;
        r32 = r11;
        r4 = r18;
        r3 = r22;
        r18 = r6;
        r33 = r20;
        r20 = r5;
        r5 = r23;
        r23 = r10;
        r10 = r24;
        r24 = r12;
        r12 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03b1, code lost:
        r28 = r1;
        r29 = r2;
        r30 = r3;
        r31 = r4;
        r25 = r9;
        r32 = r11;
        r4 = r18;
        r3 = r22;
        r33 = r20;
        r20 = r5;
        r5 = r23;
        r23 = r10;
        r10 = r24;
        r24 = r12;
        r12 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03d4, code lost:
        r28 = r1;
        r29 = r2;
        r30 = r3;
        r31 = r4;
        r25 = r9;
        r32 = r11;
        r4 = r18;
        r3 = r22;
        r33 = r20;
        r20 = r5;
        r5 = r23;
        r23 = r10;
        r10 = r24;
        r24 = r12;
        r12 = r33;
        r0 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190 A[Catch: Exception -> 0x03d4, TryCatch #16 {Exception -> 0x03d4, blocks: (B:63:0x0187, B:65:0x0190, B:67:0x019a, B:69:0x01a2), top: B:211:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1 A[Catch: Exception -> 0x03b1, TryCatch #7 {Exception -> 0x03b1, blocks: (B:75:0x01bb, B:77:0x01c1, B:79:0x01c9), top: B:195:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.view.View r34, android.graphics.Rect r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.wysiwyg.c.a(android.view.View, android.graphics.Rect, java.lang.String):void");
    }

    private static boolean a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return (accessibilityNodeInfo.isClickable() && accessibilityNodeInfo.isEnabled() && a(accessibilityNodeInfo.getContentDescription()).isEmpty() && a(accessibilityNodeInfo.getText()).isEmpty()) ? false : true;
    }

    private static String a(CharSequence charSequence) {
        return charSequence == null ? "" : b(charSequence);
    }
}
