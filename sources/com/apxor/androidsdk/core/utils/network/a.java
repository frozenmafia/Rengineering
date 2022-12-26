package com.apxor.androidsdk.core.utils.network;

import com.app.dream11.react.Dream11ReactBridge;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.utils.Logger;
import com.dreampay.commons.constants.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
/* loaded from: classes3.dex */
class a {
    private static final String a = "a";

    /* renamed from: b  reason: collision with root package name */
    private ApxorNetworkCallback f288b;
    private SimpleDateFormat c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ApxorNetworkCallback apxorNetworkCallback) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss", Locale.getDefault());
        this.c = simpleDateFormat;
        this.f288b = apxorNetworkCallback;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private void a(NetworkResponse networkResponse) {
        if (this.f288b != null) {
            if (networkResponse == null) {
                networkResponse = new NetworkResponse(-1, new Date().getTime(), "");
            }
            this.f288b.onComplete(networkResponse);
            return;
        }
        Logger.e(a, "onPostExecute: Network callback is null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, String str3) {
        a(false, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, byte[] bArr, HashMap<String, String> hashMap, String str2) {
        a(str, bArr, str2, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, String str, String str2, String str3) {
        SDKController sDKController = SDKController.getInstance();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(15000);
            if (str.equals("POST")) {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                if (z) {
                    String str4 = "----ApxorBoundary" + System.currentTimeMillis();
                    httpURLConnection.addRequestProperty("Connection", HTTP.CONN_KEEP_ALIVE);
                    httpURLConnection.addRequestProperty("Content-Type", "multipart/form-data; boundary=" + str4);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(str2.getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.writeBytes("--" + str4 + "\r\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Content-Disposition: form-data; name=\"chunk\"; filename=\"request.gz\"");
                    sb.append("\r\n");
                    dataOutputStream.writeBytes(sb.toString());
                    dataOutputStream.writeBytes("Content-Type: application/gzip\r\n");
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.write(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.writeBytes("--" + str4 + "--\r\n");
                    dataOutputStream.close();
                } else {
                    httpURLConnection.setRequestProperty("Content-Type", Dream11ReactBridge.VALUE_ACCEPT_HEADER);
                    httpURLConnection.setRequestProperty("Accept", Dream11ReactBridge.VALUE_ACCEPT_HEADER);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    bufferedWriter.write(str2);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                }
            } else if (str.equals("GET") && sDKController.canUseZip()) {
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
            }
            a(httpURLConnection);
        } catch (IOException e) {
            SDKController.getInstance().logException("nRF", e);
            a(new NetworkResponse(-1, -1L, Constants.FAILED));
        }
    }

    private void a(String str, byte[] bArr, String str2, HashMap<String, String> hashMap) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(15000);
            if (str.equals("PUT")) {
                httpURLConnection.setRequestMethod("PUT");
                httpURLConnection.setDoOutput(true);
                if (hashMap != null) {
                    httpURLConnection.setRequestProperty("Content-Type", hashMap.get("Content-Type"));
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                outputStream.close();
            }
            a(httpURLConnection);
        } catch (IOException e) {
            SDKController.getInstance().logException("nRF", e);
        }
    }

    private void a(HttpURLConnection httpURLConnection) {
        NetworkResponse networkResponse;
        int responseCode;
        long time;
        BufferedReader bufferedReader;
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (IOException e) {
                        networkResponse = new NetworkResponse(-1, -1L, e.getLocalizedMessage());
                        SDKController.getInstance().logException("nRF", e);
                        if (0 != 0) {
                            inputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                } catch (IOException unused) {
                    Logger.e(a, "Unable to close input stream");
                }
            } catch (ProtocolException e2) {
                networkResponse = new NetworkResponse(-1, -1L, e2.getLocalizedMessage());
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Exception e3) {
                networkResponse = new NetworkResponse(-1, -1L, e3.getLocalizedMessage());
                if (0 != 0) {
                    inputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            if (responseCode != 200) {
                a(new NetworkResponse(responseCode, -1L, Constants.FAILED));
                try {
                    httpURLConnection.disconnect();
                    return;
                } catch (IOException unused2) {
                    Logger.e(a, "Unable to close input stream");
                    return;
                }
            }
            String str = a;
            Logger.d(str, "Resp cd is: " + responseCode);
            try {
                time = this.c.parse(httpURLConnection.getHeaderField("date")).getTime();
            } catch (ParseException unused3) {
                time = new Date().getTime();
            }
            String str2 = a;
            Logger.d(str2, "T: " + time);
            InputStream inputStream2 = httpURLConnection.getInputStream();
            StringBuilder sb = new StringBuilder();
            String headerField = httpURLConnection.getHeaderField("Content-Encoding");
            if (headerField != null && headerField.toLowerCase().contains("gzip")) {
                bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(inputStream2), "UTF-8"));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
            networkResponse = new NetworkResponse(responseCode, time, sb.toString());
            if (inputStream2 != null) {
                inputStream2.close();
            }
            httpURLConnection.disconnect();
            a(networkResponse);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                    Logger.e(a, "Unable to close input stream");
                    throw th;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
