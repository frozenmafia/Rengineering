package com.sendbird.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.sendbird.android.log.Logger;
/* loaded from: classes5.dex */
class KeyStore {
    private static final String PREFERENCE_FILE_NAME = "com.sendbird.sdk.messaging.keystore";
    private static final String PREFERENCE_KEY_SEED = "PREFERENCE_KEY_SEED";
    private static final String PREFERENCE_KEY_SESSION_KEY = "PREFERENCE_KEY_SESSION_KEY";
    private static SharedPreferences preferences;

    private KeyStore() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void init(Context context) {
        preferences = context.getSharedPreferences(PREFERENCE_FILE_NAME, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void clearAll() {
        preferences.edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void saveSessionKey(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            preferences.edit().putString(PREFERENCE_KEY_SESSION_KEY, AES256Chiper.encrypt(generateSeed(str), str2)).apply();
        } catch (Exception e) {
            Logger.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getSessionKey() {
        String string = preferences.getString(PREFERENCE_KEY_SEED, "");
        if (!TextUtils.isEmpty(string)) {
            try {
                return AES256Chiper.decrypt(string, preferences.getString(PREFERENCE_KEY_SESSION_KEY, ""));
            } catch (Exception e) {
                Logger.e(e);
            }
        }
        return "";
    }

    private static String generateSeed(String str) {
        String encodeToString = Base64.encodeToString(str.getBytes(), 2);
        preferences.edit().putString(PREFERENCE_KEY_SEED, encodeToString).apply();
        return encodeToString;
    }
}
