package o;

import com.app.dream11.teamselection.newcreateteam.ComponentSpecialPlayerList;
import java.util.ArrayList;
import o.ShareCompat;
/* loaded from: classes3.dex */
public final class setResultsSource {
    @androidx.databinding.BindingAdapter({"shouldShowPercentageInfo"})
    public static final void toString(ComponentSpecialPlayerList componentSpecialPlayerList, Boolean bool) {
        if (componentSpecialPlayerList == null) {
            return;
        }
        componentSpecialPlayerList.setShouldShowPercentage$app_proProdRelease(bool == null ? false : bool.booleanValue());
    }

    @androidx.databinding.BindingAdapter({"roleList"})
    public static final void toString(ComponentSpecialPlayerList componentSpecialPlayerList, ArrayList<getExternalCacheDirs> arrayList) {
        if (componentSpecialPlayerList == null) {
            return;
        }
        componentSpecialPlayerList.setListOfPlayerRoleVM(arrayList);
    }

    @androidx.databinding.BindingAdapter({"player"})
    public static final void ah$a(ComponentSpecialPlayerList componentSpecialPlayerList, createFilesDir createfilesdir) {
        if (componentSpecialPlayerList == null) {
            return;
        }
        componentSpecialPlayerList.setPlayerBeanVM(createfilesdir);
    }

    @androidx.databinding.BindingAdapter({"specialPlayerHandler"})
    public static final void values(ComponentSpecialPlayerList componentSpecialPlayerList, ShareCompat.Api16Impl api16Impl) {
        if (componentSpecialPlayerList == null) {
            return;
        }
        componentSpecialPlayerList.setSpecialPlayerSelectionHandler$app_proProdRelease(api16Impl);
    }

    @androidx.databinding.BindingAdapter({"currentActiveRole"})
    public static final void ah$a(ComponentSpecialPlayerList componentSpecialPlayerList, getExternalCacheDirs getexternalcachedirs) {
        if (componentSpecialPlayerList == null) {
            return;
        }
        componentSpecialPlayerList.setCurrentSelectedRole(getexternalcachedirs);
    }
}
