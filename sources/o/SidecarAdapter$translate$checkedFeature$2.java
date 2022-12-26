package o;

import org.apache.commons.codec.language.Soundex;
/* loaded from: classes5.dex */
public class SidecarAdapter$translate$checkedFeature$2 {
    private String ah$a;
    private int toString = 0;

    public SidecarAdapter$translate$checkedFeature$2(String str) {
        isWindowLayoutProviderValid.ag$a(str);
        this.ah$a = str;
    }

    public boolean HaptikSDK$c() {
        return invoke() == 0;
    }

    private int invoke() {
        return this.ah$a.length() - this.toString;
    }

    public boolean HaptikSDK$b(String str) {
        return this.ah$a.regionMatches(true, this.toString, str, 0, str.length());
    }

    public boolean ag$a(String... strArr) {
        for (String str : strArr) {
            if (HaptikSDK$b(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean valueOf(char... cArr) {
        if (HaptikSDK$c()) {
            return false;
        }
        for (char c : cArr) {
            if (this.ah$a.charAt(this.toString) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean valueOf(String str) {
        if (HaptikSDK$b(str)) {
            this.toString += str.length();
            return true;
        }
        return false;
    }

    public boolean HaptikSDK$b() {
        return !HaptikSDK$c() && doesReturn.valueOf(this.ah$a.charAt(this.toString));
    }

    public boolean ah$b() {
        return !HaptikSDK$c() && Character.isLetterOrDigit(this.ah$a.charAt(this.toString));
    }

    public char valueOf() {
        String str = this.ah$a;
        int i = this.toString;
        this.toString = i + 1;
        return str.charAt(i);
    }

    public void ag$a(String str) {
        if (!HaptikSDK$b(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > invoke()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.toString += length;
    }

    public String toString(String str) {
        int indexOf = this.ah$a.indexOf(str, this.toString);
        if (indexOf != -1) {
            String substring = this.ah$a.substring(this.toString, indexOf);
            this.toString += substring.length();
            return substring;
        }
        return HaptikSDK$a();
    }

    public String values(String... strArr) {
        int i = this.toString;
        while (!HaptikSDK$c() && !ag$a(strArr)) {
            this.toString++;
        }
        return this.ah$a.substring(i, this.toString);
    }

    public String ah$a(String str) {
        String sidecarAdapter$translate$checkedFeature$2 = toString(str);
        valueOf(str);
        return sidecarAdapter$translate$checkedFeature$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0068 A[EDGE_INSN: B:39:0x0068->B:32:0x0068 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString(char r9, char r10) {
        /*
            r8 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
        L6:
            boolean r6 = r8.HaptikSDK$c()
            if (r6 == 0) goto Ld
            goto L68
        Ld:
            char r6 = r8.valueOf()
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            if (r1 == 0) goto L1b
            r7 = 92
            if (r1 == r7) goto L5b
        L1b:
            r7 = 39
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L33
            r7 = 34
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L3b
        L33:
            char r7 = r6.charValue()
            if (r7 == r9) goto L3b
            r2 = r2 ^ 1
        L3b:
            if (r2 == 0) goto L3e
            goto L66
        L3e:
            java.lang.Character r7 = java.lang.Character.valueOf(r9)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
            int r3 = r3 + 1
            if (r4 != r0) goto L5b
            int r4 = r8.toString
            goto L5b
        L4f:
            java.lang.Character r7 = java.lang.Character.valueOf(r10)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            int r3 = r3 + (-1)
        L5b:
            if (r3 <= 0) goto L62
            if (r1 == 0) goto L62
            int r1 = r8.toString
            r5 = r1
        L62:
            char r1 = r6.charValue()
        L66:
            if (r3 > 0) goto L6
        L68:
            if (r5 < 0) goto L71
            java.lang.String r9 = r8.ah$a
            java.lang.String r9 = r9.substring(r4, r5)
            goto L73
        L71:
            java.lang.String r9 = ""
        L73:
            if (r3 <= 0) goto L8e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = "'"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            o.isWindowLayoutProviderValid.values(r10)
        L8e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SidecarAdapter$translate$checkedFeature$2.toString(char, char):java.lang.String");
    }

    public static String values(String str) {
        StringBuilder valueOf = doesReturn.valueOf();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                valueOf.append(c2);
            } else if (c != 0 && c == '\\') {
                valueOf.append(c2);
            }
            i++;
            c = c2;
        }
        return valueOf.toString();
    }

    public boolean ag$a() {
        boolean z = false;
        while (HaptikSDK$b()) {
            this.toString++;
            z = true;
        }
        return z;
    }

    public String values() {
        int i = this.toString;
        while (!HaptikSDK$c() && (ah$b() || ag$a("*|", "|", "_", "-"))) {
            this.toString++;
        }
        return this.ah$a.substring(i, this.toString);
    }

    public String ah$a() {
        int i = this.toString;
        while (!HaptikSDK$c() && (ah$b() || valueOf(Soundex.SILENT_MARKER, '_'))) {
            this.toString++;
        }
        return this.ah$a.substring(i, this.toString);
    }

    public String HaptikSDK$a() {
        String str = this.ah$a;
        String substring = str.substring(this.toString, str.length());
        this.toString = this.ah$a.length();
        return substring;
    }

    public String toString() {
        return this.ah$a.substring(this.toString);
    }
}
