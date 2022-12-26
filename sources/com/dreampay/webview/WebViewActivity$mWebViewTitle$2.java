package com.dreampay.webview;

import android.os.Bundle;
import android.text.TextUtils;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.moveToFirst;
/* loaded from: classes6.dex */
final class WebViewActivity$mWebViewTitle$2 extends Lambda implements Styleable.ArcMotion<String> {
    private static char ag$a = 46091;
    private static int ah$a = 0;
    private static int ah$b = 1;
    private static char toString = 8909;
    private static char valueOf = 41234;
    private static char values = 62933;
    final /* synthetic */ WebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewActivity$mWebViewTitle$2(WebViewActivity webViewActivity) {
        super(0);
        try {
            this.this$0 = webViewActivity;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.Styleable.ArcMotion
    public /* synthetic */ String invoke() {
        int i = ah$b + 1;
        ah$a = i % 128;
        if (i % 2 == 0) {
            return invoke2();
        }
        String invoke2 = invoke2();
        Object obj = null;
        super.hashCode();
        return invoke2;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String invoke2() {
        int i = ah$b + 83;
        ah$a = i % 128;
        int i2 = i % 2;
        Bundle extras = this.this$0.getIntent().getExtras();
        if (extras == null) {
            return "";
        }
        String string = extras.getString(values(new char[]{16263, 64858, 517, 'j', 46873, 58234}, TextUtils.getOffsetAfter("", 0) + 5).intern());
        if (string == null) {
            int i3 = ah$a + 93;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        return string;
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + toString)) ^ ((cArr3[0] >>> 5) + valueOf)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + values)) ^ ((cArr3[1] >>> 5) + ag$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
