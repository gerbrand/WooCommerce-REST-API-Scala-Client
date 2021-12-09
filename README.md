# OpenAPI specification for Woocommerce API

An [OpenAPI specification for Woocommerce API](https://github.com/gerbrand/WooCommerce-OpenAPI-Client/blob/main/src/main/resources/woocommerce-openapi-3.0.x.yml), which should allow you to generate clients in almost any programming language.

The OpenAPI specification is based on the OpenAPI-specification generated using the Wordpress plugin [document-generator-for-openapi](https://wordpress.org/plugins/document-generator-for-openapi) with some modifications. For more details and background see this [blog-posting](https://www.software-creation.nl/2021/11/using-the-woocommerce-api/).

You should be to use OpenAPI document to generate a client for your favorite programming language, assuming there's a [generator available](https://openapi-generator.tech/). Also you can load the document in a OpenAPI editor, for example the online [swagger-editor](https://editor.swagger.io/).

## Build clients via sbt
You can use any tool or library to generate use use the openapi-specification, for convenience I've added an example sbt project that should allow you to generate any client as sbt.

For example the command below will (re)generate the scala-akka code
```shell
sbt generateClient scala-akka
```

I've added the generated source-code for a Scala Akka client


