package com.ifreedomer.weather.bean;

import java.util.List;

/**
 * @author eavawu
 * @since 21/01/2018.
 */

public class XiaomiWeatherResult {

    /**
     * current : {"feelsLike":{"unit":"℃","value":"-5"},"humidity":{"unit":"%","value":"47"},"pressure":{"unit":"mb","value":"1028.3"},"pubTime":"2018-01-21T19:10:00+08:00","temperature":{"unit":"℃","value":"-2"},"uvIndex":"2","visibility":{"unit":"km","value":""},"weather":"2","wind":{"direction":{"unit":"°","value":"90"},"speed":{"unit":"km/h","value":"8.5"}}}
     * forecastDaily : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2018-01-21T00:00:00+08:00","status":0,"value":[68,12,7,39,33,89,139,39,7,7,7,7,7,7,12]},"precipitationProbability":{"status":0,"value":["15","56","0","0","0"]},"pubTime":"2018-01-21T19:10:00+08:00","status":0,"sunRiseSet":{"status":0,"value":[{"from":"2018-01-21T07:31:00+08:00","to":"2018-01-21T17:20:00+08:00"},{"from":"2018-01-22T07:31:00+08:00","to":"2018-01-22T17:21:00+08:00"},{"from":"2018-01-23T07:30:00+08:00","to":"2018-01-23T17:22:00+08:00"},{"from":"2018-01-24T07:29:00+08:00","to":"2018-01-24T17:23:00+08:00"},{"from":"2018-01-25T07:29:00+08:00","to":"2018-01-25T17:25:00+08:00"},{"from":"2018-01-26T07:28:00+08:00","to":"2018-01-26T17:26:00+08:00"},{"from":"2018-01-27T07:27:00+08:00","to":"2018-01-27T17:27:00+08:00"},{"from":"2018-01-28T07:26:00+08:00","to":"2018-01-28T17:28:00+08:00"},{"from":"2018-01-29T07:26:00+08:00","to":"2018-01-29T17:29:00+08:00"},{"from":"2018-01-30T07:25:00+08:00","to":"2018-01-30T17:30:00+08:00"},{"from":"2018-01-31T07:24:00+08:00","to":"2018-01-31T17:32:00+08:00"},{"from":"2018-02-01T07:23:00+08:00","to":"2018-02-01T17:33:00+08:00"},{"from":"2018-02-02T07:22:00+08:00","to":"2018-02-02T17:34:00+08:00"},{"from":"2018-02-03T07:21:00+08:00","to":"2018-02-03T17:35:00+08:00"},{"from":"2018-02-04T07:20:00+08:00","to":"2018-02-04T17:36:00+08:00"}]},"temperature":{"status":0,"unit":"℃","value":[{"from":"0","to":"-6"},{"from":"-3","to":"-10"},{"from":"-4","to":"-12"},{"from":"-4","to":"-11"},{"from":"-4","to":"-10"},{"from":"-2","to":"-8"},{"from":"0","to":"-9"},{"from":"-1","to":"-9"},{"from":"1","to":"-9"},{"from":"2","to":"-7"},{"from":"1","to":"-8"},{"from":"0","to":"-9"},{"from":"0","to":"-9"},{"from":"0","to":"-8"},{"from":"0","to":"-7"}]},"weather":{"status":0,"value":[{"from":"2","to":"14"},{"from":"14","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"2"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"0"},{"from":"1","to":"1"}]},"wind":{"direction":{"status":0,"unit":"°","value":[{"from":"90","to":"90"},{"from":"90","to":"90"},{"from":"315","to":"315"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"270","to":"270"},{"from":"180","to":"180"},{"from":"315","to":"315"},{"from":"90","to":"90"},{"from":"90","to":"90"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"8.5","to":"8.5"},{"from":"15.5","to":"15.5"},{"from":"24.0","to":"24.0"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"}]}}}
     * forecastHourly : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2018-01-21T20:00:00+08:00","status":0,"value":[47,56,62,66,62,50,33,18,8,7,7,7,7,7,7,7,7,7,7,7,7,7,7]},"desc":"明天午夜1点钟后转小雪，其后多云","status":0,"temperature":{"pubTime":"2018-01-21T20:00:00+08:00","status":0,"unit":"℃","value":[-5,-4,-5,-5,-4,-3,-3,-3,-3,-4,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-4,-4,-6]},"weather":{"pubTime":"2018-01-21T20:00:00+08:00","status":0,"value":[2,2,2,2,2,33,33,33,33,33,33,33,33,33,33,33,33,33,33,1,1,1,1]},"wind":{"status":0,"value":[{"datetime":"2018-01-21T20:00:00.000+08:00","direction":"138.22","speed":"8.47"},{"datetime":"2018-01-21T21:00:00.000+08:00","direction":"135.45","speed":"8.47"},{"datetime":"2018-01-21T22:00:00.000+08:00","direction":"130.48","speed":"8.16"},{"datetime":"2018-01-21T23:00:00.000+08:00","direction":"120.3","speed":"7.51"},{"datetime":"2018-01-22T00:00:00.000+08:00","direction":"101.66","speed":"6.93"},{"datetime":"2018-01-22T01:00:00.000+08:00","direction":"80.55","speed":"7.09"},{"datetime":"2018-01-22T02:00:00.000+08:00","direction":"66.64","speed":"7.55"},{"datetime":"2018-01-22T03:00:00.000+08:00","direction":"62.28","speed":"7.35"},{"datetime":"2018-01-22T04:00:00.000+08:00","direction":"64.95","speed":"6.51"},{"datetime":"2018-01-22T05:00:00.000+08:00","direction":"73.77","speed":"5.52"},{"datetime":"2018-01-22T06:00:00.000+08:00","direction":"87.24","speed":"4.94"},{"datetime":"2018-01-22T07:00:00.000+08:00","direction":"102.84","speed":"5.03"},{"datetime":"2018-01-22T08:00:00.000+08:00","direction":"116.02","speed":"5.89"},{"datetime":"2018-01-22T09:00:00.000+08:00","direction":"124.3","speed":"7.38"},{"datetime":"2018-01-22T10:00:00.000+08:00","direction":"128.83","speed":"8.86"},{"datetime":"2018-01-22T11:00:00.000+08:00","direction":"131.67","speed":"9.7"},{"datetime":"2018-01-22T12:00:00.000+08:00","direction":"134.31","speed":"9.4"},{"datetime":"2018-01-22T13:00:00.000+08:00","direction":"137.83","speed":"8.02"},{"datetime":"2018-01-22T14:00:00.000+08:00","direction":"144.44","speed":"5.78"},{"datetime":"2018-01-22T15:00:00.000+08:00","direction":"163.29","speed":"3.04"},{"datetime":"2018-01-22T16:00:00.000+08:00","direction":"250.2","speed":"1.61"},{"datetime":"2018-01-22T17:00:00.000+08:00","direction":"308.22","speed":"4.01"},{"datetime":"2018-01-22T18:00:00.000+08:00","direction":"329.25","speed":"7.1"},{"datetime":"2018-01-22T20:00:00.000+08:00","direction":"344.69","speed":"13.19"},{"datetime":"2018-01-22T21:00:00.000+08:00","direction":"343.87","speed":"15.12"},{"datetime":"2018-01-22T22:00:00.000+08:00","direction":"340.52","speed":"16.44"},{"datetime":"2018-01-22T23:00:00.000+08:00","direction":"336.69","speed":"17.63"},{"datetime":"2018-01-23T00:00:00.000+08:00","direction":"333.79","speed":"18.93"},{"datetime":"2018-01-23T01:00:00.000+08:00","direction":"331.86","speed":"20.02"},{"datetime":"2018-01-23T02:00:00.000+08:00","direction":"330.57","speed":"20.43"},{"datetime":"2018-01-23T03:00:00.000+08:00","direction":"329.65","speed":"19.87"},{"datetime":"2018-01-23T04:00:00.000+08:00","direction":"328.98","speed":"18.57"},{"datetime":"2018-01-23T05:00:00.000+08:00","direction":"328.6","speed":"16.93"},{"datetime":"2018-01-23T06:00:00.000+08:00","direction":"328.46","speed":"15.31"},{"datetime":"2018-01-23T07:00:00.000+08:00","direction":"327.7","speed":"14.12"},{"datetime":"2018-01-23T08:00:00.000+08:00","direction":"325.16","speed":"13.74"},{"datetime":"2018-01-23T09:00:00.000+08:00","direction":"320.57","speed":"14.46"},{"datetime":"2018-01-23T10:00:00.000+08:00","direction":"315.55","speed":"15.84"},{"datetime":"2018-01-23T11:00:00.000+08:00","direction":"311.14","speed":"17.17"},{"datetime":"2018-01-23T12:00:00.000+08:00","direction":"307.38","speed":"17.81"},{"datetime":"2018-01-23T13:00:00.000+08:00","direction":"304.08","speed":"17.61"},{"datetime":"2018-01-23T14:00:00.000+08:00","direction":"301.12","speed":"16.51"},{"datetime":"2018-01-23T15:00:00.000+08:00","direction":"298.41","speed":"14.57"},{"datetime":"2018-01-23T16:00:00.000+08:00","direction":"295.89","speed":"12.21"},{"datetime":"2018-01-23T17:00:00.000+08:00","direction":"293.93","speed":"9.97"},{"datetime":"2018-01-23T18:00:00.000+08:00","direction":"293.62","speed":"8.28"}]}}
     * indices : {"indices":[{"type":"uvIndex","value":"2"},{"type":"humidity","value":"46"},{"type":"feelsLike","value":"-4"},{"type":"pressure","value":"1023.0"},{"type":"carWash","value":"1"},{"type":"sports","value":"1"}],"pubTime":"","status":0}
     * alerts : [{"alertId":"weathercn:101010100-1516525200000-持续低温蓝色","detail":"北京市气象台2018年01月21日17时00分发布持续低温蓝色预警:受持续补充冷空气影响，预计22-24日，本市将出现持续低温天气，平原地区日最低气温将低于零下10℃，请注意防寒保暖。","images":{"icon":"http://f5.market.xiaomi.com/download/MiSafe/09de1422c803620b3aae7df48476f46152a431aaf/a.webp","notice":"http://f4.market.mi-img.com/download/MiSafe/003454ccf2ca533369dc2cb7f8a54d2032843aec2/a.webp"},"level":"蓝色","locationKey":"weathercn:101010100","pubTime":"2018-01-21T17:00:00+08:00","title":"北京市持续低温蓝色预警","type":"持续低温"}]
     * yesterday : {"aqi":"55","date":"2018-01-20T12:10:00+08:00","status":0,"sunRise":"2018-01-20T07:31:00+08:00","sunSet":"2018-01-20T17:19:00+08:00","tempMax":"3","tempMin":"-6","weatherEnd":"1","weatherStart":"0","windDircEnd":"135","windDircStart":"135","windSpeedEnd":"15.5","windSpeedStart":"15.5"}
     * url : {"weathercn":"","caiyun":""}
     * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""},{"brandId":"sina","logo":"http://f5.market.xiaomi.com/download/MiSafe/069835733640846b1b2615a85132892b63f404343/a.webp","names":{"en_US":"新浪天气通","zh_TW":"新浪天氣通","zh_CN":"新浪天气通"},"url":""}]}
     * preHour : [{"pubTime":"2018-01-21T19:00:00+08:00","wind":{"speed":{"unit":"km/h","value":"8.5"},"direction":{"unit":"°","value":"90"}},"humidity":{"unit":"%","value":"46"},"pressure":{"unit":"mb","value":"1028.3"},"visibility":{"unit":"km","value":""},"feelsLike":{"unit":"℃","value":"-4"},"aqi":{"pubTime":"2018-01-21T17:00:00+08:00","so2":"18","pm10Desc":"PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌","o3":"26","status":0,"no2Desc":"二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到","suggest":"空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响","so2Desc":"人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼","co":"1.10","o3Desc":"臭氧俗称晴空杀手，无色无味，但对人体的伤害不比PM2.5低，浓度高时建议减少夏季午后的外出活动，如果不开窗效果更佳","no2":"42","primary":"","aqi":"70","coDesc":"暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响","pm10":"88","pm25Desc":"PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康","pm25":"39","src":"中国环境监测总站","brandInfo":{"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}},"uvIndex":"2","weather":"2","temperature":{"unit":"℃","value":"-2"}}]
     * aqi : {"pubTime":"2018-01-21T18:00:00+08:00","so2":"16","pm10Desc":"PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌","o3":"20","status":0,"no2Desc":"二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到","suggest":"空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响","so2Desc":"二氧化硫影响呼吸系统和肺功能，并刺激眼睛。呼吸道的炎症导致咳嗽、粘液分泌、加重哮喘和慢性支气管炎","co":"1.10","o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","no2":"46","primary":"","aqi":"68","pm10":"86","coDesc":"暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响","src":"中国环境监测总站","pm25":"37","pm25Desc":"PM2.5易携带重金属、微生物等有害物质，对人体健康影响较大","brandInfo":{"brands":[{"logo":"","names":{"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}}
     */

