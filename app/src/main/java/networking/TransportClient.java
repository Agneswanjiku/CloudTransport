package networking;

import com.moringaschool.mycloudtransports.RecyclerViews.Constants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static retrofit2.converter.gson.GsonConverterFactory.*;

public class TransportClient {
public  static Retrofit retrofit = null;
    private Object Body;
    private Object Retrofit;

    public TransportClient TransportClient() {
        OkHttpClient.Builder okHttpClient = null;
        if (retrofit == null) {
            okHttpClient = new OkHttpClient.Builder();

            HttpLoggingInteceptor httpLoggingInteceptor = new HttpLoggingInteceptor();
            httpLoggingInteceptor.notify(Body);
            okHttpClient.build();


//            okHttpClient.addInterceptor((Interceptor) httpLoggingInteceptor);
//         okHttpClient.addInterceptor(new Interceptor() {
//             @NotNull
//             @Override
//             public Response intercept(@NotNull Chain chain) throws IOException {
//                 Request request = chain.request().newBuilder().addHeader("Authorization","Bearer  \n" +
//                         "c086e4fa4314b78c4d11bb7e234f993d").build();
//                 return  chain.proceed(request);
//
//             }
//         });

        retrofit = new baseUrl(Constants.API_BASE_URL)
                .client(okHttpClient.build())
                .getClass(create(Retrofit))

                .build();
        }

        return retrofit.create(TransportClient.class);
    }

    private Object create(Object retrofit) {
        return null;
    }

    private Object create(Retrofit retrofit) {
        return null;
    }


    private static class HttpLoggingInteceptor {
        public static Object Level;

        public void notify(Object body) {

        }
    }

    private class baseUrl {
        public baseUrl(String apiBaseUrl) {

        }

        public Object client(OkHttpClient build) {
            return null;
        }
    }

    private class Body {
    }
}

