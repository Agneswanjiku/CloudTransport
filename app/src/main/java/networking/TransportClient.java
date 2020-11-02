//package networking;
//
//import androidx.constraintlayout.solver.state.State;
//
//import com.android.volley.Request;
//
//import java.io.IOException;
//
//import okhttp3.Interceptor;
//import okhttp3.OkHttpClient;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class TransportClient {
//
//
//    private static Retrofit retrofit = null;
//
//    public static TransportApi getClient() {
//
//        if (retrofit == null) {
//            OkHttpClient.Builder builder = new OkHttpClient.Builder();
//            builder.addInterceptor(new Interceptor() {
//                private Object Transport_API_KEY;
//
//                @Override
//                public okhttp3.Response intercept(Chain chain) throws IOException {
//                    return null;
//                }
//
//
//                public Response intercept(State.Chain chain) throws IOException {
//                    Request newRequest = chain.request().newBuilder()
//                            .addHeader("Authorization", Transport_API_KEY)
//                            .build();
//
//
//                    return chain.proceed(newRequest);
//                }
//            });
//            OkHttpClient okHttpClient = builder
//                    .build();
//
//            retrofit = new Retrofit.Builder()
//                    .baseUrl( "http://transportapi.com/v3/uk/places.json?query=euston&type=train_station&app_id=b05bac53&app_key=c086e4fa4314b78c4d11bb7e234f993d\n")
//                    .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        return retrofit.create(TransportApi.class);
//    }
//
//    }
//
//
//
//
//
//
//
