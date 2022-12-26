package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes7.dex */
class getTransformedBoundingBox {
    getTransformedBoundingBox() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class toString implements getTransformedBoundingBox$ah$a {
        private int valueOf = 0;
        private List<byte[]> values = new ArrayList();

        toString() {
        }

        @Override // o.getTransformedBoundingBox$ah$a
        public boolean ag$a(byte[] bArr) {
            this.values.add(bArr);
            this.valueOf += bArr.length;
            return true;
        }

        @Override // o.getTransformedBoundingBox$ah$a
        public isItemPrefetchEnabled ah$a() {
            byte[] bArr = new byte[this.valueOf];
            int i = 0;
            for (int i2 = 0; i2 < this.values.size(); i2++) {
                byte[] bArr2 = this.values.get(i2);
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                i += bArr2.length;
            }
            return new isItemPrefetchEnabled(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class values implements getTransformedBoundingBox$ah$a {
        private StringBuilder ah$a = new StringBuilder();
        private ByteBuffer values;
        private static ThreadLocal<CharsetDecoder> toString = new ThreadLocal<CharsetDecoder>() { // from class: o.getTransformedBoundingBox.values.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: ah$a */
            public CharsetDecoder initialValue() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newDecoder;
            }
        };
        private static ThreadLocal<CharsetEncoder> ag$a = new ThreadLocal<CharsetEncoder>() { // from class: o.getTransformedBoundingBox.values.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: values */
            public CharsetEncoder initialValue() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.REPORT);
                newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newEncoder;
            }
        };

        values() {
        }

        @Override // o.getTransformedBoundingBox$ah$a
        public boolean ag$a(byte[] bArr) {
            String values = values(bArr);
            if (values != null) {
                this.ah$a.append(values);
                return true;
            }
            return false;
        }

        @Override // o.getTransformedBoundingBox$ah$a
        public isItemPrefetchEnabled ah$a() {
            if (this.values != null) {
                return null;
            }
            return new isItemPrefetchEnabled(this.ah$a.toString());
        }

        private String values(byte[] bArr) {
            try {
                return toString.get().decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getTransformedBoundingBox$ah$a ag$a(byte b2) {
        if (b2 == 2) {
            return new toString();
        }
        return new values();
    }
}
