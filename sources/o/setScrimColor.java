package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes4.dex */
public class setScrimColor extends SSLSocketFactory {
    private SSLSocketFactory valueOf;

    public setScrimColor() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.valueOf = sSLContext.getSocketFactory();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.valueOf.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.valueOf.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return ag$a(this.valueOf.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return ag$a(this.valueOf.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return ag$a(this.valueOf.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return ag$a(this.valueOf.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return ag$a(this.valueOf.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return ag$a(this.valueOf.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private Socket ag$a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }
}
