package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class atc {
    public static String a(String str) {
        if (asy.a(str)) {
            return null;
        }
        return str;
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean c(String str) {
        return asy.a(str);
    }

    public static asz d(asz aszVar, asz aszVar2) {
        k(aszVar);
        k(aszVar2);
        return new ata(Arrays.asList(aszVar, aszVar2));
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(b(str, obj));
        }
    }

    public static void i(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void k(Object obj) {
        obj.getClass();
    }

    public static void l(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void m(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(u(i, i2, "index"));
        }
    }

    public static asx n(Object obj) {
        return new asx(obj.getClass().getSimpleName());
    }

    public static boolean o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String p(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (t(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (t(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String q(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (s(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (s(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean r(CharSequence charSequence, CharSequence charSequence2) {
        int v;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence2.charAt(i);
                if (charAt != charAt2 && ((v = v(charAt)) >= 26 || v != v(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean s(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean t(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static String u(int i, int i2, String str) {
        if (i < 0) {
            return b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    private static int v(char c) {
        return (char) ((c | TokenParser.SP) - 97);
    }

    public static void j(int i, int i2) {
        String b2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                b2 = b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                b2 = b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(b2);
        }
    }

    public static void h(int i, int i2, int i3) {
        String u;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                u = u(i, i3, "start index");
            } else {
                u = (i2 < 0 || i2 > i3) ? u(i2, i3, "end index") : b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(u);
        }
    }
}
