package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
public final class getBoundingBoxMargin {
    static String ag$a(getBoundingBoxMargin$ag$a getboundingboxmargin_ag_a) {
        StringBuilder sb = new StringBuilder(getboundingboxmargin_ag_a.ag$a());
        for (int i = 0; i < getboundingboxmargin_ag_a.ag$a(); i++) {
            byte getboundingboxmargin_ag_a2 = getboundingboxmargin_ag_a.toString(i);
            if (getboundingboxmargin_ag_a2 == 34) {
                sb.append("\\\"");
            } else if (getboundingboxmargin_ag_a2 == 39) {
                sb.append("\\'");
            } else if (getboundingboxmargin_ag_a2 != 92) {
                switch (getboundingboxmargin_ag_a2) {
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
                        if (getboundingboxmargin_ag_a2 >= 32 && getboundingboxmargin_ag_a2 <= 126) {
                            sb.append((char) getboundingboxmargin_ag_a2);
                            continue;
                        } else {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((getboundingboxmargin_ag_a2 >>> 6) & 3) + 48));
                            sb.append((char) (((getboundingboxmargin_ag_a2 >>> 3) & 7) + 48));
                            sb.append((char) ((getboundingboxmargin_ag_a2 & 7) + 48));
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
        return ag$a(new getBoundingBoxMargin$ag$a() { // from class: o.getBoundingBoxMargin.2
            @Override // o.getBoundingBoxMargin$ag$a
            public int ag$a() {
                return ByteString.this.size();
            }

            @Override // o.getBoundingBoxMargin$ag$a
            public byte toString(int i) {
                return ByteString.this.byteAt(i);
            }
        });
    }
}
