package o;
/* loaded from: classes4.dex */
public class restoreAllState extends doLoaderRetain {
    private long ah$a = -1;
    private long toString = -1;
    private reportLoaderStart values;

    public restoreAllState(reportLoaderStart reportloaderstart) {
        this.values = reportloaderstart;
    }

    @Override // o.doLoaderRetain, o.dumpLoaders
    public void onSubmit(String str, Object obj) {
        this.ah$a = System.currentTimeMillis();
    }

    @Override // o.doLoaderRetain, o.dumpLoaders
    public void onFinalImageSet(String str, Object obj, android.graphics.drawable.Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.toString = currentTimeMillis;
        reportLoaderStart reportloaderstart = this.values;
        if (reportloaderstart != null) {
            reportloaderstart.ah$a(currentTimeMillis - this.ah$a);
        }
    }
}
