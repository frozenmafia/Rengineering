package com.google.common.io;

import com.google.common.io.BaseEncoding;
import java.io.IOException;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
final class BaseEncoding$ah$a extends BaseEncoding.values {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseEncoding$ah$a(String str, String str2, Character ch) {
        this(new BaseEncoding.valueOf(str, str2.toCharArray()), ch);
    }

    private BaseEncoding$ah$a(BaseEncoding.valueOf valueof, Character ch) {
        super(valueof, ch);
        char[] cArr;
        cArr = valueof.toString;
        markViewHoldersUpdated.values(cArr.length == 64);
    }

    @Override // com.google.common.io.BaseEncoding.values, com.google.common.io.BaseEncoding
    void ah$a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        markViewHoldersUpdated.toString(appendable);
        int i3 = i + i2;
        markViewHoldersUpdated.ag$a(i, i3, bArr.length);
        while (i2 >= 3) {
            int i4 = i + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            appendable.append(this.valueOf.ag$a(i6 >>> 18));
            appendable.append(this.valueOf.ag$a((i6 >>> 12) & 63));
            appendable.append(this.valueOf.ag$a((i6 >>> 6) & 63));
            appendable.append(this.valueOf.ag$a(i6 & 63));
            i2 -= 3;
            i = i5 + 1;
        }
        if (i < i3) {
            ag$a(appendable, bArr, i, i3 - i);
        }
    }

    @Override // com.google.common.io.BaseEncoding.values, com.google.common.io.BaseEncoding
    int values(byte[] bArr, CharSequence charSequence) throws BaseEncoding.DecodingException {
        markViewHoldersUpdated.toString(bArr);
        CharSequence valueOf = valueOf(charSequence);
        if (!this.valueOf.toString(valueOf.length())) {
            int length = valueOf.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new BaseEncoding.DecodingException(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < valueOf.length()) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int valueOf2 = (this.valueOf.valueOf(valueOf.charAt(i)) << 18) | (this.valueOf.valueOf(valueOf.charAt(i3)) << 12);
            int i5 = i2 + 1;
            bArr[i2] = (byte) (valueOf2 >>> 16);
            if (i4 < valueOf.length()) {
                int i6 = i4 + 1;
                int valueOf3 = valueOf2 | (this.valueOf.valueOf(valueOf.charAt(i4)) << 6);
                i2 = i5 + 1;
                bArr[i5] = (byte) ((valueOf3 >>> 8) & 255);
                if (i6 < valueOf.length()) {
                    i4 = i6 + 1;
                    bArr[i2] = (byte) ((valueOf3 | this.valueOf.valueOf(valueOf.charAt(i6))) & 255);
                    i2++;
                } else {
                    i = i6;
                }
            } else {
                i2 = i5;
            }
            i = i4;
        }
        return i2;
    }
}
