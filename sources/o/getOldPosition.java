package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes5.dex */
public class getOldPosition {
    private static getOldPosition ag$a;
    private static final shouldBeKeptAsChild toString = shouldBeKeptAsChild.ah$a();
    private volatile SharedPreferences valueOf;
    private final ExecutorService values;

    public getOldPosition(ExecutorService executorService) {
        this.values = executorService;
    }

    public static getOldPosition values() {
        getOldPosition getoldposition;
        synchronized (getOldPosition.class) {
            if (ag$a == null) {
                ag$a = new getOldPosition(Executors.newSingleThreadExecutor());
            }
            getoldposition = ag$a;
        }
        return getoldposition;
    }

    public void valueOf(final Context context) {
        synchronized (this) {
            if (this.valueOf == null && context != null) {
                this.values.execute(new Runnable() { // from class: o.isAdapterPositionUnknown
                    @Override // java.lang.Runnable
                    public final void run() {
                        getOldPosition.this.toString(context);
                    }
                });
            }
        }
    }

    public /* synthetic */ void toString(Context context) {
        if (this.valueOf != null || context == null) {
            return;
        }
        this.valueOf = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public addToData<Boolean> valueOf(String str) {
        if (str == null) {
            toString.ag$a("Key is null when getting boolean value on device cache.");
            return addToData.ag$a();
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return addToData.ag$a();
            }
        }
        if (!this.valueOf.contains(str)) {
            return addToData.ag$a();
        }
        try {
            return addToData.ag$a(Boolean.valueOf(this.valueOf.getBoolean(str, false)));
        } catch (ClassCastException e) {
            toString.valueOf("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return addToData.ag$a();
        }
    }

    public void ag$a(String str) {
        if (str == null) {
            toString.ag$a("Key is null. Cannot clear nullable key");
        } else {
            this.valueOf.edit().remove(str).apply();
        }
    }

    public boolean ag$a(String str, boolean z) {
        if (str == null) {
            toString.ag$a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return false;
            }
        }
        this.valueOf.edit().putBoolean(str, z).apply();
        return true;
    }

    public addToData<String> ah$a(String str) {
        if (str == null) {
            toString.ag$a("Key is null when getting String value on device cache.");
            return addToData.ag$a();
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return addToData.ag$a();
            }
        }
        if (!this.valueOf.contains(str)) {
            return addToData.ag$a();
        }
        try {
            return addToData.ag$a(this.valueOf.getString(str, ""));
        } catch (ClassCastException e) {
            toString.valueOf("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return addToData.ag$a();
        }
    }

    public boolean toString(String str, String str2) {
        if (str == null) {
            toString.ag$a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.valueOf.edit().remove(str).apply();
            return true;
        }
        this.valueOf.edit().putString(str, str2).apply();
        return true;
    }

    public addToData<Float> toString(String str) {
        if (str == null) {
            toString.ag$a("Key is null when getting float value on device cache.");
            return addToData.ag$a();
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return addToData.ag$a();
            }
        }
        if (!this.valueOf.contains(str)) {
            return addToData.ag$a();
        }
        try {
            return addToData.ag$a(Float.valueOf(this.valueOf.getFloat(str, 0.0f)));
        } catch (ClassCastException e) {
            toString.valueOf("Key %s from sharedPreferences has type other than float: %s", str, e.getMessage());
            return addToData.ag$a();
        }
    }

    public boolean ag$a(String str, float f) {
        if (str == null) {
            toString.ag$a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return false;
            }
        }
        this.valueOf.edit().putFloat(str, f).apply();
        return true;
    }

    public addToData<Long> values(String str) {
        if (str == null) {
            toString.ag$a("Key is null when getting long value on device cache.");
            return addToData.ag$a();
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return addToData.ag$a();
            }
        }
        if (!this.valueOf.contains(str)) {
            return addToData.ag$a();
        }
        try {
            return addToData.ag$a(Long.valueOf(this.valueOf.getLong(str, 0L)));
        } catch (ClassCastException e) {
            toString.valueOf("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return addToData.ag$a();
        }
    }

    public boolean ag$a(String str, long j) {
        if (str == null) {
            toString.ag$a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.valueOf == null) {
            valueOf(ah$a());
            if (this.valueOf == null) {
                return false;
            }
        }
        this.valueOf.edit().putLong(str, j).apply();
        return true;
    }

    private Context ah$a() {
        try {
            FirebaseApp.values();
            return FirebaseApp.values().ag$a();
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
