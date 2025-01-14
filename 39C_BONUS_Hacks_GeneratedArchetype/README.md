# Rest with Spring Boot Udemy Archetype

## Step 1 - GIT Clone

```
git clone https://github.com/leandrocgsi/RestWithSpringBootUdemyArchetype.git
```
## Step 2 - Access folder and run command

```
mvn clean install
```

## Step 3 - Run Maven Archetype

```
mvn archetype:generate
    -DarchetypeGroupId=br.com.erudio
    -DarchetypeArtifactId=rest-with-springboot-udemy-archetype
    -DarchetypeVersion=0.0.1-SNAPSHOT (YOUR_VERSION)
    -DgroupId=br.com.semeru (YOUR_GROUP_ID)
    -DartifactId=rest-api-from-archetype (YOUR_ARTIFACT_ID)
```

# [REST API's RESTFul do 0 à AWS com Spring Boot 2.x e Docker](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/?couponCode=GTHB_FLASH_SALE2021)
### [Desenvolva uma API REST do zero absoluto atendendo todos os níveis de maturidade RESTful e implante na AWS + React JS](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/?couponCode=GTHB_FLASH_SALE2021)

[![Image](https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/rest_apis_restful_do_0_à_nuvem_com_spring_boot_2_e_docker.png?raw=true "REST API's RESTFul do 0 à AWS Com Spring Boot 2.x e Docker")](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/?couponCode=GTHB_FLASH_SALE2021)

