package o;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
public final class UnPressableLinearLayout {
    private static final Pattern ah$a;
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private final SortedMap<String, String> HaptikSDK$c;
    private String valueOf;
    private static final Pattern ag$a = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern toString = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern values = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("\\s*;\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")=(");
        sb.append("\"([^\"]*)\"|[^\\s;\"]*");
        sb.append(")");
        ah$a = Pattern.compile(sb.toString());
    }

    public String ag$a() {
        return this.HaptikSDK$b;
    }

    public String ah$a() {
        return this.HaptikSDK$a;
    }

    public String toString(String str) {
        return this.HaptikSDK$c.get(str.toLowerCase(Locale.US));
    }

    static boolean values(String str) {
        return toString.matcher(str).matches();
    }

    private static String ag$a(String str) {
        String replace = str.replace("\\", "\\\\").replace("\"", "\\\"");
        return "\"" + replace + "\"";
    }

    public String valueOf() {
        String str = this.valueOf;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.HaptikSDK$b);
        sb.append('/');
        sb.append(this.HaptikSDK$a);
        SortedMap<String, String> sortedMap = this.HaptikSDK$c;
        if (sortedMap != null) {
            for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
                String value = entry.getValue();
                sb.append("; ");
                sb.append(entry.getKey());
                sb.append("=");
                if (!values(value)) {
                    value = ag$a(value);
                }
                sb.append(value);
            }
        }
        String sb2 = sb.toString();
        this.valueOf = sb2;
        return sb2;
    }

    public String toString() {
        return valueOf();
    }

    public boolean valueOf(UnPressableLinearLayout unPressableLinearLayout) {
        return unPressableLinearLayout != null && ag$a().equalsIgnoreCase(unPressableLinearLayout.ag$a()) && ah$a().equalsIgnoreCase(unPressableLinearLayout.ah$a());
    }

    public Charset values() {
        String unPressableLinearLayout = toString("charset");
        if (unPressableLinearLayout == null) {
            return null;
        }
        return Charset.forName(unPressableLinearLayout);
    }

    public int hashCode() {
        return valueOf().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof UnPressableLinearLayout) {
            UnPressableLinearLayout unPressableLinearLayout = (UnPressableLinearLayout) obj;
            return valueOf(unPressableLinearLayout) && this.HaptikSDK$c.equals(unPressableLinearLayout.HaptikSDK$c);
        }
        return false;
    }
}
