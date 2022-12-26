package o;

import com.RNFetchBlob.RNFetchBlob;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes6.dex */
public class getCurrentVolume {
    public static String ag$a(String str) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                int length = digest.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02x", Integer.valueOf(digest[i] & 255)));
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ah$a(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "warn");
        createMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobMessage", createMap);
    }

    public static OkHttpClient.Builder ag$a(OkHttpClient okHttpClient) {
        try {
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: o.getCurrentVolume.5
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            newBuilder.sslSocketFactory(socketFactory, x509TrustManager);
            newBuilder.hostnameVerifier(new HostnameVerifier() { // from class: o.getCurrentVolume.2
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            });
            return newBuilder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
