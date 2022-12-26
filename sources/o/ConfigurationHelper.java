package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.app.dream11.model.UserPrefData;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class ConfigurationHelper extends ComplexColorCompat<RecyclerView.ViewHolder> {
    Context valueOf;
    private HashMap<String, ArrayList<UserPrefData>> values;

    public ConfigurationHelper(Context context, HashMap<String, ArrayList<UserPrefData>> hashMap) {
        this.valueOf = context;
        this.values = hashMap;
    }

    @Override // o.ComplexColorCompat
    public int values() {
        return this.values.size();
    }

    @Override // o.ComplexColorCompat
    public int ag$a(int i) {
        ArrayList arrayList = new ArrayList(this.values.keySet());
        if (arrayList.size() > 0) {
            Object obj = arrayList.get(i);
            this.values.containsKey(obj.toString());
            return this.values.get(obj).size();
        }
        return 0;
    }

    @Override // o.ComplexColorCompat
    public void values(RecyclerView.ViewHolder viewHolder, int i) {
        ArrayList arrayList = new ArrayList(this.values.keySet());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConfigurationHelper$ah$a) viewHolder).ah$a.setText(arrayList.get(i).toString());
        }
    }

    @Override // o.ComplexColorCompat
    public RecyclerView.ViewHolder ah$a(ViewGroup viewGroup, boolean z) {
        if (z) {
            return new ConfigurationHelper$ah$a(LayoutInflater.from(viewGroup.getContext()).inflate(com.app.dream11Pro.R.layout.res_0x7f0d046c, viewGroup, false));
        }
        return new ConfigurationHelper$ag$a(LayoutInflater.from(viewGroup.getContext()).inflate(com.app.dream11Pro.R.layout.res_0x7f0d046b, viewGroup, false));
    }

    @Override // o.ComplexColorCompat
    public void ag$a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        final ConfigurationHelper$ag$a configurationHelper$ag$a = (ConfigurationHelper$ag$a) viewHolder;
        ArrayList arrayList = new ArrayList(this.values.keySet());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i);
            this.values.containsKey(obj.toString());
            ArrayList<UserPrefData> arrayList2 = this.values.get(obj);
            configurationHelper$ag$a.ag$a.setText(arrayList2.get(i2).getSquadShortName());
            if (arrayList2.get(i2).isSelected()) {
                configurationHelper$ag$a.valueOf.setBackgroundResource(com.app.dream11Pro.R.drawable.shape_green_border);
                configurationHelper$ag$a.values.setVisibility(0);
            } else {
                configurationHelper$ag$a.valueOf.setBackgroundResource(com.app.dream11Pro.R.drawable.shape_grey_border);
                configurationHelper$ag$a.values.setVisibility(8);
            }
            createPopup.valueOf(arrayList2.get(i2).getTeamFlagUrl(), configurationHelper$ag$a.ah$a);
            configurationHelper$ag$a.ag$a.setTag(arrayList2.get(i2));
            configurationHelper$ag$a.ag$a.setOnClickListener(new View.OnClickListener() { // from class: o.ConfigurationHelper.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    UserPrefData userPrefData = (UserPrefData) view.getTag();
                    if (userPrefData.isSelected()) {
                        configurationHelper$ag$a.valueOf.setBackgroundResource(com.app.dream11Pro.R.drawable.shape_grey_border);
                        configurationHelper$ag$a.values.setVisibility(8);
                        userPrefData.setSelected(false);
                        return;
                    }
                    configurationHelper$ag$a.valueOf.setBackgroundResource(com.app.dream11Pro.R.drawable.shape_green_border);
                    configurationHelper$ag$a.values.setVisibility(0);
                    userPrefData.setSelected(true);
                }
            });
        }
    }

    public HashMap<String, ArrayList<UserPrefData>> ah$a() {
        return this.values;
    }
}
