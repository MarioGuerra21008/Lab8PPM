package gt.uvg.pokelist.repository

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import gt.uvg.pokelist.model.Pokemon
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
val retrofit: Retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl("https://pokeapi.co/").build()

object API {
    val retrofitService: PokemonService by lazy {
        retrofit.create(PokemonService::class.java)
    }
}

class PokemonRepository {
    fun getFirst100Pokemon(): List<Pokemon> {
        return listOf(
            Pokemon(1, "bulbasaur"),
            Pokemon(2, "ivysaur"),
            Pokemon(3, "venusaur"),
            Pokemon(4, "charmander"),
            Pokemon(5, "charmeleon"),
            Pokemon(6, "charizard"),
            Pokemon(7, "squirtle"),
            Pokemon(8 , "wartortle"),
            Pokemon(9, "blastoise"),
            Pokemon(10,"caterpie")
        )
    }
}