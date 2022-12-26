package com.google.common.io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import o.markViewHoldersUpdated;
import o.onAttachedToRecyclerView;
import o.recycleUpdateOp;
/* loaded from: classes7.dex */
public abstract class BaseEncoding {
    private static final BaseEncoding toString = new BaseEncoding$ah$a("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding ah$a = new BaseEncoding$ah$a("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final BaseEncoding ag$a = new values("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding valueOf = new values("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final BaseEncoding values = new BaseEncoding$ag$a("base16()", "0123456789ABCDEF");

    abstract int ag$a(int i);

    abstract void ah$a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int valueOf(int i);

    abstract int values(byte[] bArr, CharSequence charSequence) throws DecodingException;

    BaseEncoding() {
    }

    /* loaded from: classes7.dex */
    public static final class DecodingException extends IOException {
        /* JADX INFO: Access modifiers changed from: package-private */
        public DecodingException(String str) {
            super(str);
        }

        DecodingException(Throwable th) {
            super(th);
        }
    }

    public String ag$a(byte[] bArr) {
        return toString(bArr, 0, bArr.length);
    }

    public final String toString(byte[] bArr, int i, int i2) {
        markViewHoldersUpdated.ag$a(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(ag$a(i2));
        try {
            ah$a(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static byte[] ag$a(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public final byte[] values(CharSequence charSequence) {
        try {
            return toString(charSequence);
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    final byte[] toString(CharSequence charSequence) throws DecodingException {
        CharSequence valueOf2 = valueOf(charSequence);
        byte[] bArr = new byte[valueOf(valueOf2.length())];
        return ag$a(bArr, values(bArr, valueOf2));
    }

    CharSequence valueOf(CharSequence charSequence) {
        return (CharSequence) markViewHoldersUpdated.toString(charSequence);
    }

    public static BaseEncoding valueOf() {
        return ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class valueOf {
        private final byte[] HaptikSDK$a;
        private final boolean[] HaptikSDK$c;
        final int ag$a;
        final int ah$a;
        private final String ah$b;
        private final char[] toString;
        final int valueOf;
        final int values;

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf(String str, char[] cArr) {
            this.ah$b = (String) markViewHoldersUpdated.toString(str);
            this.toString = (char[]) markViewHoldersUpdated.toString(cArr);
            try {
                int onattachedtorecyclerview = onAttachedToRecyclerView.toString(cArr.length, RoundingMode.UNNECESSARY);
                this.ag$a = onattachedtorecyclerview;
                int min = Math.min(8, Integer.lowestOneBit(onattachedtorecyclerview));
                try {
                    this.valueOf = 8 / min;
                    this.values = onattachedtorecyclerview / min;
                    this.ah$a = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        markViewHoldersUpdated.ah$a(c < 128, "Non-ASCII character: %s", c);
                        markViewHoldersUpdated.ah$a(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.HaptikSDK$a = bArr;
                    boolean[] zArr = new boolean[this.valueOf];
                    for (int i2 = 0; i2 < this.values; i2++) {
                        zArr[onAttachedToRecyclerView.ag$a(i2 * 8, this.ag$a, RoundingMode.CEILING)] = true;
                    }
                    this.HaptikSDK$c = zArr;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public char ag$a(int i) {
            return this.toString[i];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean toString(int i) {
            return this.HaptikSDK$c[i % this.valueOf];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int valueOf(char c) throws DecodingException {
            if (c > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b2 = this.HaptikSDK$a[c];
            if (b2 == -1) {
                if (c <= ' ' || c == 127) {
                    String valueOf2 = String.valueOf(Integer.toHexString(c));
                    throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
                }
                StringBuilder sb = new StringBuilder(25);
                sb.append("Unrecognized character: ");
                sb.append(c);
                throw new DecodingException(sb.toString());
            }
            return b2;
        }

        public boolean ah$a(char c) {
            byte[] bArr = this.HaptikSDK$a;
            return c < bArr.length && bArr[c] != -1;
        }

        public String toString() {
            return this.ah$b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof valueOf) {
                return Arrays.equals(this.toString, ((valueOf) obj).toString);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.toString);
        }
    }

    /* loaded from: classes7.dex */
    static class values extends BaseEncoding {
        final Character toString;
        final valueOf valueOf;

        values(String str, String str2, Character ch) {
            this(new valueOf(str, str2.toCharArray()), ch);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public values(valueOf valueof, Character ch) {
            this.valueOf = (valueOf) markViewHoldersUpdated.toString(valueof);
            markViewHoldersUpdated.toString(ch == null || !valueof.ah$a(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.toString = ch;
        }

        @Override // com.google.common.io.BaseEncoding
        int ag$a(int i) {
            return this.valueOf.valueOf * onAttachedToRecyclerView.ag$a(i, this.valueOf.values, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        void ah$a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            markViewHoldersUpdated.toString(appendable);
            markViewHoldersUpdated.ag$a(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                ag$a(appendable, bArr, i + i3, Math.min(this.valueOf.values, i2 - i3));
                i3 += this.valueOf.values;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void ag$a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            markViewHoldersUpdated.toString(appendable);
            markViewHoldersUpdated.ag$a(i, i + i2, bArr.length);
            int i3 = 0;
            markViewHoldersUpdated.values(i2 <= this.valueOf.values);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | (bArr[i + i4] & 255)) << 8;
            }
            int i5 = this.valueOf.ag$a;
            while (i3 < i2 * 8) {
                appendable.append(this.valueOf.ag$a(((int) (j >>> ((((i2 + 1) * 8) - i5) - i3))) & this.valueOf.ah$a));
                i3 += this.valueOf.ag$a;
            }
            if (this.toString != null) {
                while (i3 < this.valueOf.values * 8) {
                    appendable.append(this.toString.charValue());
                    i3 += this.valueOf.ag$a;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        int valueOf(int i) {
            return (int) (((this.valueOf.ag$a * i) + 7) / 8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding
        public CharSequence valueOf(CharSequence charSequence) {
            markViewHoldersUpdated.toString(charSequence);
            Character ch = this.toString;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        int values(byte[] bArr, CharSequence charSequence) throws DecodingException {
            markViewHoldersUpdated.toString(bArr);
            CharSequence valueOf = valueOf(charSequence);
            if (!this.valueOf.toString(valueOf.length())) {
                int length = valueOf.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new DecodingException(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < valueOf.length()) {
                long j = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.valueOf.valueOf; i4++) {
                    j <<= this.valueOf.ag$a;
                    if (i + i4 < valueOf.length()) {
                        j |= this.valueOf.valueOf(valueOf.charAt(i3 + i));
                        i3++;
                    }
                }
                int i5 = this.valueOf.values;
                int i6 = this.valueOf.ag$a;
                int i7 = (this.valueOf.values - 1) * 8;
                while (i7 >= (i5 * 8) - (i3 * i6)) {
                    bArr[i2] = (byte) ((j >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.valueOf.valueOf;
            }
            return i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.valueOf.toString());
            if (8 % this.valueOf.ag$a != 0) {
                if (this.toString == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.toString);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj instanceof values) {
                values valuesVar = (values) obj;
                if (this.valueOf.equals(valuesVar.valueOf) && recycleUpdateOp.values(this.toString, valuesVar.toString)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.valueOf.hashCode() ^ recycleUpdateOp.valueOf(this.toString);
        }
    }
}
