package o;

import com.fancode.livestream.type.SSAIProvider;
import java.util.List;
import o.ComponentActivity;
/* loaded from: classes4.dex */
public final class LifecycleOwner$ah$a {
    private ComponentActivity.AnonymousClass5<List<SSAIProvider>> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleOwner$ah$a() {
        ComponentActivity.AnonymousClass5<List<SSAIProvider>> ag$a;
        ag$a = ComponentActivity.AnonymousClass5.ag$a.ag$a();
        this.valueOf = ag$a;
    }

    public LifecycleOwner$ah$a values(List<SSAIProvider> list) {
        this.valueOf = ComponentActivity.AnonymousClass5.toString(list);
        return this;
    }

    public LifecycleOwner ag$a() {
        return new LifecycleOwner(this.valueOf);
    }
}
