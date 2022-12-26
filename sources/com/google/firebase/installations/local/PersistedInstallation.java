package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import o.isPendingInitialRun;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class PersistedInstallation {
    private final FirebaseApp ag$a;
    private File ah$a;

    /* loaded from: classes7.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.ag$a = firebaseApp;
    }

    private File ah$a() {
        if (this.ah$a == null) {
            synchronized (this) {
                if (this.ah$a == null) {
                    File filesDir = this.ag$a.ag$a().getFilesDir();
                    this.ah$a = new File(filesDir, "PersistedInstallation." + this.ag$a.HaptikSDK$a() + ".json");
                }
            }
        }
        return this.ah$a;
    }

    public isPendingInitialRun valueOf() {
        JSONObject values = values();
        String optString = values.optString("Fid", null);
        int optInt = values.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = values.optString("AuthToken", null);
        String optString3 = values.optString("RefreshToken", null);
        long optLong = values.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = values.optLong("ExpiresInSecs", 0L);
        return isPendingInitialRun.HaptikSDK$c().valueOf(optString).toString(RegistrationStatus.values()[optInt]).toString(optString2).ag$a(optString3).values(optLong).valueOf(optLong2).values(values.optString("FisError", null)).ag$a();
    }

    private JSONObject values() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(ah$a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public isPendingInitialRun ag$a(isPendingInitialRun ispendinginitialrun) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ispendinginitialrun.ah$a());
            jSONObject.put("Status", ispendinginitialrun.HaptikSDK$b().ordinal());
            jSONObject.put("AuthToken", ispendinginitialrun.valueOf());
            jSONObject.put("RefreshToken", ispendinginitialrun.ah$b());
            jSONObject.put("TokenCreationEpochInSecs", ispendinginitialrun.invoke());
            jSONObject.put("ExpiresInSecs", ispendinginitialrun.values());
            jSONObject.put("FisError", ispendinginitialrun.ag$a());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.ag$a.ag$a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(ah$a())) {
            return ispendinginitialrun;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }
}
