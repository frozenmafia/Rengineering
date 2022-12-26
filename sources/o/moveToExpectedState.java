package o;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
/* loaded from: classes6.dex */
public class moveToExpectedState implements resume {
    private final int ag$a;
    private final int ah$a;
    private final int toString;
    private final String valueOf = "Fabric.SendAccessibilityEvent";

    public moveToExpectedState(int i, int i2, int i3) {
        this.toString = i;
        this.ah$a = i2;
        this.ag$a = i3;
    }

    @Override // o.resume
    public void ag$a(addViewToContainer addviewtocontainer) {
        try {
            addviewtocontainer.toString(this.toString, this.ah$a, this.ag$a);
        } catch (RetryableMountingLayerException e) {
            ReactSoftExceptionLogger.logSoftException("Fabric.SendAccessibilityEvent", e);
        }
    }

    @Override // o.resume
    public int values() {
        return this.toString;
    }

    public String toString() {
        return "SendAccessibilityEvent [" + this.ah$a + "] " + this.ag$a;
    }
}
