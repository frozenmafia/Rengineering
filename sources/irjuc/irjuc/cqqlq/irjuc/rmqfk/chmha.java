package irjuc.irjuc.cqqlq.irjuc.rmqfk;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou;
/* loaded from: classes5.dex */
public class chmha<T extends jmjou> extends jmjou {
    public void ag$a(T t) {
        put("data", t.toJsonObject());
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, o.AutoTransition, o.handleException
    public void init(irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou jmjouVar, jmjou.chmha chmhaVar) {
        super.init(jmjouVar, chmhaVar);
        put("data", null);
    }
}
