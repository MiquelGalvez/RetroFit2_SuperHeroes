package campalans.dam.retrofit2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import campalans.dam.retrofit2.databinding.ItemSuperheroeBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroeBinding.bind(view)
    fun bind(superheroeItemResponse: SuperHeroeItemResponse, onItemSelected:(String) -> Unit){
        binding.tvSuperheroeName.text = superheroeItemResponse.name
        Picasso.get().load(superheroeItemResponse.imageheroe.url).into(binding.ImageViewHeroe)
        binding.root.setOnClickListener{
            onItemSelected(superheroeItemResponse.id)
        }
    }
}