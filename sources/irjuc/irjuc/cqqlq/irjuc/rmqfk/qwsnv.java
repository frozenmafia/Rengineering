package irjuc.irjuc.cqqlq.irjuc.rmqfk;

import com.apxor.androidsdk.core.Constants;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import org.json.JSONArray;
/* loaded from: classes5.dex */
public class qwsnv extends jmjou {
    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, o.AutoTransition, o.handleException
    public void init(irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou jmjouVar, jmjou.chmha chmhaVar) {
        super.init(jmjouVar, chmhaVar);
        put("currentSdkTime", Long.valueOf(System.currentTimeMillis()));
        jmjouVar.getClass();
        put(Constants.EVENTS_TABLE, new JSONArray());
    }
}
