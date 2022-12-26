package o;
/* loaded from: classes5.dex */
public class openHelperFactory {
    Float toString;
    Float values;

    public openHelperFactory(android.media.ExifInterface exifInterface) {
        String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE);
        String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF);
        String attribute3 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE);
        String attribute4 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return;
        }
        if (attribute2.equals("N")) {
            this.toString = ag$a(attribute);
        } else {
            this.toString = Float.valueOf(0.0f - ag$a(attribute).floatValue());
        }
        if (attribute4.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
            this.values = ag$a(attribute3);
        } else {
            this.values = Float.valueOf(0.0f - ag$a(attribute3).floatValue());
        }
    }

    private Float ag$a(String str) {
        String[] split = str.split(",", 3);
        String[] split2 = split[0].split("/", 2);
        Double valueOf = Double.valueOf(split2[0]);
        Double valueOf2 = Double.valueOf(split2[1]);
        String[] split3 = split[1].split("/", 2);
        Double valueOf3 = Double.valueOf(split3[0]);
        Double valueOf4 = Double.valueOf(split3[1]);
        String[] split4 = split[2].split("/", 2);
        return Float.valueOf((float) ((valueOf.doubleValue() / valueOf2.doubleValue()) + ((valueOf3.doubleValue() / valueOf4.doubleValue()) / 60.0d) + ((Double.valueOf(split4[0]).doubleValue() / Double.valueOf(split4[1]).doubleValue()) / 3600.0d)));
    }

    public Float valueOf() {
        return this.toString;
    }

    public Float ah$a() {
        return this.values;
    }
}
