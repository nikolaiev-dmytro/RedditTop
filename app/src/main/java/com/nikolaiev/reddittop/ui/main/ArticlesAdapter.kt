package com.nikolaiev.reddittop.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.nikolaiev.reddittop.R
import com.nikolaiev.reddittop.databinding.ItemArticleBinding
import com.nikolaiev.reddittop.model.ArticleData

class ArticlesAdapter :
    PagedListAdapter<ArticleData, ArticlesAdapter.ArticleHolder>(DiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        return ArticleHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_article,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    inner class ArticleHolder(private val binding: ItemArticleBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(data: ArticleData) {
            binding.article = data
            binding.executePendingBindings()
        }
    }


    class DiffCallback : DiffUtil.ItemCallback<ArticleData>() {
        override fun areItemsTheSame(oldItem: ArticleData, newItem: ArticleData): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ArticleData, newItem: ArticleData): Boolean {
            return oldItem == newItem
        }


    }


}