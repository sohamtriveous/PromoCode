package com.triveous.promocode;

import com.triveous.promocode.model.Code;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * Created by sohammondal on 23/09/14.
 */
public class PromoCodeClient {
    private static final String API_URL = "https://gist.githubusercontent.com/triveous/78278c713ebfed48dfdf/raw/ddf61c58fedd6dcc4da6d123c6116449faec4d9b";
    public static PromoCodeApiInterface promoCodeApiInterface;

    public static PromoCodeApiInterface getPromoCodeApi() {
        if(promoCodeApiInterface == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(API_URL)
                    .build();

            promoCodeApiInterface = restAdapter.create(PromoCodeApiInterface.class);
        }
        return promoCodeApiInterface;
    }


    public interface PromoCodeApiInterface {
        @GET("/promocode.json")
        void validate(Callback<List<Code>> callback);
        @GET("/promocode.json")
        List<Code> validate();
    }
}
