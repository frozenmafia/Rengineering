package o;

import android.graphics.Color;
import android.text.TextUtils;
import com.appsamurai.storyly.StoryComponentType;
import java.util.List;
import o.PathParser;
/* loaded from: classes3.dex */
public final class interpolatePathDataNode extends PathParser.ExtractFloatResult {
    private static int HaptikSDK$b = 1;
    private static long HaptikSDK$c = 3765151360489596859L;
    private static int invoke;
    private final Integer ag$a;
    private final int ah$a;
    private final String ah$b;
    private final String toString;
    private final List<String> valueOf;
    private final String values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public interpolatePathDataNode(String str, String str2, List<String> list, Integer num, int i, String str3) {
        super(str, StoryComponentType.Quiz);
        runAnimators.ag$a(str, toString(new char[]{52590, 7202, 52487, 56250, 6030, 48125}, Color.rgb(0, 0, 0) + 16777217).intern());
        runAnimators.ag$a(str2, toString(new char[]{9243, 12832, 9327, 33652, 41056, 38386, 52342, 22333, 47762}, 1 - TextUtils.indexOf("", "")).intern());
        runAnimators.ag$a(list, "options");
        this.toString = str;
        this.ah$b = str2;
        this.valueOf = list;
        this.ag$a = num;
        this.ah$a = i;
        this.values = str3;
    }

    public final Integer HaptikSDK$a() {
        int i = HaptikSDK$b + 45;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            Integer num = this.ag$a;
            int i3 = invoke + 33;
            HaptikSDK$b = i3 % 128;
            int i4 = i3 % 2;
            return num;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String HaptikSDK$b() {
        int i = invoke + 87;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        String str = this.ah$b;
        int i3 = invoke + 15;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    @Override // o.PathParser.ExtractFloatResult
    public String ag$a() {
        int i = invoke + 91;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            String str = this.toString;
            int i3 = invoke + 71;
            HaptikSDK$b = i3 % 128;
            if ((i3 % 2 == 0 ? '@' : 'U') != 'U') {
                int i4 = 73 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final List<String> ah$a() {
        int i = HaptikSDK$b + 91;
        invoke = i % 128;
        if (i % 2 == 0) {
            return this.valueOf;
        }
        try {
            int i2 = 77 / 0;
            return this.valueOf;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof interpolatePathDataNode)) {
                int i = invoke + 13;
                HaptikSDK$b = i % 128;
                int i2 = i % 2;
                return false;
            }
            interpolatePathDataNode interpolatepathdatanode = (interpolatePathDataNode) obj;
            if (runAnimators.values((Object) ag$a(), (Object) interpolatepathdatanode.ag$a())) {
                if (runAnimators.values((Object) this.ah$b, (Object) interpolatepathdatanode.ah$b)) {
                    if (!runAnimators.values(this.valueOf, interpolatepathdatanode.valueOf)) {
                        try {
                            int i3 = invoke + 73;
                            HaptikSDK$b = i3 % 128;
                            if (i3 % 2 == 0) {
                                Object obj2 = null;
                                super.hashCode();
                                return false;
                            }
                            return false;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (!(runAnimators.values(this.ag$a, interpolatepathdatanode.ag$a))) {
                        return false;
                    }
                    if (this.ah$a == interpolatepathdatanode.ah$a) {
                        if ((!runAnimators.values((Object) this.values, (Object) interpolatepathdatanode.values) ? 'M' : '?') != '?') {
                            int i4 = HaptikSDK$b + 51;
                            invoke = i4 % 128;
                            int i5 = i4 % 2;
                            return false;
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int hashCode;
        int i = invoke + 49;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            int hashCode2 = ag$a().hashCode();
            int hashCode3 = this.ah$b.hashCode();
            int hashCode4 = this.valueOf.hashCode();
            Integer num = this.ag$a;
            int i3 = 0;
            if ((num == null ? (char) 0 : '[') != '[') {
                int i4 = HaptikSDK$b + 53;
                invoke = i4 % 128;
                int i5 = i4 % 2;
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i6 = this.ah$a;
            String str = this.values;
            if (str != null) {
                i3 = str.hashCode();
                int i7 = invoke + 27;
                HaptikSDK$b = i7 % 128;
                int i8 = i7 % 2;
            }
            return (((((((((hashCode2 * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode) * 31) + i6) * 31) + i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int invoke() {
        int i;
        int i2 = HaptikSDK$b + 7;
        invoke = i2 % 128;
        if (i2 % 2 != 0) {
            i = this.ah$a;
            Object obj = null;
            super.hashCode();
        } else {
            try {
                i = this.ah$a;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = HaptikSDK$b + 19;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    public String toString() {
        String str = "StoryQuizComponent(id=" + ag$a() + ", title=" + this.ah$b + ", options=" + this.valueOf + ", rightAnswerIndex=" + this.ag$a + ", selectedOptionIndex=" + this.ah$a + ", customPayload=" + ((Object) this.values) + ')';
        int i = invoke + 17;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public final String valueOf() {
        try {
            int i = HaptikSDK$b + 7;
            invoke = i % 128;
            if ((i % 2 != 0 ? 'b' : (char) 11) != 'b') {
                return this.values;
            }
            String str = this.values;
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(HaptikSDK$c, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * HaptikSDK$c));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
