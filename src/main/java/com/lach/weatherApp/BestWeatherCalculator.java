package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class BestWeatherCalculator {


    public Optional<BestWeatherResponse> calculate(List<WeatherbitResponse> weatherbitResponseList, LocalDate date){

        /*
        If the wind speed is not within <5; 18> (m/s) and the temperature is not in the range <5; 35> (°C),
        the location is not suitable for windsurfing. However, if they are in these ranges,
        then the best location is determined by the highest value calculated from the following formula:
            v * 3 + temp
        where v is the wind speed in m/s on a given day, and temp is an average forecasted temperature for a given day in Celsius,
        respectively - you can obtain these parameters from the “data” key in Weatherbit API’s response.

         */


        List<BestWeatherResponse> result = weatherbitResponseList.stream()
                .map(weatherbitResponse -> toBestWeatherResponse(weatherbitResponse, date))
                .collect(Collectors.toList());



        Optional<BestWeatherResponse> bestWeather = result.stream()
                .filter(bestWeatherResponse -> bestWeatherResponse.temp > 4 && bestWeatherResponse.temp < 36)
                .filter(bestWeatherResponse -> bestWeatherResponse.wind > 4 && bestWeatherResponse.wind < 19)
                .map((BestWeatherResponse bestWeatherResponse) -> {
                    Float tempResult = 3 * bestWeatherResponse.wind + bestWeatherResponse.temp;
                    return new BestWeatherResponseWithResult(bestWeatherResponse, tempResult);
                } )
                .max(Comparator.comparing(BestWeatherResponseWithResult::getResult))
                .map(BestWeatherResponseWithResult::getBestWeatherResponse);



//        City city = City.valueOf(weatherbitResponseList.get(0).getCityName());
//        Float wind = weatherbitResponseList.get(0).getWeatherbitResponseDetail().get(2).getWindSpd();
//        BestWeatherResponse bestWeather =  new BestWeatherResponse(city, wind, 20F);
        return bestWeather;
        //Shift + F6 rekomp zmiennej
    }

    private BestWeatherResponse toBestWeatherResponse(WeatherbitResponse weatherbitResponse, LocalDate date) {
        City cityName = City.valueOf(weatherbitResponse.getCityName());
        return weatherbitResponse.getWeatherbitResponseDetail().stream()
                .filter(weatherbitResponseDetail -> weatherbitResponseDetail.getDatetime().equals(date))
                .map(weatherbitResponseDetail -> new BestWeatherResponse(cityName,
                                                                        weatherbitResponseDetail.getWindSpd(),
                                                                        weatherbitResponseDetail.getTemp()))
                .findFirst()
                .orElseThrow();
    }

    private static class BestWeatherResponseWithResult{
        private final BestWeatherResponse bestWeatherResponse;
        private final Float result;

        public BestWeatherResponseWithResult(BestWeatherResponse bestWeatherResponse, Float result) {
            this.bestWeatherResponse = bestWeatherResponse;
            this.result = result;
        }

        public BestWeatherResponse getBestWeatherResponse() {
            return bestWeatherResponse;
        }

        public Float getResult() {
            return result;
        }
    }
}
