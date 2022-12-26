package com.google.android.gms.internal.p003firebaseauthapi;

import com.app.dream11.react.Dream11ReactBridge;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvb {
    public static void zza(String str, zzui zzuiVar, zzuz zzuzVar, Type type, zzum zzumVar) {
        InputStream errorStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzuiVar.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", Dream11ReactBridge.VALUE_ACCEPT_HEADER);
            httpURLConnection.setConnectTimeout(60000);
            zzumVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (zzb(responseCode)) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (!zzb(responseCode)) {
                    zzuzVar.zza((String) zzuh.zza(sb2, String.class));
                } else {
                    zzuzVar.zzb((zzuj) zzuh.zza(sb2, type));
                }
            } catch (Throwable th3) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (zzpz e) {
            e = e;
            zzuzVar.zza(e.getMessage());
        } catch (SocketTimeoutException unused) {
            zzuzVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzuzVar.zza("<<Network Error>>");
        } catch (IOException e2) {
            e = e2;
            zzuzVar.zza(e.getMessage());
        } catch (JSONException e3) {
            e = e3;
            zzuzVar.zza(e.getMessage());
        }
    }

    private static final boolean zzb(int i) {
        return i >= 200 && i < 300;
    }
}
