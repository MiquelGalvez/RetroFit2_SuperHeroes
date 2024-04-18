package campalans.dam.retrofit2

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(@SerializedName("response") val response: String,
                                 @SerializedName("results") val superheroes: List<SuperHeroeItemResponse>)

data class SuperHeroeItemResponse(@SerializedName("id") val id: String,
                                  @SerializedName("name") val name: String,
                                  @SerializedName("image") val imageheroe: SuperHeroeImageResponse


)

data class SuperHeroeImageResponse(@SerializedName("url") val url: String)

