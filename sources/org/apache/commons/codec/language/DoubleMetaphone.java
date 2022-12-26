package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.message.TokenParser;
/* loaded from: classes8.dex */
public class DoubleMetaphone implements StringEncoder {
    private static final String VOWELS = "AEIOUY";
    private int maxCodeLen = 4;
    private static final String[] SILENT_START = {"GN", "KN", "PN", "WR", "PS"};
    private static final String[] L_R_N_M_B_H_F_V_W_SPACE = {"L", Constants.REGEX, "N", "M", "B", "H", "F", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, com.dreampay.commons.constants.Constants.WHITE_SPACE};
    private static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    private static final String[] L_T_K_S_N_M_B_Z = {"L", ExifInterface.GPS_DIRECTION_TRUE, "K", ExifInterface.LATITUDE_SOUTH, "N", "M", "B", "Z"};

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.apache.commons.codec.language.DoubleMetaphone] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String doubleMetaphone(String str, boolean z) {
        int i;
        ?? cleanInput = cleanInput(str);
        if (cleanInput == 0) {
            return null;
        }
        boolean isSlavoGermanic = isSlavoGermanic(cleanInput);
        ?? isSilentStart = isSilentStart(cleanInput);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && isSilentStart <= cleanInput.length() - 1) {
            char charAt = cleanInput.charAt(isSilentStart);
            if (charAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (charAt != 209) {
                switch (charAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        isSilentStart = handleAEIOUY(doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'B':
                        doubleMetaphoneResult.append('P');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'B') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'C':
                        isSilentStart = handleC(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'D':
                        isSilentStart = handleD(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'F') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'G':
                        isSilentStart = handleG(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'H':
                        isSilentStart = handleH(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'J':
                        isSilentStart = handleJ(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'K') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'L':
                        isSilentStart = handleL(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'M':
                        doubleMetaphoneResult.append('M');
                        if (!conditionM0(cleanInput, isSilentStart)) {
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'N') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'P':
                        isSilentStart = handleP(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'Q':
                        doubleMetaphoneResult.append('K');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'Q') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'R':
                        isSilentStart = handleR(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'S':
                        isSilentStart = handleS(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                    case 'T':
                        isSilentStart = handleT(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        i = isSilentStart + 1;
                        if (charAt(cleanInput, i) != 'V') {
                            isSilentStart = i;
                            break;
                        } else {
                            isSilentStart += 2;
                            break;
                        }
                    case 'W':
                        isSilentStart = handleW(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'X':
                        isSilentStart = handleX(cleanInput, doubleMetaphoneResult, isSilentStart);
                        break;
                    case 'Z':
                        isSilentStart = handleZ(cleanInput, doubleMetaphoneResult, isSilentStart, isSlavoGermanic);
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            isSilentStart++;
        }
        return z ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (!(obj instanceof String)) {
            throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
        }
        return doubleMetaphone((String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z) {
        return StringUtils.equals(doubleMetaphone(str, z), doubleMetaphone(str2, z));
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public void setMaxCodeLen(int i) {
        this.maxCodeLen = i;
    }

    private int handleAEIOUY(DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i + 1;
    }

    private int handleC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (conditionC0(str, i)) {
            doubleMetaphoneResult.append('K');
        } else if (i == 0 && contains(str, i, 6, "CAESAR")) {
            doubleMetaphoneResult.append('S');
        } else if (contains(str, i, 2, "CH")) {
            return handleCH(str, doubleMetaphoneResult, i);
        } else {
            if (contains(str, i, 2, "CZ")) {
                if (!contains(str, i - 2, 4, "WICZ")) {
                    doubleMetaphoneResult.append('S', 'X');
                }
            }
            int i2 = i + 1;
            if (contains(str, i2, 3, "CIA")) {
                doubleMetaphoneResult.append('X');
            } else if (contains(str, i, 2, easypay.manager.Constants.EASYPAY_PAYTYPE_CREDIT_CARD) && (i != 1 || charAt(str, 0) != 'M')) {
                return handleCC(str, doubleMetaphoneResult, i);
            } else {
                if (contains(str, i, 2, "CK", "CG", "CQ")) {
                    doubleMetaphoneResult.append('K');
                } else if (contains(str, i, 2, "CI", "CE", "CY")) {
                    if (contains(str, i, 3, "CIO", "CIE", "CIA")) {
                        doubleMetaphoneResult.append('S', 'X');
                    } else {
                        doubleMetaphoneResult.append('S');
                    }
                } else {
                    doubleMetaphoneResult.append('K');
                    if (!contains(str, i2, 2, " C", " Q", " G")) {
                        if (!contains(str, i2, 1, "C", "K", "Q") || contains(str, i2, 2, "CE", "CI")) {
                            return i2;
                        }
                    }
                }
            }
            return i + 3;
        }
        return i + 2;
    }

    private int handleCC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "H") && !contains(str, i2, 2, "HU")) {
            if (i != 1 || charAt(str, i - 1) != 'A') {
                if (!contains(str, i - 1, 5, "UCCEE", "UCCES")) {
                    doubleMetaphoneResult.append('X');
                    return i + 3;
                }
            }
            doubleMetaphoneResult.append("KS");
            return i + 3;
        }
        doubleMetaphoneResult.append('K');
        return i2;
    }

    private int handleCH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (i > 0 && contains(str, i, 4, "CHAE")) {
            doubleMetaphoneResult.append('K', 'X');
        } else if (conditionCH0(str, i)) {
            doubleMetaphoneResult.append('K');
        } else if (!conditionCH1(str, i)) {
            if (i > 0) {
                if (contains(str, 0, 2, "MC")) {
                    doubleMetaphoneResult.append('K');
                } else {
                    doubleMetaphoneResult.append('X', 'K');
                }
            } else {
                doubleMetaphoneResult.append('X');
            }
            return i + 2;
        } else {
            doubleMetaphoneResult.append('K');
        }
        return i + 2;
    }

    private int handleD(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (contains(str, i, 2, "DG")) {
            int i2 = i + 2;
            if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
                doubleMetaphoneResult.append('J');
                return i + 3;
            }
            doubleMetaphoneResult.append("TK");
            return i2;
        } else if (contains(str, i, 2, "DT", "DD")) {
            doubleMetaphoneResult.append('T');
            return i + 2;
        } else {
            doubleMetaphoneResult.append('T');
            return i + 1;
        }
    }

    private int handleG(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            return handleGH(str, doubleMetaphoneResult, i);
        }
        if (charAt(str, i2) == 'N') {
            if (i == 1 && isVowel(charAt(str, 0)) && !z) {
                doubleMetaphoneResult.append("KN", "N");
            } else {
                if (!contains(str, i + 2, 2, "EY") && charAt(str, i2) != 'Y' && !z) {
                    doubleMetaphoneResult.append("N", "KN");
                } else {
                    doubleMetaphoneResult.append("KN");
                }
            }
        } else if (contains(str, i2, 2, "LI") && !z) {
            doubleMetaphoneResult.append("KL", "L");
        } else if (i == 0 && (charAt(str, i2) == 'Y' || contains(str, i2, 2, ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER))) {
            doubleMetaphoneResult.append('K', 'J');
        } else {
            if ((contains(str, i2, 2, "ER") || charAt(str, i2) == 'Y') && !contains(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
                int i3 = i - 1;
                if (!contains(str, i3, 1, ExifInterface.LONGITUDE_EAST, "I") && !contains(str, i3, 3, "RGY", "OGY")) {
                    doubleMetaphoneResult.append('K', 'J');
                }
            }
            if (!contains(str, i2, 1, ExifInterface.LONGITUDE_EAST, "I", "Y")) {
                if (!contains(str, i - 1, 4, "AGGI", "OGGI")) {
                    if (charAt(str, i2) == 'G') {
                        int i4 = i + 2;
                        doubleMetaphoneResult.append('K');
                        return i4;
                    }
                    doubleMetaphoneResult.append('K');
                    return i2;
                }
            }
            if (contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH") || contains(str, i2, 2, "ET")) {
                doubleMetaphoneResult.append('K');
            } else if (contains(str, i2, 3, "IER")) {
                doubleMetaphoneResult.append('J');
            } else {
                doubleMetaphoneResult.append('J', 'K');
            }
        }
        return i + 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (contains(r10, r12 - 2, 1, "B", "H", "D") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (contains(r10, r12 - 3, 1, "B", "H", "D") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (contains(r10, r12 - 4, 1, "B", "H") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleGH(java.lang.String r10, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r11, int r12) {
        /*
            r9 = this;
            r0 = 75
            r1 = 2
            if (r12 <= 0) goto L16
            int r2 = r12 + (-1)
            char r2 = r9.charAt(r10, r2)
            boolean r2 = r9.isVowel(r2)
            if (r2 != 0) goto L16
            r11.append(r0)
            goto L94
        L16:
            r2 = 73
            if (r12 != 0) goto L2c
            int r12 = r12 + r1
            char r10 = r9.charAt(r10, r12)
            if (r10 != r2) goto L28
            r10 = 74
            r11.append(r10)
            goto L95
        L28:
            r11.append(r0)
            goto L95
        L2c:
            java.lang.String r3 = "D"
            java.lang.String r4 = "H"
            java.lang.String r5 = "B"
            r6 = 1
            if (r12 <= r6) goto L41
            java.lang.String[] r7 = new java.lang.String[]{r5, r4, r3}
            int r8 = r12 + (-2)
            boolean r7 = contains(r10, r8, r6, r7)
            if (r7 != 0) goto L94
        L41:
            if (r12 <= r1) goto L4f
            java.lang.String[] r3 = new java.lang.String[]{r5, r4, r3}
            int r7 = r12 + (-3)
            boolean r3 = contains(r10, r7, r6, r3)
            if (r3 != 0) goto L94
        L4f:
            r3 = 3
            if (r12 <= r3) goto L5f
            java.lang.String[] r3 = new java.lang.String[]{r5, r4}
            int r4 = r12 + (-4)
            boolean r3 = contains(r10, r4, r6, r3)
            if (r3 == 0) goto L5f
            goto L94
        L5f:
            if (r12 <= r1) goto L87
            int r3 = r12 + (-1)
            char r3 = r9.charAt(r10, r3)
            r4 = 85
            if (r3 != r4) goto L87
            java.lang.String r3 = "C"
            java.lang.String r4 = "G"
            java.lang.String r5 = "L"
            java.lang.String r7 = "R"
            java.lang.String r8 = "T"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r7, r8}
            int r4 = r12 + (-3)
            boolean r3 = contains(r10, r4, r6, r3)
            if (r3 == 0) goto L87
            r10 = 70
            r11.append(r10)
            goto L94
        L87:
            if (r12 <= 0) goto L94
            int r3 = r12 + (-1)
            char r10 = r9.charAt(r10, r3)
            if (r10 == r2) goto L94
            r11.append(r0)
        L94:
            int r12 = r12 + r1
        L95:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int):int");
    }

    private int handleH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if ((i == 0 || isVowel(charAt(str, i - 1))) && isVowel(charAt(str, i + 1))) {
            doubleMetaphoneResult.append('H');
            return i + 2;
        }
        return i + 1;
    }

    private int handleJ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        if (contains(str, i, 4, "JOSE") || contains(str, 0, 4, "SAN ")) {
            if ((i == 0 && charAt(str, i + 4) == ' ') || str.length() == 4 || contains(str, 0, 4, "SAN ")) {
                doubleMetaphoneResult.append('H');
            } else {
                doubleMetaphoneResult.append('J', 'H');
            }
            return i + 1;
        }
        if (i == 0 && !contains(str, i, 4, "JOSE")) {
            doubleMetaphoneResult.append('J', 'A');
        } else {
            int i2 = i - 1;
            if (isVowel(charAt(str, i2)) && !z) {
                int i3 = i + 1;
                if (charAt(str, i3) == 'A' || charAt(str, i3) == 'O') {
                    doubleMetaphoneResult.append('J', 'H');
                }
            }
            if (i == str.length() - 1) {
                doubleMetaphoneResult.append('J', TokenParser.SP);
            } else if (!contains(str, i + 1, 1, L_T_K_S_N_M_B_Z) && !contains(str, i2, 1, ExifInterface.LATITUDE_SOUTH, "K", "L")) {
                doubleMetaphoneResult.append('J');
            }
        }
        int i4 = i + 1;
        return charAt(str, i4) == 'J' ? i + 2 : i4;
    }

    private int handleL(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'L') {
            if (conditionL0(str, i)) {
                doubleMetaphoneResult.appendPrimary('L');
            } else {
                doubleMetaphoneResult.append('L');
            }
            return i + 2;
        }
        doubleMetaphoneResult.append('L');
        return i2;
    }

    private int handleP(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('F');
            return i + 2;
        }
        doubleMetaphoneResult.append('P');
        if (contains(str, i2, 1, "P", "B")) {
            i2 = i + 2;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleR(java.lang.String r4, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r5, int r6, boolean r7) {
        /*
            r3 = this;
            int r0 = r4.length()
            int r0 = r0 + (-1)
            r1 = 82
            r2 = 2
            if (r6 != r0) goto L2f
            if (r7 != 0) goto L2f
            java.lang.String r7 = "IE"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            int r0 = r6 + (-2)
            boolean r7 = contains(r4, r0, r2, r7)
            if (r7 == 0) goto L2f
            java.lang.String r7 = "ME"
            java.lang.String r0 = "MA"
            java.lang.String[] r7 = new java.lang.String[]{r7, r0}
            int r0 = r6 + (-4)
            boolean r7 = contains(r4, r0, r2, r7)
            if (r7 != 0) goto L2f
            r5.appendAlternate(r1)
            goto L32
        L2f:
            r5.append(r1)
        L32:
            int r5 = r6 + 1
            char r4 = r3.charAt(r4, r5)
            if (r4 != r1) goto L3c
            int r5 = r6 + 2
        L3c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (contains(r9, r11 + 1, 1, "M", "N", "L", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleS(java.lang.String r9, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    private int handleSC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = i + 2;
        if (charAt(str, i2) == 'H') {
            int i3 = i + 3;
            if (contains(str, i3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (contains(str, i3, 2, "ER", "EN")) {
                    doubleMetaphoneResult.append("X", "SK");
                } else {
                    doubleMetaphoneResult.append("SK");
                }
            } else if (i == 0 && !isVowel(charAt(str, 3)) && charAt(str, 3) != 'W') {
                doubleMetaphoneResult.append('X', 'S');
            } else {
                doubleMetaphoneResult.append('X');
            }
        } else if (contains(str, i2, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append("SK");
        }
        return i + 3;
    }

    private int handleT(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (contains(str, i, 4, "TION")) {
            doubleMetaphoneResult.append('X');
        } else if (contains(str, i, 3, "TIA", "TCH")) {
            doubleMetaphoneResult.append('X');
        } else if (contains(str, i, 2, "TH") || contains(str, i, 3, "TTH")) {
            int i2 = i + 2;
            if (contains(str, i2, 2, "OM", "AM") || contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH")) {
                doubleMetaphoneResult.append('T');
                return i2;
            }
            doubleMetaphoneResult.append('0', 'T');
            return i2;
        } else {
            doubleMetaphoneResult.append('T');
            int i3 = i + 1;
            return contains(str, i3, 1, ExifInterface.GPS_DIRECTION_TRUE, "D") ? i + 2 : i3;
        }
        return i + 3;
    }

    private int handleW(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        int i2 = 2;
        if (contains(str, i, 2, "WR")) {
            doubleMetaphoneResult.append('R');
        } else {
            if (i == 0) {
                int i3 = i + 1;
                if (isVowel(charAt(str, i3)) || contains(str, i, 2, "WH")) {
                    if (isVowel(charAt(str, i3))) {
                        doubleMetaphoneResult.append('A', 'F');
                        return i3;
                    }
                    doubleMetaphoneResult.append('A');
                    return i3;
                }
            }
            if (i != str.length() - 1 || !isVowel(charAt(str, i - 1))) {
                if (!contains(str, i - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") && !contains(str, 0, 3, "SCH")) {
                    if (contains(str, i, 4, "WICZ", "WITZ")) {
                        doubleMetaphoneResult.append("TS", "FX");
                        i2 = 4;
                    }
                    return i + 1;
                }
            }
            doubleMetaphoneResult.appendAlternate('F');
            return i + 1;
        }
        return i + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (contains(r6, r8 - 2, 2, "AU", "OU") == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int handleX(java.lang.String r6, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r7, int r8) {
        /*
            r5 = this;
            r0 = 1
            if (r8 != 0) goto La
            r6 = 83
            r7.append(r6)
            int r8 = r8 + r0
            goto L4b
        La:
            int r1 = r6.length()
            int r1 = r1 - r0
            r2 = 2
            if (r8 != r1) goto L33
            java.lang.String r1 = "IAU"
            java.lang.String r3 = "EAU"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            int r3 = r8 + (-3)
            r4 = 3
            boolean r1 = contains(r6, r3, r4, r1)
            if (r1 != 0) goto L38
            java.lang.String r1 = "AU"
            java.lang.String r3 = "OU"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            int r3 = r8 + (-2)
            boolean r1 = contains(r6, r3, r2, r1)
            if (r1 != 0) goto L38
        L33:
            java.lang.String r1 = "KS"
            r7.append(r1)
        L38:
            int r7 = r8 + 1
            java.lang.String r1 = "C"
            java.lang.String r3 = "X"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            boolean r6 = contains(r6, r7, r0, r1)
            if (r6 == 0) goto L4a
            int r8 = r8 + r2
            goto L4b
        L4a:
            r8 = r7
        L4b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int):int");
    }

    private int handleZ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i, boolean z) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'H') {
            doubleMetaphoneResult.append('J');
            return i + 2;
        }
        if (contains(str, i2, 2, "ZO", "ZI", "ZA") || (z && i > 0 && charAt(str, i - 1) != 'T')) {
            doubleMetaphoneResult.append(ExifInterface.LATITUDE_SOUTH, "TS");
        } else {
            doubleMetaphoneResult.append('S');
        }
        if (charAt(str, i2) == 'Z') {
            i2 = i + 2;
        }
        return i2;
    }

    private boolean conditionC0(String str, int i) {
        if (contains(str, i, 4, "CHIA")) {
            return true;
        }
        if (i <= 1) {
            return false;
        }
        int i2 = i - 2;
        if (isVowel(charAt(str, i2))) {
            return false;
        }
        if (contains(str, i - 1, 3, "ACH")) {
            char charAt = charAt(str, i + 2);
            return !(charAt == 'I' || charAt == 'E') || contains(str, i2, 6, "BACHER", "MACHER");
        }
        return false;
    }

    private boolean conditionCH0(String str, int i) {
        if (i != 0) {
            return false;
        }
        int i2 = i + 1;
        return (contains(str, i2, 5, "HARAC", "HARIS") || contains(str, i2, 3, "HOR", "HYM", "HIA", "HEM")) && !contains(str, 0, 5, "CHORE");
    }

    private boolean conditionCH1(String str, int i) {
        if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH")) {
            if (!contains(str, i - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
                int i2 = i + 2;
                if (!contains(str, i2, 1, ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH)) {
                    if (!contains(str, i - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O", "U", ExifInterface.LONGITUDE_EAST) && i != 0) {
                        return false;
                    }
                    if (!contains(str, i2, 1, L_R_N_M_B_H_F_V_W_SPACE) && i + 1 != str.length() - 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean conditionL0(String str, int i) {
        if (i == str.length() - 3) {
            if (contains(str, i - 1, 4, "ILLO", "ILLA", "ALLE")) {
                return true;
            }
        }
        if (!contains(str, str.length() - 2, 2, "AS", "OS")) {
            if (!contains(str, str.length() - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O")) {
                return false;
            }
        }
        return contains(str, i - 1, 4, "ALLE");
    }

    private boolean conditionM0(String str, int i) {
        int i2 = i + 1;
        if (charAt(str, i2) == 'M') {
            return true;
        }
        if (contains(str, i - 1, 3, "UMB")) {
            if (i2 == str.length() - 1) {
                return true;
            }
            if (contains(str, i + 2, 2, "ER")) {
                return true;
            }
        }
        return false;
    }

    private boolean isSlavoGermanic(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    private boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }

    private boolean isSilentStart(String str) {
        for (String str2 : SILENT_START) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private String cleanInput(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim.toUpperCase(Locale.ENGLISH);
    }

    protected char charAt(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i);
    }

    protected static boolean contains(String str, int i, int i2, String... strArr) {
        int i3;
        if (i < 0 || (i3 = i2 + i) > str.length()) {
            return false;
        }
        String substring = str.substring(i, i3);
        for (String str2 : strArr) {
            if (substring.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes8.dex */
    public class DoubleMetaphoneResult {
        private final StringBuilder alternate;
        private final int maxLength;
        private final StringBuilder primary;

        public DoubleMetaphoneResult(int i) {
            this.primary = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.alternate = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.maxLength = i;
        }

        public void append(char c) {
            appendPrimary(c);
            appendAlternate(c);
        }

        public void append(char c, char c2) {
            appendPrimary(c);
            appendAlternate(c2);
        }

        public void appendPrimary(char c) {
            if (this.primary.length() < this.maxLength) {
                this.primary.append(c);
            }
        }

        public void appendAlternate(char c) {
            if (this.alternate.length() < this.maxLength) {
                this.alternate.append(c);
            }
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }

        public void appendPrimary(String str) {
            int length = this.maxLength - this.primary.length();
            if (str.length() <= length) {
                this.primary.append(str);
            } else {
                this.primary.append(str.substring(0, length));
            }
        }

        public void appendAlternate(String str) {
            int length = this.maxLength - this.alternate.length();
            if (str.length() <= length) {
                this.alternate.append(str);
            } else {
                this.alternate.append(str.substring(0, length));
            }
        }

        public String getPrimary() {
            return this.primary.toString();
        }

        public String getAlternate() {
            return this.alternate.toString();
        }

        public boolean isComplete() {
            return this.primary.length() >= this.maxLength && this.alternate.length() >= this.maxLength;
        }
    }
}
