package com.apxor.androidsdk.plugins.realtimeui.g.c;

import android.app.Activity;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.PopupWindow;
import com.google.android.exoplayer2.C;
import java.lang.ref.WeakReference;
import o.getWantsAllOnMoveCalls;
/* loaded from: classes3.dex */
public class b extends WebViewClient {
    private static final String a = "b";
    private static int ag$a = 0;
    private static long ah$a = 0;
    private static int values = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f324b = false;
    private long c = 1000;
    private String d;
    private String e;
    private WeakReference<Activity> f;
    private WeakReference<PopupWindow> g;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        final /* synthetic */ WeakReference a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f325b;

        a(WeakReference weakReference, String str) {
            this.a = weakReference;
            this.f325b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = (WebView) this.a.get();
            if (webView != null) {
                webView.loadUrl(this.f325b);
            }
        }
    }

    static {
        valueOf();
        int i = ag$a + 37;
        values = i % 128;
        int i2 = i % 2;
    }

    public b(String str, String str2, Activity activity) {
        this.d = str;
        this.e = str2;
        this.f = new WeakReference<>(activity);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0191, code lost:
        if (r2 == 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0194, code lost:
        r8 = "Share";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0196, code lost:
        r21.getContext().startActivity(android.content.Intent.createChooser(r3, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01a2, code lost:
        r4.a("InAppShareFailed", r20.d, r20.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01be, code lost:
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cb, code lost:
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x036d, code lost:
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x036f, code lost:
        r0.get().dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03f4, code lost:
        if (r6 != '-') goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x040a, code lost:
        if (com.apxor.androidsdk.core.SDKController.getInstance().getApplicationID().equals("d831634e11cf6c424b817e22761710e2") == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x040e, code lost:
        r3 = new android.content.Intent(r0, android.net.Uri.parse(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x041b, code lost:
        if (android.os.Build.VERSION.SDK_INT < 23) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x041d, code lost:
        r0 = com.apxor.androidsdk.plugins.realtimeui.g.c.b.values + 41;
        com.apxor.androidsdk.plugins.realtimeui.g.c.b.ag$a = r0 % 128;
        r0 = r0 % 2;
        r0 = r21.getContext().getPackageManager().queryIntentActivities(r3, 65536);
        r2 = r21.getContext().getPackageName();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0441, code lost:
        if (r6 >= r0.size()) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0451, code lost:
        if (r0.get(r6).activityInfo.packageName.equals(r2) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0453, code lost:
        r3.setComponent(new android.content.ComponentName(r2, r0.get(r6).activityInfo.name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0466, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0475, code lost:
        if (r3.resolveActivity(r21.getContext().getPackageManager()) == null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0477, code lost:
        r21.getContext().startActivity(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x047f, code lost:
        com.apxor.androidsdk.core.utils.Logger.e(com.apxor.androidsdk.plugins.realtimeui.g.c.b.a, "Failed to get the matching intent", null);
        r4.a("InAppRedirectionFailed", r20.d, r20.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04df, code lost:
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04ed, code lost:
        if ((r20.f.get() instanceof com.apxor.androidsdk.plugins.realtimeui.inapp.activities.HtmlActivity) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04ef, code lost:
        ((com.apxor.androidsdk.plugins.realtimeui.inapp.activities.HtmlActivity) r20.f.get()).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04fa, code lost:
        if (r2 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04fc, code lost:
        r0 = com.apxor.androidsdk.plugins.realtimeui.g.c.b.values + 67;
        com.apxor.androidsdk.plugins.realtimeui.g.c.b.ag$a = r0 % 128;
        r0 = r0 % 2;
        r4.a("inapp_dismissed", r20.d, r20.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014b, code lost:
        if (r0.isEmpty() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0155, code lost:
        if (r0.isEmpty() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0157, code lost:
        if (r6 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015f, code lost:
        if (r6.equals(org.apache.http.protocol.HTTP.PLAIN_TEXT_TYPE) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
        r3 = new android.content.Intent();
        r3.setAction("android.intent.action.SEND");
        r3.setType(r6);
        r3.putExtra("android.intent.extra.TEXT", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0171, code lost:
        if (r7 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0177, code lost:
        if (r7.isEmpty() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
        r0 = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017c, code lost:
        r0 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0180, code lost:
        if (r0 == 22) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0182, code lost:
        r3.setPackage(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
        r21.getContext().startActivity(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018d, code lost:
        if (r8 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0330 A[Catch: ClassNotFoundException | Exception -> 0x048c, TryCatch #1 {ClassNotFoundException | Exception -> 0x048c, blocks: (B:139:0x024d, B:141:0x0265, B:142:0x0269, B:144:0x026f, B:149:0x0288, B:150:0x0293, B:191:0x0308, B:203:0x0335, B:199:0x0321, B:200:0x0325, B:201:0x032a, B:202:0x0330, B:156:0x02a9, B:160:0x02b4, B:164:0x02bf, B:168:0x02ca, B:176:0x02db, B:180:0x02e6, B:152:0x0298, B:153:0x02a3, B:205:0x033d, B:207:0x034b, B:208:0x0354), top: B:283:0x024d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(android.webkit.WebView r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.g.c.b.a(android.webkit.WebView, java.lang.String):boolean");
    }

    static void valueOf() {
        ah$a = -3302139273665110902L;
    }

    public void a(PopupWindow popupWindow) {
        this.g = new WeakReference<>(popupWindow);
        int i = ag$a + 25;
        values = i % 128;
        int i2 = i % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        int i = values + 23;
        ag$a = i % 128;
        int i2 = i % 2;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i = values + 101;
        ag$a = i % 128;
        int i2 = i % 2;
        super.onPageFinished(webView, str);
        if (this.f324b) {
            int i3 = values + 93;
            ag$a = i3 % 128;
            if ((i3 % 2 != 0 ? '&' : (char) 6) == '&') {
                int i4 = (this.c > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS ? 1 : (this.c == C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS ? 0 : -1));
                Object obj = null;
                super.hashCode();
                if (i4 >= 0) {
                    return;
                }
            } else if (this.c >= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                return;
            }
            webView.getHandler().postDelayed(new a(new WeakReference(webView), str), this.c);
            this.c *= 2;
        }
        this.f324b = false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            int i = ag$a + 103;
            values = i % 128;
            char c = i % 2 == 0 ? (char) 2 : '=';
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (c != '=') {
                this.f324b = true;
            } else {
                this.f324b = true;
            }
            int i2 = values + 23;
            ag$a = i2 % 128;
            if ((i2 % 2 != 0 ? (char) 19 : 'N') != 19) {
                return;
            }
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = ag$a + 29;
        values = i % 128;
        int i2 = i % 2;
        boolean a2 = a(webView, str);
        try {
            int i3 = ag$a + 53;
            values = i3 % 128;
            int i4 = i3 % 2;
            return a2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(ah$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * ah$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
