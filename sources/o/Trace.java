package o;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
/* loaded from: classes5.dex */
public class Trace implements handleException {
    public String ah$a = "eventBridge";
    public __union valueOf;
    public jmjou values;

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        beginAsyncSectionFallback.ag$a("EventLoggerJS", "initializing EventLoggerJS ..");
        this.values = jmjouVar;
        __union __unionVar = (__union) chmhaVar.irjuc("bridgeCallback", null);
        this.valueOf = __unionVar;
        beginAsyncSectionFallback.ag$a("EventLoggerJS", String.format("initialization completed bridgeCallback = {%s} is set", __unionVar));
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return false;
    }
}
