package com.app.data.remote_data_source.data_source_impl.interestingness

import com.app.data.remote_data_source.data_source_impl.interestingness.models.PhotosResultResponse
import com.app.data.remote_data_source.utils.ApiConst.API_BODY
import com.app.data.remote_data_source.utils.ApiConst.INTERESTING_PHOTO_METHOD
import retrofit2.http.GET
import retrofit2.http.Query

interface InterestingnessApiService {
    @GET("/services/rest$INTERESTING_PHOTO_METHOD$API_BODY")
    fun getInterestingnessPhotos(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 100,
        @Query("date") date: String = "",
        @Query("oauth_token") oauthToken: String = "",
        @Query("oauth_timestamp") oauthTimestamp: String = "",
        @Query("oauth_nonce") oauthNonce: String = "",
        @Query("oauth_signature") oauthSignature: String = ""
    ): PhotosResultResponse

    // TODO: Igor create filter
    // TODO: Igor check is RxJava disconnected
}
