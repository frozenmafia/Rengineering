package com.appsamurai.storyly.exoplayer2.datasource.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import o.FingerprintManagerCompat;
import o.SplashScreen;
import o.SplashScreen$Impl31$hierarchyListener$1;
/* loaded from: classes3.dex */
public final class UdpDataSource extends SplashScreen.Impl31 {
    private DatagramSocket HaptikSDK$a;
    private Uri HaptikSDK$b;
    private final int HaptikSDK$c;
    private boolean ag$a;
    private MulticastSocket ah$a;
    private int invoke;
    private final DatagramPacket toString;
    private InetAddress valueOf;
    private final byte[] values;

    /* loaded from: classes3.dex */
    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    public UdpDataSource(int i) {
        this(i, 8000);
    }

    public UdpDataSource(int i, int i2) {
        super(true);
        this.HaptikSDK$c = i2;
        byte[] bArr = new byte[i];
        this.values = bArr;
        this.toString = new DatagramPacket(bArr, 0, i);
    }

    @Override // o.computeDecorFitsWindow
    public long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) throws UdpDataSourceException {
        Uri uri = splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b;
        this.HaptikSDK$b = uri;
        String str = (String) FingerprintManagerCompat.toString(uri.getHost());
        int port = this.HaptikSDK$b.getPort();
        ah$a(splashScreen$Impl31$hierarchyListener$1);
        try {
            this.valueOf = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.valueOf, port);
            if (this.valueOf.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.ah$a = multicastSocket;
                multicastSocket.joinGroup(this.valueOf);
                this.HaptikSDK$a = this.ah$a;
            } else {
                this.HaptikSDK$a = new DatagramSocket(inetSocketAddress);
            }
            this.HaptikSDK$a.setSoTimeout(this.HaptikSDK$c);
            this.ag$a = true;
            toString(splashScreen$Impl31$hierarchyListener$1);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // o.unwrapCryptoObject
    public int values(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.invoke == 0) {
            try {
                ((DatagramSocket) FingerprintManagerCompat.toString(this.HaptikSDK$a)).receive(this.toString);
                int length = this.toString.getLength();
                this.invoke = length;
                ah$a(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.toString.getLength();
        int i3 = this.invoke;
        int min = Math.min(i3, i2);
        System.arraycopy(this.values, length2 - i3, bArr, i, min);
        this.invoke -= min;
        return min;
    }

    @Override // o.computeDecorFitsWindow
    public Uri ah$a() {
        return this.HaptikSDK$b;
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() {
        this.HaptikSDK$b = null;
        MulticastSocket multicastSocket = this.ah$a;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) FingerprintManagerCompat.toString(this.valueOf));
            } catch (IOException unused) {
            }
            this.ah$a = null;
        }
        DatagramSocket datagramSocket = this.HaptikSDK$a;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.HaptikSDK$a = null;
        }
        this.valueOf = null;
        this.invoke = 0;
        if (this.ag$a) {
            this.ag$a = false;
            values();
        }
    }
}
