package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class setTargetVelocity {
    private int toString = 0;
    private List<Map<String, Object>> valueOf;

    public setTargetVelocity() {
        this.valueOf = null;
        this.valueOf = new ArrayList();
    }

    public void values(String str, Map<String, Object> map, int i) {
        map.put("t", str);
        map.put("st", Integer.valueOf(i));
        map.put("seq", Integer.valueOf(this.toString));
        this.toString++;
        this.valueOf.add(map);
    }

    public int ah$a() {
        return this.valueOf.size();
    }

    public List<Map<String, Object>> valueOf() {
        List<Map<String, Object>> list = this.valueOf;
        this.valueOf = new ArrayList();
        return list;
    }
}
