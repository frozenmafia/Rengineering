package o;
/* loaded from: classes4.dex */
public class setMenuVisibility implements setOnStartEnterTransitionListener {
    private static setMenuVisibility valueOf;

    @Override // o.setOnStartEnterTransitionListener
    public void ag$a(setInitialSavedState setinitialsavedstate) {
    }

    private setMenuVisibility() {
    }

    public static setMenuVisibility ah$a() {
        setMenuVisibility setmenuvisibility;
        synchronized (setMenuVisibility.class) {
            if (valueOf == null) {
                valueOf = new setMenuVisibility();
            }
            setmenuvisibility = valueOf;
        }
        return setmenuvisibility;
    }
}
