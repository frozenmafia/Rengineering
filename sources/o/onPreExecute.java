package o;

import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import o.ModernAsyncTask;
import o.Visibility;
/* loaded from: classes4.dex */
public final class onPreExecute {
    public static final valueOf values = new valueOf(null);
    private final String toString;

    public onPreExecute(String str) {
        runAnimators.ag$a(str, "cachePrefix");
        this.toString = str;
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        private valueOf() {
        }

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }
    }

    public final String ah$a() {
        String values2 = values("KEY_SESSION_UUID");
        String str = values2;
        if (str == null || str.length() == 0) {
            String uuid = UUID.randomUUID().toString();
            runAnimators.ah$a(uuid, "UUID.randomUUID().toString()");
            Objects.requireNonNull(uuid, "null cannot be cast to non-null type java.lang.String");
            values2 = uuid.toUpperCase();
            runAnimators.ah$a(values2, "(this as java.lang.String).toUpperCase()");
            ag$a("KEY_SESSION_UUID", values2);
        }
        Calendar calendar = Calendar.getInstance();
        runAnimators.ah$a(calendar, "Calendar.getInstance()");
        Date time = calendar.getTime();
        runAnimators.ah$a(time, "date");
        String values3 = ModernAsyncTask.AnonymousClass1.values(time, "dd.MM.yyyy", null, 2, null);
        ModernAsyncTask.AnonymousClass2 anonymousClass2 = ModernAsyncTask.AnonymousClass2.ag$a;
        String valueOf2 = anonymousClass2.valueOf(values3 + values2);
        Objects.requireNonNull(valueOf2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf2.toLowerCase();
        runAnimators.ah$a(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public final String ag$a() {
        return Visibility.Mode.values(ah$a(), 32);
    }

    private final String values(String str) {
        SharedPreferences valueOf2 = unregisterOnLoadCanceledListener.values.valueOf();
        return valueOf2.getString(this.toString + str, null);
    }

    private final void ag$a(String str, String str2) {
        SharedPreferences.Editor edit = unregisterOnLoadCanceledListener.values.valueOf().edit();
        if (edit != null) {
            SharedPreferences.Editor putString = edit.putString(this.toString + str, str2);
            if (putString != null) {
                putString.apply();
            }
        }
    }
}
