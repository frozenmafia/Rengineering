package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class onPause {
    private final List<setSessionImpl> valueOf = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(setSessionImpl setsessionimpl) {
        this.valueOf.add(setsessionimpl);
    }

    public void ah$a(Path path) {
        for (int size = this.valueOf.size() - 1; size >= 0; size--) {
            ActivityViewModelLazyKt$viewModels$1.toString(path, this.valueOf.get(size));
        }
    }
}
