package o;

import com.app.dream11.react.Dream11ReactBridge;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
/* loaded from: classes4.dex */
public interface AutoScrollHelper {
    void ag$a(String str, String str2, String str3, String str4, int i, requestPermission requestpermission);

    void ah$a();

    /* loaded from: classes4.dex */
    public class ScrollAnimationRunnable {
        private setButtonTintList toString;

        public ScrollAnimationRunnable(setButtonTintList setbuttontintlist) {
            this.toString = setbuttontintlist;
        }

        /* loaded from: classes4.dex */
        class values implements requestPermission, Runnable {
            private requestPermission ag$a;
            private int toString;
            private boolean valueOf = false;
            private String values;

            public values(requestPermission requestpermission, int i, String str) {
                this.ag$a = requestpermission;
                this.toString = i;
                this.values = str;
            }

            @Override // o.requestPermission
            public void valueOf(boolean z, String str) {
                if (this.valueOf) {
                    return;
                }
                this.valueOf = true;
                this.ag$a.valueOf(z, str);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.valueOf) {
                    return;
                }
                this.valueOf = true;
                requestPermission requestpermission = this.ag$a;
                requestpermission.valueOf(false, this.values + " (" + this.toString + " ms)");
            }
        }

        public requestPermission ah$a(requestPermission requestpermission, int i, String str) {
            values valuesVar = new values(requestpermission, i, str);
            this.toString.valueOf(valuesVar, i, "CallbackWithTimeout.wrap");
            return valuesVar;
        }
    }

    /* loaded from: classes4.dex */
    public class ClampedScroller implements Runnable {
        private String ag$a;
        private String ah$a;
        private String ah$b;
        private int toString;
        private String valueOf;
        private requestPermission values = null;

        public void ah$a(String str, String str2, String str3, String str4, int i, requestPermission requestpermission) {
            if (str == null) {
                str = "POST";
            }
            this.ag$a = str;
            this.ah$b = str2;
            this.ah$a = str3;
            if (str4 == null) {
                str4 = Dream11ReactBridge.VALUE_ACCEPT_HEADER;
            }
            this.valueOf = str4;
            this.toString = i;
            this.values = requestpermission;
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper$ClampedScroller$ah$a ag$a = ag$a();
            ah$a(ag$a.toString, ag$a.values);
        }

        private void ah$a(boolean z, String str) {
            requestPermission requestpermission = this.values;
            if (requestpermission != null) {
                requestpermission.valueOf(z, str);
            }
            this.values = null;
        }

        private AutoScrollHelper$ClampedScroller$ah$a ag$a() {
            String str;
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.ah$b).openConnection();
                    httpURLConnection.setReadTimeout(this.toString);
                    httpURLConnection.setConnectTimeout(this.toString);
                    try {
                        httpURLConnection.setRequestMethod(this.ag$a);
                    } catch (ProtocolException unused) {
                        this.ag$a = "POST";
                        httpURLConnection.setRequestMethod("POST");
                    }
                    httpURLConnection.setRequestProperty("Content-Type", this.valueOf);
                    httpURLConnection.setRequestProperty("User-Agent", setMinimumVelocity.valueOf());
                    int i = -1;
                    if (this.ag$a.equals("POST")) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setUseCaches(false);
                        byte[] bytes = this.ah$a.getBytes("UTF-8");
                        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                        try {
                            try {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                bufferedOutputStream.write(bytes);
                                bufferedOutputStream.close();
                                httpURLConnection.connect();
                                try {
                                    int responseCode = httpURLConnection.getResponseCode();
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                                        byte[] bArr = new byte[1024];
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        while (true) {
                                            int read = bufferedInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            byteArrayOutputStream.write(bArr, 0, read);
                                        }
                                        i = responseCode;
                                        str = new String(byteArrayOutputStream.toByteArray());
                                    } catch (IOException e) {
                                        return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e.getLocalizedMessage());
                                    }
                                } catch (IOException e2) {
                                    return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e2.getLocalizedMessage());
                                }
                            } catch (IOException e3) {
                                return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e3.getLocalizedMessage());
                            } finally {
                                httpURLConnection.disconnect();
                            }
                        } catch (IOException e4) {
                            return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e4.getLocalizedMessage());
                        } catch (IllegalStateException e5) {
                            return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e5.getLocalizedMessage());
                        }
                    } else {
                        str = "";
                    }
                    if (i == 200) {
                        return new AutoScrollHelper$ClampedScroller$ah$a(this, true, str);
                    }
                    return new AutoScrollHelper$ClampedScroller$ah$a(this, false, "Status code in HTTP response is not OK: " + i);
                } catch (IOException e6) {
                    return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e6.getLocalizedMessage());
                }
            } catch (ArrayIndexOutOfBoundsException e7) {
                return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e7.getLocalizedMessage());
            } catch (MalformedURLException e8) {
                return new AutoScrollHelper$ClampedScroller$ah$a(this, false, e8.getLocalizedMessage());
            }
        }
    }
}
