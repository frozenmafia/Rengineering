package o;

import android.media.AudioTrack;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import o.DynamicAnimation;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public abstract class getEmojiEditTextHelper implements TextWatcher {
    private static int HaptikSDK$a = 1;
    private static int HaptikSDK$b = 0;
    private static char HaptikSDK$c = 30568;
    private static char ag$a = 46323;
    private static char ah$b = 12198;
    private static char invoke = 38282;
    private int ah$a;
    private int toString;
    private boolean valueOf;
    private final EditText values;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i = HaptikSDK$a + 105;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
    }

    protected abstract void ag$a(boolean z, String str);

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = HaptikSDK$a + 35;
        HaptikSDK$b = i4 % 128;
        int i5 = i4 % 2;
    }

    public getEmojiEditTextHelper(EditText editText) {
        runAnimators.ag$a(editText, "mCardTextInputLayout");
        this.values = editText;
        this.ah$a = DynamicAnimation.OnAnimationUpdateListener.values.valueOf();
        this.toString = DynamicAnimation.OnAnimationUpdateListener.values.valueOf();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = HaptikSDK$b + 41;
        HaptikSDK$a = i4 % 128;
        if ((i4 % 2 == 0 ? 'Z' : TokenParser.CR) != 'Z') {
            runAnimators.ag$a(charSequence, toString(new char[]{35504, 16783, 5028, 37082, 43702, 55073}, 7 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
        } else {
            runAnimators.ag$a(charSequence, toString(new char[]{35504, 16783, 5028, 37082, 43702, 55073}, 27 - (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1))).intern());
        }
        this.valueOf = valueOf(charSequence);
        ag$a(this.valueOf, this.values.getText().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if ((r0 <= r5) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r0 <= r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r5 > r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        r5 = o.getEmojiEditTextHelper.HaptikSDK$b + 19;
        o.getEmojiEditTextHelper.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean valueOf(java.lang.CharSequence r5) {
        /*
            r4 = this;
            int r0 = o.getEmojiEditTextHelper.HaptikSDK$a
            int r0 = r0 + 15
            int r1 = r0 % 128
            o.getEmojiEditTextHelper.HaptikSDK$b = r1
            int r0 = r0 % 2
            r1 = 60
            if (r0 == 0) goto L11
            r0 = 60
            goto L13
        L11:
            r0 = 30
        L13:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L2b
            int r0 = r4.ah$a
            int r1 = r4.toString
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r0 > r5) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == r2) goto L39
            goto L46
        L2b:
            int r0 = r4.ah$a
            int r1 = r4.toString
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r0 > r5) goto L46
        L39:
            if (r5 > r1) goto L46
            int r5 = o.getEmojiEditTextHelper.HaptikSDK$b
            int r5 = r5 + 19
            int r0 = r5 % 128
            o.getEmojiEditTextHelper.HaptikSDK$a = r0
            int r5 = r5 % 2
            goto L47
        L46:
            r2 = 0
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEmojiEditTextHelper.valueOf(java.lang.CharSequence):boolean");
    }

    public final boolean valueOf() {
        int i = HaptikSDK$a + 7;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        boolean z = this.valueOf;
        int i3 = HaptikSDK$b + 23;
        HaptikSDK$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return z;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return z;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$b)) ^ ((cArr3[0] >>> 5) + invoke)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ag$a)) ^ ((cArr3[1] >>> 5) + HaptikSDK$c)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
