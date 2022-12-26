package o;

import android.view.View;
/* loaded from: classes3.dex */
public interface ServiceCompat {

    /* loaded from: classes3.dex */
    public final /* synthetic */ class StopForegroundFlags implements getAlwaysExpand {
        public static final /* synthetic */ StopForegroundFlags ag$a = new StopForegroundFlags();

        private /* synthetic */ StopForegroundFlags() {
        }

        @Override // o.getAlwaysExpand
        public final void onItemBind(m mVar, int i, Object obj) {
            configureMenuItem.ah$a(mVar, i, (setAllowDataType) obj);
        }
    }

    void ag$a();

    void ag$a(String str, String str2);

    void ag$a(createFilesDir createfilesdir);

    void ah$a();

    void toString(boolean z);

    boolean toString(View view, createFilesDir createfilesdir);

    void valueOf();

    void values();

    void values(createFilesDir createfilesdir);
}
