package com.google.common.io;

import com.google.common.io.BaseEncoding;
import java.io.IOException;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
final class BaseEncoding$ag$a extends BaseEncoding.values {
    final char[] values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseEncoding$ag$a(String str, String str2) {
        this(new BaseEncoding.valueOf(str, str2.toCharArray()));
    }

    private BaseEncoding$ag$a(BaseEncoding.valueOf valueof) {
        super(valueof, null);
        char[] cArr;
        this.values = new char[512];
        cArr = valueof.toString;
        markViewHoldersUpdated.values(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.values[i] = valueof.ag$a(i >>> 4);
            this.values[i | 256] = valueof.ag$a(i & 15);
        }
    }

    @Override // com.google.common.io.BaseEncoding.values, com.google.common.io.BaseEncoding
    void ah$a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        markViewHoldersUpdated.toString(appendable);
        markViewHoldersUpdated.ag$a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 255;
            appendable.append(this.values[i4]);
            appendable.append(this.values[i4 | 256]);
        }
    }

    @Override // com.google.common.io.BaseEncoding.values, com.google.common.io.BaseEncoding
    int values(byte[] bArr, CharSequence charSequence) throws BaseEncoding.DecodingException {
        markViewHoldersUpdated.toString(bArr);
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new BaseEncoding.DecodingException(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.valueOf.valueOf(charSequence.charAt(i)) << 4) | this.valueOf.valueOf(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }
}
