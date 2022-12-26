package org.apache.http.conn.routing;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.getDouble;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;
/* loaded from: classes5.dex */
public final class HttpRoute implements RouteInfo, Cloneable {
    private static int[] ag$a = {-1590485501, -2139529227, -758713655, -383674138, 1163660042, -1952095939, -325817877, -2036014659, 1810452239, 906388977, -1453391770, -1725468146, -1738886233, 1899006367, 211430225, 1498539926, 546186885, 827312544};
    private static int toString = 1;
    private static int values;
    private final RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private final List<HttpHost> proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final RouteInfo.TunnelType tunnelled;

    private HttpRoute(HttpHost httpHost, InetAddress inetAddress, List<HttpHost> list, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        Args.notNull(httpHost, "Target host");
        this.targetHost = normalize(httpHost);
        this.localAddress = inetAddress;
        if (list != null && !list.isEmpty()) {
            this.proxyChain = new ArrayList(list);
            int i = values + 49;
            toString = i % 128;
            int i2 = i % 2;
        } else {
            this.proxyChain = null;
        }
        if (!(tunnelType != RouteInfo.TunnelType.TUNNELLED)) {
            int i3 = values + 63;
            toString = i3 % 128;
            int i4 = i3 % 2;
            try {
                Args.check(this.proxyChain != null, "Proxy required if tunnelled");
            } catch (Exception e) {
                throw e;
            }
        }
        this.secure = z;
        if (tunnelType == null) {
            tunnelType = RouteInfo.TunnelType.PLAIN;
            try {
                int i5 = toString + 79;
                values = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        this.tunnelled = tunnelType;
        this.layered = layerType == null ? RouteInfo.LayerType.PLAIN : layerType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if ((org.apache.http.HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(r4)) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        r4 = org.apache.http.conn.routing.HttpRoute.toString + 35;
        org.apache.http.conn.routing.HttpRoute.values = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        return 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (ag$a(new int[]{-837829776, -1905169502, -1834258117, -596192387}, 5 - android.graphics.Color.red(0)).intern().equalsIgnoreCase(r4) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        r4 = org.apache.http.conn.routing.HttpRoute.values + 117;
        org.apache.http.conn.routing.HttpRoute.toString = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        return androidx.databinding.library.baseAdapters.BR.sortFilterHandler;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getDefaultPort(java.lang.String r4) {
        /*
            int r0 = org.apache.http.conn.routing.HttpRoute.values
            int r0 = r0 + 121
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            java.lang.String r3 = "http"
            if (r0 == 0) goto L21
            boolean r0 = r3.equalsIgnoreCase(r4)
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == r2) goto L2b
            goto L38
        L21:
            boolean r0 = r3.equalsIgnoreCase(r4)
            r2 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L38
        L2b:
            int r4 = org.apache.http.conn.routing.HttpRoute.toString
            int r4 = r4 + 35
            int r0 = r4 % 128
            org.apache.http.conn.routing.HttpRoute.values = r0
            int r4 = r4 % 2
            r4 = 80
            return r4
        L38:
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0064: FILL_ARRAY_DATA  , data: [-837829776, -1905169502, -1834258117, -596192387} // fill-array
            int r1 = android.graphics.Color.red(r1)
            int r1 = 5 - r1
            java.lang.String r0 = ag$a(r0, r1)
            java.lang.String r0 = r0.intern()
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L5f
            int r4 = org.apache.http.conn.routing.HttpRoute.values
            int r4 = r4 + 117
            int r0 = r4 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r0
            int r4 = r4 % 2
            r4 = 443(0x1bb, float:6.21E-43)
            return r4
        L5f:
            r4 = -1
            return r4
        L61:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.getDefaultPort(java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r3.getPort() >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        r0 = r3.getAddress();
        r1 = r3.getSchemeName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        r3 = new org.apache.http.HttpHost(r0, getDefaultPort(r1), r1);
        r0 = org.apache.http.conn.routing.HttpRoute.values + 75;
        org.apache.http.conn.routing.HttpRoute.toString = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        return new org.apache.http.HttpHost(r3.getHostName(), getDefaultPort(r1), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0 >= 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.apache.http.HttpHost normalize(org.apache.http.HttpHost r3) {
        /*
            int r0 = org.apache.http.conn.routing.HttpRoute.toString
            int r0 = r0 + 101
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.values = r1
            int r0 = r0 % 2
            r1 = 43
            if (r0 == 0) goto L11
            r0 = 78
            goto L13
        L11:
            r0 = 43
        L13:
            if (r0 == r1) goto L20
            int r0 = r3.getPort()
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L1e
            if (r0 < 0) goto L27
            goto L26
        L1e:
            r3 = move-exception
            throw r3
        L20:
            int r0 = r3.getPort()
            if (r0 < 0) goto L27
        L26:
            return r3
        L27:
            java.net.InetAddress r0 = r3.getAddress()     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = r3.getSchemeName()     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L47
            org.apache.http.HttpHost r3 = new org.apache.http.HttpHost
            int r2 = getDefaultPort(r1)     // Catch: java.lang.Exception -> L45
            r3.<init>(r0, r2, r1)
            int r0 = org.apache.http.conn.routing.HttpRoute.values
            int r0 = r0 + 75
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r1
            int r0 = r0 % 2
            goto L55
        L45:
            r3 = move-exception
            throw r3
        L47:
            org.apache.http.HttpHost r0 = new org.apache.http.HttpHost
            java.lang.String r3 = r3.getHostName()
            int r2 = getDefaultPort(r1)
            r0.<init>(r3, r2, r1)
            r3 = r0
        L55:
            return r3
        L56:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.normalize(org.apache.http.HttpHost):org.apache.http.HttpHost");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpRoute(org.apache.http.HttpHost r9, java.net.InetAddress r10, org.apache.http.HttpHost[] r11, boolean r12, org.apache.http.conn.routing.RouteInfo.TunnelType r13, org.apache.http.conn.routing.RouteInfo.LayerType r14) {
        /*
            r8 = this;
            r0 = 65
            if (r11 == 0) goto L7
            r1 = 65
            goto L9
        L7:
            r1 = 47
        L9:
            if (r1 == r0) goto L18
            r11 = 0
            int r0 = org.apache.http.conn.routing.HttpRoute.values
            int r0 = r0 + 101
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r1
        L14:
            int r0 = r0 % 2
            r4 = r11
            goto L25
        L18:
            java.util.List r11 = java.util.Arrays.asList(r11)
            int r0 = org.apache.http.conn.routing.HttpRoute.toString
            int r0 = r0 + 121
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.values = r1
            goto L14
        L25:
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.<init>(org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.HttpHost[], boolean, org.apache.http.conn.routing.RouteInfo$TunnelType, org.apache.http.conn.routing.RouteInfo$LayerType):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpRoute(org.apache.http.HttpHost r9, java.net.InetAddress r10, org.apache.http.HttpHost r11, boolean r12, org.apache.http.conn.routing.RouteInfo.TunnelType r13, org.apache.http.conn.routing.RouteInfo.LayerType r14) {
        /*
            r8 = this;
            r0 = 69
            r1 = 65
            if (r11 == 0) goto L9
            r2 = 69
            goto Lb
        L9:
            r2 = 65
        Lb:
            if (r2 == r0) goto L10
            r11 = 0
        Le:
            r4 = r11
            goto L28
        L10:
            int r0 = org.apache.http.conn.routing.HttpRoute.values
            int r0 = r0 + 107
            int r2 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r2
            int r0 = r0 % 2
            java.util.List r11 = java.util.Collections.singletonList(r11)
            int r0 = org.apache.http.conn.routing.HttpRoute.toString
            int r0 = r0 + r1
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.values = r1
            int r0 = r0 % 2
            goto Le
        L28:
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.<init>(org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.HttpHost, boolean, org.apache.http.conn.routing.RouteInfo$TunnelType, org.apache.http.conn.routing.RouteInfo$LayerType):void");
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, boolean z) {
        this(httpHost, inetAddress, Collections.emptyList(), z, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost) {
        this(httpHost, (InetAddress) null, (List<HttpHost>) Collections.emptyList(), false, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpRoute(org.apache.http.HttpHost r8, java.net.InetAddress r9, org.apache.http.HttpHost r10, boolean r11) {
        /*
            r7 = this;
            java.lang.String r0 = "Proxy host"
            java.lang.Object r10 = org.apache.http.util.Args.notNull(r10, r0)
            java.util.List r3 = java.util.Collections.singletonList(r10)
            r10 = 72
            if (r11 == 0) goto L11
            r0 = 72
            goto L13
        L11:
            r0 = 95
        L13:
            if (r0 == r10) goto L18
            org.apache.http.conn.routing.RouteInfo$TunnelType r10 = org.apache.http.conn.routing.RouteInfo.TunnelType.PLAIN     // Catch: java.lang.Exception -> L5d
            goto L1a
        L18:
            org.apache.http.conn.routing.RouteInfo$TunnelType r10 = org.apache.http.conn.routing.RouteInfo.TunnelType.TUNNELLED     // Catch: java.lang.Exception -> L5d
        L1a:
            r5 = r10
            if (r11 == 0) goto L48
            int r10 = org.apache.http.conn.routing.HttpRoute.values
            int r10 = r10 + 87
            int r0 = r10 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r0
            int r10 = r10 % 2
            r0 = 46
            if (r10 != 0) goto L2e
            r10 = 46
            goto L30
        L2e:
            r10 = 49
        L30:
            if (r10 == r0) goto L35
            org.apache.http.conn.routing.RouteInfo$LayerType r10 = org.apache.http.conn.routing.RouteInfo.LayerType.LAYERED
            goto L3b
        L35:
            org.apache.http.conn.routing.RouteInfo$LayerType r10 = org.apache.http.conn.routing.RouteInfo.LayerType.LAYERED     // Catch: java.lang.Exception -> L46
            r0 = 67
            int r0 = r0 / 0
        L3b:
            int r0 = org.apache.http.conn.routing.HttpRoute.values
            int r0 = r0 + 41
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r1
            goto L52
        L44:
            r8 = move-exception
            throw r8
        L46:
            r8 = move-exception
            throw r8
        L48:
            org.apache.http.conn.routing.RouteInfo$LayerType r10 = org.apache.http.conn.routing.RouteInfo.LayerType.PLAIN
            int r0 = org.apache.http.conn.routing.HttpRoute.toString
            int r0 = r0 + 17
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.values = r1
        L52:
            int r0 = r0 % 2
            r6 = r10
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L5d:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.<init>(org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.HttpHost, boolean):void");
    }

    public HttpRoute(HttpHost httpHost, HttpHost httpHost2) {
        this(httpHost, null, httpHost2, false);
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getTargetHost() {
        int i = values + 109;
        toString = i % 128;
        int i2 = i % 2;
        try {
            HttpHost httpHost = this.targetHost;
            try {
                int i3 = toString + 111;
                values = i3 % 128;
                int i4 = i3 % 2;
                return httpHost;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final InetAddress getLocalAddress() {
        int i = toString + 81;
        values = i % 128;
        int i2 = i % 2;
        InetAddress inetAddress = this.localAddress;
        int i3 = toString + 35;
        values = i3 % 128;
        if ((i3 % 2 != 0 ? '8' : (char) 30) != '8') {
            return inetAddress;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return inetAddress;
    }

    public final InetSocketAddress getLocalSocketAddress() {
        InetSocketAddress inetSocketAddress;
        int i;
        if (this.localAddress != null) {
            try {
                inetSocketAddress = new InetSocketAddress(this.localAddress, 0);
                i = toString + 45;
            } catch (Exception e) {
                throw e;
            }
        } else {
            inetSocketAddress = null;
            i = toString + 99;
        }
        values = i % 128;
        int i2 = i % 2;
        return inetSocketAddress;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final int getHopCount() {
        List<HttpHost> list;
        int i = toString + 115;
        values = i % 128;
        if (i % 2 != 0) {
            list = this.proxyChain;
            if (list == null) {
                return 0;
            }
        } else {
            list = this.proxyChain;
            if (list == null) {
                return 1;
            }
        }
        int size = list.size() + 1;
        int i2 = toString + 17;
        values = i2 % 128;
        int i3 = i2 % 2;
        return size;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getHopTarget(int i) {
        HttpHost httpHost;
        Args.notNegative(i, "Hop index");
        int hopCount = getHopCount();
        Args.check(i < hopCount, "Hop index exceeds tracked route length");
        if (i < hopCount - 1) {
            int i2 = values + 73;
            toString = i2 % 128;
            if ((i2 % 2 == 0 ? '>' : (char) 31) != 31) {
                try {
                    httpHost = this.proxyChain.get(i);
                    int i3 = 68 / 0;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                httpHost = this.proxyChain.get(i);
            }
        } else {
            httpHost = this.targetHost;
            int i4 = values + 27;
            toString = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = values + 105;
        toString = i6 % 128;
        if (!(i6 % 2 == 0)) {
            return httpHost;
        }
        int i7 = 77 / 0;
        return httpHost;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        if ((r0 != null ? '9' : org.apache.http.message.TokenParser.CR) != '9') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r0.isEmpty() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        r0 = r4.proxyChain.get(0);
        r2 = org.apache.http.conn.routing.HttpRoute.values + 79;
        org.apache.http.conn.routing.HttpRoute.toString = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        r0 = null;
     */
    @Override // org.apache.http.conn.routing.RouteInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.apache.http.HttpHost getProxyHost() {
        /*
            r4 = this;
            int r0 = org.apache.http.conn.routing.HttpRoute.values
            int r0 = r0 + 121
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L20
            java.util.List<org.apache.http.HttpHost> r0 = r4.proxyChain
            super.hashCode()     // Catch: java.lang.Throwable -> L1e
            r2 = 57
            if (r0 == 0) goto L19
            r3 = 57
            goto L1b
        L19:
            r3 = 13
        L1b:
            if (r3 == r2) goto L24
            goto L3e
        L1e:
            r0 = move-exception
            throw r0
        L20:
            java.util.List<org.apache.http.HttpHost> r0 = r4.proxyChain     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L3e
        L24:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            java.util.List<org.apache.http.HttpHost> r0 = r4.proxyChain
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            org.apache.http.HttpHost r0 = (org.apache.http.HttpHost) r0
            int r2 = org.apache.http.conn.routing.HttpRoute.values
            int r2 = r2 + 79
            int r3 = r2 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r3
            int r2 = r2 % 2
            goto L3f
        L3e:
            r0 = r1
        L3f:
            int r2 = org.apache.http.conn.routing.HttpRoute.values
            int r2 = r2 + 73
            int r3 = r2 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r3
            int r2 = r2 % 2
            r3 = 60
            if (r2 != 0) goto L50
            r2 = 24
            goto L52
        L50:
            r2 = 60
        L52:
            if (r2 == r3) goto L58
            int r1 = r1.length     // Catch: java.lang.Throwable -> L56
            return r0
        L56:
            r0 = move-exception
            throw r0
        L58:
            return r0
        L59:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.getProxyHost():org.apache.http.HttpHost");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final RouteInfo.TunnelType getTunnelType() {
        int i = toString + 5;
        values = i % 128;
        if ((i % 2 != 0 ? '#' : TokenParser.ESCAPE) != '#') {
            return this.tunnelled;
        }
        RouteInfo.TunnelType tunnelType = this.tunnelled;
        Object obj = null;
        super.hashCode();
        return tunnelType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if ((r5.tunnelled != org.apache.http.conn.routing.RouteInfo.TunnelType.TUNNELLED) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r5.tunnelled == org.apache.http.conn.routing.RouteInfo.TunnelType.TUNNELLED) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        r0 = org.apache.http.conn.routing.HttpRoute.toString + 101;
        org.apache.http.conn.routing.HttpRoute.values = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return true;
     */
    @Override // org.apache.http.conn.routing.RouteInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isTunnelled() {
        /*
            r5 = this;
            int r0 = org.apache.http.conn.routing.HttpRoute.values     // Catch: java.lang.Exception -> L3b
            int r0 = r0 + 105
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.toString = r1     // Catch: java.lang.Exception -> L3b
            int r0 = r0 % 2
            r1 = 71
            if (r0 != 0) goto L11
            r0 = 52
            goto L13
        L11:
            r0 = 71
        L13:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L28
            org.apache.http.conn.routing.RouteInfo$TunnelType r0 = r5.tunnelled
            org.apache.http.conn.routing.RouteInfo$TunnelType r1 = org.apache.http.conn.routing.RouteInfo.TunnelType.TUNNELLED
            r4 = 18
            int r4 = r4 / r3
            if (r0 != r1) goto L22
            r0 = 0
            goto L23
        L22:
            r0 = 1
        L23:
            if (r0 == 0) goto L2e
            goto L39
        L26:
            r0 = move-exception
            throw r0
        L28:
            org.apache.http.conn.routing.RouteInfo$TunnelType r0 = r5.tunnelled     // Catch: java.lang.Exception -> L3b
            org.apache.http.conn.routing.RouteInfo$TunnelType r1 = org.apache.http.conn.routing.RouteInfo.TunnelType.TUNNELLED     // Catch: java.lang.Exception -> L3b
            if (r0 != r1) goto L39
        L2e:
            int r0 = org.apache.http.conn.routing.HttpRoute.toString     // Catch: java.lang.Exception -> L3b
            int r0 = r0 + 101
            int r1 = r0 % 128
            org.apache.http.conn.routing.HttpRoute.values = r1
            int r0 = r0 % 2
            goto L3a
        L39:
            r2 = 0
        L3a:
            return r2
        L3b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.routing.HttpRoute.isTunnelled():boolean");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final RouteInfo.LayerType getLayerType() {
        int i = values + 89;
        toString = i % 128;
        if ((i % 2 == 0 ? (char) 30 : 'W') != 'W') {
            RouteInfo.LayerType layerType = this.layered;
            Object[] objArr = null;
            int length = objArr.length;
            return layerType;
        }
        return this.layered;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isLayered() {
        int i = values + 33;
        toString = i % 128;
        if (i % 2 == 0) {
            try {
                RouteInfo.LayerType layerType = this.layered;
                RouteInfo.LayerType layerType2 = RouteInfo.LayerType.LAYERED;
                Object obj = null;
                super.hashCode();
                if (!(layerType == layerType2)) {
                    return false;
                }
            } catch (Exception e) {
                throw e;
            }
        } else if (this.layered != RouteInfo.LayerType.LAYERED) {
            return false;
        }
        int i2 = values + 15;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isSecure() {
        int i = toString + 7;
        values = i % 128;
        try {
            if ((i % 2 != 0 ? (char) 26 : TokenParser.SP) != 26) {
                return this.secure;
            }
            boolean z = this.secure;
            Object obj = null;
            super.hashCode();
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        int i = values + 113;
        toString = i % 128;
        int i2 = i % 2;
        if (this != obj) {
            if ((obj instanceof HttpRoute ? '!' : (char) 7) != 7) {
                try {
                    HttpRoute httpRoute = (HttpRoute) obj;
                    if (this.secure == httpRoute.secure) {
                        if (!(this.tunnelled != httpRoute.tunnelled)) {
                            int i3 = values + 9;
                            toString = i3 % 128;
                            int i4 = i3 % 2;
                            if (this.layered == httpRoute.layered) {
                                int i5 = toString + 111;
                                values = i5 % 128;
                                int i6 = i5 % 2;
                                if ((LangUtils.equals(this.targetHost, httpRoute.targetHost)) && LangUtils.equals(this.localAddress, httpRoute.localAddress)) {
                                    try {
                                        return LangUtils.equals(this.proxyChain, httpRoute.proxyChain);
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Iterator<HttpHost> it;
        int i = values + 63;
        toString = i % 128;
        int i2 = i % 2;
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.targetHost), this.localAddress);
        List<HttpHost> list = this.proxyChain;
        if (list != null) {
            int i3 = toString + 5;
            values = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 27 : '&') != 27) {
                it = list.iterator();
            } else {
                it = list.iterator();
                Object obj = null;
                super.hashCode();
            }
            while (true) {
                if ((it.hasNext() ? 'C' : TokenParser.CR) != 'C') {
                    break;
                }
                hashCode = LangUtils.hashCode(hashCode, it.next());
            }
        }
        int hashCode2 = LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(hashCode, this.secure), this.tunnelled), this.layered);
        int i4 = toString + 9;
        values = i4 % 128;
        int i5 = i4 % 2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if ((this.tunnelled == RouteInfo.TunnelType.TUNNELLED ? (char) 22 : (char) 14) != 14) {
            int i = toString + 41;
            values = i % 128;
            int i2 = i % 2;
            sb.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            int i3 = values + 9;
            toString = i3 % 128;
            sb.append(i3 % 2 == 0 ? TokenParser.CR : 'l');
        }
        if (!(!this.secure)) {
            int i4 = toString + 101;
            values = i4 % 128;
            int i5 = i4 % 2;
            sb.append('s');
        }
        sb.append("}->");
        List<HttpHost> list = this.proxyChain;
        if (list != null) {
            Iterator<HttpHost> it = list.iterator();
            int i6 = toString + 73;
            values = i6 % 128;
            int i7 = i6 % 2;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i8 = values + 113;
                toString = i8 % 128;
                if ((i8 % 2 == 0 ? '\n' : (char) 20) != '\n') {
                    try {
                        sb.append(it.next());
                        sb.append("->");
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    sb.append(it.next());
                    sb.append("->");
                    Object obj = null;
                    super.hashCode();
                }
            }
        }
        sb.append(this.targetHost);
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        int i = values + 115;
        toString = i % 128;
        int i2 = i % 2;
        Object clone = super.clone();
        int i3 = toString + 17;
        values = i3 % 128;
        int i4 = i3 % 2;
        return clone;
    }

    private static String ag$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ag$a.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
