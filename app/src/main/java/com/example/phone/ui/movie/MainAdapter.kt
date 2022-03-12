package com.example.phone.ui.movie

import androidx.databinding.ViewDataBinding
import com.example.phone.BR
import com.example.phone.R
import com.example.phone.domain.model.movie.MovieUiModel
import com.example.phone.ui.utils.base.ViewOnClickListener
import com.example.phone.ui.utils.base.recyclerview.BaseBindingRVModel
import com.example.phone.ui.utils.base.recyclerview.BaseBindingViewHolder
import com.example.phone.ui.utils.base.recyclerview.BaseViewHolderBindingFactory

/**
 * This class contains a factory method
 *
 */
class MovieVHFactory : BaseViewHolderBindingFactory() {

    /**
     * Factory method to create corresponding ViewHolder for item view in a Recyclerview
     *
     * @param binding binding for the view
     * @param viewType view id
     * @param viewClickCallback callback for click in item view
     * @return View holder for item view
     */
    override fun create(
        binding: ViewDataBinding,
        viewType: Int,
        viewClickCallback: ViewOnClickListener?
    ): BaseBindingViewHolder<out BaseBindingRVModel> {
        return when (viewType) {
            R.layout.item_movie -> MovieViewHolder(binding, viewClickCallback)

            else -> BaseBindingViewHolder(binding)
        }
    }
}

/**
 *This is a view holder for item in a recyclerview
 *
 * @property viewClickCallback A callback for view click
 *
 * @param binding A binding for view
 */
class MovieViewHolder(
    binding: ViewDataBinding,
    private val viewClickCallback: ViewOnClickListener?
) : BaseBindingViewHolder<MovieRVModel>(binding) {
    override fun bindView(model: MovieRVModel) {
    }
}

/**
 * Wrapper class for item which contains model for it
 *
 * @property movieUiModel Model for item view
 */
class MovieRVModel(val movieUiModel: MovieUiModel) :
    BaseBindingRVModel {

    override fun getLayoutId(): Int {
        return R.layout.item_movie
    }

    override fun getBindingPairs(): List<Pair<Int, Any>> {
        return listOf(Pair(BR.uiModel, movieUiModel))
    }
}
