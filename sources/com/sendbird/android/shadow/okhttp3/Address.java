package com.sendbird.android.shadow.okhttp3;

import androidx.databinding.library.baseAdapters.BR;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.move;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class Address {
    private static long ag$a = 1396597662562755393L;
    private static char[] ah$a = {'h', 41781, 18166, 59827, 36215};
    private static int toString = 1;
    private static int valueOf;
    final CertificatePinner certificatePinner;
    final List<ConnectionSpec> connectionSpecs;
    final Dns dns;
    final HostnameVerifier hostnameVerifier;
    final List<Protocol> protocols;
    final Proxy proxy;
    final Authenticator proxyAuthenticator;
    final ProxySelector proxySelector;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final HttpUrl url;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:11:0x00a7
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public Address(java.lang.String r15, int r16, com.sendbird.android.shadow.okhttp3.Dns r17, javax.net.SocketFactory r18, javax.net.ssl.SSLSocketFactory r19, javax.net.ssl.HostnameVerifier r20, com.sendbird.android.shadow.okhttp3.CertificatePinner r21, com.sendbird.android.shadow.okhttp3.Authenticator r22, java.net.Proxy r23, java.util.List<com.sendbird.android.shadow.okhttp3.Protocol> r24, java.util.List<com.sendbird.android.shadow.okhttp3.ConnectionSpec> r25, java.net.ProxySelector r26) {
        /*
            r14 = this;
            r1 = r14
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r22
            r5 = r26
            r14.<init>()
            com.sendbird.android.shadow.okhttp3.HttpUrl$Builder r6 = new com.sendbird.android.shadow.okhttp3.HttpUrl$Builder
            r6.<init>()
            if (r3 == 0) goto L3f
            r7 = 0
            int r9 = android.widget.ExpandableListView.getPackedPositionChild(r7)
            int r9 = 4 - r9
            int r10 = android.os.Process.myPid()
            int r10 = r10 >> 22
            long r11 = android.os.Process.getElapsedCpuTime()
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            int r7 = 1 - r13
            char r7 = (char) r7
            java.lang.String r7 = ah$a(r9, r10, r7)
            java.lang.String r7 = r7.intern()
            int r8 = com.sendbird.android.shadow.okhttp3.Address.toString
            int r8 = r8 + 117
            int r9 = r8 % 128
            com.sendbird.android.shadow.okhttp3.Address.valueOf = r9
            int r8 = r8 % 2
            goto L41
        L3f:
            java.lang.String r7 = "http"
        L41:
            com.sendbird.android.shadow.okhttp3.HttpUrl$Builder r6 = r6.scheme(r7)     // Catch: java.lang.Exception -> La5
            r7 = r15
            com.sendbird.android.shadow.okhttp3.HttpUrl$Builder r6 = r6.host(r15)     // Catch: java.lang.Exception -> La5
            r7 = r16
            com.sendbird.android.shadow.okhttp3.HttpUrl$Builder r6 = r6.port(r7)     // Catch: java.lang.Exception -> La5
            com.sendbird.android.shadow.okhttp3.HttpUrl r6 = r6.build()     // Catch: java.lang.Exception -> La5
            r1.url = r6     // Catch: java.lang.Exception -> La5
            java.lang.String r6 = "dns == null"
            java.util.Objects.requireNonNull(r0, r6)     // Catch: java.lang.Exception -> La5
            r1.dns = r0     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = "socketFactory == null"
            java.util.Objects.requireNonNull(r2, r0)     // Catch: java.lang.Exception -> La5
            r1.socketFactory = r2     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = "proxyAuthenticator == null"
            java.util.Objects.requireNonNull(r4, r0)     // Catch: java.lang.Exception -> La5
            r1.proxyAuthenticator = r4     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = "protocols == null"
            r2 = r24
            java.util.Objects.requireNonNull(r2, r0)     // Catch: java.lang.Exception -> La5
            java.util.List r0 = com.sendbird.android.shadow.okhttp3.internal.Util.immutableList(r24)     // Catch: java.lang.Exception -> La5
            r1.protocols = r0     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = "connectionSpecs == null"
            r2 = r25
            java.util.Objects.requireNonNull(r2, r0)     // Catch: java.lang.Exception -> La5
            java.util.List r0 = com.sendbird.android.shadow.okhttp3.internal.Util.immutableList(r25)     // Catch: java.lang.Exception -> La5
            r1.connectionSpecs = r0     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = "proxySelector == null"
            java.util.Objects.requireNonNull(r5, r0)     // Catch: java.lang.Exception -> La5
            r1.proxySelector = r5     // Catch: java.lang.Exception -> La5
            r0 = r23
            r1.proxy = r0     // Catch: java.lang.Exception -> La5
            r1.sslSocketFactory = r3     // Catch: java.lang.Exception -> La5
            r0 = r20
            r1.hostnameVerifier = r0     // Catch: java.lang.Exception -> La5
            r0 = r21
            r1.certificatePinner = r0     // Catch: java.lang.Exception -> La5
            int r0 = com.sendbird.android.shadow.okhttp3.Address.valueOf
            int r0 = r0 + 75
            int r2 = r0 % 128
            com.sendbird.android.shadow.okhttp3.Address.toString = r2
            int r0 = r0 % 2
            return
        La5:
            r0 = move-exception
            throw r0
        La7:
            r0 = move-exception
            r2 = r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.Address.<init>(java.lang.String, int, com.sendbird.android.shadow.okhttp3.Dns, javax.net.SocketFactory, javax.net.ssl.SSLSocketFactory, javax.net.ssl.HostnameVerifier, com.sendbird.android.shadow.okhttp3.CertificatePinner, com.sendbird.android.shadow.okhttp3.Authenticator, java.net.Proxy, java.util.List, java.util.List, java.net.ProxySelector):void");
    }

    public HttpUrl url() {
        HttpUrl httpUrl;
        try {
            int i = toString + 67;
            valueOf = i % 128;
            if ((i % 2 != 0 ? 'J' : '$') != '$') {
                httpUrl = this.url;
                int i2 = 45 / 0;
            } else {
                try {
                    httpUrl = this.url;
                } catch (Exception e) {
                    throw e;
                }
            }
            int i3 = toString + 51;
            valueOf = i3 % 128;
            if ((i3 % 2 != 0 ? 'J' : TokenParser.CR) != 'J') {
                return httpUrl;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return httpUrl;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Dns dns() {
        int i = toString + 61;
        valueOf = i % 128;
        int i2 = i % 2;
        Dns dns = this.dns;
        int i3 = toString + 79;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return dns;
    }

    public SocketFactory socketFactory() {
        int i = toString + 75;
        valueOf = i % 128;
        if ((i % 2 != 0 ? (char) 30 : ':') != 30) {
            return this.socketFactory;
        }
        int i2 = 71 / 0;
        return this.socketFactory;
    }

    public Authenticator proxyAuthenticator() {
        int i = valueOf + 93;
        toString = i % 128;
        if ((i % 2 == 0 ? (char) 2 : '\f') != 2) {
            return this.proxyAuthenticator;
        }
        Authenticator authenticator = this.proxyAuthenticator;
        Object obj = null;
        super.hashCode();
        return authenticator;
    }

    public List<Protocol> protocols() {
        int i = toString + 119;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            List<Protocol> list = this.protocols;
            int i3 = toString + 63;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<ConnectionSpec> connectionSpecs() {
        int i = toString + 95;
        valueOf = i % 128;
        int i2 = i % 2;
        List<ConnectionSpec> list = this.connectionSpecs;
        int i3 = toString + 81;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return list;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return list;
    }

    public ProxySelector proxySelector() {
        int i = valueOf + 101;
        toString = i % 128;
        int i2 = i % 2;
        ProxySelector proxySelector = this.proxySelector;
        int i3 = valueOf + 41;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return proxySelector;
    }

    public Proxy proxy() {
        int i = toString + 95;
        valueOf = i % 128;
        int i2 = i % 2;
        Proxy proxy = this.proxy;
        try {
            int i3 = valueOf + 11;
            toString = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return proxy;
            }
            int i4 = 0 / 0;
            return proxy;
        } catch (Exception e) {
            throw e;
        }
    }

    public SSLSocketFactory sslSocketFactory() {
        int i = toString + 97;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
            return this.sslSocketFactory;
        }
        return this.sslSocketFactory;
    }

    public HostnameVerifier hostnameVerifier() {
        int i = toString + 95;
        valueOf = i % 128;
        if (i % 2 != 0) {
            HostnameVerifier hostnameVerifier = this.hostnameVerifier;
            Object[] objArr = null;
            int length = objArr.length;
            return hostnameVerifier;
        }
        return this.hostnameVerifier;
    }

    public CertificatePinner certificatePinner() {
        try {
            int i = toString + 25;
            valueOf = i % 128;
            int i2 = i % 2;
            CertificatePinner certificatePinner = this.certificatePinner;
            int i3 = valueOf + 15;
            toString = i3 % 128;
            if ((i3 % 2 == 0 ? 'O' : 'U') != 'O') {
                return certificatePinner;
            }
            int i4 = 61 / 0;
            return certificatePinner;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean equals(Object obj) {
        Address address;
        if (obj instanceof Address) {
            int i = valueOf + 73;
            toString = i % 128;
            if ((i % 2 == 0 ? ']' : TokenParser.CR) != '\r') {
                address = (Address) obj;
                boolean equals = this.url.equals(address.url);
                Object obj2 = null;
                super.hashCode();
                if (!(equals)) {
                    return false;
                }
            } else {
                address = (Address) obj;
                if (!this.url.equals(address.url)) {
                    return false;
                }
            }
            int i2 = valueOf + 17;
            toString = i2 % 128;
            int i3 = i2 % 2;
            if (!(equalsNonHost(address))) {
                return false;
            }
            int i4 = valueOf + 17;
            toString = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = this.url.hashCode();
        int hashCode3 = this.dns.hashCode();
        int hashCode4 = this.proxyAuthenticator.hashCode();
        int hashCode5 = this.protocols.hashCode();
        int hashCode6 = this.connectionSpecs.hashCode();
        int hashCode7 = this.proxySelector.hashCode();
        Proxy proxy = this.proxy;
        boolean z = true;
        int i2 = 0;
        if (!(proxy != null)) {
            hashCode = 0;
        } else {
            try {
                hashCode = proxy.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
            if (sSLSocketFactory == null) {
                z = false;
            }
            if (z) {
                int i3 = toString + 15;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                i = sSLSocketFactory.hashCode();
            } else {
                int i5 = valueOf + 65;
                toString = i5 % 128;
                int i6 = i5 % 2;
                i = 0;
            }
            HostnameVerifier hostnameVerifier = this.hostnameVerifier;
            int hashCode8 = (hostnameVerifier != null ? 'Q' : 'H') != 'Q' ? 0 : hostnameVerifier.hashCode();
            CertificatePinner certificatePinner = this.certificatePinner;
            if (certificatePinner != null) {
                int i7 = toString + 3;
                valueOf = i7 % 128;
                if (i7 % 2 != 0) {
                    i2 = certificatePinner.hashCode();
                    Object obj = null;
                    super.hashCode();
                } else {
                    i2 = certificatePinner.hashCode();
                }
            }
            int i8 = ((((((((((((((((((hashCode2 + BR.userTeamVM) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode) * 31) + i) * 31) + hashCode8) * 31) + i2;
            int i9 = valueOf + 49;
            toString = i9 % 128;
            int i10 = i9 % 2;
            return i8;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r4.protocols.equals(r5.protocols) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r4.protocols.equals(r5.protocols) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r4.connectionSpecs.equals(r5.connectionSpecs) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        r0 = org.apache.http.message.TokenParser.SP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        r0 = 'C';
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r0 == ' ') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r4.proxySelector.equals(r5.proxySelector) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (com.sendbird.android.shadow.okhttp3.internal.Util.equal(r4.proxy, r5.proxy) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        r0 = '=';
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        r0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (r0 == '=') goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (com.sendbird.android.shadow.okhttp3.internal.Util.equal(r4.sslSocketFactory, r5.sslSocketFactory) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (com.sendbird.android.shadow.okhttp3.internal.Util.equal(r4.hostnameVerifier, r5.hostnameVerifier) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
        if (com.sendbird.android.shadow.okhttp3.internal.Util.equal(r4.certificatePinner, r5.certificatePinner) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
        r0 = '>';
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        r0 = 'Y';
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (r0 == 'Y') goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        r0 = com.sendbird.android.shadow.okhttp3.Address.valueOf + 27;
        com.sendbird.android.shadow.okhttp3.Address.toString = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (url().port() != r5.url().port()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equalsNonHost(com.sendbird.android.shadow.okhttp3.Address r5) {
        /*
            r4 = this;
            com.sendbird.android.shadow.okhttp3.Dns r0 = r4.dns
            com.sendbird.android.shadow.okhttp3.Dns r1 = r5.dns
            boolean r0 = r0.equals(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lbb
            com.sendbird.android.shadow.okhttp3.Authenticator r0 = r4.proxyAuthenticator
            com.sendbird.android.shadow.okhttp3.Authenticator r3 = r5.proxyAuthenticator
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lbb
            int r0 = com.sendbird.android.shadow.okhttp3.Address.valueOf     // Catch: java.lang.Exception -> Lb9
            int r0 = r0 + 47
            int r3 = r0 % 128
            com.sendbird.android.shadow.okhttp3.Address.toString = r3     // Catch: java.lang.Exception -> Lb9
            int r0 = r0 % 2
            if (r0 != 0) goto L24
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            if (r0 == 0) goto L32
            java.util.List<com.sendbird.android.shadow.okhttp3.Protocol> r0 = r4.protocols
            java.util.List<com.sendbird.android.shadow.okhttp3.Protocol> r3 = r5.protocols
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lbb
            goto L3f
        L32:
            java.util.List<com.sendbird.android.shadow.okhttp3.Protocol> r0 = r4.protocols
            java.util.List<com.sendbird.android.shadow.okhttp3.Protocol> r3 = r5.protocols
            boolean r0 = r0.equals(r3)
            r3 = 62
            int r3 = r3 / r2
            if (r0 == 0) goto Lbb
        L3f:
            java.util.List<com.sendbird.android.shadow.okhttp3.ConnectionSpec> r0 = r4.connectionSpecs
            java.util.List<com.sendbird.android.shadow.okhttp3.ConnectionSpec> r3 = r5.connectionSpecs
            boolean r0 = r0.equals(r3)
            r3 = 32
            if (r0 == 0) goto L4e
            r0 = 32
            goto L50
        L4e:
            r0 = 67
        L50:
            if (r0 == r3) goto L53
            goto Lbb
        L53:
            java.net.ProxySelector r0 = r4.proxySelector
            java.net.ProxySelector r3 = r5.proxySelector
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lbb
            java.net.Proxy r0 = r4.proxy
            java.net.Proxy r3 = r5.proxy
            boolean r0 = com.sendbird.android.shadow.okhttp3.internal.Util.equal(r0, r3)
            r3 = 61
            if (r0 == 0) goto L6c
            r0 = 61
            goto L6e
        L6c:
            r0 = 15
        L6e:
            if (r0 == r3) goto L71
            goto Lbb
        L71:
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactory
            javax.net.ssl.SSLSocketFactory r3 = r5.sslSocketFactory
            boolean r0 = com.sendbird.android.shadow.okhttp3.internal.Util.equal(r0, r3)
            if (r0 == 0) goto Lbb
            javax.net.ssl.HostnameVerifier r0 = r4.hostnameVerifier
            javax.net.ssl.HostnameVerifier r3 = r5.hostnameVerifier
            boolean r0 = com.sendbird.android.shadow.okhttp3.internal.Util.equal(r0, r3)
            if (r0 == 0) goto Lbb
            com.sendbird.android.shadow.okhttp3.CertificatePinner r0 = r4.certificatePinner     // Catch: java.lang.Exception -> Lb5
            com.sendbird.android.shadow.okhttp3.CertificatePinner r3 = r5.certificatePinner     // Catch: java.lang.Exception -> Lb5
            boolean r0 = com.sendbird.android.shadow.okhttp3.internal.Util.equal(r0, r3)     // Catch: java.lang.Exception -> Lb5
            r3 = 89
            if (r0 == 0) goto L94
            r0 = 62
            goto L96
        L94:
            r0 = 89
        L96:
            if (r0 == r3) goto Lbb
            int r0 = com.sendbird.android.shadow.okhttp3.Address.valueOf
            int r0 = r0 + 27
            int r3 = r0 % 128
            com.sendbird.android.shadow.okhttp3.Address.toString = r3
            int r0 = r0 % 2
            com.sendbird.android.shadow.okhttp3.HttpUrl r0 = r4.url()
            int r0 = r0.port()
            com.sendbird.android.shadow.okhttp3.HttpUrl r5 = r5.url()
            int r5 = r5.port()
            if (r0 != r5) goto Lbb
            goto Lc6
        Lb5:
            r5 = move-exception
            throw r5
        Lb7:
            r5 = move-exception
            throw r5
        Lb9:
            r5 = move-exception
            throw r5
        Lbb:
            int r5 = com.sendbird.android.shadow.okhttp3.Address.valueOf
            int r5 = r5 + 91
            int r0 = r5 % 128
            com.sendbird.android.shadow.okhttp3.Address.toString = r0
            int r5 = r5 % 2
            r1 = 0
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.Address.equalsNonHost(com.sendbird.android.shadow.okhttp3.Address):boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.url.host());
        sb.append(":");
        sb.append(this.url.port());
        if (!(this.proxy == null)) {
            int i = valueOf + 117;
            toString = i % 128;
            if ((i % 2 == 0 ? 'D' : ';') == 'D') {
                try {
                    sb.append(", proxy=");
                    sb.append(this.proxy);
                    Object[] objArr = null;
                    int length = objArr.length;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    sb.append(", proxy=");
                    sb.append(this.proxy);
                } catch (Exception e2) {
                    throw e2;
                }
            }
        } else {
            sb.append(", proxySelector=");
            sb.append(this.proxySelector);
        }
        sb.append("}");
        String sb2 = sb.toString();
        int i2 = toString + 121;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return sb2;
    }

    private static String ah$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ah$a[move.values + i2] ^ (move.values * ag$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
