package com.demoapp.client
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Manoj Sain on 2019-12-19.
 */
class APIClient {

    private  val BASE_URL="https://c8r.azurewebsites.net"
    private var retrofit:Retrofit
    private var client: MainInterface

    init {
        retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        client=retrofit.create(MainInterface::class.java)
    }

    fun getClient(): MainInterface {
        return client
    }

}