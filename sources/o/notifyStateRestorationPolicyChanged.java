package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class notifyStateRestorationPolicyChanged implements dispatchUpdate {
    private static notifyStateRestorationPolicyChanged values = new notifyStateRestorationPolicyChanged();
    final HashMap<processPersistent, List<processPersistent>> toString = new HashMap<>();

    private notifyStateRestorationPolicyChanged() {
    }

    public static notifyStateRestorationPolicyChanged ah$a() {
        return values;
    }

    public void ah$a(processPersistent processpersistent) {
        synchronized (this.toString) {
            List<processPersistent> list = this.toString.get(processpersistent);
            if (list == null) {
                list = new ArrayList<>();
                this.toString.put(processpersistent, list);
            }
            list.add(processpersistent);
            if (!processpersistent.ah$a().ah$a()) {
                processPersistent values2 = processpersistent.values(addViewInt.ah$a(processpersistent.ah$a().ag$a()));
                List<processPersistent> list2 = this.toString.get(values2);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.toString.put(values2, list2);
                }
                list2.add(processpersistent);
            }
            processpersistent.ag$a(true);
            processpersistent.valueOf(this);
        }
    }

    private void ag$a(processPersistent processpersistent) {
        processPersistent values2;
        List<processPersistent> list;
        synchronized (this.toString) {
            List<processPersistent> list2 = this.toString.get(processpersistent);
            boolean z = true;
            int i = 0;
            int i2 = 0;
            if (list2 != null) {
                while (true) {
                    if (i2 >= list2.size()) {
                        i2 = 0;
                        break;
                    } else if (list2.get(i2) == processpersistent) {
                        list2.remove(i2);
                        i2 = 1;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (list2.isEmpty()) {
                    this.toString.remove(processpersistent);
                }
            }
            if (i2 == 0 && processpersistent.values()) {
                z = false;
            }
            RecyclerView.ItemAnimator.AdapterChanges.ah$a(z);
            if (!processpersistent.ah$a().ah$a() && (list = this.toString.get((values2 = processpersistent.values(addViewInt.ah$a(processpersistent.ah$a().ag$a()))))) != null) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (list.get(i) == processpersistent) {
                        list.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (list.isEmpty()) {
                    this.toString.remove(values2);
                }
            }
        }
    }

    @Override // o.dispatchUpdate
    public void values(processPersistent processpersistent) {
        ag$a(processpersistent);
    }
}
