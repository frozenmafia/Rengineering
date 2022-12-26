package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.MessageDigest;
import java.util.Formatter;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes3.dex */
public final class aj {
    public static String valueOf(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventType(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.values(sb.toString(), e);
            return null;
        }
    }

    public static String values(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventType(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.values(sb.toString(), e);
            return null;
        }
    }

    public static String AFInAppEventParameterName(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(str.getBytes());
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.values(sb.toString(), e);
            return null;
        }
    }

    public static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    private static String AFInAppEventType(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", Byte.valueOf(bArr[i]));
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    public static String values(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        sb.append(j);
        return valueOf(sb.toString());
    }
}
