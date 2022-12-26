package o;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class performViewCreated {
    public static List<String> ag$a(requireActivity requireactivity) {
        ArrayList arrayList;
        try {
            if (requireactivity instanceof requireFragmentManager) {
                List<requireActivity> ag$a = ((requireFragmentManager) requireactivity).ag$a();
                arrayList = new ArrayList(ag$a.size());
                for (int i = 0; i < ag$a.size(); i++) {
                    arrayList.add(valueOf(ag$a.get(i)));
                }
            } else {
                arrayList = new ArrayList(1);
                arrayList.add(requireactivity.isResourceIdForDebugging() ? requireactivity.getUriString() : valueOf(requireactivity));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toString(requireActivity requireactivity) {
        try {
            if (requireactivity instanceof requireFragmentManager) {
                return valueOf(((requireFragmentManager) requireactivity).ag$a().get(0));
            }
            return valueOf(requireactivity);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String valueOf(requireActivity requireactivity) throws UnsupportedEncodingException {
        return loadAnimation.ah$a(requireactivity.getUriString().getBytes("UTF-8"));
    }
}
