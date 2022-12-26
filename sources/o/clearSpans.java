package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class clearSpans {
    private int ah$a;
    private static final offsetPositionsForAdd values = offsetPositionsForAdd.valueOf(':');
    private static final offsetPositionsForAdd toString = offsetPositionsForAdd.valueOf('*');
    private final List<clearSpans$ah$a> valueOf = new ArrayList();
    private int ag$a = 0;

    public void values() {
        this.valueOf.clear();
        this.ag$a = 0;
    }

    public int ag$a(getExitDir getexitdir, skipTagForward skiptagforward, List<Metadata.Entry> list) throws IOException {
        int i = this.ag$a;
        long j = 0;
        if (i == 0) {
            long ah$a = getexitdir.ah$a();
            if (ah$a != -1 && ah$a >= 8) {
                j = ah$a - 8;
            }
            skiptagforward.ah$a = j;
            this.ag$a = 1;
        } else if (i == 1) {
            ah$a(getexitdir, skiptagforward);
        } else if (i == 2) {
            values(getexitdir, skiptagforward);
        } else if (i == 3) {
            valueOf(getexitdir, list);
            skiptagforward.ah$a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void ah$a(getExitDir getexitdir, skipTagForward skiptagforward) throws IOException {
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(8);
        getexitdir.ah$a(c$default$setContentDescription.ah$a(), 0, 8);
        this.ah$a = c$default$setContentDescription.HaptikSDK$d() + 8;
        if (c$default$setContentDescription.getSignupData() != 1397048916) {
            skiptagforward.ah$a = 0L;
            return;
        }
        skiptagforward.ah$a = getexitdir.values() - (this.ah$a - 12);
        this.ag$a = 2;
    }

    private void values(getExitDir getexitdir, skipTagForward skiptagforward) throws IOException {
        long ah$a = getexitdir.ah$a();
        int i = 8;
        int i2 = (this.ah$a - 12) - 8;
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(i2);
        getexitdir.ah$a(c$default$setContentDescription.ah$a(), 0, i2);
        int i3 = 0;
        while (i3 < i2 / 12) {
            c$default$setContentDescription.HaptikSDK$a(2);
            short ak = c$default$setContentDescription.ak();
            if (ak == 2192 || ak == 2816 || ak == 2817 || ak == 2819 || ak == 2820) {
                this.valueOf.add(new clearSpans$ah$a(ak, (ah$a - this.ah$a) - c$default$setContentDescription.HaptikSDK$d(), c$default$setContentDescription.HaptikSDK$d()));
            } else {
                c$default$setContentDescription.HaptikSDK$a(i);
            }
            i3++;
            i = 8;
        }
        if (this.valueOf.isEmpty()) {
            skiptagforward.ah$a = 0L;
            return;
        }
        this.ag$a = 3;
        skiptagforward.ah$a = this.valueOf.get(0).ah$a;
    }

    private void valueOf(getExitDir getexitdir, List<Metadata.Entry> list) throws IOException {
        long values2 = getexitdir.values();
        int ah$a = (int) ((getexitdir.ah$a() - getexitdir.values()) - this.ah$a);
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(ah$a);
        getexitdir.ah$a(c$default$setContentDescription.ah$a(), 0, ah$a);
        for (int i = 0; i < this.valueOf.size(); i++) {
            clearSpans$ah$a clearspans_ah_a = this.valueOf.get(i);
            c$default$setContentDescription.HaptikSDK$b((int) (clearspans_ah_a.ah$a - values2));
            c$default$setContentDescription.HaptikSDK$a(4);
            int HaptikSDK$d = c$default$setContentDescription.HaptikSDK$d();
            int ag$a = ag$a(c$default$setContentDescription.ag$a(HaptikSDK$d));
            int i2 = clearspans_ah_a.values;
            if (ag$a == 2192) {
                list.add(toString(c$default$setContentDescription, i2 - (HaptikSDK$d + 8)));
            } else if (ag$a != 2816 && ag$a != 2817 && ag$a != 2819 && ag$a != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData toString(C$default$setContentDescription c$default$setContentDescription, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> offsetpositionsforadd = toString.toString(c$default$setContentDescription.ag$a(i));
        for (int i2 = 0; i2 < offsetpositionsforadd.size(); i2++) {
            List<String> offsetpositionsforadd2 = values.toString(offsetpositionsforadd.get(i2));
            if (offsetpositionsforadd2.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(offsetpositionsforadd2.get(0)), Long.parseLong(offsetpositionsforadd2.get(1)), 1 << (Integer.parseInt(offsetpositionsforadd2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedContainer(null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int ag$a(String str) throws ParserException {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            return 2817;
                        }
                        throw ParserException.createForMalformedContainer("Invalid SEF name", null);
                    }
                    return 2820;
                }
                return 2816;
            }
            return 2819;
        }
        return 2192;
    }
}
