package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewConfiguration;
import android.widget.EditText;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import o.Visibility;
/* loaded from: classes4.dex */
public abstract class EmojiAppCompatEditText implements TextWatcher {
    private static long HaptikSDK$a = -3295885042371150369L;
    private static int HaptikSDK$b = 0;
    private static int ah$b = 1;
    private int ag$a;
    private boolean ah$a;
    private int toString;
    private final EditText valueOf;
    private String values;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = HaptikSDK$b + 53;
        ah$b = i % 128;
        if ((i % 2 == 0 ? '=' : 'T') != '=') {
            return;
        }
        int i2 = 3 / 0;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = HaptikSDK$b + 89;
        ah$b = i4 % 128;
        int i5 = i4 % 2;
    }

    protected abstract void toString(boolean z, String str, int i, int i2);

    public EmojiAppCompatEditText(EditText editText) {
        runAnimators.ag$a(editText, "editText");
        this.valueOf = editText;
        this.values = editText.getText().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        if ((r6 >= r5.length()) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r6 >= r5.length()) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        r4.valueOf.setSelection(r4.values.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        r1 = r4.valueOf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
        if (r6 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        r3 = '4';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        r3 = '<';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (r3 == '<') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r6 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r1.setSelection(r6);
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r6 = 6
            char[] r6 = new char[r6]
            r6 = {x00dc: FILL_ARRAY_DATA  , data: [-16980, -10929, 27732, -30896, 7744, -20159} // fill-array
            r7 = 48
            r8 = 0
            java.lang.String r0 = ""
            int r7 = android.text.TextUtils.indexOf(r0, r7, r8, r8)
            int r7 = 26878 - r7
            java.lang.String r6 = toString(r6, r7)
            java.lang.String r6 = r6.intern()
            o.runAnimators.ag$a(r5, r6)
            java.lang.String r6 = r5.toString()
            java.lang.String r7 = r4.values
            boolean r6 = o.runAnimators.values(r6, r7)
            r7 = 1
            if (r6 != 0) goto L2b
            r6 = 0
            goto L2c
        L2b:
            r6 = 1
        L2c:
            r0 = 2
            if (r6 == 0) goto L31
            goto La7
        L31:
            int r6 = o.EmojiAppCompatEditText.HaptikSDK$b
            int r6 = r6 + 21
            int r1 = r6 % 128
            o.EmojiAppCompatEditText.ah$b = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L3e
            r6 = 1
            goto L3f
        L3e:
            r6 = 0
        L3f:
            if (r6 == r7) goto L66
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r4.values(r6)
            r4.values = r6
            android.widget.EditText r6 = r4.valueOf
            int r6 = r6.getSelectionStart()
            android.widget.EditText r1 = r4.valueOf
            java.lang.String r2 = r4.values
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            int r1 = r5.length()
            if (r6 < r1) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            if (r1 == r7) goto L88
            goto L94
        L66:
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = r4.values(r6)
            r4.values = r6
            android.widget.EditText r6 = r4.valueOf
            int r6 = r6.getSelectionStart()
            android.widget.EditText r1 = r4.valueOf
            java.lang.String r2 = r4.values
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            int r1 = r5.length()
            r2 = 73
            int r2 = r2 / r8
            if (r6 < r1) goto L94
        L88:
            android.widget.EditText r6 = r4.valueOf
            java.lang.String r1 = r4.values
            int r1 = r1.length()
            r6.setSelection(r1)
            goto La7
        L94:
            android.widget.EditText r1 = r4.valueOf     // Catch: java.lang.Exception -> La6
            r2 = 60
            if (r6 != r0) goto L9d
            r3 = 52
            goto L9f
        L9d:
            r3 = 60
        L9f:
            if (r3 == r2) goto La2
            r6 = 3
        La2:
            r1.setSelection(r6)     // Catch: java.lang.Exception -> La6
            goto La7
        La6:
        La7:
            r4.ah$a = r8
            int r6 = r5.length()
            r8 = 5
            if (r6 != r8) goto Lc5
            int r6 = o.EmojiAppCompatEditText.ah$b
            int r6 = r6 + 71
            int r8 = r6 % 128
            o.EmojiAppCompatEditText.HaptikSDK$b = r8
            int r6 = r6 % r0
            java.lang.String r5 = r5.toString()
            boolean r5 = r4.toString(r5)
            if (r5 == 0) goto Lc5
            r4.ah$a = r7
        Lc5:
            boolean r5 = r4.ah$a
            android.widget.EditText r6 = r4.valueOf
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            int r7 = r4.ag$a
            int r8 = r4.toString
            r4.toString(r5, r6, r7, r8)
            return
        Ld9:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EmojiAppCompatEditText.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final String values(String str) {
        runAnimators.ag$a(str, toString(new char[]{48556, 54607, 27732, 34640, 7744, 45377}, 26879 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
        try {
            if (this.values.length() > str.length()) {
                if ((Visibility.Mode.ag$a(this.values, "/", false, 2, (Object) null) ? '/' : '6') != '6') {
                    int i = HaptikSDK$b + 115;
                    ah$b = i % 128;
                    int i2 = i % 2;
                    String substring = str.substring(0, str.length() - 1);
                    runAnimators.ah$a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int i3 = ah$b + 81;
                    HaptikSDK$b = i3 % 128;
                    int i4 = i3 % 2;
                    return substring;
                }
            } else {
                if (str.length() == 1) {
                    if (Integer.parseInt(str) > 1) {
                        return '0' + str + '/';
                    }
                } else if (str.length() == 2) {
                    if (!Visibility.Mode.ah$a(str, SessionDescription.SUPPORTED_SDP_VERSION, false, 2, (Object) null)) {
                        if (Visibility.Mode.ah$a(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, 2, (Object) null)) {
                            String substring2 = str.substring(1);
                            runAnimators.ah$a(substring2, "(this as java.lang.String).substring(startIndex)");
                            return Integer.parseInt(substring2) > 2 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : runAnimators.values(str, (Object) "/");
                        }
                        return str;
                    }
                    int i5 = HaptikSDK$b + 109;
                    ah$b = i5 % 128;
                    int i6 = i5 % 2;
                    if (Visibility.Mode.ag$a(str, SessionDescription.SUPPORTED_SDP_VERSION, false, 2, (Object) null)) {
                        int i7 = ah$b + 101;
                        HaptikSDK$b = i7 % 128;
                        int i8 = i7 % 2;
                        return SessionDescription.SUPPORTED_SDP_VERSION;
                    }
                    return runAnimators.values(str, (Object) "/");
                } else if (!Visibility.Mode.values((CharSequence) str, (CharSequence) "/", false, 2, (Object) null) && str.length() > 2) {
                    StringBuilder sb = new StringBuilder();
                    String substring3 = str.substring(0, 2);
                    runAnimators.ah$a(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring3);
                    sb.append('/');
                    String substring4 = str.substring(2);
                    runAnimators.ah$a(substring4, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring4);
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public final boolean ag$a() {
        try {
            int i = HaptikSDK$b + 83;
            ah$b = i % 128;
            int i2 = i % 2;
            boolean z = this.ah$a;
            int i3 = ah$b + 11;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
        if (r5 < r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
        if (r5 < r6) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: Exception -> 0x00dd, TryCatch #2 {Exception -> 0x00dd, blocks: (B:17:0x0028, B:19:0x003a, B:24:0x006b, B:30:0x007e, B:53:0x00cd, B:54:0x00d4, B:55:0x00d5, B:56:0x00dc), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5 A[Catch: Exception -> 0x00dd, TryCatch #2 {Exception -> 0x00dd, blocks: (B:17:0x0028, B:19:0x003a, B:24:0x006b, B:30:0x007e, B:53:0x00cd, B:54:0x00d4, B:55:0x00d5, B:56:0x00dc), top: B:66:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean toString(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.EmojiAppCompatEditText.toString(java.lang.String):boolean");
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ HaptikSDK$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
