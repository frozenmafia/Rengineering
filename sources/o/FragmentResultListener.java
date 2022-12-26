package o;
/* loaded from: classes4.dex */
public interface FragmentResultListener {
    void createContentView(String str);

    void destroyContentView();

    void hide();

    boolean isContentViewReady();

    boolean isShowing();

    void show();
}
