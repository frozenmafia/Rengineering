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
/* loaded from: classes5.dex */
public class isEnabledFallback extends SSLSocketFactory {
    public SSLSocketFactory toString;

    public isEnabledFallback() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.toString = sSLContext.getSocketFactory();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return values(this.toString.createSocket());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return values(this.toString.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return values(this.toString.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return values(this.toString.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return values(this.toString.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return values(this.toString.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.toString.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.toString.getSupportedCipherSuites();
    }

    public final Socket values(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }
}
