package jihanislam007.devsbox.cookingwithferdous.ui.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import jihanislam007.devsbox.cookingwithferdous.R;

public class GalleryFragment extends Fragment {

    TextView TitleNameTextView,
            Upokoron,
            karjopronali,
            UpokoronTitleTextView,
            karjopronaliTitleTextView;
    ImageView ItemListImageView;
    Context mcontext;
    LinearLayout ShareRecipeLinearLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        ItemListImageView = rootView.findViewById(R.id.ItemListImageView);
        TitleNameTextView = (TextView) rootView.findViewById(R.id.TitleNameTextView);
        Upokoron = (TextView) rootView.findViewById(R.id.textViewupodetail);
        karjopronali = (TextView) rootView.findViewById(R.id.textViewKarjoDetail);


        UpokoronTitleTextView = (TextView) rootView.findViewById(R.id.UpokoronTitleTextView);
        karjopronaliTitleTextView = (TextView) rootView.findViewById(R.id.karjopronaliTitleTextView);

        ShareRecipeLinearLayout = (LinearLayout) rootView.findViewById(R.id.ShareRecipeLinearLayout);

        final String TitleName = getArguments().getString("TitleName");
        final String upokoron = getArguments().getString("elaments");
        final String procedure = getArguments().getString("procedure");

        TitleNameTextView.setText(TitleName);
        Upokoron.setText(upokoron);
        karjopronali.setText(procedure);



        String Image = getArguments().getString("Image");

        Glide.with(getActivity())
                .load(Image)
                .diskCacheStrategy(DiskCacheStrategy.ALL).fitCenter()
                .into(ItemListImageView);

        return rootView;
    }
}