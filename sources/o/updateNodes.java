package o;

import android.text.TextUtils;
import com.appsamurai.storyly.StoryComponentType;
import o.PathParser;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class updateNodes extends PathParser.ExtractFloatResult {
    private static int ag$a = 1;
    private static long toString = -455971505230363419L;
    private static int valueOf;
    private final String ah$a;
    private final String values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateNodes(String str, String str2) {
        super(str, StoryComponentType.Comment);
        runAnimators.ag$a(str, valueOf(new char[]{62784, 62761, 35117, 52652, 30385, 43427}, TextUtils.indexOf("", "") + 1).intern());
        runAnimators.ag$a(str2, "text");
        this.ah$a = str;
        this.values = str2;
    }

    @Override // o.PathParser.ExtractFloatResult
    public String ag$a() {
        String str;
        int i = valueOf + 91;
        ag$a = i % 128;
        if ((i % 2 == 0 ? 'K' : 'D') != 'D') {
            str = this.ah$a;
            Object obj = null;
            super.hashCode();
        } else {
            try {
                str = this.ah$a;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i2 = valueOf + 25;
            ag$a = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean equals(Object obj) {
        int i = valueOf + 3;
        ag$a = i % 128;
        int i2 = i % 2;
        if ((this == obj ? '@' : 'Z') != 'Z') {
            int i3 = valueOf + 27;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj instanceof updateNodes) {
            updateNodes updatenodes = (updateNodes) obj;
            return !(!runAnimators.values((Object) ag$a(), (Object) updatenodes.ag$a())) && runAnimators.values((Object) this.values, (Object) updatenodes.values);
        }
        return false;
    }

    public int hashCode() {
        int i = ag$a + 93;
        valueOf = i % 128;
        int i2 = i % 2;
        int hashCode = (ag$a().hashCode() * 31) + this.values.hashCode();
        int i3 = valueOf + 109;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        String str = "StoryCommentComponent(id=" + ag$a() + ", text=" + this.values + ')';
        int i = valueOf + 5;
        ag$a = i % 128;
        if ((i % 2 == 0 ? TokenParser.SP : '\'') != '\'') {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public final String valueOf() {
        String str;
        try {
            int i = ag$a + 109;
            valueOf = i % 128;
            Object obj = null;
            if (i % 2 != 0) {
                str = this.values;
                super.hashCode();
            } else {
                str = this.values;
            }
            int i2 = ag$a + 71;
            valueOf = i2 % 128;
            if ((i2 % 2 != 0 ? 'C' : 'P') != 'C') {
                return str;
            }
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(toString, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * toString));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
