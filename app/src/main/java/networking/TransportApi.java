package networking;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public abstract class TransportApi {
    @GET("businesses/search")
    abstract Call<TransportClientSearchResponse> getTransport(
            @Query("location") String location,
            @Query("term") String term
    );

    private class TransportClientSearchResponse {
    }
}
