package o;

import java.util.ArrayList;
/* loaded from: classes4.dex */
public class createWrapper {
    private static final Object ah$a = new Object();
    private ArrayList<performPrivateCommand> ag$a = new ArrayList<>();

    public void ah$a(performPrivateCommand performprivatecommand) {
        synchronized (ah$a) {
            try {
                int size = this.ag$a.size();
                if (size > 50) {
                    ArrayList<performPrivateCommand> arrayList = new ArrayList<>();
                    for (int i = 10; i < size; i++) {
                        arrayList.add(this.ag$a.get(i));
                    }
                    arrayList.add(performprivatecommand);
                    this.ag$a = arrayList;
                } else {
                    this.ag$a.add(performprivatecommand);
                }
            } catch (Exception unused) {
            }
        }
    }

    public performPrivateCommand ah$a() {
        performPrivateCommand remove;
        synchronized (ah$a) {
            remove = this.ag$a.isEmpty() ? null : this.ag$a.remove(0);
        }
        return remove;
    }
}
