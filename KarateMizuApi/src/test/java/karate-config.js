function fn() {
    var env = karate.env;
    var config = {
            baseUrl: 'https://bootcampapi.techcs.io/api/fe/v1/authorization'
            //status code ları buraya al
        };

    karate.log('karate.env system property was:', env);

    if (!env) {
        env = 'dev';
    } else if (env == 'stage' || env == 'e2e') {
        config.someUrlBase = '';
    }

    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);

    return config;
}