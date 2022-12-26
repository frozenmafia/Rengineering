package o;

import android.os.Build;
import android.util.Log;
import java.util.List;
import o.DialogPreference;
/* loaded from: classes7.dex */
public final class EditTextPreferenceDialogFragmentCompat {
    private static final EditTextPreferenceDialogFragmentCompat toString = new EditTextPreferenceDialogFragmentCompat$ah$a().values();
    private final ListPreference ag$a;
    private final scheduleShowSoftInput ah$a;
    private final String valueOf;
    private final List<initLayout> values;

    public EditTextPreferenceDialogFragmentCompat(ListPreference listPreference, List<initLayout> list, scheduleShowSoftInput scheduleshowsoftinput, String str) {
        this.ag$a = listPreference;
        this.values = list;
        this.ah$a = scheduleshowsoftinput;
        this.valueOf = str;
    }

    /* renamed from: o.EditTextPreferenceDialogFragmentCompat$1 */
    /* loaded from: classes7.dex */
    public final class AnonymousClass1 {
        private static String toString(String str) {
            if (Build.VERSION.SDK_INT < 26) {
                return valueOf("TRuntime.", str);
            }
            return "TRuntime." + str;
        }

        private static String valueOf(String str, String str2) {
            String str3 = str + str2;
            return str3.length() > 23 ? str3.substring(0, 23) : str3;
        }

        public static void valueOf(String str, String str2, Object obj) {
            String anonymousClass1 = toString(str);
            if (Log.isLoggable(anonymousClass1, 3)) {
                Log.d(anonymousClass1, String.format(str2, obj));
            }
        }

        public static void ag$a(String str, String str2, Object... objArr) {
            String anonymousClass1 = toString(str);
            if (Log.isLoggable(anonymousClass1, 3)) {
                Log.d(anonymousClass1, String.format(str2, objArr));
            }
        }

        public static void values(String str, String str2, Object obj) {
            String anonymousClass1 = toString(str);
            if (Log.isLoggable(anonymousClass1, 4)) {
                Log.i(anonymousClass1, String.format(str2, obj));
            }
        }

        public static void ag$a(String str, String str2, Throwable th) {
            String anonymousClass1 = toString(str);
            if (Log.isLoggable(anonymousClass1, 6)) {
                Log.e(anonymousClass1, str2, th);
            }
        }

        public static void toString(String str, String str2, Object obj) {
            String anonymousClass1 = toString(str);
            if (Log.isLoggable(anonymousClass1, 5)) {
                Log.w(anonymousClass1, String.format(str2, obj));
            }
        }
    }

    public byte[] HaptikSDK$a() {
        byte[] ag$a;
        ag$a = DialogPreference.TargetFragment.ah$a.ag$a(this);
        return ag$a;
    }

    public static EditTextPreferenceDialogFragmentCompat$ah$a valueOf() {
        return new EditTextPreferenceDialogFragmentCompat$ah$a();
    }

    public ListPreference ah$b() {
        return this.ag$a;
    }

    public List<initLayout> ag$a() {
        return this.values;
    }

    public scheduleShowSoftInput ah$a() {
        return this.ah$a;
    }

    public String values() {
        return this.valueOf;
    }
}
