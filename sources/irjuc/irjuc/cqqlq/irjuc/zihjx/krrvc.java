package irjuc.irjuc.cqqlq.irjuc.zihjx;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import o.AutoTransition;
import o.ChangeBounds;
import o.beginAsyncSectionFallback;
import o.handleException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class krrvc implements handleException {
    public ChangeBounds.AnonymousClass2 toString;

    /* loaded from: classes5.dex */
    public enum irjuc {
        HIGH,
        LOW
    }

    public void ah$a(String str, String str2, irjuc irjucVar) {
        beginAsyncSectionFallback.ah$a(str, str2);
        if (irjuc.HIGH.equals(irjucVar)) {
            String format = String.format("tag = {%s}, errorMessage = {%s}", str, str2);
            irjuc.irjuc.cqqlq.irjuc.rmqfk.jmbjl ag$a = this.toString.ag$a("RUNTIME_ERROR");
            AutoTransition.put((JSONObject) ag$a.get("data"), ag$a.getObjectFactory(), "errorMessage", format);
            this.toString.ag$a(ag$a);
            throw new RuntimeException(str2);
        }
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        this.toString = (ChangeBounds.AnonymousClass2) jmjouVar.values(ChangeBounds.AnonymousClass2.class);
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return true;
    }
}
