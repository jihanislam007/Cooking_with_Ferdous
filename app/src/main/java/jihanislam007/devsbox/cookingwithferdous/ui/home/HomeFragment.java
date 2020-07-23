package jihanislam007.devsbox.cookingwithferdous.ui.home;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import jihanislam007.devsbox.cookingwithferdous.Adaptor.DashBoard_Recyclerview_adapter;
import jihanislam007.devsbox.cookingwithferdous.Adaptor.ModelClass.CategoryList;
import jihanislam007.devsbox.cookingwithferdous.R;

public class HomeFragment extends Fragment {

    RecyclerView CategoryRecyclerView;
    ArrayList<CategoryList> categoryList = new ArrayList<CategoryList>();
    DashBoard_Recyclerview_adapter dashBoard_recyclerview_adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView =   inflater.inflate(R.layout.fragment_home, container, false);

        CategoryRecyclerView = rootView.findViewById(R.id.CategoryRecyclerView);

        CategoryRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        dashBoard_recyclerview_adapter = new DashBoard_Recyclerview_adapter(getContext(),categoryList);
        CategoryRecyclerView.setAdapter(dashBoard_recyclerview_adapter);

        CategoryDataserver();

        return rootView;
    }

    private void CategoryDataserver() {
        String ingredients = getString(R.string.ingredients);
        String procedure = getString(R.string.procedure);


        CategoryList a = new CategoryList("Recipe One", "https://www.telegraph.co.uk/content/dam/food-and-drink/2019/01/11/TELEMMGLPICT000185036503_trans_NvBQzQNjv4BqodXSHHE-j78vyZ0iwRUmY_nuzprQ_mxVCWqrJBTJk3A.jpeg",ingredients,procedure,1);
        categoryList.add(a);
        CategoryList b = new CategoryList("Recipe One", "https://i.ytimg.com/vi/byjfIQzz4Xo/maxresdefault.jpg",ingredients,procedure,2);
        categoryList.add(b);
        CategoryList c = new CategoryList("Recipe Three", "https://www.telegraph.co.uk/content/dam/food-and-drink/2019/01/11/TELEMMGLPICT000185036503_trans_NvBQzQNjv4BqodXSHHE-j78vyZ0iwRUmY_nuzprQ_mxVCWqrJBTJk3A.jpeg",ingredients,procedure,1);
        categoryList.add(c);
        CategoryList d = new CategoryList("Recipe Four", "https://i.ytimg.com/vi/byjfIQzz4Xo/maxresdefault.jpg",ingredients,procedure,2);
        categoryList.add(d);
        CategoryList e = new CategoryList("Recipe Five", "https://www.telegraph.co.uk/content/dam/food-and-drink/2019/01/11/TELEMMGLPICT000185036503_trans_NvBQzQNjv4BqodXSHHE-j78vyZ0iwRUmY_nuzprQ_mxVCWqrJBTJk3A.jpeg",ingredients,procedure,1);
        categoryList.add(e);
        CategoryList f = new CategoryList("Recipe six", "https://i.ytimg.com/vi/byjfIQzz4Xo/maxresdefault.jpg",ingredients,procedure,2);
        categoryList.add(f);
        CategoryList g = new CategoryList("Recipe Seven", "https://www.telegraph.co.uk/content/dam/food-and-drink/2019/01/11/TELEMMGLPICT000185036503_trans_NvBQzQNjv4BqodXSHHE-j78vyZ0iwRUmY_nuzprQ_mxVCWqrJBTJk3A.jpeg",ingredients,procedure,1);
        categoryList.add(g);
        CategoryList h = new CategoryList("Recipe Eight", "https://i.ytimg.com/vi/byjfIQzz4Xo/maxresdefault.jpg",ingredients,procedure,2);
        categoryList.add(h);

    }
}