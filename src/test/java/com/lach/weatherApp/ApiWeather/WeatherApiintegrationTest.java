package com.lach.weatherApp.ApiWeather;

import com.lach.weatherApp.City;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


@Tag("integration")
public class WeatherApiintegrationTest {

    private static WeatherApi api;

    @BeforeAll
    static void setUp(){
        //given
        api = new WeatherApi();
    }

    @Test
    void shouldRequesttURLWhenFetchingTempForJastarnia(){
        //when
        WeatherbitResponse result = api.weatherbitResponse(City.Jastarnia);

        //then
        /*
            Pobrać Postmanem z:
            "http://api.weatherbit.io/v2.0/forecast/daily?&city=Jastarnia&key=3a592d44641446cd87518392b3497ebb"

            aktualnego Jsona z danymi pogodowym i wpisać w porównaniu aktualną temp dla wybranego dnia.

                                                                                              ||
                                                                                             \  /
                                                                                              \/

            assertThat(result.getWeatherbitResponseDetail().get(1).getTemp()).isEqualTo(__TU_WPISAC__);

         */
        assertThat(result.getWeatherbitResponseDetail().get(1).getTemp()).isEqualTo(1.7f);
    }
}
