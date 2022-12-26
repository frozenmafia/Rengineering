package irjuc.irjuc.cqqlq.irjuc.rmqfk;

import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import java.util.Iterator;
import o.AutoTransition;
import o.beginAsyncSectionFallback;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class jmbjl extends jmjou {
    public static jmbjl ah$a(irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou jmjouVar, String str) {
        jmbjl jmbjlVar = (jmbjl) jmjouVar.values(jmbjl.class);
        try {
            JSONObject jSONObject = new JSONObject(str);
            jmbjlVar.put("eventName", beginAsyncSectionFallback.toString(jSONObject, "eventName", false, false));
            JSONObject ah$a = beginAsyncSectionFallback.ah$a(jSONObject, "data", false, false);
            if (ah$a != null) {
                Iterator<String> keys = ah$a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (ah$a.opt(next) != null) {
                        jmbjlVar.toString(next, ah$a.opt(next));
                    }
                }
            }
        } catch (JSONException e) {
            beginAsyncSectionFallback.valueOf("Event", String.format("JSONException caught, message = {%s}", e.getMessage()), e);
        }
        return jmbjlVar;
    }

    public <T> jmbjl toString(String str, T t) {
        AutoTransition.put((JSONObject) get("data"), getObjectFactory(), str, t);
        return this;
    }

    @Override // irjuc.irjuc.cqqlq.irjuc.rmqfk.jmjou, o.AutoTransition, o.handleException
    public void init(irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou jmjouVar, jmjou.chmha chmhaVar) {
        super.init(jmjouVar, chmhaVar);
        jmjouVar.getClass();
        put("data", new JSONObject());
        put("eventTime", Long.valueOf(System.currentTimeMillis()));
        AutoTransition.put((JSONObject) get("data"), getObjectFactory(), "intentSupported", String.valueOf(true));
    }
}
