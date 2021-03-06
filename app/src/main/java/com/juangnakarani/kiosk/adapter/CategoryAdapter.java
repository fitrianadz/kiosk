package com.juangnakarani.kiosk.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.juangnakarani.kiosk.R;
import com.juangnakarani.kiosk.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHoler> {

    private List<Category> categories;

    public CategoryAdapter(List<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_category, parent, false);
        return new CategoryViewHoler(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHoler holder, int position) {
        Category category = categories.get(position);
        holder.id.setText(String.valueOf(category.getId()));
        holder.description.setText(category.getDescription().toString());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class CategoryViewHoler extends RecyclerView.ViewHolder {
        public TextView id, description;

        public CategoryViewHoler(View itemView) {
            super(itemView);
            this.id = itemView.findViewById(R.id.category_id);
            this.description = itemView.findViewById(R.id.category_description);
        }
    }
}
