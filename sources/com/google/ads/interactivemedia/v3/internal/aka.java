package com.google.ads.interactivemedia.v3.internal;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aka implements akb {
    private aka() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ aka(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akb
    public final com.google.ads.interactivemedia.v3.impl.data.bs a(com.google.ads.interactivemedia.v3.impl.data.br brVar) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(brVar.url()).openConnection();
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setRequestProperty("User-Agent", brVar.userAgent());
            httpURLConnection.setConnectTimeout(brVar.connectionTimeoutMs());
            httpURLConnection.setReadTimeout(brVar.readTimeoutMs());
            if (brVar.requestType() == com.google.ads.interactivemedia.v3.impl.data.bq.POST) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setChunkedStreamingMode(0);
                String content = brVar.content();
                if (content != null) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(content.getBytes(StandardCharsets.UTF_8));
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Throwable th2) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th3) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            }
                        }
                        throw th2;
                    }
                }
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, StandardCharsets.UTF_8));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                String sb2 = sb.toString();
                if (inputStream != null) {
                    inputStream.close();
                }
                String contentType = httpURLConnection.getContentType();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return com.google.ads.interactivemedia.v3.impl.data.bs.forResponse(brVar.id(), sb2, contentType);
            } catch (Throwable th4) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th5) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnection2 = httpURLConnection;
            if (e instanceof SocketTimeoutException) {
                com.google.ads.interactivemedia.v3.impl.data.bs forError = com.google.ads.interactivemedia.v3.impl.data.bs.forError(brVar.id(), 101);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return forError;
            }
            com.google.ads.interactivemedia.v3.impl.data.bs forError2 = com.google.ads.interactivemedia.v3.impl.data.bs.forError(brVar.id(), 100);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return forError2;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }
}
