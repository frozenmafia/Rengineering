package o;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import javax.net.ssl.HostnameVerifier;
/* loaded from: classes5.dex */
public class toTangent implements HostnameVerifier, handleException {
    public jmjou values;

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        this.values = jmjouVar;
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ((!android.text.TextUtils.isEmpty(irjuc.irjuc.cqqlq.irjuc.qwsnv.zihjx.toString) && irjuc.irjuc.cqqlq.irjuc.qwsnv.zihjx.toString.contains(r4)) != false) goto L12;
     */
    @Override // javax.net.ssl.HostnameVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verify(java.lang.String r4, javax.net.ssl.SSLSession r5) {
        /*
            r3 = this;
            irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou r0 = r3.values
            java.lang.String r1 = "com.phonepe.android.sdk.isUAT"
            java.lang.Object r0 = r0.toString(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = o.beginAsyncSectionFallback.valueOf(r0)
            irjuc.irjuc.cqqlq.irjuc.qwsnv.zihjx$irjuc r0 = irjuc.irjuc.cqqlq.irjuc.qwsnv.zihjx.ag$a(r0)
            java.lang.String r0 = r0.chmha
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r2 = 0
            if (r1 != 0) goto L3f
            boolean r1 = r4.contains(r0)
            if (r1 != 0) goto L36
            java.lang.String r1 = irjuc.irjuc.cqqlq.irjuc.qwsnv.zihjx.toString
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = irjuc.irjuc.cqqlq.irjuc.qwsnv.zihjx.toString
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            if (r4 == 0) goto L3f
        L36:
            javax.net.ssl.HostnameVerifier r4 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()
            boolean r4 = r4.verify(r0, r5)
            return r4
        L3f:
            java.lang.String r4 = "CustomHostNameVerifier"
            java.lang.String r5 = "Detected an SSLSession coming from an unknown host. Aborting !!!"
            o.beginAsyncSectionFallback.ah$a(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toTangent.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