Este é o repositório dos codigos fonte desenvolvidos no curso [REST API's RESTFul do 0 à AWS com Spring Boot 2.x e Docker](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/?couponCode=GTHB_FLASH_SALE2021)

# Cursos Relacionados

[![Image](https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/docker_do_zero_a_maestria_conteinerizacao_desmistificada.png?raw=true "Docker do Zero à Maestria - Contêinerização Desmistificada")](https://www.udemy.com/course/docker-do-zero-a-maestria-conteinerizacao-desmistificada/?couponCode=GTHB_FLASH_SALE2021)

[![Image](https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/microservices.png?raw=true "Microservices do 0 à GCP com Spring Boot, Kubernetes e Docker")](https://www.udemy.com/course/microservices-do-0-a-gcp-com-spring-boot-kubernetes-e-docker/?couponCode=GTHB_FLASH_SALE2021)

[![Image](https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/rest_apis_restful_do_0_a_nuvem_com_asp_net_core_e_docker.png?raw=true "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker")](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-aspnet-core-e-docker/?couponCode=GTHB_FLASH_SALE2021)

[![Image](https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/docker_para_amazon_aws_implante_apps_java_e_dot_net_com_travis_ci.png?raw=true "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI")](https://www.udemy.com/course/docker-para-amazon-aws-implante-aplicacoes-java-e-net/?couponCode=GTHB_FLASH_SALE2021)

## In English

[![Image](https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/rest_apis_restful_from_0_to_aws_with_spring_boot_and_docker.png?raw=true "REST API's RESTFul from 0 to AWS with Spring Boot and Docker")](https://www.udemy.com/course/rest-apis-restful-from-0-to-aws-with-spring-boot-and-docker/?couponCode=GTHB_FLASH_SALE2021)

[![Image](https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/docker_to_amazon_aws_deploy_apps_java_and_dot_net_with_travis_ci.png?raw=true "Docker to Amazon AWS Deploy Java & .NET Apps with Travis CI")](https://www.udemy.com/course/docker-to-amazon-aws-deploy-java-net-apps-with-travis-ci/?couponCode=GTHB_FLASH_SALE2021)

# Sobre REST

* [Web Services](http://www.semeru.com.br/blog/web-services/)
* [RESTful Web Services](http://www.semeru.com.br/blog/restful-web-services/)
* [HTTP Status Codes](http://www.semeru.com.br/blog/http-status-codes-em-servicos-rest/)
* [Do zero ao REST em 5 minutos com SpringBoot](http://www.semeru.com.br/blog/do-zero-ao-rest-em-5-minutos-com-springboot/)
* [Criando o primeiro endpoint REST com SpringBoot](http://www.semeru.com.br/blog/criando-o-primeiro-endpoint-rest-com-springboot/)
* [Documentando aplicações REST com SpringBoot e Swagger](http://www.semeru.com.br/blog/documentando-aplicacoes-restfull-com-springboot-e-swagger/)
* [Entendendo HATEOAS](http://www.semeru.com.br/blog/entendendo_hateoas/)
* [Aplicações RESTful HATEOAS com SpringBoot](http://www.semeru.com.br/blog/aplicacoes-restfull-hateoas-com-springboot/)


# HTTP Status Codes adotados pelas API's mais famosas do mundo

Essa lista se baseia [nesse repositório aqui!](https://gist.github.com/vkostyukov/32c84c0c01789425c29a#file-statuses-md)

|API                   | Status Codes                                                                             |
|----------------------|------------------------------------------------------------------------------------------|
|[Twitter][tw]         | 200, 304, 400, 401, 403, 404, 406, 410, 420, 422, 429, 500, 502, 503, 504                |
|[Stripe][stripe]      | 200, 400, 401, 402, 404, 429, 500, 502, 503, 504                                         |
|[Github][gh]          | 200, 400, 422, 301, 302, 304, 307, 401, 403                                              |
|[Pagerduty][pd]       | 200, 201, 204, 400, 401, 403, 404, 408, 500                                              |
|[NewRelic Plugins][nr]| 200, 400, 403, 404, 405, 413, 500, 502, 503, 503                                         |
|[Etsy][etsy]          | 200, 201, 400, 403, 404, 500, 503                                                        |
|[Dropbox][db]         | 200, 400, 401, 403, 404, 405, 429, 503, 507                                              |
|[Spotify][spf]        | 200, 201, 204, 304, 400, 401, 403, 404, 429, 500, 502, 503                               |
|[Google Cloud][gc]    | 200, 301, 304, 307, 308, 400, 401, 403, 404, 405, 409, 411, 412, 416, 429, 500, 501, 503 |
|[HipChat][hc]         | 200, 201, 202, 400, 401, 403, 404, 405, 429, 500, 503                                    |
|[Telegram][tg]        | 200, 303, 400, 401, 403, 404, 420, 500                                                   |
|[Pocket][pk]          | 200, 400, 401, 403, 503                                                                  |
|[Uber][ub]            | 200, 201, 400, 401, 403, 404, 406, 409, 422, 429, 500                                    |


Status codes **usados pela maioria deles**: 200, 201, 202, 204, 301, 302, 303, 304, 307, 308, 400, 401, 402, 403, 404, 405, 406, 408, 409, 410, 411, 412, 413, 416, 420, 422, 429, 500, 501, 502, 503, 504, 507

Usado por pelo menos **dois deles**: 200, 201, 204, 301, 304, 307, 400, 401, 403, 404, 405, 406, 409, 420, 422, 429, 500, 502, 503, 504

Usado por pelo menos **três deles**: 200, 201, 304, 400, 401, 403, 404, 405, 422, 429, 500, 502, 503

Usado por pelo menos **quatro deles**: 200, 201, 304, 400, 401, 403, 404, 405, 429, 500, 502, 503

Usado por pelo menos **cinco deles**: 200, 201, 400, 401, 403, 404, 405, 429, 500, 503

Usado por **todos eles**: 200, 400

[tw]: https://dev.twitter.com/overview/api/response-codes
[stripe]: https://stripe.com/docs/api#errors
[gh]: https://developer.github.com/v3/#client-errors
[pd]: https://developer.pagerduty.com/documentation/rest/errors
[nr]: https://docs.newrelic.com/docs/plugins/plugin-developer-resources/developer-reference/plugin-api-responses-error-codes
[etsy]: https://www.etsy.com/developers/documentation/getting_started/api_basics#section_standard_response_codes
[db]: https://www.dropbox.com/developers-v1/core/docs
[spf]: https://developer.spotify.com/web-api/user-guide/
[gc]: https://cloud.google.com/storage/docs/json_api/v1/status-codes#http-status-and-error-codes
[hc]: https://www.hipchat.com/docs/apiv2/response_codes
[tg]: https://core.telegram.org/api/errors
[pk]: https://getpocket.com/developer/docs/errors
[ub]: https://developer.uber.com/v1/api-reference/

[<img src="https://github.com/leandrocgsi/RestWithSpringBootUdemy/blob/master/Images/udemy.png?raw=true">](https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/?couponCode=GTHB_FLASH_SALE2021)

