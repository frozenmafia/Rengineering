package o;
/* loaded from: classes.dex */
public final class casListeners {
    public static final casListeners toString = new casListeners();

    private casListeners() {
    }

    public static final void ag$a(Throwable th) {
        runAnimators.ag$a(th, "throwable");
        if (ActivityResultContracts.ah$a.ag$a()) {
            getTotalSpace.values().toString(th);
        }
    }

    public static final void ah$a(Throwable th) {
        runAnimators.ag$a(th, "throwable");
        if (ActivityResultContracts.ah$a.ag$a()) {
            getTotalSpace.values().toString(th);
        }
    }

    public static final void valueOf(Throwable th) {
        runAnimators.ag$a(th, "throwable");
        if (ActivityResultContracts.ah$a.ag$a()) {
            getTotalSpace.values().toString(th);
        }
    }

    public static final void toString(String str) {
        if (ActivityResultContracts.ah$a.ag$a() && str != null) {
            getTotalSpace.values().ag$a(str);
        }
        pendingToString.values(str);
    }

    public static final void values(String str, String str2) {
        runAnimators.ag$a(str, "tag");
        runAnimators.ag$a(str2, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE);
        if (ActivityResultContracts.ah$a.ag$a()) {
            getTotalSpace values = getTotalSpace.values();
            values.ag$a("1 " + str + com.dreampay.commons.constants.Constants.WHITE_SPACE + str2);
        }
        pendingToString.valueOf(str, str2);
    }
}
