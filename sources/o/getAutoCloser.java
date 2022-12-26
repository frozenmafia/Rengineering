package o;

import com.google.protobuf.ByteString;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class getAutoCloser {
    static String toString(getAutoCloser$ag$a getautocloser_ag_a) {
        StringBuilder sb = new StringBuilder(getautocloser_ag_a.valueOf());
        for (int i = 0; i < getautocloser_ag_a.valueOf(); i++) {
            byte getautocloser_ag_a2 = getautocloser_ag_a.toString(i);
            if (getautocloser_ag_a2 == 34) {
                sb.append("\\\"");
            } else if (getautocloser_ag_a2 == 39) {
                sb.append("\\'");
            } else if (getautocloser_ag_a2 != 92) {
                switch (getautocloser_ag_a2) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (getautocloser_ag_a2 >= 32 && getautocloser_ag_a2 <= 126) {
                            sb.append((char) getautocloser_ag_a2);
                            continue;
                        } else {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((getautocloser_ag_a2 >>> 6) & 3) + 48));
                            sb.append((char) (((getautocloser_ag_a2 >>> 3) & 7) + 48));
                            sb.append((char) ((getautocloser_ag_a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String toString(final ByteString byteString) {
        return toString(new getAutoCloser$ag$a() { // from class: o.getAutoCloser.2
            @Override // o.getAutoCloser$ag$a
            public int valueOf() {
                return ByteString.this.size();
            }

            @Override // o.getAutoCloser$ag$a
            public byte toString(int i) {
                return ByteString.this.byteAt(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String values(String str) {
        return toString(ByteString.copyFromUtf8(str));
    }
}
