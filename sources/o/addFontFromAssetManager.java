package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class addFontFromAssetManager {
    public final List<addFontFromBuffer> toString = new ArrayList();

    public final addFontFromBuffer toString(addFontFromBuffer addfontfrombuffer) {
        addFontFromBuffer addfontfrombuffer2;
        synchronized (this) {
            runAnimators.ag$a(addfontfrombuffer, "networkQueueItem");
            this.toString.add(addfontfrombuffer);
            addfontfrombuffer2 = this.toString.size() == 1 ? (addFontFromBuffer) reserveEndViewTransition.HaptikSDK$b((List<? extends Object>) this.toString) : null;
        }
        return addfontfrombuffer2;
    }

    public final addFontFromBuffer valueOf() {
        addFontFromBuffer addfontfrombuffer;
        synchronized (this) {
            synchronized (this) {
                if (!this.toString.isEmpty()) {
                    this.toString.remove(0);
                }
            }
            return addfontfrombuffer;
        }
        synchronized (this) {
            addfontfrombuffer = (addFontFromBuffer) reserveEndViewTransition.invoke((List<? extends Object>) this.toString);
        }
        return addfontfrombuffer;
    }
}
