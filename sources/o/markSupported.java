package o;

import com.th3rdwave.safeareacontext.SafeAreaViewEdges;
import com.th3rdwave.safeareacontext.SafeAreaViewMode;
import java.util.EnumSet;
/* loaded from: classes5.dex */
public class markSupported {
    private EnumSet<SafeAreaViewEdges> ag$a;
    private getChannel ah$a;
    private SafeAreaViewMode valueOf;

    public markSupported(getChannel getchannel, SafeAreaViewMode safeAreaViewMode, EnumSet<SafeAreaViewEdges> enumSet) {
        this.ah$a = getchannel;
        this.valueOf = safeAreaViewMode;
        this.ag$a = enumSet;
    }

    public getChannel valueOf() {
        return this.ah$a;
    }

    public SafeAreaViewMode values() {
        return this.valueOf;
    }

    public EnumSet<SafeAreaViewEdges> ag$a() {
        return this.ag$a;
    }
}
