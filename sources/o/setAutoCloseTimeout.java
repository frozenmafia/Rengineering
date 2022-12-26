package o;

import android.os.Build;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes5.dex */
public class setAutoCloseTimeout {
    setAutoCloseTimeout() {
    }

    public static WritableMap values(String str) throws IOException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        List<String> valueOf = valueOf();
        if (Build.VERSION.SDK_INT >= 23) {
            valueOf.addAll(values());
        }
        android.media.ExifInterface exifInterface = new android.media.ExifInterface(str);
        try {
            openHelperFactory openhelperfactory = new openHelperFactory(exifInterface);
            if (openhelperfactory.valueOf() != null && openhelperfactory.ah$a() != null) {
                writableNativeMap.putDouble("Latitude", openhelperfactory.valueOf().floatValue());
                writableNativeMap.putDouble("Longitude", openhelperfactory.ah$a().floatValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str2 : valueOf) {
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    private static List<String> valueOf() {
        return new ArrayList(Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_DATETIME, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_FLASH, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS, androidx.exifinterface.media.ExifInterface.TAG_MAKE, androidx.exifinterface.media.ExifInterface.TAG_MODEL, androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE));
    }

    private static List<String> values() {
        return new ArrayList(Arrays.asList(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL));
    }
}
