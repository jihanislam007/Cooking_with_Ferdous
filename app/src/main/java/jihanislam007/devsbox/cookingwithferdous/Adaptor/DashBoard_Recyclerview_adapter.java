package jihanislam007.devsbox.cookingwithferdous.Adaptor;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;

import jihanislam007.devsbox.cookingwithferdous.Adaptor.ModelClass.CategoryList;
import jihanislam007.devsbox.cookingwithferdous.MainActivity;
import jihanislam007.devsbox.cookingwithferdous.R;
import jihanislam007.devsbox.cookingwithferdous.ui.gallery.GalleryFragment;


public class DashBoard_Recyclerview_adapter extends RecyclerView.Adapter<DashBoard_Recyclerview_adapter.myViewHolder>{

    Context mcontext;
    ArrayList<CategoryList> categoryList;

    public DashBoard_Recyclerview_adapter(Context context, ArrayList<CategoryList> categoryList){
        this.mcontext = context;
        this.categoryList = categoryList;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_dashboard,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {


        /*Glide.with(mcontext)
                .load(categoryList.get(position).getCategoryImage())
                .centerCrop()
                .placeholder(R.drawable.demo)
                .into(holder.CategoryItemImageView);*/
        //Glide.with(mcontext).load(categoryList.get(position).getLayoutImageURL()).into(holder.backgroundImageView);
        Glide.with(mcontext)
                .load(categoryList.get(position).getImageURL())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.backgroundImageView);

        holder.categoryItemNameTV.setText(categoryList.get(position).getTitleName());
        //holder.categoryItemDetailsTV.setText(categoryList.get(position).getProcedure()+"");
        holder.backgroundImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle=new Bundle();

                bundle.putString("TitleName", categoryList.get(position).getTitleName());
                bundle.putInt("getCategoryItemid", categoryList.get(position).getCategoryItemid());
                bundle.putString("Image",categoryList.get(position).getImageURL());
                bundle.putString("elaments",categoryList.get(position).getUpokoron());
                bundle.putString("procedure",categoryList.get(position).getProcedure());

                GalleryFragment detailsFragment = new GalleryFragment();
                detailsFragment.setArguments(bundle);

                FragmentTransaction fragTransaction = ((MainActivity)mcontext).getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.nav_host_fragment,detailsFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();
            }
        });


        holder.backgroundLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Bundle bundle=new Bundle();
                bundle.putInt("category_id",categoryList.get(position).CategoryId);

                bundle.putString("category_name",categoryList.get(position).getCategoryName());
                bundle.putString("CategoryImage",categoryList.get(position).getCategoryImage());*/

                /*RecipeListFragment recipeListFragment = new RecipeListFragment();
                recipeListFragment.setArguments(bundle);
                //   Toast.makeText(mcontext, "Image :"+String.valueOf(bundle), Toast.LENGTH_SHORT).show();
                FragmentTransaction fragTransaction = ((DashBoardActivity)mcontext).getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.frag_container,recipeListFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();*/

            }
        });


    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        LinearLayout backgroundLinearLayout;
        TextView categoryItemNameTV,catagoryCounterTV;
        ImageView backgroundImageView,CategoryItemImageView;

        public myViewHolder(View itemView) {
            super(itemView);


            backgroundLinearLayout = itemView.findViewById(R.id.backgroundLinearLayout);
            backgroundImageView = itemView.findViewById(R.id.backgroundImageView);
            categoryItemNameTV = itemView.findViewById(R.id.categoryItemNameTV);


        }

        @Override
        public void onClick(View view) {

        }
    }
}