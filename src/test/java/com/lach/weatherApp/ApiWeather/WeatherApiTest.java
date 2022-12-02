package com.lach.weatherApp.ApiWeather;


import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;


class WeatherApiTest {

    @Test
    void shouldDeserializeWeatherbitResponse(){
        //Given
        String SAMPLE_RESPONSE = "{\"city_name\":\"Jastarnia\",\"country_code\":\"PL\",\"data\":[{\"app_max_temp\":-0.5,\"app_min_temp\":-3.6,\"clouds\":81,\"clouds_hi\":7,\"clouds_low\":89,\"clouds_mid\":0,\"datetime\":\"2022-12-02\",\"dewpt\":-1,\"high_temp\":2.7,\"low_temp\":-0.5,\"max_dhi\":null,\"max_temp\":3.5,\"min_temp\":0.2,\"moon_phase\":0.75442,\"moon_phase_lunation\":0.31,\"moonrise_ts\":1669984177,\"moonset_ts\":1669942450,\"ozone\":287.3,\"pop\":20,\"precip\":0.017578125,\"pres\":1030.3,\"rh\":82,\"slp\":1030.3,\"snow\":0,\"snow_depth\":0,\"sunrise_ts\":1669963503,\"sunset_ts\":1669991076,\"temp\":1.8,\"ts\":1669964460,\"uv\":0,\"valid_date\":\"2022-12-02\",\"vis\":24.128,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"ESE\",\"wind_cdir_full\":\"east-southeast\",\"wind_dir\":104,\"wind_gust_spd\":6.7,\"wind_spd\":4.1},{\"app_max_temp\":-3.5,\"app_min_temp\":-4.6,\"clouds\":100,\"clouds_hi\":65,\"clouds_low\":97,\"clouds_mid\":76,\"datetime\":\"2022-12-03\",\"dewpt\":-2.2,\"high_temp\":1.2,\"low_temp\":0,\"max_dhi\":null,\"max_temp\":0.1,\"min_temp\":-0.3,\"moon_phase\":0.842739,\"moon_phase_lunation\":0.34,\"moonrise_ts\":1670071108,\"moonset_ts\":1670033714,\"ozone\":295.7,\"pop\":90,\"precip\":2.9,\"pres\":1028.7,\"rh\":86,\"slp\":1028.7,\"snow\":23,\"snow_depth\":23,\"sunrise_ts\":1670049993,\"sunset_ts\":1670077438,\"temp\":-0.1,\"ts\":1670022060,\"uv\":0.5,\"valid_date\":\"2022-12-03\",\"vis\":17.906,\"weather\":{\"icon\":\"s04d\",\"description\":\"Mix snow/rain\",\"code\":610},\"wind_cdir\":\"ESE\",\"wind_cdir_full\":\"east-southeast\",\"wind_dir\":118,\"wind_gust_spd\":6.6,\"wind_spd\":3.6},{\"app_max_temp\":-1.6,\"app_min_temp\":-3.5,\"clouds\":100,\"clouds_hi\":41,\"clouds_low\":98,\"clouds_mid\":76,\"datetime\":\"2022-12-04\",\"dewpt\":0.7,\"high_temp\":2.5,\"low_temp\":2.2,\"max_dhi\":null,\"max_temp\":2.5,\"min_temp\":0.1,\"moon_phase\":0.912939,\"moon_phase_lunation\":0.37,\"moonrise_ts\":1670158074,\"moonset_ts\":1670124973,\"ozone\":319,\"pop\":65,\"precip\":4,\"pres\":1026.4,\"rh\":94,\"slp\":1026.4,\"snow\":0,\"snow_depth\":22.5,\"sunrise_ts\":1670136480,\"sunset_ts\":1670163802,\"temp\":1.6,\"ts\":1670108460,\"uv\":0.5,\"valid_date\":\"2022-12-04\",\"vis\":11.16,\"weather\":{\"icon\":\"r04d\",\"description\":\"Light shower rain\",\"code\":520},\"wind_cdir\":\"ESE\",\"wind_cdir_full\":\"east-southeast\",\"wind_dir\":120,\"wind_gust_spd\":7.1,\"wind_spd\":4.1},{\"app_max_temp\":-1,\"app_min_temp\":-2,\"clouds\":100,\"clouds_hi\":46,\"clouds_low\":100,\"clouds_mid\":58,\"datetime\":\"2022-12-05\",\"dewpt\":1.2,\"high_temp\":2.7,\"low_temp\":2.3,\"max_dhi\":null,\"max_temp\":2.7,\"min_temp\":2.2,\"moon_phase\":0.963002,\"moon_phase_lunation\":0.41,\"moonrise_ts\":1670245143,\"moonset_ts\":1670216249,\"ozone\":327.1,\"pop\":15,\"precip\":0.4,\"pres\":1024.8,\"rh\":92,\"slp\":1024.7,\"snow\":0,\"snow_depth\":12.6,\"sunrise_ts\":1670222966,\"sunset_ts\":1670250171,\"temp\":2.5,\"ts\":1670194860,\"uv\":0.5,\"valid_date\":\"2022-12-05\",\"vis\":5.218,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"SE\",\"wind_cdir_full\":\"southeast\",\"wind_dir\":124,\"wind_gust_spd\":7.7,\"wind_spd\":4.4},{\"app_max_temp\":0.5,\"app_min_temp\":-1.7,\"clouds\":98,\"clouds_hi\":67,\"clouds_low\":100,\"clouds_mid\":100,\"datetime\":\"2022-12-06\",\"dewpt\":1.7,\"high_temp\":3.6,\"low_temp\":2.5,\"max_dhi\":null,\"max_temp\":3.6,\"min_temp\":2.3,\"moon_phase\":0.9918,\"moon_phase_lunation\":0.44,\"moonrise_ts\":1670332404,\"moonset_ts\":1670307470,\"ozone\":312,\"pop\":0,\"precip\":0,\"pres\":1014.6,\"rh\":92,\"slp\":1014.6,\"snow\":0,\"snow_depth\":6.8,\"sunrise_ts\":1670309448,\"sunset_ts\":1670336543,\"temp\":2.9,\"ts\":1670281260,\"uv\":0.5,\"valid_date\":\"2022-12-06\",\"vis\":1.355,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"S\",\"wind_cdir_full\":\"south\",\"wind_dir\":174,\"wind_gust_spd\":6.5,\"wind_spd\":3.8},{\"app_max_temp\":-0.3,\"app_min_temp\":-1.3,\"clouds\":89,\"clouds_hi\":21,\"clouds_low\":100,\"clouds_mid\":50,\"datetime\":\"2022-12-07\",\"dewpt\":1.5,\"high_temp\":3.3,\"low_temp\":2.7,\"max_dhi\":null,\"max_temp\":3.3,\"min_temp\":2.5,\"moon_phase\":0.999126,\"moon_phase_lunation\":0.48,\"moonrise_ts\":1670419993,\"moonset_ts\":1670398428,\"ozone\":290.9,\"pop\":0,\"precip\":0,\"pres\":1007.5,\"rh\":90,\"slp\":1007.5,\"snow\":0,\"snow_depth\":3.4,\"sunrise_ts\":1670395928,\"sunset_ts\":1670422919,\"temp\":2.9,\"ts\":1670367660,\"uv\":1.9,\"valid_date\":\"2022-12-07\",\"vis\":6.014,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"SW\",\"wind_cdir_full\":\"southwest\",\"wind_dir\":222,\"wind_gust_spd\":7.7,\"wind_spd\":4.2},{\"app_max_temp\":0.4,\"app_min_temp\":-1.2,\"clouds\":85,\"clouds_hi\":36,\"clouds_low\":85,\"clouds_mid\":36,\"datetime\":\"2022-12-08\",\"dewpt\":1.5,\"high_temp\":3.6,\"low_temp\":2.9,\"max_dhi\":null,\"max_temp\":3.6,\"min_temp\":2.7,\"moon_phase\":0.985778,\"moon_phase_lunation\":0.51,\"moonrise_ts\":1670508099,\"moonset_ts\":1670488805,\"ozone\":302.4,\"pop\":0,\"precip\":0,\"pres\":1005.8,\"rh\":90,\"slp\":1005.8,\"snow\":0,\"snow_depth\":1.6,\"sunrise_ts\":1670482405,\"sunset_ts\":1670509299,\"temp\":3.1,\"ts\":1670454060,\"uv\":1.9,\"valid_date\":\"2022-12-08\",\"vis\":24.128,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"SW\",\"wind_cdir_full\":\"southwest\",\"wind_dir\":219,\"wind_gust_spd\":7.4,\"wind_spd\":3.9},{\"app_max_temp\":0.6,\"app_min_temp\":-0.5,\"clouds\":83,\"clouds_hi\":43,\"clouds_low\":75,\"clouds_mid\":76,\"datetime\":\"2022-12-09\",\"dewpt\":2.1,\"high_temp\":4,\"low_temp\":3.1,\"max_dhi\":null,\"max_temp\":4,\"min_temp\":2.9,\"moon_phase\":0.953495,\"moon_phase_lunation\":0.54,\"moonrise_ts\":1670596945,\"moonset_ts\":1670578325,\"ozone\":339.1,\"pop\":0,\"precip\":0,\"pres\":1007.1,\"rh\":91,\"slp\":1007.1,\"snow\":0,\"snow_depth\":0.7,\"sunrise_ts\":1670568880,\"sunset_ts\":1670595682,\"temp\":3.4,\"ts\":1670540460,\"uv\":1.9,\"valid_date\":\"2022-12-09\",\"vis\":15.573,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"S\",\"wind_cdir_full\":\"south\",\"wind_dir\":177,\"wind_gust_spd\":7.4,\"wind_spd\":3.9},{\"app_max_temp\":-0.2,\"app_min_temp\":-1.7,\"clouds\":81,\"clouds_hi\":100,\"clouds_low\":100,\"clouds_mid\":100,\"datetime\":\"2022-12-10\",\"dewpt\":1.2,\"high_temp\":3.6,\"low_temp\":2.1,\"max_dhi\":null,\"max_temp\":3.6,\"min_temp\":2.6,\"moon_phase\":0.904571,\"moon_phase_lunation\":0.58,\"moonrise_ts\":1670686640,\"moonset_ts\":1670666958,\"ozone\":324.3,\"pop\":80,\"precip\":6.9,\"pres\":1007.7,\"rh\":87,\"slp\":1007.7,\"snow\":0,\"snow_depth\":0.3,\"sunrise_ts\":1670655351,\"sunset_ts\":1670682069,\"temp\":3.1,\"ts\":1670626860,\"uv\":1.9,\"valid_date\":\"2022-12-10\",\"vis\":17.986,\"weather\":{\"icon\":\"r01d\",\"description\":\"Light rain\",\"code\":500},\"wind_cdir\":\"SW\",\"wind_cdir_full\":\"southwest\",\"wind_dir\":228,\"wind_gust_spd\":8.9,\"wind_spd\":4.7},{\"app_max_temp\":-1.6,\"app_min_temp\":-2.5,\"clouds\":76,\"clouds_hi\":51,\"clouds_low\":70,\"clouds_mid\":68,\"datetime\":\"2022-12-11\",\"dewpt\":0.1,\"high_temp\":2.7,\"low_temp\":1.5,\"max_dhi\":null,\"max_temp\":2.7,\"min_temp\":2,\"moon_phase\":0.841397,\"moon_phase_lunation\":0.61,\"moonrise_ts\":1670777049,\"moonset_ts\":1670754891,\"ozone\":326,\"pop\":20,\"precip\":0.5,\"pres\":1015.2,\"rh\":86,\"slp\":1015.3,\"snow\":0,\"snow_depth\":0.2,\"sunrise_ts\":1670741819,\"sunset_ts\":1670768461,\"temp\":2.3,\"ts\":1670713260,\"uv\":1.9,\"valid_date\":\"2022-12-11\",\"vis\":21.603,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"SW\",\"wind_cdir_full\":\"southwest\",\"wind_dir\":220,\"wind_gust_spd\":9.7,\"wind_spd\":5.1},{\"app_max_temp\":-1,\"app_min_temp\":-2.7,\"clouds\":74,\"clouds_hi\":25,\"clouds_low\":24,\"clouds_mid\":54,\"datetime\":\"2022-12-12\",\"dewpt\":-0.4,\"high_temp\":2.7,\"low_temp\":1.3,\"max_dhi\":null,\"max_temp\":2.7,\"min_temp\":1.5,\"moon_phase\":0.766272,\"moon_phase_lunation\":0.65,\"moonrise_ts\":1670867866,\"moonset_ts\":1670842358,\"ozone\":332.3,\"pop\":0,\"precip\":0,\"pres\":1019.9,\"rh\":84,\"slp\":1020,\"snow\":0,\"snow_depth\":0.1,\"sunrise_ts\":1670828285,\"sunset_ts\":1670854856,\"temp\":2,\"ts\":1670799660,\"uv\":1.9,\"valid_date\":\"2022-12-12\",\"vis\":24.128,\"weather\":{\"icon\":\"c04d\",\"description\":\"Overcast clouds\",\"code\":804},\"wind_cdir\":\"W\",\"wind_cdir_full\":\"west\",\"wind_dir\":278,\"wind_gust_spd\":8.6,\"wind_spd\":4.4},{\"app_max_temp\":-5,\"app_min_temp\":-6.5,\"clouds\":100,\"clouds_hi\":62,\"clouds_low\":100,\"clouds_mid\":100,\"datetime\":\"2022-12-13\",\"dewpt\":0.9,\"high_temp\":3.6,\"low_temp\":2.3,\"max_dhi\":null,\"max_temp\":2.4,\"min_temp\":1.3,\"moon_phase\":0.681388,\"moon_phase_lunation\":0.68,\"moonrise_ts\":1670958825,\"moonset_ts\":1670929539,\"ozone\":365.3,\"pop\":90,\"precip\":13.6875,\"pres\":1002,\"rh\":94,\"slp\":1002,\"snow\":38.5,\"snow_depth\":29,\"sunrise_ts\":1670914747,\"sunset_ts\":1670941255,\"temp\":1.8,\"ts\":1670886060,\"uv\":1.9,\"valid_date\":\"2022-12-13\",\"vis\":1.508,\"weather\":{\"icon\":\"s04d\",\"description\":\"Mix snow/rain\",\"code\":610},\"wind_cdir\":\"S\",\"wind_cdir_full\":\"south\",\"wind_dir\":184,\"wind_gust_spd\":15.9,\"wind_spd\":14.3},{\"app_max_temp\":-0.8,\"app_min_temp\":-4.2,\"clouds\":93,\"clouds_hi\":50,\"clouds_low\":93,\"clouds_mid\":37,\"datetime\":\"2022-12-14\",\"dewpt\":-0.7,\"high_temp\":4.5,\"low_temp\":2.5,\"max_dhi\":null,\"max_temp\":3.9,\"min_temp\":3,\"moon_phase\":0.588914,\"moon_phase_lunation\":0.71,\"moonrise_ts\":1671049790,\"moonset_ts\":1671016551,\"ozone\":343.3,\"pop\":65,\"precip\":3.875,\"pres\":1010.5,\"rh\":75,\"slp\":1010.5,\"snow\":0,\"snow_depth\":11.6,\"sunrise_ts\":1671001205,\"sunset_ts\":1671027658,\"temp\":3.4,\"ts\":1670972460,\"uv\":1.9,\"valid_date\":\"2022-12-14\",\"vis\":13.412,\"weather\":{\"icon\":\"r04d\",\"description\":\"Light shower rain\",\"code\":520},\"wind_cdir\":\"S\",\"wind_cdir_full\":\"south\",\"wind_dir\":170,\"wind_gust_spd\":10.7,\"wind_spd\":10.5},{\"app_max_temp\":-4.1,\"app_min_temp\":-6,\"clouds\":100,\"clouds_hi\":77,\"clouds_low\":85,\"clouds_mid\":100,\"datetime\":\"2022-12-15\",\"dewpt\":0.1,\"high_temp\":3.8,\"low_temp\":1.6,\"max_dhi\":null,\"max_temp\":4.5,\"min_temp\":1.6,\"moon_phase\":0.491182,\"moon_phase_lunation\":0.75,\"moonrise_ts\":1671140739,\"moonset_ts\":1671103475,\"ozone\":310,\"pop\":40,\"precip\":0.75,\"pres\":1010,\"rh\":88,\"slp\":1010,\"snow\":3.0625,\"snow_depth\":10,\"sunrise_ts\":1671087661,\"sunset_ts\":1671114065,\"temp\":2.1,\"ts\":1671058860,\"uv\":1.9,\"valid_date\":\"2022-12-15\",\"vis\":16.152,\"weather\":{\"icon\":\"s04d\",\"description\":\"Mix snow/rain\",\"code\":610},\"wind_cdir\":\"E\",\"wind_cdir_full\":\"east\",\"wind_dir\":81,\"wind_gust_spd\":13.7,\"wind_spd\":12.8},{\"app_max_temp\":-2.6,\"app_min_temp\":-4.5,\"clouds\":100,\"clouds_hi\":84,\"clouds_low\":100,\"clouds_mid\":100,\"datetime\":\"2022-12-16\",\"dewpt\":2.8,\"high_temp\":4.2,\"low_temp\":1.9,\"max_dhi\":null,\"max_temp\":4.2,\"min_temp\":2.6,\"moon_phase\":0.390979,\"moon_phase_lunation\":0.78,\"moonrise_ts\":1671145320,\"moonset_ts\":1671190370,\"ozone\":289.4,\"pop\":85,\"precip\":12.4375,\"pres\":996.8,\"rh\":97,\"slp\":996.8,\"snow\":0,\"snow_depth\":4.7,\"sunrise_ts\":1671174113,\"sunset_ts\":1671200476,\"temp\":3.3,\"ts\":1671145260,\"uv\":1.9,\"valid_date\":\"2022-12-16\",\"vis\":12.09,\"weather\":{\"icon\":\"r02d\",\"description\":\"Moderate rain\",\"code\":501},\"wind_cdir\":\"ENE\",\"wind_cdir_full\":\"east-northeast\",\"wind_dir\":59,\"wind_gust_spd\":15.1,\"wind_spd\":13.5},{\"app_max_temp\":-4.4,\"app_min_temp\":-5.8,\"clouds\":100,\"clouds_hi\":45,\"clouds_low\":100,\"clouds_mid\":50,\"datetime\":\"2022-12-17\",\"dewpt\":-2.1,\"high_temp\":2.6,\"low_temp\":2,\"max_dhi\":null,\"max_temp\":2.6,\"min_temp\":1.9,\"moon_phase\":0.291898,\"moon_phase_lunation\":0.82,\"moonrise_ts\":1671231720,\"moonset_ts\":1671277293,\"ozone\":285.1,\"pop\":85,\"precip\":12.5625,\"pres\":1009.8,\"rh\":75,\"slp\":1009.8,\"snow\":0,\"snow_depth\":2.9,\"sunrise_ts\":1671260562,\"sunset_ts\":1671286891,\"temp\":2.3,\"ts\":1671231660,\"uv\":1.9,\"valid_date\":\"2022-12-17\",\"vis\":14.32,\"weather\":{\"icon\":\"r02d\",\"description\":\"Moderate rain\",\"code\":501},\"wind_cdir\":\"NNE\",\"wind_cdir_full\":\"north-northeast\",\"wind_dir\":23,\"wind_gust_spd\":15.6,\"wind_spd\":14.3}],\"lat\":\"54.69606\",\"lon\":\"18.67873\",\"state_code\":\"82\",\"timezone\":\"Europe/Warsaw\"}";
        Jsonb jsonb = JsonbBuilder.create();

        //When
        WeatherbitResponse result = jsonb.fromJson(SAMPLE_RESPONSE, WeatherbitResponse.class);

        //Then
        assertThat(result.getCityName()).isEqualTo("Jastarnia");
        assertThat(result.getCountryCode()).isEqualTo("PL");
        assertThat(result.getWeatherbitResponseDetail().get(0).getAppMaxTemp()).isEqualTo(-0.5f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getAppMinTemp()).isEqualTo(-3.6f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getClouds()).isEqualTo(81f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getCloudsHi()).isEqualTo(7f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getCloudsLow()).isEqualTo(89f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getCloudsMid()).isEqualTo(0f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getDatetime()).isEqualTo("2022-12-02");
        assertThat(result.getWeatherbitResponseDetail().get(0).getDewpt()).isEqualTo(-1f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getHighTemp()).isEqualTo(2.7f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getLowTemp()).isEqualTo(-0.5f);
        assertNull(result.getWeatherbitResponseDetail().get(0).getMaxDhi());
        assertThat(result.getWeatherbitResponseDetail().get(0).getMaxTemp()).isEqualTo(3.5f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getMinTemp()).isEqualTo(0.2f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getMoonPhase()).isEqualTo(0.75442f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getMoonPhaseLunation()).isEqualTo(0.31f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getMoonriseTs()).isEqualTo(1669984177f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getMoonsetTs()).isEqualTo(1669942450f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getOzone()).isEqualTo(287.3f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getPop()).isEqualTo(20f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getPrecip()).isEqualTo(0.017578125f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getPres()).isEqualTo(1030.3f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getRh()).isEqualTo(82f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getSlp()).isEqualTo(1030.3f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getSnow()).isEqualTo(0f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getSnowDepth()).isEqualTo(0f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getSunriseTs()).isEqualTo(1669963503f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getSunsetTs()).isEqualTo(1669991076f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getTemp()).isEqualTo(1.8f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getTs()).isEqualTo(1669964460f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getUv()).isEqualTo(0f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getValidDate()).isEqualTo("2022-12-02");
        assertThat(result.getWeatherbitResponseDetail().get(0).getVis()).isEqualTo(24.128f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getWeatherbitResponseIconDescription().getIcon()).isEqualTo("c04d");
        assertThat(result.getWeatherbitResponseDetail().get(0).getWeatherbitResponseIconDescription().getDescription()).isEqualTo("Overcast clouds");
        assertThat(result.getWeatherbitResponseDetail().get(0).getWeatherbitResponseIconDescription().getCode()).isEqualTo("804");
        assertThat(result.getWeatherbitResponseDetail().get(0).getWindCdir()).isEqualTo("ESE");
        assertThat(result.getWeatherbitResponseDetail().get(0).getWindCdirFull()).isEqualTo("east-southeast");
        assertThat(result.getWeatherbitResponseDetail().get(0).getWindDir()).isEqualTo(104f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getWindGustSpd()).isEqualTo(6.7f);
        assertThat(result.getWeatherbitResponseDetail().get(0).getWindSpd()).isEqualTo(4.1f);
        //
        assertThat(result.getWeatherbitResponseDetail().get(10).getAppMaxTemp()).isEqualTo(-1f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getAppMinTemp()).isEqualTo(-2.7f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getClouds()).isEqualTo(74f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getCloudsHi()).isEqualTo(25f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getCloudsLow()).isEqualTo(24f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getCloudsMid()).isEqualTo(54f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getDatetime()).isEqualTo("2022-12-12");
        assertThat(result.getWeatherbitResponseDetail().get(10).getDewpt()).isEqualTo(-0.4f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getHighTemp()).isEqualTo(2.7f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getLowTemp()).isEqualTo(1.3f);
        assertNull(result.getWeatherbitResponseDetail().get(10).getMaxDhi());
        assertThat(result.getWeatherbitResponseDetail().get(10).getMaxTemp()).isEqualTo(2.7f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getMinTemp()).isEqualTo(1.5f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getMoonPhase()).isEqualTo(0.766272f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getMoonPhaseLunation()).isEqualTo(0.65f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getMoonriseTs()).isEqualTo(1670867866f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getMoonsetTs()).isEqualTo(1670842358f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getOzone()).isEqualTo(332.3f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getPop()).isEqualTo(0f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getPrecip()).isEqualTo(0f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getPres()).isEqualTo(1019.9f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getRh()).isEqualTo(84f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getSlp()).isEqualTo(1020f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getSnow()).isEqualTo(0f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getSnowDepth()).isEqualTo(0.1f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getSunriseTs()).isEqualTo(1670828285f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getSunsetTs()).isEqualTo(1670854856f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getTemp()).isEqualTo(2f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getTs()).isEqualTo(1670799660f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getUv()).isEqualTo(1.9f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getValidDate()).isEqualTo("2022-12-12");
        assertThat(result.getWeatherbitResponseDetail().get(10).getVis()).isEqualTo(24.128f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getWeatherbitResponseIconDescription().getIcon()).isEqualTo("c04d");
        assertThat(result.getWeatherbitResponseDetail().get(10).getWeatherbitResponseIconDescription().getDescription()).isEqualTo("Overcast clouds");
        assertThat(result.getWeatherbitResponseDetail().get(10).getWeatherbitResponseIconDescription().getCode()).isEqualTo("804");
        assertThat(result.getWeatherbitResponseDetail().get(10).getWindCdir()).isEqualTo("W");
        assertThat(result.getWeatherbitResponseDetail().get(10).getWindCdirFull()).isEqualTo("west");
        assertThat(result.getWeatherbitResponseDetail().get(10).getWindDir()).isEqualTo(278f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getWindGustSpd()).isEqualTo(8.6f);
        assertThat(result.getWeatherbitResponseDetail().get(10).getWindSpd()).isEqualTo(4.4f);
        //
        assertThat(result.getLat()).isEqualTo(54.69606f);
        assertThat(result.getLon()).isEqualTo(18.67873f);
        assertThat(result.getStateCode()).isEqualTo("82");
        assertThat(result.getTimeZone()).isEqualTo("Europe/Warsaw");
    }
}