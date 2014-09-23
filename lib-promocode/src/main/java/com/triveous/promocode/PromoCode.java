package com.triveous.promocode;

import com.triveous.promocode.model.Code;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by sohammondal on 23/09/14.
 */
public class PromoCode {
    public static final String ERROR_PROMO_NOT_FOUND = "PROMO_NOT_FOUND";

    /**
     * Used to validate the said promocode from the online server
     * @param promoCode the promocode to be validated
     * @param onPromocodeChecked callback to be processed once promocodes has been retrieved
     */
    public static void validate(final String promoCode, final OnPromocodeChecked onPromocodeChecked) {
        PromoCodeClient.getPromoCodeApi().validate(new Callback<List<Code>>() {
            @Override
            public void success(List<Code> codes, Response response) {
                for(Code code:codes) {
                    if(code.getCouponCode().equals(promoCode)) {
                        onPromocodeChecked.onPromocodeSuccess(code);
                        return;
                    }
                }
                onPromocodeChecked.onPromocodeFailure(ERROR_PROMO_NOT_FOUND);
            }

            @Override
            public void failure(RetrofitError error) {
                onPromocodeChecked.onPromocodeFailure(error.getMessage());
            }
        });
    }
}
