package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* loaded from: classes4.dex */
public final class dx extends cs {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private final DatagramPacket f1021b;
    private Uri c;
    private DatagramSocket d;
    private MulticastSocket e;
    private InetAddress f;
    private boolean g;
    private int h;

    public dx() {
        super(true);
        byte[] bArr = new byte[2000];
        this.a = bArr;
        this.f1021b = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.k
    public final int a(byte[] bArr, int i, int i2) throws dw {
        if (i2 == 0) {
            return 0;
        }
        if (this.h == 0) {
            try {
                DatagramSocket datagramSocket = this.d;
                af.s(datagramSocket);
                datagramSocket.receive(this.f1021b);
                int length = this.f1021b.getLength();
                this.h = length;
                g(length);
            } catch (SocketTimeoutException e) {
                throw new dw(e, 2002);
            } catch (IOException e2) {
                throw new dw(e2, 2001);
            }
        }
        int length2 = this.f1021b.getLength();
        int i3 = this.h;
        int min = Math.min(i3, i2);
        System.arraycopy(this.a, length2 - i3, bArr, i, min);
        this.h -= min;
        return min;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final long b(db dbVar) throws dw {
        Uri uri = dbVar.a;
        this.c = uri;
        String host = uri.getHost();
        af.s(host);
        int port = this.c.getPort();
        i(dbVar);
        try {
            this.f = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f, port);
            if (this.f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.e = multicastSocket;
                multicastSocket.joinGroup(this.f);
                this.d = this.e;
            } else {
                this.d = new DatagramSocket(inetSocketAddress);
            }
            this.d.setSoTimeout(8000);
            this.g = true;
            j(dbVar);
            return -1L;
        } catch (IOException e) {
            throw new dw(e, 2001);
        } catch (SecurityException e2) {
            throw new dw(e2, 2006);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final Uri c() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cx
    public final void d() {
        this.c = null;
        MulticastSocket multicastSocket = this.e;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f;
                af.s(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.e = null;
        }
        DatagramSocket datagramSocket = this.d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.d = null;
        }
        this.f = null;
        this.h = 0;
        if (this.g) {
            this.g = false;
            h();
        }
    }
}
