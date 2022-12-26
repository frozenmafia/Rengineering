package com.facebook.react.common;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import o.FragmentActivity;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class DebugServerException extends RuntimeException {
    private static final String GENERIC_ERROR_MESSAGE = "\n\nTry the following to fix the issue:\n• Ensure that Metro is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT>' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";
    private final String mOriginalMessage;

    public static DebugServerException makeGeneric(String str, String str2, Throwable th) {
        return makeGeneric(str, str2, "", th);
    }

    public static DebugServerException makeGeneric(String str, String str2, String str3, Throwable th) {
        String replace = GENERIC_ERROR_MESSAGE.replace("<PORT>", String.valueOf(Uri.parse(str).getPort()));
        return new DebugServerException(str2 + replace + str3, th);
    }

    private DebugServerException(String str, String str2, int i, int i2) {
        super(str + "\n  at " + str2 + ":" + i + ":" + i2);
        this.mOriginalMessage = str;
    }

    public DebugServerException(String str) {
        super(str);
        this.mOriginalMessage = str;
    }

    public DebugServerException(String str, Throwable th) {
        super(str, th);
        this.mOriginalMessage = str;
    }

    public String getOriginalMessage() {
        return this.mOriginalMessage;
    }

    public static DebugServerException parse(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return new DebugServerException(jSONObject.getString("message"), shortenFileName(jSONObject.getString("filename")), jSONObject.getInt(StackTraceHelper.LINE_NUMBER_KEY), jSONObject.getInt(StackTraceHelper.COLUMN_KEY));
        } catch (JSONException e) {
            FragmentActivity.values("ReactNative", "Could not parse DebugServerException from: " + str2, (Throwable) e);
            return null;
        }
    }

    private static String shortenFileName(String str) {
        String[] split = str.split("/");
        return split[split.length - 1];
    }
}