    private CurrentBean current;
    private ForecastDailyBean forecastDaily;
    private ForecastHourlyBean forecastHourly;
    private IndicesBeanX indices;
    private YesterdayBean yesterday;
    private UrlBean url;
    private BrandInfoBeanXX brandInfo;
    private AqiBeanXX aqi;
    private List<AlertsBean> alerts;
    private List<PreHourBean> preHour;

    public CurrentBean getCurrent() {
        return current;
    }

    public void setCurrent(CurrentBean current) {
        this.current = current;
    }

    public ForecastDailyBean getForecastDaily() {
        return forecastDaily;
    }

    public void setForecastDaily(ForecastDailyBean forecastDaily) {
        this.forecastDaily = forecastDaily;
    }

    public ForecastHourlyBean getForecastHourly() {
        return forecastHourly;
    }

    public void setForecastHourly(ForecastHourlyBean forecastHourly) {
        this.forecastHourly = forecastHourly;
    }

    public IndicesBeanX getIndices() {
        return indices;
    }

    public void setIndices(IndicesBeanX indices) {
        this.indices = indices;
    }

    public YesterdayBean getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayBean yesterday) {
        this.yesterday = yesterday;
    }

    public UrlBean getUrl() {
        return url;
    }

    public void setUrl(UrlBean url) {
        this.url = url;
    }

    public BrandInfoBeanXX getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(BrandInfoBeanXX brandInfo) {
        this.brandInfo = brandInfo;
    }

    public AqiBeanXX getAqi() {
        return aqi;
    }

    public void setAqi(AqiBeanXX aqi) {
        this.aqi = aqi;
    }

    public List<AlertsBean> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<AlertsBean> alerts) {
        this.alerts = alerts;
    }

    public List<PreHourBean> getPreHour() {
        return preHour;
    }

    public void setPreHour(List<PreHourBean> preHour) {
        this.preHour = preHour;
    }

    public static class CurrentBean {
        /**
         * feelsLike : {"unit":"℃","value":"-5"}
         * humidity : {"unit":"%","value":"47"}
         * pressure : {"unit":"mb","value":"1028.3"}
         * pubTime : 2018-01-21T19:10:00+08:00
         * temperature : {"unit":"℃","value":"-2"}
         * uvIndex : 2
         * visibility : {"unit":"km","value":""}
         * weather : 2
         * wind : {"direction":{"unit":"°","value":"90"},"speed":{"unit":"km/h","value":"8.5"}}
         */

        private FeelsLikeBean feelsLike;
        private HumidityBean humidity;
        private PressureBean pressure;
        private String pubTime;
        private TemperatureBean temperature;
        private String uvIndex;
        private VisibilityBean visibility;
        private String weather;
        private WindBean wind;

        public FeelsLikeBean getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLikeBean feelsLike) {
            this.feelsLike = feelsLike;
        }

        public HumidityBean getHumidity() {
            return humidity;
        }

        public void setHumidity(HumidityBean humidity) {
            this.humidity = humidity;
        }

        public PressureBean getPressure() {
            return pressure;
        }

        public void setPressure(PressureBean pressure) {
            this.pressure = pressure;
        }

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public TemperatureBean getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBean temperature) {
            this.temperature = temperature;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }

        public VisibilityBean getVisibility() {
            return visibility;
        }

        public void setVisibility(VisibilityBean visibility) {
            this.visibility = visibility;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public static class FeelsLikeBean {
            /**
             * unit : ℃
             * value : -5
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class HumidityBean {
            /**
             * unit : %
             * value : 47
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class PressureBean {
            /**
             * unit : mb
             * value : 1028.3
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class TemperatureBean {
            /**
             * unit : ℃
             * value : -2
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class VisibilityBean {
            /**
             * unit : km
             * value :
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class WindBean {
            /**
             * direction : {"unit":"°","value":"90"}
             * speed : {"unit":"km/h","value":"8.5"}
             */

            private DirectionBean direction;
            private SpeedBean speed;

            public DirectionBean getDirection() {
                return direction;
            }

            public void setDirection(DirectionBean direction) {
                this.direction = direction;
            }

            public SpeedBean getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedBean speed) {
                this.speed = speed;
            }

            public static class DirectionBean {
                /**
                 * unit : °
                 * value : 90
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class SpeedBean {
                /**
                 * unit : km/h
                 * value : 8.5
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }

    public static class ForecastDailyBean {
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2018-01-21T00:00:00+08:00","status":0,"value":[68,12,7,39,33,89,139,39,7,7,7,7,7,7,12]}
         * precipitationProbability : {"status":0,"value":["15","56","0","0","0"]}
         * pubTime : 2018-01-21T19:10:00+08:00
         * status : 0
         * sunRiseSet : {"status":0,"value":[{"from":"2018-01-21T07:31:00+08:00","to":"2018-01-21T17:20:00+08:00"},{"from":"2018-01-22T07:31:00+08:00","to":"2018-01-22T17:21:00+08:00"},{"from":"2018-01-23T07:30:00+08:00","to":"2018-01-23T17:22:00+08:00"},{"from":"2018-01-24T07:29:00+08:00","to":"2018-01-24T17:23:00+08:00"},{"from":"2018-01-25T07:29:00+08:00","to":"2018-01-25T17:25:00+08:00"},{"from":"2018-01-26T07:28:00+08:00","to":"2018-01-26T17:26:00+08:00"},{"from":"2018-01-27T07:27:00+08:00","to":"2018-01-27T17:27:00+08:00"},{"from":"2018-01-28T07:26:00+08:00","to":"2018-01-28T17:28:00+08:00"},{"from":"2018-01-29T07:26:00+08:00","to":"2018-01-29T17:29:00+08:00"},{"from":"2018-01-30T07:25:00+08:00","to":"2018-01-30T17:30:00+08:00"},{"from":"2018-01-31T07:24:00+08:00","to":"2018-01-31T17:32:00+08:00"},{"from":"2018-02-01T07:23:00+08:00","to":"2018-02-01T17:33:00+08:00"},{"from":"2018-02-02T07:22:00+08:00","to":"2018-02-02T17:34:00+08:00"},{"from":"2018-02-03T07:21:00+08:00","to":"2018-02-03T17:35:00+08:00"},{"from":"2018-02-04T07:20:00+08:00","to":"2018-02-04T17:36:00+08:00"}]}
         * temperature : {"status":0,"unit":"℃","value":[{"from":"0","to":"-6"},{"from":"-3","to":"-10"},{"from":"-4","to":"-12"},{"from":"-4","to":"-11"},{"from":"-4","to":"-10"},{"from":"-2","to":"-8"},{"from":"0","to":"-9"},{"from":"-1","to":"-9"},{"from":"1","to":"-9"},{"from":"2","to":"-7"},{"from":"1","to":"-8"},{"from":"0","to":"-9"},{"from":"0","to":"-9"},{"from":"0","to":"-8"},{"from":"0","to":"-7"}]}
         * weather : {"status":0,"value":[{"from":"2","to":"14"},{"from":"14","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"2"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"0"},{"from":"1","to":"1"}]}
         * wind : {"direction":{"status":0,"unit":"°","value":[{"from":"90","to":"90"},{"from":"90","to":"90"},{"from":"315","to":"315"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"270","to":"270"},{"from":"180","to":"180"},{"from":"315","to":"315"},{"from":"90","to":"90"},{"from":"90","to":"90"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"8.5","to":"8.5"},{"from":"15.5","to":"15.5"},{"from":"24.0","to":"24.0"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"}]}}
         */

        private AqiBean aqi;
        private PrecipitationProbabilityBean precipitationProbability;
        private String pubTime;
        private int status;
        private SunRiseSetBean sunRiseSet;
        private TemperatureBeanX temperature;
        private WeatherBean weather;
        private WindBeanX wind;

        public AqiBean getAqi() {
            return aqi;
        }

        public void setAqi(AqiBean aqi) {
            this.aqi = aqi;
        }

        public PrecipitationProbabilityBean getPrecipitationProbability() {
            return precipitationProbability;
        }

        public void setPrecipitationProbability(PrecipitationProbabilityBean precipitationProbability) {
            this.precipitationProbability = precipitationProbability;
        }

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public SunRiseSetBean getSunRiseSet() {
            return sunRiseSet;
        }

        public void setSunRiseSet(SunRiseSetBean sunRiseSet) {
            this.sunRiseSet = sunRiseSet;
        }

        public TemperatureBeanX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBeanX temperature) {
            this.temperature = temperature;
        }

        public WeatherBean getWeather() {
            return weather;
        }

        public void setWeather(WeatherBean weather) {
            this.weather = weather;
        }

        public WindBeanX getWind() {
            return wind;
        }

        public void setWind(WindBeanX wind) {
            this.wind = wind;
        }

        public static class AqiBean {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]}
             * pubTime : 2018-01-21T00:00:00+08:00
             * status : 0
             * value : [68,12,7,39,33,89,139,39,7,7,7,7,7,7,12]
             */

            private BrandInfoBean brandInfo;
            private String pubTime;
            private int status;
            private List<Integer> value;

            public BrandInfoBean getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoBean brandInfo) {
                this.brandInfo = brandInfo;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }

            public static class BrandInfoBean {
                private List<BrandsBean> brands;

                public List<BrandsBean> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsBean> brands) {
                    this.brands = brands;
                }

                public static class BrandsBean {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
                     * url :
                     */

                    private String brandId;
                    private String logo;
                    private NamesBean names;
                    private String url;

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesBean getNames() {
                        return names;
                    }

                    public void setNames(NamesBean names) {
                        this.names = names;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesBean {
                        /**
                         * en_US : 彩云天气
                         * zh_TW : 彩雲天氣
                         * zh_CN : 彩云天气
                         */

                        private String en_US;
                        private String zh_TW;
                        private String zh_CN;

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class PrecipitationProbabilityBean {
            /**
             * status : 0
             * value : ["15","56","0","0","0"]
             */

            private int status;
            private List<String> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<String> getValue() {
                return value;
            }

            public void setValue(List<String> value) {
                this.value = value;
            }
        }

        public static class SunRiseSetBean {
            /**
             * status : 0
             * value : [{"from":"2018-01-21T07:31:00+08:00","to":"2018-01-21T17:20:00+08:00"},{"from":"2018-01-22T07:31:00+08:00","to":"2018-01-22T17:21:00+08:00"},{"from":"2018-01-23T07:30:00+08:00","to":"2018-01-23T17:22:00+08:00"},{"from":"2018-01-24T07:29:00+08:00","to":"2018-01-24T17:23:00+08:00"},{"from":"2018-01-25T07:29:00+08:00","to":"2018-01-25T17:25:00+08:00"},{"from":"2018-01-26T07:28:00+08:00","to":"2018-01-26T17:26:00+08:00"},{"from":"2018-01-27T07:27:00+08:00","to":"2018-01-27T17:27:00+08:00"},{"from":"2018-01-28T07:26:00+08:00","to":"2018-01-28T17:28:00+08:00"},{"from":"2018-01-29T07:26:00+08:00","to":"2018-01-29T17:29:00+08:00"},{"from":"2018-01-30T07:25:00+08:00","to":"2018-01-30T17:30:00+08:00"},{"from":"2018-01-31T07:24:00+08:00","to":"2018-01-31T17:32:00+08:00"},{"from":"2018-02-01T07:23:00+08:00","to":"2018-02-01T17:33:00+08:00"},{"from":"2018-02-02T07:22:00+08:00","to":"2018-02-02T17:34:00+08:00"},{"from":"2018-02-03T07:21:00+08:00","to":"2018-02-03T17:35:00+08:00"},{"from":"2018-02-04T07:20:00+08:00","to":"2018-02-04T17:36:00+08:00"}]
             */

            private int status;
            private List<ValueBean> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueBean> getValue() {
                return value;
            }

            public void setValue(List<ValueBean> value) {
                this.value = value;
            }

            public static class ValueBean {
                /**
                 * from : 2018-01-21T07:31:00+08:00
                 * to : 2018-01-21T17:20:00+08:00
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class TemperatureBeanX {
            /**
             * status : 0
             * unit : ℃
             * value : [{"from":"0","to":"-6"},{"from":"-3","to":"-10"},{"from":"-4","to":"-12"},{"from":"-4","to":"-11"},{"from":"-4","to":"-10"},{"from":"-2","to":"-8"},{"from":"0","to":"-9"},{"from":"-1","to":"-9"},{"from":"1","to":"-9"},{"from":"2","to":"-7"},{"from":"1","to":"-8"},{"from":"0","to":"-9"},{"from":"0","to":"-9"},{"from":"0","to":"-8"},{"from":"0","to":"-7"}]
             */

            private int status;
            private String unit;
            private List<ValueBeanX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public List<ValueBeanX> getValue() {
                return value;
            }

            public void setValue(List<ValueBeanX> value) {
                this.value = value;
            }

            public static class ValueBeanX {
                /**
                 * from : 0
                 * to : -6
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class WeatherBean {
            /**
             * status : 0
             * value : [{"from":"2","to":"14"},{"from":"14","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"2"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"0"},{"from":"1","to":"1"}]
             */

            private int status;
            private List<ValueBeanXX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueBeanXX> getValue() {
                return value;
            }

            public void setValue(List<ValueBeanXX> value) {
                this.value = value;
            }

            public static class ValueBeanXX {
                /**
                 * from : 2
                 * to : 14
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class WindBeanX {
            /**
             * direction : {"status":0,"unit":"°","value":[{"from":"90","to":"90"},{"from":"90","to":"90"},{"from":"315","to":"315"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"270","to":"270"},{"from":"180","to":"180"},{"from":"315","to":"315"},{"from":"90","to":"90"},{"from":"90","to":"90"}]}
             * speed : {"status":0,"unit":"km/h","value":[{"from":"8.5","to":"8.5"},{"from":"15.5","to":"15.5"},{"from":"24.0","to":"24.0"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"}]}
             */

            private DirectionBeanX direction;
            private SpeedBeanX speed;

            public DirectionBeanX getDirection() {
                return direction;
            }

            public void setDirection(DirectionBeanX direction) {
                this.direction = direction;
            }

            public SpeedBeanX getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedBeanX speed) {
                this.speed = speed;
            }

            public static class DirectionBeanX {
                /**
                 * status : 0
                 * unit : °
                 * value : [{"from":"90","to":"90"},{"from":"90","to":"90"},{"from":"315","to":"315"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"180","to":"180"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"270","to":"270"},{"from":"180","to":"180"},{"from":"315","to":"315"},{"from":"90","to":"90"},{"from":"90","to":"90"}]
                 */

                private int status;
                private String unit;
                private List<ValueBeanXXX> value;

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public List<ValueBeanXXX> getValue() {
                    return value;
                }

                public void setValue(List<ValueBeanXXX> value) {
                    this.value = value;
                }

                public static class ValueBeanXXX {
                    /**
                     * from : 90
                     * to : 90
                     */

                    private String from;
                    private String to;

                    public String getFrom() {
                        return from;
                    }

                    public void setFrom(String from) {
                        this.from = from;
                    }

                    public String getTo() {
                        return to;
                    }

                    public void setTo(String to) {
                        this.to = to;
                    }
                }
            }

            public static class SpeedBeanX {
                /**
                 * status : 0
                 * unit : km/h
                 * value : [{"from":"8.5","to":"8.5"},{"from":"15.5","to":"15.5"},{"from":"24.0","to":"24.0"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"},{"from":"15.5","to":"15.5"}]
                 */

                private int status;
                private String unit;
                private List<ValueBeanXXXX> value;

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public List<ValueBeanXXXX> getValue() {
                    return value;
                }

                public void setValue(List<ValueBeanXXXX> value) {
                    this.value = value;
                }

                public static class ValueBeanXXXX {
                    /**
                     * from : 8.5
                     * to : 8.5
                     */

                    private String from;
                    private String to;

                    public String getFrom() {
                        return from;
                    }

                    public void setFrom(String from) {
                        this.from = from;
                    }

                    public String getTo() {
                        return to;
                    }

                    public void setTo(String to) {
                        this.to = to;
                    }
                }
            }
        }
    }

    public static class ForecastHourlyBean {
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2018-01-21T20:00:00+08:00","status":0,"value":[47,56,62,66,62,50,33,18,8,7,7,7,7,7,7,7,7,7,7,7,7,7,7]}
         * desc : 明天午夜1点钟后转小雪，其后多云
         * status : 0
         * temperature : {"pubTime":"2018-01-21T20:00:00+08:00","status":0,"unit":"℃","value":[-5,-4,-5,-5,-4,-3,-3,-3,-3,-4,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-4,-4,-6]}
         * weather : {"pubTime":"2018-01-21T20:00:00+08:00","status":0,"value":[2,2,2,2,2,33,33,33,33,33,33,33,33,33,33,33,33,33,33,1,1,1,1]}
         * wind : {"status":0,"value":[{"datetime":"2018-01-21T20:00:00.000+08:00","direction":"138.22","speed":"8.47"},{"datetime":"2018-01-21T21:00:00.000+08:00","direction":"135.45","speed":"8.47"},{"datetime":"2018-01-21T22:00:00.000+08:00","direction":"130.48","speed":"8.16"},{"datetime":"2018-01-21T23:00:00.000+08:00","direction":"120.3","speed":"7.51"},{"datetime":"2018-01-22T00:00:00.000+08:00","direction":"101.66","speed":"6.93"},{"datetime":"2018-01-22T01:00:00.000+08:00","direction":"80.55","speed":"7.09"},{"datetime":"2018-01-22T02:00:00.000+08:00","direction":"66.64","speed":"7.55"},{"datetime":"2018-01-22T03:00:00.000+08:00","direction":"62.28","speed":"7.35"},{"datetime":"2018-01-22T04:00:00.000+08:00","direction":"64.95","speed":"6.51"},{"datetime":"2018-01-22T05:00:00.000+08:00","direction":"73.77","speed":"5.52"},{"datetime":"2018-01-22T06:00:00.000+08:00","direction":"87.24","speed":"4.94"},{"datetime":"2018-01-22T07:00:00.000+08:00","direction":"102.84","speed":"5.03"},{"datetime":"2018-01-22T08:00:00.000+08:00","direction":"116.02","speed":"5.89"},{"datetime":"2018-01-22T09:00:00.000+08:00","direction":"124.3","speed":"7.38"},{"datetime":"2018-01-22T10:00:00.000+08:00","direction":"128.83","speed":"8.86"},{"datetime":"2018-01-22T11:00:00.000+08:00","direction":"131.67","speed":"9.7"},{"datetime":"2018-01-22T12:00:00.000+08:00","direction":"134.31","speed":"9.4"},{"datetime":"2018-01-22T13:00:00.000+08:00","direction":"137.83","speed":"8.02"},{"datetime":"2018-01-22T14:00:00.000+08:00","direction":"144.44","speed":"5.78"},{"datetime":"2018-01-22T15:00:00.000+08:00","direction":"163.29","speed":"3.04"},{"datetime":"2018-01-22T16:00:00.000+08:00","direction":"250.2","speed":"1.61"},{"datetime":"2018-01-22T17:00:00.000+08:00","direction":"308.22","speed":"4.01"},{"datetime":"2018-01-22T18:00:00.000+08:00","direction":"329.25","speed":"7.1"},{"datetime":"2018-01-22T20:00:00.000+08:00","direction":"344.69","speed":"13.19"},{"datetime":"2018-01-22T21:00:00.000+08:00","direction":"343.87","speed":"15.12"},{"datetime":"2018-01-22T22:00:00.000+08:00","direction":"340.52","speed":"16.44"},{"datetime":"2018-01-22T23:00:00.000+08:00","direction":"336.69","speed":"17.63"},{"datetime":"2018-01-23T00:00:00.000+08:00","direction":"333.79","speed":"18.93"},{"datetime":"2018-01-23T01:00:00.000+08:00","direction":"331.86","speed":"20.02"},{"datetime":"2018-01-23T02:00:00.000+08:00","direction":"330.57","speed":"20.43"},{"datetime":"2018-01-23T03:00:00.000+08:00","direction":"329.65","speed":"19.87"},{"datetime":"2018-01-23T04:00:00.000+08:00","direction":"328.98","speed":"18.57"},{"datetime":"2018-01-23T05:00:00.000+08:00","direction":"328.6","speed":"16.93"},{"datetime":"2018-01-23T06:00:00.000+08:00","direction":"328.46","speed":"15.31"},{"datetime":"2018-01-23T07:00:00.000+08:00","direction":"327.7","speed":"14.12"},{"datetime":"2018-01-23T08:00:00.000+08:00","direction":"325.16","speed":"13.74"},{"datetime":"2018-01-23T09:00:00.000+08:00","direction":"320.57","speed":"14.46"},{"datetime":"2018-01-23T10:00:00.000+08:00","direction":"315.55","speed":"15.84"},{"datetime":"2018-01-23T11:00:00.000+08:00","direction":"311.14","speed":"17.17"},{"datetime":"2018-01-23T12:00:00.000+08:00","direction":"307.38","speed":"17.81"},{"datetime":"2018-01-23T13:00:00.000+08:00","direction":"304.08","speed":"17.61"},{"datetime":"2018-01-23T14:00:00.000+08:00","direction":"301.12","speed":"16.51"},{"datetime":"2018-01-23T15:00:00.000+08:00","direction":"298.41","speed":"14.57"},{"datetime":"2018-01-23T16:00:00.000+08:00","direction":"295.89","speed":"12.21"},{"datetime":"2018-01-23T17:00:00.000+08:00","direction":"293.93","speed":"9.97"},{"datetime":"2018-01-23T18:00:00.000+08:00","direction":"293.62","speed":"8.28"}]}
         */

        private AqiBeanX aqi;
        private String desc;
        private int status;
        private TemperatureBeanXX temperature;
        private WeatherBeanX weather;
        private WindBeanXX wind;

        public AqiBeanX getAqi() {
            return aqi;
        }

        public void setAqi(AqiBeanX aqi) {
            this.aqi = aqi;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public TemperatureBeanXX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBeanXX temperature) {
            this.temperature = temperature;
        }

        public WeatherBeanX getWeather() {
            return weather;
        }

        public void setWeather(WeatherBeanX weather) {
            this.weather = weather;
        }

        public WindBeanXX getWind() {
            return wind;
        }

        public void setWind(WindBeanXX wind) {
            this.wind = wind;
        }

        public static class AqiBeanX {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]}
             * pubTime : 2018-01-21T20:00:00+08:00
             * status : 0
             * value : [47,56,62,66,62,50,33,18,8,7,7,7,7,7,7,7,7,7,7,7,7,7,7]
             */

            private BrandInfoBeanX brandInfo;
            private String pubTime;
            private int status;
            private List<Integer> value;

            public BrandInfoBeanX getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoBeanX brandInfo) {
                this.brandInfo = brandInfo;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }

            public static class BrandInfoBeanX {
                private List<BrandsBeanX> brands;

                public List<BrandsBeanX> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsBeanX> brands) {
                    this.brands = brands;
                }

                public static class BrandsBeanX {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
                     * url :
                     */

                    private String brandId;
                    private String logo;
                    private NamesBeanX names;
                    private String url;

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesBeanX getNames() {
                        return names;
                    }

                    public void setNames(NamesBeanX names) {
                        this.names = names;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesBeanX {
                        /**
                         * en_US : 彩云天气
                         * zh_TW : 彩雲天氣
                         * zh_CN : 彩云天气
                         */

                        private String en_US;
                        private String zh_TW;
                        private String zh_CN;

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class TemperatureBeanXX {
            /**
             * pubTime : 2018-01-21T20:00:00+08:00
             * status : 0
             * unit : ℃
             * value : [-5,-4,-5,-5,-4,-3,-3,-3,-3,-4,-3,-3,-3,-3,-3,-3,-3,-3,-3,-3,-4,-4,-6]
             */

            private String pubTime;
            private int status;
            private String unit;
            private List<Integer> value;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }
        }

        public static class WeatherBeanX {
            /**
             * pubTime : 2018-01-21T20:00:00+08:00
             * status : 0
             * value : [2,2,2,2,2,33,33,33,33,33,33,33,33,33,33,33,33,33,33,1,1,1,1]
             */

            private String pubTime;
            private int status;
            private List<Integer> value;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }
        }

        public static class WindBeanXX {
            /**
             * status : 0
             * value : [{"datetime":"2018-01-21T20:00:00.000+08:00","direction":"138.22","speed":"8.47"},{"datetime":"2018-01-21T21:00:00.000+08:00","direction":"135.45","speed":"8.47"},{"datetime":"2018-01-21T22:00:00.000+08:00","direction":"130.48","speed":"8.16"},{"datetime":"2018-01-21T23:00:00.000+08:00","direction":"120.3","speed":"7.51"},{"datetime":"2018-01-22T00:00:00.000+08:00","direction":"101.66","speed":"6.93"},{"datetime":"2018-01-22T01:00:00.000+08:00","direction":"80.55","speed":"7.09"},{"datetime":"2018-01-22T02:00:00.000+08:00","direction":"66.64","speed":"7.55"},{"datetime":"2018-01-22T03:00:00.000+08:00","direction":"62.28","speed":"7.35"},{"datetime":"2018-01-22T04:00:00.000+08:00","direction":"64.95","speed":"6.51"},{"datetime":"2018-01-22T05:00:00.000+08:00","direction":"73.77","speed":"5.52"},{"datetime":"2018-01-22T06:00:00.000+08:00","direction":"87.24","speed":"4.94"},{"datetime":"2018-01-22T07:00:00.000+08:00","direction":"102.84","speed":"5.03"},{"datetime":"2018-01-22T08:00:00.000+08:00","direction":"116.02","speed":"5.89"},{"datetime":"2018-01-22T09:00:00.000+08:00","direction":"124.3","speed":"7.38"},{"datetime":"2018-01-22T10:00:00.000+08:00","direction":"128.83","speed":"8.86"},{"datetime":"2018-01-22T11:00:00.000+08:00","direction":"131.67","speed":"9.7"},{"datetime":"2018-01-22T12:00:00.000+08:00","direction":"134.31","speed":"9.4"},{"datetime":"2018-01-22T13:00:00.000+08:00","direction":"137.83","speed":"8.02"},{"datetime":"2018-01-22T14:00:00.000+08:00","direction":"144.44","speed":"5.78"},{"datetime":"2018-01-22T15:00:00.000+08:00","direction":"163.29","speed":"3.04"},{"datetime":"2018-01-22T16:00:00.000+08:00","direction":"250.2","speed":"1.61"},{"datetime":"2018-01-22T17:00:00.000+08:00","direction":"308.22","speed":"4.01"},{"datetime":"2018-01-22T18:00:00.000+08:00","direction":"329.25","speed":"7.1"},{"datetime":"2018-01-22T20:00:00.000+08:00","direction":"344.69","speed":"13.19"},{"datetime":"2018-01-22T21:00:00.000+08:00","direction":"343.87","speed":"15.12"},{"datetime":"2018-01-22T22:00:00.000+08:00","direction":"340.52","speed":"16.44"},{"datetime":"2018-01-22T23:00:00.000+08:00","direction":"336.69","speed":"17.63"},{"datetime":"2018-01-23T00:00:00.000+08:00","direction":"333.79","speed":"18.93"},{"datetime":"2018-01-23T01:00:00.000+08:00","direction":"331.86","speed":"20.02"},{"datetime":"2018-01-23T02:00:00.000+08:00","direction":"330.57","speed":"20.43"},{"datetime":"2018-01-23T03:00:00.000+08:00","direction":"329.65","speed":"19.87"},{"datetime":"2018-01-23T04:00:00.000+08:00","direction":"328.98","speed":"18.57"},{"datetime":"2018-01-23T05:00:00.000+08:00","direction":"328.6","speed":"16.93"},{"datetime":"2018-01-23T06:00:00.000+08:00","direction":"328.46","speed":"15.31"},{"datetime":"2018-01-23T07:00:00.000+08:00","direction":"327.7","speed":"14.12"},{"datetime":"2018-01-23T08:00:00.000+08:00","direction":"325.16","speed":"13.74"},{"datetime":"2018-01-23T09:00:00.000+08:00","direction":"320.57","speed":"14.46"},{"datetime":"2018-01-23T10:00:00.000+08:00","direction":"315.55","speed":"15.84"},{"datetime":"2018-01-23T11:00:00.000+08:00","direction":"311.14","speed":"17.17"},{"datetime":"2018-01-23T12:00:00.000+08:00","direction":"307.38","speed":"17.81"},{"datetime":"2018-01-23T13:00:00.000+08:00","direction":"304.08","speed":"17.61"},{"datetime":"2018-01-23T14:00:00.000+08:00","direction":"301.12","speed":"16.51"},{"datetime":"2018-01-23T15:00:00.000+08:00","direction":"298.41","speed":"14.57"},{"datetime":"2018-01-23T16:00:00.000+08:00","direction":"295.89","speed":"12.21"},{"datetime":"2018-01-23T17:00:00.000+08:00","direction":"293.93","speed":"9.97"},{"datetime":"2018-01-23T18:00:00.000+08:00","direction":"293.62","speed":"8.28"}]
             */

            private int status;
            private List<ValueBeanXXXXX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueBeanXXXXX> getValue() {
                return value;
            }

            public void setValue(List<ValueBeanXXXXX> value) {
                this.value = value;
            }

            public static class ValueBeanXXXXX {
                /**
                 * datetime : 2018-01-21T20:00:00.000+08:00
                 * direction : 138.22
                 * speed : 8.47
                 */

                private String datetime;
                private String direction;
                private String speed;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public String getDirection() {
                    return direction;
                }

                public void setDirection(String direction) {
                    this.direction = direction;
                }

                public String getSpeed() {
                    return speed;
                }

                public void setSpeed(String speed) {
                    this.speed = speed;
                }
            }
        }
    }

    public static class IndicesBeanX {
        /**
         * indices : [{"type":"uvIndex","value":"2"},{"type":"humidity","value":"46"},{"type":"feelsLike","value":"-4"},{"type":"pressure","value":"1023.0"},{"type":"carWash","value":"1"},{"type":"sports","value":"1"}]
         * pubTime :
         * status : 0
         */

        private String pubTime;
        private int status;
        private List<IndicesBean> indices;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<IndicesBean> getIndices() {
            return indices;
        }

        public void setIndices(List<IndicesBean> indices) {
            this.indices = indices;
        }

        public static class IndicesBean {
            /**
             * type : uvIndex
             * value : 2
             */

            private String type;
            private String value;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }

    public static class YesterdayBean {
        /**
         * aqi : 55
         * date : 2018-01-20T12:10:00+08:00
         * status : 0
         * sunRise : 2018-01-20T07:31:00+08:00
         * sunSet : 2018-01-20T17:19:00+08:00
         * tempMax : 3
         * tempMin : -6
         * weatherEnd : 1
         * weatherStart : 0
         * windDircEnd : 135
         * windDircStart : 135
         * windSpeedEnd : 15.5
         * windSpeedStart : 15.5
         */

        private String aqi;
        private String date;
        private int status;
        private String sunRise;
        private String sunSet;
        private String tempMax;
        private String tempMin;
        private String weatherEnd;
        private String weatherStart;
        private String windDircEnd;
        private String windDircStart;
        private String windSpeedEnd;
        private String windSpeedStart;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSunRise() {
            return sunRise;
        }

        public void setSunRise(String sunRise) {
            this.sunRise = sunRise;
        }

        public String getSunSet() {
            return sunSet;
        }

        public void setSunSet(String sunSet) {
            this.sunSet = sunSet;
        }

        public String getTempMax() {
            return tempMax;
        }

        public void setTempMax(String tempMax) {
            this.tempMax = tempMax;
        }

        public String getTempMin() {
            return tempMin;
        }

        public void setTempMin(String tempMin) {
            this.tempMin = tempMin;
        }

        public String getWeatherEnd() {
            return weatherEnd;
        }

        public void setWeatherEnd(String weatherEnd) {
            this.weatherEnd = weatherEnd;
        }

        public String getWeatherStart() {
            return weatherStart;
        }

        public void setWeatherStart(String weatherStart) {
            this.weatherStart = weatherStart;
        }

        public String getWindDircEnd() {
            return windDircEnd;
        }

        public void setWindDircEnd(String windDircEnd) {
            this.windDircEnd = windDircEnd;
        }

        public String getWindDircStart() {
            return windDircStart;
        }

        public void setWindDircStart(String windDircStart) {
            this.windDircStart = windDircStart;
        }

        public String getWindSpeedEnd() {
            return windSpeedEnd;
        }

        public void setWindSpeedEnd(String windSpeedEnd) {
            this.windSpeedEnd = windSpeedEnd;
        }

        public String getWindSpeedStart() {
            return windSpeedStart;
        }

        public void setWindSpeedStart(String windSpeedStart) {
            this.windSpeedStart = windSpeedStart;
        }
    }

    public static class UrlBean {
        /**
         * weathercn :
         * caiyun :
         */

        private String weathercn;
        private String caiyun;

        public String getWeathercn() {
            return weathercn;
        }

        public void setWeathercn(String weathercn) {
            this.weathercn = weathercn;
        }

        public String getCaiyun() {
            return caiyun;
        }

        public void setCaiyun(String caiyun) {
            this.caiyun = caiyun;
        }
    }

    public static class BrandInfoBeanXX {
        private List<BrandsBeanXX> brands;

        public List<BrandsBeanXX> getBrands() {
            return brands;
        }

        public void setBrands(List<BrandsBeanXX> brands) {
            this.brands = brands;
        }

        public static class BrandsBeanXX {
            /**
             * brandId : caiyun
             * logo : http://f5.market.mi-img.com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp
             * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
             * url :
             */

            private String brandId;
            private String logo;
            private NamesBeanXX names;
            private String url;

            public String getBrandId() {
                return brandId;
            }

            public void setBrandId(String brandId) {
                this.brandId = brandId;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public NamesBeanXX getNames() {
                return names;
            }

            public void setNames(NamesBeanXX names) {
                this.names = names;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public static class NamesBeanXX {
                /**
                 * en_US : 彩云天气
                 * zh_TW : 彩雲天氣
                 * zh_CN : 彩云天气
                 */

                private String en_US;
                private String zh_TW;
                private String zh_CN;

                public String getEn_US() {
                    return en_US;
                }

                public void setEn_US(String en_US) {
                    this.en_US = en_US;
                }

                public String getZh_TW() {
                    return zh_TW;
                }

                public void setZh_TW(String zh_TW) {
                    this.zh_TW = zh_TW;
                }

                public String getZh_CN() {
                    return zh_CN;
                }

                public void setZh_CN(String zh_CN) {
                    this.zh_CN = zh_CN;
                }
            }
        }
    }

    public static class AqiBeanXX {
        /**
         * pubTime : 2018-01-21T18:00:00+08:00
         * so2 : 16
         * pm10Desc : PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌
         * o3 : 20
         * status : 0
         * no2Desc : 二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到
         * suggest : 空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响
         * so2Desc : 二氧化硫影响呼吸系统和肺功能，并刺激眼睛。呼吸道的炎症导致咳嗽、粘液分泌、加重哮喘和慢性支气管炎
         * co : 1.10
         * o3Desc : 地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成
         * no2 : 46
         * primary :
         * aqi : 68
         * pm10 : 86
         * coDesc : 暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响
         * src : 中国环境监测总站
         * pm25 : 37
         * pm25Desc : PM2.5易携带重金属、微生物等有害物质，对人体健康影响较大
         * brandInfo : {"brands":[{"logo":"","names":{"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}
         */

        private String pubTime;
        private String so2;
        private String pm10Desc;
        private String o3;
        private int status;
        private String no2Desc;
        private String suggest;
        private String so2Desc;
        private String co;
        private String o3Desc;
        private String no2;
        private String primary;
        private String aqi;
        private String pm10;
        private String coDesc;
        private String src;
        private String pm25;
        private String pm25Desc;
        private BrandInfoBeanXXX brandInfo;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getPm10Desc() {
            return pm10Desc;
        }

        public void setPm10Desc(String pm10Desc) {
            this.pm10Desc = pm10Desc;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getNo2Desc() {
            return no2Desc;
        }

        public void setNo2Desc(String no2Desc) {
            this.no2Desc = no2Desc;
        }

        public String getSuggest() {
            return suggest;
        }

        public void setSuggest(String suggest) {
            this.suggest = suggest;
        }

        public String getSo2Desc() {
            return so2Desc;
        }

        public void setSo2Desc(String so2Desc) {
            this.so2Desc = so2Desc;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getO3Desc() {
            return o3Desc;
        }

        public void setO3Desc(String o3Desc) {
            this.o3Desc = o3Desc;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getPrimary() {
            return primary;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getCoDesc() {
            return coDesc;
        }

        public void setCoDesc(String coDesc) {
            this.coDesc = coDesc;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPm25Desc() {
            return pm25Desc;
        }

        public void setPm25Desc(String pm25Desc) {
            this.pm25Desc = pm25Desc;
        }

        public BrandInfoBeanXXX getBrandInfo() {
            return brandInfo;
        }

        public void setBrandInfo(BrandInfoBeanXXX brandInfo) {
            this.brandInfo = brandInfo;
        }

        public static class BrandInfoBeanXXX {
            private List<BrandsBeanXXX> brands;

            public List<BrandsBeanXXX> getBrands() {
                return brands;
            }

            public void setBrands(List<BrandsBeanXXX> brands) {
                this.brands = brands;
            }

            public static class BrandsBeanXXX {
                /**
                 * logo :
                 * names : {"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"}
                 * brandId : CNEMC
                 * url :
                 */

                private String logo;
                private NamesBeanXXX names;
                private String brandId;
                private String url;

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public NamesBeanXXX getNames() {
                    return names;
                }

                public void setNames(NamesBeanXXX names) {
                    this.names = names;
                }

                public String getBrandId() {
                    return brandId;
                }

                public void setBrandId(String brandId) {
                    this.brandId = brandId;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class NamesBeanXXX {
                    /**
                     * en_US : CNEMC
                     * zh_TW : 中國環境監測總站
                     * zh_CN : 中国环境监测总站
                     */

                    private String en_US;
                    private String zh_TW;
                    private String zh_CN;

                    public String getEn_US() {
                        return en_US;
                    }

                    public void setEn_US(String en_US) {
                        this.en_US = en_US;
                    }

                    public String getZh_TW() {
                        return zh_TW;
                    }

                    public void setZh_TW(String zh_TW) {
                        this.zh_TW = zh_TW;
                    }

                    public String getZh_CN() {
                        return zh_CN;
                    }

                    public void setZh_CN(String zh_CN) {
                        this.zh_CN = zh_CN;
                    }
                }
            }
        }
    }

    public static class AlertsBean {
        /**
         * alertId : weathercn:101010100-1516525200000-持续低温蓝色
         * detail : 北京市气象台2018年01月21日17时00分发布持续低温蓝色预警:受持续补充冷空气影响，预计22-24日，本市将出现持续低温天气，平原地区日最低气温将低于零下10℃，请注意防寒保暖。
         * images : {"icon":"http://f5.market.xiaomi.com/download/MiSafe/09de1422c803620b3aae7df48476f46152a431aaf/a.webp","notice":"http://f4.market.mi-img.com/download/MiSafe/003454ccf2ca533369dc2cb7f8a54d2032843aec2/a.webp"}
         * level : 蓝色
         * locationKey : weathercn:101010100
         * pubTime : 2018-01-21T17:00:00+08:00
         * title : 北京市持续低温蓝色预警
         * type : 持续低温
         */

        private String alertId;
        private String detail;
        private ImagesBean images;
        private String level;
        private String locationKey;
        private String pubTime;
        private String title;
        private String type;

        public String getAlertId() {
            return alertId;
        }

        public void setAlertId(String alertId) {
            this.alertId = alertId;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getLocationKey() {
            return locationKey;
        }

        public void setLocationKey(String locationKey) {
            this.locationKey = locationKey;
        }

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class ImagesBean {
            /**
             * icon : http://f5.market.xiaomi.com/download/MiSafe/09de1422c803620b3aae7df48476f46152a431aaf/a.webp
             * notice : http://f4.market.mi-img.com/download/MiSafe/003454ccf2ca533369dc2cb7f8a54d2032843aec2/a.webp
             */

            private String icon;
            private String notice;

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }

    public static class PreHourBean {
        /**
         * pubTime : 2018-01-21T19:00:00+08:00
         * wind : {"speed":{"unit":"km/h","value":"8.5"},"direction":{"unit":"°","value":"90"}}
         * humidity : {"unit":"%","value":"46"}
         * pressure : {"unit":"mb","value":"1028.3"}
         * visibility : {"unit":"km","value":""}
         * feelsLike : {"unit":"℃","value":"-4"}
         * aqi : {"pubTime":"2018-01-21T17:00:00+08:00","so2":"18","pm10Desc":"PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌","o3":"26","status":0,"no2Desc":"二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到","suggest":"空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响","so2Desc":"人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼","co":"1.10","o3Desc":"臭氧俗称晴空杀手，无色无味，但对人体的伤害不比PM2.5低，浓度高时建议减少夏季午后的外出活动，如果不开窗效果更佳","no2":"42","primary":"","aqi":"70","coDesc":"暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响","pm10":"88","pm25Desc":"PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康","pm25":"39","src":"中国环境监测总站","brandInfo":{"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}}
         * uvIndex : 2
         * weather : 2
         * temperature : {"unit":"℃","value":"-2"}
         */

        private String pubTime;
        private WindBeanXXX wind;
        private HumidityBeanX humidity;
        private PressureBeanX pressure;
        private VisibilityBeanX visibility;
        private FeelsLikeBeanX feelsLike;
        private AqiBeanXXX aqi;
        private String uvIndex;
        private String weather;
        private TemperatureBeanXXX temperature;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public WindBeanXXX getWind() {
            return wind;
        }

        public void setWind(WindBeanXXX wind) {
            this.wind = wind;
        }

        public HumidityBeanX getHumidity() {
            return humidity;
        }

        public void setHumidity(HumidityBeanX humidity) {
            this.humidity = humidity;
        }

        public PressureBeanX getPressure() {
            return pressure;
        }

        public void setPressure(PressureBeanX pressure) {
            this.pressure = pressure;
        }

        public VisibilityBeanX getVisibility() {
            return visibility;
        }

        public void setVisibility(VisibilityBeanX visibility) {
            this.visibility = visibility;
        }

        public FeelsLikeBeanX getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLikeBeanX feelsLike) {
            this.feelsLike = feelsLike;
        }

        public AqiBeanXXX getAqi() {
            return aqi;
        }

        public void setAqi(AqiBeanXXX aqi) {
            this.aqi = aqi;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public TemperatureBeanXXX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBeanXXX temperature) {
            this.temperature = temperature;
        }

        public static class WindBeanXXX {
            /**
             * speed : {"unit":"km/h","value":"8.5"}
             * direction : {"unit":"°","value":"90"}
             */

            private SpeedBeanXX speed;
            private DirectionBeanXX direction;

            public SpeedBeanXX getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedBeanXX speed) {
                this.speed = speed;
            }

            public DirectionBeanXX getDirection() {
                return direction;
            }

            public void setDirection(DirectionBeanXX direction) {
                this.direction = direction;
            }

            public static class SpeedBeanXX {
                /**
                 * unit : km/h
                 * value : 8.5
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class DirectionBeanXX {
                /**
                 * unit : °
                 * value : 90
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class HumidityBeanX {
            /**
             * unit : %
             * value : 46
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class PressureBeanX {
            /**
             * unit : mb
             * value : 1028.3
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class VisibilityBeanX {
            /**
             * unit : km
             * value :
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class FeelsLikeBeanX {
            /**
             * unit : ℃
             * value : -4
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class AqiBeanXXX {
            /**
             * pubTime : 2018-01-21T17:00:00+08:00
             * so2 : 18
             * pm10Desc : PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌
             * o3 : 26
             * status : 0
             * no2Desc : 二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到
             * suggest : 空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响
             * so2Desc : 人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼
             * co : 1.10
             * o3Desc : 臭氧俗称晴空杀手，无色无味，但对人体的伤害不比PM2.5低，浓度高时建议减少夏季午后的外出活动，如果不开窗效果更佳
             * no2 : 42
             * primary :
             * aqi : 70
             * coDesc : 暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响
             * pm10 : 88
             * pm25Desc : PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康
             * pm25 : 39
             * src : 中国环境监测总站
             * brandInfo : {"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}
             */

            private String pubTime;
            private String so2;
            private String pm10Desc;
            private String o3;
            private int status;
            private String no2Desc;
            private String suggest;
            private String so2Desc;
            private String co;
            private String o3Desc;
            private String no2;
            private String primary;
            private String aqi;
            private String coDesc;
            private String pm10;
            private String pm25Desc;
            private String pm25;
            private String src;
            private BrandInfoBeanXXXX brandInfo;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

            public String getPm10Desc() {
                return pm10Desc;
            }

            public void setPm10Desc(String pm10Desc) {
                this.pm10Desc = pm10Desc;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getNo2Desc() {
                return no2Desc;
            }

            public void setNo2Desc(String no2Desc) {
                this.no2Desc = no2Desc;
            }

            public String getSuggest() {
                return suggest;
            }

            public void setSuggest(String suggest) {
                this.suggest = suggest;
            }

            public String getSo2Desc() {
                return so2Desc;
            }

            public void setSo2Desc(String so2Desc) {
                this.so2Desc = so2Desc;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getO3Desc() {
                return o3Desc;
            }

            public void setO3Desc(String o3Desc) {
                this.o3Desc = o3Desc;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getPrimary() {
                return primary;
            }

            public void setPrimary(String primary) {
                this.primary = primary;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getCoDesc() {
                return coDesc;
            }

            public void setCoDesc(String coDesc) {
                this.coDesc = coDesc;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm25Desc() {
                return pm25Desc;
            }

            public void setPm25Desc(String pm25Desc) {
                this.pm25Desc = pm25Desc;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public BrandInfoBeanXXXX getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoBeanXXXX brandInfo) {
                this.brandInfo = brandInfo;
            }

            public static class BrandInfoBeanXXXX {
                private List<BrandsBeanXXXX> brands;

                public List<BrandsBeanXXXX> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsBeanXXXX> brands) {
                    this.brands = brands;
                }

                public static class BrandsBeanXXXX {
                    /**
                     * logo :
                     * names : {"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"}
                     * brandId : CNEMC
                     * url :
                     */

                    private String logo;
                    private NamesBeanXXXX names;
                    private String brandId;
                    private String url;

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesBeanXXXX getNames() {
                        return names;
                    }

                    public void setNames(NamesBeanXXXX names) {
                        this.names = names;
                    }

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesBeanXXXX {
                        /**
                         * zh_TW : 中國環境監測總站
                         * en_US : CNEMC
                         * zh_CN : 中国环境监测总站
                         */

                        private String zh_TW;
                        private String en_US;
                        private String zh_CN;

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class TemperatureBeanXXX {
            /**
             * unit : ℃
             * value : -2
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}
