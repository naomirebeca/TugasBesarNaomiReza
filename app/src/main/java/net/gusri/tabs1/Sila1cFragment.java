package net.gusri.tabs1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import net.gusri.pancasila.R;

/**
 * Created by ghostonk on 28/11/16.
 */

public class Sila1cFragment extends Fragment {
    private ImageView mLambang;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Sign Sila1cFragment ke Layout fragment_tab3
        View mView = inflater.inflate(R.layout.fragment_tab3, container, false);

        mLambang = (ImageView) mView.findViewById(R.id.img_Lambang);
        mLambang.setImageResource(R.drawable.kt);

        final WebView mWb = (WebView) mView.findViewById(R.id.wv_Tab3);
        mWb.loadUrl("file:///android_asset/web/sila1/pagebutirA.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}
