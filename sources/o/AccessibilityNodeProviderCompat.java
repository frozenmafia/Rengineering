package o;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes4.dex */
public interface AccessibilityNodeProviderCompat {

    /* loaded from: classes.dex */
    public interface AccessibilityNodeProviderApi16 {
        boolean values(Context context, Bundle bundle, String str);

        boolean values(Context context, String str, String str2);
    }

    /* loaded from: classes4.dex */
    public interface AccessibilityNodeProviderApi19 {
        void ah$a();

        void valueOf(String str);
    }

    void ag$a(String str);

    /* loaded from: classes4.dex */
    public class AccessibilityNodeProviderApi26 {
        private final HashSet<String> ag$a;

        private AccessibilityNodeProviderApi26(String[] strArr) {
            this.ag$a = new HashSet<>();
            valueOf(strArr);
        }

        private AccessibilityNodeProviderApi26(HashSet<String> hashSet) {
            HashSet<String> hashSet2 = new HashSet<>();
            this.ag$a = hashSet2;
            hashSet2.addAll(hashSet);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.ag$a.equals(((AccessibilityNodeProviderApi26) obj).ag$a);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.ag$a.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (isPassword.ag$a.contains(next)) {
                    sb.append(next);
                    sb.append(it.hasNext() ? "," : "");
                }
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean ah$a(String str) {
            return setFocusable.values(this.ag$a, str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean valueOf() {
            return !this.ag$a.isEmpty();
        }

        private void valueOf(String[] strArr) {
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            for (String str : strArr) {
                if (setFocusable.values(isPassword.ag$a, str)) {
                    this.ag$a.add(setFocusable.toString(str));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static AccessibilityNodeProviderApi26 ag$a(String str) {
            return new AccessibilityNodeProviderApi26(str.split(","));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static AccessibilityNodeProviderApi26 ah$a(String[] strArr) {
            return new AccessibilityNodeProviderApi26(strArr);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static AccessibilityNodeProviderApi26 ag$a() {
            return new AccessibilityNodeProviderApi26(isPassword.toString);
        }
    }
}
